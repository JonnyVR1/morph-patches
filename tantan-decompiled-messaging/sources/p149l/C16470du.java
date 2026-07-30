package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaPickerAct;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.du */
/* JADX INFO: loaded from: classes9.dex */
public class C16470du extends jq2<C17860ju> {

    /* JADX INFO: renamed from: a */
    public int f87920a;

    /* JADX INFO: renamed from: b */
    public boolean f87921b;

    /* JADX INFO: renamed from: c */
    public boolean f87922c;

    /* JADX INFO: renamed from: d */
    public boolean f87923d;

    /* JADX INFO: renamed from: e */
    public boolean f87924e;

    /* JADX INFO: renamed from: f */
    public int f87925f;

    /* JADX INFO: renamed from: g */
    public String f87926g;

    /* JADX INFO: renamed from: h */
    public Gender f87927h;

    /* JADX INFO: renamed from: i */
    public String f87928i;

    /* JADX INFO: renamed from: j */
    public boolean f87929j;

    /* JADX INFO: renamed from: k */
    public int f87930k;

    /* JADX INFO: renamed from: l */
    public w9j<Picture, File> f87931l;

    /* JADX INFO: renamed from: m */
    public w9j<Video, File> f87932m;

    /* JADX INFO: renamed from: n */
    public ArrayList<Media> f87933n;

    /* JADX INFO: renamed from: o */
    public boolean f87934o;

    /* JADX INFO: renamed from: p */
    public boolean f87935p;

    /* JADX INFO: renamed from: q */
    public String f87936q;

    /* JADX INFO: renamed from: l.du$a */
    public class a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qgh0 f87937a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f87938b;

