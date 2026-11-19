package lexicon.se.dao;

import java.util.List;

public interface ContactDAO {
     List<Contact> findAll();
     void save(Contact contact);
     Contact findByName(String name);

}
