package lexicon.se.data;


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

    public void save(Contact contact)
    {
        contactList.add(contact);
        boolean duplicate = contactList.stream().anyMatch(c -> c.getName().equals(contact.getName()));
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
