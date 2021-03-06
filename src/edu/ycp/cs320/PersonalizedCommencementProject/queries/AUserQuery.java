package edu.ycp.cs320.PersonalizedCommencementProject.queries;

import java.util.List;
import java.util.Scanner;

import edu.ycp.cs320.PersonalizedCommencementProject.databaseModel.User;
import edu.ycp.cs320.PersonalizedCommencementProject.persist.DatabaseProvider;
import edu.ycp.cs320.PersonalizedCommencementProject.persist.IDatabase;
import edu.ycp.cs320.PersonalizedCommencementProject.persist.InitDatabase;

public class AUserQuery {
	// find user by this username
	private final static String userToFind = "acastro";
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);

		// Create the default IDatabase instance
		InitDatabase.init(keyboard);
		
		// get the DB instance and execute transaction
		IDatabase db = DatabaseProvider.getInstance();
		List<User> userList = db.findUserByUsername(userToFind);
		
		// check if anything was returned and output the list
		if (userList.isEmpty()) {
			System.out.println("There are no users in the database");
		}
		else {
			for (User user : userList) {
				System.out.println("name: " + user.getName());
				System.out.println("password: " + user.getPassword());
				System.out.println("type: " + user.getType());
				System.out.println("image: " + user.getImage());
			}
		}
	}
}
