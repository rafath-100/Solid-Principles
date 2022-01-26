package NoSolid;

public class RulesAndRegulations
{
    Resident resident;
    RulesAndRegulations(Resident resident)
    {
        this.resident=resident;
    }
    public void announcement() {
        System.out.println("Hey, everyone living in the apartment should maintain discipline");
        resident.info();

    }
}