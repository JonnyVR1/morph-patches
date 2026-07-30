package p153l;

import com.heytap.mcssdk.mode.CommandMessage;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.spongycastle.crypto.tls.AlertDescription;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public final class kgg0 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final short[] f126601f = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, AlertDescription.unrecognized_name};

    /* JADX INFO: renamed from: g */
    public static final int[] f126602g = {16, 32, 48, 64, 81, 113, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, CommandMessage.COMMAND_SEND_INSTANT_ACK, 16409, 24601, 32794, CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: h */
    public static final int[] f126603h = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: i */
    public static final int[] f126604i;

    /* JADX INFO: renamed from: j */
    public static final int[] f126605j;

    /* JADX INFO: renamed from: c */
    public drg0 f126608c;

    /* JADX INFO: renamed from: d */
    public final InputStream f126609d;

    /* JADX INFO: renamed from: a */
    public boolean f126606a = false;

    /* JADX INFO: renamed from: e */
    public final ptg0 f126610e = new ptg0();

    /* JADX INFO: renamed from: b */
    public mng0 f126607b = new yzg0();

    static {
        int[] iArr = new int[288];
        f126604i = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f126605j = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public kgg0(InputStream inputStream) {
        this.f126608c = new drg0(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.f126609d = inputStream;
    }

    /* JADX INFO: renamed from: b */
    public static int m149744b(drg0 drg0Var, uqg0 uqg0Var) {
        while (uqg0Var != null && uqg0Var.f180454b == -1) {
            uqg0Var = m149745d(drg0Var, 1) == 0 ? uqg0Var.f180455c : uqg0Var.f180456d;
        }
        if (uqg0Var != null) {
            return uqg0Var.f180454b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static long m149745d(drg0 drg0Var, int i) throws EOFException {
        long bits = drg0Var.readBits(i);
        if (bits != -1) {
            return bits;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    /* JADX INFO: renamed from: e */
    public static uqg0 m149746e(int[] iArr) {
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
        uqg0 uqg0Var = new uqg0(0);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                uqg0 uqg0Var2 = uqg0Var;
                for (int i9 = i7; i9 >= 0; i9--) {
                    if (((1 << i9) & i8) == 0) {
                        if (uqg0Var2.f180455c == null && uqg0Var2.f180454b == -1) {
                            uqg0Var2.f180455c = new uqg0(uqg0Var2.f180453a + 1);
                        }
                        uqg0Var2 = uqg0Var2.f180455c;
                    } else {
                        if (uqg0Var2.f180456d == null && uqg0Var2.f180454b == -1) {
                            uqg0Var2.f180456d = new uqg0(uqg0Var2.f180453a + 1);
                        }
                        uqg0Var2 = uqg0Var2.f180456d;
                    }
                }
                uqg0Var2.f180454b = i5;
                uqg0Var2.f180455c = null;
                uqg0Var2.f180456d = null;
                iArr3[i7] = iArr3[i7] + 1;
            }
        }
        return uqg0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f126607b = new yzg0();
        this.f126608c = null;
    }
}
