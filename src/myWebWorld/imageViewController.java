package myWebWorld;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WatsonController
 */
@WebServlet("/imageViewController")
public class imageViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public imageViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String[] OriginalMessage=new String[1000];
		String[] APIMessage=new String[1000];
		String[] Score=new String[1000];
		String[] ToneName=new String[1000];
		*/
		HttpSession session = request.getSession(true);
		
		//String InputString=request.getParameter("usrtxt").replaceAll("\\s+$", "");
		//String InputString=request.getParameter("usrtxt").replaceAll("\\s+", " ");
		//System.out.println(InputString);
	     //String holdme="Before Thursday EOD we need to exit SOAK for MBM / MVM to get a Go for entire release . @ Ashok / Kinga : request your help in expediting this as Friday will be late in the cycle to uncover any defects or to fix them .";
		//String[] Tem=InputString.split("\\.");
		/*int ActualSentenceCount=0;
		
		int NoSentences=Tem.length;
		System.out.println("Actual sentence is:"+NoSentences);
		if(NoSentences<=1)
		{   
			System.out.println("M inside singleton");
			String OverallTone=Analyse.GetAnalysedTone(InputString);
			
			String[] OverAllToneNames=Analyse.GetAnalysedToneName(OverallTone);
			String[] TempHoldSentencesToneNames=Analyse.GetAnalysedToneName(OverallTone);
			session.setAttribute("TempHoldSentencesToneNames", TempHoldSentencesToneNames);
			session.setAttribute("OverAllToneNames", OverAllToneNames);
			
		}else
		{
			System.out.println("M inside multiton");
		String OverallTone=Analyse.GetAnalysedTone(InputString);
		String[] TempHoldDocSentence=OverallTone.split("sentences_tone");
		String[] OverAllToneNames=Analyse.GetAnalysedToneName(TempHoldDocSentence[0]);
		String[] TempHoldSentencesToneNames=Analyse.GetAnalysedToneName(TempHoldDocSentence[1]);
		session.setAttribute("TempHoldSentencesToneNames", TempHoldSentencesToneNames);
		session.setAttribute("OverAllToneNames", OverAllToneNames);
	    //System.out.println("OverallTone is:"+OverallTone);
		}
		for(int h=0;h<NoSentences;h++)
		{
			System.out.println("Sentence "+h+":"+Tem[h]);
			OriginalMessage[h]=Tem[h];	 
			
		}
		*/
		//session.setAttribute("OriginalMessage", OriginalMessage);
		
		//session.setAttribute("NoSentences", NoSentences);
		//session.setAttribute("ScoreTotal", ScoreTotal);
		//session.setAttribute("ToneNameTotal", ToneNameTotal);
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

