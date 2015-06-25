package elute;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YASAWrapperTest {
	private YASAWrapper m_yasa = null;

	@Before
	public void setUp() throws Exception {
		m_yasa = new YASAWrapper();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetExtractedTerms() throws Exception {
		String text = "宇宙無敵測試文字無敵文字文字無敵宇宙！YASA";
		String [] extractedTerms = m_yasa.getExtractedTerms(text);
		assertNotNull(extractedTerms);
		for(int i = 0; i < extractedTerms.length; i++)
			System.out.println(extractedTerms[i]);
	}
}