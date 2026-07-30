package p149l;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ykl implements i600<Uri, InputStream> {

    /* JADX INFO: renamed from: b */
    private static final Set<String> f198772b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    private final i600<n1k, InputStream> f198773a;

    /* JADX INFO: renamed from: l.ykl$a */
    public static class C21425a implements j600<Uri, InputStream> {
        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, InputStream> mo103357b(gk10 gk10Var) {
            return new ykl(gk10Var.m126584d(n1k.class, InputStream.class));
        }
    }

    public ykl(i600<n1k, InputStream> i600Var) {
        this.f198773a = i600Var;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<InputStream> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        return this.f198773a.mo103352a(new n1k(uri.toString()), i, i2, px50Var);
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return f198772b.contains(uri.getScheme());
    }
}
