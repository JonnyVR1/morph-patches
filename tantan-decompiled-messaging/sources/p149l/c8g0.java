package p149l;

import com.heytap.mcssdk.mode.CommandMessage;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.spongycastle.crypto.tls.AlertDescription;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public final class c8g0 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final short[] f79757f = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, AlertDescription.unrecognized_name};

    /* JADX INFO: renamed from: g */
    public static final int[] f79758g = {16, 32, 48, 64, 81, 113, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, CommandMessage.COMMAND_SEND_INSTANT_ACK, 16409, 24601, 32794, CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: h */
    public static final int[] f79759h = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: i */
    public static final int[] f79760i;

    /* JADX INFO: renamed from: j */
    public static final int[] f79761j;

    /* JADX INFO: renamed from: c */
    public vig0 f79764c;

    /* JADX INFO: renamed from: d */
    public final InputStream f79765d;

    /* JADX INFO: renamed from: a */
    public boolean f79762a = false;

    /* JADX INFO: renamed from: e */
    public final hlg0 f79766e = new hlg0();

    /* JADX INFO: renamed from: b */
    public efg0 f79763b = new qrg0();

    static {
        int[] iArr = new int[288];
        f79760i = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f79761j = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public c8g0(InputStream inputStream) {
        this.f79764c = new vig0(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.f79765d = inputStream;
    }

    /* JADX INFO: renamed from: b */
    public static int m105794b(vig0 vig0Var, mig0 mig0Var) {
        while (mig0Var != null && mig0Var.f133970b == -1) {
            mig0Var = m105795d(vig0Var, 1) == 0 ? mig0Var.f133971c : mig0Var.f133972d;
        }
        if (mig0Var != null) {
            return mig0Var.f133970b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static long m105795d(vig0 vig0Var, int i) throws EOFException {
        long bits = vig0Var.readBits(i);
        if (bits != -1) {
            return bits;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    /* JADX INFO: renamed from: e */
    public static mig0 m105796e(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        mig0 mig0Var = new mig0(0);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                mig0 mig0Var2 = mig0Var;
                for (int i9 = i7; i9 >= 0; i9--) {
                    if (((1 << i9) & i8) == 0) {
                        if (mig0Var2.f133971c == null && mig0Var2.f133970b == -1) {
                            mig0Var2.f133971c = new mig0(mig0Var2.f133969a + 1);
                        }
                        mig0Var2 = mig0Var2.f133971c;
                    } else {
                        if (mig0Var2.f133972d == null && mig0Var2.f133970b == -1) {
                            mig0Var2.f133972d = new mig0(mig0Var2.f133969a + 1);
                        }
                        mig0Var2 = mig0Var2.f133972d;
                    }
                }
                mig0Var2.f133970b = i5;
                mig0Var2.f133971c = null;
                mig0Var2.f133972d = null;
                iArr3[i7] = iArr3[i7] + 1;
            }
        }
        return mig0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f79763b = new qrg0();
        this.f79764c = null;
    }
}
