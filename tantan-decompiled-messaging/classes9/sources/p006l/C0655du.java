package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaPickerAct;
import com.p000p1.mobile.putong.api.api.FacebookApi;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.iti;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.nqh0;
import l.nuh0;
import l.q860;
import l.roj0;
import l.v4e;
import l.v9j;
import l.vwb;
import l.w4e;
import l.w9j;
import l.x4e;
import l.zqx;
import l.zvf0;

/* JADX INFO: renamed from: l.du */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0655du extends jq2<C0905ju> {

    /* JADX INFO: renamed from: a */
    public int f10566a;

    /* JADX INFO: renamed from: b */
    public boolean f10567b;

    /* JADX INFO: renamed from: c */
    public boolean f10568c;

    /* JADX INFO: renamed from: d */
    public boolean f10569d;

    /* JADX INFO: renamed from: e */
    public boolean f10570e;

    /* JADX INFO: renamed from: f */
    public int f10571f;

    /* JADX INFO: renamed from: g */
    public String f10572g;

    /* JADX INFO: renamed from: h */
    public Gender f10573h;

    /* JADX INFO: renamed from: i */
    public String f10574i;

    /* JADX INFO: renamed from: j */
    public boolean f10575j;

    /* JADX INFO: renamed from: k */
    public int f10576k;

    /* JADX INFO: renamed from: l */
    public w9j<Picture, File> f10577l;

    /* JADX INFO: renamed from: m */
    public w9j<Video, File> f10578m;

    /* JADX INFO: renamed from: n */
    public ArrayList<Media> f10579n;

    /* JADX INFO: renamed from: o */
    public boolean f10580o;

    /* JADX INFO: renamed from: p */
    public boolean f10581p;

    /* JADX INFO: renamed from: q */
    public String f10582q;

    /* JADX INFO: renamed from: l.du$a */
    public class a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qgh0 f10583a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10584b;

        public a(qgh0 qgh0Var, String str) {
            this.f10583a = qgh0Var;
            this.f10584b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m14287a() {
            this.f10583a.m22040i(this.f10584b);
        }

        /* JADX INFO: renamed from: b */
        public void m14288b(boolean z) {
            this.f10583a.m22041j(this.f10584b, z);
        }

        /* JADX INFO: renamed from: c */
        public void m14289c() {
            this.f10583a.m22042k(this.f10584b);
        }
    }

    /* JADX INFO: renamed from: l.du$b */
    public class b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qgh0 f10586a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10587b;

        public b(qgh0 qgh0Var, String str) {
            this.f10586a = qgh0Var;
            this.f10587b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m14290a() {
            this.f10586a.m22034c(this.f10587b);
        }

        /* JADX INFO: renamed from: b */
        public void m14291b() {
            this.f10586a.m22035d(this.f10587b);
        }

        /* JADX INFO: renamed from: c */
        public void m14292c() {
            this.f10586a.m22036e(this.f10587b);
        }
    }

    /* JADX INFO: renamed from: l.du$c */
    public class c implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qgh0 f10589a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10590b;

        public c(qgh0 qgh0Var, String str) {
            this.f10589a = qgh0Var;
            this.f10590b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m14293a() {
            this.f10589a.m22037f(this.f10590b);
        }

        /* JADX INFO: renamed from: b */
        public void m14294b() {
            this.f10589a.m22038g(this.f10590b);
        }

        /* JADX INFO: renamed from: c */
        public void m14295c() {
            this.f10589a.m22039h(this.f10590b);
        }
    }

    public C0655du(mcr mcrVar) {
        super(mcrVar);
        this.f10581p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m14246P0(Throwable th) {
        ((C0905ju) ((jq2) this).viewModel).m17836w();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ q860 m14247e0(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.tt
            public final Object call(Object obj) {
                return iti.b((nuh0) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ q860 m14262t0(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.rt
            public final Object call(Object obj) {
                return iti.b((nuh0) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: A0 */
    public void m14267A0(w9j<Picture, File> w9jVar) {
        this.f10577l = w9jVar;
    }

    /* JADX INFO: renamed from: C0 */
    public void m14268C0(w9j<Video, File> w9jVar) {
        this.f10578m = w9jVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m14269D0(iti itiVar) {
        ((C0905ju) ((jq2) this).viewModel).m17825M(itiVar);
        if (this.f10571f == AccountMediaPickerAct.f1001B) {
            qib0.f19803a0.m1449y(itiVar.b, false).subscribe(mkd0.H(roj0.b, new e30() { // from class: l.ut
                public final void call(Object obj) {
                    this.f23733a.m14271F0((Throwable) obj);
                }
            }));
            ((C0905ju) ((jq2) this).viewModel).m17814B(true);
        } else {
            ((C0905ju) ((jq2) this).viewModel).m17833s(itiVar);
        }
        ((C0905ju) ((jq2) this).viewModel).m17834u();
    }

    /* JADX INFO: renamed from: E0 */
    public void m14270E0(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str, Gender gender, String str2, boolean z5, nqh0 nqh0Var, int i3, boolean z6) {
        this.f10566a = i;
        this.f10567b = z;
        this.f10568c = z2;
        this.f10569d = z3;
        this.f10570e = z4;
        this.f10571f = i2;
        this.f10572g = str;
        this.f10573h = gender;
        this.f10574i = str2;
        this.f10575j = z5;
        this.f10576k = i3;
        this.f10580o = z6;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m14271F0(Throwable th) {
        FacebookApi.m1436m(th);
        ((C0905ju) ((jq2) this).viewModel).m17814B(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m14272G0(q860 q860Var) {
        ((C0905ju) ((jq2) this).viewModel).m17835v(q860Var);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m14273H0(q860 q860Var) {
        ((C0905ju) ((jq2) this).viewModel).m17823K(q860Var);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m14274I0(List list) {
        Iterator<Media> it = this.f10579n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            final Media next = it.next();
            if (vwb.r(list, new w9j() { // from class: l.st
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj).url.equals(next.url));
                }
            }) == null) {
                it.remove();
                z = true;
            }
        }
        if (z && (act() instanceof AccountMediaPickerAct)) {
            ((AccountMediaPickerAct) act()).mo1091f();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m14275J0(fmx fmxVar) {
        act().getSupportLoaderManager().e(0, (Bundle) null, fmxVar);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m14276L0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        act().finish();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m14277N0(d30 d30Var) {
        ((C0905ju) ((jq2) this).viewModel).m17832q();
        d30Var.call();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m14278O0(Bundle bundle) {
        ((C0905ju) ((jq2) this).viewModel).m17813A(this.f10571f, this.f10574i, this.f10572g, this.f10568c, this.f10566a, this.f10575j, this.f10573h);
        ((C0905ju) ((jq2) this).viewModel).m17838y(this.f10571f, this.f10568c);
        ((C0905ju) ((jq2) this).viewModel).m17839z(this.f10566a, this.f10571f, this.f10568c, this.f10576k, this.f10575j, this.f10573h, this.f10567b, this.f10580o);
        if (this.f10571f == AccountMediaPickerAct.f1001B) {
            duringCreated(new v9j() { // from class: l.vt
                public final Object call() {
                    return qib0.f19803a0.m1437l();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.bu
                public final void call(Object obj) {
                    this.f9088a.m14272G0((q860) obj);
                }
            }, new e30() { // from class: l.cu
                public final void call(Object obj) {
                    this.f9840a.m14246P0((Throwable) obj);
                }
            }));
            duringCreated(new v9j() { // from class: l.kt
                public final Object call() {
                    return qib0.f19803a0.m1444t();
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.lt
                public final void call(Object obj) {
                    this.f16634a.m14279Q0((q860) obj);
                }
            }));
        } else {
            boolean z = this.f10566a > 0;
            boolean z2 = this.f10568c;
            final fmx fmxVar = new fmx(act(), z, z2, true, 200);
            if (z) {
                fmxVar.m15372t().subscribe(mkd0.G(new e30() { // from class: l.mt
                    public final void call(Object obj) {
                        this.f17234a.m14280R0(fmxVar, (List) obj);
                    }
                }));
                fmxVar.m15372t().compose(fmx.m15363n(this.f10577l)).map(new w9j() { // from class: l.nt
                    public final Object call(Object obj) {
                        return C0655du.m14247e0((List) obj);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.ot
                    public final void call(Object obj) {
                        this.f18360a.m14281S0((q860) obj);
                    }
                }));
            }
            if (z2) {
                fmxVar.m15373u().subscribe(mkd0.G(new e30() { // from class: l.pt
                    public final void call(Object obj) {
                        this.f19288a.m14282U0(fmxVar, (List) obj);
                    }
                }));
                fmxVar.m15373u().compose(fmx.m15363n(this.f10578m)).map(new w9j() { // from class: l.qt
                    public final Object call(Object obj) {
                        return C0655du.m14262t0((List) obj);
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.wt
                    public final void call(Object obj) {
                        this.f25391a.m14273H0((q860) obj);
                    }
                }));
            }
            fmxVar.m15370r().subscribe(mkd0.G(new e30() { // from class: l.xt
                public final void call(Object obj) {
                    this.f27712a.m14274I0((List) obj);
                }
            }));
            qgh0 qgh0Var = new qgh0();
            String str = "signup";
            if (!TextUtils.equals(this.f10572g, "signup") && !TextUtils.equals(this.f10572g, "sign_up_select_image")) {
                str = this.f10572g;
            }
            final d30 d30Var = new d30() { // from class: l.yt
                public final void call() {
                    this.f28374a.m14275J0(fmxVar);
                }
            };
            e30 e30Var = new e30() { // from class: l.zt
                public final void call(Object obj) {
                    this.f28961a.m14276L0((PermissionHelper.PermissionDeniedReason) obj);
                }
            };
            a aVar = new a(qgh0Var, str);
            b bVar = new b(qgh0Var, str);
            c cVar = new c(qgh0Var, str);
            if (zqx.k()) {
                new zqx().e(act(), act().findViewById(q4c0.f19575I), z, z2, new d30() { // from class: l.au
                    public final void call() {
                        this.f8516a.m14277N0(d30Var);
                    }
                }, (e30) null, cVar, bVar, aVar);
            } else {
                PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).w(false).u(true).j(true).m(d30Var, e30Var).p(aVar).t(bVar).v(cVar).i(act());
            }
        }
        ((C0905ju) ((jq2) this).viewModel).m17826N(this.f10570e);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m14279Q0(q860 q860Var) {
        ((C0905ju) ((jq2) this).viewModel).m17837x(q860Var);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m14280R0(fmx fmxVar, List list) {
        zvf0.D("e_picture_selection_photo_num", "p_picture_selection_view", new j760[]{j760.a("have_photo_or_not", list.size() > 0 ? "yes" : "no")});
        if (zqx.k()) {
            ((C0905ju) ((jq2) this).viewModel).m17832q();
        }
        ((C0905ju) ((jq2) this).viewModel).m17820H(list);
        if (fmxVar.f12787g && NullChecker.a(act())) {
            act().getSupportLoaderManager().e(0, (Bundle) null, fmxVar);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m14281S0(q860 q860Var) {
        ((C0905ju) ((jq2) this).viewModel).m17821I(q860Var);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m14282U0(fmx fmxVar, List list) {
        ((C0905ju) ((jq2) this).viewModel).m17822J(list);
        if (fmxVar.f12787g && NullChecker.a(act())) {
            act().getSupportLoaderManager().e(0, (Bundle) null, fmxVar);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m14283V0(ArrayList<Media> arrayList) {
        this.f10579n = arrayList;
    }

    /* JADX INFO: renamed from: W0 */
    public C0655du m14284W0(String str) {
        this.f10582q = str;
        return this;
    }

    /* JADX INFO: renamed from: X0 */
    public C0655du m14285X0(boolean z) {
        this.f10581p = z;
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public void m14286a0() {
        super.a0();
        creates(new e30() { // from class: l.jt
            public final void call(Object obj) {
                this.f15384a.m14278O0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
