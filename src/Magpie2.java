/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
	    statement = statement.toLowerCase();
		String response = "";
		if (statement.contains("no"))
		{
			response = "Why so negative? Be positive!";
		}
		else if (statement.matches("(.*)(mother|father|brother|sister)(.*)"))
		{
			response = "Tell me more about your family.";
		} else if(statement.contains("dog") || statement.contains("cat")){
		    boolean dog = statement.contains("dog");
			response = "Tell me more about your " + ((dog)?"dog":"cat");
		} else if(statement.toLowerCase().contains("baldwin")){
		    response = favorableResponse();
        } else if(statement.trim().equals("")){
            response = "Please say something, I'm so lonely.";
        } else if(statement.contains("sine")&&!statement.contains("cosine")){
        	response = "I prefer cosine";
		} else if(statement.contains("cosine")){
        	response = "Don't make me go off on a tangent.";
		} else if(statement.contains("tangent")){
			response = "I seCan't believe that you just said that.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		switch(whichResponse){
            case 0:
                response = "Interesting, tell me more.";
                break;
            case 1:
                response = "Hmmm.";
                break;
            case 2:
                response = "Do you really think so?";
                break;
            case 3:
                response = "You don't say.";
                break;
            case 4:
                response = "Continue";
                break;
            case 5:
                response = "What?";
                break;
            default:
                response = "No! Really?";
        }

		return response;
	}
	private String favorableResponse(){
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        switch(whichResponse){
            case 1:
                return "Oh! He sounds interesting! Tell me more!";
            case 2:
                return "I love Mr. Baldwin! He's the best";
            case 3:
                return "You have Mr. Baldwin!? Best Comp Sci teacher ever!";
            default:
                return "Tell me more about Mr. Baldwin!";
        }
    }
}
