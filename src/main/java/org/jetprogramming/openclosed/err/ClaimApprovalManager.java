package org.jetprogramming.openclosed.err;

public class ClaimApprovalManager {

	public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
		if (surveyor.isValidClaim()) {
			System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
		}
	}

	/* Por cada nuevo tipo, es necesario modificar ClaimApprovalManager */
	public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
		if (surveyor.isValidClaim()) {
			System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
		}
	}
}