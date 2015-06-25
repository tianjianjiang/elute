package elute;

import java.util.ArrayList;

public abstract class LanguageModel {
	public abstract boolean load(String path);
	public abstract double getLogProb(ArrayList<Token> tokenList);
	public abstract double getBackOff(ArrayList<Token> tokenList);
}
