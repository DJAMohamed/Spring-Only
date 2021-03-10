package m2i.formation.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import m2i.formation.spring.IMusicien;

public class Principal {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext myContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		IMusicien myMusicien1 = (IMusicien)myContext.getBean("guitariste");
		myMusicien1.jouer();
//		IMusicien myMusicien2 = myContext.getBean(IMusicien.class); // Conflit possible si plusieurs Beans
//		 implémentent IMusicien.
//		myMusicien2.jouer();
		IMusicien myMusicien3 = myContext.getBean("pianiste", IMusicien.class);
		myMusicien3.jouer();
		myContext.close();
	}

}