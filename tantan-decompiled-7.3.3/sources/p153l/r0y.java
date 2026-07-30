package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r0y extends ar2<z0y> {

    /* JADX INFO: renamed from: a */
    public int f160711a;

    /* JADX INFO: renamed from: b */
    public boolean f160712b;

    /* JADX INFO: renamed from: c */
    public boolean f160713c;

    /* JADX INFO: renamed from: d */
    public boolean f160714d;

    /* JADX INFO: renamed from: e */
    public boolean f160715e;

    /* JADX INFO: renamed from: f */
    public int f160716f;

    /* JADX INFO: renamed from: g */
    public String f160717g;

    /* JADX INFO: renamed from: h */
    public Gender f160718h;

    /* JADX INFO: renamed from: i */
    public String f160719i;

    /* JADX INFO: renamed from: j */
    public boolean f160720j;

    /* JADX INFO: renamed from: k */
    public int f160721k;

    /* JADX INFO: renamed from: l */
    public qcj<Picture, File> f160722l;

    /* JADX INFO: renamed from: m */
    public qcj<Video, File> f160723m;

    /* JADX INFO: renamed from: n */
    public ArrayList<Media> f160724n;

    /* JADX INFO: renamed from: o */
    public boolean f160725o;

    /* JADX INFO: renamed from: p */
    public String f160726p;

    /* JADX INFO: renamed from: q */
    public wzx f160727q;

    /* JADX INFO: renamed from: l.r0y$a */
    public class C19720a implements l6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f160728a;

        public C19720a(String str) {
            this.f160728a = str;
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
            fph0.m126657a0(this.f160728a);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            fph0.m126659b0(this.f160728a);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
            fph0.m126661c0(this.f160728a);
        }
    }

    /* JADX INFO: renamed from: l.r0y$b */
    public class C19721b implements k6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f160730a;

        public C19721b(String str) {
            this.f160730a = str;
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
            fph0.m126650U(this.f160730a);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            fph0.m126651V(this.f160730a);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
            fph0.m126652W(this.f160730a);
        }
    }

    /* JADX INFO: renamed from: l.r0y$c */
    public class C19722c implements j6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f160732a;

        public C19722c(String str) {
            this.f160732a = str;
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
            fph0.m126673i0(this.f160732a);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            fph0.m126675j0(this.f160732a, z);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
            fph0.m126677k0(this.f160732a);
        }
    }

    public r0y(ner nerVar) {
        super(nerVar);
        this.f160725o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m179280G0(Throwable th) {
        FacebookApi.m30528m(th);
        ((z0y) this.viewModel).m218241E(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m179281H0(vg60 vg60Var) {
        ((z0y) this.viewModel).m218262w(vg60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m179282I0(vg60 vg60Var) {
        ((z0y) this.viewModel).m218250O(vg60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m179283J0(List list) {
        Iterator<Media> it = this.f160724n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            final Media next = it.next();
            if (jyb.m147529r(list, new qcj() { // from class: l.f0y
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj).url.equals(next.url));
                }
            }) == null) {
                it.remove();
                z = true;
            }
        }
        if (z && (act() instanceof MediaPickerAct)) {
            ((MediaPickerAct) act()).mo48950f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m179284P0(Bundle bundle) {
        String str;
        ((z0y) this.viewModel).m218240C(this.f160716f, this.f160719i, this.f160717g, this.f160713c, this.f160711a, this.f160720j, this.f160718h);
        ((z0y) this.viewModel).m218239B(this.f160711a);
        ((z0y) this.viewModel).m218265z(this.f160716f, this.f160713c);
        ((z0y) this.viewModel).m218238A(this.f160711a, this.f160716f, this.f160713c, this.f160721k, this.f160720j, this.f160718h, this.f160712b);
        if (this.f160716f == MediaPickerAct.f31470C) {
            duringCreated(new pcj() { // from class: l.j0y
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return uqb0.f180395a0.m30529l();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.p0y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150105a.m179281H0((vg60) obj);
                }
            }, new y20() { // from class: l.q0y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155123a.m179285Q0((Throwable) obj);
                }
            }));
            duringCreated(new pcj() { // from class: l.yzx
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return uqb0.f180395a0.m30536t();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.zzx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f206752a.m179286R0((vg60) obj);
                }
            }));
        } else {
            boolean z = this.f160711a > 0;
            boolean z2 = this.f160713c;
            final zux zuxVar = new zux(act(), z, z2);
            if (z) {
                zuxVar.m221747s().subscribe(psd0.m173596G(new y20() { // from class: l.a0y
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f67768a.m179316S0((List) obj);
                    }
                }));
                zuxVar.m221747s().compose(zux.m221742n(this.f160722l)).map(new qcj() { // from class: l.b0y
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return r0y.m179301r0((List) obj);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.c0y
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f79310a.m179287U0((vg60) obj);
                    }
                }));
            }
            if (z2) {
                zuxVar.m221748t().subscribe(psd0.m173596G(new y20() { // from class: l.d0y
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f84627a.m179317V0((List) obj);
                    }
                }));
                zuxVar.m221748t().compose(zux.m221742n(this.f160723m)).map(new qcj() { // from class: l.e0y
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return r0y.m179292i0((List) obj);
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.k0y
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f123434a.m179282I0((vg60) obj);
                    }
                }));
            }
            zuxVar.m221745q().subscribe(psd0.m173596G(new y20() { // from class: l.l0y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129626a.m179283J0((List) obj);
                }
            }));
            if (TextUtils.equals(this.f160717g, fph0.f100168a) || TextUtils.equals(this.f160717g, "sign_up_select_image")) {
                str = fph0.f100168a;
            } else if (TextUtils.equals(this.f160717g, fph0.f100172e)) {
                str = fph0.f100172e;
            } else if (TextUtils.equals(this.f160717g, fph0.f100171d)) {
                str = fph0.f100171d;
            } else if (TextUtils.equals(this.f160717g, fph0.f100173f)) {
                str = fph0.f100173f;
            } else if (TextUtils.equals(this.f160717g, fph0.f100170c)) {
                str = fph0.f100170c;
            } else {
                str = TextUtils.equals(this.f160717g, "fakeView") ? fph0.f100174g : fph0.f100169b;
            }
            C19720a c19720a = new C19720a(str);
            C19721b c19721b = new C19721b(str);
            C19722c c19722c = new C19722c(str);
            if (wzx.m208784k()) {
                wzx wzxVar = new wzx();
                this.f160727q = wzxVar;
                wzxVar.m208786e(act(), act().findViewById(adc0.f70591u9), z, z2, new x20() { // from class: l.m0y
                    @Override // p153l.x20
                    public final void call() {
                        this.f134371a.m179313L0(zuxVar);
                    }
                }, null, c19720a, c19721b, c19722c);
            } else {
                PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81075j(true).m81078m(new x20() { // from class: l.n0y
                    @Override // p153l.x20
                    public final void call() {
                        this.f139688a.m179314N0(zuxVar);
                    }
                }, new y20() { // from class: l.o0y
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f144598a.m179315O0((PermissionHelper.PermissionDeniedReason) obj);
                    }
                }).m81081p(c19722c).m81085t(c19721b).m81087v(c19720a).m81074i(act());
            }
        }
        ((z0y) this.viewModel).m218254S(this.f160715e);
        if (CoreModule.m30929H().mo29162a().mo105647a() && TextUtils.equals(this.f160717g, "from_sign_up")) {
            ((z0y) this.viewModel).m218246J(TEnum.equals(this.f160718h, "female"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m179285Q0(Throwable th) {
        ((z0y) this.viewModel).m218263x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m179286R0(vg60 vg60Var) {
        ((z0y) this.viewModel).m218264y(vg60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m179287U0(vg60 vg60Var) {
        ((z0y) this.viewModel).m218248M(vg60Var);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ vg60 m179292i0(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.g0y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ vg60 m179301r0(List list) {
        return new vg60(jyb.m147486Q(list, new qcj() { // from class: l.h0y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122953b((v2i0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: A0 */
    public void m179308A0(qcj<Picture, File> qcjVar) {
        this.f160722l = qcjVar;
    }

    /* JADX INFO: renamed from: C0 */
    public void m179309C0(qcj<Video, File> qcjVar) {
        this.f160723m = qcjVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m179310D0() {
        ((z0y) this.viewModel).m218261v(this.f160724n);
    }

    /* JADX INFO: renamed from: E0 */
    public void m179311E0(ewi ewiVar) {
        ((z0y) this.viewModel).m218252Q(ewiVar);
        if (this.f160716f == MediaPickerAct.f31470C) {
            uqb0.f180395a0.m30541y(ewiVar.f96162b, false).subscribe(psd0.m173597H(uxj0.f181468b, new y20() { // from class: l.i0y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112459a.m179280G0((Throwable) obj);
                }
            }));
            ((z0y) this.viewModel).m218241E(true);
        } else {
            ((z0y) this.viewModel).m218259s(ewiVar);
        }
        ((z0y) this.viewModel).m218260u();
    }

    /* JADX INFO: renamed from: F0 */
    public void m179312F0(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str, Gender gender, String str2, boolean z5, uyh0 uyh0Var, int i3) {
        this.f160711a = i;
        this.f160712b = z;
        this.f160713c = z2;
        this.f160714d = z3;
        this.f160715e = z4;
        this.f160716f = i2;
        this.f160717g = str;
        this.f160718h = gender;
        this.f160719i = str2;
        this.f160720j = z5;
        this.f160721k = i3;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m179313L0(zux zuxVar) {
        act().getSupportLoaderManager().mo3089e(0, null, zuxVar);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m179314N0(zux zuxVar) {
        act().getSupportLoaderManager().mo3089e(0, null, zuxVar);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m179315O0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m179316S0(List list) {
        ((z0y) this.viewModel).m218247L(list);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m179317V0(List list) {
        ((z0y) this.viewModel).m218249N(list);
    }

    /* JADX INFO: renamed from: W0 */
    public void m179318W0(ArrayList<Media> arrayList) {
        this.f160724n = arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public r0y m179319X0(String str) {
        this.f160726p = str;
        return this;
    }

    /* JADX INFO: renamed from: Y0 */
    public r0y m179320Y0(boolean z) {
        this.f160725o = z;
        return this;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.xzx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196931a.m179284P0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
