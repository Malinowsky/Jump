package HMS;

public class HealthInsurancePlan {

    // Code for 'coverage' field goes here
    private InsuranceBrand offeredBy;
    private double coverage;

    public InsuranceBrand getOfferedBy()
    {
        return offeredBy;
    }
    public void setOfferedBy()
    {
        this.offeredBy = offeredBy;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
}