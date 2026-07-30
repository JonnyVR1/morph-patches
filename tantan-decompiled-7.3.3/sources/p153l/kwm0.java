package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class kwm0 extends r1n0 {

    /* JADX INFO: renamed from: i */
    public boolean f129077i;

    public kwm0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m151706W3(BLiveVoiceCall bLiveVoiceCall) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m151708a4(BLiveVoiceCall bLiveVoiceCall) {
        if (guk0.m132327f(bLiveVoiceCall)) {
            if (this.f129077i) {
                return;
            }
            m151718i4(bLiveVoiceCall);
        } else if ((guk0.m132333l(bLiveVoiceCall) || guk0.m132329h(bLiveVoiceCall)) && zrv.m221193k().m203572Z5()) {
            zrv.f205799a.m207696u().live.voiceWindowEnable.booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public Boolean m151709b4(v24 v24Var) {
        nsh0.m164608j("[voice][call]", "handleBackEvent " + v24Var.getAction());
        final BLiveVoiceCall bLiveVoiceCallM179430M3 = m179430M3();
        if (guk0.m132327f(bLiveVoiceCallM179430M3) || bLiveVoiceCallM179430M3 == null) {
            return Boolean.FALSE;
        }
        if (v24Var.m199115d()) {
            return Boolean.valueOf(guk0.m132326e(bLiveVoiceCallM179430M3));
        }
        if (v24Var.m199119h()) {
            return Boolean.TRUE;
        }
        if ((v24Var.m199120i() || v24Var.m199116e() || v24Var.m199117f() || v24Var.m199118g()) && guk0.m132334m(bLiveVoiceCallM179430M3)) {
            if (!TextUtils.isEmpty(bLiveVoiceCallM179430M3.f45333id)) {
                duringCreated(VCallApiProvider.cancelCallApply(bLiveVoiceCallM179430M3.f45333id)).subscribe(dhw.m115829h(new y20() { // from class: l.fwm0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        kwm0.m151706W3((BLiveVoiceCall) obj);
                    }
                }));
            }
            return Boolean.FALSE;
        }
        if (v24Var.m199117f() || v24Var.m199118g() || v24Var.m199116e()) {
            if (!y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode) || !v24Var.m199118g()) {
                m151713d4(bLiveVoiceCallM179430M3, v24Var);
            }
        } else if (guk0.m132329h(bLiveVoiceCallM179430M3)) {
            o1j0.m165649w(guk0.m132323b(bLiveVoiceCallM179430M3, v24Var, false));
        } else if (guk0.m132334m(bLiveVoiceCallM179430M3) || guk0.m132333l(bLiveVoiceCallM179430M3)) {
            m151719j4(v24Var, bLiveVoiceCallM179430M3, R$string.f47711O1, new Runnable() { // from class: l.gwm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106854a.m151714e4(bLiveVoiceCallM179430M3);
                }
            });
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c4 */
    private void m151710c4(String str) {
        ydn0.m215254g(this, m179430M3(), str);
        if ("voice-close".equals(str)) {
            m179430M3().state = "hung-up";
            m213811F2().FragProxyEvent.clickClose().m199277p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115825d(new y20() { // from class: l.ewm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96175a.m151708a4((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m151711Y3(String str) {
        duringCreated(VCallApiProvider.cancelCallApply(str)).subscribe(dhw.m115826e(new y20() { // from class: l.jwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122944a.m179432O3((BLiveVoiceCall) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: Z3 */
    public final int m151712Z3(v24 v24Var, boolean z) {
        if (v24Var.m199117f()) {
            return z ? R$string.f47899X0 : R$string.f48446w1;
        }
        return R$string.f48494y5;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m151713d4(final BLiveVoiceCall bLiveVoiceCall, final v24 v24Var) {
        if (guk0.m132329h(bLiveVoiceCall)) {
            m151719j4(v24Var, bLiveVoiceCall, v24Var.m199117f() ? R$string.f48035d7 : R$string.f48315q2, new Runnable() { // from class: l.hwm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111901a.m151715f4(v24Var);
                }
            });
        } else if (guk0.m132334m(bLiveVoiceCall) || guk0.m132333l(bLiveVoiceCall)) {
            m151719j4(v24Var, bLiveVoiceCall, R$string.f48315q2, new Runnable() { // from class: l.iwm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117281a.m151716g4(bLiveVoiceCall);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m151714e4(BLiveVoiceCall bLiveVoiceCall) {
        m151711Y3(bLiveVoiceCall.f45333id);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m151715f4(v24 v24Var) {
        m151710c4(v24Var.m199117f() ? "voice-close" : "");
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m151716g4(BLiveVoiceCall bLiveVoiceCall) {
        m151711Y3(bLiveVoiceCall.f45333id);
    }

    /* JADX INFO: renamed from: h4 */
    public void m151717h4(gvn0 gvn0Var) {
        if (gvn0Var.m132572m()) {
            int iM132569j = gvn0Var.m132569j();
            if (iM132569j == 7) {
                o1j0.m165651y(act().getString(R$string.f48068ei, gvn0Var.m132571l() ? act().getString(R$string.f48232m7) : act().getString(R$string.f48336r1)));
            } else {
                if (iM132569j != 8) {
                    return;
                }
                o1j0.m165651y(act().getString(R$string.f47534Fj, gvn0Var.m132571l() ? act().getString(R$string.f48232m7) : act().getString(R$string.f48336r1)));
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m151718i4(BLiveVoiceCall bLiveVoiceCall) {
        if (ptk0.f154092b.equals(bLiveVoiceCall.hangupReason) || ptk0.f154093c.equals(bLiveVoiceCall.hangupReason)) {
            return;
        }
        m213811F2().VoiceCallEvent.openCallSummaryEvent().mo199273j(bLiveVoiceCall.f45333id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m151719j4(v24 v24Var, BLiveVoiceCall bLiveVoiceCall, int i, Runnable runnable) {
        boolean zM214494b = y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode);
        Dialog.C4460e c4460eM21553s0 = this.f196919f.dialog().m21499D(guk0.m132323b(bLiveVoiceCall, v24Var, zM214494b)).m21553s0(m151712Z3(v24Var, zM214494b));
        c4460eM21553s0.m21541l0(i, runnable);
        c4460eM21553s0.m21567z0();
    }

    @Override // p153l.r1n0, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f196919f.setSwipeBackEnable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.r1n0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(v24.class, new qcj() { // from class: l.cwm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84136a.m151709b4((v24) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0()).subscribe(dhw.m115825d(new y20() { // from class: l.dwm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91034a.m151717h4((gvn0) obj);
            }
        }));
    }
}
