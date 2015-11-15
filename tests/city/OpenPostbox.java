package city;

import java.util.List;

import letter.Letter;

public class OpenPostbox extends Postbox{

	public List<Letter> getLettersCollected(){
		return lettersCollected;
	}
	
	public List<Letter> getLettersToBeDistributed(){
		return lettersToBeDistributed;
	}
	
	public List<Letter> getUrgentLettersCollected() {
		return urgentLettersCollected;
	}
}
