package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallSnapShot;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class urk0 extends ztk0 {
    public urk0(dum dumVar) {
        super(dumVar);
        this.f206018k = (r1n0) m153103z2(new uum0(dumVar));
        m153103z2(new qym0(dumVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    private void m197621w4() {
        nsh0.m164608j("[voice][call]", "receive server code to end live");
        if (((rwn0) m213810E2()).m202193m().m146877c()) {
            return;
        }
        ((rwn0) m213810E2()).mo160116h(new v9s(null, true));
    }

    /* JADX INFO: renamed from: A4 */
    public final void m197622A4() {
        act().dialog().m21499D(R$string.f47524F9).m21555t0(R$string.f47996bc, new Runnable() { // from class: l.srk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f170357a.m197624u4();
            }
        }).m21567z0();
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: T3 */
    public void mo169116T3(BLiveVoiceCall bLiveVoiceCall) {
        if (guk0.m132333l(bLiveVoiceCall)) {
            m221552a4(bLiveVoiceCall);
        } else if (guk0.m132327f(bLiveVoiceCall)) {
            mo169121k4();
        }
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: U3 */
    public void mo197623U3(Throwable th) {
        if (r35.m179576a(th, 41002)) {
            m197621w4();
        } else if (r35.m179576a(th, 42200)) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            m197622A4();
        }
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: V3 */
    public void mo169117V3() {
        mo197623U3(null);
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: c4 */
    public void mo169119c4(BLiveVoiceCall bLiveVoiceCall) {
        mo197623U3(new Throwable());
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: j4 */
    public void mo169120j4(final BLiveRtcToken bLiveRtcToken) {
        lej0.INSTANCE.m153909c("voice_anchor_call", "joinVoice");
        C12877b c12877bMo133182a = ((h0m) m138856F3(new z310(9000))).mo133182a();
        if (c12877bMo133182a == null || !c12877bMo133182a.m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            wgt.m206250q(this.f196919f, iit.INSTANCE.m140133S(), R$string.f48113gj, new x20() { // from class: l.trk0
                @Override // p153l.x20
                public final void call() {
                    this.f175886a.m197628z4(bLiveRtcToken);
                }
            });
        }
    }

    @Override // p153l.ztk0
    /* JADX INFO: renamed from: k4 */
    public boolean mo169121k4() {
        nsh0.m164608j("[voice][call]", "stopMotionPush");
        h0m h0mVar = (h0m) m138856F3(new z310(9000));
        if (h0mVar == null || !h0mVar.mo133182a().m73083c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            return false;
        }
        h0mVar.mo133183b();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ztk0, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        if (((rwn0) m213810E2()).m183437k3()) {
            return;
        }
        mo169121k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ztk0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (m197626x4() == null || "anchor-away".equals(((rwn0) m213810E2()).mo183435j().bossState)) {
            m197624u4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public final void m197624u4() {
        lej0.INSTANCE.m153910d("voice_anchor_call");
        duringCreated(VCallApiProvider.applyCallInvite(BLiveVoiceCall.newInstance(((rwn0) m213810E2()).m202191k(), "", "apply", 0, Owner.TYPE))).subscribe(dhw.m115826e(new y20() { // from class: l.qrk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159138a.m197625v4((BLiveVoiceCall) obj);
            }
        }, new y20() { // from class: l.rrk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164586a.mo197623U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m197625v4(BLiveVoiceCall bLiveVoiceCall) {
        lej0.INSTANCE.m153909c("voice_anchor_call", "applySuccess");
        ydn0.m215264q(this, bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final BLiveVoiceCallSnapShot m197626x4() {
        return (BLiveVoiceCallSnapShot) jyb.m147529r(((rwn0) m213810E2()).m183409O2().mo122892l().callInfo.onVoiceCalls, new qcj() { // from class: l.prk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153805a.m197627y4((BLiveVoiceCallSnapShot) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m197627y4(BLiveVoiceCallSnapShot bLiveVoiceCallSnapShot) {
        return Boolean.valueOf(TextUtils.equals(bLiveVoiceCallSnapShot.user, ((rwn0) m213810E2()).m168532l0().f56859id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m197628z4(BLiveRtcToken bLiveRtcToken) {
        ((h0m) m138856F3(new z310(10100))).mo133185d(new llm0(((rwn0) m213810E2()).mo183435j().streamUrl.push, ((rwn0) m213810E2()).m202194o(), String.valueOf(((rwn0) m213810E2()).mo183435j().streamCdnInfo.provider), String.valueOf(((rwn0) m213810E2()).mo183435j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, m221548R3()));
    }
}
