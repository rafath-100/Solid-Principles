
package NoSolid;

public class BBlock extends HilltonApartments
{
    //violates Liskov principle
    //As B-Block does not have parking space and control room.
    public void pentHouse()
    {
        System.out.println("B-Block has a Pent House");
    }

    public void parking()
    {
        System.out.println("B-Block does not have parking space");
    }
    //controlRoom implementation

    //this is a new method which doesn't have same functionalities of the parent class.
}