package cs365;

import jm.JMC;
import jm.music.data.*;
import jm.util.*;
import jm.music.tools.*;

public class MultiPhaseDrums implements JMC {

	Score music = new Score(125.0);
	Part drums = new Part(25, 9);
	Phrase kickPhrase = new Phrase(1.0);
	Phrase snarePhrase = new Phrase(1.0);
	Phrase hatsPhrase = new Phrase(1.0);
	
	public static void main(String[] args) {
		MultiPhaseDrums kit = new MultiPhaseDrums();
		kit.createKickPhrase();
		kit.createSnarePhrase();
		kit.createHatsPhrase();
		kit.output();
	}
	
	public MultiPhaseDrums() {
		drums.addPhrase(kickPhrase);
		drums.addPhrase(snarePhrase);
		drums.addPhrase(hatsPhrase);
		music.addPart(drums);
	}
	
	private void createKickPhrase() {
		for(int i = 0; i < 8; i++) {
			kickPhrase.addNote(new Note(C2, QN));
			kickPhrase.addRest(new Rest(QN));
		}
	}
	
	private void createSnarePhrase() {
		for( int i = 0; i < 8; i++) {
			snarePhrase.addRest(new Rest(QN));
			snarePhrase.addNote( new Note(D2, QN));
		}
	}
	
	private void createHatsPhrase() {
		for(int i = 0; i < 16; i++) {
			hatsPhrase.addNote(new Note(FS2, SIXTEENTH_NOTE));
			hatsPhrase.addNote(new Note(FS2, SIXTEENTH_NOTE));
			hatsPhrase.addNote(new Note(AS2,EIGHTH_NOTE));
		}
	}
	
	private void output() {
		Play.midi(music);
	}
	
	
}
