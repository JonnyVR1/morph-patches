package p153l;

import android.content.Intent;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes5.dex */
public class uti implements k3m<xti> {

    /* JADX INFO: renamed from: a */
    public xti f180959a;

    /* JADX INFO: renamed from: b */
    public qid0 f180960b;

    /* JADX INFO: renamed from: c */
    public long f180961c;

    /* JADX INFO: renamed from: d */
    public jxd0 f180962d;

    /* JADX INFO: renamed from: e */
    public m8t f180963e;

    /* JADX INFO: renamed from: f */
    public Runnable f180964f;

    /* JADX INFO: renamed from: g */
    public float f180965g = 0.0f;

    /* JADX INFO: renamed from: h */
    public kwr f180966h = new kwr(new x20() { // from class: l.sti
        @Override // p153l.x20
        public final void call() {
            uti.m198042e();
        }
    });

    /* JADX INFO: renamed from: l.uti$a */
    public class C20667a implements a30<String, AudioBusinessType, String> {
        public C20667a() {
        }

        @Override // p153l.a30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo37058a(String str, AudioBusinessType audioBusinessType, String str2) {
            if (str == null || !(str2.startsWith("PhotoAlbumFeedPreviewAdapter") || str2.startsWith("NewMeetAct"))) {
                uti.this.m198051v(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.uti$b */
    public class C20668b implements z20<String, AudioBusinessType> {
        public C20668b() {
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            uti.this.m198053K0(true, true);
        }
    }

    /* JADX INFO: renamed from: l.uti$c */
    public class C20669c implements z20<String, AudioBusinessType> {
        public C20669c() {
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            if (str == null || !(str.startsWith("PhotoAlbumFeedPreviewAdapter") || str.startsWith("NewMeetAct"))) {
                if (audioBusinessType != AudioBusinessType.NORMAL || str.startsWith("PlayerView")) {
                    uti.this.m198053K0(true, true);
                } else {
                    uti.this.m198051v(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.uti$d */
    public class C20670d extends msf0 {
        public C20670d() {
        }

        @Override // p153l.v120
        /* JADX INFO: renamed from: a */
        public void mo174618a(boolean z) {
            uti.this.f180960b.m176742y0(z);
        }

        @Override // p153l.v120
        /* JADX INFO: renamed from: b */
        public boolean mo174619b() {
            return uti.this.f180962d.get().booleanValue();
        }

        @Override // p153l.msf0
        /* JADX INFO: renamed from: c */
        public void mo159783c(boolean z) {
            uti.this.m198048n(z);
        }

        @Override // p153l.msf0
        /* JADX INFO: renamed from: d */
        public void mo159784d(boolean z, boolean z2, BLiveAbsData bLiveAbsData, Boolean bool) {
            uti.this.m198053K0(z, z2);
        }
    }

    /* JADX INFO: renamed from: l.uti$e */
    public class C20671e implements eti {
        public C20671e() {
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: a */
        public void mo120250a() {
            uti.this.m198056q();
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: b */
        public void mo120251b(boolean z) {
            uti.this.m198049r(true, true, true);
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: c */
        public void mo120252c(boolean z) {
            uti.this.f180962d.put(Boolean.valueOf(!z));
            uti.this.f180960b.m176742y0(uti.this.f180962d.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m198042e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m198048n(boolean z) {
        if (!z) {
            this.f180959a.m213091c();
        } else {
            if (nti.m164730d().m164732b(zrv.f205803e)) {
                this.f180959a.m213095j();
                return;
            }
            Runnable runnable = new Runnable() { // from class: l.tti
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176075a.m198058t();
                }
            };
            this.f180964f = runnable;
            l51.m152888H(zrv.f205803e, runnable, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m198049r(boolean z, boolean z2, boolean z3) {
        fhw.m125605a("live_float_window", "dismiss:" + z + z2 + z3);
        xti xtiVar = this.f180959a;
        if (xtiVar == null || !xtiVar.m213093f() || this.f180960b == null) {
            return;
        }
        lwr.m156093a();
        this.f180960b.m176740w0(z, z2, !z3);
        if (!z3) {
            iti.m142051c().m142053b();
            this.f180960b = null;
        }
        iti.m142051c().m142054d(z3);
        m8t m8tVar = this.f180963e;
        if (m8tVar != null) {
            m8tVar.m157502d();
            this.f180963e = null;
        }
        this.f180959a.destroy();
        this.f180959a = null;
        Runnable runnable = this.f180964f;
        if (runnable != null) {
            l51.m152890J(runnable);
            this.f180964f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m198050u(nsf0.C18943a c18943a) {
        float f = c18943a.f143498a;
        this.f180965g = f;
        int[] iArrM202673a = vti.m202673a(f);
        this.f180959a.m213096k(iArrM202673a[0], iArrM202673a[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m198051v(boolean z) {
        if (this.f180959a == null) {
            return;
        }
        if (z) {
            lwr.m156100h(this.f180966h);
        }
        m198048n(z);
        qid0 qid0Var = this.f180960b;
        if (qid0Var != null) {
            qid0Var.m176742y0(!z || this.f180962d.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: G1 */
    public void m198052G1() {
        lwr.m156098f(this.f180966h);
    }

    /* JADX INFO: renamed from: K0 */
    public void m198053K0(boolean z, boolean z2) {
        m198049r(z, z2, false);
    }

    /* JADX INFO: renamed from: m */
    public void m198054m(xti xtiVar) {
        this.f180959a = xtiVar;
    }

    /* JADX INFO: renamed from: o */
    public eti m198055o() {
        return new C20671e();
    }

    /* JADX INFO: renamed from: q */
    public void m198056q() {
        qid0 qid0Var = this.f180960b;
        if (qid0Var == null) {
            return;
        }
        oo2 oo2VarM176703L = qid0Var.m176703L();
        o5c.m166095a().m166097c(oo2VarM176703L);
        fhw.m125605a("live_float_window", "openBigWindow.roomState:" + oo2VarM176703L.m202193m());
        BLiveAbsData bLiveAbsDataMo183435j = oo2VarM176703L.mo183435j();
        String strM176701J = this.f180960b.m176701J();
        String strM176699H = this.f180960b.m176699H();
        m198053K0(false, false);
        Intent intentM219041a = z91.m219041a(zrv.f205803e, AudienceStartData.getBuilder().m68776D(bLiveAbsDataMo183435j).m68774B(true).m68787O(strM176701J).m68798y(strM176699H).m68794u());
        intentM219041a.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        zrv.f205803e.startActivity(intentM219041a);
    }

    /* JADX INFO: renamed from: s */
    public float m198057s() {
        return this.f180965g;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m198058t() {
        this.f180964f = null;
        if (!nti.m164730d().m164732b(zrv.f205803e)) {
            m198053K0(true, true);
        } else {
            if (this.f180963e.m157506h()) {
                return;
            }
            this.f180959a.m213095j();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m198059w(hti htiVar) {
        if (this.f180959a.m213093f()) {
            return;
        }
        this.f180965g = htiVar.m137082g();
        if (this.f180959a.m213095j()) {
            this.f180962d = ((ifv) zrv.m221194l(htd0.f111523e)).f114711t;
            nsf0 nsf0Var = new nsf0();
            this.f180960b = new qid0(nsf0Var, htiVar.m137080e(), new ngj0(this.f180959a.m213092d(), this.f180962d, htiVar.m137078c(), htiVar.m137076a()), new z20() { // from class: l.pti
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f154077a.m198053K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            });
            nsf0Var.m164594a().distinctUntilChanged(new qcj() { // from class: l.qti
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Float.valueOf(((nsf0.C18943a) obj).f143498a);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.rti
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164819a.m198050u((nsf0.C18943a) obj);
                }
            }));
            this.f180966h.m151736f(new C20667a());
            this.f180966h.m151735e(new C20668b());
            this.f180966h.m151737g(new C20669c());
            this.f180960b.m176706O(htiVar.m137079d());
            this.f180963e = new m8t(new C20670d());
            this.f180959a.m213094i();
            this.f180961c = pzi0.m174454o();
        }
    }
}
