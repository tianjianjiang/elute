package elute;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class YASAWrapper {
	private static String m_YASAURL = "http://yasa.newzilla.org/demo/index2.php";

	public String[] getExtractedTerms (String text) throws Exception {
		String urlEncodedText = URLEncoder.encode(text, "UTF-8");
		StringBuffer sb = new StringBuffer();
		sb.append("inbox=");
		sb.append(urlEncodedText);
		//sb.append("&utf8=true&min=2&clicker=run");
		
		URL url = new URL(m_YASAURL);
		URLConnection conn = url.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);

		OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
		System.out.println(sb.toString());
		wr.write(sb.toString());
		wr.flush();
		wr.close();
    
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		ArrayList<String> termList = new ArrayList<String>();
		String line = null;
		while ((line = rd.readLine()) != null)
			termList.add(line);
		rd.close();
        
		return termList.toArray(new String[0]);
	}
}
