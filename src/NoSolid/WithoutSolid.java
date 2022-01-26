package NoSolid;

public class WithoutSolid
{
    public static void main(String args[]){
        HilltonApartments ccTv=new HilltonApartments();
        ccTv.controlRoom();

        HilltonApartments aResidentOfHilltonApartments=new HilltonApartments();
        aResidentOfHilltonApartments.aResidentOfHilltonApartments();

        BBlock bblock=new BBlock();
        bblock.controlRoom();

        Terrace isTerraceThereInThisBlock=new Terrace();
        isTerraceThereInThisBlock.blockA();

        RulesAndRegulations rules=new RulesAndRegulations(new Resident());
        rules.announcement();
    }
}
