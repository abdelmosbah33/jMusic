package cs365;


// Note that we import several things from jm.music.data. 
// We could import them all individually, or we could import the whole 
// package jm.music.data by saying
// import jm.music.data.*;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;

public class MakeItBing implements JMC{
	
	private static final int BPM = 120;
	
	public static void main(String[] args) {
		Score mySong = new Score("My First Song", BPM);
		Part piano = new Part("Piano", PIANO, 0);
		Phrase phr = new Phrase();
		piano.addPhrase(phr);
		mySong.add(piano);
		
		for(int i = 0; i < 200; i++) {
			int Pitch = 60+(int)(Math.random()*24);
			Note n = new Note(Pitch, QUARTER_NOTE);
			phr.addNote(n);
		}
				
		Play.midi( mySong );

	}

}