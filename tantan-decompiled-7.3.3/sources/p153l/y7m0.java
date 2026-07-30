package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseEvent$GestureIntention;

/* JADX INFO: loaded from: classes5.dex */
public class y7m0 extends i6t<rwn0, VirtualVoiceCloseView> {

    /* JADX INFO: renamed from: j */
    public static int f197790j;

    /* JADX INFO: renamed from: i */
    public long f197791i;

    /* JADX INFO: renamed from: l.y7m0$a */
    public static /* synthetic */ class C21535a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f197792a;

        static {
            int[] iArr = new int[VoiceCloseEvent$GestureIntention.values().length];
            f197792a = iArr;
            try {
                iArr[VoiceCloseEvent$GestureIntention.LEFT2RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public y7m0(dum dumVar, VirtualVoiceCloseView virtualVoiceCloseView) {
        super(dumVar);
        mo52715C(virtualVoiceCloseView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m214546O3(String str) {
        if (y6s.m214496d(((rwn0) m213810E2()).mo183435j().liveMode) && "game".equals(((rwn0) m213810E2()).mo183435j().template)) {
            o1j0.m165651y("游戏中,禁止收起房间");
            return;
        }
        ((rwn0) m213810E2()).m183414Q3(true);
        hti<rwn0> htiVar = new hti<>((rwn0) m213810E2(), m138867n3(), (String) m138856F3(new npc0(3400)), str);
        lwr.m156094b();
        boolean zM111310l = cmp0.m111299d().m111310l(htiVar);
        ((rwn0) m213810E2()).m168505b2(zM111310l);
        if (!zM111310l) {
            lwr.m156096d();
            return;
        }
        cmp0.m111299d().m111309k();
        Act act = this.f196919f;
        if (act == null || act.isDestroyed() || this.f196919f.isFinishing()) {
            return;
        }
        this.f196919f.m68056e2();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m214547P3(dan0 dan0Var) {
        m214554X3(dan0Var.f85896a, dan0Var.f85897b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ Boolean m214548R3(u7f u7fVar) {
        return Boolean.valueOf(((rwn0) m213810E2()).m168495Y0());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m214549S3(View view) {
        m214552V3();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        lwr.m156096d();
        duringCreated(m213811F2().VoiceCloseEvent.showFloatWindow().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.t7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172456a.m214547P3((dan0) obj);
            }
        }));
        m138860d3(u7f.class, new qcj() { // from class: l.u7m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177925a.m214548R3((u7f) obj);
            }
        });
        duringCreated(m213811F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.v7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182784a.m214556Z3((VoiceCloseEvent$GestureIntention) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m214550T3(BLiveExtraResponse bLiveExtraResponse) {
        moo0 moo0Var = new moo0("notice", bLiveExtraResponse.data);
        if (((rwn0) m213810E2()).mo118373p() || i9o0.m139137h(this.f196918e.f90816b)) {
            m213811F2().TopNoticeEvent.openEditNoticeDialog2().mo199273j(moo0Var);
        } else {
            m213811F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().mo199273j(moo0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final void m214551U3(String str) {
        long jM174454o = pzi0.m174454o();
        boolean z = ((rwn0) m213810E2()).m183433h3() || i9o0.m139138i(this);
        if ((jM174454o - this.f197791i) / 1000.0f <= f197790j && !z) {
            m214552V3();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            jkp0.m145882m(this);
            new th0.C20312a(act()).m191151j("确认要离开群聊吗?").m191157p(n9c0.f140855p0).m191159r("确认离开").m191156o(new View.OnClickListener() { // from class: l.x7m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192734a.m214549S3(view);
                }
            }).m191145d(n9c0.f140804X0).m191147f("手滑了").m191142a().m191141g();
        } else if (((rwn0) m213810E2()).m202193m().m146875a() != 0) {
            if (((rwn0) m213810E2()).m168529k0() == null && wft.m206159b(3)) {
                return;
            }
            if (zrv.f205799a.m207696u().live.voiceWindowEnable.booleanValue()) {
                m214546O3(str);
            } else {
                lwr.m156094b();
                act().m68056e2();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m214552V3() {
        jkp0.m145883n(this);
        ydn0.m215254g(this, ((rwn0) m213810E2()).m183423Y2(), "voice-close");
        act().m68056e2();
    }

    /* JADX INFO: renamed from: W3 */
    public void m214553W3() {
        m214551U3(null);
    }

    /* JADX INFO: renamed from: X3 */
    public void m214554X3(boolean z, String str) {
        m214551U3(str);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m214555Y3() {
        m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199277p();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m214556Z3(VoiceCloseEvent$GestureIntention voiceCloseEvent$GestureIntention) {
        if (C21535a.f197792a[voiceCloseEvent$GestureIntention.ordinal()] != 1) {
            return;
        }
        m214551U3("slide");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public void m214557a4() {
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.w7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187771a.m214550T3((BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        if (((rwn0) m213810E2()).m183437k3()) {
            return;
        }
        lwr.m156094b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VirtualVoiceCloseView) this.viewModel).m78508o0(((rwn0) m213810E2()).mo183435j().liveMode);
        f197790j = zrv.m221193k().m203610e4();
        this.f197791i = pzi0.m174454o();
    }
}
