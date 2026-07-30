package p149l;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class vwj0<Data> implements i600<Uri, Data> {

    /* JADX INFO: renamed from: b */
    private static final Set<String> f183350b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    private final i600<n1k, Data> f183351a;

    /* JADX INFO: renamed from: l.vwj0$a */
    public static class C20748a implements j600<Uri, InputStream> {
        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, InputStream> mo103357b(gk10 gk10Var) {
            return new vwj0(gk10Var.m126584d(n1k.class, InputStream.class));
        }
    }

    public vwj0(i600<n1k, Data> i600Var) {
        this.f183351a = i600Var;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<Data> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        return this.f183351a.mo103352a(new n1k(uri.toString()), i, i2, px50Var);
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return f183350b.contains(uri.getScheme());
    }
}
