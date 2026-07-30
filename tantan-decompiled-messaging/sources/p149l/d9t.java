package p149l;

import android.app.Activity;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class d9t implements q0m<g9t> {

    /* JADX INFO: renamed from: a */
    public g9t f85144a;

    /* JADX INFO: renamed from: c */
    public lqi f85146c;

    /* JADX INFO: renamed from: d */
    public c4g0 f85147d;

    /* JADX INFO: renamed from: e */
    public c4g0 f85148e;

    /* JADX INFO: renamed from: f */
    public c4g0 f85149f;

    /* JADX INFO: renamed from: g */
    public hpd0 f85150g;

    /* JADX INFO: renamed from: b */
    public float f85145b = 0.0f;

    /* JADX INFO: renamed from: h */
    public bul f85151h = new C16317a();

    /* JADX INFO: renamed from: l.d9t$a */
    public class C16317a extends upd {
        public C16317a() {
        }

        @Override // p149l.upd, p149l.bul
        /* JADX INFO: renamed from: D0 */
        public void mo103933D0() {
            d9t.this.f85144a.m124844d().mo73349p(false);
            d9t.this.m110463D(false);
        }

        @Override // p149l.upd, p149l.bul
        /* JADX INFO: renamed from: O */
        public void mo103935O() {
            d9t.this.m110463D(true);
        }

        @Override // p149l.bul
        /* JADX INFO: renamed from: R1 */
        public void mo103937R1(float f) {
            super.mo103937R1(f);
            d9t.this.m110477A(f);
        }

        @Override // p149l.upd, p149l.bul
        /* JADX INFO: renamed from: f2 */
        public void mo103939f2() {
            d9t.this.m110463D(false);
            d9t.this.m110487u();
        }

        @Override // p149l.upd, p149l.bul
        /* JADX INFO: renamed from: u1 */
        public void mo103945u1() {
            d9t.this.m110487u();
            d9t.this.m110463D(false);
        }
    }

    /* JADX INFO: renamed from: l.d9t$b */
    public class C16318b implements iqi {
        public C16318b() {
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: a */
        public void mo110491a() {
            d9t.this.m110483q();
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: b */
        public void mo110492b(boolean z) {
            d9t.this.m110484r();
            pxm.m171910c().m171911a(true);
        }

        @Override // p149l.iqi
        /* JADX INFO: renamed from: c */
        public void mo110493c(boolean z) {
            d9t.this.f85150g.put(Boolean.valueOf(!z));
            d9t.this.f85146c.m151023d().setMute(d9t.this.f85150g.get().booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m110463D(boolean z) {
        if (this.f85144a.m124845f()) {
            g9t g9tVar = this.f85144a;
            if (z) {
                g9tVar.m124844d().mo73348o(ypv.f199497e.getString(R$string.f46680Fd));
            } else {
                g9tVar.m124844d().mo73347n();
            }
            this.f85144a.m124844d().mo73346m(z);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m110464E() {
        m110463D(false);
        m110479F(ypv.f199497e.getString(R$string.f46944Rj));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m110469f(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: y */
    private void m110475y() {
        m110463D(false);
        m110479F(ypv.f199497e.getString(R$string.f47057X6));
    }

    /* JADX INFO: renamed from: z */
    private void m110476z() {
        m110487u();
        m110463D(false);
    }

    /* JADX INFO: renamed from: A */
    public void m110477A(float f) {
        if (this.f85145b == f || this.f85144a == null) {
            return;
        }
        this.f85145b = f;
        int[] iArrM219853a = zqi.m219853a(f);
        this.f85144a.m124848k(iArrM219853a[0], iArrM219853a[1]);
    }

    /* JADX INFO: renamed from: B */
    public final void m110478B(String str) {
        this.f85149f = LivingNormalApiProvider.m71473h5(str).subscribe(ffw.m121194e(new e30() { // from class: l.b9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74625a.m110488v((r8d0) obj);
            }
        }, new e30() { // from class: l.c9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79968a.m110489w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public final void m110479F(String str) {
        this.f85144a.m124844d().mo73348o(str);
    }

    /* JADX INFO: renamed from: n */
    public void m110480n(g9t g9tVar) {
        this.f85144a = g9tVar;
    }

    /* JADX INFO: renamed from: o */
    public iqi m110481o() {
        return new C16318b();
    }

    /* JADX INFO: renamed from: p */
    public boolean m110482p(lqi<?> lqiVar) {
        this.f85146c = lqiVar;
        this.f85150g = ((hdv) ypv.m215673l(fld0.f98150e)).f107314t;
        if (this.f85144a.m124845f()) {
            gkh0.m126627j("live_float_window", "float has shown out app");
            return true;
        }
        this.f85145b = lqiVar.m151026g();
        if (!this.f85144a.m124847j()) {
            gkh0.m126627j("live_float_window", "show float fail out app");
            return false;
        }
        this.f85144a.m124844d().mo73349p(false);
        this.f85144a.m124844d().setVoiceSelected(!this.f85150g.get().booleanValue());
        lqiVar.m151023d().mo108795g(true);
        lqiVar.m151023d().mo108792d(this.f85144a.m124844d().f51170a);
        lqiVar.m151023d().mo108791c(this.f85151h);
        lqiVar.m151023d().setMute(this.f85150g.get().booleanValue());
        this.f85144a.m124846i();
        this.f85147d = Act.front().filter(new w9j() { // from class: l.y8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d9t.m110469f((Boolean) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.z8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202210a.m110490x((Boolean) obj);
            }
        }));
        this.f85148e = lqiVar.m151024e().m132153n1().subscribe(ffw.m121197h(new e30() { // from class: l.a9t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68201a.m110486t((LiveControlMessage) obj);
            }
        }));
        gkh0.m126627j("live_float_window", "show float success out app");
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m110483q() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                WeakReference<Activity> weakReference = it2.next().f15343a;
                if (weakReference != null && (weakReference.get() instanceof LiveAct)) {
                    Intent intent = new Intent(ypv.f199497e, (Class<?>) LiveAct.class);
                    intent.addFlags(270532608);
                    ypv.f199497e.startActivity(intent);
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            pxm.m171910c().m171914e(true);
        }
        m110484r();
    }

    /* JADX INFO: renamed from: r */
    public void m110484r() {
        mkd0.m154992z(this.f85147d);
        mkd0.m154992z(this.f85148e);
        mkd0.m154992z(this.f85149f);
        lqi lqiVar = this.f85146c;
        if (lqiVar != null && lqiVar.m151023d() != null) {
            this.f85146c.m151023d().mo108796h(this.f85151h);
        }
        g9t g9tVar = this.f85144a;
        if (g9tVar != null) {
            g9tVar.destroy();
        }
        this.f85146c = null;
    }

    /* JADX INFO: renamed from: s */
    public float m110485s() {
        return this.f85145b;
    }

    /* JADX INFO: renamed from: t */
    public final void m110486t(LiveControlMessage liveControlMessage) {
        gkh0.m126627j("live_float_window", "control msg:" + liveControlMessage.type);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
            case "forbidden_multidevice":
                m110484r();
                break;
            case "stop":
            case "force_stop":
                m110475y();
                break;
            case "pause":
                m110464E();
                break;
            case "start":
            case "recover":
                m110476z();
                m110478B(liveControlMessage.liveId);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m110487u() {
        if (this.f85144a.m124845f()) {
            this.f85144a.m124844d().mo73347n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m110488v(r8d0 r8d0Var) {
        BLive bLive = (BLive) r8d0Var.f187610c;
        this.f85146c.m151023d().mo108800l("", "outApp", bLive);
        cul culVarM151023d = this.f85146c.m151023d();
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        culVarM151023d.mo108798j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLive.room.f44419id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m110489w(Throwable th) {
        m110463D(false);
        m110479F(ypv.f199497e.getString(R$string.f46986Tj));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m110490x(Boolean bool) {
        m110484r();
    }
}
