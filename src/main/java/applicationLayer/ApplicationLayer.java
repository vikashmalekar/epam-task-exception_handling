package applicationLayer;

public class ApplicationLayer {

	public double calculateSimpleInterest(double amount,double noOfYears,double rateOfInterest) {
		double resultOfSimpleInterest =(amount*noOfYears*rateOfInterest)/100;
		return resultOfSimpleInterest;
	}
	public double calculateCompoundInterest(double amount,double noOfYears,double rateOfInterest) {
		
		double resultOfCompoundInterest= amount*Math.pow(1.0+rateOfInterest/100.0,noOfYears)-amount;
		return resultOfCompoundInterest;
	}
	public int constructionCostPerSquarefeet(String materialType,int area) {
		if(materialType.equals("standard_material") )
			return 1200*area;
		else if(materialType.equals("above_standard_material"))
			return 1500*area;
		else if(materialType.equals("high_standard_material"))
			return 1800*area;
		else if(materialType.equals("high_standard_material_with_fully_automated_home"))
			return 2500*area;
		else 
			return 0;
	}
}
