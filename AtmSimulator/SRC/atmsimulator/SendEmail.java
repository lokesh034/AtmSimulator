/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulator;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ltriv
 */
public class SendEmail {
    
      String host = "smtp.gmail.com";    
      String to;
      String from="trivedilokesh144@gmail.com";
      String user = "trivedilokesh144@gmail.com";
      String pass="8@85347219t";      
      String subject;
      String messageText;
      boolean sessionDebug=false;
      
      
      public void setMsg(String m)
      {
          messageText=m;
      }
      
      public void setTo(String t)
      {
          to=t;
      }
      public void setSubject(String s)
      {
          subject=s;
      }
      
     public void sendMail() throws AddressException, MessagingException
     {
     
          
      Properties props = System.getProperties();
 
      props.put("mail.smtp.starttls.enable","host");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth","true");
      props.put("mail.smtp.starttls.required", "true");
      
      //we need security so java already provide security
      java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
              
 
      // creating session object to get properties
      Session mailSession = Session.getDefaultInstance(props);
      mailSession.setDebug(sessionDebug);
 

         // Message object.
         Message message = new MimeMessage(mailSession);
 
         // Set From Field: adding senders email to from field.
         message.setFrom(new InternetAddress(from));
         
         InternetAddress address=new InternetAddress(to);
 
         // Set To Field: adding recipient's email to from field.
         message.setRecipient(Message.RecipientType.TO, address);
 
         // Set Subject: subject of the email
         message.setSubject(subject);
         
         message.setSentDate(new Date());
         // set body of the email.
         message.setText(messageText);
 
         // Send email.
         Transport transport=mailSession.getTransport("smtp");
         transport.connect(host, user, pass);
         transport.sendMessage(message,message.getAllRecipients());
         transport.close();
         System.out.println("Mail successfully sent");
      }
   
    
}
