package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vqf {
    @Pure
    /* JADX INFO: renamed from: a */
    public static void m199482a(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m199483b(tqf tqfVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return tqfVar.mo150656g(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m199484c(tqf tqfVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iMo150654d = tqfVar.mo150654d(bArr, i + i3, i2 - i3);
            if (iMo150654d == -1) {
                break;
            }
            i3 += iMo150654d;
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m199485d(tqf tqfVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            tqfVar.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m199486e(tqf tqfVar, int i) throws IOException {
        try {
            tqfVar.mo150661o(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
