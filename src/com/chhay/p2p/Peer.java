package com.chhay.p2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Peer {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">Enter username and port # for this peer: ");
        String[] setupValues = bufferedReader.readLine().split(" ");
        ServerThread serverThread = new ServerThread(setupValues[1]);
        serverThread.start();
        new Peer().updateListenToPeers(bufferedReader, setupValues[0], serverThread);

    }

    public void updateListenToPeers(BufferedReader bufferedReader, String username, ServerThread serverThread) throws Exception {
        System.out.println(">Enter hostname:port#");
        System.out.println(" Peers to receive messages from (s = skip): ");
        String input = bufferedReader.readLine();
        String[] inputValues = input.split(" ");
    }

}
