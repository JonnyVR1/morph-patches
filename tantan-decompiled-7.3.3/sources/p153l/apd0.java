package p153l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import io.agora.rtc2.RtcEngine;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class apd0 extends C12877b {

    /* JADX INFO: renamed from: h */
    public final fpd0 f72718h;

    /* JADX INFO: renamed from: i */
    public final int[] f72719i;

    /* JADX INFO: renamed from: j */
    public int f72720j;

    /* JADX INFO: renamed from: k */
    public kcg0 f72721k;

    /* JADX INFO: renamed from: l */
    public MMLiveTranscoding f72722l;

    public apd0(fpd0 fpd0Var) {
        super(fpd0Var);
        this.f72719i = new int[]{540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        this.f72720j = 1200000;
        this.f72718h = fpd0Var;
    }

    /* JADX INFO: renamed from: s1 */
    private MMLiveTranscoding m99305s1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f72720j;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM73076V0 = m73076V0(zrv.f205799a.m207631D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.userid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.mid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 0;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: t1 */
    private MMLiveMediaConfig m99306t1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f72720j = 1200000;
        l210.m152547a(new x20() { // from class: l.xod0
            @Override // p153l.x20
            public final void call() {
                this.f195569a.m99308v1();
            }
        }, new x20() { // from class: l.yod0
            @Override // p153l.x20
            public final void call() {
                this.f200968a.m99309w1();
            }
        });
        int[] iArr = this.f72719i;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m82486a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f72720j = i2;
            int[] iArr2 = this.f72719i;
            iArr2[0] = bLiveEncode.width;
            iArr2[1] = bLiveEncode.heigth;
            i = bLiveVideoQualityConf.videoCodecType;
        } else {
            BLiveVideoQuality bLiveVideoQualityM101583a1 = this.f48646e.f176994c.m101583a1();
            if (bLiveVideoQualityM101583a1 == null || !bLiveVideoQualityM101583a1.isValid()) {
                i = 0;
            } else {
                mMLiveMediaConfig.videoFPS = bLiveVideoQualityM101583a1.pushFps;
                int i3 = bLiveVideoQualityM101583a1.pushBitrate;
                mMLiveMediaConfig.videoBitRate = i3;
                this.f72720j = i3;
                int[] iArr3 = this.f72719i;
                iArr3[0] = bLiveVideoQualityM101583a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM101583a1.pushHeight;
                i = bLiveVideoQualityM101583a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f72719i;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f72718h.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f72718h.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: u1 */
    public static C12877b m99307u1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_NORMAL) {
            return null;
        }
        return new apd0((fpd0) motionParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m99308v1() {
        int[] iArr = this.f72719i;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public /* synthetic */ void m99309w1() {
        int[] iArr = this.f72719i;
        iArr[0] = 480;
        iArr[1] = 640;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        this.f72718h.f100125m.call(1, this.f72718h.f48636d);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
        m73079Y0();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: a1 */
    public void mo73081a1() {
        super.mo73081a1();
        psd0.m173633z(this.f72721k);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: e1 */
    public boolean mo73085e1() {
        return !wft.m206159b(2) && this.f72718h.f48637e;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo73088i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        if (wft.m206159b(2)) {
            RtcEngine.destroy();
        }
        this.f48646e.f176999h.m179837d(new ax40());
        fpd0 fpd0Var = this.f72718h;
        MMLiveMediaConfig mMLiveMediaConfigM99306t1 = m99306t1(fpd0Var.f143915l, fpd0Var.f143914k, fpd0Var.f143913j);
        this.f72722l = m99305s1(this.f72719i);
        this.f48646e.f176995d.m170531i1(m73077W0());
        if (mo73085e1()) {
            this.f48646e.f176995d.m170527f1(this.f72722l);
            nsh0.m164608j("intl_rtc_up", "普通直播 ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            nsh0.m164608j("intl_rtc_up", "普通直播进入enterroom");
            this.f48646e.f176995d.m170514U0(mMLiveMediaConfigM99306t1, m73075U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f72722l);
        }
        if (wft.m206159b(2)) {
            return 0;
        }
        m99311y1();
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m99310x1(Long l2) {
        this.f48646e.f176995d.m170527f1(this.f72722l);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m99311y1() {
        psd0.m173633z(this.f72721k);
        this.f72721k = C22421c.interval(3L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.zod0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205320a.m99310x1((Long) obj);
            }
        }));
    }
}
