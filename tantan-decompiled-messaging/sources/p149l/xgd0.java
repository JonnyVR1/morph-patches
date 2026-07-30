package p149l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import io.agora.rtc2.RtcEngine;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class xgd0 extends C12714b {

    /* JADX INFO: renamed from: h */
    public final chd0 f192756h;

    /* JADX INFO: renamed from: i */
    public final int[] f192757i;

    /* JADX INFO: renamed from: j */
    public int f192758j;

    /* JADX INFO: renamed from: k */
    public c4g0 f192759k;

    /* JADX INFO: renamed from: l */
    public MMLiveTranscoding f192760l;

    public xgd0(chd0 chd0Var) {
        super(chd0Var);
        this.f192757i = new int[]{540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        this.f192758j = 1200000;
        this.f192756h = chd0Var;
    }

    /* JADX INFO: renamed from: s1 */
    private MMLiveTranscoding m208631s1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f192758j;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM71893V0 = m71893V0(ypv.f199493a.m199309D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.userid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.mid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 0;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: t1 */
    private MMLiveMediaConfig m208632t1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f192758j = 1200000;
        cu00.m108718a(new d30() { // from class: l.ugd0
            @Override // p149l.d30
            public final void call() {
                this.f176377a.m208634v1();
            }
        }, new d30() { // from class: l.vgd0
            @Override // p149l.d30
            public final void call() {
                this.f181365a.m208635w1();
            }
        });
        int[] iArr = this.f192757i;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m81303a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f192758j = i2;
            int[] iArr2 = this.f192757i;
            iArr2[0] = bLiveEncode.width;
            iArr2[1] = bLiveEncode.heigth;
            i = bLiveVideoQualityConf.videoCodecType;
        } else {
            BLiveVideoQuality bLiveVideoQualityM185820a1 = this.f47798e.f152051c.m185820a1();
            if (bLiveVideoQualityM185820a1 == null || !bLiveVideoQualityM185820a1.isValid()) {
                i = 0;
            } else {
                mMLiveMediaConfig.videoFPS = bLiveVideoQualityM185820a1.pushFps;
                int i3 = bLiveVideoQualityM185820a1.pushBitrate;
                mMLiveMediaConfig.videoBitRate = i3;
                this.f192758j = i3;
                int[] iArr3 = this.f192757i;
                iArr3[0] = bLiveVideoQualityM185820a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM185820a1.pushHeight;
                i = bLiveVideoQualityM185820a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f192757i;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f192756h.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f192756h.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: u1 */
    public static C12714b m208633u1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_NORMAL) {
            return null;
        }
        return new xgd0((chd0) motionParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m208634v1() {
        int[] iArr = this.f192757i;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public /* synthetic */ void m208635w1() {
        int[] iArr = this.f192757i;
        iArr[0] = 480;
        iArr[1] = 640;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        this.f192756h.f80863m.call(1, this.f192756h.f47788d);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        super.mo71895X0();
        m71896Y0();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: a1 */
    public void mo71898a1() {
        super.mo71898a1();
        mkd0.m154992z(this.f192759k);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: e1 */
    public boolean mo71902e1() {
        return !vdt.m198092b(2) && this.f192756h.f47789e;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo71905i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        if (vdt.m198092b(2)) {
            RtcEngine.destroy();
        }
        this.f47798e.f152056h.m133285d(new mo40());
        chd0 chd0Var = this.f192756h;
        MMLiveMediaConfig mMLiveMediaConfigM208632t1 = m208632t1(chd0Var.f203960l, chd0Var.f203959k, chd0Var.f203958j);
        this.f192760l = m208631s1(this.f192757i);
        this.f47798e.f152052d.m133225i1(m71894W0());
        if (mo71902e1()) {
            this.f47798e.f152052d.m133222f1(this.f192760l);
            gkh0.m126627j("intl_rtc_up", "普通直播 ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            gkh0.m126627j("intl_rtc_up", "普通直播进入enterroom");
            this.f47798e.f152052d.m133211U0(mMLiveMediaConfigM208632t1, m71892U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f192760l);
        }
        if (vdt.m198092b(2)) {
            return 0;
        }
        m208637y1();
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m208636x1(Long l2) {
        this.f47798e.f152052d.m133222f1(this.f192760l);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m208637y1() {
        mkd0.m154992z(this.f192759k);
        this.f192759k = C22306c.interval(3L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.wgd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186181a.m208636x1((Long) obj);
            }
        }));
    }
}
