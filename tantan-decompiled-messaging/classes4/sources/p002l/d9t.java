package p002l;

import android.content.Intent;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import l.bul;
import l.c4g0;
import l.cul;
import l.e30;
import l.ffw;
import l.fld0;
import l.gkh0;
import l.hdv;
import l.hpd0;
import l.mkd0;
import l.q0m;
import l.r8d0;
import l.w9j;
import l.wq2;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d9t implements q0m<g9t> {

    /* JADX INFO: renamed from: a */
    public g9t f9125a;

    /* JADX INFO: renamed from: c */
    public lqi f9127c;

    /* JADX INFO: renamed from: d */
    public c4g0 f9128d;

    /* JADX INFO: renamed from: e */
    public c4g0 f9129e;

    /* JADX INFO: renamed from: f */
    public c4g0 f9130f;

    /* JADX INFO: renamed from: g */
    public hpd0 f9131g;

    /* JADX INFO: renamed from: b */
    public float f9126b = 0.0f;

    /* JADX INFO: renamed from: h */
    public bul f9132h = new C0524a();

    /* JADX INFO: renamed from: l.d9t$a */
    public class C0524a extends upd {
        public C0524a() {
        }

        @Override // p002l.upd
        /* JADX INFO: renamed from: D0 */
        public void mo11692D0() {
            d9t.this.f9125a.m13665d().mo6885p(false);
            d9t.this.m11664D(false);
        }

        @Override // p002l.upd
        /* JADX INFO: renamed from: O */
        public void mo11693O() {
            d9t.this.m11664D(true);
        }

        /* JADX INFO: renamed from: R1 */
        public void m11694R1(float f) {
            super.R1(f);
            d9t.this.m11678A(f);
        }

        @Override // p002l.upd
        /* JADX INFO: renamed from: f2 */
        public void mo11695f2() {
            d9t.this.m11664D(false);
            d9t.this.m11688u();
        }

        @Override // p002l.upd
        /* JADX INFO: renamed from: u1 */
        public void mo11696u1() {
            d9t.this.m11688u();
            d9t.this.m11664D(false);
        }
    }

    /* JADX INFO: renamed from: l.d9t$b */
    public class C0525b implements iqi {
        public C0525b() {
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: a */
        public void mo11697a() {
            d9t.this.m11684q();
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: b */
        public void mo11698b(boolean z) {
            d9t.this.m11685r();
            pxm.m20743c().m20744a(true);
        }

        @Override // p002l.iqi
        /* JADX INFO: renamed from: c */
        public void mo11699c(boolean z) {
            d9t.this.f9131g.put(Boolean.valueOf(!z));
            d9t.this.f9127c.m17379d().setMute(((Boolean) d9t.this.f9131g.get()).booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m11664D(boolean z) {
        if (this.f9125a.m13666f()) {
            g9t g9tVar = this.f9125a;
            if (z) {
                g9tVar.m13665d().mo6884o(ypv.e.getString(R$string.f2722Fd));
            } else {
                g9tVar.m13665d().mo6883n();
            }
            this.f9125a.m13665d().mo6882m(z);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m11665E() {
        m11664D(false);
        m11680F(ypv.e.getString(R$string.f2986Rj));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m11670f(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: y */
    private void m11676y() {
        m11664D(false);
        m11680F(ypv.e.getString(R$string.f3099X6));
    }

    /* JADX INFO: renamed from: z */
    private void m11677z() {
        m11688u();
        m11664D(false);
    }

    /* JADX INFO: renamed from: A */
    public void m11678A(float f) {
        if (this.f9126b == f || this.f9125a == null) {
            return;
        }
        this.f9126b = f;
        int[] iArrM27502a = zqi.m27502a(f);
        this.f9125a.m13670k(iArrM27502a[0], iArrM27502a[1]);
    }

    /* JADX INFO: renamed from: B */
    public final void m11679B(String str) {
        this.f9130f = LivingNormalApiProvider.m4839h5(str).subscribe(ffw.e(new e30() { // from class: l.b9t
            public final void call(Object obj) {
                this.f8042a.m11689v((r8d0) obj);
            }
        }, new e30() { // from class: l.c9t
            public final void call(Object obj) {
                this.f8566a.m11690w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public final void m11680F(String str) {
        this.f9125a.m13665d().mo6884o(str);
    }

    /* JADX INFO: renamed from: n */
    public void m11681n(g9t g9tVar) {
        this.f9125a = g9tVar;
    }

    /* JADX INFO: renamed from: o */
    public iqi m11682o() {
        return new C0525b();
    }

    /* JADX INFO: renamed from: p */
    public boolean m11683p(lqi<?> lqiVar) {
        this.f9127c = lqiVar;
        this.f9131g = ((hdv) ypv.l(fld0.e)).t;
        if (this.f9125a.m13666f()) {
            gkh0.j("live_float_window", "float has shown out app");
            return true;
        }
        this.f9126b = lqiVar.m17382g();
        if (!this.f9125a.m13669j()) {
            gkh0.j("live_float_window", "show float fail out app");
            return false;
        }
        this.f9125a.m13665d().mo6885p(false);
        this.f9125a.m13665d().setVoiceSelected(!((Boolean) this.f9131g.get()).booleanValue());
        lqiVar.m17379d().g(true);
        lqiVar.m17379d().d(this.f9125a.m13665d().f7212a);
        lqiVar.m17379d().c(this.f9132h);
        lqiVar.m17379d().setMute(((Boolean) this.f9131g.get()).booleanValue());
        this.f9125a.m13667i();
        this.f9128d = Act.front().filter(new w9j() { // from class: l.y8t
            public final Object call(Object obj) {
                return d9t.m11670f((Boolean) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.z8t
            public final void call(Object obj) {
                this.f23312a.m11691x((Boolean) obj);
            }
        }));
        this.f9129e = lqiVar.m17380e().m14589n1().subscribe(ffw.h(new e30() { // from class: l.a9t
            public final void call(Object obj) {
                this.f7470a.m11687t((LiveControlMessage) obj);
            }
        }));
        gkh0.j("live_float_window", "show float success out app");
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m11684q() {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = ((Act.r) it2.next()).a;
                if (weakReference != null && (weakReference.get() instanceof LiveAct)) {
                    Intent intent = new Intent(ypv.e, (Class<?>) LiveAct.class);
                    intent.addFlags(270532608);
                    ypv.e.startActivity(intent);
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            pxm.m20743c().m20747e(true);
        }
        m11685r();
    }

    /* JADX INFO: renamed from: r */
    public void m11685r() {
        mkd0.z(this.f9128d);
        mkd0.z(this.f9129e);
        mkd0.z(this.f9130f);
        lqi lqiVar = this.f9127c;
        if (lqiVar != null && lqiVar.m17379d() != null) {
            this.f9127c.m17379d().h(this.f9132h);
        }
        g9t g9tVar = this.f9125a;
        if (g9tVar != null) {
            g9tVar.destroy();
        }
        this.f9127c = null;
    }

    /* JADX INFO: renamed from: s */
    public float m11686s() {
        return this.f9126b;
    }

    /* JADX INFO: renamed from: t */
    public final void m11687t(LiveControlMessage liveControlMessage) {
        gkh0.j("live_float_window", "control msg:" + liveControlMessage.type);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
            case "forbidden_multidevice":
                m11685r();
                break;
            case "stop":
            case "force_stop":
                m11676y();
                break;
            case "pause":
                m11665E();
                break;
            case "start":
            case "recover":
                m11677z();
                m11679B(liveControlMessage.liveId);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11688u() {
        if (this.f9125a.m13666f()) {
            this.f9125a.m13665d().mo6883n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m11689v(r8d0 r8d0Var) {
        BLive bLive = ((wq2) r8d0Var).c;
        this.f9127c.m17379d().l("", "outApp", bLive);
        cul culVarM17379d = this.f9127c.m17379d();
        BLiveStreamUrl bLiveStreamUrl = ((BLiveAbsData) bLive).streamUrl;
        culVarM17379d.j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, ((BLiveAbsData) bLive).room.id, String.valueOf(((BLiveAbsData) bLive).streamCdnInfo.provider), String.valueOf(((BLiveAbsData) bLive).streamCdnInfo.businessType));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m11690w(Throwable th) {
        m11664D(false);
        m11680F(ypv.e.getString(R$string.f3028Tj));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m11691x(Boolean bool) {
        m11685r();
    }
}
