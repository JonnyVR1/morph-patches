package p149l;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class pw5 {

    /* JADX INFO: renamed from: a */
    public final boolean f151535a;

    /* JADX INFO: renamed from: b */
    public final int f151536b;

    /* JADX INFO: renamed from: l.pw5$a */
    public static class C19350a {

        /* JADX INFO: renamed from: b */
        public final Context f151538b;

        /* JADX INFO: renamed from: d */
        public boolean f151540d;

        /* JADX INFO: renamed from: a */
        public final List f151537a = new ArrayList();

        /* JADX INFO: renamed from: c */
        public int f151539c = 0;

        public C19350a(@RecentlyNonNull Context context) {
            this.f151538b = context.getApplicationContext();
        }

        @RecentlyNonNull
        /* JADX INFO: renamed from: a */
        public pw5 m171707a() {
            boolean z = true;
            if (!yht0.m214843a(true) && !this.f151537a.contains(v7t0.m197386a(this.f151538b)) && !this.f151540d) {
                z = false;
            }
            return new pw5(z, this, null);
        }
    }

    public /* synthetic */ pw5(boolean z, C19350a c19350a, v0r0 v0r0Var) {
        this.f151535a = z;
        this.f151536b = c19350a.f151539c;
    }

    /* JADX INFO: renamed from: a */
    public int m171704a() {
        return this.f151536b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m171705b() {
        return this.f151535a;
    }
}
