/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobiles.app;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 *
 * @author mohamed Ewies
 */
public class MacIp {
StringBuilder my_mac_ip = new StringBuilder("EC-F4-BB-83-ED-DF34-23-87-E1-83-6736-23-87-E1-83-6700-00-00-00-00-00-00-E000-00-00-00-00-00-00-E034-23-87-E1-83-68");
StringBuilder my_mac_ip2 = new StringBuilder("EC-F4-BB-83-ED-DF34-23-87-E1-83-6736-23-87-E1-83-6700-00-00-00-00-00-00-E0");
/**
     * @param args the command line arguments
     */

public boolean mac_value()
{
 StringBuilder sb = new StringBuilder();
   
  try {
    InetAddress ip = InetAddress.getLocalHost();
    //System.out.println("Current IP address : " + ip.getHostAddress());

    Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
    while(networks.hasMoreElements()) {
      NetworkInterface network = networks.nextElement();
      byte[] mac = network.getHardwareAddress();

      if(mac != null) {
        
        for (int i = 0; i < mac.length; i++) {
          sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
          
        }
        
      }
    }
  
  } catch (UnknownHostException e) {
    e.printStackTrace();
  } catch (SocketException e){
    e.printStackTrace();
  }
  //System.out.println("*"+sb.toString()+"*");
  //System.out.println("*"+my_mac_ip.toString()+"*");
  //System.out.println(my_mac_ip.equals(sb));

  return (my_mac_ip.toString().equals(sb.toString())||my_mac_ip2.toString().equals(sb.toString()));
  
}
    public static void main(String[] args) {
        // TODO code application logic here
       
  
}
    
}
