package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public class zfn0 extends i6t<rwn0, VoiceFlyMicContainer> {

    /* JADX INFO: renamed from: i */
    public boolean f204175i;

    public zfn0(dum<? extends rwn0> dumVar, VoiceFlyMicContainer voiceFlyMicContainer) {
        super(dumVar);
        mo52715C(voiceFlyMicContainer);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m219554J3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public void m219560T3(abo0 abo0Var) {
        ram ramVar = abo0Var.f69640c;
        if (ramVar == null || !(ramVar instanceof f8o0)) {
            return;
        }
        sam samVar = ((f8o0) ramVar).f97752b;
        if ((samVar instanceof qln0) || (samVar instanceof sln0) || (samVar instanceof uln0)) {
            this.f204175i = true;
            qfn0.m176377f();
        } else if ((samVar instanceof hdn0) || (samVar instanceof udo0) || (samVar instanceof k3p0) || (samVar instanceof m3p0) || (samVar instanceof lfn0)) {
            this.f204175i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public void m219561W3(jsv jsvVar) {
        if (jsvVar.m146877c() || jsvVar.m146876b()) {
            qfn0.m176377f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final boolean m219562P3() {
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        return TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.EIGHT_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.TEN_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.THREE_DEPUTY_STRATEGY) || TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.FIVE_DEPUTY_STRATEGY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final Pair<int[], Integer> m219563R3(String str) {
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(str);
        return bLiveVoiceCallM136873l == null ? new Pair<>(new int[2], 0) : (Pair) m138856F3(new nfn0(9000, bLiveVoiceCallM136873l.position, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final BLiveIntlFlyMicEffectConfig m219564S3(final int i) {
        BLiveGiftItem bLiveGiftItemM168555w0 = ((rwn0) m213810E2()).m168555w0(i);
        if (bLiveGiftItemM168555w0 != null && TextUtils.equals(bLiveGiftItemM168555w0.flyMicInfo.resourceType, LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC) && !TextUtils.isEmpty(bLiveGiftItemM168555w0.flyMicInfo.resourceId)) {
            BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig = bLiveGiftItemM168555w0.flyMicInfo;
            bLiveIntlFlyMicEffectConfig.f45238id = i;
            return bLiveIntlFlyMicEffectConfig.mo225055clone();
        }
        if (bLiveGiftItemM168555w0 != null && !TextUtils.isEmpty(bLiveGiftItemM168555w0.flyMicInfo.endEffectIcon) && !TextUtils.isEmpty(bLiveGiftItemM168555w0.flyMicInfo.startEffectIcon)) {
            BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig2 = bLiveGiftItemM168555w0.flyMicInfo;
            bLiveIntlFlyMicEffectConfig2.f45238id = i;
            return bLiveIntlFlyMicEffectConfig2.mo225055clone();
        }
        List<BLiveIntlFlyMicEffectConfig> listM203698p4 = zrv.m221193k().m203698p4();
        if (listM203698p4 == null) {
            return null;
        }
        return (BLiveIntlFlyMicEffectConfig) jyb.m147529r(listM203698p4, new qcj() { // from class: l.yfn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveIntlFlyMicEffectConfig) obj).f45238id == i);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VoiceMotionEvent.motionSwitch().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.wfn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188864a.m219560T3((abo0) obj);
            }
        }, new y20() { // from class: l.xfn0
            @Override // p153l.y20
            public final void call(Object obj) {
                zfn0.m219554J3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Boolean m219565U3(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        return Boolean.valueOf(!this.f204175i && m219562P3());
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m219566V3(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfigM219564S3 = m219564S3(bLiveIntlFlyMicEffectConfig.f45238id);
        if (bLiveIntlFlyMicEffectConfigM219564S3 == null) {
            return;
        }
        int[] first = m219563R3(bLiveIntlFlyMicEffectConfig.receiveUserId).getFirst();
        int iIntValue = m219563R3(bLiveIntlFlyMicEffectConfig.receiveUserId).getSecond().intValue();
        if (first[0] == 0 || first[1] == 0) {
            return;
        }
        bLiveIntlFlyMicEffectConfig.endPosition = first;
        bLiveIntlFlyMicEffectConfig.resourceId = bLiveIntlFlyMicEffectConfigM219564S3.resourceId;
        String str = bLiveIntlFlyMicEffectConfigM219564S3.resourceType;
        bLiveIntlFlyMicEffectConfig.resourceType = str;
        bLiveIntlFlyMicEffectConfig.startEffectIcon = bLiveIntlFlyMicEffectConfigM219564S3.startEffectIcon;
        bLiveIntlFlyMicEffectConfig.endEffectIcon = bLiveIntlFlyMicEffectConfigM219564S3.endEffectIcon;
        if (TextUtils.equals(str, LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_DYNAMIC)) {
            ((VoiceFlyMicContainer) this.viewModel).m79330c(bLiveIntlFlyMicEffectConfig);
            return;
        }
        sfn0 sfn0VarM176375d = qfn0.m176375d();
        if (sfn0VarM176375d == null) {
            return;
        }
        ((VoiceFlyMicContainer) this.viewModel).m79331d(bLiveIntlFlyMicEffectConfig, sfn0VarM176375d, iIntValue);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        qfn0.m176374c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.tfn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173982a.m219561W3((jsv) obj);
            }
        }));
        duringCreated(m213811F2().VoiceFlyEvent.playFlyMicAnim().m199270g()).filter(new qcj() { // from class: l.ufn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178793a.m219565U3((BLiveIntlFlyMicEffectConfig) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.vfn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183960a.m219566V3((BLiveIntlFlyMicEffectConfig) obj);
            }
        }));
    }
}
