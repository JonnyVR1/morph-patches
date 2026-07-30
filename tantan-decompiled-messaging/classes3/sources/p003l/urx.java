package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.api.api.FacebookApi;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.iti;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.nqh0;
import l.nuh0;
import l.q860;
import l.qib0;
import l.roj0;
import l.u4c0;
import l.v4e;
import l.vwb;
import l.w4e;
import l.x4e;
import l.ygh0;
import l.zqx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class urx extends jq2<csx> {

    /* JADX INFO: renamed from: a */
    public int f8067a;

    /* JADX INFO: renamed from: b */
    public boolean f8068b;

    /* JADX INFO: renamed from: c */
    public boolean f8069c;

    /* JADX INFO: renamed from: d */
    public boolean f8070d;

    /* JADX INFO: renamed from: e */
    public boolean f8071e;

    /* JADX INFO: renamed from: f */
    public int f8072f;

    /* JADX INFO: renamed from: g */
    public String f8073g;

    /* JADX INFO: renamed from: h */
    public Gender f8074h;

    /* JADX INFO: renamed from: i */
    public String f8075i;

    /* JADX INFO: renamed from: j */
    public boolean f8076j;

    /* JADX INFO: renamed from: k */
    public int f8077k;

    /* JADX INFO: renamed from: l */
    public w9j<Picture, File> f8078l;

    /* JADX INFO: renamed from: m */
    public w9j<Video, File> f8079m;

    /* JADX INFO: renamed from: n */
    public ArrayList<Media> f8080n;

    /* JADX INFO: renamed from: o */
    public boolean f8081o;

    /* JADX INFO: renamed from: p */
    public String f8082p;

    /* JADX INFO: renamed from: q */
    public zqx f8083q;

    /* JADX INFO: renamed from: l.urx$a */
    public class C0581a implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8084a;

        public C0581a(String str) {
            this.f8084a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m8240a() {
            ygh0.a0(this.f8084a);
        }

        /* JADX INFO: renamed from: b */
        public void m8241b() {
            ygh0.b0(this.f8084a);
        }

        /* JADX INFO: renamed from: c */
        public void m8242c() {
            ygh0.c0(this.f8084a);
        }
    }

    /* JADX INFO: renamed from: l.urx$b */
    public class C0582b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8086a;

        public C0582b(String str) {
            this.f8086a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m8243a() {
            ygh0.U(this.f8086a);
        }

        /* JADX INFO: renamed from: b */
        public void m8244b() {
            ygh0.V(this.f8086a);
        }

        /* JADX INFO: renamed from: c */
        public void m8245c() {
            ygh0.W(this.f8086a);
        }
    }

    /* JADX INFO: renamed from: l.urx$c */
    public class C0583c implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f8088a;

        public C0583c(String str) {
            this.f8088a = str;
        }

        /* JADX INFO: renamed from: a */
        public void m8246a() {
            ygh0.i0(this.f8088a);
        }

        /* JADX INFO: renamed from: b */
        public void m8247b(boolean z) {
            ygh0.j0(this.f8088a, z);
        }

        /* JADX INFO: renamed from: c */
        public void m8248c() {
            ygh0.k0(this.f8088a);
        }
    }

    public urx(mcr mcrVar) {
        super(mcrVar);
        this.f8081o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m8198G0(Throwable th) {
        FacebookApi.m(th);
        ((csx) ((jq2) this).viewModel).m3441E(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m8199H0(q860 q860Var) {
        ((csx) ((jq2) this).viewModel).m3463w(q860Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m8200I0(q860 q860Var) {
        ((csx) ((jq2) this).viewModel).m3450O(q860Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m8201J0(List list) {
        Iterator<Media> it = this.f8080n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            final Media next = it.next();
            if (vwb.r(list, new w9j() { // from class: l.irx
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj).url.equals(next.url));
                }
            }) == null) {
                it.remove();
                z = true;
            }
        }
        if (z && (act() instanceof MediaPickerAct)) {
            act().mo831f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m8202P0(Bundle bundle) {
        String str;
        ((csx) ((jq2) this).viewModel).m3439C(this.f8072f, this.f8075i, this.f8073g, this.f8069c, this.f8067a, this.f8076j, this.f8074h);
        ((csx) ((jq2) this).viewModel).m3438B(this.f8067a);
        ((csx) ((jq2) this).viewModel).m3466z(this.f8072f, this.f8069c);
        ((csx) ((jq2) this).viewModel).m3437A(this.f8067a, this.f8072f, this.f8069c, this.f8077k, this.f8076j, this.f8074h, this.f8068b);
        if (this.f8072f == MediaPickerAct.f513C) {
            duringCreated(new v9j() { // from class: l.mrx
                @Override // p003l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return qib0.a0.l();
                }
            }).subscribe((m250) mkd0.H(new e30() { // from class: l.srx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7291a.m8199H0((q860) obj);
                }
            }, new e30() { // from class: l.trx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7715a.m8203Q0((Throwable) obj);
                }
            }));
            duringCreated(new v9j() { // from class: l.brx
                @Override // p003l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return qib0.a0.t();
                }
            }).subscribe((m250) mkd0.G(new e30() { // from class: l.crx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2766a.m8204R0((q860) obj);
                }
            }));
        } else {
            boolean z = this.f8067a > 0;
            boolean z2 = this.f8069c;
            final cmx cmxVar = new cmx(act(), z, z2);
            if (z) {
                cmxVar.m3395s().subscribe((m250<? super List<Picture>>) mkd0.G(new e30() { // from class: l.drx
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f3099a.m8234S0((List) obj);
                    }
                }));
                cmxVar.m3395s().compose(cmx.m3387n(this.f8078l)).map(new w9j() { // from class: l.erx
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return urx.m8219r0((List) obj);
                    }
                }).subscribe((m250) mkd0.G(new e30() { // from class: l.frx
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f3693a.m8205U0((q860) obj);
                    }
                }));
            }
            if (z2) {
                cmxVar.m3396t().subscribe((m250<? super List<Video>>) mkd0.G(new e30() { // from class: l.grx
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f3999a.m8235V0((List) obj);
                    }
                }));
                cmxVar.m3396t().compose(cmx.m3387n(this.f8079m)).map(new w9j() { // from class: l.hrx
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return urx.m8210i0((List) obj);
                    }
                }).subscribe((m250) mkd0.G(new e30() { // from class: l.nrx
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f5957a.m8200I0((q860) obj);
                    }
                }));
            }
            cmxVar.m3393q().subscribe((m250<? super List<Media>>) mkd0.G(new e30() { // from class: l.orx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6219a.m8201J0((List) obj);
                }
            }));
            if (TextUtils.equals(this.f8073g, ygh0.a) || TextUtils.equals(this.f8073g, "sign_up_select_image")) {
                str = ygh0.a;
            } else if (TextUtils.equals(this.f8073g, ygh0.e)) {
                str = ygh0.e;
            } else if (TextUtils.equals(this.f8073g, ygh0.d)) {
                str = ygh0.d;
            } else if (TextUtils.equals(this.f8073g, ygh0.f)) {
                str = ygh0.f;
            } else if (TextUtils.equals(this.f8073g, ygh0.c)) {
                str = ygh0.c;
            } else {
                str = TextUtils.equals(this.f8073g, "fakeView") ? ygh0.g : ygh0.b;
            }
            C0581a c0581a = new C0581a(str);
            C0582b c0582b = new C0582b(str);
            C0583c c0583c = new C0583c(str);
            if (zqx.k()) {
                zqx zqxVar = new zqx();
                this.f8083q = zqxVar;
                zqxVar.e(act(), act().findViewById(u4c0.s9), z, z2, new d30() { // from class: l.prx
                    @Override // p003l.d30
                    public final void call() {
                        this.f6496a.m8231L0(cmxVar);
                    }
                }, (e30) null, c0581a, c0582b, c0583c);
            } else {
                PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).w(false).u(true).j(true).m(new d30() { // from class: l.qrx
                    @Override // p003l.d30
                    public final void call() {
                        this.f6679a.m8232N0(cmxVar);
                    }
                }, new e30() { // from class: l.rrx
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f7055a.m8233O0((PermissionHelper.PermissionDeniedReason) obj);
                    }
                }).p(c0583c).t(c0582b).v(c0581a).i(act());
            }
        }
        ((csx) ((jq2) this).viewModel).m3454S(this.f8071e);
        if (CoreModule.H().a().a() && TextUtils.equals(this.f8073g, "from_sign_up")) {
            ((csx) ((jq2) this).viewModel).m3446J(TEnum.equals(this.f8074h, "female"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m8203Q0(Throwable th) {
        ((csx) ((jq2) this).viewModel).m3464x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m8204R0(q860 q860Var) {
        ((csx) ((jq2) this).viewModel).m3465y(q860Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m8205U0(q860 q860Var) {
        ((csx) ((jq2) this).viewModel).m3448M(q860Var);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ q860 m8210i0(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.jrx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return iti.b((nuh0) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ q860 m8219r0(List list) {
        return new q860(vwb.Q(list, new w9j() { // from class: l.krx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return iti.b((nuh0) obj);
            }
        }), (DbLinks) null);
    }

    /* JADX INFO: renamed from: A0 */
    public void m8226A0(w9j<Picture, File> w9jVar) {
        this.f8078l = w9jVar;
    }

    /* JADX INFO: renamed from: C0 */
    public void m8227C0(w9j<Video, File> w9jVar) {
        this.f8079m = w9jVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m8228D0() {
        ((csx) ((jq2) this).viewModel).m3462v(this.f8080n);
    }

    /* JADX INFO: renamed from: E0 */
    public void m8229E0(iti itiVar) {
        ((csx) ((jq2) this).viewModel).m3452Q(itiVar);
        if (this.f8072f == MediaPickerAct.f513C) {
            qib0.a0.y(itiVar.b, false).subscribe((m250) mkd0.H(roj0.b, new e30() { // from class: l.lrx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5394a.m8198G0((Throwable) obj);
                }
            }));
            ((csx) ((jq2) this).viewModel).m3441E(true);
        } else {
            ((csx) ((jq2) this).viewModel).m3460s(itiVar);
        }
        ((csx) ((jq2) this).viewModel).m3461u();
    }

    /* JADX INFO: renamed from: F0 */
    public void m8230F0(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str, Gender gender, String str2, boolean z5, nqh0 nqh0Var, int i3) {
        this.f8067a = i;
        this.f8068b = z;
        this.f8069c = z2;
        this.f8070d = z3;
        this.f8071e = z4;
        this.f8072f = i2;
        this.f8073g = str;
        this.f8074h = gender;
        this.f8075i = str2;
        this.f8076j = z5;
        this.f8077k = i3;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m8231L0(cmx cmxVar) {
        act().getSupportLoaderManager().e(0, (Bundle) null, cmxVar);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m8232N0(cmx cmxVar) {
        act().getSupportLoaderManager().e(0, (Bundle) null, cmxVar);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m8233O0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        act().finish();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m8234S0(List list) {
        ((csx) ((jq2) this).viewModel).m3447L(list);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m8235V0(List list) {
        ((csx) ((jq2) this).viewModel).m3449N(list);
    }

    /* JADX INFO: renamed from: W0 */
    public void m8236W0(ArrayList<Media> arrayList) {
        this.f8080n = arrayList;
    }

    /* JADX INFO: renamed from: X0 */
    public urx m8237X0(String str) {
        this.f8082p = str;
        return this;
    }

    /* JADX INFO: renamed from: Y0 */
    public urx m8238Y0(boolean z) {
        this.f8081o = z;
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public void m8239a0() {
        super.a0();
        creates(new e30() { // from class: l.arx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2264a.m8202P0((Bundle) obj);
            }
        });
    }

    public void destroy() {
    }
}
