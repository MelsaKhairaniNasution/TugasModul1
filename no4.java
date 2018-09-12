/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1.Tugas;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.NetworkInterface;
import javax.swing.JOptionPane;

public class no4 {
    public static void main(String[] args) throws UnknownHostException {
        String IP = "192.168.1.64";
        try {
            InetAddress n = InetAddress.getByName(IP);
            NetworkInterface mac = NetworkInterface.getByInetAddress(n);
            byte[] host = mac.getHardwareAddress() ;
                
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < host.length; i++) {
                sb.append(String.format("%02X%s", host[i], (i < host.length - 1) ? "-" : ""));		
            }
                
            System.out.println("Mac Address: "+sb.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
