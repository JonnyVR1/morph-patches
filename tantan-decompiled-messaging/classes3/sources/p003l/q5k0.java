package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.e51;
import l.j760;
import l.mkd0;
import p014rx.C1099c;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class q5k0 {

    /* JADX INFO: renamed from: c */
    public static q5k0 f6591c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, j760<Boolean, IdealInfo>> f6592a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public C1185a<j760<String, j760<Boolean, IdealInfo>>> f6593b = C1185a.m9969b();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ j760 m7003c(j760 j760Var) {
        return (j760) j760Var.b;
    }

    /* JADX INFO: renamed from: g */
    public static q5k0 m7006g() {
        if (f6591c == null) {
            synchronized (q5k0.class) {
                try {
                    if (f6591c == null) {
                        f6591c = new q5k0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6591c;
    }

    /* JADX INFO: renamed from: l */
    public static void m7007l() {
        f6591c = null;
    }

    /* JADX INFO: renamed from: f */
    public C1099c<j760<Boolean, IdealInfo>> m7008f(final String str) {
        m7013m(str);
        return this.f6593b.filter(new w9j() { // from class: l.n5k0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, (CharSequence) ((j760) obj).a));
            }
        }).map(new w9j() { // from class: l.o5k0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return q5k0.m7003c((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m7009h(String str, IdealInfo idealInfo) {
        j760<Boolean, IdealInfo> j760VarA = j760.a(Boolean.TRUE, idealInfo);
        this.f6592a.put(str, j760VarA);
        this.f6593b.onNext(j760.a(str, j760VarA));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7010i(String str, Throwable th) {
        j760<Boolean, IdealInfo> j760Var = this.f6592a.get(str);
        if (j760Var == null || !((Boolean) j760Var.a).booleanValue()) {
            this.f6593b.onNext(j760.a(str, j760.a(Boolean.TRUE, (Object) null)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7011j(String str) {
        j760<Boolean, IdealInfo> j760Var = this.f6592a.get(str);
        C1185a<j760<String, j760<Boolean, IdealInfo>>> c1185a = this.f6593b;
        if (j760Var == null) {
            c1185a.onNext(j760.a(str, j760.a(Boolean.FALSE, (Object) null)));
        } else {
            c1185a.onNext(j760.a(str, j760Var));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7012k(final String str) {
        CoreModule.c.e0.s7(str, "chat").subscribe((m250) mkd0.H(new e30() { // from class: l.l5k0
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5216a.m7009h(str, (IdealInfo) obj);
            }
        }, new e30() { // from class: l.m5k0
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5551a.m7010i(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m7013m(final String str) {
        j760<String, j760<Boolean, IdealInfo>> j760VarM9972e = this.f6593b.m9972e();
        if (NullChecker.a(j760VarM9972e) && TextUtils.equals(str, (CharSequence) j760VarM9972e.a)) {
            return;
        }
        e51.G(new Runnable() { // from class: l.p5k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6320a.m7011j(str);
            }
        });
    }
}
