package cs365;

import jm.JMC;
import jm.music.tools.*;
import jm.music.data.*;
import jm.util.*;

public class Phrasing2 implements JMC {

	public static void main(String[] args) {
		Phrase melody = new Phrase(0.0);
		Phrase hatsPhrase = new Phrase(18.0);
		CPhrase chords = new CPhrase(0.0);
		int[] melPitches = {C5, D5, E5, A5, G5, D6, C6};
		double[] melRhythm = {DQN, EN, QN, QN, QN, EN, DQN};
		melody.addNoteList(melPitches, melRhythm);
		
		//https://www.pinterest.com/pin/512425263847644336/
		// look at the chart above
		int[] notePitches1 = {C3, E3, G3}; // c chord
		int[] notePitches2 = {D3, F3, A2}; // what kind of strange d chord is this?
		int[] notePitches3 = {B2, D3, G3}; // G chord with inversions?
		
		chords.addChord(notePitches1, HALF_NOTE);
		chords.addChord(notePitches2, HALF_NOTE);
		chords.addChord(notePitches3, HALF_NOTE);
		
		hatsPhrase.addNote(new Note(FS2, EN));
		hatsPhrase.addNote(new Note(FS2, EN));
		hatsPhrase.addNote(new Note(AS2, QN));
		
		Part kalimba = new Part("Thumb Piano", KALIMBA, 0);
		kalimba.addPhrase(melody);
		Part rhodes = new Part("Electric Piano", EPIANO, 1);
		rhodes.addCPhrase(chords);
		
		Part drumPart = new Part("Drum", 25, 9);
		drumPart.addPhrase(hatsPhrase);
		
		Mod.repeat(kalimba, 12);
		Mod.repeat(rhodes, 14);
		Mod.repeat(drumPart, 29);
		
		Score comp = new Score("Phrasing Example", 150);
		comp.addPart(kalimba);
		comp.addPart(rhodes);
		comp.addPart(drumPart);
		
		Play.midi(comp);
		
		
	}

}
