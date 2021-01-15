/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musabbiha.reports;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;

/**
 *
 * @author me
 */
public class jasperport {
    public static void main(String[] args){
        try {
            String file = JOptionPane.showInputDialog(null,"Enter file id");
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Document","sa", "#HUZAIFA");
            String sql = "D:\\PROJECT\\musabbiha (2)\\musabbiha\\src\\musabbiha\\reports\\files.jrxml";
            File f = new File("files.jrxml");
            
            JasperDesign jd = JRXmlLoader.load(sql);
//            JRDesignQuery query = new JRDesignQuery();
//            query.setText("SELECT * FROM Files ");
//            jd.setQuery(query);
    Map<String, Object> map = new HashMap<>();

            map.put("Filesid", 28);

            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
            
            JasperViewer.viewReport(jp);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
