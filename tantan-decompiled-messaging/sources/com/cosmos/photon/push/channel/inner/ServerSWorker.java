package com.cosmos.photon.push.channel.inner;

import android.net.Credentials;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.AppContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class ServerSWorker {
    public static final int COMMAND_CHANNEL = 1;
    public static final int COMMAND_DEFAULT = 0;
    public static final int COMMAND_EXIT = 400;
    public static final int COMMAND_REQUEST = 2;
    private String mAddress;
    private ServerThread serverThread;

    public class ServerThread extends Thread {
        volatile boolean isRunning;
        volatile LocalServerSocket server;

        public ServerThread(String str) {
            super(str);
            this.isRunning = true;
            this.server = null;
        }

        private int processConnect(LocalSocket localSocket) throws Throwable {
            BufferedReader bufferedReader;
            Throwable th;
            PrintWriter printWriter;
            Exception e;
            try {
                try {
                    Credentials peerCredentials = localSocket.getPeerCredentials();
                    MDLog.m7395i(LogTag.CHANNEL, "serverSocket accept connection: uid:" + peerCredentials.getUid() + " pid:" + peerCredentials.getPid());
                    printWriter = new PrintWriter(localSocket.getOutputStream());
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(localSocket.getInputStream()));
                        while (true) {
                            try {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        localSocket.close();
                                        printWriter.close();
                                        break;
                                    }
                                    int iHashCode = line.hashCode();
                                    if (iHashCode != 931221187) {
                                        if (iHashCode == 1612791646 && line.equals(ChannelConstant.COMMAND_EXIT)) {
                                            try {
                                                localSocket.close();
                                                printWriter.close();
                                                bufferedReader.close();
                                                return 400;
                                            } catch (Exception e2) {
                                                MDLog.printErrStackTrace(LogTag.CHANNEL, e2);
                                                return 400;
                                            }
                                        }
                                    } else if (line.equals(ChannelConstant.COMMAND_CHANNEL)) {
                                        MDLog.m7395i(LogTag.CHANNEL, "serverSocket accept cmd: " + line);
                                        printWriter.println(AppContext.getContext().getPackageName());
                                        printWriter.flush();
                                        try {
                                            localSocket.close();
                                            printWriter.close();
                                            bufferedReader.close();
                                            return 1;
                                        } catch (Exception e3) {
                                            MDLog.printErrStackTrace(LogTag.CHANNEL, e3);
                                            return 1;
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    MDLog.printErrStackTrace(LogTag.CHANNEL, e);
                                    localSocket.close();
                                    printWriter.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    localSocket.close();
                                    printWriter.close();
                                    bufferedReader.close();
                                } catch (Exception e5) {
                                    MDLog.printErrStackTrace(LogTag.CHANNEL, e5);
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e6) {
                        bufferedReader = null;
                        e = e6;
                    } catch (Throwable th3) {
                        bufferedReader = null;
                        th = th3;
                        localSocket.close();
                        printWriter.close();
                        bufferedReader.close();
                        throw th;
                    }
                } catch (Exception e7) {
                    MDLog.printErrStackTrace(LogTag.CHANNEL, e7);
                    return 0;
                }
            } catch (Exception e8) {
                bufferedReader = null;
                e = e8;
                printWriter = null;
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                printWriter = null;
            }
            bufferedReader.close();
            return 0;
        }

        public void end() throws Throwable {
            this.isRunning = false;
            interrupt();
            ClientWorker.sendSimpleMessage(ServerSWorker.this.mAddress, ChannelConstant.getExitCommand());
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    this.server = new LocalServerSocket(ServerSWorker.this.mAddress);
                    MDLog.m7395i(LogTag.CHANNEL, "serverSocket begin listener: " + ServerSWorker.this.mAddress);
                    while (this.isRunning && processConnect(this.server.accept()) != 400) {
                    }
                    if (this.server != null) {
                        try {
                            this.server.close();
                        } catch (IOException e) {
                            e = e;
                            MDLog.printErrStackTrace(LogTag.CHANNEL, e);
                        }
                    }
                } catch (IOException e2) {
                    MDLog.printErrStackTrace(LogTag.CHANNEL, e2);
                    if (this.server != null) {
                        try {
                            this.server.close();
                        } catch (IOException e3) {
                            e = e3;
                            MDLog.printErrStackTrace(LogTag.CHANNEL, e);
                        }
                    }
                }
                MDLog.m7395i(LogTag.CHANNEL, "ServerSocketThread end");
            } catch (Throwable th) {
                if (this.server != null) {
                    try {
                        this.server.close();
                    } catch (IOException e4) {
                        MDLog.printErrStackTrace(LogTag.CHANNEL, e4);
                    }
                }
                MDLog.m7395i(LogTag.CHANNEL, "ServerSocketThread end");
                throw th;
            }
        }
    }

    public void start(String str) throws Throwable {
        ServerThread serverThread = this.serverThread;
        if (serverThread != null) {
            serverThread.end();
            try {
                this.serverThread.join();
            } catch (InterruptedException e) {
                MDLog.printErrStackTrace(LogTag.CHANNEL, e);
            }
        }
        this.mAddress = str;
        ServerThread serverThread2 = new ServerThread("Push:LocalSocket");
        this.serverThread = serverThread2;
        serverThread2.start();
    }

    public void stop() throws Throwable {
        ServerThread serverThread = this.serverThread;
        if (serverThread != null) {
            serverThread.end();
            this.serverThread = null;
        }
    }
}
