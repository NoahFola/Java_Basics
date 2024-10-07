import javax.sound.midi.*;

public class MiniMusicApp {
    public static void main(String[] args) {
        try {
            // Get a sequencer and open it
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // Create a new sequence and a track
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            // Add a bunch of events to the track to create a sequence of notes
            for (int i = 5; i < 61; i += 4) {
                // Make a NOTE ON event
                track.add(makeEvent(144, 1, i, 100, i));

                // Make a NOTE OFF event
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            // Set the sequence to the sequencer and start playing
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Method to create a MIDI event
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }
}
