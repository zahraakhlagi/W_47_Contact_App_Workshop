package lexicon.se.data;


import lexicon.se.exception.DuplicateContactException;
import lexicon.se.model.Contact;

import lexicon.se.model.Contact;

import java.util.List;

public interface ContactDAO {
     List<Contact> findAll();
     void save(Contact contact) throws DuplicateContactException;
     Contact findByName(String name);

}
