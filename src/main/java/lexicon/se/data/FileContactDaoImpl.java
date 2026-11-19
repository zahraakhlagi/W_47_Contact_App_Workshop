package lexicon.se.data;


import lexicon.se.exception.DuplicateContactException;
import lexicon.se.model.Contact;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//TODO add implement interface
public class FileContactDaoImpl implements ContactDAO {

    private Path filePath;
    //TODO implement using files instead. Remove this temporary storage?
    private List<Contact> contactList = new ArrayList<>();

    public List<Contact> findAll()
    {
        return contactList;
    }

    public void save(Contact contact) throws DuplicateContactException {
        if(contact == null)
        {
            throw new IllegalArgumentException("Cannot add a null contact");
        }

        boolean duplicate = contactList.stream().anyMatch(c -> c.getName().equals(contact.getName()));
        if(duplicate)
        {
            throw new DuplicateContactException("Cannot add duplicate contacts");
        }
        contactList.add(contact);
    }

    public Contact findByName(String name)
    {
        Optional<Contact> result = findAll().stream()
                .filter(c -> c.getName()
                        .equals(name)).findFirst();
        if(result.isEmpty())
        {
            //TODO handle? Throw an exception probably
            return null;
        }
        return result.get();
    }





}
