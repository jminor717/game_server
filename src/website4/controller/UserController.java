package website4.controller;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import website4.model.usser;

public class UserController {
	
	private Connection conn;
	private ArrayList<usser> user =new ArrayList<usser>();
	
	public UserController() {
		usser user1;
		user1=new usser("placeholder","skanfurnsgiemdtenale023n!",129814,"none",0);
		user.add(user1);
		user1=new usser("jake","123",111,"notMyEmail@hotmail.gov",9999999);
		user.add(user1);
		user1=new usser("jake1","1234",222,"none",0);
		user.add(user1);
		user1=new usser("jake2","12345",333,"none",0);
		user.add(user1);
		user1=new usser("jake3","123456",444,"none",0);
		user.add(user1);
		user1=new usser("jason","1111",99999,"jasonp@json.net",-554);
		user.add(user1);
		
	}
	
	
	
	/**
	 * this mithod will take in a user name and password and search the data base(for now an array)
	 * and return the the user id  ascocated with that user if the user exists, if no user with that name or 
	 * password is found it will throw no such element excetion.
	 * 
	 * the user id will later be used by other methods to search the data base to find relavent information
	 * 
	 * 
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public usser loguserin(String username,String password) {
		usser retur = null;
		//retur.setusername(null);
		//retur.setpassword(null);
		
		for(int i=0;i<user.size();i++) {
			if(user.get(i).getusername().equals(username)&&user.get(i).getpassword().equals(password)) {
				retur=user.get(i);
				break;			}
		}
		
			return retur;
		
		
	}
	/**
	 * intended to be used for sesion verivication
	 * 
	 * 
	 * 
	 * @param id
	 * @return
	 */
	public usser getuserbyid(int id) {
		for (int i=0;i<user.size()-1;i++) {
			if(user.get(i).getuserid()==id)
				return user.get(i);
			
		}
		
		
		
		
		return null;
	}
	
	
	public void createUser(String userName, String password, String email) throws SQLException {
		if (userName != null && password != null && email != null) {
			boolean validInfo = isValid(userName, password, email);
			//PreparedStatement insertNewID = null;

			if (validInfo == true) {
				// Add information to database
				
				//After information is tested to be valid, add a new user to the array list
				user.add(new usser(userName, password, email));
				
			
				
				//Finish this implementation after we have a database	
				
				//Inserts new Username and Password into database with a new ID

//				String newID = "insert into userInfo(userName, password) values (?, ?)";
//				insertNewID = conn.prepareStatement(newID);
//				insertNewID.setString(1, userName);
//				insertNewID.setString(2, password);
//				insertNewID.execute();

				// user.setusername(userName);
				// user.setpassword(password);
				// user.setemail(email);
				// user.setcoins(1000);

			}
			
			else {
				//send error to user that account already exists with user or email
				
			}
			
		}
		else {
			//send error to user that information entered was not valid
		}
	}

	
	public void modifyUser() {
		
	}
	
	
	//testingtesting
	
	// Checks that the user name and email do not already exist
		public boolean isValid(String userName, String password, String email) throws SQLException {
			
			if(userName != null && password != null && email != null) {
				return true;
			}
			else {
				return false;
			}
			
			
			
			
			
//			conn = null;
//			PreparedStatement stmt = null;
//			ResultSet resultSet = null;
				
/**			
			try {

				stmt = conn.prepareStatement("select username, email from userInfo where userName = ? and email = ?");
				stmt.setString(1, userName);
				stmt.setString(2, email);
				//////////////////////////////////////////////////////
				resultSet = stmt.executeQuery();
				ResultSetMetaData resultSchema = stmt.getMetaData();
				int rowsReturned = 0;

				while (resultSet.next()) {
						// startBlock: this block will probably be removed later
					for (int i = 1; i <= resultSchema.getColumnCount(); i++) {
						Object obj = resultSet.getObject(i);
						if (i > 1) {
							System.out.print(",");
						}
						System.out.print(obj.toString());
						// endBlock
					}
					// System.out.println();
					// count # of rows returned
					rowsReturned++;
				}
				// indicate if the query returned nothing
				if (rowsReturned == 0) {
					return true;
				}
			} // end of try block
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return false;
		}
	
	
		public String logUserIn(String username,String password) {
			String retur = null;
			for(int i=0;i<user.size()-1;i++) {
				if(user.get(i).getusername()==username||user.get(i).getpassword()==password) {
					retur=user.get(i).getusername();
					break;
				}
			}
			if(retur!=null)
				return retur;
			else 
				throw new NoSuchElementException();
		}
**/
}








}






















