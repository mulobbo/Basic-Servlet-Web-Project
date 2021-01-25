
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletFormLogin")
public class ServletFormLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletFormLogin() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.append("<!DOCTYPE html>\r\n"
        		+ "<html lang=\"en\">\r\n"
        		+ "<head>\r\n"
        		+ "    <meta charset=\"UTF-8\">\r\n"
        		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
        		+ "    <title>Document</title>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "    kullanici adi = ");
        out.append(request.getParameter("kullanici"));
        String kullanici = (request.getParameter("kullanici"));
        out.append("<br>\r\n"
        		+ "    sifre =");
        out.append(request.getParameter("sifre"));
        String sifre = request.getParameter("sifre");
        
        String sfr="1234";
        String kln="utku";
        
        if (kullanici.equals(kln) && sifre.equals(sfr)) {
       	 out.append("<br> SIFRE DOGRU <br>  --BU ISLEM GET ILE YAPILMISTIR--  \r\n"
            		+ "    \r\n"
            		+ "</body>\r\n"
            		+ "</html>"); 		
       	 }else {
			 out.append("<br> SIFRE YANLIS   <br>  --BU ISLEM GET ILE YAPILMISTIR-- \r\n"
               		+ "    \r\n"
               		+ "</body>\r\n"
               		+ "</html>");
 			 System.out.println(kullanici);
 			 System.out.println(sifre); 		}
			
		
       System.out.println("GET ÇAÐRISI YAPILDI");
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         out.append("<!DOCTYPE html>\r\n"
         		+ "<html lang=\"en\">\r\n"
         		+ "<head>\r\n"
         		+ "    <meta charset=\"UTF-8\">\r\n"
         		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
         		+ "    <title>Document</title>\r\n"
         		+ "</head>\r\n"
         		+ "<body>\r\n"
         		+ "    kullanici adi = ");
         out.append(request.getParameter("kullanici"));
         String kullanici = (request.getParameter("kullanici"));
         out.append("<br>\r\n"
         		+ "    sifre =");
         out.append(request.getParameter("sifre"));
         String sifre = request.getParameter("sifre");
         
         String sfr="1234";
         String kln="utku";
         
         if (kullanici.equals(kln) && sifre.equals(sfr)) {
        	 out.append("<br> SIFRE DOGRU <br>  --BU ISLEM POST ILE YAPILMISTIR--  \r\n"
             		+ "    \r\n"
             		+ "</body>\r\n"
             		+ "</html>"); 		
        	 }else {
 			 out.append("<br> SIFRE YANLIS <br>  --BU ISLEM POST ILE YAPILMISTIR-- \r\n"
                		+ "    \r\n"
                		+ "</body>\r\n"
                		+ "</html>");
  			 System.out.println(kullanici);
  			 System.out.println(sifre); 		}
 			
		
        
         System.out.println("POST ÇAGRISI YAPILDI");
         
	}

}
