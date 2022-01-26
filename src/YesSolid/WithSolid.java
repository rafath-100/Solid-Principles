package  YesSolid;
public class WithSolid {
    public static void main(String args[])
    {
        Watchman man=new Watchman();
        man.watchman();

        BlockB ccTv=new BlockB();
        ccTv.controlRoom();

        HilltonApartments room=new NewsPaper();
        room.aResidentOfHilltonApartment();

        Terrace isTerraceThereInThisBlock=new Terrace();
        isTerraceThereInThisBlock.blockA();

        Resident resident=new Owner();
        RulesAndRegulations rules = new RulesAndRegulations(resident);
        rules.announcement();
    }
}
