package p149l;

import com.google.android.gms.internal.ads.C2200n;
import com.google.android.gms.internal.ads.C2240s;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class mrr0 {

    /* JADX INFO: renamed from: a */
    public static boolean f135403a = false;

    /* JADX INFO: renamed from: b */
    public static MessageDigest f135404b;

    /* JADX INFO: renamed from: c */
    public static final Object f135405c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f135406d = new Object();

    /* JADX INFO: renamed from: e */
    public static final CountDownLatch f135407e = new CountDownLatch(1);

    /* JADX INFO: renamed from: a */
    public static String m156072a(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrM156078g;
        Vector vectorM156073b = m156073b(bArr, 255);
        if (vectorM156073b == null || vectorM156073b.isEmpty()) {
            bArrM156078g = m156078g(m156077f(4096).m12744h(), str, true);
        } else {
            frr0 frr0VarM13246L = C2240s.m13246L();
            int size = vectorM156073b.size();
            for (int i = 0; i < size; i++) {
                frr0VarM13246L.m122896q(zzgyl.zzv(m156078g((byte[]) vectorM156073b.get(i), str, false), 0, 256));
            }
            byte[] bArrM156076e = m156076e(bArr);
            zzgyl zzgylVar = zzgyl.zzb;
            frr0VarM13246L.m122897r(zzgyl.zzv(bArrM156076e, 0, bArrM156076e.length));
            bArrM156078g = ((C2240s) frr0VarM13246L.m153521m()).m12744h();
        }
        return irr0.m137915a(bArrM156078g, true);
    }

    /* JADX INFO: renamed from: b */
    public static Vector m156073b(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* JADX INFO: renamed from: d */
    public static void m156075d() {
        synchronized (f135406d) {
            try {
                if (!f135403a) {
                    f135403a = true;
                    new Thread(new lrr0(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m156076e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f135405c) {
            try {
                m156075d();
                MessageDigest messageDigest2 = null;
                try {
                    if (f135407e.await(2L, TimeUnit.SECONDS) && (messageDigest = f135404b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f135404b.digest();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    /* JADX INFO: renamed from: f */
    public static C2200n m156077f(int i) {
        zpr0 zpr0VarM12983l0 = C2200n.m12983l0();
        zpr0VarM12983l0.m219786t(4096L);
        return (C2200n) zpr0VarM12983l0.m153521m();
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m156078g(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = m156077f(4096).m12744h();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(m156076e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        nrr0[] nrr0VarArr = new usr0().f178032G2;
        int length3 = nrr0VarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            nrr0VarArr[i3].mo98601a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new grr0(str.getBytes("UTF-8")).m127764a(bArr3);
        }
        return bArr3;
    }
}
