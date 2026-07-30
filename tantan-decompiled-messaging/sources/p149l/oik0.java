package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallSnapShot;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;

/* JADX INFO: loaded from: classes5.dex */
public class oik0 extends tkk0 {
    public oik0(bsm bsmVar) {
        super(bsmVar);
        this.f170894k = (nsm0) m144512z2(new qlm0(bsmVar));
        m144512z2(new mpm0(bsmVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    private void m164534w4() {
        gkh0.m126627j("[voice][call]", "receive server code to end live");
        if (((nnn0) m206027E2()).m149816m().m137796c()) {
            return;
        }
        ((nnn0) m206027E2()).mo149812h(new u7s(null, true));
    }

    /* JADX INFO: renamed from: A4 */
    public final void m164535A4() {
        act().dialog().m20500D(R$string.f46676F9).m20556t0(R$string.f47148bc, new Runnable() { // from class: l.mik0
            @Override // java.lang.Runnable
            public final void run() {
                this.f133999a.m164537u4();
            }
        }).m20568z0();
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: T3 */
    public void mo136823T3(BLiveVoiceCall bLiveVoiceCall) {
        if (alk0.m97313l(bLiveVoiceCall)) {
            m189511a4(bLiveVoiceCall);
        } else if (alk0.m97307f(bLiveVoiceCall)) {
            mo136828k4();
        }
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: U3 */
    public void mo164536U3(Throwable th) {
        if (s25.m182056a(th, 41002)) {
            m164534w4();
        } else if (s25.m182056a(th, 42200)) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            m164535A4();
        }
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: V3 */
    public void mo136824V3() {
        mo164536U3(null);
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: c4 */
    public void mo136826c4(BLiveVoiceCall bLiveVoiceCall) {
        mo164536U3(new Throwable());
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: j4 */
    public void mo136827j4(final BLiveRtcToken bLiveRtcToken) {
        h5j0.INSTANCE.m129404c("voice_anchor_call", "joinVoice");
        C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(9000))).mo133471a();
        if (c12714bMo133471a == null || !c12714bMo133471a.m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            vet.m198233q(this.f188513f, hgt.INSTANCE.m130912S(), R$string.f47265gj, new d30() { // from class: l.nik0
                @Override // p149l.d30
                public final void call() {
                    this.f139107a.m164541z4(bLiveRtcToken);
                }
            });
        }
    }

    @Override // p149l.tkk0
    /* JADX INFO: renamed from: k4 */
    public boolean mo136828k4() {
        gkh0.m126627j("[voice][call]", "stopMotionPush");
        oxl oxlVar = (oxl) m129297F3(new rv00(9000));
        if (oxlVar == null || !oxlVar.mo133471a().m71900c1(MotionParams.PusherMotionEnum.MOTION_VOICE_ANCHOR)) {
            return false;
        }
        oxlVar.mo133472b();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tkk0, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        if (((nnn0) m206027E2()).m160273k3()) {
            return;
        }
        mo136828k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.tkk0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (m164539x4() == null || "anchor-away".equals(((nnn0) m206027E2()).mo149813j().bossState)) {
            m164537u4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public final void m164537u4() {
        h5j0.INSTANCE.m129405d("voice_anchor_call");
        duringCreated(VCallApiProvider.applyCallInvite(BLiveVoiceCall.newInstance(((nnn0) m206027E2()).m149814k(), "", "apply", 0, Owner.TYPE))).subscribe(ffw.m121194e(new e30() { // from class: l.kik0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123353a.m164538v4((BLiveVoiceCall) obj);
            }
        }, new e30() { // from class: l.lik0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128229a.mo164536U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m164538v4(BLiveVoiceCall bLiveVoiceCall) {
        h5j0.INSTANCE.m129404c("voice_anchor_call", "applySuccess");
        u4n0.m191758q(this, bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final BLiveVoiceCallSnapShot m164539x4() {
        return (BLiveVoiceCallSnapShot) vwb.m200346r(((nnn0) m206027E2()).m160247O2().mo165470l().callInfo.onVoiceCalls, new w9j() { // from class: l.jik0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f118112a.m164540y4((BLiveVoiceCallSnapShot) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m164540y4(BLiveVoiceCallSnapShot bLiveVoiceCallSnapShot) {
        return Boolean.valueOf(TextUtils.equals(bLiveVoiceCallSnapShot.user, ((nnn0) m206027E2()).m132146l0().f56011id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m164541z4(BLiveRtcToken bLiveRtcToken) {
        ((oxl) m129297F3(new rv00(10100))).mo133474d(new hcm0(((nnn0) m206027E2()).mo149813j().streamUrl.push, ((nnn0) m206027E2()).m149818o(), String.valueOf(((nnn0) m206027E2()).mo149813j().streamCdnInfo.provider), String.valueOf(((nnn0) m206027E2()).mo149813j().streamCdnInfo.businessType), bLiveRtcToken.rtcProvider, bLiveRtcToken.appId, bLiveRtcToken.channelKey, bLiveRtcToken.channel, bLiveRtcToken.userSig, bLiveRtcToken.reverbAppKey, bLiveRtcToken.reverbToken, m189507R3()));
    }
}
