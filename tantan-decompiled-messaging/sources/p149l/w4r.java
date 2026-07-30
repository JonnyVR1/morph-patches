package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel;

/* JADX INFO: loaded from: classes5.dex */
public class w4r extends h4t<nnn0, KtvTuningViewModel> implements we50 {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceKtvPlayInfo f184585i;

    public w4r(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        mo51532C(new KtvTuningViewModel(act()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m201540S3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvGameInfo != null) {
            V v2 = this.viewModel;
            if (((KtvTuningViewModel) v2).f52482w == null || !((KtvTuningViewModel) v2).f52482w.isShowing()) {
                return;
            }
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = bLiveVoiceKtvGameInfo.playInfo;
            if (bLiveVoiceKtvPlayInfo2 == null || !((bLiveVoiceKtvPlayInfo = this.f184585i) == null || bLiveVoiceKtvPlayInfo2.songCode.equals(bLiveVoiceKtvPlayInfo.songCode))) {
                ((KtvTuningViewModel) this.viewModel).f52482w.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m201541W3(Boolean bool) {
        ((KtvTuningViewModel) this.viewModel).setEarClickable(Boolean.valueOf(!bool.booleanValue()));
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: A */
    public void mo201542A() {
        ((KtvTuningViewModel) this.viewModel).m77126k(Boolean.TRUE);
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: B */
    public void mo136668B(String str) {
        ((KtvTuningViewModel) this.viewModel).m77126k(Boolean.FALSE);
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: M1 */
    public void mo201543M1() {
        ((KtvTuningViewModel) this.viewModel).m77126k(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: P3 */
    public int m201544P3() {
        return Math.round(((Float) m129297F3(new gt10(7009))).floatValue() * 100.0f);
    }

    /* JADX INFO: renamed from: R3 */
    public int m201545R3() {
        return Math.round((((Float) m129297F3(new zfb0(7009))).floatValue() * 100.0f) / 4.0f);
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m201546T3() {
        return ((Integer) m129297F3(new o580(7009))).intValue() == 3;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m201547U3(View view) {
        m206028F2().VoiceKtvEvent.switchNext().m172467p();
        ((KtvTuningViewModel) this.viewModel).f52482w.dismiss();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Boolean m201548V3(Boolean bool) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: renamed from: X3 */
    public void m201549X3() {
        new xh0.C21150a(act()).m208731j("切歌会结束当前歌曲，是否切歌？").m208739r("切歌").m208736o(new View.OnClickListener() { // from class: l.v4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179970a.m201547U3(view);
            }
        }).m208727f("取消").m208722a().m208721g();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m201550Y3(int i) {
        m206028F2().VoiceKtvEvent.setAudioEffectPreset().mo172463j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m201551Z3(boolean z) {
        m206028F2().VoiceKtvEvent.setEarSwitcher().mo172463j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a4 */
    public void m201552a4(int i) {
        m206028F2().VoiceKtvEvent.adjustMusicVolume().mo172463j(Float.valueOf(i / 100.0f));
    }

    /* JADX INFO: renamed from: b4 */
    public void m201553b4(boolean z) {
        m206028F2().VoiceKtvEvent.setOriginalSwitcher().mo172463j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c4 */
    public void m201554c4(int i) {
        m206028F2().VoiceKtvEvent.adjustRecordVolume().mo172463j(Float.valueOf((i / 100.0f) * 4.0f));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m201555d4() {
        ((KtvTuningViewModel) this.viewModel).setEarSwitcher((Boolean) m129297F3(new yie(7009)));
        ((KtvTuningViewModel) this.viewModel).setOriginalSwitcher((Boolean) m129297F3(new ny50(7009)));
        ((KtvTuningViewModel) this.viewModel).setAudioEffectPreset(((Integer) m129297F3(new ga1(7009))).intValue());
    }

    /* JADX INFO: renamed from: e4 */
    public void m201556e4() {
        m206028F2().KtvDialogEvent.showKtvDialog().mo172463j(0);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m201557f4(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        this.f184585i = bLiveVoiceKtvPlayInfo;
        ((KtvTuningViewModel) this.viewModel).m77128m(this, bLiveVoiceKtvPlayInfo);
        m201555d4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m201558g4(boolean z) {
        if (z) {
            m206028F2().VoiceKtvEvent.resumeMusic().m172467p();
        } else {
            m206028F2().VoiceKtvEvent.pauseMusic().m172467p();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        V v2 = this.viewModel;
        if (((KtvTuningViewModel) v2).f52482w == null || !((KtvTuningViewModel) v2).f52482w.isShowing()) {
            return;
        }
        ((KtvTuningViewModel) this.viewModel).f52482w.dismiss();
    }

    @Override // p149l.we50
    /* JADX INFO: renamed from: s0 */
    public void mo136698s0() {
        ((KtvTuningViewModel) this.viewModel).m77126k(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceKtvEvent.showTuningDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.q4r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152669a.m201557f4((BLiveVoiceKtvPlayInfo) obj);
            }
        }));
        phn0.m169096b(this, this);
        duringCreated(((nnn0) m206027E2()).m132160q1().m189037B0()).subscribe(ffw.m121197h(new e30() { // from class: l.r4r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157716a.m201540S3((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160262Z2()).map(new w9j() { // from class: l.s4r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                return Boolean.valueOf(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.t4r
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167745a.m201548V3((Boolean) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.u4r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174624a.m201541W3((Boolean) obj);
            }
        }));
    }
}
