package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes4.dex */
public class oxs implements q0m<sxs> {

    /* JADX INFO: renamed from: a */
    public sxs f146234a;

    /* JADX INFO: renamed from: b */
    public nad0 f146235b;

    /* JADX INFO: renamed from: c */
    public hpd0 f146236c;

    /* JADX INFO: renamed from: d */
    public l6t f146237d;

    /* JADX INFO: renamed from: g */
    public lqi<?> f146240g;

    /* JADX INFO: renamed from: h */
    public c4g0 f146241h;

    /* JADX INFO: renamed from: e */
    public float f146238e = 0.0f;

    /* JADX INFO: renamed from: f */
    public jur f146239f = new jur(new d30() { // from class: l.ixs
        @Override // p149l.d30
        public final void call() {
            oxs.m166575d();
        }
    });

    /* JADX INFO: renamed from: i */
    public iqi f146242i = new C19071e();

    /* JADX INFO: renamed from: l.oxs$a */
    public class C19067a implements g30<String, AudioBusinessType, String> {
        public C19067a() {
        }

        @Override // p149l.g30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo36055a(String str, AudioBusinessType audioBusinessType, String str2) {
            if (str == null || !(str2.startsWith("PhotoAlbumFeedPreviewAdapter") || str2.startsWith("NewMeetAct"))) {
                oxs.this.m166593w(true);
            }
        }
    }

    /* JADX INFO: renamed from: l.oxs$b */
    public class C19068b implements f30<String, AudioBusinessType> {
        public C19068b() {
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            oxs.this.m166584K0(true, true);
        }
    }

    /* JADX INFO: renamed from: l.oxs$c */
    public class C19069c implements f30<String, AudioBusinessType> {
        public C19069c() {
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str, AudioBusinessType audioBusinessType) {
            if (str == null || !(str.startsWith("PhotoAlbumFeedPreviewAdapter") || str.startsWith("NewMeetAct"))) {
                if (audioBusinessType != AudioBusinessType.NORMAL || str.startsWith("PlayerView")) {
                    oxs.this.m166584K0(true, true);
                } else {
                    oxs.this.m166593w(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.oxs$d */
    public class C19070d extends dkf0 {
        public C19070d() {
        }

        @Override // p149l.nt10
        /* JADX INFO: renamed from: a */
        public void mo160504a(boolean z) {
            oxs.this.f146235b.m158673y0(z);
        }

        @Override // p149l.nt10
        /* JADX INFO: renamed from: b */
        public boolean mo160800b() {
            return oxs.this.f146236c.get().booleanValue();
        }

        @Override // p149l.dkf0
        /* JADX INFO: renamed from: c */
        public void mo112219c(boolean z) {
            oxs.this.m166586o(z);
        }

        @Override // p149l.dkf0
        /* JADX INFO: renamed from: d */
        public void mo112220d(boolean z, boolean z2, BLiveAbsData bLiveAbsData, Boolean bool) {
            oxs.this.m166584K0(z, z2);
        }
    }

    /* JADX INFO: renamed from: l.oxs$e */
    public class C19071e implements iqi {
        public C19071e() {
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: a */
        public void mo110491a() {
            oxs.this.m166587q();
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: b */
        public void mo110492b(boolean z) {
            oxs.this.m166588r(true, true, true);
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: c */
        public void mo110493c(boolean z) {
            oxs.this.f146236c.put(Boolean.valueOf(!z));
            oxs.this.f146235b.m158673y0(oxs.this.f146236c.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m166575d() {
    }

    /* JADX INFO: renamed from: G1 */
    public void m166583G1() {
        kur.m147301f(this.f146239f);
    }

    /* JADX INFO: renamed from: K0 */
    public void m166584K0(boolean z, boolean z2) {
        m166588r(z, z2, false);
    }

    /* JADX INFO: renamed from: n */
    public void m166585n(sxs sxsVar) {
        this.f146234a = sxsVar;
    }

    /* JADX INFO: renamed from: o */
    public final void m166586o(boolean z) {
        if (z) {
            this.f146234a.m186541k();
        } else {
            e51.m114742G(new Runnable() { // from class: l.nxs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141048a.m166590t();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q */
    public void m166587q() {
        nad0 nad0Var = this.f146235b;
        if (nad0Var == null) {
            return;
        }
        ho2 ho2VarM158634L = nad0Var.m158634L();
        g4c.m124360a().m124362c(ho2VarM158634L);
        hfw.m130790a("live_float_window", "openBigWindow.roomState:" + ho2VarM158634L.m149816m());
        BLiveAbsData bLiveAbsDataMo149813j = ho2VarM158634L.mo149813j();
        String strM158632J = this.f146235b.m158632J();
        String strM158630H = this.f146235b.m158630H();
        m166584K0(false, false);
        Intent intentM182688a = s91.m182688a(ypv.f199497e, AudienceStartData.getBuilder().m67593D(bLiveAbsDataMo149813j).m67591B(true).m67604O(strM158632J).m67615y(strM158630H).m67611u());
        intentM182688a.addFlags(268435456);
        ypv.f199497e.startActivity(intentM182688a);
    }

    /* JADX INFO: renamed from: r */
    public final void m166588r(boolean z, boolean z2, boolean z3) {
        mkd0.m154992z(this.f146241h);
        hfw.m130790a("live_float_window", "dismiss:" + z + z2 + z3);
        if (this.f146235b != null) {
            kur.m147296a();
            this.f146235b.m158671w0(z, z2, !z3);
            if (!z3) {
                mqi.m155920c().m155922b();
            }
            this.f146235b = null;
        }
        mqi.m155920c().m155923d(z3);
        l6t l6tVar = this.f146237d;
        if (l6tVar != null) {
            l6tVar.m148760d();
            this.f146237d = null;
        }
        sxs sxsVar = this.f146234a;
        if (sxsVar != null) {
            sxsVar.destroy();
            this.f146234a = null;
        }
        this.f146240g = null;
    }

    /* JADX INFO: renamed from: s */
    public float m166589s() {
        return this.f146238e;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m166590t() {
        sxs sxsVar = this.f146234a;
        if (sxsVar != null) {
            sxsVar.m186538f();
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m166591u(ekf0.C16637a c16637a) {
        float f = c16637a.f91971a;
        this.f146238e = f;
        int[] iArrM219853a = zqi.m219853a(f);
        this.f146234a.m186542l(iArrM219853a[0], iArrM219853a[1]);
    }

    /* JADX INFO: renamed from: v */
    public final void m166592v(boolean z) {
        sxs sxsVar;
        if (!z) {
            if (pxm.m171910c().m171915f(this.f146240g, false)) {
                this.f146234a.m186535c(false);
            }
        } else {
            if (this.f146235b.m158633K() == null || (sxsVar = this.f146234a) == null) {
                return;
            }
            sxsVar.m186535c(true);
            this.f146235b.m158633K().mo108792d(this.f146234a.m186537e().getPlayerContainer());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m166593w(boolean z) {
        if (this.f146234a == null) {
            return;
        }
        if (z) {
            kur.m147303h(this.f146239f);
        }
        m166586o(z);
        nad0 nad0Var = this.f146235b;
        if (nad0Var != null) {
            nad0Var.m158673y0(!z || this.f146236c.get().booleanValue());
        }
    }

    /* JADX INFO: renamed from: x */
    public void m166594x(lqi<?> lqiVar) {
        this.f146240g = lqiVar;
        this.f146236c = ((hdv) ypv.m215673l(fld0.f98150e)).f107314t;
        if (this.f146234a.m186539i()) {
            gkh0.m126627j("live_float_window", "float has shown in app");
            return;
        }
        this.f146238e = lqiVar.m151026g();
        if (!this.f146234a.m186541k()) {
            gkh0.m126627j("live_float_window", "show float fail in app");
            return;
        }
        gkh0.m126627j("live_float_window", "show float success in app");
        ekf0 ekf0Var = new ekf0();
        this.f146235b = new nad0(ekf0Var, lqiVar.m151024e(), new j7j0(this.f146234a.m186537e(), this.f146236c, lqiVar.m151022c(), lqiVar.m151020a()), new f30() { // from class: l.jxs
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f120246a.m166584K0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
        ekf0Var.m116960a().distinctUntilChanged(new w9j() { // from class: l.kxs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Float.valueOf(((ekf0.C16637a) obj).f91971a);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.lxs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130431a.m166591u((ekf0.C16637a) obj);
            }
        }));
        this.f146239f.m143342f(new C19067a());
        this.f146239f.m143341e(new C19068b());
        this.f146239f.m143343g(new C19069c());
        this.f146235b.m158637O(lqiVar.m151023d());
        this.f146237d = new l6t(new C19070d());
        this.f146241h = Act.front().distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.mxs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136202a.m166592v(((Boolean) obj).booleanValue());
            }
        }));
    }
}
