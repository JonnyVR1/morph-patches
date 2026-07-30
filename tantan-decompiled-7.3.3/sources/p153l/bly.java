package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p153l.cly;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class bly<D extends rwn0, VM extends cly> extends djy<D, VM> {
    public bly(dum<D> dumVar, VM vm) {
        super(dumVar);
        mo52715C(vm);
    }

    /* JADX INFO: renamed from: i4 */
    private void m104940i4() {
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        m213810E2().mo118371N1(bLiveVoiceMo183435j.room.f45267id);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.djy
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public sjy mo104941S3() {
        return new sjy("在线", ((cly) this.viewModel).m110710b(), 0);
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: T3 */
    public int mo104942T3() {
        return 0;
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: U3 */
    public void mo104943U3() {
        super.mo104943U3();
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        if (bLiveVoiceMo183435j == null) {
            return;
        }
        m213810E2().m183395D3(bLiveVoiceMo183435j.room.f45267id);
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: V3 */
    public void mo104944V3() {
        m104940i4();
    }

    /* JADX INFO: renamed from: c4, reason: merged with bridge method [inline-methods] */
    public final void m104950h4(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        o1j0.m165651y(xau.m209910t(R$string.f48394tf));
        ((cly) this.viewModel).m110712d(str, bLiveVoiceCallInvite);
    }

    /* JADX INFO: renamed from: d4 */
    public void m104946d4(final String str) {
        eky.m121089b(m213810E2().mo118373p(), m213810E2().m168532l0().f56859id, m213810E2().m202191k(), "management_host");
        m214779N3(VCallApiProvider.callInvite(m213810E2().m202191k(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.aly
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72168a.m104950h4(str, (BLiveVoiceCallInvite) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m104947e4(p7o0 p7o0Var) {
        ((cly) this.viewModel).m110711c(p7o0Var);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m104948f4(hrk0.C17564a c17564a) {
        mo104944V3();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m104949g4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        mo104944V3();
    }

    public void init() {
        ((cly) this.viewModel).init();
        m214779N3(m213810E2().m183417S3()).filter(new qcj() { // from class: l.wky
            @Override // p153l.qcj
            public final Object call(Object obj) {
                p7o0 p7o0Var = (p7o0) obj;
                return Boolean.valueOf((p7o0Var == null || jyb.m147479J(p7o0Var.f150952a)) ? false : true);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.xky
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194829a.m104947e4((p7o0) obj);
            }
        }));
        m214779N3(m213810E2().m183413Q2()).filter(new o0n0()).subscribe(dhw.m115825d(new y20() { // from class: l.yky
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200502a.m104948f4((hrk0.C17564a) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71701c0).subscribe(dhw.m115829h(new y20() { // from class: l.zky
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204864a.m104949g4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        m104940i4();
    }
}
