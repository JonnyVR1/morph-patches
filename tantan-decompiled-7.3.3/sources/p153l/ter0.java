package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class ter0 {
    /* JADX INFO: renamed from: a */
    public static int m190891a(qer0 qer0Var, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iMo125315g = qer0Var.mo125315g(bArr, i + i3, i2 - i3);
            if (iMo125315g == -1) {
                break;
            }
            i3 += iMo125315g;
        }
        return i3;
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m190892b(boolean z, @Nullable String str) throws zzcc {
        if (!z) {
            throw zzcc.zza(str, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m190893c(qer0 qer0Var, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return qer0Var.mo125313c(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m190894d(qer0 qer0Var, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((fer0) qer0Var).mo125312b(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m190895e(qer0 qer0Var, int i) throws IOException {
        try {
            ((fer0) qer0Var).m125319k(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
