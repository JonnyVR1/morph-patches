package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class q5k0 {

    /* JADX INFO: renamed from: c */
    public static q5k0 f152781c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, j760<Boolean, IdealInfo>> f152782a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public C22392a<j760<String, j760<Boolean, IdealInfo>>> f152783b = C22392a.m221512b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ j760 m173032c(j760 j760Var) {
        return (j760) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: g */
    public static q5k0 m173035g() {
        if (f152781c == null) {
            synchronized (q5k0.class) {
                try {
                    if (f152781c == null) {
                        f152781c = new q5k0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f152781c;
    }

    /* JADX INFO: renamed from: l */
    public static void m173036l() {
        f152781c = null;
    }

    /* JADX INFO: renamed from: f */
    public C22306c<j760<Boolean, IdealInfo>> m173037f(final String str) {
        m173042m(str);
        return this.f152783b.filter(new w9j() { // from class: l.n5k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, (CharSequence) ((j760) obj).f116564a));
            }
        }).map(new w9j() { // from class: l.o5k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return q5k0.m173032c((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m173038h(String str, IdealInfo idealInfo) {
        j760<Boolean, IdealInfo> j760VarM140076a = j760.m140076a(Boolean.TRUE, idealInfo);
        this.f152782a.put(str, j760VarM140076a);
        this.f152783b.m132487l(j760.m140076a(str, j760VarM140076a));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m173039i(String str, Throwable th) {
        j760<Boolean, IdealInfo> j760Var = this.f152782a.get(str);
        if (j760Var == null || !j760Var.f116564a.booleanValue()) {
            this.f152783b.m132487l(j760.m140076a(str, j760.m140076a(Boolean.TRUE, null)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m173040j(String str) {
        j760<Boolean, IdealInfo> j760Var = this.f152782a.get(str);
        C22392a<j760<String, j760<Boolean, IdealInfo>>> c22392a = this.f152783b;
        if (j760Var == null) {
            c22392a.m132487l(j760.m140076a(str, j760.m140076a(Boolean.FALSE, null)));
        } else {
            c22392a.m132487l(j760.m140076a(str, j760Var));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m173041k(final String str) {
        CoreModule.f17545c.f19639e0.m169537s7(str, "chat").subscribe(mkd0.m154956H(new e30() { // from class: l.l5k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126184a.m173038h(str, (IdealInfo) obj);
            }
        }, new e30() { // from class: l.m5k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131401a.m173039i(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m173042m(final String str) {
        j760<String, j760<Boolean, IdealInfo>> j760VarM221515e = this.f152783b.m221515e();
        if (NullChecker.m81303a(j760VarM221515e) && TextUtils.equals(str, j760VarM221515e.f116564a)) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.p5k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147307a.m173040j(str);
            }
        });
    }
}
