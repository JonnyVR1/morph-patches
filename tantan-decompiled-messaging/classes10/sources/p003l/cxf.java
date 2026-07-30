package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.mkd0;
import l.na30;
import l.q5e;
import l.tpd0;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cxf {

    /* JADX INFO: renamed from: b */
    public static volatile cxf f4086b;

    /* JADX INFO: renamed from: a */
    public b<User> f4087a = b.b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6010a(final Act act, final Frag frag, final int i, User user) {
        User userP9 = CoreModule.c.e0.p9();
        if (CoreModule.c.e0.Z7()) {
            wm20.m10524m(act);
        } else {
            ark.m5560V0(act, true, userP9.fp(), act.string(R.string.Ik), new Runnable() { // from class: l.bxf
                @Override // java.lang.Runnable
                public final void run() {
                    r3g.m9080i(act, frag, i);
                }
            });
        }
        if (na30.a() || q5e.a()) {
            tpd0 tpd0Var = CoreModule.c.e0.V0;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            if (((Integer) CoreModule.c.e0.V0.get()).intValue() == 2) {
                CoreModule.c.f0.Re();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static cxf m6013f() {
        if (f4086b == null) {
            synchronized (cxf.class) {
                try {
                    if (f4086b == null) {
                        f4086b = new cxf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4086b;
    }

    /* JADX INFO: renamed from: d */
    public void m6014d() {
        this.f4087a.onCompleted();
        f4086b = null;
    }

    /* JADX INFO: renamed from: e */
    public void m6015e(c<User> cVar, final Act act, final Frag frag, final int i) {
        cVar.switchMap(new w9j() { // from class: l.zwf
            public final Object call(Object obj) {
                return this.f9329a.m6016g((User) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.axf
            public final void call(Object obj) {
                cxf.m6010a(act, frag, i, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ c m6016g(User user) {
        return this.f4087a;
    }

    /* JADX INFO: renamed from: h */
    public void m6017h(User user) {
        this.f4087a.onNext(user);
    }
}
