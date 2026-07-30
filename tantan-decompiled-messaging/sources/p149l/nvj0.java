package p149l;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class nvj0 implements i600<URL, InputStream> {

    /* JADX INFO: renamed from: a */
    private final i600<n1k, InputStream> f140772a;

    /* JADX INFO: renamed from: l.nvj0$a */
    public static class C18784a implements j600<URL, InputStream> {
        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<URL, InputStream> mo103357b(gk10 gk10Var) {
            return new nvj0(gk10Var.m126584d(n1k.class, InputStream.class));
        }
    }

    public nvj0(i600<n1k, InputStream> i600Var) {
        this.f140772a = i600Var;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<InputStream> mo103352a(@NonNull URL url, int i, int i2, @NonNull px50 px50Var) {
        return this.f140772a.mo103352a(new n1k(url), i, i2, px50Var);
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull URL url) {
        return true;
    }
}
