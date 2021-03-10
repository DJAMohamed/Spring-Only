package m2i.formation.spring;

import org.springframework.stereotype.Component;

@Component
public class Ukulele implements IInstrument {

	@Override
	public String toString() {
		return "KLINK KLINK KLINK";
	}

}