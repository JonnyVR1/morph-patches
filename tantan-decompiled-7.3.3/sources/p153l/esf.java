package p153l;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface esf {

    /* JADX INFO: renamed from: a */
    public static final esf f95592a = new esf() { // from class: l.dsf
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return esf.m122321c();
        }
    };

    /* JADX INFO: renamed from: c */
    static /* synthetic */ zrf[] m122321c() {
        return new zrf[0];
    }

    /* JADX INFO: renamed from: a */
    default zrf[] mo122322a(Uri uri, Map<String, List<String>> map) {
        return mo96504b();
    }

    /* JADX INFO: renamed from: b */
    zrf[] mo96504b();
}
