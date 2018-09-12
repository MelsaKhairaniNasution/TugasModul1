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

public class no3 {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Scan IP");
        String IP = "192.168.1.0";
        String hasil = null;
        try {
            InetAddress local = InetAddress.getByName(IP);
            byte[] ip = local.getAddress();

            for (int i = 1; i <= 50; i++) {
                InetAddress address = InetAddress.getByAddress(ip);
                ip[3] = (byte) i;
                 hasil = address.toString();
                 
                if (address.isReachable(3000)) {
                    System.out.println(hasil + "Aktif");
                } else {
                    System.out.println(hasil + "Tidak Aktif");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
