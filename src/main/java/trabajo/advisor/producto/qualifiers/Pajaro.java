package trabajo.advisor.producto.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Pajaro extends Animal implements Volador  {

	private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
	
	@Override
	public void volar() {
		log.info("Soy un pajaro y estoy volando");
		
	}

}
