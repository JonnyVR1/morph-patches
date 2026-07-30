package p149l;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class dgq0 {

    /* JADX INFO: renamed from: a */
    public C22393b<C16368b> f86156a;

    /* JADX INFO: renamed from: l.dgq0$a */
    public static class C16367a {

        /* JADX INFO: renamed from: a */
        public static final dgq0 f86157a = new dgq0();
    }

    /* JADX INFO: renamed from: l.dgq0$b */
    public static final class C16368b {

        /* JADX INFO: renamed from: a */
        public final String f86158a = "ZhiMaAuthData: statusCode = %d,uri = %s";

        /* JADX INFO: renamed from: b */
        public final int f86159b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Uri f86160c;

        public C16368b(int i, @Nullable Uri uri) {
            this.f86159b = i;
            this.f86160c = uri;
        }

        @NonNull
        public String toString() {
            Integer numValueOf = Integer.valueOf(this.f86159b);
            Uri uri = this.f86160c;
            return String.format("ZhiMaAuthData: statusCode = %d,uri = %s", numValueOf, uri == null ? "null" : uri.toString());
        }
    }

    public dgq0() {
        this.f86156a = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: a */
    public static C22306c<C16368b> m111730a() {
        return C16367a.f86157a.f86156a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<Boolean> m111731b(String str) {
        return qib0.f154714c0.mo97494C3(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m111732c(int i, Uri uri) {
        C16368b c16368b = new C16368b(i, uri);
        C16367a.f86157a.f86156a.m132487l(c16368b);
        hfw.m130790a("[putong-common][zhimaauth]", "ZhiMaAuthBus post value " + c16368b.toString());
    }
}
