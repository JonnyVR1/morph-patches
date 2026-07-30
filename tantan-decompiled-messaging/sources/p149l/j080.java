package p149l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveMixEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class j080 extends C12714b {

    /* JADX INFO: renamed from: h */
    public final k080 f115646h;

    /* JADX INFO: renamed from: i */
    public MMLiveTranscoding f115647i;

    /* JADX INFO: renamed from: j */
    public c4g0 f115648j;

    /* JADX INFO: renamed from: k */
    public k380 f115649k;

    public j080(k080 k080Var) {
        super(k080Var);
        this.f115646h = k080Var;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12714b m139145x1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_PK) {
            return null;
        }
        return new j080((k080) motionParams);
    }

    /* JADX INFO: renamed from: A1 */
    public void m139146A1(String str, int i, String str2) {
        this.f47798e.f152052d.m133209S0(str, i, str2);
        this.f115649k.mo101817b();
        if (this.f115647i == null) {
            return;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM71893V0 = m71893V0(String.valueOf(i), 0.5f, 1.0f, 0.5f, 0.0f);
        this.f115647i.confMembers.add(mMLiveLinkMemberM71893V0);
        this.f115647i.infoMembers.add(mMLiveLinkMemberM71893V0);
        this.f115647i.userid = ypv.f199493a.m199309D0();
        MMLiveTranscoding mMLiveTranscoding = this.f115647i;
        mMLiveTranscoding.ctyp = 1;
        mMLiveTranscoding.mid = ypv.f199493a.m199309D0();
        this.f115647i.inv = String.valueOf(System.currentTimeMillis());
        this.f47798e.f152052d.m133222f1(this.f115647i);
        ht70.m132853j("joinOtherChannel otherChannel= " + str + " other id = " + i);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        ht70.m132853j("onTokenPrivilegeWillExpire token = ");
        this.f115646h.f120461p.call(4, this.f115646h.f47788d);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m139147B1(Long l2) {
        m139152G1();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m139148C1() {
        if (this.f115647i == null) {
            return;
        }
        ht70.m132853j("liveTranscodingRemoveSelf");
        final String strM199309D0 = ypv.f199493a.m199309D0();
        vwb.m200320d0(this.f115647i.confMembers, new w9j() { // from class: l.h080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strM199309D0, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        vwb.m200320d0(this.f115647i.infoMembers, new w9j() { // from class: l.i080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strM199309D0, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
    }

    /* JADX INFO: renamed from: D1 */
    public void m139149D1() {
        k380 k380Var = this.f115649k;
        if (k380Var != null) {
            k380Var.m144375l();
            this.f115649k.mo101817b();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m139150E1(String str) {
        ht70.m132853j("stopPk id:" + str);
        this.f47798e.f152052d.m133231o1(str);
    }

    /* JADX INFO: renamed from: F1 */
    public void m139151F1(final String str, boolean z) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = (MMLiveTranscoding.MMLiveLinkMember) vwb.m200346r(this.f115647i.confMembers, new w9j() { // from class: l.c080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember != null) {
            mMLiveLinkMember.isMuteAudio = z;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = (MMLiveTranscoding.MMLiveLinkMember) vwb.m200346r(this.f115647i.infoMembers, new w9j() { // from class: l.d080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember2 != null) {
            mMLiveLinkMember2.isMuteAudio = z;
        }
        this.f47798e.f152052d.m133222f1(this.f115647i);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m139152G1() {
        if (this.f115647i != null) {
            ht70.m132853j("PkPusherMotion update current sei");
            this.f47798e.f152052d.m133222f1(this.f115647i);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m139153H1(long j) {
        m139148C1();
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM71893V0 = m71893V0(ypv.f199493a.m199309D0(), 0.5f, 1.0f, 0.0f, 0.0f);
        this.f115647i.confMembers.add(mMLiveLinkMemberM71893V0);
        this.f115647i.infoMembers.add(mMLiveLinkMemberM71893V0);
        this.f115647i.userid = ypv.f199493a.m199309D0();
        this.f115647i.mid = ypv.f199493a.m199309D0();
        this.f115647i.inv = String.valueOf(System.currentTimeMillis());
        this.f47798e.f152052d.m133222f1(this.f115647i);
        this.f115646h.f120461p.call(3, Long.valueOf(j));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        super.mo71895X0();
        m71896Y0();
        ht70.m132853j("PkPusherMotion end and pushEngine leaveRoom");
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: a1 */
    public void mo71898a1() {
        super.mo71898a1();
        mkd0.m154992z(this.f115648j);
        this.f115647i = null;
        m139150E1(this.f115646h.f47792h);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        if (this.f115647i == null) {
            return;
        }
        final String strValueOf = String.valueOf(j);
        int iM200320d0 = vwb.m200320d0(this.f115647i.confMembers, new w9j() { // from class: l.e080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strValueOf, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        int iM200320d1 = vwb.m200320d0(this.f115647i.infoMembers, new w9j() { // from class: l.f080
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(strValueOf, ((MMLiveTranscoding.MMLiveLinkMember) obj).userid));
            }
        });
        if (iM200320d0 > 0 || iM200320d1 > 0) {
            MMLiveTranscoding mMLiveTranscodingM139154w1 = m139154w1();
            this.f115647i = mMLiveTranscodingM139154w1;
            mMLiveTranscodingM139154w1.ctyp = 0;
            this.f47798e.f152052d.m133222f1(mMLiveTranscodingM139154w1);
        }
        this.f115646h.f120461p.call(2, Long.valueOf(j));
        ht70.m132853j("onVideoChannelRemove sei = " + this.f115647i.toString());
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        if (uvr.m196087d().m162729z0()) {
            k080 k080Var = this.f115646h;
            m139146A1(k080Var.f120458m, k080Var.f120460o, k080Var.f120459n);
        }
        if (this.f115647i == null) {
            ht70.m132853j("onLocalJoinChannel no mLiveSeiInfo channel = " + str + " uid = " + j);
            return;
        }
        ht70.m132853j("PkPusherMotion onLocalJoinChannel channel = " + str + " uid = " + j);
        m139153H1(j);
        ht70.m132853j("onLocalJoinChannel result channel = " + str + " uid = " + j);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: e1 */
    public boolean mo71902e1() {
        return !vdt.m198092b(2) && this.f115646h.f47789e && this.f47798e.f152052d.m133213W0();
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
        ht70.m132853j("start pk push motion params:" + this.f115646h);
        k380 k380Var = new k380();
        this.f115649k = k380Var;
        this.f47798e.f152056h.m133285d(k380Var);
        this.f115647i = m139154w1();
        this.f47798e.f152052d.m133225i1(m71894W0());
        this.f47798e.f152052d.mo118673N(false);
        this.f47798e.f152052d.mo118681p(false);
        boolean zMo71902e1 = mo71902e1();
        q0f q0fVar = this.f47798e;
        if (zMo71902e1) {
            q0fVar.f152052d.m133222f1(this.f115647i);
            m139153H1(Long.parseLong(ypv.f199493a.m199309D0()));
            gkh0.m126627j("intl_rtc_up", "pk ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            q0fVar.f152052d.m133211U0(m139155y1(this.f115646h.f203958j), m71892U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f115647i);
        }
        if (!uvr.m196087d().m162729z0()) {
            k080 k080Var = this.f115646h;
            m139146A1(k080Var.f120458m, k080Var.f120460o, k080Var.f120459n);
        }
        mkd0.m154992z(this.f115648j);
        this.f115648j = C22306c.interval(3L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.g080
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100028a.m139147B1((Long) obj);
            }
        }));
        return 0;
    }

    /* JADX INFO: renamed from: w1 */
    public final MMLiveTranscoding m139154w1() {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = 1080;
        mMLiveTranscoding.canvasHeight = 804;
        mMLiveTranscoding.videoBitrate = 1200000;
        BLiveMixEncode bLiveMixEncode = NullChecker.m81303a(this.f115646h.f203958j) ? this.f115646h.f203958j.mixEncode : null;
        if (NullChecker.m81303a(bLiveMixEncode) && bLiveMixEncode.isValid()) {
            mMLiveTranscoding.videoBitrate = bLiveMixEncode.bitRate;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM71893V0 = m71893V0(ypv.f199493a.m199309D0(), 0.5f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.ctyp = 1;
        return mMLiveTranscoding;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007b  */
    /* JADX INFO: renamed from: y1 */
    public final MMLiveMediaConfig m139155y1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        k080 k080Var = this.f115646h;
        mMLiveMediaConfig.url = k080Var.f203960l;
        mMLiveMediaConfig.ipv6Url = k080Var.f203959k;
        j760<Integer, Integer> j760VarM139156z1 = m139156z1();
        mMLiveMediaConfig.encodeWidth = j760VarM139156z1.f116564a.intValue();
        mMLiveMediaConfig.encodeHeight = j760VarM139156z1.f116565b.intValue();
        mMLiveMediaConfig.videoBitRate = 1200000;
        if (!NullChecker.m81303a(bLiveVideoQualityConf) || !bLiveVideoQualityConf.encode.isValid()) {
            BLiveVideoQuality bLiveVideoQualityM185820a1 = this.f47798e.f152051c.m185820a1();
            if (bLiveVideoQualityM185820a1 == null || !bLiveVideoQualityM185820a1.isValid()) {
                i = 0;
            } else {
                mMLiveMediaConfig.videoFPS = bLiveVideoQualityM185820a1.pushFps;
                mMLiveMediaConfig.videoBitRate = bLiveVideoQualityM185820a1.pushBitrate;
                i = bLiveVideoQualityM185820a1.videoCodecType;
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
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f115646h.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f115646h.f47786b);
        ht70.m132853j("createPkMediaConfig:" + mMLiveMediaConfig.toString());
        return mMLiveMediaConfig;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        if (this.f47798e != null) {
            this.f115649k.m144373j(surfaceView);
            this.f115649k.mo101817b();
            this.f115646h.f120461p.call(1, Long.valueOf(j));
            if (this.f115647i != null) {
                ht70.m132853j("onVideoChannelAdded sei = " + this.f115647i.toString());
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final j760<Integer, Integer> m139156z1() {
        j760<Integer, Integer> j760Var = new j760<>(540, 804);
        if ("tencent".equals(this.f115646h.f47788d)) {
            j760<Integer, Integer> j760VarM185818Z0 = this.f47798e.f152051c.m185818Z0();
            j760Var = new j760<>(Integer.valueOf((j760VarM185818Z0.f116564a.intValue() / 16) * 16), Integer.valueOf((j760VarM185818Z0.f116565b.intValue() / 16) * 16));
        }
        ht70.m132853j("getVideoResolution width=" + j760Var.f116564a + ",height:" + j760Var.f116565b);
        return j760Var;
    }
}
