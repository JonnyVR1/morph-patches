package p153l;

import android.app.Activity;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ebt implements k3m<hbt> {

    /* JADX INFO: renamed from: a */
    public hbt f92962a;

    /* JADX INFO: renamed from: c */
    public hti f92964c;

    /* JADX INFO: renamed from: d */
    public kcg0 f92965d;

    /* JADX INFO: renamed from: e */
    public kcg0 f92966e;

    /* JADX INFO: renamed from: f */
    public kcg0 f92967f;

    /* JADX INFO: renamed from: g */
    public jxd0 f92968g;

    /* JADX INFO: renamed from: b */
    public float f92963b = 0.0f;

    /* JADX INFO: renamed from: h */
    public pwl f92969h = new C16748a();

    /* JADX INFO: renamed from: l.ebt$a */
    public class C16748a extends lrd {
        public C16748a() {
        }

        @Override // p153l.lrd, p153l.pwl
        /* JADX INFO: renamed from: D0 */
        public void mo120245D0() {
            ebt.this.f92962a.m134431d().mo74532p(false);
            ebt.this.m120217D(false);
        }

        @Override // p153l.lrd, p153l.pwl
        /* JADX INFO: renamed from: O */
        public void mo120246O() {
            ebt.this.m120217D(true);
        }

        @Override // p153l.pwl
        /* JADX INFO: renamed from: R1 */
        public void mo120247R1(float f) {
            super.mo120247R1(f);
            ebt.this.m120231A(f);
        }

        @Override // p153l.lrd, p153l.pwl
        /* JADX INFO: renamed from: f2 */
        public void mo120248f2() {
            ebt.this.m120217D(false);
            ebt.this.m120241u();
        }

        @Override // p153l.lrd, p153l.pwl
        /* JADX INFO: renamed from: u1 */
        public void mo120249u1() {
            ebt.this.m120241u();
            ebt.this.m120217D(false);
        }
    }

    /* JADX INFO: renamed from: l.ebt$b */
    public class C16749b implements eti {
        public C16749b() {
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: a */
        public void mo120250a() {
            ebt.this.m120237q();
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: b */
        public void mo120251b(boolean z) {
            ebt.this.m120238r();
            pzm.m174537c().m174538a(true);
        }

        @Override // p153l.eti
        /* JADX INFO: renamed from: c */
        public void mo120252c(boolean z) {
            ebt.this.f92968g.put(Boolean.valueOf(!z));
            ebt.this.f92964c.m137079d().setMute(ebt.this.f92968g.get().booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m120217D(boolean z) {
        if (this.f92962a.m134432f()) {
            hbt hbtVar = this.f92962a;
            if (z) {
                hbtVar.m134431d().mo74531o(zrv.f205803e.getString(R$string.f47528Fd));
            } else {
                hbtVar.m134431d().mo74530n();
            }
            this.f92962a.m134431d().mo74529m(z);
        }
    }

    /* JADX INFO: renamed from: E */
    private void m120218E() {
        m120217D(false);
        m120233F(zrv.f205803e.getString(R$string.f47792Rj));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m120223f(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: y */
    private void m120229y() {
        m120217D(false);
        m120233F(zrv.f205803e.getString(R$string.f47905X6));
    }

    /* JADX INFO: renamed from: z */
    private void m120230z() {
        m120241u();
        m120217D(false);
    }

    /* JADX INFO: renamed from: A */
    public void m120231A(float f) {
        if (this.f92963b == f || this.f92962a == null) {
            return;
        }
        this.f92963b = f;
        int[] iArrM202673a = vti.m202673a(f);
        this.f92962a.m134435k(iArrM202673a[0], iArrM202673a[1]);
    }

    /* JADX INFO: renamed from: B */
    public final void m120232B(String str) {
        this.f92967f = LivingNormalApiProvider.m72656h5(str).subscribe(dhw.m115826e(new y20() { // from class: l.cbt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80854a.m120242v((ugd0) obj);
            }
        }, new y20() { // from class: l.dbt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87706a.m120243w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public final void m120233F(String str) {
        this.f92962a.m134431d().mo74531o(str);
    }

    /* JADX INFO: renamed from: n */
    public void m120234n(hbt hbtVar) {
        this.f92962a = hbtVar;
    }

    /* JADX INFO: renamed from: o */
    public eti m120235o() {
        return new C16749b();
    }

    /* JADX INFO: renamed from: p */
    public boolean m120236p(hti<?> htiVar) {
        this.f92964c = htiVar;
        this.f92968g = ((ifv) zrv.m221194l(htd0.f111523e)).f114711t;
        if (this.f92962a.m134432f()) {
            nsh0.m164608j("live_float_window", "float has shown out app");
            return true;
        }
        this.f92963b = htiVar.m137082g();
        if (!this.f92962a.m134434j()) {
            nsh0.m164608j("live_float_window", "show float fail out app");
            return false;
        }
        this.f92962a.m134431d().mo74532p(false);
        this.f92962a.m134431d().setVoiceSelected(!this.f92968g.get().booleanValue());
        htiVar.m137079d().mo178527g(true);
        htiVar.m137079d().mo178524d(this.f92962a.m134431d().f52018a);
        htiVar.m137079d().mo178523c(this.f92969h);
        htiVar.m137079d().setMute(this.f92968g.get().booleanValue());
        this.f92962a.m134433i();
        this.f92965d = Act.front().filter(new qcj() { // from class: l.zat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ebt.m120223f((Boolean) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.abt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69650a.m120244x((Boolean) obj);
            }
        }));
        this.f92966e = htiVar.m137080e().m168539n1().subscribe(dhw.m115829h(new y20() { // from class: l.bbt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75990a.m120240t((LiveControlMessage) obj);
            }
        }));
        nsh0.m164608j("live_float_window", "show float success out app");
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m120237q() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                WeakReference<Activity> weakReference = it2.next().f16062a;
                if (weakReference != null && (weakReference.get() instanceof LiveAct)) {
                    Intent intent = new Intent(zrv.f205803e, (Class<?>) LiveAct.class);
                    intent.addFlags(270532608);
                    zrv.f205803e.startActivity(intent);
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            pzm.m174537c().m174541e(true);
        }
        m120238r();
    }

    /* JADX INFO: renamed from: r */
    public void m120238r() {
        psd0.m173633z(this.f92965d);
        psd0.m173633z(this.f92966e);
        psd0.m173633z(this.f92967f);
        hti htiVar = this.f92964c;
        if (htiVar != null && htiVar.m137079d() != null) {
            this.f92964c.m137079d().mo178528h(this.f92969h);
        }
        hbt hbtVar = this.f92962a;
        if (hbtVar != null) {
            hbtVar.destroy();
        }
        this.f92964c = null;
    }

    /* JADX INFO: renamed from: s */
    public float m120239s() {
        return this.f92963b;
    }

    /* JADX INFO: renamed from: t */
    public final void m120240t(LiveControlMessage liveControlMessage) {
        nsh0.m164608j("live_float_window", "control msg:" + liveControlMessage.type);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "boot":
            case "forbidden_multidevice":
                m120238r();
                break;
            case "stop":
            case "force_stop":
                m120229y();
                break;
            case "pause":
                m120218E();
                break;
            case "start":
            case "recover":
                m120230z();
                m120232B(liveControlMessage.liveId);
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m120241u() {
        if (this.f92962a.m134432f()) {
            this.f92962a.m134431d().mo74530n();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m120242v(ugd0 ugd0Var) {
        BLive bLive = (BLive) ugd0Var.f138293c;
        this.f92964c.m137079d().mo178532l("", "outApp", bLive);
        qwl qwlVarM137079d = this.f92964c.m137079d();
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        qwlVarM137079d.mo178530j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLive.room.f45267id, String.valueOf(bLive.streamCdnInfo.provider), String.valueOf(bLive.streamCdnInfo.businessType));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m120243w(Throwable th) {
        m120217D(false);
        m120233F(zrv.f205803e.getString(R$string.f47834Tj));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m120244x(Boolean bool) {
        m120238r();
    }
}
