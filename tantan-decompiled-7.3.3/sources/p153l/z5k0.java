package p153l;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class z5k0<Data> implements re00<Uri, Data> {

    /* JADX INFO: renamed from: b */
    private static final Set<String> f203065b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a */
    private final re00<e4k, Data> f203066a;

    /* JADX INFO: renamed from: l.z5k0$a */
    public static class C21767a implements se00<Uri, InputStream> {
        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, InputStream> mo101570b(qs10 qs10Var) {
            return new z5k0(qs10Var.m177716d(e4k.class, InputStream.class));
        }
    }

    public z5k0(re00<e4k, Data> re00Var) {
        this.f203066a = re00Var;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<Data> mo101565a(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        return this.f203066a.mo101565a(new e4k(uri.toString()), i, i2, u560Var);
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Uri uri) {
        return f203065b.contains(uri.getScheme());
    }
}
