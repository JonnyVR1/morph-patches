package p002l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveEncode;
import com.p1.mobile.putong.live.base.data.BLiveMixEncode;
import com.p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.ffw;
import l.gkh0;
import l.ht70;
import l.j760;
import l.jo0;
import l.mkd0;
import l.uvr;
import l.vdt;
import l.vwb;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j080 extends C0303b {

    /* JADX INFO: renamed from: h */
    public final k080 f13517h;

    /* JADX INFO: renamed from: i */
    public MMLiveTranscoding f13518i;

    /* JADX INFO: renamed from: j */
    public c4g0 f13519j;

    /* JADX INFO: renamed from: k */
    public k380 f13520k;

    public j080(k080 k080Var) {
        super(k080Var);
        this.f13517h = k080Var;
    }

    /* JADX INFO: renamed from: x1 */
    public static C0303b m15539x1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_PK) {
            return null;
        }
        return new j080((k080) motionParams);
    }

    /* JADX INFO: renamed from: A1 */
    public void m15540A1(String str, int i, String str2) {
        this.f3840e.f17745d.m14860S0(str, i, str2);
        this.f13520k.mo10326b();
        if (this.f13518i == null) {
            return;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM5271V0 = m5271V0(String.valueOf(i), 0.5f, 1.0f, 0.5f, 0.0f);
        this.f13518i.confMembers.add(mMLiveLinkMemberM5271V0);
        this.f13518i.infoMembers.add(mMLiveLinkMemberM5271V0);
        this.f13518i.userid = ypv.a.D0();
        MMLiveTranscoding mMLiveTranscoding = this.f13518i;
        mMLiveTranscoding.ctyp = 1;
        mMLiveTranscoding.mid = ypv.a.D0();
        this.f13518i.inv = String.valueOf(System.currentTimeMillis());
        this.f3840e.f17745d.m14873f1(this.f13518i);
        ht70.j("joinOtherChannel otherChannel= " + str + " other id = " + i);
    }

    /* JADX INFO: renamed from: B0 */
    public void m15541B0() {
        super.B0();
        ht70.j("onTokenPrivilegeWillExpire token = ");
        this.f13517h.f14160p.call(4, this.f13517h.f3830d);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m15542B1(Long l2) {
        m15547G1();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m15543C1() {
        if (this.f13518i == null) {
            return;
        }
        ht70.j("liveTranscodingRemoveSelf");
        final String strD0 = ypv.a.D0();
        vwb.d0(this.f13518i.confMembers, new w9j() { // from class: l.h080
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strD0, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        vwb.d0(this.f13518i.infoMembers, new w9j() { // from class: l.i080
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strD0, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
    }

    /* JADX INFO: renamed from: D1 */
    public void m15544D1() {
        k380 k380Var = this.f13520k;
        if (k380Var != null) {
            k380Var.m16487l();
            this.f13520k.mo10326b();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m15545E1(String str) {
        ht70.j("stopPk id:" + str);
        this.f3840e.f17745d.m14882o1(str);
    }

    /* JADX INFO: renamed from: F1 */
    public void m15546F1(final String str, boolean z) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = (MMLiveTranscoding.MMLiveLinkMember) vwb.r(this.f13518i.confMembers, new w9j() { // from class: l.c080
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember != null) {
            mMLiveLinkMember.isMuteAudio = z;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = (MMLiveTranscoding.MMLiveLinkMember) vwb.r(this.f13518i.infoMembers, new w9j() { // from class: l.d080
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember2 != null) {
            mMLiveLinkMember2.isMuteAudio = z;
        }
        this.f3840e.f17745d.m14873f1(this.f13518i);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m15547G1() {
        if (this.f13518i != null) {
            ht70.j("PkPusherMotion update current sei");
            this.f3840e.f17745d.m14873f1(this.f13518i);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m15548H1(long j) {
        m15543C1();
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM5271V0 = m5271V0(ypv.a.D0(), 0.5f, 1.0f, 0.0f, 0.0f);
        this.f13518i.confMembers.add(mMLiveLinkMemberM5271V0);
        this.f13518i.infoMembers.add(mMLiveLinkMemberM5271V0);
        this.f13518i.userid = ypv.a.D0();
        this.f13518i.mid = ypv.a.D0();
        this.f13518i.inv = String.valueOf(System.currentTimeMillis());
        this.f3840e.f17745d.m14873f1(this.f13518i);
        this.f13517h.f14160p.call(3, Long.valueOf(j));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        super.mo5273X0();
        m5274Y0();
        ht70.j("PkPusherMotion end and pushEngine leaveRoom");
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: a1 */
    public void mo5276a1() {
        super.mo5276a1();
        mkd0.z(this.f13519j);
        this.f13518i = null;
        m15545E1(this.f13517h.f3834h);
    }

    /* JADX INFO: renamed from: b */
    public void m15549b(long j, int i) {
        super.b(j, i);
        if (this.f13518i == null) {
            return;
        }
        final String strValueOf = String.valueOf(j);
        int iD0 = vwb.d0(this.f13518i.confMembers, new w9j() { // from class: l.e080
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strValueOf, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        int iD1 = vwb.d0(this.f13518i.infoMembers, new w9j() { // from class: l.f080
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strValueOf, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        if (iD0 > 0 || iD1 > 0) {
            MMLiveTranscoding mMLiveTranscodingM15551w1 = m15551w1();
            this.f13518i = mMLiveTranscodingM15551w1;
            mMLiveTranscodingM15551w1.ctyp = 0;
            this.f3840e.f17745d.m14873f1(mMLiveTranscodingM15551w1);
        }
        this.f13517h.f14160p.call(2, Long.valueOf(j));
        ht70.j("onVideoChannelRemove sei = " + this.f13518i.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public void m15550d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.d0(str, j, mMLivePushType);
        if (uvr.d().z0()) {
            k080 k080Var = this.f13517h;
            m15540A1(k080Var.f14157m, k080Var.f14159o, k080Var.f14158n);
        }
        if (this.f13518i == null) {
            ht70.j("onLocalJoinChannel no mLiveSeiInfo channel = " + str + " uid = " + j);
            return;
        }
        ht70.j("PkPusherMotion onLocalJoinChannel channel = " + str + " uid = " + j);
        m15548H1(j);
        ht70.j("onLocalJoinChannel result channel = " + str + " uid = " + j);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: e1 */
    public boolean mo5280e1() {
        return !vdt.b(2) && this.f13517h.f3831e && this.f3840e.f17745d.m14864W0();
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
        ht70.j("start pk push motion params:" + this.f13517h);
        k380 k380Var = new k380();
        this.f13520k = k380Var;
        this.f3840e.f17749h.m14892d(k380Var);
        this.f13518i = m15551w1();
        this.f3840e.f17745d.m14876i1(m5272W0());
        this.f3840e.f17745d.mo12833N(false);
        this.f3840e.f17745d.mo12841p(false);
        boolean zMo5280e1 = mo5280e1();
        q0f q0fVar = this.f3840e;
        if (zMo5280e1) {
            q0fVar.f17745d.m14873f1(this.f13518i);
            m15548H1(Long.parseLong(ypv.a.D0()));
            gkh0.j("intl_rtc_up", "pk ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            q0fVar.f17745d.m14862U0(m15552y1(this.f13517h.f23515j), m5270U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f13518i);
        }
        if (!uvr.d().z0()) {
            k080 k080Var = this.f13517h;
            m15540A1(k080Var.f14157m, k080Var.f14159o, k080Var.f14158n);
        }
        mkd0.z(this.f13519j);
        this.f13519j = c.interval(3L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.g080
            public final void call(Object obj) {
                this.f10699a.m15542B1((Long) obj);
            }
        }));
        return 0;
    }

    /* JADX INFO: renamed from: w1 */
    public final MMLiveTranscoding m15551w1() {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = 1080;
        mMLiveTranscoding.canvasHeight = 804;
        mMLiveTranscoding.videoBitrate = 1200000;
        BLiveMixEncode bLiveMixEncode = NullChecker.a(this.f13517h.f23515j) ? this.f13517h.f23515j.mixEncode : null;
        if (NullChecker.a(bLiveMixEncode) && bLiveMixEncode.isValid()) {
            mMLiveTranscoding.videoBitrate = bLiveMixEncode.bitRate;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM5271V0 = m5271V0(ypv.a.D0(), 0.5f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.ctyp = 1;
        return mMLiveTranscoding;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007b  */
    /* JADX INFO: renamed from: y1 */
    public final MMLiveMediaConfig m15552y1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        k080 k080Var = this.f13517h;
        mMLiveMediaConfig.url = k080Var.f23517l;
        mMLiveMediaConfig.ipv6Url = k080Var.f23516k;
        j760<Integer, Integer> j760VarM15554z1 = m15554z1();
        mMLiveMediaConfig.encodeWidth = ((Integer) j760VarM15554z1.a).intValue();
        mMLiveMediaConfig.encodeHeight = ((Integer) j760VarM15554z1.b).intValue();
        mMLiveMediaConfig.videoBitRate = 1200000;
        if (!NullChecker.a(bLiveVideoQualityConf) || !bLiveVideoQualityConf.encode.isValid()) {
            BLiveVideoQuality bLiveVideoQualityM22650a1 = this.f3840e.f17744c.m22650a1();
            if (bLiveVideoQualityM22650a1 == null || !bLiveVideoQualityM22650a1.isValid()) {
                i = 0;
            } else {
                mMLiveMediaConfig.videoFPS = bLiveVideoQualityM22650a1.pushFps;
                mMLiveMediaConfig.videoBitRate = bLiveVideoQualityM22650a1.pushBitrate;
                i = bLiveVideoQualityM22650a1.videoCodecType;
            }
        } else if (bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            mMLiveMediaConfig.videoBitRate = bLiveEncode.bitRate;
            i = bLiveVideoQualityConf.videoCodecType;
        } else {
            i = 0;
        }
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f13517h.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f13517h.f3828b);
        ht70.j("createPkMediaConfig:" + mMLiveMediaConfig.toString());
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: z0 */
    public void m15553z0(long j, SurfaceView surfaceView) {
        super.z0(j, surfaceView);
        if (this.f3840e != null) {
            this.f13520k.m16485j(surfaceView);
            this.f13520k.mo10326b();
            this.f13517h.f14160p.call(1, Long.valueOf(j));
            if (this.f13518i != null) {
                ht70.j("onVideoChannelAdded sei = " + this.f13518i.toString());
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final j760<Integer, Integer> m15554z1() {
        j760<Integer, Integer> j760Var = new j760<>(540, 804);
        if ("tencent".equals(this.f13517h.f3830d)) {
            j760<Integer, Integer> j760VarM22648Z0 = this.f3840e.f17744c.m22648Z0();
            j760Var = new j760<>(Integer.valueOf((((Integer) j760VarM22648Z0.a).intValue() / 16) * 16), Integer.valueOf((((Integer) j760VarM22648Z0.b).intValue() / 16) * 16));
        }
        ht70.j("getVideoResolution width=" + j760Var.a + ",height:" + j760Var.b);
        return j760Var;
    }
}
