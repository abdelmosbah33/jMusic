package cs365;

import jm.JMC;
import jm.music.data.*;
import jm.util.*;
import jm.music.tools.*;

public class PopularKidsSongs2 implements JMC{
	Part flute, trumpet, clarinet;
	Phrase phrase1, phrase2, phrase3;
	Score score;
	int[] pitchArray;
	double[] rhythmArray;
	
	int[] pitchArray2;
	double[] rhythmArray2;
	
	public static void main(String[] args) {
		PopularKidsSongs2 row = new PopularKidsSongs2();
		row.makeMusicData();
		row.structureData();
		row.playAndSave();
	}
	
	public PopularKidsSongs2() {
		score = new Score("Row Your Boat", 120.0);
		flute = new Part(FANTASIA,0);// you can change these instruments! Check out jm.constants.ProgramChanges
		trumpet = new Part(TROMBONE,1);
		clarinet = new Part(PIANO,2);
		phrase1 = new Phrase(0.0);
		phrase2 = new Phrase(0.0);
		phrase3 = new Phrase(0.0);
		// row your boat
		/*
		
		pitchArray = new int[] { C4, C4, C4, D4, E4, E4, D4, E4, F4, G4, C5, C5, C5,
								 G4, G4, G4, E4, E4, E4, C4, C4, C4, G4, F4, E4, D4,
								 C4 };
		rhythmArray = new double[] { QN,  QN,  QNT, ENT, QN,  QNT, ENT, QNT, QT,  HN,  ENT, ENT, ENT,
									 ENT, ENT, ENT, ENT, ENT, ENT, ENT, ENT, ENT, QNT, ENT, QNT, ENT,
									 HN };
		*/
		
		// twinkle twinkle little star
		pitchArray = new int[] {
		
				C4, C4, G4, G4, A4, A4, G4,
				F4, F4, E4, E4, D4, D4, C4,
				G4, G4, F4, F4, E4, E4, D4,
				G4, G4, F4, F4, E4, E4, D4,
				C4, C4, G4, G4, A4, A4, G4,
				F4, F4, E4, E4, D4, D4, C4
		};
		
		rhythmArray = new double[] {
				QN,QN,QN,QN,QN,QN,HN,
				QN,QN,QN,QN,QN,QN,HN,
				QN,QN,QN,QN,QN,QN,HN,
				QN,QN,QN,QN,QN,QN,HN,
				QN,QN,QN,QN,QN,QN,HN,
				QN,QN,QN,QN,QN,QN,WN
		};
		
		
		// jingle Bells
		/*
		pitchArray = new int[] { E4, E4, E4, 
								 E4, E4, E4,
								 E4, G4, C4, D4,
								 E4,
								 
								 F4, F4, F4, F4,
								 F4, E4, E4, E4,
								 E4, D4, D4, E4,
								 D4, G4,
								 
								 E4, E4, E4, 
								 E4, E4, E4,
								 E4, G4, C4, D4,
								 E4,
								 
								 F4, F4, F4, F4,
								 F4, E4, E4, E4,
								 G4, G4, F4, D4,
								 C4
								 
		};
		
		rhythmArray = new double[] {
				QN, QN, HN,
				QN, QN, HN,
				QN,QN,QN,QN,
				WN,
				
				QN,QN,QN,QN,
				QN,QN,QN,QN,
				QN,QN,QN,QN,
				HN, HN,
				
				QN, QN, HN,
				QN, QN, HN,
				QN,QN,QN,QN,
				WN,
				
				QN,QN,QN,QN,
				QN,QN,QN,QN,
				QN,QN,QN,QN,
				WN
		};
		*/
		
				
	}
	
	public void makeMusicData() {
		phrase1.addNoteList(pitchArray,rhythmArray);
		phrase2 = phrase1.copy();
		//phrase2.setStartTime(4.0);
		phrase3 = phrase1.copy();
		//phrase3.setStartTime(8.0);
		
		//Mod.transpose(phrase1, -32);
		//Mod.transpose(phrase3, -12);
	}
	
	public void structureData() {
		flute.addPhrase(phrase1);
		trumpet.addPhrase(phrase2);
		clarinet.addPhrase(phrase3);
		score.addPart(flute);
		score.addPart(trumpet);
		score.addPart(clarinet);;
	}
	
	public void playAndSave() {
		Play.midi(score);
	}
}
