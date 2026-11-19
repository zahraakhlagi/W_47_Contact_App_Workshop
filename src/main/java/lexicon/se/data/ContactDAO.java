package lexicon.se.data;

import lexicon.se.temporary.Contact;

import java.util.List;

public interface ContactDAO {
     List<Contact> findAll();
     void save(Contact contact);
     Contact findByName(String name);

}
