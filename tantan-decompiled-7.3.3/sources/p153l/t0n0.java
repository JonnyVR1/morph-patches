package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class t0n0 extends lnm0<rwn0, i0n0> {

    /* JADX INFO: renamed from: j */
    public dom0 f171544j;

    public t0n0(dum dumVar, dom0 dom0Var) {
        super(dumVar);
        mo52715C(new i0n0(dumVar.f90815a));
        this.f171544j = dom0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ C22421c m188813h4(uxj0 uxj0Var) {
        return ((rwn0) m213810E2()).m183417S3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        ((i0n0) this.viewModel).m138028j(this.f196918e.f90815a);
        m214779N3(((rwn0) m213810E2()).m168537m2().onErrorReturn(new qcj() { // from class: l.j0n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.k0n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123411a.m188813h4((uxj0) obj);
            }
        })).filter(new qcj() { // from class: l.l0n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                p7o0 p7o0Var = (p7o0) obj;
                return Boolean.valueOf((p7o0Var == null || jyb.m147479J(p7o0Var.f150952a)) ? false : true);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.m0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134324a.m188818i4((p7o0) obj);
            }
        }));
        m214779N3(((rwn0) m213810E2()).m183417S3()).subscribe(dhw.m115829h(new y20() { // from class: l.n0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139639a.m188814j4((p7o0) obj);
            }
        }));
        m214779N3(((rwn0) m213810E2()).m183413Q2()).filter(new o0n0()).subscribe(dhw.m115825d(new y20() { // from class: l.p0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150079a.m188819k4((hrk0.C17564a) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().f71701c0).subscribe(dhw.m115829h(new y20() { // from class: l.q0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155072a.m188820l4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m188814j4(p7o0 p7o0Var) {
        ((i0n0) this.viewModel).m138026f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    private void m188815o4() {
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        ((rwn0) m213810E2()).m168540n2();
        ((rwn0) m213810E2()).mo118371N1(bLiveVoiceMo183435j.room.f45267id);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.lnm0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public fom0 mo154984S3() {
        return new fom0(zrv.f205803e.getString(R$string.f47874Vh), ((i0n0) this.viewModel).m138027i(), 2);
    }

    @Override // p153l.lnm0
    /* JADX INFO: renamed from: T3 */
    public int mo154985T3() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.lnm0
    /* JADX INFO: renamed from: U3 */
    public void mo154986U3() {
        super.mo154986U3();
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        ((rwn0) m213810E2()).m183395D3(bLiveVoiceMo183435j.room.f45267id);
    }

    @Override // p153l.lnm0
    /* JADX INFO: renamed from: V3 */
    public void mo154987V3() {
        m188815o4();
    }

    /* JADX INFO: renamed from: f4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m188822n4(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        o1j0.m165651y(xau.m209910t(R$string.f48394tf));
        ((i0n0) this.viewModel).m138034s(str, bLiveVoiceCallInvite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m188817g4(final String str) {
        dom0 dom0Var = this.f171544j;
        if (dom0Var == null || dom0Var.m117322h4() == -1) {
            m214779N3(VCallApiProvider.callInvite(((rwn0) m213810E2()).m202191k(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.s0n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f165713a.m188822n4(str, (BLiveVoiceCallInvite) obj);
                }
            }, new wnt()));
        } else {
            m214779N3(VCallApiProvider.callInvite(((rwn0) m213810E2()).m202191k(), str, this.f171544j.m117322h4())).subscribe(dhw.m115826e(new y20() { // from class: l.r0n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160657a.m188821m4(str, (BLiveVoiceCallInvite) obj);
                }
            }, new r5k()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m188818i4(p7o0 p7o0Var) {
        ((i0n0) this.viewModel).m138033q(p7o0Var.f150952a, null, ((rwn0) m213810E2()).mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m188819k4(hrk0.C17564a c17564a) {
        mo154987V3();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m188820l4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        mo154987V3();
    }
}
