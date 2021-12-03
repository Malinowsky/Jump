package HMS;

import HMS.HealthInsurancePlan;

public class Billing extends HealthInsurancePlan{

    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        if (patientInsurancePlan != null) {
            payments[0] = amount ;
            payments[1] = amount ;
        }
        else if (patientInsurancePlan == null)
        {
            payments[0] = amount*0.5;
            payments[1] = (amount*0.5)-20;
        }



        return payments;
    }



}