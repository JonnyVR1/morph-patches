package p002l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveEncode;
import com.p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.RtcEngine;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.gkh0;
import l.jo0;
import l.mkd0;
import l.vdt;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xgd0 extends C0303b {

    /* JADX INFO: renamed from: h */
    public final chd0 f22272h;

    /* JADX INFO: renamed from: i */
    public final int[] f22273i;

    /* JADX INFO: renamed from: j */
    public int f22274j;

    /* JADX INFO: renamed from: k */
    public c4g0 f22275k;

    /* JADX INFO: renamed from: l */
    public MMLiveTranscoding f22276l;

    public xgd0(chd0 chd0Var) {
        super(chd0Var);
        this.f22273i = new int[]{540, 960};
        this.f22274j = 1200000;
        this.f22272h = chd0Var;
    }

    /* JADX INFO: renamed from: s1 */
    private MMLiveTranscoding m25918s1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f22274j;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM5271V0 = m5271V0(ypv.a.D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.userid = ypv.a.D0();
        mMLiveTranscoding.mid = ypv.a.D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 0;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: t1 */
    private MMLiveMediaConfig m25919t1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f22274j = 1200000;
        cu00.m11349a(new d30() { // from class: l.ugd0
            public final void call() {
                this.f20632a.m25921v1();
            }
        }, new d30() { // from class: l.vgd0
            public final void call() {
                this.f21120a.m25922w1();
            }
        });
        int[] iArr = this.f22273i;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f22274j = i2;
            int[] iArr2 = this.f22273i;
            iArr2[0] = bLiveEncode.width;
            iArr2[1] = bLiveEncode.heigth;
            i = bLiveVideoQualityConf.videoCodecType;
        } else {
            BLiveVideoQuality bLiveVideoQualityM22650a1 = this.f3840e.f17744c.m22650a1();
            if (bLiveVideoQualityM22650a1 == null || !bLiveVideoQualityM22650a1.isValid()) {
                i = 0;
            } else {
                mMLiveMediaConfig.videoFPS = bLiveVideoQualityM22650a1.pushFps;
                int i3 = bLiveVideoQualityM22650a1.pushBitrate;
                mMLiveMediaConfig.videoBitRate = i3;
                this.f22274j = i3;
                int[] iArr3 = this.f22273i;
                iArr3[0] = bLiveVideoQualityM22650a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM22650a1.pushHeight;
                i = bLiveVideoQualityM22650a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f22273i;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f22272h.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f22272h.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: u1 */
    public static C0303b m25920u1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_NORMAL) {
            return null;
        }
        return new xgd0((chd0) motionParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m25921v1() {
        int[] iArr = this.f22273i;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public /* synthetic */ void m25922w1() {
        int[] iArr = this.f22273i;
        iArr[0] = 480;
        iArr[1] = 640;
    }

    /* JADX INFO: renamed from: B0 */
    public void m25923B0() {
        super.B0();
        this.f22272h.f8672m.call(1, this.f22272h.f3830d);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        super.mo5273X0();
        m5274Y0();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: a1 */
    public void mo5276a1() {
        super.mo5276a1();
        mkd0.z(this.f22275k);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: e1 */
    public boolean mo5280e1() {
        return !vdt.b(2) && this.f22272h.f3831e;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        if (vdt.b(2)) {
            RtcEngine.destroy();
        }
        this.f3840e.f17749h.m14892d(new mo40());
        chd0 chd0Var = this.f22272h;
        MMLiveMediaConfig mMLiveMediaConfigM25919t1 = m25919t1(chd0Var.f23517l, chd0Var.f23516k, chd0Var.f23515j);
        this.f22276l = m25918s1(this.f22273i);
        this.f3840e.f17745d.m14876i1(m5272W0());
        if (mo5280e1()) {
            this.f3840e.f17745d.m14873f1(this.f22276l);
            gkh0.j("intl_rtc_up", "普通直播 ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            gkh0.j("intl_rtc_up", "普通直播进入enterroom");
            this.f3840e.f17745d.m14862U0(mMLiveMediaConfigM25919t1, m5270U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f22276l);
        }
        if (vdt.b(2)) {
            return 0;
        }
        m25925y1();
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m25924x1(Long l2) {
        this.f3840e.f17745d.m14873f1(this.f22276l);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m25925y1() {
        mkd0.z(this.f22275k);
        this.f22275k = c.interval(3L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.wgd0
            public final void call(Object obj) {
                this.f21747a.m25924x1((Long) obj);
            }
        }));
    }
}
