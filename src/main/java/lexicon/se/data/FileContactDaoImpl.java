package lexicon.se.data;

import lexicon.se.temporary.Contact;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//TODO add implement interface
public class FileContactDaoImpl {

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
    }

    public Contact findByName(String name)
    {
        return null;
    }

}
