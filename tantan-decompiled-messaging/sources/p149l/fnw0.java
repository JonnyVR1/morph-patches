package p149l;

import com.google.android.gms.internal.ads.C2285x4;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class fnw0 {

    /* JADX INFO: renamed from: a */
    public final OutputStream f98478a;

    public fnw0(OutputStream outputStream) {
        this.f98478a = outputStream;
    }

    /* JADX INFO: renamed from: b */
    public static fnw0 m122385b(OutputStream outputStream) {
        return new fnw0(outputStream);
    }

    /* JADX INFO: renamed from: a */
    public final void m122386a(C2285x4 c2285x4) throws IOException {
        try {
            c2285x4.m12743g(this.f98478a);
        } finally {
            this.f98478a.close();
        }
    }
}
