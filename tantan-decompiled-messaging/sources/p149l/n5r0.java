package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class n5r0 {
    /* JADX INFO: renamed from: a */
    public static int m157995a(k5r0 k5r0Var, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iMo140053g = k5r0Var.mo140053g(bArr, i + i3, i2 - i3);
            if (iMo140053g == -1) {
                break;
            }
            i3 += iMo140053g;
        }
        return i3;
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m157996b(boolean z, @Nullable String str) throws zzcc {
        if (!z) {
            throw zzcc.zza(str, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m157997c(k5r0 k5r0Var, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return k5r0Var.mo140051c(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m157998d(k5r0 k5r0Var, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((z4r0) k5r0Var).mo140050b(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m157999e(k5r0 k5r0Var, int i) throws IOException {
        try {
            ((z4r0) k5r0Var).m217119k(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
