package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.User;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public class qyf {

    /* JADX INFO: renamed from: b */
    public static volatile qyf f160147b;

    /* JADX INFO: renamed from: a */
    public C22508b<User> f160148a = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m178640a(final Act act, final Frag frag, final int i, User user) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            gv20.m132478m(act);
        } else {
            qtk.m178003V0(act, true, userM116600p9.m61308fp(), act.string(R$string.f19221el), new Runnable() { // from class: l.pyf
                @Override // java.lang.Runnable
                public final void run() {
                    f5g.m124131i(act, frag, i);
                }
            });
        }
        if (bj30.m104592a() || f7e.m124437a()) {
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89143V0;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            if (CoreModule.f18264c.f20381e0.f89143V0.get().intValue() == 2) {
                CoreModule.f18264c.f20384f0.m33788Re();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static qyf m178643f() {
        if (f160147b == null) {
            synchronized (qyf.class) {
                try {
                    if (f160147b == null) {
                        f160147b = new qyf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f160147b;
    }

    /* JADX INFO: renamed from: d */
    public void m178644d() {
        this.f160148a.onCompleted();
        f160147b = null;
    }

    /* JADX INFO: renamed from: e */
    public void m178645e(C22421c<User> c22421c, final Act act, final Frag frag, final int i) {
        c22421c.switchMap(new qcj() { // from class: l.nyf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144305a.m178646g((User) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.oyf
            @Override // p153l.y20
            public final void call(Object obj) {
                qyf.m178640a(act, frag, i, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22421c m178646g(User user) {
        return this.f160148a;
    }

    /* JADX INFO: renamed from: h */
    public void m178647h(User user) {
        this.f160148a.m137019l(user);
    }
}
