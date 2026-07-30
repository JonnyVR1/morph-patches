package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaPickerAct;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.xt */
/* JADX INFO: loaded from: classes9.dex */
public class C21443xt extends ar2<C16621du> {

    /* JADX INFO: renamed from: a */
    public int f196151a;

    /* JADX INFO: renamed from: b */
    public boolean f196152b;

    /* JADX INFO: renamed from: c */
    public boolean f196153c;

    /* JADX INFO: renamed from: d */
    public boolean f196154d;

    /* JADX INFO: renamed from: e */
    public boolean f196155e;

    /* JADX INFO: renamed from: f */
    public int f196156f;

    /* JADX INFO: renamed from: g */
    public String f196157g;

    /* JADX INFO: renamed from: h */
    public Gender f196158h;

    /* JADX INFO: renamed from: i */
    public String f196159i;

    /* JADX INFO: renamed from: j */
    public boolean f196160j;

    /* JADX INFO: renamed from: k */
    public int f196161k;

    /* JADX INFO: renamed from: l */
    public qcj<Picture, File> f196162l;

    /* JADX INFO: renamed from: m */
    public qcj<Video, File> f196163m;

    /* JADX INFO: renamed from: n */
    public ArrayList<Media> f196164n;

    /* JADX INFO: renamed from: o */
    public boolean f196165o;

    /* JADX INFO: renamed from: p */
    public boolean f196166p;

    /* JADX INFO: renamed from: q */
    public String f196167q;

    /* JADX INFO: renamed from: l.xt$a */
    public class a implements j6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xoh0 f196168a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f196169b;

