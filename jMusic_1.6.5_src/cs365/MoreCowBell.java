package cs365;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;

public class MoreCowBell implements JMC {

	final double BPM = 126.0;
	final int PERCUSSION_MIDI_CHANNEL = 9;
	final int INSTRUMENT = 0; // Since this is percussion, the instrument number doesn't matter. Percussion instruments are specified by the Notes e.g. A4, GS2, etc.
	
	Score music = new Score(BPM);
	Part cowbellPart = new Part(INSTRUMENT, PERCUSSION_MIDI_CHANNEL);
	Phrase cowbellPhrase = new Phrase(1.0);
	
	public static void main(String[] args) {
		MoreCowBell kit = new MoreCowBell();
		kit.addCowBell();
		kit.output();
	}
	
	public MoreCowBell() {
		cowbellPart.addPhrase(cowbellPhrase);
		music.addPart(cowbellPart);
	}
	
	private void addCowBell() {
		//https://pjb.com.au/muscript/gm.html
		// cowbell is GS3 based on this information
		for(int i = 0; i < 128; i++) {
			cowbellPhrase.addNote(new Note(GS3, QN));
		}
	}
	
	private void output() {
		Play.midi(music);
	}

}
