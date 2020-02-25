package infrastructureLayer;
import com.epam5.logger_exceptionhandling.App;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InfrastructureLayer {
	private static final Logger LOGGER= LogManager.getLogger(App.class);

	public void userOperation1(){
	
		for(int i=0;i<App.listForInterestDetails.size();i++) {
			LOGGER.debug(App.listForInterestDetails.get(i)+"\n");
		}
	}
	public void userOperation2(){
		
		for(int i=0;i<App.listForHousecostDetails.size();i++) {
			LOGGER.debug(App.listForHousecostDetails.get(i)+"\n");
		}
	}
}
