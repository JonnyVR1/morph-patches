package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.android.p053ui.label.LabelModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class t8r {

    /* JADX INFO: renamed from: b */
    public static t8r f172565b;

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, C20258a> f172566a = new HashMap<>();

    /* JADX INFO: renamed from: l.t8r$a */
    public static class C20258a {

        /* JADX INFO: renamed from: a */
        public HashMap<Integer, r8r> f172567a;

        /* JADX INFO: renamed from: b */
        public HashMap<zvl, r8r> f172568b;

        public C20258a() {
            this.f172567a = new HashMap<>();
            this.f172568b = new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: a */
    public static t8r m189686a() {
        if (f172565b == null) {
            synchronized (t8r.class) {
                try {
                    if (f172565b == null) {
                        f172565b = new t8r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f172565b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public r8r m189687b(LabelModule labelModule, int i) {
        C20258a c20258a = this.f172566a.get(Integer.valueOf(labelModule.getModuleKey()));
        if (NullChecker.m82486a(c20258a)) {
            return c20258a.f172567a.get(Integer.valueOf(i)).m180237a();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public r8r m189688c(LabelModule labelModule, zvl zvlVar) {
        C20258a c20258a = this.f172566a.get(Integer.valueOf(labelModule.getModuleKey()));
        if (NullChecker.m82486a(c20258a)) {
            return c20258a.f172568b.get(zvlVar).m180237a();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m189689d(v8r v8rVar) {
        List<r8r> listMo158014a = v8rVar.mo158014a();
        if (jyb.m147479J(listMo158014a)) {
            return;
        }
        C20258a c20258a = new C20258a();
        for (r8r r8rVar : listMo158014a) {
            c20258a.f172567a.put(Integer.valueOf(r8rVar.f161755f.labelIndex()), r8rVar);
            c20258a.f172568b.put(r8rVar.f161755f, r8rVar);
        }
        this.f172566a.put(Integer.valueOf(v8rVar.mo158015b().getModuleKey()), c20258a);
    }
}
