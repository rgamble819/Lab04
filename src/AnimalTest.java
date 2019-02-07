/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    public void fullConstructorTest() throws AssertException 
    {
    	String color = "Purple";
    	String name = "Bill";
    	double weight = 50.0;
    	double height = 2.0;
    	Animal animal = new Animal("Purple", "Bill", 50.0, 2.0);
    	
    	Assert.assertEquals(name, animal.getName());
    	Assert.assertEquals(color, animal.getColor());
    	Assert.assertEquals(weight, animal.getWeight());
    	Assert.assertEquals(height, animal.getWeight());
    }
    // TODO: test full constructor, getters, and toString

}

