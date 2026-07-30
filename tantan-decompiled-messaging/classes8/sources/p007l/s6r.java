package p007l;

import androidx.annotation.Nullable;
import com.p003p1.mobile.android.p005ui.label.LabelModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class s6r {

    /* JADX INFO: renamed from: b */
    public static s6r f4116b;

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, C0689a> f4117a = new HashMap<>();

    /* JADX INFO: renamed from: l.s6r$a */
    public static class C0689a {

        /* JADX INFO: renamed from: a */
        public HashMap<Integer, q6r> f4118a;

        /* JADX INFO: renamed from: b */
        public HashMap<ltl, q6r> f4119b;

        public C0689a() {
            this.f4118a = new HashMap<>();
            this.f4119b = new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: a */
    public static s6r m10624a() {
        if (f4116b == null) {
            synchronized (s6r.class) {
                try {
                    if (f4116b == null) {
                        f4116b = new s6r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4116b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public q6r m10625b(LabelModule labelModule, int i) {
        C0689a c0689a = this.f4117a.get(Integer.valueOf(labelModule.getModuleKey()));
        if (NullChecker.a(c0689a)) {
            return c0689a.f4118a.get(Integer.valueOf(i)).m10291a();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public q6r m10626c(LabelModule labelModule, ltl ltlVar) {
        C0689a c0689a = this.f4117a.get(Integer.valueOf(labelModule.getModuleKey()));
        if (NullChecker.a(c0689a)) {
            return c0689a.f4119b.get(ltlVar).m10291a();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m10627d(u6r u6rVar) {
        List<q6r> listM11201a = u6rVar.m11201a();
        if (vwb.J(listM11201a)) {
            return;
        }
        C0689a c0689a = new C0689a();
        for (q6r q6rVar : listM11201a) {
            c0689a.f4118a.put(Integer.valueOf(q6rVar.f3813f.labelIndex()), q6rVar);
            c0689a.f4119b.put(q6rVar.f3813f, q6rVar);
        }
        this.f4117a.put(Integer.valueOf(u6rVar.m11202b().getModuleKey()), c0689a);
    }
}
