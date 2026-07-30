package p153l;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class r4k0 implements re00<URL, InputStream> {

    /* JADX INFO: renamed from: a */
    private final re00<e4k, InputStream> f161215a;

    /* JADX INFO: renamed from: l.r4k0$a */
    public static class C19761a implements se00<URL, InputStream> {
        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<URL, InputStream> mo101570b(qs10 qs10Var) {
            return new r4k0(qs10Var.m177716d(e4k.class, InputStream.class));
        }
    }

    public r4k0(re00<e4k, InputStream> re00Var) {
        this.f161215a = re00Var;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<InputStream> mo101565a(@NonNull URL url, int i, int i2, @NonNull u560 u560Var) {
        return this.f161215a.mo101565a(new e4k(url), i, i2, u560Var);
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull URL url) {
        return true;
    }
}
