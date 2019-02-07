public class ZooTest
{
	public void fullZooConstructorTest() throws AssertException 
	{
		Animal aniOne = new Animal("Purple", "Bill", 50.0, 2.0);
		Animal aniTwo = new Animal("Blue", "Joe", 20.0, 25.0);
		
		int capacity = 2;
		Zoo zooTest = new Zoo(capacity);
		
		// Test capacity
		Assert.assertEquals(capacity, zooTest.getCapacity());
		
		zooTest.addAnimal(aniOne);
		zooTest.addAnimal(aniTwo);
		
		Animal[] twoAni = new Animal[2];
		twoAni[0] = aniOne;
		twoAni[1] = aniTwo;
		
		// Test that the array is correct
		Assert.assertEquals(twoAni[capacity - 1], zooTest.getAnimals()[capacity - 1]);
	}
	
	public void expandZooTest() 
	{
		Animal aniOne = new Animal("Purple", "Bill", 50.0, 2.0);
		Animal aniTwo = new Animal("Blue", "Joe", 20.0, 25.0);
		
		int capacity = 2;
		Zoo zooTest = new Zoo(capacity);
		
		zooTest.addAnimal(aniOne);
		zooTest.addAnimal(aniTwo);
	}
	
	public void getAverageWeightTest() throws AssertException 
	{
		Animal aniOne = new Animal("Purple", "Bill", 50.0, 2.0);
		Animal aniTwo = new Animal("Blue", "Joe", 20.0, 25.0);
		
		int capacity = 2;
		Zoo zooTest = new Zoo(capacity);
		
		zooTest.addAnimal(aniOne);
		zooTest.addAnimal(aniTwo);
		
		int avgWeight = (int) ((aniOne.getWeight() + aniTwo.getWeight()) / 2);
		
		Assert.assertEquals(avgWeight, zooTest.getAverageWeight());
	}
	
	public void getAverageWeightByColorTest() throws AssertException 
	{
		Animal aniOne = new Animal("Purple", "Bill", 50.0, 2.0);
		Animal aniTwo = new Animal("Blue", "Joe", 20.0, 25.0);
		
		int capacity = 2;
		Zoo zooTest = new Zoo(capacity);
		
		zooTest.addAnimal(aniOne);
		zooTest.addAnimal(aniTwo);
		
		int avgWeight = (int) (aniOne.getWeight());
		
		Assert.assertEquals(avgWeight, zooTest.getAverageWeight("Purple"));
	}
	
	public void getAnimalsTest() throws AssertException 
	{
		Animal aniOne = new Animal("Purple", "Bill", 50.0, 2.0);
		Animal aniTwo = new Animal("Blue", "Joe", 20.0, 25.0);
		
		int capacity = 2;
		Zoo zooTest = new Zoo(capacity);

		zooTest.addAnimal(aniOne);
		zooTest.addAnimal(aniTwo);
		
		Animal[] twoAni = new Animal[2];
		twoAni[0] = aniOne;
		twoAni[1] = aniTwo;
		
		// Test that the array is correct
		Assert.assertEquals(twoAni[capacity - 1], zooTest.getAnimals()[capacity - 1]);
	}
	
	public void getCapacityTest() throws AssertException 
	{
		Animal aniOne = new Animal("Purple", "Bill", 50.0, 2.0);
		Animal aniTwo = new Animal("Blue", "Joe", 20.0, 25.0);
		
		int capacity = 2;
		Zoo zooTest = new Zoo(capacity);

		zooTest.addAnimal(aniOne);
		zooTest.addAnimal(aniTwo);
		
		Assert.assertEquals(capacity, zooTest.getCapacity());
	}
	
	public void toStringTest() throws AssertException 
	{
		Animal aniOne = new Animal("Purple", "Bill", 50.0, 2.0);
		Animal aniTwo = new Animal("Blue", "Joe", 20.0, 25.0);
		
		int capacity = 2;
		Zoo zooTest = new Zoo(capacity);

		zooTest.addAnimal(aniOne);
		zooTest.addAnimal(aniTwo);
		
		String result = "These animals live in the zoo: \n"
				+ "Bill, a Purple-colored animal. 50.0 pounds, 2.0 inches\n"
				+ "Joe, a Blue-colored animal. 20.0 pounds, 25.0 inches\n";
		
		Assert.assertEquals(zooTest.toString(), result);
	}
	
}