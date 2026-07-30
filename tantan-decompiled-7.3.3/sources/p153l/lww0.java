package p153l;

import com.google.android.gms.internal.ads.C2308x4;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class lww0 {

    /* JADX INFO: renamed from: a */
    public final OutputStream f133868a;

    public lww0(OutputStream outputStream) {
        this.f133868a = outputStream;
    }

    /* JADX INFO: renamed from: b */
    public static lww0 m156127b(OutputStream outputStream) {
        return new lww0(outputStream);
    }

    /* JADX INFO: renamed from: a */
    public final void m156128a(C2308x4 c2308x4) throws IOException {
        try {
            c2308x4.m12797g(this.f133868a);
        } finally {
            this.f133868a.close();
        }
    }
}