        public a(qgh0 qgh0Var, String str) {
            this.f87937a = qgh0Var;
            this.f87938b = str;
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
            this.f87937a.m174421i(this.f87938b);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            this.f87937a.m174422j(this.f87938b, z);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
            this.f87937a.m174423k(this.f87938b);
        }
    }

    /* JADX INFO: renamed from: l.du$b */
    public class b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qgh0 f87940a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f87941b;

        public b(qgh0 qgh0Var, String str) {
            this.f87940a = qgh0Var;
            this.f87941b = str;
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
            this.f87940a.m174415c(this.f87941b);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            this.f87940a.m174416d(this.f87941b);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
            this.f87940a.m174417e(this.f87941b);
        }
    }

    /* JADX INFO: renamed from: l.du$c */
    public class c implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qgh0 f87943a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f87944b;

        public c(qgh0 qgh0Var, String str) {
            this.f87943a = qgh0Var;
            this.f87944b = str;
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
            this.f87943a.m174418f(this.f87944b);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            this.f87943a.m174419g(this.f87944b);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
            this.f87943a.m174420h(this.f87944b);
        }
    }

    public C16470du(mcr mcrVar) {
        super(mcrVar);
        this.f87935p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m113619P0(Throwable th) {
        ((C17860ju) this.viewModel).m143207w();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ q860 m113620e0(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.tt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ q860 m113635t0(List list) {
        return new q860(vwb.m200303Q(list, new w9j() { // from class: l.rt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138200b((nuh0) obj);
            }
        }), null);
    }

    /* JADX INFO: renamed from: A0 */
    public void m113640A0(w9j<Picture, File> w9jVar) {
        this.f87931l = w9jVar;
    }

    /* JADX INFO: renamed from: C0 */
    public void m113641C0(w9j<Video, File> w9jVar) {
        this.f87932m = w9jVar;
    }

    /* JADX INFO: renamed from: D0 */
    public void m113642D0(iti itiVar) {
        ((C17860ju) this.viewModel).m143197M(itiVar);
        if (this.f87925f == AccountMediaPickerAct.f17012B) {
            qib0.f154712a0.m29543y(itiVar.f114885b, false).subscribe(mkd0.m154956H(roj0.f160389b, new e30() { // from class: l.ut
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178216a.m113644F0((Throwable) obj);
                }
            }));
            ((C17860ju) this.viewModel).m143187B(true);
        } else {
            ((C17860ju) this.viewModel).m143204s(itiVar);
        }
        ((C17860ju) this.viewModel).m143205u();
    }

    /* JADX INFO: renamed from: E0 */
    public void m113643E0(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str, Gender gender, String str2, boolean z5, nqh0 nqh0Var, int i3, boolean z6) {
        this.f87920a = i;
        this.f87921b = z;
        this.f87922c = z2;
        this.f87923d = z3;
        this.f87924e = z4;
        this.f87925f = i2;
        this.f87926g = str;
        this.f87927h = gender;
        this.f87928i = str2;
        this.f87929j = z5;
        this.f87930k = i3;
        this.f87934o = z6;
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m113644F0(Throwable th) {
        FacebookApi.m29530m(th);
        ((C17860ju) this.viewModel).m143187B(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m113645G0(q860 q860Var) {
        ((C17860ju) this.viewModel).m143206v(q860Var);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m113646H0(q860 q860Var) {
        ((C17860ju) this.viewModel).m143195K(q860Var);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m113647I0(List list) {
        Iterator<Media> it = this.f87933n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            final Media next = it.next();
            if (vwb.m200346r(list, new w9j() { // from class: l.st
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj).url.equals(next.url));
                }
            }) == null) {
                it.remove();
                z = true;
            }
        }
        if (z && (act() instanceof AccountMediaPickerAct)) {
            ((AccountMediaPickerAct) act()).mo29185f();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m113648J0(fmx fmxVar) {
        act().getSupportLoaderManager().mo3088e(0, null, fmxVar);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m113649L0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m113650N0(d30 d30Var) {
        ((C17860ju) this.viewModel).m143203q();
        d30Var.call();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m113651O0(Bundle bundle) {
        ((C17860ju) this.viewModel).m143186A(this.f87925f, this.f87928i, this.f87926g, this.f87922c, this.f87920a, this.f87929j, this.f87927h);
        ((C17860ju) this.viewModel).m143209y(this.f87925f, this.f87922c);
        ((C17860ju) this.viewModel).m143210z(this.f87920a, this.f87925f, this.f87922c, this.f87930k, this.f87929j, this.f87927h, this.f87921b, this.f87934o);
        if (this.f87925f == AccountMediaPickerAct.f17012B) {
            duringCreated(new v9j() { // from class: l.vt
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return qib0.f154712a0.m29531l();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.bu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77273a.m113645G0((q860) obj);
                }
            }, new e30() { // from class: l.cu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82517a.m113619P0((Throwable) obj);
                }
            }));
            duringCreated(new v9j() { // from class: l.kt
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return qib0.f154712a0.m29538t();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.lt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129920a.m113652Q0((q860) obj);
                }
            }));
        } else {
            boolean z = this.f87920a > 0;
            boolean z2 = this.f87922c;
            final fmx fmxVar = new fmx(act(), z, z2, true, 200);
            if (z) {
                fmxVar.m122287t().subscribe(mkd0.m154955G(new e30() { // from class: l.mt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f135545a.m113653R0(fmxVar, (List) obj);
                    }
                }));
                fmxVar.m122287t().compose(fmx.m122281n(this.f87931l)).map(new w9j() { // from class: l.nt
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C16470du.m113620e0((List) obj);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.ot
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f145525a.m113654S0((q860) obj);
                    }
                }));
            }
            if (z2) {
                fmxVar.m122288u().subscribe(mkd0.m154955G(new e30() { // from class: l.pt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f151083a.m113655U0(fmxVar, (List) obj);
                    }
                }));
                fmxVar.m122288u().compose(fmx.m122281n(this.f87932m)).map(new w9j() { // from class: l.qt
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C16470du.m113635t0((List) obj);
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.wt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f187988a.m113646H0((q860) obj);
                    }
                }));
            }
            fmxVar.m122285r().subscribe(mkd0.m154955G(new e30() { // from class: l.xt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194343a.m113647I0((List) obj);
                }
            }));
            qgh0 qgh0Var = new qgh0();
            String str = this.f87926g;
            String str2 = VerifyReason.signup;
            if (!TextUtils.equals(str, VerifyReason.signup) && !TextUtils.equals(this.f87926g, "sign_up_select_image")) {
                str2 = this.f87926g;
            }
            final d30 d30Var = new d30() { // from class: l.yt
                @Override // p149l.d30
                public final void call() {
                    this.f199877a.m113648J0(fmxVar);
                }
            };
            e30<PermissionHelper.PermissionDeniedReason> e30Var = new e30() { // from class: l.zt
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204654a.m113649L0((PermissionHelper.PermissionDeniedReason) obj);
                }
            };
            a aVar = new a(qgh0Var, str2);
            b bVar = new b(qgh0Var, str2);
            c cVar = new c(qgh0Var, str2);
            if (zqx.m219898k()) {
                new zqx().m219900e(act(), act().findViewById(q4c0.f152565I), z, z2, new d30() { // from class: l.au
                    @Override // p149l.d30
                    public final void call() {
                        this.f71695a.m113650N0(d30Var);
                    }
                }, null, cVar, bVar, aVar);
            } else {
                PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79892j(true).m79895m(d30Var, e30Var).m79898p(aVar).m79902t(bVar).m79904v(cVar).m79891i(act());
            }
        }
        ((C17860ju) this.viewModel).m143198N(this.f87924e);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m113652Q0(q860 q860Var) {
        ((C17860ju) this.viewModel).m143208x(q860Var);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m113653R0(fmx fmxVar, List list) {
        zvf0.m220371D("e_picture_selection_photo_num", "p_picture_selection_view", j760.m140076a("have_photo_or_not", list.size() > 0 ? "yes" : "no"));
        if (zqx.m219898k()) {
            ((C17860ju) this.viewModel).m143203q();
        }
        ((C17860ju) this.viewModel).m143192H(list);
        if (fmxVar.f98386g && NullChecker.m81303a(act())) {
            act().getSupportLoaderManager().mo3088e(0, null, fmxVar);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m113654S0(q860 q860Var) {
        ((C17860ju) this.viewModel).m143193I(q860Var);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m113655U0(fmx fmxVar, List list) {
        ((C17860ju) this.viewModel).m143194J(list);
        if (fmxVar.f98386g && NullChecker.m81303a(act())) {
            act().getSupportLoaderManager().mo3088e(0, null, fmxVar);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m113656V0(ArrayList<Media> arrayList) {
        this.f87933n = arrayList;
    }

    /* JADX INFO: renamed from: W0 */
    public C16470du m113657W0(String str) {
        this.f87936q = str;
        return this;
    }

    /* JADX INFO: renamed from: X0 */
    public C16470du m113658X0(boolean z) {
        this.f87935p = z;
        return this;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.jt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119562a.m113651O0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
