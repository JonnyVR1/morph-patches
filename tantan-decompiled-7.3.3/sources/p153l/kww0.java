package p153l;

import com.google.android.gms.internal.ads.C2308x4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class kww0 {

    /* JADX INFO: renamed from: a */
    public final InputStream f129097a;

    public kww0(InputStream inputStream) {
        this.f129097a = inputStream;
    }

    /* JADX INFO: renamed from: b */
    public static kww0 m151743b(byte[] bArr) {
        return new kww0(new ByteArrayInputStream(bArr));
    }

    /* JADX INFO: renamed from: a */
    public final C2308x4 m151744a() throws IOException {
        try {
            return C2308x4.m13508Q(this.f129097a, jhx0.m144944a());
        } finally {
            this.f129097a.close();
        }
    }
}
