package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel;

/* JADX INFO: loaded from: classes5.dex */
public class x6r extends i6t<rwn0, KtvTuningViewModel> implements dn50 {

    /* JADX INFO: renamed from: i */
    public BLiveVoiceKtvPlayInfo f192607i;

    public x6r(dum<? extends rwn0> dumVar) {
        super(dumVar);
        mo52715C(new KtvTuningViewModel(act()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public void m209518S3(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvGameInfo != null) {
            V v2 = this.viewModel;
            if (((KtvTuningViewModel) v2).f53330w == null || !((KtvTuningViewModel) v2).f53330w.isShowing()) {
                return;
            }
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = bLiveVoiceKtvGameInfo.playInfo;
            if (bLiveVoiceKtvPlayInfo2 == null || !((bLiveVoiceKtvPlayInfo = this.f192607i) == null || bLiveVoiceKtvPlayInfo2.songCode.equals(bLiveVoiceKtvPlayInfo.songCode))) {
                ((KtvTuningViewModel) this.viewModel).f53330w.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m209519W3(Boolean bool) {
        ((KtvTuningViewModel) this.viewModel).setEarClickable(Boolean.valueOf(!bool.booleanValue()));
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: A */
    public void mo117044A() {
        ((KtvTuningViewModel) this.viewModel).m78309k(Boolean.TRUE);
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: B */
    public void mo117046B(String str) {
        ((KtvTuningViewModel) this.viewModel).m78309k(Boolean.FALSE);
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: M1 */
    public void mo117048M1() {
        ((KtvTuningViewModel) this.viewModel).m78309k(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: P3 */
    public int m209520P3() {
        return Math.round(((Float) m138856F3(new o120(7009))).floatValue() * 100.0f);
    }

    /* JADX INFO: renamed from: R3 */
    public int m209521R3() {
        return Math.round((((Float) m138856F3(new dob0(7009))).floatValue() * 100.0f) / 4.0f);
    }

    /* JADX INFO: renamed from: T3 */
    public boolean m209522T3() {
        return ((Integer) m138856F3(new ud80(7009))).intValue() == 3;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m209523U3(View view) {
        m213811F2().VoiceKtvEvent.switchNext().m199277p();
        ((KtvTuningViewModel) this.viewModel).f53330w.dismiss();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Boolean m209524V3(Boolean bool) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: renamed from: X3 */
    public void m209525X3() {
        new th0.C20312a(act()).m191151j("切歌会结束当前歌曲，是否切歌？").m191159r("切歌").m191156o(new View.OnClickListener() { // from class: l.w6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187645a.m209523U3(view);
            }
        }).m191147f("取消").m191142a().m191141g();
    }

    /* JADX INFO: renamed from: Y3 */
    public void m209526Y3(int i) {
        m213811F2().VoiceKtvEvent.setAudioEffectPreset().mo199273j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: Z3 */
    public void m209527Z3(boolean z) {
        m213811F2().VoiceKtvEvent.setEarSwitcher().mo199273j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a4 */
    public void m209528a4(int i) {
        m213811F2().VoiceKtvEvent.adjustMusicVolume().mo199273j(Float.valueOf(i / 100.0f));
    }

    /* JADX INFO: renamed from: b4 */
    public void m209529b4(boolean z) {
        m213811F2().VoiceKtvEvent.setOriginalSwitcher().mo199273j(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c4 */
    public void m209530c4(int i) {
        m213811F2().VoiceKtvEvent.adjustRecordVolume().mo199273j(Float.valueOf((i / 100.0f) * 4.0f));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m209531d4() {
        ((KtvTuningViewModel) this.viewModel).setEarSwitcher((Boolean) m138856F3(new cke(7009)));
        ((KtvTuningViewModel) this.viewModel).setOriginalSwitcher((Boolean) m138856F3(new s660(7009)));
        ((KtvTuningViewModel) this.viewModel).setAudioEffectPreset(((Integer) m138856F3(new na1(7009))).intValue());
    }

    /* JADX INFO: renamed from: e4 */
    public void m209532e4() {
        m213811F2().KtvDialogEvent.showKtvDialog().mo199273j(0);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m209533f4(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        this.f192607i = bLiveVoiceKtvPlayInfo;
        ((KtvTuningViewModel) this.viewModel).m78311m(this, bLiveVoiceKtvPlayInfo);
        m209531d4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m209534g4(boolean z) {
        if (z) {
            m213811F2().VoiceKtvEvent.resumeMusic().m199277p();
        } else {
            m213811F2().VoiceKtvEvent.pauseMusic().m199277p();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        V v2 = this.viewModel;
        if (((KtvTuningViewModel) v2).f53330w == null || !((KtvTuningViewModel) v2).f53330w.isShowing()) {
            return;
        }
        ((KtvTuningViewModel) this.viewModel).f53330w.dismiss();
    }

    @Override // p153l.dn50
    /* JADX INFO: renamed from: s0 */
    public void mo117052s0() {
        ((KtvTuningViewModel) this.viewModel).m78309k(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceKtvEvent.showTuningDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.r6r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161494a.m209533f4((BLiveVoiceKtvPlayInfo) obj);
            }
        }));
        tqn0.m192318b(this, this);
        duringCreated(((rwn0) m213810E2()).m168545q1().m98219B0()).subscribe(dhw.m115829h(new y20() { // from class: l.s6r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166601a.m209518S3((BLiveVoiceKtvGameInfo) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183424Z2()).map(new qcj() { // from class: l.t6r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) obj;
                return Boolean.valueOf(bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser);
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.u6r
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177803a.m209524V3((Boolean) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.v6r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182679a.m209519W3((Boolean) obj);
            }
        }));
    }
}
