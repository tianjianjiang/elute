package elute;

import java.util.ArrayList;

public class Token {
	private String m_word = null;
	private ArrayList<String> m_keystrokesList = null;

	public Token(String word, ArrayList<String> keystrokesList)
	{
		m_word = word;
		m_keystrokesList = keystrokesList;
	}

	public String getWord() { return m_word; }
	public void setWord(String word) { m_word = word; }
	
	public ArrayList<String> getKeystrokesList() { return m_keystrokesList; }
	public void setKeystrokesList(ArrayList<String> keystrokesList) { m_keystrokesList = keystrokesList; }
}
