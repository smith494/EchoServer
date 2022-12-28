package com.courtneysmith;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try(ServerSocket serverSocket  = new ServerSocket(7543)){
            // Only one client for this server
//            Socket socket = serverSocket.accept();
//            System.out.println("Client Connected");
//
//            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Multiple client server
            while (true){ // ok to have infinite loop here
                //alternative code
//                Socket socket = serverSocket.accept();
//                Echoer echoer = new Echoer(socket);
//                echoer.start();
                new Echoer(serverSocket.accept()).start();
            }

        }catch (IOException e){
            System.out.println("Server exception " + e.getMessage());
        }
    }
}