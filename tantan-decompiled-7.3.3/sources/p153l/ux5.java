package p153l;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ux5 {

    /* JADX INFO: renamed from: a */
    public final boolean f181343a;

    /* JADX INFO: renamed from: b */
    public final int f181344b;

    /* JADX INFO: renamed from: l.ux5$a */
    public static class C20689a {

        /* JADX INFO: renamed from: b */
        public final Context f181346b;

        /* JADX INFO: renamed from: d */
        public boolean f181348d;

        /* JADX INFO: renamed from: a */
        public final List f181345a = new ArrayList();

        /* JADX INFO: renamed from: c */
        public int f181347c = 0;

        public C20689a(@RecentlyNonNull Context context) {
            this.f181346b = context.getApplicationContext();
        }

        @RecentlyNonNull
        /* JADX INFO: renamed from: a */
        public ux5 m198401a() {
            boolean z = true;
            if (!ert0.m122288a(true) && !this.f181345a.contains(bht0.m104368a(this.f181346b)) && !this.f181348d) {
                z = false;
            }
            return new ux5(z, this, null);
        }
    }

    public /* synthetic */ ux5(boolean z, C20689a c20689a, bar0 bar0Var) {
        this.f181343a = z;
        this.f181344b = c20689a.f181347c;
    }

    /* JADX INFO: renamed from: a */
    public int m198398a() {
        return this.f181344b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m198399b() {
        return this.f181343a;
    }
}
