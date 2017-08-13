package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	private Queue<String> queue;
	private List<String> discoveredWebsitesList;
	
	public WebCrawler() {
		this.queue = new LinkedList<String>();
		this.discoveredWebsitesList = new ArrayList<String>();
	}
	
	public void discoverWeb(String root) {
		this.queue.add(root);
		this.discoveredWebsitesList.add(root);
		
		while(!queue.isEmpty()) {
			String v = this.queue.remove();
			String rawHtml = readUrl(v);
			
			String regexp = "http://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher matcher = pattern.matcher(rawHtml);
			
			while (matcher.find()) {
				String actualUrl = matcher.group();
				
				if (!discoveredWebsitesList.contains(actualUrl)) {
					discoveredWebsitesList.add(actualUrl);
					System.out.println("Website has been found with URL: " + actualUrl);
					queue.add(actualUrl);
				}
			}
		}
	}
	
	private String readUrl(String v) {
		String rawHtml = "";
		
		try {
			URL url = new URL(v);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine = "";
			
			while((inputLine = in.readLine()) != null) {
				rawHtml += inputLine;
			}
			
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rawHtml;
	}
}