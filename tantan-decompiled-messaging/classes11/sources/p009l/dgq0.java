package p009l;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.hfw;
import l.qib0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dgq0 {

    /* JADX INFO: renamed from: a */
    public b<C0850b> f11833a;

    /* JADX INFO: renamed from: l.dgq0$a */
    public static class C0849a {

        /* JADX INFO: renamed from: a */
        public static final dgq0 f11834a = new dgq0();
    }

    /* JADX INFO: renamed from: l.dgq0$b */
    public static final class C0850b {

        /* JADX INFO: renamed from: a */
        public final String f11835a = "ZhiMaAuthData: statusCode = %d,uri = %s";

        /* JADX INFO: renamed from: b */
        public final int f11836b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Uri f11837c;

        public C0850b(int i, @Nullable Uri uri) {
            this.f11836b = i;
            this.f11837c = uri;
        }

        @NonNull
        public String toString() {
            Integer numValueOf = Integer.valueOf(this.f11836b);
            Uri uri = this.f11837c;
            return String.format("ZhiMaAuthData: statusCode = %d,uri = %s", numValueOf, uri == null ? "null" : uri.toString());
        }
    }

    public dgq0() {
        this.f11833a = b.b();
    }

    /* JADX INFO: renamed from: a */
    public static c<C0850b> m13343a() {
        return C0849a.f11834a.f11833a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static c<Boolean> m13344b(String str) {
        return qib0.c0.C3(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m13345c(int i, Uri uri) {
        C0850b c0850b = new C0850b(i, uri);
        C0849a.f11834a.f11833a.onNext(c0850b);
        hfw.a("[putong-common][zhimaauth]", "ZhiMaAuthBus post value " + c0850b.toString());
    }
}
