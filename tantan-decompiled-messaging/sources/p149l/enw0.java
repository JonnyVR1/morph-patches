package p149l;

import com.google.android.gms.internal.ads.C2285x4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class enw0 {

    /* JADX INFO: renamed from: a */
    public final InputStream f92341a;

    public enw0(InputStream inputStream) {
        this.f92341a = inputStream;
    }

    /* JADX INFO: renamed from: b */
    public static enw0 m117297b(byte[] bArr) {
        return new enw0(new ByteArrayInputStream(bArr));
    }

    /* JADX INFO: renamed from: a */
    public final C2285x4 m117298a() throws IOException {
        try {
            return C2285x4.m13454Q(this.f92341a, d8x0.m110397a());
        } finally {
            this.f92341a.close();
        }
    }
}
