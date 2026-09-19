package OOP_part01;

public class Phone {
	private String name;
	String deviceBody;
	float screenSize;
	int memoryRAM;;
	int memoryROM;
	int camera;
	
	// Method -
	/*	First benefit of using method is that, we can reuse it.
	 * 	Second benefit is to organise our code 
	 * 	Third benefit is that, we can encapsulate things 
	 * 		(Example: using Private method will encapsulate the method to the present class only)
	 * 
	 * AccessModifier (private, public, protected)
	 */
	
	/* Getter and Setter
	 * 	encapsulation; Example: if I don't want to give others the permission to change the value of our fields, we can delete the setters.
	 * 							In that case, I give them the permission to get the value of the object but not set the value of objects.
	 * 	other operational reason; Example: if I am setting a name for my Phone, I my want to validate that name before setting it.
	 * 									   In that case, I can have some validation before assigning the value to my property.
	 */

	public void playMusic ( String trackName ) {
		System.out.println("Playing " + trackName);
	}
	
	// SET invention - it bypasses the private access modifier indirectly
	public void setName (String name) {
		
		// Keyword: 'this' is referring to current object (Phone) we are in.
		this.name = name;
	}
	
	// WhatIf, we want to get the "private String name" value? - use GET invention
	public String getName() {
		return this.name;
	}
}