        public a(xoh0 xoh0Var, String str) {
            this.f196168a = xoh0Var;
            this.f196169b = str;
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
            this.f196168a.m212474i(this.f196169b);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            this.f196168a.m212475j(this.f196169b, z);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
            this.f196168a.m212476k(this.f196169b);
        }
    }

    /* JADX INFO: renamed from: l.xt$b */
    public class b implements k6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xoh0 f196171a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f196172b;

        public b(xoh0 xoh0Var, String str) {
            this.f196171a = xoh0Var;
            this.f196172b = str;
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
            this.f196171a.m212468c(this.f196172b);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            this.f196171a.m212469d(this.f196172b);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
            this.f196171a.m212470e(this.f196172b);
        }
    }

    /* JADX INFO: renamed from: l.xt$c */
    public class c implements l6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xoh0 f196174a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f196175b;

        public c(xoh0 xoh0Var, String str) {
            this.f196174a = xoh0Var;
            this.f196175b = str;
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
            this.f196174a.m212471f(this.f196175b);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            this.f196174a.m212472g(this.f196175b);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
            this.f196174a.m212473h(this.f196175b);
        }
    }

    public C21443xt(ner nerVar) {
        super(nerVar);
        this.f196166p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m213000P0(Throwable th) {
        ((C16621du) this.viewModel).m117939w();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ vg60 m213001e0(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.nt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ vg60 m213016t0(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.lt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: A0 */
    public void m213021A0(qcj<Picture, File> qcjVar) {
        this.f196162l = qcjVar;
    }

    /* JADX INFO: renamed from: C0 */
    public void m213022C0(qcj<Video, File> qcjVar) {
        this.f196163m = qcjVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m213023D0(ewi ewiVar) {
        ((C16621du) this.viewModel).m117929M(ewiVar);
        if (this.f196156f == AccountMediaPickerAct.f17731B) {
            uqb0.f180395a0.m30541y(ewiVar.f96162b, false).subscribe(psd0.m173597H(uxj0.f181468b, new y20() { // from class: l.ot
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148913a.m213025F0((Throwable) obj);
                }
            }));
            ((C16621du) this.viewModel).m117919B(true);
        } else {
            ((C16621du) this.viewModel).m117936s(ewiVar);
        }
        ((C16621du) this.viewModel).m117937u();
    }

    /* JADX INFO: renamed from: E0 */
    public void m213024E0(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str, Gender gender, String str2, boolean z5, uyh0 uyh0Var, int i3, boolean z6) {
        this.f196151a = i;
        this.f196152b = z;
        this.f196153c = z2;
        this.f196154d = z3;
        this.f196155e = z4;
        this.f196156f = i2;
        this.f196157g = str;
        this.f196158h = gender;
        this.f196159i = str2;
        this.f196160j = z5;
        this.f196161k = i3;
        this.f196165o = z6;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m213025F0(Throwable th) {
        FacebookApi.m30528m(th);
        ((C16621du) this.viewModel).m117919B(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m213026G0(vg60 vg60Var) {
        ((C16621du) this.viewModel).m117938v(vg60Var);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m213027H0(vg60 vg60Var) {
        ((C16621du) this.viewModel).m117927K(vg60Var);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m213028I0(List list) {
        Iterator<Media> it = this.f196164n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            final Media next = it.next();
            if (jyb.m147529r(list, new qcj() { // from class: l.mt
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj).url.equals(next.url));
                }
            }) == null) {
                it.remove();
                z = true;
            }
        }
        if (z && (act() instanceof AccountMediaPickerAct)) {
            ((AccountMediaPickerAct) act()).mo30183f();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m213029J0(cvx cvxVar) {
        act().getSupportLoaderManager().mo3089e(0, null, cvxVar);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m213030L0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m213031N0(x20 x20Var) {
        ((C16621du) this.viewModel).m117935q();
        x20Var.call();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m213032O0(Bundle bundle) {
        ((C16621du) this.viewModel).m117918A(this.f196156f, this.f196159i, this.f196157g, this.f196153c, this.f196151a, this.f196160j, this.f196158h);
        ((C16621du) this.viewModel).m117941y(this.f196156f, this.f196153c);
        ((C16621du) this.viewModel).m117942z(this.f196151a, this.f196156f, this.f196153c, this.f196161k, this.f196160j, this.f196158h, this.f196152b, this.f196165o);
        if (this.f196156f == AccountMediaPickerAct.f17731B) {
            duringCreated(new pcj() { // from class: l.pt
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return uqb0.f180395a0.m30529l();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.vt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185676a.m213026G0((vg60) obj);
                }
            }, new y20() { // from class: l.wt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190706a.m213000P0((Throwable) obj);
                }
            }));
            duringCreated(new pcj() { // from class: l.dt
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return uqb0.f180395a0.m30536t();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.et
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f95671a.m213033Q0((vg60) obj);
                }
            }));
        } else {
            boolean z = this.f196151a > 0;
            boolean z2 = this.f196153c;
            final cvx cvxVar = new cvx(act(), z, z2, true, 200);
            if (z) {
                cvxVar.m112890t().subscribe(psd0.m173596G(new y20() { // from class: l.ft
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f100704a.m213034R0(cvxVar, (List) obj);
                    }
                }));
                cvxVar.m112890t().compose(cvx.m112884n(this.f196162l)).map(new qcj() { // from class: l.gt
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C21443xt.m213001e0((List) obj);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.ht
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f111496a.m213035S0((vg60) obj);
                    }
                }));
            }
            if (z2) {
                cvxVar.m112891u().subscribe(psd0.m173596G(new y20() { // from class: l.jt
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f122542a.m213036U0(cvxVar, (List) obj);
                    }
                }));
                cvxVar.m112891u().compose(cvx.m112884n(this.f196163m)).map(new qcj() { // from class: l.kt
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C21443xt.m213016t0((List) obj);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.qt
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f159372a.m213027H0((vg60) obj);
                    }
                }));
            }
            cvxVar.m112888r().subscribe(psd0.m173596G(new y20() { // from class: l.rt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164761a.m213028I0((List) obj);
                }
            }));
            xoh0 xoh0Var = new xoh0();
            String str = this.f196157g;
            String str2 = VerifyReason.signup;
            if (!TextUtils.equals(str, VerifyReason.signup) && !TextUtils.equals(this.f196157g, "sign_up_select_image")) {
                str2 = this.f196157g;
            }
            final x20 x20Var = new x20() { // from class: l.st
                @Override // p153l.x20
                public final void call() {
                    this.f170534a.m213029J0(cvxVar);
                }
            };
            y20<PermissionHelper.PermissionDeniedReason> y20Var = new y20() { // from class: l.tt
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176047a.m213030L0((PermissionHelper.PermissionDeniedReason) obj);
                }
            };
            a aVar = new a(xoh0Var, str2);
            b bVar = new b(xoh0Var, str2);
            c cVar = new c(xoh0Var, str2);
            if (wzx.m208784k()) {
                new wzx().m208786e(act(), act().findViewById(wcc0.f188413I), z, z2, new x20() { // from class: l.ut
                    @Override // p153l.x20
                    public final void call() {
                        this.f180877a.m213031N0(x20Var);
                    }
                }, null, cVar, bVar, aVar);
            } else {
                PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81075j(true).m81078m(x20Var, y20Var).m81081p(aVar).m81085t(bVar).m81087v(cVar).m81074i(act());
            }
        }
        ((C16621du) this.viewModel).m117930N(this.f196155e);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m213033Q0(vg60 vg60Var) {
        ((C16621du) this.viewModel).m117940x(vg60Var);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m213034R0(cvx cvxVar, List list) {
        i4g0.m138495D("e_picture_selection_photo_num", "p_picture_selection_view", pf60.m172085a("have_photo_or_not", list.size() > 0 ? "yes" : "no"));
        if (wzx.m208784k()) {
            ((C16621du) this.viewModel).m117935q();
        }
        ((C16621du) this.viewModel).m117924H(list);
        if (cvxVar.f84078g && NullChecker.m82486a(act())) {
            act().getSupportLoaderManager().mo3089e(0, null, cvxVar);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m213035S0(vg60 vg60Var) {
        ((C16621du) this.viewModel).m117925I(vg60Var);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m213036U0(cvx cvxVar, List list) {
        ((C16621du) this.viewModel).m117926J(list);
        if (cvxVar.f84078g && NullChecker.m82486a(act())) {
            act().getSupportLoaderManager().mo3089e(0, null, cvxVar);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m213037V0(ArrayList<Media> arrayList) {
        this.f196164n = arrayList;
    }

    /* JADX INFO: renamed from: W0 */
    public C21443xt m213038W0(String str) {
        this.f196167q = str;
        return this;
    }

    /* JADX INFO: renamed from: X0 */
    public C21443xt m213039X0(boolean z) {
        this.f196166p = z;
        return this;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ct
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83652a.m213032O0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
