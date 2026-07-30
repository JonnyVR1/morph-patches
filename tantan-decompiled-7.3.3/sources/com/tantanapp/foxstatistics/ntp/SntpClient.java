package com.tantanapp.foxstatistics.ntp;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class SntpClient {

    /* JADX INFO: renamed from: a */
    public long f56956a;

    /* JADX INFO: renamed from: b */
    public long f56957b;

    /* JADX INFO: renamed from: c */
    public long f56958c;

    public static class InvalidServerReplyException extends Exception {
        public InvalidServerReplyException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m82515a(byte b, byte b2, int i, long j) throws InvalidServerReplyException {
        if (b == 3) {
            throw new InvalidServerReplyException("unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new InvalidServerReplyException("untrusted mode: " + ((int) b2));
        }
        if (i == 0 || i > 15) {
            throw new InvalidServerReplyException("untrusted stratum: " + i);
        }
        if (j == 0) {
            throw new InvalidServerReplyException("zero transmitTime");
        }
    }

    /* JADX INFO: renamed from: b */
    public long m82516b() {
        return this.f56956a;
    }

    /* JADX INFO: renamed from: c */
    public long m82517c() {
        return this.f56957b;
    }

    /* JADX INFO: renamed from: d */
    public long m82518d() {
        return this.f56958c;
    }

    /* JADX INFO: renamed from: e */
    public final long m82519e(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* JADX INFO: renamed from: f */
    public final long m82520f(byte[] bArr, int i) {
        long jM82519e = m82519e(bArr, i);
        long jM82519e2 = m82519e(bArr, i + 4);
        if (jM82519e == 0 && jM82519e2 == 0) {
            return 0L;
        }
        return ((jM82519e - 2208988800L) * 1000) + ((jM82519e2 * 1000) / 4294967296L);
    }

    /* JADX INFO: renamed from: g */
    public boolean m82521g(String str, int i) {
        try {
            return m82522h(InetAddress.getByName(str), 123, i);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX INFO: renamed from: h */
    public boolean m82522h(InetAddress inetAddress, int i, int i2) throws Throwable {
        boolean z;
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2 = null;
        try {
            DatagramSocket datagramSocket3 = new DatagramSocket();
            try {
                try {
                    datagramSocket3.setSoTimeout(i2);
                    byte[] bArr = new byte[48];
                    DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, inetAddress, i);
                    bArr[0] = 27;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    m82523i(bArr, 40, jCurrentTimeMillis);
                    datagramSocket3.send(datagramPacket);
                    datagramSocket3.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = jElapsedRealtime2 - jElapsedRealtime;
                    long j2 = jCurrentTimeMillis + j;
                    byte b = bArr[0];
                    byte b2 = (byte) ((b >> 6) & 3);
                    byte b3 = (byte) (b & 7);
                    int i3 = bArr[1] & 255;
                    long jM82520f = m82520f(bArr, 24);
                    z = false;
                    try {
                        long jM82520f2 = m82520f(bArr, 32);
                        datagramSocket = datagramSocket3;
                        try {
                            long jM82520f3 = m82520f(bArr, 40);
                            m82515a(b2, b3, i3, jM82520f3);
                            this.f56956a = j2 + (((jM82520f2 - jM82520f) + (jM82520f3 - j2)) / 2);
                            this.f56957b = jElapsedRealtime2;
                            this.f56958c = j - (jM82520f3 - jM82520f2);
                            datagramSocket.close();
                            return true;
                        } catch (Exception unused) {
                            datagramSocket2 = datagramSocket;
                            if (datagramSocket2 != null) {
                                datagramSocket2.close();
                            }
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            datagramSocket2 = datagramSocket;
                            if (datagramSocket2 != null) {
                                datagramSocket2.close();
                            }
                            throw th;
                        }
                    } catch (Exception unused2) {
                        datagramSocket = datagramSocket3;
                        datagramSocket2 = datagramSocket;
                        if (datagramSocket2 != null) {
                            datagramSocket2.close();
                        }
                        return z;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    datagramSocket = datagramSocket3;
                }
            } catch (Exception unused3) {
                z = false;
            }
        } catch (Exception unused4) {
            z = false;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m82523i(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        bArr[i] = (byte) (j4 >> 24);
        bArr[i + 1] = (byte) (j4 >> 16);
        bArr[i + 2] = (byte) (j4 >> 8);
        bArr[i + 3] = (byte) j4;
        long j5 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j5 >> 24);
        bArr[i + 5] = (byte) (j5 >> 16);
        bArr[i + 6] = (byte) (j5 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }
}
