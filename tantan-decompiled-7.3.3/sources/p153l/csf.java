package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class csf {
    @Pure
    /* JADX INFO: renamed from: a */
    public static void m112176a(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m112177b(asf asfVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return asfVar.mo99901g(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m112178c(asf asfVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iMo99899c = asfVar.mo99899c(bArr, i + i3, i2 - i3);
            if (iMo99899c == -1) {
                break;
            }
            i3 += iMo99899c;
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m112179d(asf asfVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            asfVar.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m112180e(asf asfVar, int i) throws IOException {
        try {
            asfVar.mo99905o(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
