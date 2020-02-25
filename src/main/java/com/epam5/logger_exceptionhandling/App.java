package com.epam5.logger_exceptionhandling;

import java.util.*;
import infrastructureLayer.InfrastructureLayer;
import domainLayer.DomainLayer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
interface UserInterface {
	/* 
	 Hence LAYERED ARCHITECTURE and SOLID,DRY,KISS,YAGNA Principles are implemented..!!
	 */
}
public class App 
{
	private static final Logger LOGGER= LogManager.getLogger(App.class);
	public static ArrayList<Object> listForInterestDetails= new ArrayList<Object>();
public static ArrayList<Object> listForHousecostDetails = new ArrayList<Object>();

    public static void main( String[] args )
    {
        


    
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char choice='Y';
		DomainLayer object=new DomainLayer();
		InfrastructureLayer object1=new InfrastructureLayer();
		int calculate=1;
		while(calculate==1) {
			LOGGER.debug("You want to calculate Interests(1) or House construction cost(2)= (1/2)\n ");
		int interest=scanner.nextInt();
		
		if(interest==1) {
			listForInterestDetails.add(interest);
		while(choice=='Y') {
			LOGGER.debug("Enter the Amount to Calculate Simple Interest and Compound Interest= \n");
		double amount=scanner.nextDouble();
		listForInterestDetails.add(amount);
		LOGGER.debug("Enter the Number of Years to Calculate Simple Interest and Compound Interest= \n");
		double noOfYears=scanner.nextDouble();
		listForInterestDetails.add(noOfYears);
		LOGGER.debug("Enter the Rate of Interest to Calculate Simple Interest and Compound Interest= \n");
		double rateOfInterest=scanner.nextDouble();
		listForInterestDetails.add(rateOfInterest);
		
		listForInterestDetails.add(object.getSimpleInterest(amount,noOfYears,rateOfInterest));
		listForInterestDetails.add(object.getCompoundInterest(amount,noOfYears,rateOfInterest));
		LOGGER.debug(object.getSimpleInterest(amount,noOfYears,rateOfInterest)+"\n");
		LOGGER.debug(object.getCompoundInterest(amount,noOfYears,rateOfInterest)+"\n");
		LOGGER.debug("Want to calculate more of simple and compound interest= (Y/N) \n");
		choice=scanner.next().charAt(0);
		listForInterestDetails.add(choice);
		if(choice=='N') {
			break;
		}
		
		
	}}
		
		else {
			choice='Y';
			while(choice=='Y') {
				listForHousecostDetails.add(interest);
				LOGGER.debug("Enter type of material=(standard_material, above_standard_material, high_standard_material, high_standard_material_fully_autumated_home)  \n");
				String materialType=scanner.next();
				listForHousecostDetails.add(materialType);
				LOGGER.debug("Enter Area of house= \n");
				int area=scanner.nextInt();
				listForHousecostDetails.add(area);
				listForHousecostDetails.add(object.getHouseConstructionCost(materialType,area));
				LOGGER.debug(object.getHouseConstructionCost(materialType,area)+"\n");
				LOGGER.debug("Want to calculate another house construction cost= (Y/N)\n");
				choice=scanner.next().charAt(0);
				if(choice=='N')
					break;
			}
		}
		LOGGER.debug("Want to calculate more on interest/construction cost= (Yes-1/No-0)\n");
		calculate=scanner.nextInt();
		if(calculate==0)
			break;
		}
		if(listForInterestDetails.size()>0) {
			LOGGER.debug("Operation done while calculating Interests= \n");
		object1.userOperation1();}
		if(listForInterestDetails.size()>0) {
			LOGGER.debug("Operation done while calculating construction cost= \n");
			object1.userOperation2();}
		
}}
