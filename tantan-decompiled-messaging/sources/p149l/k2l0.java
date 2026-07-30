package p149l;

import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveMixEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.momoengine.CoreEngineAction;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes13.dex */
public class k2l0 extends C12532b {

    /* JADX INFO: renamed from: f */
    public final a3l0 f120744f;

    /* JADX INFO: renamed from: g */
    public i3l0 f120745g;

    /* JADX INFO: renamed from: h */
    public MMLiveTranscoding f120746h;

    /* JADX INFO: renamed from: i */
    public MMLiveMediaConfig f120747i;

    /* JADX INFO: renamed from: j */
    public final e30<CoreEngineAction> f120748j;

    public k2l0(a3l0 a3l0Var) {
        super(a3l0Var);
        this.f120748j = new e30() { // from class: l.j2l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115935a.m144318m1((CoreEngineAction) obj);
            }
        };
        this.f120744f = a3l0Var;
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m144309d1(int[] iArr) {
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m144310e1(int[] iArr) {
        iArr[0] = 480;
        iArr[1] = 640;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        a3l0 a3l0Var = this.f120744f;
        a3l0Var.f67396m.onTokenPrivilegeWillExpire(a3l0Var.f45336d);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        this.f120744f.f67396m.mo122663U(str, i);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: I */
    public void mo110343I(long j, boolean z) {
        super.mo110343I(j, z);
        this.f120744f.f67396m.mo122660I(j, z);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: S */
    public void mo110350S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo110350S(mMLivePushType, i, i2);
        if (i2 == 1011 || i2 == 109) {
            return;
        }
        this.f120744f.f67396m.mo122661Q1(i2);
    }

    @Override // com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b
    /* JADX INFO: renamed from: U0 */
    public void mo69690U0() {
        super.mo69690U0();
        this.f45340d.f157169d.m138707U0();
    }

    @Override // com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b
    /* JADX INFO: renamed from: W0 */
    public void mo69692W0() {
        super.mo69692W0();
        this.f120745g.mo123613b();
        this.f45340d.f157173h.mo128519c();
        this.f45340d.f157167b.mo68554a();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        this.f120745g.m134264f();
        this.f120744f.f67396m.mo122665b(j, i);
    }

    @Override // com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b
    /* JADX INFO: renamed from: b1 */
    public int mo69697b1() {
        super.mo69697b1();
        this.f120745g = mo144316k1();
        this.f45340d.f157169d.m138711Y0(true);
        this.f45340d.f157169d.m138704N(true ^ this.f120744f.f67395l);
        this.f45340d.f157173h.mo128518b(this.f120744f.f67389f);
        this.f45340d.f157173h.m128527k(this.f120744f.f67388e);
        this.f45340d.f157173h.m128520d(this.f120745g);
        this.f45340d.f157169d.m138715c1(m69689T0());
        if (this.f120744f.f67395l) {
            this.f45340d.f157168c.m180765d1(this.f120748j);
            r0f r0fVar = this.f45340d;
            r0fVar.f157168c.mo99452F0(r0fVar.f157166a, this.f120744f.f67397n);
            this.f45340d.f157173h.mo128517a();
        } else {
            m144313h1();
        }
        gkh0.m126627j("videoChat", "start video chat motion");
        return 0;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        this.f120744f.f67396m.mo122662S1(str, j);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e */
    public void mo110357e(long j, boolean z) {
        super.mo110357e(j, z);
        this.f120745g.m134265g(Long.valueOf(j), !z);
        this.f120744f.f67396m.mo122668e(j, z);
    }

    /* JADX INFO: renamed from: f1 */
    public MMLiveRoomParams mo144311f1() {
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.role = MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster;
        m144319n1(this.f120744f, mMLiveRoomParams);
        mMLiveRoomParams.userId = ypv.f199493a.m199309D0();
        a3l0 a3l0Var = this.f120744f;
        mMLiveRoomParams.channel = a3l0Var.f67392i;
        mMLiveRoomParams.confId = a3l0Var.f67390g;
        mMLiveRoomParams.channelKey = a3l0Var.f67391h;
        mMLiveRoomParams.userSig = a3l0Var.f67394k;
        mMLiveRoomParams.isHost = false;
        return mMLiveRoomParams;
    }

    /* JADX INFO: renamed from: g1 */
    public MMLiveMediaConfig mo144312g1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        if (!m144317l1(bLiveVideoQualityConf)) {
            return m144314i1();
        }
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
        mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
        mMLiveMediaConfig.encodeWidth = bLiveEncode.width;
        mMLiveMediaConfig.encodeHeight = bLiveEncode.height;
        mMLiveMediaConfig.videoBitRate = bLiveEncode.bitRate;
        mMLiveMediaConfig.videoCodecType = bLiveVideoQualityConf.videoCodecType;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f120744f.f45335c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f120744f.f45334b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: h1 */
    public void m144313h1() {
        this.f45340d.f157168c.m180772k1(this.f120748j);
        this.f120746h = mo144315j1(this.f120744f.f67397n.mixEncode);
        MMLiveMediaConfig mMLiveMediaConfigMo144312g1 = mo144312g1(this.f120744f.f67397n);
        this.f120747i = mMLiveMediaConfigMo144312g1;
        this.f45340d.f157169d.m138705S0(mMLiveMediaConfigMo144312g1, mo144311f1(), this.f120746h);
        m144320o1(Boolean.valueOf(!this.f120744f.f67395l));
    }

    /* JADX INFO: renamed from: i1 */
    public final MMLiveMediaConfig m144314i1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        final int[] iArr = {540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        du00.m113660a(new d30() { // from class: l.h2l0
            @Override // p149l.d30
            public final void call() {
                k2l0.m144309d1(iArr);
            }
        }, new d30() { // from class: l.i2l0
            @Override // p149l.d30
            public final void call() {
                k2l0.m144310e1(iArr);
            }
        });
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f120744f.f45335c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f120744f.f45334b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: j1 */
    public MMLiveTranscoding mo144315j1(BLiveMixEncode bLiveMixEncode) {
        return new MMLiveTranscoding();
    }

    /* JADX INFO: renamed from: k1 */
    public i3l0 mo144316k1() {
        return new i3l0(false);
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m144317l1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        return NullChecker.m81303a(bLiveVideoQualityConf) && bLiveVideoQualityConf.capture.isValid() && bLiveVideoQualityConf.encode.isValid();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m144318m1(CoreEngineAction coreEngineAction) {
        if (coreEngineAction == CoreEngineAction.ACTION_AFTER_PREVIEW) {
            m144313h1();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m144319n1(MotionParams motionParams, MMLiveRoomParams mMLiveRoomParams) {
        if (motionParams.f45336d.contains("momo")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
        } else if (motionParams.f45336d.contains("volcengine")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
        } else {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
        this.f120744f.f67396m.mo122659H(j, i);
    }

    /* JADX INFO: renamed from: o1 */
    public void m144320o1(Boolean bool) {
        gkh0.m126627j("videoChat", "sdk setVideoMute:" + bool);
        if (this.f120744f.f67395l) {
            return;
        }
        this.f45340d.f157169d.m138704N(bool.booleanValue());
        boolean zBooleanValue = bool.booleanValue();
        r0f r0fVar = this.f45340d;
        if (zBooleanValue) {
            r0fVar.f157168c.mo99453a();
            this.f45340d.f157173h.mo128519c();
        } else {
            r0fVar.f157173h.mo128518b(this.f120744f.f67389f);
            r0f r0fVar2 = this.f45340d;
            r0fVar2.f157168c.mo99452F0(r0fVar2.f157166a, this.f120744f.f67397n);
            this.f45340d.f157173h.mo128517a();
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: x0 */
    public void mo110365x0(long j, int i, int i2) {
        super.mo110365x0(j, i, i2);
        gkh0.m126627j("videoChat", "onReceivedFirstVideoFrame");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        this.f120745g.m134263e(j, surfaceView);
        this.f120744f.f67396m.mo122664a1(j);
    }
}
