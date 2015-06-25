package elute;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;

public class TokenTest {
	private Token m_token = null;

	@Before
	public void setUp() throws Exception {
		ArrayList<String> keystrokesList = new ArrayList<String>();
		keystrokesList.add("keystrokes1");
		keystrokesList.add("keystrokes2");
		
		m_token = new Token(new String("word1"), keystrokesList);
	}

	@After
	public void tearDown() throws Exception {
		m_token = null;
	}

	@Test
	public void testGetWord() throws Exception {
		String mock = m_token.getWord();
		
		assertNotNull(mock);
		assertEquals("word1", mock);
	}
	
	@Test
	public void testSetWord() throws Exception {
		m_token.setWord("word2");
		
		assertEquals("word2", m_token.getWord());
	}
	
	@Test
	public void testGetKeystrokesList() throws Exception {
		ArrayList<String> mock = m_token.getKeystrokesList();
		
		assertNotNull(mock);
	}
	
	@Test
	public void testSetKeystrokesList() throws Exception {
		ArrayList<String> mock = new ArrayList<String>();
		mock.add("keystrokes3");
		mock.add("keystrokes4");
		mock.add("keystrokes5");
		m_token.setKeystrokesList(mock);
		
		assertEquals("keystrokes3", m_token.getKeystrokesList().get(0));
	}
}
