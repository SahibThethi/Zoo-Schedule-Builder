package edu.ucalgary.oop;
/**
* This abstract class extends the Animal class and represents all the animals in the database     * that are active during the day.
* It contains a constructor that initializes the properties of the animal, such as name, ID, species, * feeding duration, and preparation time.
* @author Brian Chu
* @since April 2023
*/
abstract class Diurnal extends Animal{
	/**
	* Constructs a Diurnal animal object with a specific name, unique animalID, specific        *species, specific feedingDuration and specific prep time; the object is inherited from the *Bevear class.
	* @param name,  The name of the animal
	* @param animalID,  The Id of the animal to track them
	* @param species,  The specific species of the animal
	* @param feedingDuration, The time it takes to feed the animal
	* @param prepTime, The time it takes to prep the meal for the animal
	*/
	public Diurnal(String name, int animalID, String species, 
			int feedingDuration, int prepTime) {
		super(name, animalID, species, "Diurnal", 
				feedingDuration, prepTime, 8, 3);
	}
}
