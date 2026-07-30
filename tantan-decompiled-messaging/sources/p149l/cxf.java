package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.User;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes10.dex */
public class cxf {

    /* JADX INFO: renamed from: b */
    public static volatile cxf f82872b;

    /* JADX INFO: renamed from: a */
    public C22393b<User> f82873a = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109091a(final Act act, final Frag frag, final int i, User user) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            wm20.m203973m(act);
        } else {
            ark.m98453V0(act, true, userM169527p9.m60124fp(), act.string(R$string.f17827Ik), new Runnable() { // from class: l.bxf
                @Override // java.lang.Runnable
                public final void run() {
                    r3g.m177670i(act, frag, i);
                }
            });
        }
        if (na30.m158578a() || q5e.m173001a()) {
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149286V0;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            if (CoreModule.f17545c.f19639e0.f149286V0.get().intValue() == 2) {
                CoreModule.f17545c.f19642f0.m32785Re();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static cxf m109094f() {
        if (f82872b == null) {
            synchronized (cxf.class) {
                try {
                    if (f82872b == null) {
                        f82872b = new cxf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f82872b;
    }

    /* JADX INFO: renamed from: d */
    public void m109095d() {
        this.f82873a.onCompleted();
        f82872b = null;
    }

    /* JADX INFO: renamed from: e */
    public void m109096e(C22306c<User> c22306c, final Act act, final Frag frag, final int i) {
        c22306c.switchMap(new w9j() { // from class: l.zwf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f205173a.m109097g((User) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.axf
            @Override // p149l.e30
            public final void call(Object obj) {
                cxf.m109091a(act, frag, i, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C22306c m109097g(User user) {
        return this.f82873a;
    }

    /* JADX INFO: renamed from: h */
    public void m109098h(User user) {
        this.f82873a.m132487l(user);
    }
}
