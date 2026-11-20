package lexicon.se.data;


import lexicon.se.exception.ContactStorageException;
import lexicon.se.exception.DuplicateContactException;
import lexicon.se.model.Contact;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileContactDaoImpl implements ContactDAO {

    private final Path filePath;
    private final List<Contact> contactList;

    public FileContactDaoImpl(String path) throws ContactStorageException {

        filePath = Path.of(path);
        contactList = loadFromFile();
    }

    public List<Contact> findAll()
    {
        return contactList;
    }

    private List<Contact> loadFromFile() throws ContactStorageException {
        try{
            List<String> lines = Files.readAllLines(filePath);
            List<Contact> contacts = new ArrayList<>();
            for(int i = 0; i + 1 < lines.size(); i += 2)
            {
                Contact readContact = new Contact(lines.get(i), lines.get(i+1));
                contacts.add(readContact);
            }
            return contacts;
        }
        catch(IOException e)
        {
            throw new ContactStorageException("Failed to load contacts due to failing to open file");
        }
        catch(IllegalArgumentException e)
        {
            throw new ContactStorageException("Failed to load contacts due to incorrect file format");

        }

    }

    public void save(Contact contact) throws DuplicateContactException, ContactStorageException {
        if(contact == null)
        {
            throw new IllegalArgumentException("Cannot add a null contact");
        }

        boolean duplicate = contactList.stream().anyMatch(c -> c.getName().equals(contact.getName()));
        if(duplicate)
        {
            throw new DuplicateContactException("Cannot add duplicate contacts");
        }
        try(BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE, StandardOpenOption.APPEND))
        {
            writer.append(contact.getName());
            writer.append("\n");
            writer.append(contact.getPhoneNumber());
            writer.append("\n");
        }catch (IOException e) {
            throw new ContactStorageException("Failed to save contact");
        }


        contactList.add(contact);
    }

    public Contact findByName(String name)
    {
        Optional<Contact> result = findAll().stream()
                .filter(c -> c.getName()
                        .equals(name)).findFirst();
        return result.orElse(null);
    }





}
