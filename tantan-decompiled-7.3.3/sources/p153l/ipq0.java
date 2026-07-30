package p153l;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class ipq0 {

    /* JADX INFO: renamed from: a */
    public C22508b<C17768b> f116296a;

    /* JADX INFO: renamed from: l.ipq0$a */
    public static class C17767a {

        /* JADX INFO: renamed from: a */
        public static final ipq0 f116297a = new ipq0();
    }

    /* JADX INFO: renamed from: l.ipq0$b */
    public static final class C17768b {

        /* JADX INFO: renamed from: a */
        public final String f116298a = "ZhiMaAuthData: statusCode = %d,uri = %s";

        /* JADX INFO: renamed from: b */
        public final int f116299b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Uri f116300c;

        public C17768b(int i, @Nullable Uri uri) {
            this.f116299b = i;
            this.f116300c = uri;
        }

        @NonNull
        public String toString() {
            Integer numValueOf = Integer.valueOf(this.f116299b);
            Uri uri = this.f116300c;
            return String.format("ZhiMaAuthData: statusCode = %d,uri = %s", numValueOf, uri == null ? "null" : uri.toString());
        }
    }

    public ipq0() {
        this.f116296a = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: a */
    public static C22421c<C17768b> m141535a() {
        return C17767a.f116297a.f116296a.asObservable();
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<Boolean> m141536b(String str) {
        return uqb0.f180397c0.mo105283C3(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m141537c(int i, Uri uri) {
        C17768b c17768b = new C17768b(i, uri);
        C17767a.f116297a.f116296a.m137019l(c17768b);
        fhw.m125605a("[putong-common][zhimaauth]", "ZhiMaAuthBus post value " + c17768b.toString());
    }
}
