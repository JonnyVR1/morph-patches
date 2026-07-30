package p149l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy;
import com.p046p1.mobile.putong.live.livingroom.voice.motion.VoiceLiveMotionType;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class nmo0<D extends nnn0> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public FrameLayout f139648i;

    /* JADX INFO: renamed from: j */
    public VoiceLiveMotionType f139649j;

    /* JADX INFO: renamed from: k */
    public String f139650k;

    /* JADX INFO: renamed from: l */
    public VoicePlayStrategy f139651l;

    /* JADX INFO: renamed from: m */
    public final String f139652m;

    /* JADX INFO: renamed from: n */
    public final String f139653n;

    public nmo0(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        this.f139650k = "";
        this.f139652m = VirtualVoiceMotionType.undercover;
        this.f139653n = "intl_sing";
        this.f139648i = frameLayout;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m160138K3(Integer num, VoiceLiveMotionType voiceLiveMotionType) {
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m160140M3(Throwable th) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m160142O3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m160144S3(String str) {
        if (!TextUtils.isEmpty(str) && (VirtualVoiceMotionType.undercover.equals(str) || "intl_sing".equals(str))) {
            m160146T3(str);
        } else {
            if (vdt.m198092b(3)) {
                return;
            }
            m160152Z3(true);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m160145R3(VoiceLiveInfoMessage voiceLiveInfoMessage) {
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        if (bLiveVoiceMo149813j.liveMode.equals(voiceLiveInfoMessage.liveMode.toString())) {
            return;
        }
        this.f139650k = voiceLiveInfoMessage.liveMode.toString();
        bLiveVoiceMo149813j.liveMode = voiceLiveInfoMessage.liveMode.toString();
        m206027E2().mo149811g(bLiveVoiceMo149813j);
        if (TEnum.equals(voiceLiveInfoMessage.liveMode, "auction")) {
            m160149W3(VoiceLiveMotionType.voice_auction);
        } else if (TEnum.equals(voiceLiveInfoMessage.liveMode, "normal")) {
            m160149W3(VoiceLiveMotionType.voice_call_normal);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m160146T3(String str) {
        if (VirtualVoiceMotionType.undercover.equals(str)) {
            duringCreated(klj0.m146414l(m206027E2().m149814k())).map(new w9j() { // from class: l.kmo0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("end".equals(((BLiveUndercoverGame) obj).status));
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.lmo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128813a.m160152Z3(((Boolean) obj).booleanValue());
                }
            }, new e30() { // from class: l.mmo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    nmo0.m160140M3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m160147U3() {
        VoicePlayStrategy voicePlayStrategy = this.f139651l;
        if (voicePlayStrategy == null || !(TextUtils.equals(voicePlayStrategy.getType(), BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY) || TextUtils.equals(this.f139651l.getType(), BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY) || TextUtils.equals(this.f139651l.getType(), BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY))) {
            m160151Y3(false, null, this.f139649j);
            BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
            if (TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.EIGHT_DEPUTY_STRATEGY)) {
                this.f139651l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY);
            } else if (TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY)) {
                this.f139651l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY);
            } else if (TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.TEN_DEPUTY_STRATEGY)) {
                this.f139651l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY);
            } else {
                this.f139651l = VoicePlayStrategy.getStrategy(BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY);
            }
            VoiceLiveMotionType voiceLiveMotionType = VoiceLiveMotionType.voice_call_normal;
            m206027E2().m160243K3(this.f139651l.getDeputyCount());
            m160151Y3(true, this.f139651l.getPlayStrategyView(), voiceLiveMotionType);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m160148V3() {
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        if ("auction".equals(bLiveVoiceMo149813j.liveMode)) {
            this.f139649j = VoiceLiveMotionType.voice_auction;
            this.f139651l = VoicePlayStrategy.getStrategy(BLiveVoice.AUCTION_STRATEGY);
        } else {
            this.f139651l = VoicePlayStrategy.getStrategy(bLiveVoiceMo149813j.onCallView);
            this.f139649j = VoiceLiveMotionType.voice_call_normal;
        }
        this.f139650k = bLiveVoiceMo149813j.liveMode;
        m206027E2().m160243K3(this.f139651l.getDeputyCount());
        m160151Y3(true, this.f139651l.getPlayStrategyView(), this.f139649j);
    }

    /* JADX INFO: renamed from: W3 */
    public void m160149W3(VoiceLiveMotionType voiceLiveMotionType) {
        m160151Y3(false, null, this.f139649j);
        this.f139649j = voiceLiveMotionType;
        if (voiceLiveMotionType == VoiceLiveMotionType.voice_auction) {
            this.f139651l = VoicePlayStrategy.getStrategy(BLiveVoice.AUCTION_STRATEGY);
        } else {
            this.f139651l = VoicePlayStrategy.getStrategy(m206027E2().mo149813j().onCallView);
            m206028F2().VoiceAuctionEvent.refreshVoiceBg().mo172463j("");
        }
        m206027E2().m160243K3(this.f139651l.getDeputyCount());
        m160151Y3(true, this.f139651l.getPlayStrategyView(), this.f139649j);
    }

    /* JADX INFO: renamed from: X3 */
    public void m160150X3() {
        VoicePlayStrategy voicePlayStrategy = this.f139651l;
        if (voicePlayStrategy == null || TextUtils.equals(voicePlayStrategy.getType(), BLiveVoice.THREE_DEPUTY_STRATEGY) || TextUtils.equals(this.f139651l.getType(), BLiveVoice.FIVE_DEPUTY_STRATEGY) || TextUtils.equals(this.f139651l.getType(), BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY) || TextUtils.equals(this.f139651l.getType(), BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY) || TextUtils.equals(this.f139651l.getType(), BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY)) {
            m160151Y3(false, null, this.f139649j);
            if (m206027E2().m149816m().m137796c()) {
                return;
            }
            m160148V3();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m160151Y3(boolean z, c8m c8mVar, VoiceLiveMotionType voiceLiveMotionType) {
        w1o0 w1o0Var = new w1o0(z, voiceLiveMotionType);
        if (!z) {
            m206028F2().VoiceMotionEvent.motionSwitch().mo172463j(w1o0Var);
        } else {
            if (this.f188512e.f77107m.m186022M3(voiceLiveMotionType)) {
                return;
            }
            w1o0Var.m200947b(new bzn0(this.f139648i, c8mVar)).m200946a(new f30() { // from class: l.fmo0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    nmo0.m160138K3((Integer) obj, (VoiceLiveMotionType) obj2);
                }
            });
            m206028F2().VoiceMotionEvent.motionSwitch().mo172463j(w1o0Var);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m160152Z3(boolean z) {
        if (z) {
            m160150X3();
        } else {
            m160147U3();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f139650k = "";
        m160151Y3(false, null, this.f139649j);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m160148V3();
        duringCreated(m206027E2().m132160q1().m189067Q0()).subscribe(ffw.m121197h(new e30() { // from class: l.gmo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103508a.m160145R3((VoiceLiveInfoMessage) obj);
            }
        }));
        duringCreated(m206027E2().m160247O2().m165466d()).map(new w9j() { // from class: l.hmo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveVoice) obj).template;
            }
        }).distinctUntilChanged().doOnNext(new e30() { // from class: l.imo0
            @Override // p149l.e30
            public final void call(Object obj) {
                nmo0.m160142O3((String) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.jmo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118696a.m160144S3((String) obj);
            }
        }));
    }
}
