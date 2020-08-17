package cs365;

import jm.music.data.Note;
import jm.music.data.Phrase;
import jm.util.Play;

public class MakeItBing {

	public static void main(String[] args) {
	
		Phrase phr = new Phrase();
		for(int i = 0; i < 200; i++) {
			Note n = new Note(60+(int)(Math.random()*24),0.125);
			phr.addNote(n);
		}
		Play.midi( phr );

	}

}