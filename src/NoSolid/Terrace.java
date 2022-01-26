package NoSolid;

class Terrace implements ApartmentBlocks
 {
     public void blockA(){
         System.out.println("block a has a terrace");
     }
     public void blockB(){
         //block b does not have a terrace
     }
     public void blockC(){
         System.out.println("block c has a terrace");
     }
 }
