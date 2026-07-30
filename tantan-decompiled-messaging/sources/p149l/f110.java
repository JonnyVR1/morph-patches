package p149l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.base.data.BLiveEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import io.agora.rtc2.RtcEngine;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class f110 extends C12714b {

    /* JADX INFO: renamed from: h */
    public final x010 f94026h;

    /* JADX INFO: renamed from: i */
    public MMLiveTranscoding f94027i;

    /* JADX INFO: renamed from: j */
    public MMLiveMediaConfig f94028j;

    /* JADX INFO: renamed from: k */
    public final int[] f94029k;

    /* JADX INFO: renamed from: l */
    public int f94030l;

    /* JADX INFO: renamed from: m */
    public final HashSet<Long> f94031m;

    /* JADX INFO: renamed from: n */
    public bj10 f94032n;

    /* JADX INFO: renamed from: o */
    public final Gson f94033o;

    /* JADX INFO: renamed from: p */
    public je10 f94034p;

    /* JADX INFO: renamed from: q */
    public String f94035q;

    public f110(x010 x010Var) {
        super(x010Var);
        this.f94029k = new int[]{540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        this.f94030l = 1200000;
        this.f94031m = new HashSet<>();
        this.f94034p = new je10("2x2");
        this.f94035q = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpUQVIzWDRFWFhLUTRXQVdaSDI3QldDS0JWVlhMUTEyIiwidyI6Mzc1LCJoIjozNzUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTg0ODg4NjEwMzA5NDc0MDU1fQ.png";
        this.f94026h = x010Var;
        this.f94033o = new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public /* synthetic */ void m119069A1() {
        int[] iArr = this.f94029k;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: F1 */
    private void m119070F1(SurfaceView surfaceView, long j) {
        this.f94032n.m102145g(Long.valueOf(j), surfaceView);
        m119091w1(j);
    }

    /* JADX INFO: renamed from: x1 */
    private MMLiveTranscoding m119078x1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f94030l;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM71893V0 = m71893V0(ypv.f199493a.m199309D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.userid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.mid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 3;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: y1 */
    private MMLiveMediaConfig m119079y1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f94030l = 1200000;
        cu00.m108718a(new d30() { // from class: l.b110
            @Override // p149l.d30
            public final void call() {
                this.f72482a.m119069A1();
            }
        }, new d30() { // from class: l.c110
            @Override // p149l.d30
            public final void call() {
                this.f78195a.m119081B1();
            }
        });
        int[] iArr = this.f94029k;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m81303a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f94030l = i2;
            int[] iArr2 = this.f94029k;
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
                this.f94030l = i3;
                int[] iArr3 = this.f94029k;
                iArr3[0] = bLiveVideoQualityM185820a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM185820a1.pushHeight;
                i = bLiveVideoQualityM185820a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f94029k;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f94026h.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f94026h.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: z1 */
    public static C12714b m119080z1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR) {
            return null;
        }
        return new f110((x010) motionParams);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        yi10.m214879a("onRequestChannelKey");
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(1).m213297n(this.f94026h.f47788d));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m119081B1() {
        int[] iArr = this.f94029k;
        iArr[0] = 480;
        iArr[1] = 640;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(5));
        }
        hfw.m130790a(s410.f162235a, "onLocalLeaveChannel" + str);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ Integer m119082C1(Long l2) {
        if (NullChecker.m81303a(this.f47794a)) {
            return Integer.valueOf(this.f47794a.mo106704a(y74.m213284a(4).m213299p(l2)).m213291h());
        }
        return -1;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m119083D1(Long l2) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = String.valueOf(l2);
        y74 y74VarMo106704a = this.f47794a.mo106704a(y74.m213284a(4).m213299p(l2));
        mMLiveLinkMember.isMuteAudio = y74VarMo106704a.m213292i();
        this.f94034p.m141096e(y74VarMo106704a.m213291h(), mMLiveLinkMember);
        if (TextUtils.equals(ypv.f199493a.m199309D0(), y74VarMo106704a.m213290g())) {
            this.f47798e.f152051c.m185816C((int) (uep0.m193329p() * mMLiveLinkMember.f13962w), (int) (uep0.m193329p() * mMLiveLinkMember.f13961h));
        }
        if (mMLiveLinkMember.f13962w <= 0.0f || mMLiveLinkMember.f13961h <= 0.0f) {
            return;
        }
        this.f94027i.infoMembers.add(mMLiveLinkMember);
        this.f94027i.confMembers.add(mMLiveLinkMember);
    }

    /* JADX INFO: renamed from: E1 */
    public final void m119084E1(long j) {
        m119085G1(j);
        this.f94032n.m102149k(j);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m119085G1(long j) {
        this.f94031m.remove(Long.valueOf(j));
        this.f94032n.m102149k(j);
        m119089K1();
    }

    /* JADX INFO: renamed from: H1 */
    public void m119086H1(String str) {
        hfw.m130790a(s410.f162235a, "anchor push setRestartWithURL:" + str);
        this.f47798e.f152052d.m133224h1(str);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: I */
    public void mo110343I(long j, boolean z) {
        super.mo110343I(j, z);
        yi10.m214879a("onMemberAudioMuted" + j);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: I0 */
    public void mo110344I0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110344I0(mMLivePushType);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(11));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m119087I1(String str) {
        je10 je10Var = new je10(str);
        this.f94034p = je10Var;
        this.f94032n.m102150l(je10Var);
        m119089K1();
    }

    /* JADX INFO: renamed from: J1 */
    public void m119088J1(Integer num) {
        this.f47798e.f152052d.m133226j1(num.intValue());
    }

    /* JADX INFO: renamed from: K1 */
    public void m119089K1() {
        MMLiveTranscoding mMLiveTranscoding = this.f94027i;
        if (mMLiveTranscoding == null) {
            return;
        }
        mMLiveTranscoding.infoMembers.clear();
        this.f94027i.confMembers.clear();
        vwb.m200354z(this.f94031m, new e30() { // from class: l.y010
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195246a.m119083D1((Long) obj);
            }
        });
        MMLiveTranscoding mMLiveTranscoding2 = this.f94027i;
        mMLiveTranscoding2.canvasWidth = 1080;
        mMLiveTranscoding2.canvasHeight = 1080;
        MMLiveMediaConfig mMLiveMediaConfig = this.f94028j;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 540;
        mMLiveTranscoding2.extString = "{\"mode\": " + this.f94034p.m141094c() + "}";
        MMLiveTranscoding mMLiveTranscoding3 = this.f94027i;
        mMLiveTranscoding3.ctyp = 3;
        if (mMLiveTranscoding3.infoMembers.size() > 4) {
            this.f94027i.shortSei = 1;
        }
        this.f47798e.f152052d.m133223g1(this.f94028j);
        this.f47798e.f152052d.m133222f1(this.f94027i);
        this.f94032n.mo101817b();
        this.f47798e.f152052d.m133227k1(this.f94035q);
        yi10.m214879a("updateCanvasAndVideoResolution sei = " + this.f94033o.toJson(this.f94027i));
    }

    /* JADX INFO: renamed from: L1 */
    public void m119090L1(final String str, boolean z) {
        MMLiveTranscoding mMLiveTranscoding = this.f94027i;
        if (mMLiveTranscoding == null) {
            return;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = (MMLiveTranscoding.MMLiveLinkMember) vwb.m200346r(mMLiveTranscoding.confMembers, new w9j() { // from class: l.d110
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember != null) {
            mMLiveLinkMember.isMuteAudio = z;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = (MMLiveTranscoding.MMLiveLinkMember) vwb.m200346r(this.f94027i.infoMembers, new w9j() { // from class: l.e110
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember2 != null) {
            mMLiveLinkMember2.isMuteAudio = z;
        }
        this.f47798e.f152052d.m133222f1(this.f94027i);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: S */
    public void mo110350S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo110350S(mMLivePushType, i, i2);
        if (i2 == 1011) {
            return;
        }
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (i2 == 109) {
            interfaceC21330a.mo106704a(y74.m213284a(1).m213297n(this.f94026h.f47788d));
        } else {
            interfaceC21330a.mo106704a(y74.m213284a(7));
        }
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
        yi10.m214879a("goToEnd");
        if (vdt.m198092b(2)) {
            this.f47798e.f152052d.mo118673N(true);
            this.f47798e.f152052d.mo118681p(true);
            return;
        }
        gkh0.m126627j("intl_rtc_up", "复用 rtc频道，VideoMute false ,audiomute false");
        this.f94027i = null;
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(5));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        yi10.m214879a("onVideoChannelRemove uid:" + j + ",reason:" + i);
        m119085G1(j);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        m119091w1(j);
        yi10.m214879a("onLocalJoinChannel result channel = " + str + " uid = " + j);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(6).m213299p(Long.valueOf(j)));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e */
    public void mo110357e(long j, boolean z) {
        super.mo110357e(j, z);
        yi10.m214879a("onMemberVideoMuted uid:" + j + ",muted:" + z);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e0 */
    public void mo110358e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        yi10.m214879a("onMemberJoinChannel" + j);
        super.mo110358e0(str, j, mMLivePushType);
        m119091w1(j);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(3).m213299p(Long.valueOf(j)));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: e1 */
    public boolean mo71902e1() {
        return !vdt.m198092b(2) && this.f94026h.f47789e && this.f47798e.f152052d.m133213W0();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo71905i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: l0 */
    public void mo110359l0(md1[] md1VarArr) {
        super.mo110359l0(md1VarArr);
        if ((md1VarArr.length == 1 && md1VarArr[0].m154034a() == 0) || this.f94027i == null) {
            return;
        }
        final ConcurrentHashMap<String, Float> concurrentHashMap = new ConcurrentHashMap<>();
        vwb.m200287A(md1VarArr, new e30() { // from class: l.z010
            @Override // p149l.e30
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.m154034a()), Float.valueOf(md1Var.m154035b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.mode = this.f94034p.m141094c();
        bLiveCallVolume.volumes = concurrentHashMap;
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(8).m213302s(bLiveCallVolume));
        }
        this.f94027i.extString = this.f94033o.toJson(bLiveCallVolume);
        this.f47798e.f152052d.m133222f1(this.f94027i);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
        yi10.m214879a("onMemberLeaveChannel" + j);
        m119084E1(j);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(2).m213299p(Long.valueOf(j)));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        if (vdt.m198092b(2)) {
            RtcEngine.destroy();
        }
        yi10.m214879a("start motionParams" + this.f94026h.toString());
        bj10 bj10Var = new bj10(true, this.f94034p, new w9j() { // from class: l.a110
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67092a.m119082C1((Long) obj);
            }
        });
        this.f94032n = bj10Var;
        this.f47798e.f152056h.m133285d(bj10Var);
        x010 x010Var = this.f94026h;
        this.f94028j = m119079y1(x010Var.f203960l, x010Var.f203959k, x010Var.f203958j);
        this.f94027i = m119078x1(this.f94029k);
        this.f47798e.f152052d.m133225i1(m71894W0());
        this.f47798e.f152052d.mo118673N(!this.f94026h.f188905n);
        boolean zMo71902e1 = mo71902e1();
        q0f q0fVar = this.f47798e;
        if (zMo71902e1) {
            q0fVar.f152052d.m133222f1(this.f94027i);
            String strM199309D0 = ypv.f199493a.m199309D0();
            m119091w1(Long.parseLong(strM199309D0));
            y74.InterfaceC21330a interfaceC21330a = this.f47794a;
            if (interfaceC21330a != null) {
                interfaceC21330a.mo106704a(y74.m213284a(6).m213300q(strM199309D0));
            }
            gkh0.m126627j("intl_rtc_up", "多人连麦 ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            q0fVar.f152052d.m133211U0(this.f94028j, m71892U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f94027i);
        }
        this.f47798e.f152052d.m133210T0(1000, 3);
        int i = this.f94026h.f188906o;
        if (i == 0) {
            return 0;
        }
        this.f47798e.f152052d.m133226j1(i);
        return 0;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m119091w1(long j) {
        this.f94031m.add(Long.valueOf(j));
        m119089K1();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        m119070F1(surfaceView, j);
        if (this.f94027i == null) {
            return;
        }
        yi10.m214879a("onVideoChannelAdded sei = " + this.f94033o.toJson(this.f94027i));
    }
}
