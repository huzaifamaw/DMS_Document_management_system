/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musabbiha.Classes;

import java.util.Properties;
import java.util.Random;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author CZ3
 */
public class EmailConnection {
    
    
    public boolean email(String Reciever, String textBody){
     String From = "huzaifamawahab@gmail.com";
        String To = Reciever;
        String Subject = "DOCUMENT MANAGMENT SYSTEM";
        String text = "HEY THIS IS DOCUMENT MANAGMENT SYSTEM THIS IS YOUR CODE :     \n\n\t\t "+textBody;
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        System.out.println("done1");
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {

                                      protected  PasswordAuthentication getPasswordAuthentication(){
                                      return new PasswordAuthentication("huzaifamawahab@gmail.com", "huzaifamawahab");
                                      }
                   
                   
                }
                
                );
        System.out.println("done2");
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(From));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To));
            message.setSubject(Subject);
            
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(text);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            
//            messageBodyPart= new MimeBodyPart();
//            javax.activation.DataSource source = new FileDataSource("HYYYY");    
//            messageBodyPart.setDataHandler(new DataHandler(source));
//            messageBodyPart.setFileName("hyy");
//            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "A CONFIRMATION LINK HAS BEEN SENT PLEASE CHECK YOUR MAIL....");
            return true;
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
}
