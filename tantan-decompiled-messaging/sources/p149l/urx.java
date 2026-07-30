package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class urx extends jq2<csx> {

    /* JADX INFO: renamed from: a */
    public int f177907a;

    /* JADX INFO: renamed from: b */
    public boolean f177908b;

    /* JADX INFO: renamed from: c */
    public boolean f177909c;

    /* JADX INFO: renamed from: d */
    public boolean f177910d;

    /* JADX INFO: renamed from: e */
    public boolean f177911e;

    /* JADX INFO: renamed from: f */
    public int f177912f;

    /* JADX INFO: renamed from: g */
    public String f177913g;

    /* JADX INFO: renamed from: h */
    public Gender f177914h;

    /* JADX INFO: renamed from: i */
    public String f177915i;

    /* JADX INFO: renamed from: j */
    public boolean f177916j;

    /* JADX INFO: renamed from: k */
    public int f177917k;

    /* JADX INFO: renamed from: l */
    public w9j<Picture, File> f177918l;

    /* JADX INFO: renamed from: m */
    public w9j<Video, File> f177919m;

    /* JADX INFO: renamed from: n */
    public ArrayList<Media> f177920n;

    /* JADX INFO: renamed from: o */
    public boolean f177921o;

    /* JADX INFO: renamed from: p */
    public String f177922p;

    /* JADX INFO: renamed from: q */
    public zqx f177923q;

    /* JADX INFO: renamed from: l.urx$a */
    public class C20496a implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f177924a;

        public C20496a(String str) {
            this.f177924a = str;
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
            ygh0.m214669a0(this.f177924a);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            ygh0.m214671b0(this.f177924a);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
            ygh0.m214673c0(this.f177924a);
        }
    }

    /* JADX INFO: renamed from: l.urx$b */
    public class C20497b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f177926a;

        public C20497b(String str) {
            this.f177926a = str;
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
            ygh0.m214662U(this.f177926a);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            ygh0.m214663V(this.f177926a);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
            ygh0.m214664W(this.f177926a);
        }
    }

    /* JADX INFO: renamed from: l.urx$c */
    public class C20498c implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f177928a;

        public C20498c(String str) {
            this.f177928a = str;
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
            ygh0.m214685i0(this.f177928a);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            ygh0.m214687j0(this.f177928a, z);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
            ygh0.m214689k0(this.f177928a);
        }
    }

    public urx(mcr mcrVar) {
        super(mcrVar);
        this.f177921o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m195133G0(Throwable th) {
        FacebookApi.m29530m(th);
        ((csx) this.viewModel).m108617E(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m195134H0(q860 q860Var) {
        ((csx) this.viewModel).m108638w(q860Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m195135I0(q860 q860Var) {
        ((csx) this.viewModel).m108626O(q860Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m195136J0(List list) {
        Iterator<Media> it = this.f177920n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            final Media next = it.next();
            if (vwb.m200346r(list, new w9j() { // from class: l.irx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj).url.equals(next.url));
                }
            }) == null) {
                it.remove();
                z = true;
            }
        }
        if (z && (act() instanceof MediaPickerAct)) {
            ((MediaPickerAct) act()).mo47767f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m195137P0(Bundle bundle) {
        String str;
        ((csx) this.viewModel).m108616C(this.f177912f, this.f177915i, this.f177913g, this.f177909c, this.f177907a, this.f177916j, this.f177914h);
        ((csx) this.viewModel).m108615B(this.f177907a);
        ((csx) this.viewModel).m108641z(this.f177912f, this.f177909c);
        ((csx) this.viewModel).m108614A(this.f177907a, this.f177912f, this.f177909c, this.f177917k, this.f177916j, this.f177914h, this.f177908b);
        if (this.f177912f == MediaPickerAct.f30622C) {
            duringCreated(new v9j() { // from class: l.mrx
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return qib0.f154712a0.m29531l();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.srx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166144a.m195134H0((q860) obj);
                }
            }, new e30() { // from class: l.trx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171879a.m195138Q0((Throwable) obj);
                }
            }));
            duringCreated(new v9j() { // from class: l.brx
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return qib0.f154712a0.m29538t();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.crx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82308a.m195139R0((q860) obj);
                }
            }));
        } else {
            boolean z = this.f177907a > 0;
            boolean z2 = this.f177909c;
            final cmx cmxVar = new cmx(act(), z, z2);
            if (z) {
                cmxVar.m107716s().subscribe(mkd0.m154955G(new e30() { // from class: l.drx
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f87701a.m195169S0((List) obj);
                    }
                }));
                cmxVar.m107716s().compose(cmx.m107711n(this.f177918l)).map(new w9j() { // from class: l.erx
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return urx.m195154r0((List) obj);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.frx
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f99016a.m195140U0((q860) obj);
                    }
                }));
            }
            if (z2) {
                cmxVar.m107717t().subscribe(mkd0.m154955G(new e30() { // from class: l.grx
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f104125a.m195170V0((List) obj);
                    }
                }));
                cmxVar.m107717t().compose(cmx.m107711n(this.f177919m)).map(new w9j() { // from class: l.hrx
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return urx.m195145i0((List) obj);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.nrx
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f140228a.m195135I0((q860) obj);
                    }
                }));
            }
            cmxVar.m107714q().subscribe(mkd0.m154955G(new e30() { // from class: l.orx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145362a.m195136J0((List) obj);
                }
            }));
            if (TextUtils.equals(this.f177913g, ygh0.f198166a) || TextUtils.equals(this.f177913g, "sign_up_select_image")) {
                str = ygh0.f198166a;
            } else if (TextUtils.equals(this.f177913g, ygh0.f198170e)) {
                str = ygh0.f198170e;
            } else if (TextUtils.equals(this.f177913g, ygh0.f198169d)) {
                str = ygh0.f198169d;
            } else if (TextUtils.equals(this.f177913g, ygh0.f198171f)) {
                str = ygh0.f198171f;
            } else if (TextUtils.equals(this.f177913g, ygh0.f198168c)) {
                str = ygh0.f198168c;
            } else {
                str = TextUtils.equals(this.f177913g, "fakeView") ? ygh0.f198172g : ygh0.f198167b;
            }
            C20496a c20496a = new C20496a(str);
            C20497b c20497b = new C20497b(str);
            C20498c c20498c = new C20498c(str);
            if (zqx.m219898k()) {
                zqx zqxVar = new zqx();
                this.f177923q = zqxVar;
                zqxVar.m219900e(act(), act().findViewById(u4c0.f174466s9), z, z2, new d30() { // from class: l.prx
                    @Override // p149l.d30
                    public final void call() {
                        this.f150955a.m195166L0(cmxVar);
                    }
                }, null, c20496a, c20497b, c20498c);
            } else {
                PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79892j(true).m79895m(new d30() { // from class: l.qrx
                    @Override // p149l.d30
                    public final void call() {
                        this.f156058a.m195167N0(cmxVar);
                    }
                }, new e30() { // from class: l.rrx
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f160796a.m195168O0((PermissionHelper.PermissionDeniedReason) obj);
                    }
                }).m79898p(c20498c).m79902t(c20497b).m79904v(c20496a).m79891i(act());
            }
        }
        ((csx) this.viewModel).m108630S(this.f177911e);
        if (CoreModule.m29931H().mo28163a().mo132031a() && TextUtils.equals(this.f177913g, "from_sign_up")) {
            ((csx) this.viewModel).m108622J(TEnum.equals(this.f177914h, "female"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m195138Q0(Throwable th) {
        ((csx) this.viewModel).m108639x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m195139R0(q860 q860Var) {
        ((csx) this.viewModel).m108640y(q860Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m195140U0(q860 q860Var) {
        ((csx) this.viewModel).m108624M(q860Var);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ q860 m195145i0(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.jrx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ q860 m195154r0(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.krx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: A0 */
    public void m195161A0(w9j<Picture, File> w9jVar) {
        this.f177918l = w9jVar;
    }

    /* JADX INFO: renamed from: C0 */
    public void m195162C0(w9j<Video, File> w9jVar) {
        this.f177919m = w9jVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m195163D0() {
        ((csx) this.viewModel).m108637v(this.f177920n);
    }

    /* JADX INFO: renamed from: E0 */
    public void m195164E0(iti itiVar) {
        ((csx) this.viewModel).m108628Q(itiVar);
        if (this.f177912f == MediaPickerAct.f30622C) {
            qib0.f154712a0.m29543y(itiVar.f114885b, false).subscribe(mkd0.m154956H(roj0.f160389b, new e30() { // from class: l.lrx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129787a.m195133G0((Throwable) obj);
                }
            }));
            ((csx) this.viewModel).m108617E(true);
        } else {
            ((csx) this.viewModel).m108635s(itiVar);
        }
        ((csx) this.viewModel).m108636u();
    }

    /* JADX INFO: renamed from: F0 */
    public void m195165F0(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str, Gender gender, String str2, boolean z5, nqh0 nqh0Var, int i3) {
        this.f177907a = i;
        this.f177908b = z;
        this.f177909c = z2;
        this.f177910d = z3;
        this.f177911e = z4;
        this.f177912f = i2;
        this.f177913g = str;
        this.f177914h = gender;
        this.f177915i = str2;
        this.f177916j = z5;
        this.f177917k = i3;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m195166L0(cmx cmxVar) {
        act().getSupportLoaderManager().mo3088e(0, null, cmxVar);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m195167N0(cmx cmxVar) {
        act().getSupportLoaderManager().mo3088e(0, null, cmxVar);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m195168O0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m195169S0(List list) {
        ((csx) this.viewModel).m108623L(list);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m195170V0(List list) {
        ((csx) this.viewModel).m108625N(list);
    }

    /* JADX INFO: renamed from: W0 */
    public void m195171W0(ArrayList<Media> arrayList) {
        this.f177920n = arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public urx m195172X0(String str) {
        this.f177922p = str;
        return this;
    }

    /* JADX INFO: renamed from: Y0 */
    public urx m195173Y0(boolean z) {
        this.f177921o = z;
        return this;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.arx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71363a.m195137P0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
