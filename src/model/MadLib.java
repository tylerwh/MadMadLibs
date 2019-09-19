package model;

public class MadLib {
	
	// For temporary object that will
	// be used for the buildMadLibServlet
	// and construct the final MadLib object
	private String tempFirstName;
	private String tempLastName;
	
	private String firstName;
	private String lastName;
	private String characterName;
	private String bodyPart;
	private String liquid;
	private String substance;
	
	//MadLib tempUserMadLib = new MadLib();
	
	public MadLib() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor to create author
	public MadLib(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
//		tempUserMadLib.setTempFirstName(this.firstName);
//		tempUserMadLib.setTempLastName(this.lastName);
	}
	
	// Constructor for temporary	
	/**
	 * @return the tempFirstName
	 */
	public String getTempFirstName() {
		return tempFirstName;
	}

	/**
	 * @param tempFirstName the tempFirstName to set
	 */
	public void setTempFirstName(String tempFirstName) {
		this.tempFirstName = tempFirstName;
	}

	/**
	 * @return the tempLastName
	 */
	public String getTempLastName() {
		return tempLastName;
	}

	/**
	 * @param tempLastName the tempLastName to set
	 */
	public void setTempLastName(String tempLastName) {
		this.tempLastName = tempLastName;
	}

	/**
	 * @param tempUserMadLib the tempUserMadLib to set
	 */
//	public void setTempUserMadLib(MadLib tempUserMadLib) {
//		this.tempUserMadLib = tempUserMadLib;
//	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName.substring(0, 1).toUpperCase() + characterName.substring(1).toLowerCase();
	}

	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * @return the bodyPart
	 */
	public String getBodyPart() {
		return bodyPart;
	}

	/**
	 * @param bodyPart the bodyPart to set
	 */
	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}

	/**
	 * @return the liquid
	 */
	public String getLiquid() {
		return liquid;
	}

	/**
	 * @param liquid the liquid to set
	 */
	public void setLiquid(String liquid) {
		this.liquid = liquid;
	}

	/**
	 * @return the substance
	 */
	public String getSubstance() {
		return substance;
	}

	/**
	 * @param substance the substance to set
	 */
	public void setSubstance(String substance) {
		this.substance = substance;
	}

	@Override
	public String toString() {
		return "MadLib [firstName=" + firstName + ", lastName=" + lastName + ", characterName=" + characterName
				+ ", bodyPart=" + bodyPart + ", liquid=" + liquid + ", substance=" + substance + "]";
	}
	
	
	

}
