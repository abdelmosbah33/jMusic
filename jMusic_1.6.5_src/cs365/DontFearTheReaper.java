package cs365;

import jm.JMC;
import jm.music.data.CPhrase;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;

public class DontFearTheReaper implements JMC {

	final double BPM = 120.0;
	final int PERCUSSION_MIDI_CHANNEL = 9;
	final int INSTRUMENT = 0;
	
	Score music = new Score(BPM);
	
	Part cowbellPart = new Part(INSTRUMENT, PERCUSSION_MIDI_CHANNEL);
	Phrase cowbellPhrase = new Phrase(1.0);
	
	Part guitarPart = new Part("Electric Guitar", GUITAR, 2);


	public static void main(String[] args) {
		DontFearTheReaper kit = new DontFearTheReaper();
		kit.addGuitar();
		//kit.addCowBell();
		kit.output();
	}
	
	public DontFearTheReaper() {
	}
	
	private CPhrase createGuitarPhrase1(double start) {
		CPhrase c = new CPhrase(start);
		int[] notePitches1 = {A3, C4};
		int[] notePitches2 = {E4};
		int[] notePitches3 = {A4};
		int[] notePitches4 = {G4};
	
		c.addChord(notePitches1, QN);
		c.addChord(notePitches2, QN);
		c.addChord(notePitches3, QN);
		c.addChord(notePitches4, QN);
		
		
		int[] notePitches5 = {G2};
		int[] notePitches6 = {B3, B4};
		int[] notePitches7 = { D3};
		int[] notePitches8 = { A4};
		
		c.addChord(notePitches5, QN);
		c.addChord(notePitches6, QN);
		c.addChord(notePitches7, QN);
		c.addChord(notePitches8, QN);
		
		int[] notePitches9 = {F2};
		int[] notePitches10 = {C3};
		int[] notePitches11 = { D3};
		int[] notePitches12 = { G4};
		
		c.addChord(notePitches9, QN);
		c.addChord(notePitches10, QN);
		c.addChord(notePitches11, QN);
		c.addChord(notePitches12, QN);
		
		int[] notePitches13 = {G2};
		int[] notePitches14 = {B3};
		int[] notePitches15 = { D3};
		int[] notePitches16 = { G4};
		
		c.addChord(notePitches13, QN);
		c.addChord(notePitches14, QN);
		c.addChord(notePitches15, QN);
		c.addChord(notePitches16, QN);
		
		return c;
	}
	
	private CPhrase createGuitarPhrase2(double start) {
		CPhrase c = new CPhrase(start);
		int[] notePitches1 = {A3, C4};
		int[] notePitches2 = {E4};
		int[] notePitches3 = {A4};
		int[] notePitches4 = {G4};
	
		c.addChord(notePitches1, QN);
		c.addChord(notePitches2, QN);
		c.addChord(notePitches3, QN);
		c.addChord(notePitches4, QN);
		
		
		int[] notePitches5 = {G2};
		int[] notePitches6 = {B3, B4};
		int[] notePitches7 = { D3};
		int[] notePitches8 = { A4};
		
		c.addChord(notePitches5, QN);
		c.addChord(notePitches6, QN);
		c.addChord(notePitches7, QN);
		c.addChord(notePitches8, QN);
		
		int[] notePitches9 = {F2};
		int[] notePitches10 = {C3};
		int[] notePitches11 = { D3};
		int[] notePitches12 = { G4};
		
		c.addChord(notePitches9, QN);
		c.addChord(notePitches10, QN);
		c.addChord(notePitches11, QN);
		c.addChord(notePitches12, QN);
		
		int[] notePitches13 = {G2};
		int[] notePitches14 = {B3};
		int[] notePitches15 = { D3};
		int[] notePitches16 = { G4};
		
		c.addChord(notePitches13, QN);
		c.addChord(notePitches14, QN);
		c.addChord(notePitches15, QN);
		c.addChord(notePitches16, QN);
		
		return c;
	}
	
	private void addGuitar() {
		
		final int N = 1;
		
		for(int i = 0; i < N; i++) {
			guitarPart.addCPhrase( createGuitarPhrase1(0.0) );
			guitarPart.addCPhrase( createGuitarPhrase2(8.0) );
		}
		
		music.add(guitarPart);
	}
	
	private void addCowBell() {
		for(int i = 0; i < 128; i++) {
			cowbellPhrase.addNote(new Note(GS3, QN));
		}
	}
	
	private void output() {
		Play.midi(music);
	}

}
