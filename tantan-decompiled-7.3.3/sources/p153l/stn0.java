package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class stn0 extends i6t<rwn0, VoiceLiveApplyManagerEnterViewModel> {
    public stn0(dum<? extends rwn0> dumVar, VoiceLiveApplyManagerEnterViewModel voiceLiveApplyManagerEnterViewModel) {
        super(dumVar);
        mo52715C(voiceLiveApplyManagerEnterViewModel);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ Boolean m187875M3(BLiveVoiceCall bLiveVoiceCall) {
        int i = bLiveVoiceCall.position;
        return Boolean.valueOf((i == 0 || i == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) ? false : true);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m187877O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m187881U3(gvn0 gvn0Var) {
        int iM132569j = gvn0Var.m132569j();
        if (iM132569j == 6) {
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m78866f(m187886W3());
        } else {
            if (iM132569j != 12) {
                return;
            }
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m78865e(m187886W3());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m187882a4(Integer num) {
        if (m187886W3()) {
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).setCount(num.intValue());
        }
    }

    /* JADX INFO: renamed from: d4 */
    private void m187883d4() {
        if (!((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m78867i() && m187886W3()) {
            m187891c4();
        }
        if (!m187885V3()) {
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m78865e(m187886W3());
            return;
        }
        boolean zM187886W3 = m187886W3();
        V v2 = this.viewModel;
        if (zM187886W3) {
            ((VoiceLiveApplyManagerEnterViewModel) v2).m78865e(m187886W3());
        } else {
            ((VoiceLiveApplyManagerEnterViewModel) v2).m78866f(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(((rwn0) m213810E2()).m183413Q2()).filter(new qcj() { // from class: l.mtn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hrk0.C17564a) obj).f111360b == 1);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ntn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143618a.m187888Y3((hrk0.C17564a) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0()).filter(new qcj() { // from class: l.otn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f148994a.m187889Z3((gvn0) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ptn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154097a.m187881U3((gvn0) obj);
            }
        }));
        duringCreated(m213811F2().VoiceCallEvent.updateApplyCountEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.qtn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159472a.m187882a4((Integer) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m187884T3() {
        if (i9o0.m139137h(this)) {
            m213811F2().VoiceApplyManagerEvent.show().mo199273j(new snm0(1));
            if (((rwn0) m213810E2()).mo118373p()) {
                v1n0.m199040r();
                return;
            } else {
                v1n0.m199041s();
                return;
            }
        }
        BLiveVoice bLiveVoiceM183420V2 = ((rwn0) m213810E2()).mo183435j();
        if (NullChecker.m82486a(bLiveVoiceM183420V2) && BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveVoiceM183420V2.liveMode)) {
            List<BLiveVoiceCall> listM136877p = ((rwn0) m213810E2()).m183411P2().m136877p();
            BLiveVoiceCall bLiveVoiceCallM136872k = ((rwn0) m213810E2()).m183411P2().m136872k(BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION);
            ArrayList arrayListM147522n = jyb.m147522n(listM136877p, new qcj() { // from class: l.rtn0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return stn0.m187875M3((BLiveVoiceCall) obj);
                }
            });
            if (bLiveVoiceCallM136872k != null && arrayListM147522n.size() == 7) {
                o1j0.m165649w(R$string.f48369sc);
                return;
            }
            ydn0.m215262o(this);
        } else {
            ydn0.m215261n(this);
        }
        v1n0.m199032j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public boolean m187885V3() {
        final String strM207631D0 = zrv.f205799a.m207631D0();
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) jyb.m147529r(((rwn0) m213810E2()).m183411P2().m136877p(), new qcj() { // from class: l.jtn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(strM207631D0.equals(((BLiveVoiceCall) obj).user));
            }
        });
        if (bLiveVoiceCall != null) {
            return guk0.m132329h(bLiveVoiceCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m187886W3() {
        return i9o0.m139137h(this);
    }

    /* JADX INFO: renamed from: X3 */
    public final Boolean m187887X3(String str) {
        return TextUtils.isEmpty(str) ? Boolean.FALSE : Boolean.valueOf(str.equals(zrv.f205799a.m207631D0()));
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m187888Y3(hrk0.C17564a c17564a) {
        m187883d4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m187889Z3(gvn0 gvn0Var) {
        return m187887X3(gvn0Var.m132564e().user);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m187890b4(ovn0 ovn0Var) {
        ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).setCount(ovn0Var.f149284b.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public void m187891c4() {
        duringCreated(VCallApiProvider.callApplyList(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).mo168489W0())).subscribe(dhw.m115826e(new y20() { // from class: l.ktn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128721a.m187890b4((ovn0) obj);
            }
        }, new y20() { // from class: l.ltn0
            @Override // p153l.y20
            public final void call(Object obj) {
                stn0.m187877O3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m187883d4();
    }
}
