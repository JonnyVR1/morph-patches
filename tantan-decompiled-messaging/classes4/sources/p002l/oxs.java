package p002l;

import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.ffw;
import l.fld0;
import l.g30;
import l.gkh0;
import l.hdv;
import l.hfw;
import l.hpd0;
import l.jur;
import l.kur;
import l.mkd0;
import l.q0m;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oxs implements q0m<sxs> {

    /* JADX INFO: renamed from: a */
    public sxs f16892a;

    /* JADX INFO: renamed from: b */
    public nad0 f16893b;

    /* JADX INFO: renamed from: c */
    public hpd0 f16894c;

    /* JADX INFO: renamed from: d */
    public l6t f16895d;

    /* JADX INFO: renamed from: g */
    public lqi<?> f16898g;

    /* JADX INFO: renamed from: h */
    public c4g0 f16899h;

    /* JADX INFO: renamed from: e */
    public float f16896e = 0.0f;

    /* JADX INFO: renamed from: f */
    public jur f16897f = new jur(new d30() { // from class: l.ixs
        public final void call() {
            oxs.m19873d();
        }
    });

    /* JADX INFO: renamed from: i */
    public iqi f16900i = new C0736e();

    /* JADX INFO: renamed from: l.oxs$a */
    public class C0732a implements g30<String, AudioBusinessType, String> {
        public C0732a() {
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m19893a(String str, AudioBusinessType audioBusinessType, String str2) {
            if (str == null || !(str2.startsWith("PhotoAlbumFeedPreviewAdapter") || str2.startsWith("NewMeetAct"))) {
                oxs.this.m19891w(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.oxs$b */
    public class C0733b implements f30<String, AudioBusinessType> {
        public C0733b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            oxs.this.m19882K0(true, true);
        }
    }

    /* JADX INFO: renamed from: l.oxs$c */
    public class C0734c implements f30<String, AudioBusinessType> {
        public C0734c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            if (str == null || !(str.startsWith("PhotoAlbumFeedPreviewAdapter") || str.startsWith("NewMeetAct"))) {
                if (audioBusinessType != AudioBusinessType.NORMAL || str.startsWith("PlayerView")) {
                    oxs.this.m19882K0(true, true);
                } else {
                    oxs.this.m19891w(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.oxs$d */
    public class C0735d extends dkf0 {
        public C0735d() {
        }

        @Override // p002l.nt10
        /* JADX INFO: renamed from: a */
        public void mo18909a(boolean z) {
            oxs.this.f16893b.m18627y0(z);
        }

        @Override // p002l.nt10
        /* JADX INFO: renamed from: b */
        public boolean mo18978b() {
            return ((Boolean) oxs.this.f16894c.get()).booleanValue();
        }

        @Override // p002l.dkf0
        /* JADX INFO: renamed from: c */
        public void mo11926c(boolean z) {
            oxs.this.m19884o(z);
        }

        @Override // p002l.dkf0
        /* JADX INFO: renamed from: d */
        public void mo11927d(boolean z, boolean z2, BLiveAbsData bLiveAbsData, Boolean bool) {
            oxs.this.m19882K0(z, z2);
        }
    }

    /* JADX INFO: renamed from: l.oxs$e */
    public class C0736e implements iqi {
        public C0736e() {
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: a */
        public void mo11697a() {
            oxs.this.m19885q();
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: b */
        public void mo11698b(boolean z) {
            oxs.this.m19886r(true, true, true);
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: c */
        public void mo11699c(boolean z) {
            oxs.this.f16894c.put(Boolean.valueOf(!z));
            oxs.this.f16893b.m18627y0(((Boolean) oxs.this.f16894c.get()).booleanValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m19873d() {
    }

    /* JADX INFO: renamed from: G1 */
    public void m19881G1() {
        kur.f(this.f16897f);
    }

    /* JADX INFO: renamed from: K0 */
    public void m19882K0(boolean z, boolean z2) {
        m19886r(z, z2, false);
    }

    /* JADX INFO: renamed from: n */
    public void m19883n(sxs sxsVar) {
        this.f16892a = sxsVar;
    }

    /* JADX INFO: renamed from: o */
    public final void m19884o(boolean z) {
        if (z) {
            this.f16892a.m22753k();
        } else {
            e51.G(new Runnable() { // from class: l.nxs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16302a.m19888t();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public void m19885q() {
        nad0 nad0Var = this.f16893b;
        if (nad0Var == null) {
            return;
        }
        ho2 ho2VarM18588L = nad0Var.m18588L();
        g4c.m13625a().m13627c(ho2VarM18588L);
        hfw.a("live_float_window", "openBigWindow.roomState:" + ho2VarM18588L.m17237m());
        BLiveAbsData bLiveAbsDataM17234j = ho2VarM18588L.m17234j();
        String strM18586J = this.f16893b.m18586J();
        String strM18584H = this.f16893b.m18584H();
        m19882K0(false, false);
        Intent intentM22252a = s91.m22252a(ypv.e, AudienceStartData.getBuilder().D(bLiveAbsDataM17234j).B(true).O(strM18586J).y(strM18584H).u());
        intentM22252a.addFlags(268435456);
        ypv.e.startActivity(intentM22252a);
    }

    /* JADX INFO: renamed from: r */
    public final void m19886r(boolean z, boolean z2, boolean z3) {
        mkd0.z(this.f16899h);
        hfw.a("live_float_window", "dismiss:" + z + z2 + z3);
        if (this.f16893b != null) {
            kur.a();
            this.f16893b.m18625w0(z, z2, !z3);
            if (!z3) {
                mqi.m18135c().m18137b();
            }
            this.f16893b = null;
        }
        mqi.m18135c().m18138d(z3);
        l6t l6tVar = this.f16895d;
        if (l6tVar != null) {
            l6tVar.m17022d();
            this.f16895d = null;
        }
        sxs sxsVar = this.f16892a;
        if (sxsVar != null) {
            sxsVar.destroy();
            this.f16892a = null;
        }
        this.f16898g = null;
    }

    /* JADX INFO: renamed from: s */
    public float m19887s() {
        return this.f16896e;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m19888t() {
        sxs sxsVar = this.f16892a;
        if (sxsVar != null) {
            sxsVar.m22749f();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m19889u(ekf0.C0546a c0546a) {
        float f = c0546a.f9838a;
        this.f16896e = f;
        int[] iArrM27502a = zqi.m27502a(f);
        this.f16892a.m22754l(iArrM27502a[0], iArrM27502a[1]);
    }

    /* JADX INFO: renamed from: v */
    public final void m19890v(boolean z) {
        sxs sxsVar;
        if (!z) {
            if (pxm.m20743c().m20748f(this.f16898g, false)) {
                this.f16892a.m22746c(false);
            }
        } else {
            if (this.f16893b.m18587K() == null || (sxsVar = this.f16892a) == null) {
                return;
            }
            sxsVar.m22746c(true);
            this.f16893b.m18587K().d(this.f16892a.m22748e().getPlayerContainer());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m19891w(boolean z) {
        if (this.f16892a == null) {
            return;
        }
        if (z) {
            kur.h(this.f16897f);
        }
        m19884o(z);
        nad0 nad0Var = this.f16893b;
        if (nad0Var != null) {
            nad0Var.m18627y0(!z || ((Boolean) this.f16894c.get()).booleanValue());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m19892x(lqi<?> lqiVar) {
        this.f16898g = lqiVar;
        this.f16894c = ((hdv) ypv.l(fld0.e)).t;
        if (this.f16892a.m22750i()) {
            gkh0.j("live_float_window", "float has shown in app");
            return;
        }
        this.f16896e = lqiVar.m17382g();
        if (!this.f16892a.m22753k()) {
            gkh0.j("live_float_window", "show float fail in app");
            return;
        }
        gkh0.j("live_float_window", "show float success in app");
        ekf0 ekf0Var = new ekf0();
        this.f16893b = new nad0(ekf0Var, lqiVar.m17380e(), new j7j0(this.f16892a.m22748e(), this.f16894c, lqiVar.m17378c(), lqiVar.m17376a()), new f30() { // from class: l.jxs
            public final void call(Object obj, Object obj2) {
                this.f14126a.m19882K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
        ekf0Var.m12572a().distinctUntilChanged(new w9j() { // from class: l.kxs
            public final Object call(Object obj) {
                return Float.valueOf(((ekf0.C0546a) obj).f9838a);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.lxs
            public final void call(Object obj) {
                this.f15118a.m19889u((ekf0.C0546a) obj);
            }
        }));
        this.f16897f.f(new C0732a());
        this.f16897f.e(new C0733b());
        this.f16897f.g(new C0734c());
        this.f16893b.m18591O(lqiVar.m17379d());
        this.f16895d = new l6t(new C0735d());
        this.f16899h = Act.front().distinctUntilChanged().subscribe(ffw.h(new e30() { // from class: l.mxs
            public final void call(Object obj) {
                this.f15739a.m19890v(((Boolean) obj).booleanValue());
            }
        }));
    }
}
