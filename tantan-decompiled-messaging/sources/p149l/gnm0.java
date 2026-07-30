package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class gnm0 extends nsm0 {

    /* JADX INFO: renamed from: i */
    public boolean f103608i;

    public gnm0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m127146W3(BLiveVoiceCall bLiveVoiceCall) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m127148a4(BLiveVoiceCall bLiveVoiceCall) {
        if (alk0.m97307f(bLiveVoiceCall)) {
            if (this.f103608i) {
                return;
            }
            m127158i4(bLiveVoiceCall);
        } else if ((alk0.m97313l(bLiveVoiceCall) || alk0.m97309h(bLiveVoiceCall)) && ypv.m215672k().m195785Z5()) {
            ypv.f199493a.m199374u().live.voiceWindowEnable.booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public Boolean m127149b4(w14 w14Var) {
        gkh0.m126627j("[voice][call]", "handleBackEvent " + w14Var.getAction());
        final BLiveVoiceCall bLiveVoiceCallM160786M3 = m160786M3();
        if (alk0.m97307f(bLiveVoiceCallM160786M3) || bLiveVoiceCallM160786M3 == null) {
            return Boolean.FALSE;
        }
        if (w14Var.m200912d()) {
            return Boolean.valueOf(alk0.m97306e(bLiveVoiceCallM160786M3));
        }
        if (w14Var.m200916h()) {
            return Boolean.TRUE;
        }
        if ((w14Var.m200917i() || w14Var.m200913e() || w14Var.m200914f() || w14Var.m200915g()) && alk0.m97314m(bLiveVoiceCallM160786M3)) {
            if (!TextUtils.isEmpty(bLiveVoiceCallM160786M3.f44485id)) {
                duringCreated(VCallApiProvider.cancelCallApply(bLiveVoiceCallM160786M3.f44485id)).subscribe(ffw.m121197h(new e30() { // from class: l.bnm0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        gnm0.m127146W3((BLiveVoiceCall) obj);
                    }
                }));
            }
            return Boolean.FALSE;
        }
        if (w14Var.m200914f() || w14Var.m200915g() || w14Var.m200913e()) {
            if (!x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode) || !w14Var.m200915g()) {
                m127153d4(bLiveVoiceCallM160786M3, w14Var);
            }
        } else if (alk0.m97309h(bLiveVoiceCallM160786M3)) {
            lsi0.m151593w(alk0.m97303b(bLiveVoiceCallM160786M3, w14Var, false));
        } else if (alk0.m97314m(bLiveVoiceCallM160786M3) || alk0.m97313l(bLiveVoiceCallM160786M3)) {
            m127159j4(w14Var, bLiveVoiceCallM160786M3, R$string.f46863O1, new Runnable() { // from class: l.cnm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81669a.m127154e4(bLiveVoiceCallM160786M3);
                }
            });
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c4 */
    private void m127150c4(String str) {
        u4n0.m191748g(this, m160786M3(), str);
        if ("voice-close".equals(str)) {
            m160786M3().state = "hung-up";
            m206028F2().FragProxyEvent.clickClose().m172467p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121193d(new e30() { // from class: l.anm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70745a.m127148a4((BLiveVoiceCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public void m127151Y3(String str) {
        duringCreated(VCallApiProvider.cancelCallApply(str)).subscribe(ffw.m121194e(new e30() { // from class: l.fnm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98435a.m160788O3((BLiveVoiceCall) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: Z3 */
    public final int m127152Z3(w14 w14Var, boolean z) {
        if (w14Var.m200914f()) {
            return z ? R$string.f47051X0 : R$string.f47598w1;
        }
        return R$string.f47646y5;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m127153d4(final BLiveVoiceCall bLiveVoiceCall, final w14 w14Var) {
        if (alk0.m97309h(bLiveVoiceCall)) {
            m127159j4(w14Var, bLiveVoiceCall, w14Var.m200914f() ? R$string.f47187d7 : R$string.f47467q2, new Runnable() { // from class: l.dnm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87083a.m127155f4(w14Var);
                }
            });
        } else if (alk0.m97314m(bLiveVoiceCall) || alk0.m97313l(bLiveVoiceCall)) {
            m127159j4(w14Var, bLiveVoiceCall, R$string.f47467q2, new Runnable() { // from class: l.enm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92327a.m127156g4(bLiveVoiceCall);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m127154e4(BLiveVoiceCall bLiveVoiceCall) {
        m127151Y3(bLiveVoiceCall.f44485id);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m127155f4(w14 w14Var) {
        m127150c4(w14Var.m200914f() ? "voice-close" : "");
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m127156g4(BLiveVoiceCall bLiveVoiceCall) {
        m127151Y3(bLiveVoiceCall.f44485id);
    }

    /* JADX INFO: renamed from: h4 */
    public void m127157h4(cmn0 cmn0Var) {
        if (cmn0Var.m107685m()) {
            int iM107682j = cmn0Var.m107682j();
            if (iM107682j == 7) {
                lsi0.m151595y(act().getString(R$string.f47220ei, cmn0Var.m107684l() ? act().getString(R$string.f47384m7) : act().getString(R$string.f47488r1)));
            } else {
                if (iM107682j != 8) {
                    return;
                }
                lsi0.m151595y(act().getString(R$string.f46686Fj, cmn0Var.m107684l() ? act().getString(R$string.f47384m7) : act().getString(R$string.f47488r1)));
            }
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m127158i4(BLiveVoiceCall bLiveVoiceCall) {
        if (jkk0.f118392b.equals(bLiveVoiceCall.hangupReason) || jkk0.f118393c.equals(bLiveVoiceCall.hangupReason)) {
            return;
        }
        m206028F2().VoiceCallEvent.openCallSummaryEvent().mo172463j(bLiveVoiceCall.f44485id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m127159j4(w14 w14Var, BLiveVoiceCall bLiveVoiceCall, int i, Runnable runnable) {
        boolean zM207012b = x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode);
        Dialog.C4309e c4309eM20554s0 = this.f188513f.dialog().m20500D(alk0.m97303b(bLiveVoiceCall, w14Var, zM207012b)).m20554s0(m127152Z3(w14Var, zM207012b));
        c4309eM20554s0.m20542l0(i, runnable);
        c4309eM20554s0.m20568z0();
    }

    @Override // p149l.nsm0, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f188513f.setSwipeBackEnable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.nsm0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(w14.class, new w9j() { // from class: l.ymm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f199034a.m127149b4((w14) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0()).subscribe(ffw.m121193d(new e30() { // from class: l.zmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203747a.m127157h4((cmn0) obj);
            }
        }));
    }
}
