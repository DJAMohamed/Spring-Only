package m2i.formation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Guitariste implements IMusicien {
	@Autowired
	@Qualifier("guitare")
	private IInstrument instrument;

	public Guitariste() {
		super();
	}

	public Guitariste(IInstrument instrument) {
		super();
		this.instrument = instrument;
	}	
	
	public IInstrument getInstrument() {
		return instrument;
	}

	public void setInstrument(IInstrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void jouer() {
		System.out.println("Le guitariste joue : " + this.instrument.toString());
	}
	
//	@PostConstruct
	public void afrerInjection() {
		System.out.println(this.getClass().getSimpleName());
	}
	
}