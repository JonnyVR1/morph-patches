package p153l;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ysf0 {

    /* JADX INFO: renamed from: a */
    public static final Object f201395a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f201396b = new Object();

    /* JADX INFO: renamed from: c */
    @GuardedBy("valueLock")
    public static boolean f201397c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy("valueLock")
    public static long f201398d = 0;

    /* JADX INFO: renamed from: e */
    @GuardedBy("valueLock")
    public static String f201399e = "time.android.com";

    /* JADX INFO: renamed from: l.ysf0$b */
    public interface InterfaceC21673b {
        /* JADX INFO: renamed from: a */
        void mo11067a();

        /* JADX INFO: renamed from: b */
        void mo11068b(IOException iOException);
    }

    /* JADX INFO: renamed from: g */
    public static void m217246g(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            zpg0.m220844a("SNTP: Unsynchronized server");
            return;
        }
        if (b2 != 4 && b2 != 5) {
            p3r0.m170507a("SNTP: Untrusted mode: ", b2);
            return;
        }
        if (i == 0 || i > 15) {
            p3r0.m170507a("SNTP: Untrusted stratum: ", i);
        } else {
            if (j != 0) {
                return;
            }
            zpg0.m220844a("SNTP: Zero transmitTime");
        }
    }

    /* JADX INFO: renamed from: h */
    public static long m217247h() {
        long j;
        synchronized (f201396b) {
            try {
                j = f201397c ? f201398d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public static String m217248i() {
        String str;
        synchronized (f201396b) {
            str = f201399e;
        }
        return str;
    }

    /* JADX INFO: renamed from: j */
    public static void m217249j(@Nullable Loader loader, @Nullable InterfaceC21673b interfaceC21673b) {
        if (m217250k()) {
            if (interfaceC21673b != null) {
                interfaceC21673b.mo11067a();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.m12146n(new C21675d(), new C21674c(interfaceC21673b), 1);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m217250k() {
        boolean z;
        synchronized (f201396b) {
            z = f201397c;
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public static long m217251l() throws IOException {
        InetAddress byName = InetAddress.getByName(m217248i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m217254o(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b = bArr[0];
            int i = bArr[1] & 255;
            long jM217253n = m217253n(bArr, 24);
            long jM217253n2 = m217253n(bArr, 32);
            long jM217253n3 = m217253n(bArr, 40);
            m217246g((byte) ((b >> 6) & 3), (byte) (b & 7), i, jM217253n3);
            long j2 = (j + (((jM217253n2 - jM217253n) + (jM217253n3 - j)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m217252m(byte[] bArr, int i) {
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

    /* JADX INFO: renamed from: n */
    public static long m217253n(byte[] bArr, int i) {
        long jM217252m = m217252m(bArr, i);
        long jM217252m2 = m217252m(bArr, i + 4);
        if (jM217252m == 0 && jM217252m2 == 0) {
            return 0L;
        }
        return ((jM217252m - 2208988800L) * 1000) + ((jM217252m2 * 1000) / 4294967296L);
    }

    /* JADX INFO: renamed from: o */
    public static void m217254o(byte[] bArr, int i, long j) {
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

    /* JADX INFO: renamed from: l.ysf0$d */
    public static final class C21675d implements Loader.InterfaceC2067e {
        public C21675d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: a */
        public void mo11431a() throws IOException {
            synchronized (ysf0.f201395a) {
                synchronized (ysf0.f201396b) {
                    if (ysf0.f201397c) {
                        return;
                    }
                    long jM217251l = ysf0.m217251l();
                    synchronized (ysf0.f201396b) {
                        long unused = ysf0.f201398d = jM217251l;
                        boolean unused2 = ysf0.f201397c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
        /* JADX INFO: renamed from: c */
        public void mo11432c() {
        }
    }

    /* JADX INFO: renamed from: l.ysf0$c */
    public static final class C21674c implements Loader.InterfaceC2064b<Loader.InterfaceC2067e> {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final InterfaceC21673b f201400a;

        public C21674c(@Nullable InterfaceC21673b interfaceC21673b) {
            this.f201400a = interfaceC21673b;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: o */
        public void mo11079o(Loader.InterfaceC2067e interfaceC2067e, long j, long j2) {
            if (this.f201400a != null) {
                boolean zM217250k = ysf0.m217250k();
                InterfaceC21673b interfaceC21673b = this.f201400a;
                if (zM217250k) {
                    interfaceC21673b.mo11067a();
                } else {
                    interfaceC21673b.mo11068b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: q */
        public Loader.C2065c mo11080q(Loader.InterfaceC2067e interfaceC2067e, long j, long j2, IOException iOException, int i) {
            InterfaceC21673b interfaceC21673b = this.f201400a;
            if (interfaceC21673b != null) {
                interfaceC21673b.mo11068b(iOException);
            }
            return Loader.f9495f;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2064b
        /* JADX INFO: renamed from: n */
        public void mo11078n(Loader.InterfaceC2067e interfaceC2067e, long j, long j2, boolean z) {
        }
    }
}
