package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class k1p0<D extends oo2> extends y8s<D, lzo0> {

    /* JADX INFO: renamed from: j */
    public kyo0 f123528j;

    /* JADX INFO: renamed from: k */
    public p1p0 f123529k;

    /* JADX INFO: renamed from: l */
    public final rzo0 f123530l;

    /* JADX INFO: renamed from: m */
    public b0p0 f123531m;

    /* JADX INFO: renamed from: n */
    public g0p0 f123532n;

    /* JADX INFO: renamed from: o */
    public kcg0 f123533o;

    /* JADX INFO: renamed from: p */
    public long f123534p;

    public k1p0(dum dumVar) {
        super(dumVar);
        mo52715C(new lzo0(dumVar.f90815a, this));
        this.f123530l = (rzo0) m153103z2(new rzo0(dumVar));
        this.f123531m = (b0p0) m153103z2(new b0p0(dumVar));
        g0p0 g0p0Var = new g0p0(dumVar.f90815a, this);
        this.f123532n = g0p0Var;
        g0p0Var.mo22064i1(this);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m147895T3(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m147896U3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m147904k4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        ((lzo0) this.viewModel).m156458O(voiceCpBindMessage);
        kyo0 kyo0Var = this.f123528j;
        if (kyo0Var != null) {
            kyo0Var.m152105P4(voiceCpBindMessage, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m147905l4(vxj0 vxj0Var) {
        ((lzo0) this.viewModel).mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m147906m4(vxj0 vxj0Var) {
        if (((lzo0) this.viewModel).isShowing()) {
            this.f123528j.m152105P4(null, null);
            if (this.f123531m.isShowing()) {
                this.f123531m.m101334V3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m147907n4(vxj0 vxj0Var) {
        ryo0.m183632c();
        m147912f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m147908o4(String str) {
        ((lzo0) this.viewModel).m156458O(null);
        kyo0 kyo0Var = this.f123528j;
        if (kyo0Var != null) {
            kyo0Var.m152105P4(null, str);
        }
        kyo0 kyo0Var2 = this.f123528j;
        if (kyo0Var2 != null) {
            kyo0Var2.m152109T4(str, 1);
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        rzo0 rzo0Var = this.f123530l;
        if (rzo0Var != null) {
            rzo0Var.m183813b4(false);
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        rzo0 rzo0Var = this.f123530l;
        if (rzo0Var != null) {
            rzo0Var.m183813b4(true);
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        if (this.f123528j == null) {
            this.f123528j = (kyo0) m153103z2(new kyo0(this.f196918e, ((lzo0) this.viewModel).f134242l, this));
        }
        if (this.f123529k == null) {
            this.f123529k = (p1p0) m153103z2(new p1p0(this.f196918e, ((lzo0) this.viewModel).f134243m));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m147909c4() {
        g0p0 g0p0Var;
        u0p0 u0p0Var = this.f123528j.f129336n;
        return ((u0p0Var != null && u0p0Var.isShowing()) || ((g0p0Var = this.f123532n) != null && g0p0Var.isShowing())) && System.currentTimeMillis() - this.f123534p > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    }

    /* JADX INFO: renamed from: d4 */
    public void m147910d4() {
        ((lzo0) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: e4 */
    public void m147911e4() {
        kyo0 kyo0Var = this.f123528j;
        if (kyo0Var != null) {
            kyo0Var.m152119s4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m147912f4() {
        duringCreated(fwo0.m127824q("")).subscribe(dhw.m115826e(new y20() { // from class: l.i1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112542a.m147914h4((List) obj);
            }
        }, new y20() { // from class: l.j1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                k1p0.m147895T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m147913g4() {
        kyo0 kyo0Var = this.f123528j;
        return kyo0Var != null && kyo0Var.m152121u4();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m147914h4(List list) {
        this.f123532n.m128454M(list);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m147915i4(Long l2) {
        return Boolean.valueOf(m147909c4());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m147916j4(Long l2) {
        this.f123534p = System.currentTimeMillis();
        u0p0 u0p0Var = this.f123528j.f129336n;
        if (u0p0Var != null && u0p0Var.isShowing() && !TextUtils.isEmpty(this.f123528j.f129336n.f176928r)) {
            this.f123528j.m152114Y4();
            return;
        }
        g0p0 g0p0Var = this.f123532n;
        if (g0p0Var == null || !g0p0Var.isShowing()) {
            m147922u4();
        } else {
            m147912f4();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m147922u4();
    }

    /* JADX INFO: renamed from: p4 */
    public void m147917p4(int i) {
        if (i == 0) {
            this.f123528j.m152105P4(null, null);
        } else if (i == 1) {
            this.f123529k.m170258N3();
            ryo0.m183634e();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public void m147918q4() {
        this.f123531m.m101336X3();
    }

    /* JADX INFO: renamed from: r4 */
    public void m147919r4() {
        String strM203784z5 = zrv.m221193k().m203784z5();
        if (TextUtils.isEmpty(strM203784z5)) {
            return;
        }
        px50.C19461a c19461a = new px50.C19461a(9000);
        c19461a.m174141B(strM203784z5);
        c19461a.m174152z(1.0d, 0.7d);
        c19461a.m174146t(80);
        m213811F2().OpenH5Event.open().mo199273j(c19461a.m174143q());
    }

    /* JADX INFO: renamed from: s4 */
    public boolean m147920s4() {
        kyo0 kyo0Var = this.f123528j;
        if (kyo0Var == null) {
            return false;
        }
        return !kyo0Var.m152118r4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceSweetEvent.showSweetCpDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.d1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84707a.m147904k4((VoiceSweet.VoiceCpBindMessage) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceSweetEvent.dismissSweetCpDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91657a.m147905l4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceSweetEvent.undateRecommendUser().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.f1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96814a.m147906m4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceSweetEvent.showLimitHouseDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.g1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101769a.m147907n4((vxj0) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceSweetEvent.showSweetCpHouse().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.h1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107473a.m147908o4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m147921t4() {
        psd0.m173633z(this.f123533o);
        this.f123533o = duringCreated(C22421c.interval(30L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.a1p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f67828a.m147915i4((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.b1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74390a.m147916j4((Long) obj);
            }
        }, new y20() { // from class: l.c1p0
            @Override // p153l.y20
            public final void call(Object obj) {
                k1p0.m147896U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m147922u4() {
        psd0.m173633z(this.f123533o);
    }

    /* JADX INFO: renamed from: v4 */
    public void m147923v4() {
        m213811F2().VoiceSweetEvent.showUnbindCpDialog().m199277p();
    }
}
