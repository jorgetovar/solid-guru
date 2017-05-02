package org.jetprogramming;

import org.jetprogramming.openclosed.good.ClaimApprovalManager;
import org.jetprogramming.openclosed.good.HealthInsuranceSurveyor;
import org.jetprogramming.openclosed.good.VehicleInsuranceSurveyor;
import org.junit.Test;

public class ClaimApprovalManagerTest {
	 
    @Test
    public void testProcessClaim() throws Exception {
      HealthInsuranceSurveyor healthInsuranceSurveyor=new HealthInsuranceSurveyor();
      ClaimApprovalManager claim1=new ClaimApprovalManager();
      claim1.processClaim(healthInsuranceSurveyor);
 
        VehicleInsuranceSurveyor vehicleInsuranceSurveyor=new VehicleInsuranceSurveyor();
        ClaimApprovalManager claim2=new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}