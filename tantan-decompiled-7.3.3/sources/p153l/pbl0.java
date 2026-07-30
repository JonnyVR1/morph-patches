package p153l;

import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveMixEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.momoengine.CoreEngineAction;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;

/* JADX INFO: loaded from: classes9.dex */
public class pbl0 extends C12695b {

    /* JADX INFO: renamed from: f */
    public final fcl0 f151398f;

    /* JADX INFO: renamed from: g */
    public ncl0 f151399g;

    /* JADX INFO: renamed from: h */
    public MMLiveTranscoding f151400h;

    /* JADX INFO: renamed from: i */
    public MMLiveMediaConfig f151401i;

    /* JADX INFO: renamed from: j */
    public final y20<CoreEngineAction> f151402j;

    public pbl0(fcl0 fcl0Var) {
        super(fcl0Var);
        this.f151402j = new y20() { // from class: l.obl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146599a.m171522m1((CoreEngineAction) obj);
            }
        };
        this.f151398f = fcl0Var;
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m171513d1(int[] iArr) {
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m171514e1(int[] iArr) {
        iArr[0] = 480;
        iArr[1] = 640;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        fcl0 fcl0Var = this.f151398f;
        fcl0Var.f98233m.onTokenPrivilegeWillExpire(fcl0Var.f46184d);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        this.f151398f.f98233m.mo96649U(str, i);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: I */
    public void mo120101I(long j, boolean z) {
        super.mo120101I(j, z);
        this.f151398f.f98233m.mo96646I(j, z);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: S */
    public void mo96683S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo96683S(mMLivePushType, i, i2);
        if (i2 == 1011 || i2 == 109) {
            return;
        }
        this.f151398f.f98233m.mo96647Q1(i2);
    }

    @Override // com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b
    /* JADX INFO: renamed from: U0 */
    public void mo70873U0() {
        super.mo70873U0();
        this.f46188d.f181964d.m175181U0();
    }

    @Override // com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b
    /* JADX INFO: renamed from: W0 */
    public void mo70875W0() {
        super.mo70875W0();
        this.f151399g.mo162562b();
        this.f46188d.f181968h.mo118892c();
        this.f46188d.f181962b.mo69737a();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        this.f151399g.m162564f();
        this.f151398f.f98233m.mo96651b(j, i);
    }

    @Override // com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b
    /* JADX INFO: renamed from: b1 */
    public int mo70880b1() {
        super.mo70880b1();
        this.f151399g = mo171520k1();
        this.f46188d.f181964d.m175185Y0(true);
        this.f46188d.f181964d.m175178N(true ^ this.f151398f.f98232l);
        this.f46188d.f181968h.mo118891b(this.f151398f.f98226f);
        this.f46188d.f181968h.m175287k(this.f151398f.f98225e);
        this.f46188d.f181968h.m175280d(this.f151399g);
        this.f46188d.f181964d.m175189c1(m70872T0());
        if (this.f151398f.f98232l) {
            this.f46188d.f181963c.m95605d1(this.f151402j);
            v1f v1fVar = this.f46188d;
            v1fVar.f181963c.mo95595F0(v1fVar.f181961a, this.f151398f.f98234n);
            this.f46188d.f181968h.mo118890a();
        } else {
            m171517h1();
        }
        nsh0.m164608j("videoChat", "start video chat motion");
        return 0;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        this.f151398f.f98233m.mo96648S1(str, j);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e */
    public void mo120111e(long j, boolean z) {
        super.mo120111e(j, z);
        this.f151399g.m162565g(Long.valueOf(j), !z);
        this.f151398f.f98233m.mo96652e(j, z);
    }

    /* JADX INFO: renamed from: f1 */
    public MMLiveRoomParams mo171515f1() {
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.role = MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster;
        m171523n1(this.f151398f, mMLiveRoomParams);
        mMLiveRoomParams.userId = zrv.f205799a.m207631D0();
        fcl0 fcl0Var = this.f151398f;
        mMLiveRoomParams.channel = fcl0Var.f98229i;
        mMLiveRoomParams.confId = fcl0Var.f98227g;
        mMLiveRoomParams.channelKey = fcl0Var.f98228h;
        mMLiveRoomParams.userSig = fcl0Var.f98231k;
        mMLiveRoomParams.isHost = false;
        return mMLiveRoomParams;
    }

    /* JADX INFO: renamed from: g1 */
    public MMLiveMediaConfig mo171516g1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        if (!m171521l1(bLiveVideoQualityConf)) {
            return m171518i1();
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
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f151398f.f46183c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f151398f.f46182b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: h1 */
    public void m171517h1() {
        this.f46188d.f181963c.m95612k1(this.f151402j);
        this.f151400h = mo171519j1(this.f151398f.f98234n.mixEncode);
        MMLiveMediaConfig mMLiveMediaConfigMo171516g1 = mo171516g1(this.f151398f.f98234n);
        this.f151401i = mMLiveMediaConfigMo171516g1;
        this.f46188d.f181964d.m175179S0(mMLiveMediaConfigMo171516g1, mo171515f1(), this.f151400h);
        m171524o1(Boolean.valueOf(!this.f151398f.f98232l));
    }

    /* JADX INFO: renamed from: i1 */
    public final MMLiveMediaConfig m171518i1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        final int[] iArr = {540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        m210.m156737a(new x20() { // from class: l.mbl0
            @Override // p153l.x20
            public final void call() {
                pbl0.m171513d1(iArr);
            }
        }, new x20() { // from class: l.nbl0
            @Override // p153l.x20
            public final void call() {
                pbl0.m171514e1(iArr);
            }
        });
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f151398f.f46183c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f151398f.f46182b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: j1 */
    public MMLiveTranscoding mo171519j1(BLiveMixEncode bLiveMixEncode) {
        return new MMLiveTranscoding();
    }

    /* JADX INFO: renamed from: k1 */
    public ncl0 mo171520k1() {
        return new ncl0(false);
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m171521l1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        return NullChecker.m82486a(bLiveVideoQualityConf) && bLiveVideoQualityConf.capture.isValid() && bLiveVideoQualityConf.encode.isValid();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m171522m1(CoreEngineAction coreEngineAction) {
        if (coreEngineAction == CoreEngineAction.ACTION_AFTER_PREVIEW) {
            m171517h1();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m171523n1(MotionParams motionParams, MMLiveRoomParams mMLiveRoomParams) {
        if (motionParams.f46184d.contains("momo")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
        } else if (motionParams.f46184d.contains("volcengine")) {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
        } else {
            mMLiveRoomParams.linkType = MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
        this.f151398f.f98233m.mo96645H(j, i);
    }

    /* JADX INFO: renamed from: o1 */
    public void m171524o1(Boolean bool) {
        nsh0.m164608j("videoChat", "sdk setVideoMute:" + bool);
        if (this.f151398f.f98232l) {
            return;
        }
        this.f46188d.f181964d.m175178N(bool.booleanValue());
        boolean zBooleanValue = bool.booleanValue();
        v1f v1fVar = this.f46188d;
        if (zBooleanValue) {
            v1fVar.f181963c.mo95601a();
            this.f46188d.f181968h.mo118892c();
        } else {
            v1fVar.f181968h.mo118891b(this.f151398f.f98226f);
            v1f v1fVar2 = this.f46188d;
            v1fVar2.f181963c.mo95595F0(v1fVar2.f181961a, this.f151398f.f98234n);
            this.f46188d.f181968h.mo118890a();
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: x0 */
    public void mo105807x0(long j, int i, int i2) {
        super.mo105807x0(j, i, i2);
        nsh0.m164608j("videoChat", "onReceivedFirstVideoFrame");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        this.f151399g.m162563e(j, surfaceView);
        this.f151398f.f98233m.mo96650a1(j);
    }
}
