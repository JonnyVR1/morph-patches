package com.cosmos.photon.push.channel.inner;

import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.momo.xeengine.gift.XEGiftErrorCode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class ClientWorker {
    private static final Object lock = new Object();
    private static volatile String sPackageName;

    public static void onReceiver(String str) {
        MDLog.m7396i(LogTag.CHANNEL, "query by Receiver：%s", str);
        Object obj = lock;
        synchronized (obj) {
            try {
                sPackageName = str;
                obj.notify();
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.CHANNEL, e);
            }
        }
    }

    public static boolean sendMessage(final String str, final String str2, int i, final StringBuilder sb) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        Thread thread = new Thread("Push:ChannelBridge") { // from class: com.cosmos.photon.push.channel.inner.ClientWorker.1
            /* JADX WARN: Code duplicated, block: B:103:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:77:0x0127 A[Catch: Exception -> 0x0123, TryCatch #15 {Exception -> 0x0123, blocks: (B:73:0x011f, B:77:0x0127, B:79:0x012c), top: B:103:0x011f }] */
            /* JADX WARN: Code duplicated, block: B:79:0x012c A[Catch: Exception -> 0x0123, TRY_LEAVE, TryCatch #15 {Exception -> 0x0123, blocks: (B:73:0x011f, B:77:0x0127, B:79:0x012c), top: B:103:0x011f }] */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws Throwable {
                PrintWriter printWriter;
                BufferedReader bufferedReader;
                Exception e;
                LocalSocket localSocket;
                LocalSocket localSocket2 = null;
                try {
                    try {
                        localSocket = new LocalSocket();
                        try {
                            localSocket.connect(new LocalSocketAddress(str));
                            localSocket.setSoTimeout(1000);
                            MDLog.m7396i(LogTag.CHANNEL, "send:-------->\n %s", str2);
                            printWriter = new PrintWriter(localSocket.getOutputStream());
                            try {
                                printWriter.println(str2);
                                printWriter.flush();
                                bufferedReader = new BufferedReader(new InputStreamReader(localSocket.getInputStream()));
                                try {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (!TextUtils.isEmpty(line)) {
                                            sb.append(line);
                                        }
                                        atomicBoolean.set(true);
                                        reentrantLock.lock();
                                        try {
                                            conditionNewCondition.signalAll();
                                        } catch (Throwable th) {
                                            try {
                                                MDLog.printErrStackTrace(LogTag.CHANNEL, th);
                                            } catch (Throwable th2) {
                                                reentrantLock.unlock();
                                                throw th2;
                                            }
                                        }
                                        reentrantLock.unlock();
                                        localSocket.close();
                                        printWriter.close();
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (XEGiftErrorCode.ERROR_MSG_PERMISSION_DENIED.equals(e.getMessage()) || "already connected".equals(e.getMessage())) {
                                            atomicBoolean.set(false);
                                        } else if ("Connection refused".equals(e.getMessage())) {
                                            atomicBoolean.set(true);
                                        }
                                        MDLog.m7391e(LogTag.CHANNEL, e.getMessage());
                                        reentrantLock.lock();
                                        try {
                                            conditionNewCondition.signalAll();
                                        } catch (Throwable th3) {
                                            try {
                                                MDLog.printErrStackTrace(LogTag.CHANNEL, th3);
                                            } catch (Throwable th4) {
                                                reentrantLock.unlock();
                                                throw th4;
                                            }
                                        }
                                        reentrantLock.unlock();
                                        if (localSocket != null) {
                                            localSocket.close();
                                        }
                                        if (printWriter != null) {
                                            printWriter.close();
                                        }
                                        if (bufferedReader == null) {
                                            return;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    localSocket2 = localSocket;
                                    reentrantLock.lock();
                                    try {
                                        conditionNewCondition.signalAll();
                                    } catch (Throwable th6) {
                                        try {
                                            MDLog.printErrStackTrace(LogTag.CHANNEL, th6);
                                        } catch (Throwable th7) {
                                            reentrantLock.unlock();
                                            throw th7;
                                        }
                                    }
                                    reentrantLock.unlock();
                                    if (localSocket2 != null) {
                                        try {
                                            localSocket2.close();
                                        } catch (Exception e3) {
                                            MDLog.printErrStackTrace(LogTag.CHANNEL, e3);
                                            throw th;
                                        }
                                    }
                                    if (printWriter != null) {
                                        printWriter.close();
                                    }
                                    if (bufferedReader == null) {
                                        throw th;
                                    }
                                    bufferedReader.close();
                                    throw th;
                                }
                            } catch (Exception e4) {
                                bufferedReader = null;
                                e = e4;
                            } catch (Throwable th8) {
                                th = th8;
                                bufferedReader = null;
                                localSocket2 = localSocket;
                                reentrantLock.lock();
                                conditionNewCondition.signalAll();
                                reentrantLock.unlock();
                                if (localSocket2 != null) {
                                    localSocket2.close();
                                }
                                if (printWriter != null) {
                                    printWriter.close();
                                }
                                if (bufferedReader == null) {
                                    throw th;
                                }
                                bufferedReader.close();
                                throw th;
                            }
                        } catch (Exception e5) {
                            bufferedReader = null;
                            e = e5;
                            printWriter = null;
                        } catch (Throwable th9) {
                            th = th9;
                            printWriter = null;
                            bufferedReader = null;
                        }
                    } catch (Exception e6) {
                        MDLog.printErrStackTrace(LogTag.CHANNEL, e6);
                        return;
                    }
                } catch (Exception e7) {
                    printWriter = null;
                    bufferedReader = null;
                    e = e7;
                    localSocket = null;
                } catch (Throwable th10) {
                    th = th10;
                    printWriter = null;
                    bufferedReader = null;
                    reentrantLock.lock();
                    conditionNewCondition.signalAll();
                    reentrantLock.unlock();
                    if (localSocket2 != null) {
                        localSocket2.close();
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    if (bufferedReader == null) {
                        throw th;
                    }
                    bufferedReader.close();
                    throw th;
                }
                bufferedReader.close();
            }
        };
        reentrantLock.lock();
        thread.start();
        try {
            conditionNewCondition.await(i, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            try {
                MDLog.printErrStackTrace(LogTag.CHANNEL, th);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        reentrantLock.unlock();
        boolean z = atomicBoolean.get();
        if (!z) {
            thread.interrupt();
        }
        MDLog.m7396i(LogTag.CHANNEL, "query by LocalSocket：%s", sb);
        return z;
    }

    public static String sendMessageByBR(String str, int i) {
        MDLog.m7396i(LogTag.CHANNEL, "sendMessageByBR：%d", Integer.valueOf(i));
        Object obj = lock;
        synchronized (obj) {
            ReceiverChannel.sendChannelRequest(str);
            try {
                sPackageName = null;
                obj.wait(i);
            } catch (Throwable th) {
                MDLog.printErrStackTrace(LogTag.CHANNEL, th);
            }
        }
        if (TextUtils.isEmpty(sPackageName)) {
            return null;
        }
        return sPackageName;
    }

    public static String sendMessageByFile(String str) {
        String config = FileChannel.readConfig(str);
        MDLog.m7396i(LogTag.CHANNEL, "query by file：%s", config);
        return config;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[Catch: Exception -> 0x005f, TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:30:0x005b, B:34:0x0063), top: B:38:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void sendSimpleMessage(String str, String str2) throws Throwable {
        PrintWriter printWriter;
        LocalSocket localSocket = null;
        try {
            try {
                LocalSocket localSocket2 = new LocalSocket();
                try {
                    localSocket2.connect(new LocalSocketAddress(str));
                    localSocket2.setSoTimeout(1000);
                    MDLog.m7396i(LogTag.CHANNEL, "simple send:-------->\n %s", str2);
                    printWriter = new PrintWriter(localSocket2.getOutputStream());
                    try {
                        printWriter.println(str2);
                        printWriter.flush();
                        localSocket2.close();
                        printWriter.close();
                    } catch (Exception e) {
                        e = e;
                        localSocket = localSocket2;
                        try {
                            MDLog.printErrStackTrace(LogTag.CHANNEL, e);
                            if (localSocket != null) {
                                localSocket.close();
                            }
                            if (printWriter != null) {
                                printWriter.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (localSocket != null) {
                                try {
                                    localSocket.close();
                                    if (printWriter != null) {
                                        printWriter.close();
                                    }
                                } catch (Exception e2) {
                                    MDLog.printErrStackTrace(LogTag.CHANNEL, e2);
                                    throw th;
                                }
                            } else if (printWriter != null) {
                                printWriter.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        localSocket = localSocket2;
                        if (localSocket != null) {
                            localSocket.close();
                            if (printWriter != null) {
                                printWriter.close();
                            }
                        } else if (printWriter != null) {
                            printWriter.close();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    printWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    printWriter = null;
                }
            } catch (Exception e4) {
                MDLog.printErrStackTrace(LogTag.CHANNEL, e4);
            }
        } catch (Exception e5) {
            e = e5;
            printWriter = null;
        } catch (Throwable th4) {
            th = th4;
            printWriter = null;
        }
    }
}
