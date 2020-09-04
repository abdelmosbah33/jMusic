package cs365;

import jm.JMC;
import jm.music.data.*;
import jm.util.*;
import jm.music.tools.*;

public class PopularKidsSongs implements JMC{
	private Part instrument;
	private Phrase phrase1;
	private Score song;
	private int[] noteArray;
	private double[] rhythmArray;
	
	private enum SONG{
		ROW_YOUR_BOAT,
		TWINKLE_TWINKLE,
		JINGLE_BELLS,
	}
	
	public static void main(String[] args) {
		PopularKidsSongs song = new PopularKidsSongs(SONG.JINGLE_BELLS);
		song.play();
	}
	
	public PopularKidsSongs(SONG songChoice) {
		song = new Score("Row Your Boat", 120.0);
		instrument = new Part(TUBA,0);// you can change these instruments! Check out jm.constants.ProgramChanges
		phrase1 = new Phrase(0.0);
		switch(songChoice) {
			case ROW_YOUR_BOAT:
				noteArray = new int[] { C4, C4, C4, D4, E4, E4, D4, E4, F4, G4, C5, C5, C5,
										 G4, G4, G4, E4, E4, E4, C4, C4, C4, G4, F4, E4, D4,
										 C4 };
				rhythmArray = new double[] { QN,  QN,  QNT, ENT, QN,  QNT, ENT, QNT, QT,  HN,  ENT, ENT, ENT,
											 ENT, ENT, ENT, ENT, ENT, ENT, ENT, ENT, ENT, QNT, ENT, QNT, ENT,
											 HN };
				break;
			case TWINKLE_TWINKLE:
				noteArray = new int[] {
				
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
				
				break;
			case JINGLE_BELLS:
				noteArray = new int[] { E2, E2, E2, 
										 E2, E2, E2,
										 E2, G2, C2, D2,
										 E2,
										 
										 F2, F2, F2, F2,
										 F2, E2, E2, E2,
										 E2, D2, D2, E2,
										 D2, G2,
										 
										 E2, E2, E2, 
										 E2, E2, E2,
										 E2, G2, C2, D2,
										 E2,
										 
										 F2, F2, F2, F2,
										 F2, E2, E2, E2,
										 G2, G2, F2, D2,
										 C2
										 
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
				break;
			default:
				System.err.println("ERROR!\nYou did not enter a valid song choice.");
		}

		phrase1.addNoteList(noteArray,rhythmArray);
		instrument.addPhrase(phrase1);
		song.addPart(instrument);
	}
	
	
	public void play() {
		Play.midi(song);
	}
}
