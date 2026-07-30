package p153l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveMixEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class p880 extends C12877b {

    /* JADX INFO: renamed from: h */
    public final q880 f150993h;

    /* JADX INFO: renamed from: i */
    public MMLiveTranscoding f150994i;

    /* JADX INFO: renamed from: j */
    public kcg0 f150995j;

    /* JADX INFO: renamed from: k */
    public qb80 f150996k;

    public p880(q880 q880Var) {
        super(q880Var);
        this.f150993h = q880Var;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12877b m171193x1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_PK) {
            return null;
        }
        return new p880((q880) motionParams);
    }

    /* JADX INFO: renamed from: A1 */
    public void m171194A1(String str, int i, String str2) {
        this.f48646e.f176995d.m170512S0(str, i, str2);
        this.f150996k.mo100754b();
        if (this.f150994i == null) {
            return;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM73076V0 = m73076V0(String.valueOf(i), 0.5f, 1.0f, 0.5f, 0.0f);
        this.f150994i.confMembers.add(mMLiveLinkMemberM73076V0);
        this.f150994i.infoMembers.add(mMLiveLinkMemberM73076V0);
        this.f150994i.userid = zrv.f205799a.m207631D0();
        MMLiveTranscoding mMLiveTranscoding = this.f150994i;
        mMLiveTranscoding.ctyp = 1;
        mMLiveTranscoding.mid = zrv.f205799a.m207631D0();
        this.f150994i.inv = String.valueOf(System.currentTimeMillis());
        this.f48646e.f176995d.m170527f1(this.f150994i);
        n180.m161093j("joinOtherChannel otherChannel= " + str + " other id = " + i);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        n180.m161093j("onTokenPrivilegeWillExpire token = ");
        this.f150993h.f156084p.call(4, this.f150993h.f48636d);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m171195B1(Long l2) {
        m171200G1();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m171196C1() {
        if (this.f150994i == null) {
            return;
        }
        n180.m161093j("liveTranscodingRemoveSelf");
        final String strM207631D0 = zrv.f205799a.m207631D0();
        jyb.m147503d0(this.f150994i.confMembers, new qcj() { // from class: l.n880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strM207631D0, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        jyb.m147503d0(this.f150994i.infoMembers, new qcj() { // from class: l.o880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strM207631D0, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
    }

    /* JADX INFO: renamed from: D1 */
    public void m171197D1() {
        qb80 qb80Var = this.f150996k;
        if (qb80Var != null) {
            qb80Var.m176016l();
            this.f150996k.mo100754b();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m171198E1(String str) {
        n180.m161093j("stopPk id:" + str);
        this.f48646e.f176995d.m170539o1(str);
    }

    /* JADX INFO: renamed from: F1 */
    public void m171199F1(final String str, boolean z) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = (MMLiveTranscoding.MMLiveLinkMember) jyb.m147529r(this.f150994i.confMembers, new qcj() { // from class: l.i880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember != null) {
            mMLiveLinkMember.isMuteAudio = z;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = (MMLiveTranscoding.MMLiveLinkMember) jyb.m147529r(this.f150994i.infoMembers, new qcj() { // from class: l.j880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember2 != null) {
            mMLiveLinkMember2.isMuteAudio = z;
        }
        this.f48646e.f176995d.m170527f1(this.f150994i);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m171200G1() {
        if (this.f150994i != null) {
            n180.m161093j("PkPusherMotion update current sei");
            this.f48646e.f176995d.m170527f1(this.f150994i);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m171201H1(long j) {
        m171196C1();
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM73076V0 = m73076V0(zrv.f205799a.m207631D0(), 0.5f, 1.0f, 0.0f, 0.0f);
        this.f150994i.confMembers.add(mMLiveLinkMemberM73076V0);
        this.f150994i.infoMembers.add(mMLiveLinkMemberM73076V0);
        this.f150994i.userid = zrv.f205799a.m207631D0();
        this.f150994i.mid = zrv.f205799a.m207631D0();
        this.f150994i.inv = String.valueOf(System.currentTimeMillis());
        this.f48646e.f176995d.m170527f1(this.f150994i);
        this.f150993h.f156084p.call(3, Long.valueOf(j));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
        m73079Y0();
        n180.m161093j("PkPusherMotion end and pushEngine leaveRoom");
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: a1 */
    public void mo73081a1() {
        super.mo73081a1();
        psd0.m173633z(this.f150995j);
        this.f150994i = null;
        m171198E1(this.f150993h.f48640h);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        if (this.f150994i == null) {
            return;
        }
        final String strValueOf = String.valueOf(j);
        int iM147503d0 = jyb.m147503d0(this.f150994i.confMembers, new qcj() { // from class: l.k880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strValueOf, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        int iM147503d1 = jyb.m147503d0(this.f150994i.infoMembers, new qcj() { // from class: l.l880
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strValueOf, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        if (iM147503d0 > 0 || iM147503d1 > 0) {
            MMLiveTranscoding mMLiveTranscodingM171202w1 = m171202w1();
            this.f150994i = mMLiveTranscodingM171202w1;
            mMLiveTranscodingM171202w1.ctyp = 0;
            this.f48646e.f176995d.m170527f1(mMLiveTranscodingM171202w1);
        }
        this.f150993h.f156084p.call(2, Long.valueOf(j));
        n180.m161093j("onVideoChannelRemove sei = " + this.f150994i.toString());
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        if (vxr.m203876d().m171036z0()) {
            q880 q880Var = this.f150993h;
            m171194A1(q880Var.f156081m, q880Var.f156083o, q880Var.f156082n);
        }
        if (this.f150994i == null) {
            n180.m161093j("onLocalJoinChannel no mLiveSeiInfo channel = " + str + " uid = " + j);
            return;
        }
        n180.m161093j("PkPusherMotion onLocalJoinChannel channel = " + str + " uid = " + j);
        m171201H1(j);
        n180.m161093j("onLocalJoinChannel result channel = " + str + " uid = " + j);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: e1 */
    public boolean mo73085e1() {
        return !wft.m206159b(2) && this.f150993h.f48637e && this.f48646e.f176995d.m170516W0();
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
        n180.m161093j("start pk push motion params:" + this.f150993h);
        qb80 qb80Var = new qb80();
        this.f150996k = qb80Var;
        this.f48646e.f176999h.m179837d(qb80Var);
        this.f150994i = m171202w1();
        this.f48646e.f176995d.m170531i1(m73077W0());
        this.f48646e.f176995d.mo170509N(false);
        this.f48646e.f176995d.mo170540p(false);
        boolean zMo73085e1 = mo73085e1();
        u1f u1fVar = this.f48646e;
        if (zMo73085e1) {
            u1fVar.f176995d.m170527f1(this.f150994i);
            m171201H1(Long.parseLong(zrv.f205799a.m207631D0()));
            nsh0.m164608j("intl_rtc_up", "pk ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            u1fVar.f176995d.m170514U0(m171203y1(this.f150993h.f143913j), m73075U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f150994i);
        }
        if (!vxr.m203876d().m171036z0()) {
            q880 q880Var = this.f150993h;
            m171194A1(q880Var.f156081m, q880Var.f156083o, q880Var.f156082n);
        }
        psd0.m173633z(this.f150995j);
        this.f150995j = C22421c.interval(3L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.m880
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135157a.m171195B1((Long) obj);
            }
        }));
        return 0;
    }

    /* JADX INFO: renamed from: w1 */
    public final MMLiveTranscoding m171202w1() {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = 1080;
        mMLiveTranscoding.canvasHeight = 804;
        mMLiveTranscoding.videoBitrate = 1200000;
        BLiveMixEncode bLiveMixEncode = NullChecker.m82486a(this.f150993h.f143913j) ? this.f150993h.f143913j.mixEncode : null;
        if (NullChecker.m82486a(bLiveMixEncode) && bLiveMixEncode.isValid()) {
            mMLiveTranscoding.videoBitrate = bLiveMixEncode.bitRate;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM73076V0 = m73076V0(zrv.f205799a.m207631D0(), 0.5f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.ctyp = 1;
        return mMLiveTranscoding;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007b  */
    /* JADX INFO: renamed from: y1 */
    public final MMLiveMediaConfig m171203y1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        q880 q880Var = this.f150993h;
        mMLiveMediaConfig.url = q880Var.f143915l;
        mMLiveMediaConfig.ipv6Url = q880Var.f143914k;
        pf60<Integer, Integer> pf60VarM171204z1 = m171204z1();
        mMLiveMediaConfig.encodeWidth = pf60VarM171204z1.f152156a.intValue();
        mMLiveMediaConfig.encodeHeight = pf60VarM171204z1.f152157b.intValue();
        mMLiveMediaConfig.videoBitRate = 1200000;
        if (!NullChecker.m82486a(bLiveVideoQualityConf) || !bLiveVideoQualityConf.encode.isValid()) {
            BLiveVideoQuality bLiveVideoQualityM101583a1 = this.f48646e.f176994c.m101583a1();
            if (bLiveVideoQualityM101583a1 == null || !bLiveVideoQualityM101583a1.isValid()) {
                i = 0;
            } else {
                mMLiveMediaConfig.videoFPS = bLiveVideoQualityM101583a1.pushFps;
                mMLiveMediaConfig.videoBitRate = bLiveVideoQualityM101583a1.pushBitrate;
                i = bLiveVideoQualityM101583a1.videoCodecType;
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
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f150993h.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f150993h.f48634b);
        n180.m161093j("createPkMediaConfig:" + mMLiveMediaConfig.toString());
        return mMLiveMediaConfig;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        if (this.f48646e != null) {
            this.f150996k.m176014j(surfaceView);
            this.f150996k.mo100754b();
            this.f150993h.f156084p.call(1, Long.valueOf(j));
            if (this.f150994i != null) {
                n180.m161093j("onVideoChannelAdded sei = " + this.f150994i.toString());
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final pf60<Integer, Integer> m171204z1() {
        pf60<Integer, Integer> pf60Var = new pf60<>(540, 804);
        if ("tencent".equals(this.f150993h.f48636d)) {
            pf60<Integer, Integer> pf60VarM101581Z0 = this.f48646e.f176994c.m101581Z0();
            pf60Var = new pf60<>(Integer.valueOf((pf60VarM101581Z0.f152156a.intValue() / 16) * 16), Integer.valueOf((pf60VarM101581Z0.f152157b.intValue() / 16) * 16));
        }
        n180.m161093j("getVideoResolution width=" + pf60Var.f152156a + ",height:" + pf60Var.f152157b);
        return pf60Var;
    }
}
