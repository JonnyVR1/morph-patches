package p002l;

import android.content.Intent;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.ffw;
import l.fld0;
import l.g30;
import l.hdv;
import l.hfw;
import l.hpd0;
import l.jur;
import l.kur;
import l.mqi0;
import l.q0m;
import l.rqi;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yqi implements q0m<bri> {

    /* JADX INFO: renamed from: a */
    public bri f23038a;

    /* JADX INFO: renamed from: b */
    public nad0 f23039b;

    /* JADX INFO: renamed from: c */
    public long f23040c;

    /* JADX INFO: renamed from: d */
    public hpd0 f23041d;

    /* JADX INFO: renamed from: e */
    public l6t f23042e;

    /* JADX INFO: renamed from: f */
    public Runnable f23043f;

    /* JADX INFO: renamed from: g */
    public float f23044g = 0.0f;

    /* JADX INFO: renamed from: h */
    public jur f23045h = new jur(new d30() { // from class: l.wqi
        public final void call() {
            yqi.m26890e();
        }
    });

    /* JADX INFO: renamed from: l.yqi$a */
    public class C0927a implements g30<String, AudioBusinessType, String> {
        public C0927a() {
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void m26908a(String str, AudioBusinessType audioBusinessType, String str2) {
            if (str == null || !(str2.startsWith("PhotoAlbumFeedPreviewAdapter") || str2.startsWith("NewMeetAct"))) {
                yqi.this.m26899v(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.yqi$b */
    public class C0928b implements f30<String, AudioBusinessType> {
        public C0928b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            yqi.this.m26901K0(true, true);
        }
    }

    /* JADX INFO: renamed from: l.yqi$c */
    public class C0929c implements f30<String, AudioBusinessType> {
        public C0929c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            if (str == null || !(str.startsWith("PhotoAlbumFeedPreviewAdapter") || str.startsWith("NewMeetAct"))) {
                if (audioBusinessType != AudioBusinessType.NORMAL || str.startsWith("PlayerView")) {
                    yqi.this.m26901K0(true, true);
                } else {
                    yqi.this.m26899v(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yqi$d */
    public class C0930d extends dkf0 {
        public C0930d() {
        }

        @Override // p002l.nt10
        /* JADX INFO: renamed from: a */
        public void mo18909a(boolean z) {
            yqi.this.f23039b.m18627y0(z);
        }

        @Override // p002l.nt10
        /* JADX INFO: renamed from: b */
        public boolean mo18978b() {
            return ((Boolean) yqi.this.f23041d.get()).booleanValue();
        }

        @Override // p002l.dkf0
        /* JADX INFO: renamed from: c */
        public void mo11926c(boolean z) {
            yqi.this.m26896n(z);
        }

        @Override // p002l.dkf0
        /* JADX INFO: renamed from: d */
        public void mo11927d(boolean z, boolean z2, BLiveAbsData bLiveAbsData, Boolean bool) {
            yqi.this.m26901K0(z, z2);
        }
    }

    /* JADX INFO: renamed from: l.yqi$e */
    public class C0931e implements iqi {
        public C0931e() {
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: a */
        public void mo11697a() {
            yqi.this.m26904q();
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: b */
        public void mo11698b(boolean z) {
            yqi.this.m26897r(true, true, true);
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: c */
        public void mo11699c(boolean z) {
            yqi.this.f23041d.put(Boolean.valueOf(!z));
            yqi.this.f23039b.m18627y0(((Boolean) yqi.this.f23041d.get()).booleanValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m26890e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m26896n(boolean z) {
        if (!z) {
            this.f23038a.m10564c();
        } else {
            if (rqi.d().b(ypv.e)) {
                this.f23038a.m10569j();
                return;
            }
            Runnable runnable = new Runnable() { // from class: l.xqi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22413a.m26906t();
                }
            };
            this.f23043f = runnable;
            e51.H(ypv.e, runnable, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m26897r(boolean z, boolean z2, boolean z3) {
        hfw.a("live_float_window", "dismiss:" + z + z2 + z3);
        bri briVar = this.f23038a;
        if (briVar == null || !briVar.m10566f() || this.f23039b == null) {
            return;
        }
        kur.a();
        this.f23039b.m18625w0(z, z2, !z3);
        if (!z3) {
            mqi.m18135c().m18137b();
            this.f23039b = null;
        }
        mqi.m18135c().m18138d(z3);
        l6t l6tVar = this.f23042e;
        if (l6tVar != null) {
            l6tVar.m17022d();
            this.f23042e = null;
        }
        this.f23038a.destroy();
        this.f23038a = null;
        Runnable runnable = this.f23043f;
        if (runnable != null) {
            e51.J(runnable);
            this.f23043f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m26898u(ekf0.C0546a c0546a) {
        float f = c0546a.f9838a;
        this.f23044g = f;
        int[] iArrM27502a = zqi.m27502a(f);
        this.f23038a.m10570k(iArrM27502a[0], iArrM27502a[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m26899v(boolean z) {
        if (this.f23038a == null) {
            return;
        }
        if (z) {
            kur.h(this.f23045h);
        }
        m26896n(z);
        nad0 nad0Var = this.f23039b;
        if (nad0Var != null) {
            nad0Var.m18627y0(!z || ((Boolean) this.f23041d.get()).booleanValue());
        }
    }

    /* JADX INFO: renamed from: G1 */
    public void m26900G1() {
        kur.f(this.f23045h);
    }

    /* JADX INFO: renamed from: K0 */
    public void m26901K0(boolean z, boolean z2) {
        m26897r(z, z2, false);
    }

    /* JADX INFO: renamed from: m */
    public void m26902m(bri briVar) {
        this.f23038a = briVar;
    }

    /* JADX INFO: renamed from: o */
    public iqi m26903o() {
        return new C0931e();
    }

    /* JADX INFO: renamed from: q */
    public void m26904q() {
        nad0 nad0Var = this.f23039b;
        if (nad0Var == null) {
            return;
        }
        ho2 ho2VarM18588L = nad0Var.m18588L();
        g4c.m13625a().m13627c(ho2VarM18588L);
        hfw.a("live_float_window", "openBigWindow.roomState:" + ho2VarM18588L.m17237m());
        BLiveAbsData bLiveAbsDataM17234j = ho2VarM18588L.m17234j();
        String strM18586J = this.f23039b.m18586J();
        String strM18584H = this.f23039b.m18584H();
        m26901K0(false, false);
        Intent intentM22252a = s91.m22252a(ypv.e, AudienceStartData.getBuilder().D(bLiveAbsDataM17234j).B(true).O(strM18586J).y(strM18584H).u());
        intentM22252a.addFlags(268435456);
        ypv.e.startActivity(intentM22252a);
    }

    /* JADX INFO: renamed from: s */
    public float m26905s() {
        return this.f23044g;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m26906t() {
        this.f23043f = null;
        if (!rqi.d().b(ypv.e)) {
            m26901K0(true, true);
        } else {
            if (this.f23042e.m17026h()) {
                return;
            }
            this.f23038a.m10569j();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m26907w(lqi lqiVar) {
        if (this.f23038a.m10566f()) {
            return;
        }
        this.f23044g = lqiVar.m17382g();
        if (this.f23038a.m10569j()) {
            this.f23041d = ((hdv) ypv.l(fld0.e)).t;
            ekf0 ekf0Var = new ekf0();
            this.f23039b = new nad0(ekf0Var, lqiVar.m17380e(), new j7j0(this.f23038a.m10565d(), this.f23041d, lqiVar.m17378c(), lqiVar.m17376a()), new f30() { // from class: l.tqi
                public final void call(Object obj, Object obj2) {
                    this.f20343a.m26901K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            });
            ekf0Var.m12572a().distinctUntilChanged(new w9j() { // from class: l.uqi
                public final Object call(Object obj) {
                    return Float.valueOf(((ekf0.C0546a) obj).f9838a);
                }
            }).subscribe(ffw.d(new e30() { // from class: l.vqi
                public final void call(Object obj) {
                    this.f21270a.m26898u((ekf0.C0546a) obj);
                }
            }));
            this.f23045h.f(new C0927a());
            this.f23045h.e(new C0928b());
            this.f23045h.g(new C0929c());
            this.f23039b.m18591O(lqiVar.m17379d());
            this.f23042e = new l6t(new C0930d());
            this.f23038a.m10567i();
            this.f23040c = mqi0.o();
        }
    }
}
