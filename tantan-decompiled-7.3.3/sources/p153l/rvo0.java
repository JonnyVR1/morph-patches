package p153l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy;
import com.p051p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class rvo0<D extends rwn0> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public FrameLayout f165039i;

    /* JADX INFO: renamed from: j */
    public VoiceLiveMotionType f165040j;

    /* JADX INFO: renamed from: k */
    public String f165041k;

    /* JADX INFO: renamed from: l */
    public VoicePlayStrategy f165042l;

    /* JADX INFO: renamed from: m */
    public final String f165043m;

    /* JADX INFO: renamed from: n */
    public final String f165044n;

    public rvo0(dum dumVar, FrameLayout frameLayout) {
        super(dumVar);
        this.f165041k = "";
        this.f165043m = VirtualVoiceMotionType.undercover;
        this.f165044n = "intl_sing";
        this.f165039i = frameLayout;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m183281K3(Integer num, VoiceLiveMotionType voiceLiveMotionType) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m183283M3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m183285O3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m183287S3(String str) {
        if (!TextUtils.isEmpty(str) && (VirtualVoiceMotionType.undercover.equals(str) || "intl_sing".equals(str))) {
            m183289T3(str);
        } else {
            if (wft.m206159b(3)) {
                return;
            }
            m183295Z3(true);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m183288R3(VoiceLiveInfoMessage voiceLiveInfoMessage) {
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        if (bLiveVoiceMo183435j.liveMode.equals(voiceLiveInfoMessage.liveMode.toString())) {
            return;
        }
        this.f165041k = voiceLiveInfoMessage.liveMode.toString();
        bLiveVoiceMo183435j.liveMode = voiceLiveInfoMessage.liveMode.toString();
        m213810E2().mo183431g(bLiveVoiceMo183435j);
        if (TEnum.equals(voiceLiveInfoMessage.liveMode, "auction")) {
            m183292W3(VoiceLiveMotionType.voice_auction);
        } else if (TEnum.equals(voiceLiveInfoMessage.liveMode, "normal")) {
            m183292W3(VoiceLiveMotionType.voice_call_normal);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m183289T3(String str) {
        if (VirtualVoiceMotionType.undercover.equals(str)) {
            duringCreated(nuj0.m164807l(m213810E2().m202191k())).map(new qcj() { // from class: l.ovo0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("end".equals(((BLiveUndercoverGame) obj).status));
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.pvo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154312a.m183295Z3(((Boolean) obj).booleanValue());
                }
            }, new y20() { // from class: l.qvo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    rvo0.m183283M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m183290U3() {
        VoicePlayStrategy voicePlayStrategy = this.f165042l;
        if (voicePlayStrategy == null || !(TextUtils.equals(voicePlayStrategy.getType(), BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY) || TextUtils.equals(this.f165042l.getType(), BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY) || TextUtils.equals(this.f165042l.getType(), BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY))) {
            m183294Y3(false, null, this.f165040j);
            BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
            if (TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.EIGHT_DEPUTY_STRATEGY)) {
                this.f165042l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY);
            } else if (TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY)) {
                this.f165042l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY);
            } else if (TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.TEN_DEPUTY_STRATEGY)) {
                this.f165042l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY);
            } else {
                this.f165042l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY);
            }
            VoiceLiveMotionType voiceLiveMotionType = VoiceLiveMotionType.voice_call_normal;
            m213810E2().m183405K3(this.f165042l.getDeputyCount());
            m183294Y3(true, this.f165042l.getPlayStrategyView(), voiceLiveMotionType);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m183291V3() {
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        if ("auction".equals(bLiveVoiceMo183435j.liveMode)) {
            this.f165040j = VoiceLiveMotionType.voice_auction;
            this.f165042l = VoicePlayStrategy.getStrategy(BLiveVoice.AUCTION_STRATEGY);
        } else {
            this.f165042l = VoicePlayStrategy.getStrategy(bLiveVoiceMo183435j.onCallView);
            this.f165040j = VoiceLiveMotionType.voice_call_normal;
        }
        this.f165041k = bLiveVoiceMo183435j.liveMode;
        m213810E2().m183405K3(this.f165042l.getDeputyCount());
        m183294Y3(true, this.f165042l.getPlayStrategyView(), this.f165040j);
    }

    /* JADX INFO: renamed from: W3 */
    public void m183292W3(VoiceLiveMotionType voiceLiveMotionType) {
        m183294Y3(false, null, this.f165040j);
        this.f165040j = voiceLiveMotionType;
        if (voiceLiveMotionType == VoiceLiveMotionType.voice_auction) {
            this.f165042l = VoicePlayStrategy.getStrategy(BLiveVoice.AUCTION_STRATEGY);
        } else {
            this.f165042l = VoicePlayStrategy.getStrategy(m213810E2().mo183435j().onCallView);
            m213811F2().VoiceAuctionEvent.refreshVoiceBg().mo199273j("");
        }
        m213810E2().m183405K3(this.f165042l.getDeputyCount());
        m183294Y3(true, this.f165042l.getPlayStrategyView(), this.f165040j);
    }

    /* JADX INFO: renamed from: X3 */
    public void m183293X3() {
        VoicePlayStrategy voicePlayStrategy = this.f165042l;
        if (voicePlayStrategy == null || TextUtils.equals(voicePlayStrategy.getType(), BLiveVoice.THREE_DEPUTY_STRATEGY) || TextUtils.equals(this.f165042l.getType(), BLiveVoice.FIVE_DEPUTY_STRATEGY) || TextUtils.equals(this.f165042l.getType(), BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY) || TextUtils.equals(this.f165042l.getType(), BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY) || TextUtils.equals(this.f165042l.getType(), BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY)) {
            m183294Y3(false, null, this.f165040j);
            if (m213810E2().m202193m().m146877c()) {
                return;
            }
            m183291V3();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m183294Y3(boolean z, sam samVar, VoiceLiveMotionType voiceLiveMotionType) {
        abo0 abo0Var = new abo0(z, voiceLiveMotionType);
        if (!z) {
            m213811F2().VoiceMotionEvent.motionSwitch().mo199273j(abo0Var);
        } else {
            if (this.f196918e.f90827m.m204784M3(voiceLiveMotionType)) {
                return;
            }
            abo0Var.m96775b(new f8o0(this.f165039i, samVar)).m96774a(new z20() { // from class: l.jvo0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    rvo0.m183281K3((Integer) obj, (VoiceLiveMotionType) obj2);
                }
            });
            m213811F2().VoiceMotionEvent.motionSwitch().mo199273j(abo0Var);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m183295Z3(boolean z) {
        if (z) {
            m183293X3();
        } else {
            m183290U3();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f165041k = "";
        m183294Y3(false, null, this.f165040j);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m183291V3();
        duringCreated(m213810E2().m168545q1().m98249Q0()).subscribe(dhw.m115829h(new y20() { // from class: l.kvo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128979a.m183288R3((VoiceLiveInfoMessage) obj);
            }
        }));
        duringCreated(m213810E2().m183409O2().m188658d()).map(new qcj() { // from class: l.lvo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveVoice) obj).template;
            }
        }).distinctUntilChanged().doOnNext(new y20() { // from class: l.mvo0
            @Override // p153l.y20
            public final void call(Object obj) {
                rvo0.m183285O3((String) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nvo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143827a.m183287S3((String) obj);
            }
        }));
    }
}
