package p149l;

import android.content.Intent;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes4.dex */
public class yqi implements q0m<bri> {

    /* JADX INFO: renamed from: a */
    public bri f199553a;

    /* JADX INFO: renamed from: b */
    public nad0 f199554b;

    /* JADX INFO: renamed from: c */
    public long f199555c;

    /* JADX INFO: renamed from: d */
    public hpd0 f199556d;

    /* JADX INFO: renamed from: e */
    public l6t f199557e;

    /* JADX INFO: renamed from: f */
    public Runnable f199558f;

    /* JADX INFO: renamed from: g */
    public float f199559g = 0.0f;

    /* JADX INFO: renamed from: h */
    public jur f199560h = new jur(new d30() { // from class: l.wqi
        @Override // p149l.d30
        public final void call() {
            yqi.m215725e();
        }
    });

    /* JADX INFO: renamed from: l.yqi$a */
    public class C21474a implements g30<String, AudioBusinessType, String> {
        public C21474a() {
        }

        @Override // p149l.g30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo36055a(String str, AudioBusinessType audioBusinessType, String str2) {
            if (str == null || !(str2.startsWith("PhotoAlbumFeedPreviewAdapter") || str2.startsWith("NewMeetAct"))) {
                yqi.this.m215734v(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.yqi$b */
    public class C21475b implements f30<String, AudioBusinessType> {
        public C21475b() {
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            yqi.this.m215736K0(true, true);
        }
    }

    /* JADX INFO: renamed from: l.yqi$c */
    public class C21476c implements f30<String, AudioBusinessType> {
        public C21476c() {
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            if (str == null || !(str.startsWith("PhotoAlbumFeedPreviewAdapter") || str.startsWith("NewMeetAct"))) {
                if (audioBusinessType != AudioBusinessType.NORMAL || str.startsWith("PlayerView")) {
                    yqi.this.m215736K0(true, true);
                } else {
                    yqi.this.m215734v(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yqi$d */
    public class C21477d extends dkf0 {
        public C21477d() {
        }

        @Override // p149l.nt10
        /* JADX INFO: renamed from: a */
        public void mo160504a(boolean z) {
            yqi.this.f199554b.m158673y0(z);
        }

        @Override // p149l.nt10
        /* JADX INFO: renamed from: b */
        public boolean mo160800b() {
            return yqi.this.f199556d.get().booleanValue();
        }

        @Override // p149l.dkf0
        /* JADX INFO: renamed from: c */
        public void mo112219c(boolean z) {
            yqi.this.m215731n(z);
        }

        @Override // p149l.dkf0
        /* JADX INFO: renamed from: d */
        public void mo112220d(boolean z, boolean z2, BLiveAbsData bLiveAbsData, Boolean bool) {
            yqi.this.m215736K0(z, z2);
        }
    }

    /* JADX INFO: renamed from: l.yqi$e */
    public class C21478e implements iqi {
        public C21478e() {
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: a */
        public void mo110491a() {
            yqi.this.m215739q();
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: b */
        public void mo110492b(boolean z) {
            yqi.this.m215732r(true, true, true);
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: c */
        public void mo110493c(boolean z) {
            yqi.this.f199556d.put(Boolean.valueOf(!z));
            yqi.this.f199554b.m158673y0(yqi.this.f199556d.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m215725e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m215731n(boolean z) {
        if (!z) {
            this.f199553a.m103543c();
        } else {
            if (rqi.m180453d().m180455b(ypv.f199497e)) {
                this.f199553a.m103547j();
                return;
            }
            Runnable runnable = new Runnable() { // from class: l.xqi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194013a.m215741t();
                }
            };
            this.f199558f = runnable;
            e51.m114743H(ypv.f199497e, runnable, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m215732r(boolean z, boolean z2, boolean z3) {
        hfw.m130790a("live_float_window", "dismiss:" + z + z2 + z3);
        bri briVar = this.f199553a;
        if (briVar == null || !briVar.m103545f() || this.f199554b == null) {
            return;
        }
        kur.m147296a();
        this.f199554b.m158671w0(z, z2, !z3);
        if (!z3) {
            mqi.m155920c().m155922b();
            this.f199554b = null;
        }
        mqi.m155920c().m155923d(z3);
        l6t l6tVar = this.f199557e;
        if (l6tVar != null) {
            l6tVar.m148760d();
            this.f199557e = null;
        }
        this.f199553a.destroy();
        this.f199553a = null;
        Runnable runnable = this.f199558f;
        if (runnable != null) {
            e51.m114745J(runnable);
            this.f199558f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m215733u(ekf0.C16637a c16637a) {
        float f = c16637a.f91971a;
        this.f199559g = f;
        int[] iArrM219853a = zqi.m219853a(f);
        this.f199553a.m103548k(iArrM219853a[0], iArrM219853a[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m215734v(boolean z) {
        if (this.f199553a == null) {
            return;
        }
        if (z) {
            kur.m147303h(this.f199560h);
        }
        m215731n(z);
        nad0 nad0Var = this.f199554b;
        if (nad0Var != null) {
            nad0Var.m158673y0(!z || this.f199556d.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: G1 */
    public void m215735G1() {
        kur.m147301f(this.f199560h);
    }

    /* JADX INFO: renamed from: K0 */
    public void m215736K0(boolean z, boolean z2) {
        m215732r(z, z2, false);
    }

    /* JADX INFO: renamed from: m */
    public void m215737m(bri briVar) {
        this.f199553a = briVar;
    }

    /* JADX INFO: renamed from: o */
    public iqi m215738o() {
        return new C21478e();
    }

    /* JADX INFO: renamed from: q */
    public void m215739q() {
        nad0 nad0Var = this.f199554b;
        if (nad0Var == null) {
            return;
        }
        ho2 ho2VarM158634L = nad0Var.m158634L();
        g4c.m124360a().m124362c(ho2VarM158634L);
        hfw.m130790a("live_float_window", "openBigWindow.roomState:" + ho2VarM158634L.m149816m());
        BLiveAbsData bLiveAbsDataMo149813j = ho2VarM158634L.mo149813j();
        String strM158632J = this.f199554b.m158632J();
        String strM158630H = this.f199554b.m158630H();
        m215736K0(false, false);
        Intent intentM182688a = s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67593D(bLiveAbsDataMo149813j).m67591B(true).m67604O(strM158632J).m67615y(strM158630H).m67611u());
        intentM182688a.addFlags(268435456);
        ypv.f199497e.startActivity(intentM182688a);
    }

    /* JADX INFO: renamed from: s */
    public float m215740s() {
        return this.f199559g;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m215741t() {
        this.f199558f = null;
        if (!rqi.m180453d().m180455b(ypv.f199497e)) {
            m215736K0(true, true);
        } else {
            if (this.f199557e.m148764h()) {
                return;
            }
            this.f199553a.m103547j();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m215742w(lqi lqiVar) {
        if (this.f199553a.m103545f()) {
            return;
        }
        this.f199559g = lqiVar.m151026g();
        if (this.f199553a.m103547j()) {
            this.f199556d = ((hdv) ypv.m215673l(fld0.f98150e)).f107314t;
            ekf0 ekf0Var = new ekf0();
            this.f199554b = new nad0(ekf0Var, lqiVar.m151024e(), new j7j0(this.f199553a.m103544d(), this.f199556d, lqiVar.m151022c(), lqiVar.m151020a()), new f30() { // from class: l.tqi
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f171591a.m215736K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            });
            ekf0Var.m116960a().distinctUntilChanged(new w9j() { // from class: l.uqi
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Float.valueOf(((ekf0.C16637a) obj).f91971a);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.vqi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182652a.m215733u((ekf0.C16637a) obj);
                }
            }));
            this.f199560h.m143342f(new C21474a());
            this.f199560h.m143341e(new C21475b());
            this.f199560h.m143343g(new C21476c());
            this.f199554b.m158637O(lqiVar.m151023d());
            this.f199557e = new l6t(new C21477d());
            this.f199553a.m103546i();
            this.f199555c = mqi0.m155944o();
        }
    }
}
