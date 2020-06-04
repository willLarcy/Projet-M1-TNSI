
package org.projet.api.bdd;

import java.util.HashMap;
import java.util.Map;

import org.projet.api.User;

public class BDD {

	private Map<Integer, User> bdd;

	private BDD() {
		bdd = new HashMap<Integer, User>();
		bdd.put(1, new User("Stephane", "COCQUEBERT", 458));

	}

	private static BDD INSTANCE = new BDD();

	public static BDD getInstance() {
		return INSTANCE;
	}

	public Map<Integer, User> getMapUser() {
		return bdd;
	}

}
