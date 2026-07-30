package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.android.p048ui.label.LabelModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class s6r {

    /* JADX INFO: renamed from: b */
    public static s6r f162843b;

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, C19865a> f162844a = new HashMap<>();

    /* JADX INFO: renamed from: l.s6r$a */
    public static class C19865a {

        /* JADX INFO: renamed from: a */
        public HashMap<Integer, q6r> f162845a;

        /* JADX INFO: renamed from: b */
        public HashMap<ltl, q6r> f162846b;

        public C19865a() {
            this.f162845a = new HashMap<>();
            this.f162846b = new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: a */
    public static s6r m182454a() {
        if (f162843b == null) {
            synchronized (s6r.class) {
                try {
                    if (f162843b == null) {
                        f162843b = new s6r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f162843b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public q6r m182455b(LabelModule labelModule, int i) {
        C19865a c19865a = this.f162844a.get(Integer.valueOf(labelModule.getModuleKey()));
        if (NullChecker.m81303a(c19865a)) {
            return c19865a.f162845a.get(Integer.valueOf(i)).m173148a();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public q6r m182456c(LabelModule labelModule, ltl ltlVar) {
        C19865a c19865a = this.f162844a.get(Integer.valueOf(labelModule.getModuleKey()));
        if (NullChecker.m81303a(c19865a)) {
            return c19865a.f162846b.get(ltlVar).m173148a();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m182457d(u6r u6rVar) {
        List<q6r> listMo110997a = u6rVar.mo110997a();
        if (vwb.m200296J(listMo110997a)) {
            return;
        }
        C19865a c19865a = new C19865a();
        for (q6r q6rVar : listMo110997a) {
            c19865a.f162845a.put(Integer.valueOf(q6rVar.f152940f.labelIndex()), q6rVar);
            c19865a.f162846b.put(q6rVar.f152940f, q6rVar);
        }
        this.f162844a.put(Integer.valueOf(u6rVar.mo110998b().getModuleKey()), c19865a);
    }
}
