package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class okn0 extends h4t<nnn0, VoiceLiveApplyManagerEnterViewModel> {
    public okn0(bsm<? extends nnn0> bsmVar, VoiceLiveApplyManagerEnterViewModel voiceLiveApplyManagerEnterViewModel) {
        super(bsmVar);
        mo51532C(voiceLiveApplyManagerEnterViewModel);
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ Boolean m164868M3(BLiveVoiceCall bLiveVoiceCall) {
        int i = bLiveVoiceCall.position;
        return Boolean.valueOf((i == 0 || i == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) ? false : true);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m164870O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public void m164874U3(cmn0 cmn0Var) {
        int iM107682j = cmn0Var.m107682j();
        if (iM107682j == 6) {
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m77683f(m164879W3());
        } else {
            if (iM107682j != 12) {
                return;
            }
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m77682e(m164879W3());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m164875a4(Integer num) {
        if (m164879W3()) {
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).setCount(num.intValue());
        }
    }

    /* JADX INFO: renamed from: d4 */
    private void m164876d4() {
        if (!((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m77684i() && m164879W3()) {
            m164884c4();
        }
        if (!m164878V3()) {
            ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).m77682e(m164879W3());
            return;
        }
        boolean zM164879W3 = m164879W3();
        V v2 = this.viewModel;
        if (zM164879W3) {
            ((VoiceLiveApplyManagerEnterViewModel) v2).m77682e(m164879W3());
        } else {
            ((VoiceLiveApplyManagerEnterViewModel) v2).m77683f(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(((nnn0) m206027E2()).m160251Q2()).filter(new w9j() { // from class: l.ikn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((bik0.C15867a) obj).f75773b == 1);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.jkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118400a.m164881Y3((bik0.C15867a) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0()).filter(new w9j() { // from class: l.kkn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123578a.m164882Z3((cmn0) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.lkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128593a.m164874U3((cmn0) obj);
            }
        }));
        duringCreated(m206028F2().VoiceCallEvent.updateApplyCountEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134363a.m164875a4((Integer) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m164877T3() {
        if (e0o0.m114322h(this)) {
            m206028F2().VoiceApplyManagerEvent.show().mo172463j(new oem0(1));
            if (((nnn0) m206027E2()).mo97490p()) {
                rsm0.m180710r();
                return;
            } else {
                rsm0.m180711s();
                return;
            }
        }
        BLiveVoice bLiveVoiceM160258V2 = ((nnn0) m206027E2()).mo149813j();
        if (NullChecker.m81303a(bLiveVoiceM160258V2) && BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveVoiceM160258V2.liveMode)) {
            List<BLiveVoiceCall> listM102067p = ((nnn0) m206027E2()).m160249P2().m102067p();
            BLiveVoiceCall bLiveVoiceCallM102062k = ((nnn0) m206027E2()).m160249P2().m102062k(BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION);
            ArrayList arrayListM200339n = vwb.m200339n(listM102067p, new w9j() { // from class: l.nkn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return okn0.m164868M3((BLiveVoiceCall) obj);
                }
            });
            if (bLiveVoiceCallM102062k != null && arrayListM200339n.size() == 7) {
                lsi0.m151593w(R$string.f47521sc);
                return;
            }
            u4n0.m191756o(this);
        } else {
            u4n0.m191755n(this);
        }
        rsm0.m180702j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public boolean m164878V3() {
        final String strM199309D0 = ypv.f199493a.m199309D0();
        BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.m200346r(((nnn0) m206027E2()).m160249P2().m102067p(), new w9j() { // from class: l.fkn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(strM199309D0.equals(((BLiveVoiceCall) obj).user));
            }
        });
        if (bLiveVoiceCall != null) {
            return alk0.m97309h(bLiveVoiceCall);
        }
        return false;
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m164879W3() {
        return e0o0.m114322h(this);
    }

    /* JADX INFO: renamed from: X3 */
    public final Boolean m164880X3(String str) {
        return TextUtils.isEmpty(str) ? Boolean.FALSE : Boolean.valueOf(str.equals(ypv.f199493a.m199309D0()));
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m164881Y3(bik0.C15867a c15867a) {
        m164876d4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m164882Z3(cmn0 cmn0Var) {
        return m164880X3(cmn0Var.m107677e().user);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m164883b4(kmn0 kmn0Var) {
        ((VoiceLiveApplyManagerEnterViewModel) this.viewModel).setCount(kmn0Var.f123814b.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public void m164884c4() {
        duringCreated(VCallApiProvider.callApplyList(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).mo132103W0())).subscribe(ffw.m121194e(new e30() { // from class: l.gkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103209a.m164883b4((kmn0) obj);
            }
        }, new e30() { // from class: l.hkn0
            @Override // p149l.e30
            public final void call(Object obj) {
                okn0.m164870O3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m164876d4();
    }
}
