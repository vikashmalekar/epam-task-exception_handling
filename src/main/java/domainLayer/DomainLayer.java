package domainLayer;

import applicationLayer.ApplicationLayer;
interface getMethods{
	double getSimpleInterest(double amount,double noOfYears,double rateOfInterest);
	double getCompoundInterest(double amount,double noOfYears,double rateOfInterest);
	int getHouseConstructionCost(String materialType,int area);
}
public class DomainLayer {


	ApplicationLayer object=new ApplicationLayer();
	public double getSimpleInterest(double amount,double noOfYears,double rateOfInterest) {
		
		return object.calculateSimpleInterest(amount,noOfYears,rateOfInterest);
	}
	public double getCompoundInterest(double amount,double noOfYears,double rateOfInterest) {
		
		return object.calculateCompoundInterest(amount,noOfYears,rateOfInterest);
	}
	public int getHouseConstructionCost(String materialType,int area) {
		return object.constructionCostPerSquarefeet(materialType,area);
	}
}
