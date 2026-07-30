package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public class pzs implements k3m<tzs> {

    /* JADX INFO: renamed from: a */
    public tzs f154963a;

    /* JADX INFO: renamed from: b */
    public qid0 f154964b;

    /* JADX INFO: renamed from: c */
    public jxd0 f154965c;

    /* JADX INFO: renamed from: d */
    public m8t f154966d;

    /* JADX INFO: renamed from: g */
    public hti<?> f154969g;

    /* JADX INFO: renamed from: h */
    public kcg0 f154970h;

    /* JADX INFO: renamed from: e */
    public float f154967e = 0.0f;

    /* JADX INFO: renamed from: f */
    public kwr f154968f = new kwr(new x20() { // from class: l.jzs
        @Override // p153l.x20
        public final void call() {
            pzs.m174595d();
        }
    });

    /* JADX INFO: renamed from: i */
    public eti f154971i = new C19479e();

    /* JADX INFO: renamed from: l.pzs$a */
    public class C19475a implements a30<String, AudioBusinessType, String> {
        public C19475a() {
        }

        @Override // p153l.a30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo37058a(String str, AudioBusinessType audioBusinessType, String str2) {
            if (str == null || !(str2.startsWith("PhotoAlbumFeedPreviewAdapter") || str2.startsWith("NewMeetAct"))) {
                pzs.this.m174613w(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.pzs$b */
    public class C19476b implements z20<String, AudioBusinessType> {
        public C19476b() {
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            pzs.this.m174604K0(true, true);
        }
    }

    /* JADX INFO: renamed from: l.pzs$c */
    public class C19477c implements z20<String, AudioBusinessType> {
        public C19477c() {
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            if (str == null || !(str.startsWith("PhotoAlbumFeedPreviewAdapter") || str.startsWith("NewMeetAct"))) {
                if (audioBusinessType != AudioBusinessType.NORMAL || str.startsWith("PlayerView")) {
                    pzs.this.m174604K0(true, true);
                } else {
                    pzs.this.m174613w(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.pzs$d */
    public class C19478d extends msf0 {
        public C19478d() {
        }

        @Override // p153l.v120
        /* JADX INFO: renamed from: a */
        public void mo174618a(boolean z) {
            pzs.this.f154964b.m176742y0(z);
        }

        @Override // p153l.v120
        /* JADX INFO: renamed from: b */
        public boolean mo174619b() {
            return pzs.this.f154965c.get().booleanValue();
        }

        @Override // p153l.msf0
        /* JADX INFO: renamed from: c */
        public void mo159783c(boolean z) {
            pzs.this.m174606o(z);
        }

        @Override // p153l.msf0
        /* JADX INFO: renamed from: d */
        public void mo159784d(boolean z, boolean z2, BLiveAbsData bLiveAbsData, Boolean bool) {
            pzs.this.m174604K0(z, z2);
        }
    }

    /* JADX INFO: renamed from: l.pzs$e */
    public class C19479e implements eti {
        public C19479e() {
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: a */
        public void mo120250a() {
            pzs.this.m174607q();
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: b */
        public void mo120251b(boolean z) {
            pzs.this.m174608r(true, true, true);
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: c */
        public void mo120252c(boolean z) {
            pzs.this.f154965c.put(Boolean.valueOf(!z));
            pzs.this.f154964b.m176742y0(pzs.this.f154965c.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m174595d() {
    }

    /* JADX INFO: renamed from: G1 */
    public void m174603G1() {
        lwr.m156098f(this.f154968f);
    }

    /* JADX INFO: renamed from: K0 */
    public void m174604K0(boolean z, boolean z2) {
        m174608r(z, z2, false);
    }

    /* JADX INFO: renamed from: n */
    public void m174605n(tzs tzsVar) {
        this.f154963a = tzsVar;
    }

    /* JADX INFO: renamed from: o */
    public final void m174606o(boolean z) {
        if (z) {
            this.f154963a.m193733k();
        } else {
            l51.m152887G(new Runnable() { // from class: l.ozs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f149950a.m174610t();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public void m174607q() {
        qid0 qid0Var = this.f154964b;
        if (qid0Var == null) {
            return;
        }
        oo2 oo2VarM176703L = qid0Var.m176703L();
        o5c.m166095a().m166097c(oo2VarM176703L);
        fhw.m125605a("live_float_window", "openBigWindow.roomState:" + oo2VarM176703L.m202193m());
        BLiveAbsData bLiveAbsDataMo183435j = oo2VarM176703L.mo183435j();
        String strM176701J = this.f154964b.m176701J();
        String strM176699H = this.f154964b.m176699H();
        m174604K0(false, false);
        Intent intentM219041a = z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68776D(bLiveAbsDataMo183435j).m68774B(true).m68787O(strM176701J).m68798y(strM176699H).m68794u());
        intentM219041a.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        zrv.f205803e.startActivity(intentM219041a);
    }

    /* JADX INFO: renamed from: r */
    public final void m174608r(boolean z, boolean z2, boolean z3) {
        psd0.m173633z(this.f154970h);
        fhw.m125605a("live_float_window", "dismiss:" + z + z2 + z3);
        if (this.f154964b != null) {
            lwr.m156093a();
            this.f154964b.m176740w0(z, z2, !z3);
            if (!z3) {
                iti.m142051c().m142053b();
            }
            this.f154964b = null;
        }
        iti.m142051c().m142054d(z3);
        m8t m8tVar = this.f154966d;
        if (m8tVar != null) {
            m8tVar.m157502d();
            this.f154966d = null;
        }
        tzs tzsVar = this.f154963a;
        if (tzsVar != null) {
            tzsVar.destroy();
            this.f154963a = null;
        }
        this.f154969g = null;
    }

    /* JADX INFO: renamed from: s */
    public float m174609s() {
        return this.f154967e;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m174610t() {
        tzs tzsVar = this.f154963a;
        if (tzsVar != null) {
            tzsVar.m193730f();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m174611u(nsf0.C18943a c18943a) {
        float f = c18943a.f143498a;
        this.f154967e = f;
        int[] iArrM202673a = vti.m202673a(f);
        this.f154963a.m193734l(iArrM202673a[0], iArrM202673a[1]);
    }

    /* JADX INFO: renamed from: v */
    public final void m174612v(boolean z) {
        tzs tzsVar;
        if (!z) {
            if (pzm.m174537c().m174542f(this.f154969g, false)) {
                this.f154963a.m193727c(false);
            }
        } else {
            if (this.f154964b.m176702K() == null || (tzsVar = this.f154963a) == null) {
                return;
            }
            tzsVar.m193727c(true);
            this.f154964b.m176702K().mo178524d(this.f154963a.m193729e().getPlayerContainer());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m174613w(boolean z) {
        if (this.f154963a == null) {
            return;
        }
        if (z) {
            lwr.m156100h(this.f154968f);
        }
        m174606o(z);
        qid0 qid0Var = this.f154964b;
        if (qid0Var != null) {
            qid0Var.m176742y0(!z || this.f154965c.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m174614x(hti<?> htiVar) {
        this.f154969g = htiVar;
        this.f154965c = ((ifv) zrv.m221194l(htd0.f111523e)).f114711t;
        if (this.f154963a.m193731i()) {
            nsh0.m164608j("live_float_window", "float has shown in app");
            return;
        }
        this.f154967e = htiVar.m137082g();
        if (!this.f154963a.m193733k()) {
            nsh0.m164608j("live_float_window", "show float fail in app");
            return;
        }
        nsh0.m164608j("live_float_window", "show float success in app");
        nsf0 nsf0Var = new nsf0();
        this.f154964b = new qid0(nsf0Var, htiVar.m137080e(), new ngj0(this.f154963a.m193729e(), this.f154965c, htiVar.m137078c(), htiVar.m137076a()), new z20() { // from class: l.kzs
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f129452a.m174604K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
        nsf0Var.m164594a().distinctUntilChanged(new qcj() { // from class: l.lzs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Float.valueOf(((nsf0.C18943a) obj).f143498a);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.mzs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139551a.m174611u((nsf0.C18943a) obj);
            }
        }));
        this.f154968f.m151736f(new C19475a());
        this.f154968f.m151735e(new C19476b());
        this.f154968f.m151737g(new C19477c());
        this.f154964b.m176706O(htiVar.m137079d());
        this.f154966d = new m8t(new C19478d());
        this.f154970h = Act.front().distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.nzs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144470a.m174612v(((Boolean) obj).booleanValue());
            }
        }));
    }
}
