package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public class v6n0 extends h4t<nnn0, VoiceFlyMicContainer> {

    /* JADX INFO: renamed from: i */
    public boolean f180219i;

    public v6n0(bsm<? extends nnn0> bsmVar, VoiceFlyMicContainer voiceFlyMicContainer) {
        super(bsmVar);
        mo51532C(voiceFlyMicContainer);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m197209J3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m197215T3(w1o0 w1o0Var) {
        b8m b8mVar = w1o0Var.f184032c;
        if (b8mVar == null || !(b8mVar instanceof bzn0)) {
            return;
        }
        c8m c8mVar = ((bzn0) b8mVar).f78048b;
        if ((c8mVar instanceof mcn0) || (c8mVar instanceof ocn0) || (c8mVar instanceof qcn0)) {
            this.f180219i = true;
            m6n0.m153251f();
        } else if ((c8mVar instanceof d4n0) || (c8mVar instanceof q4o0) || (c8mVar instanceof guo0) || (c8mVar instanceof iuo0) || (c8mVar instanceof h6n0)) {
            this.f180219i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m197216W3(iqv iqvVar) {
        if (iqvVar.m137796c() || iqvVar.m137795b()) {
            m6n0.m153251f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final boolean m197217P3() {
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        return TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.EIGHT_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.TEN_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.THREE_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.FIVE_DEPUTY_STRATEGY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final Pair<int[], Integer> m197218R3(String str) {
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(str);
        return bLiveVoiceCallM102063l == null ? new Pair<>(new int[2], 0) : (Pair) m129297F3(new j6n0(9000, bLiveVoiceCallM102063l.position, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final BLiveIntlFlyMicEffectConfig m197219S3(final int i) {
        BLiveGiftItem bLiveGiftItemM132171w0 = ((nnn0) m206027E2()).m132171w0(i);
        if (bLiveGiftItemM132171w0 != null && TextUtils.equals(bLiveGiftItemM132171w0.flyMicInfo.resourceType, LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC) && !TextUtils.isEmpty(bLiveGiftItemM132171w0.flyMicInfo.resourceId)) {
            BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = bLiveGiftItemM132171w0.flyMicInfo;
            bLiveIntlFlyMicEffectConfig.f44390id = i;
            return bLiveIntlFlyMicEffectConfig.mo223809clone();
        }
        if (bLiveGiftItemM132171w0 != null && !TextUtils.isEmpty(bLiveGiftItemM132171w0.flyMicInfo.endEffectIcon) && !TextUtils.isEmpty(bLiveGiftItemM132171w0.flyMicInfo.startEffectIcon)) {
            BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig2 = bLiveGiftItemM132171w0.flyMicInfo;
            bLiveIntlFlyMicEffectConfig2.f44390id = i;
            return bLiveIntlFlyMicEffectConfig2.mo223809clone();
        }
        List<BLiveIntlFlyMicEffectConfig> listM195911p4 = ypv.m215672k().m195911p4();
        if (listM195911p4 == null) {
            return null;
        }
        return (BLiveIntlFlyMicEffectConfig) vwb.m200346r(listM195911p4, new w9j() { // from class: l.u6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveIntlFlyMicEffectConfig) obj).f44390id == i);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VoiceMotionEvent.motionSwitch().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.s6n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162838a.m197215T3((w1o0) obj);
            }
        }, new e30() { // from class: l.t6n0
            @Override // p149l.e30
            public final void call(Object obj) {
                v6n0.m197209J3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Boolean m197220U3(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        return Boolean.valueOf(!this.f180219i && m197217P3());
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m197221V3(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfigM197219S3 = m197219S3(bLiveIntlFlyMicEffectConfig.f44390id);
        if (bLiveIntlFlyMicEffectConfigM197219S3 == null) {
            return;
        }
        int[] first = m197218R3(bLiveIntlFlyMicEffectConfig.receiveUserId).getFirst();
        int iIntValue = m197218R3(bLiveIntlFlyMicEffectConfig.receiveUserId).getSecond().intValue();
        if (first[0] == 0 || first[1] == 0) {
            return;
        }
        bLiveIntlFlyMicEffectConfig.endPosition = first;
        bLiveIntlFlyMicEffectConfig.resourceId = bLiveIntlFlyMicEffectConfigM197219S3.resourceId;
        String str = bLiveIntlFlyMicEffectConfigM197219S3.resourceType;
        bLiveIntlFlyMicEffectConfig.resourceType = str;
        bLiveIntlFlyMicEffectConfig.startEffectIcon = bLiveIntlFlyMicEffectConfigM197219S3.startEffectIcon;
        bLiveIntlFlyMicEffectConfig.endEffectIcon = bLiveIntlFlyMicEffectConfigM197219S3.endEffectIcon;
        if (TextUtils.equals(str, LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC)) {
            ((VoiceFlyMicContainer) this.viewModel).m78147c(bLiveIntlFlyMicEffectConfig);
            return;
        }
        o6n0 o6n0VarM153249d = m6n0.m153249d();
        if (o6n0VarM153249d == null) {
            return;
        }
        ((VoiceFlyMicContainer) this.viewModel).m78148d(bLiveIntlFlyMicEffectConfig, o6n0VarM153249d, iIntValue);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m6n0.m153248c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.p6n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147423a.m197216W3((iqv) obj);
            }
        }));
        duringCreated(m206028F2().VoiceFlyEvent.playFlyMicAnim().m172460g()).filter(new w9j() { // from class: l.q6n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f152927a.m197220U3((BLiveIntlFlyMicEffectConfig) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.r6n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157968a.m197221V3((BLiveIntlFlyMicEffectConfig) obj);
            }
        }));
    }
}
