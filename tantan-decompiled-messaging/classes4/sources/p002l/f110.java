package p002l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p1.mobile.putong.live.base.data.BLiveEncode;
import com.p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.RtcEngine;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import l.d30;
import l.e30;
import l.gkh0;
import l.hfw;
import l.md1;
import l.s410;
import l.uep0;
import l.vdt;
import l.vwb;
import l.w9j;
import l.yi10;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class f110 extends C0303b {

    /* JADX INFO: renamed from: h */
    public final x010 f10085h;

    /* JADX INFO: renamed from: i */
    public MMLiveTranscoding f10086i;

    /* JADX INFO: renamed from: j */
    public MMLiveMediaConfig f10087j;

    /* JADX INFO: renamed from: k */
    public final int[] f10088k;

    /* JADX INFO: renamed from: l */
    public int f10089l;

    /* JADX INFO: renamed from: m */
    public final HashSet<Long> f10090m;

    /* JADX INFO: renamed from: n */
    public bj10 f10091n;

    /* JADX INFO: renamed from: o */
    public final Gson f10092o;

    /* JADX INFO: renamed from: p */
    public je10 f10093p;

    /* JADX INFO: renamed from: q */
    public String f10094q;

    public f110(x010 x010Var) {
        super(x010Var);
        this.f10088k = new int[]{540, 960};
        this.f10089l = 1200000;
        this.f10090m = new HashSet<>();
        this.f10093p = new je10("2x2");
        this.f10094q = "https://auto.tancdn.com/v1/images/eyJpZCI6IlpUQVIzWDRFWFhLUTRXQVdaSDI3QldDS0JWVlhMUTEyIiwidyI6Mzc1LCJoIjozNzUsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MTg0ODg4NjEwMzA5NDc0MDU1fQ.png";
        this.f10085h = x010Var;
        this.f10092o = new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public /* synthetic */ void m12884A1() {
        int[] iArr = this.f10088k;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: F1 */
    private void m12885F1(SurfaceView surfaceView, long j) {
        this.f10091n.m10379g(Long.valueOf(j), surfaceView);
        m12917w1(j);
    }

    /* JADX INFO: renamed from: x1 */
    private MMLiveTranscoding m12893x1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f10089l;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM5271V0 = m5271V0(ypv.a.D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.userid = ypv.a.D0();
        mMLiveTranscoding.mid = ypv.a.D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 3;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: y1 */
    private MMLiveMediaConfig m12894y1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f10089l = 1200000;
        cu00.m11349a(new d30() { // from class: l.b110
            public final void call() {
                this.f7947a.m12884A1();
            }
        }, new d30() { // from class: l.c110
            public final void call() {
                this.f8443a.m12897B1();
            }
        });
        int[] iArr = this.f10088k;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f10089l = i2;
            int[] iArr2 = this.f10088k;
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
                this.f10089l = i3;
                int[] iArr3 = this.f10088k;
                iArr3[0] = bLiveVideoQualityM22650a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM22650a1.pushHeight;
                i = bLiveVideoQualityM22650a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f10088k;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f10085h.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f10085h.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: z1 */
    public static C0303b m12895z1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR) {
            return null;
        }
        return new f110((x010) motionParams);
    }

    /* JADX INFO: renamed from: B0 */
    public void m12896B0() {
        super.B0();
        yi10.a("onRequestChannelKey");
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(1).m26426n(this.f10085h.f3830d));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m12897B1() {
        int[] iArr = this.f10088k;
        iArr[0] = 480;
        iArr[1] = 640;
    }

    /* JADX INFO: renamed from: C0 */
    public void m12898C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.C0(str, i, mMLivePushType);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(5));
        }
        hfw.a(s410.a, "onLocalLeaveChannel" + str);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ Integer m12899C1(Long l2) {
        if (NullChecker.a(this.f3836a)) {
            return Integer.valueOf(this.f3836a.mo11030a(y74.m26413a(4).m26428p(l2)).m26420h());
        }
        return -1;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m12900D1(Long l2) {
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = String.valueOf(l2);
        y74 y74VarMo11030a = this.f3836a.mo11030a(y74.m26413a(4).m26428p(l2));
        mMLiveLinkMember.isMuteAudio = y74VarMo11030a.m26421i();
        this.f10093p.m15876e(y74VarMo11030a.m26420h(), mMLiveLinkMember);
        if (TextUtils.equals(ypv.a.D0(), y74VarMo11030a.m26419g())) {
            this.f3840e.f17744c.m22645C((int) (uep0.p() * mMLiveLinkMember.w), (int) (uep0.p() * mMLiveLinkMember.h));
        }
        if (mMLiveLinkMember.w <= 0.0f || mMLiveLinkMember.h <= 0.0f) {
            return;
        }
        this.f10086i.infoMembers.add(mMLiveLinkMember);
        this.f10086i.confMembers.add(mMLiveLinkMember);
    }

    /* JADX INFO: renamed from: E1 */
    public final void m12901E1(long j) {
        m12902G1(j);
        this.f10091n.m10383k(j);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m12902G1(long j) {
        this.f10090m.remove(Long.valueOf(j));
        this.f10091n.m10383k(j);
        m12908K1();
    }

    /* JADX INFO: renamed from: H1 */
    public void m12903H1(String str) {
        hfw.a(s410.a, "anchor push setRestartWithURL:" + str);
        this.f3840e.f17745d.m14875h1(str);
    }

    /* JADX INFO: renamed from: I */
    public void m12904I(long j, boolean z) {
        super.I(j, z);
        yi10.a("onMemberAudioMuted" + j);
    }

    /* JADX INFO: renamed from: I0 */
    public void m12905I0(MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.I0(mMLivePushType);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(11));
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m12906I1(String str) {
        je10 je10Var = new je10(str);
        this.f10093p = je10Var;
        this.f10091n.m10384l(je10Var);
        m12908K1();
    }

    /* JADX INFO: renamed from: J1 */
    public void m12907J1(Integer num) {
        this.f3840e.f17745d.m14877j1(num.intValue());
    }

    /* JADX INFO: renamed from: K1 */
    public void m12908K1() {
        MMLiveTranscoding mMLiveTranscoding = this.f10086i;
        if (mMLiveTranscoding == null) {
            return;
        }
        mMLiveTranscoding.infoMembers.clear();
        this.f10086i.confMembers.clear();
        vwb.z(this.f10090m, new e30() { // from class: l.y010
            public final void call(Object obj) {
                this.f22559a.m12900D1((Long) obj);
            }
        });
        MMLiveTranscoding mMLiveTranscoding2 = this.f10086i;
        mMLiveTranscoding2.canvasWidth = 1080;
        mMLiveTranscoding2.canvasHeight = 1080;
        MMLiveMediaConfig mMLiveMediaConfig = this.f10087j;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 540;
        mMLiveTranscoding2.extString = "{\"mode\": " + this.f10093p.m15874c() + "}";
        MMLiveTranscoding mMLiveTranscoding3 = this.f10086i;
        mMLiveTranscoding3.ctyp = 3;
        if (mMLiveTranscoding3.infoMembers.size() > 4) {
            this.f10086i.shortSei = 1;
        }
        this.f3840e.f17745d.m14874g1(this.f10087j);
        this.f3840e.f17745d.m14873f1(this.f10086i);
        this.f10091n.mo10326b();
        this.f3840e.f17745d.m14878k1(this.f10094q);
        yi10.a("updateCanvasAndVideoResolution sei = " + this.f10092o.toJson(this.f10086i));
    }

    /* JADX INFO: renamed from: L1 */
    public void m12909L1(final String str, boolean z) {
        MMLiveTranscoding mMLiveTranscoding = this.f10086i;
        if (mMLiveTranscoding == null) {
            return;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = (MMLiveTranscoding.MMLiveLinkMember) vwb.r(mMLiveTranscoding.confMembers, new w9j() { // from class: l.d110
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember != null) {
            mMLiveLinkMember.isMuteAudio = z;
        }
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = (MMLiveTranscoding.MMLiveLinkMember) vwb.r(this.f10086i.infoMembers, new w9j() { // from class: l.e110
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((MMLiveTranscoding.MMLiveLinkMember) obj).userid, str));
            }
        });
        if (mMLiveLinkMember2 != null) {
            mMLiveLinkMember2.isMuteAudio = z;
        }
        this.f3840e.f17745d.m14873f1(this.f10086i);
    }

    /* JADX INFO: renamed from: S */
    public void m12910S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.S(mMLivePushType, i, i2);
        if (i2 == 1011) {
            return;
        }
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (i2 == 109) {
            interfaceC0911a.mo11030a(y74.m26413a(1).m26426n(this.f10085h.f3830d));
        } else {
            interfaceC0911a.mo11030a(y74.m26413a(7));
        }
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
        yi10.a("goToEnd");
        if (vdt.b(2)) {
            this.f3840e.f17745d.mo12833N(true);
            this.f3840e.f17745d.mo12841p(true);
            return;
        }
        gkh0.j("intl_rtc_up", "复用 rtc频道，VideoMute false ,audiomute false");
        this.f10086i = null;
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(5));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12911b(long j, int i) {
        super.b(j, i);
        yi10.a("onVideoChannelRemove uid:" + j + ",reason:" + i);
        m12902G1(j);
    }

    /* JADX INFO: renamed from: d0 */
    public void m12912d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.d0(str, j, mMLivePushType);
        m12917w1(j);
        yi10.a("onLocalJoinChannel result channel = " + str + " uid = " + j);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(6).m26428p(Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m12913e(long j, boolean z) {
        super.e(j, z);
        yi10.a("onMemberVideoMuted uid:" + j + ",muted:" + z);
    }

    /* JADX INFO: renamed from: e0 */
    public void m12914e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        yi10.a("onMemberJoinChannel" + j);
        super.e0(str, j, mMLivePushType);
        m12917w1(j);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(3).m26428p(Long.valueOf(j)));
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: e1 */
    public boolean mo5280e1() {
        return !vdt.b(2) && this.f10085h.f3831e && this.f3840e.f17745d.m14864W0();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTC;
    }

    /* JADX INFO: renamed from: l0 */
    public void m12915l0(md1[] md1VarArr) {
        super.l0(md1VarArr);
        if ((md1VarArr.length == 1 && md1VarArr[0].a() == 0) || this.f10086i == null) {
            return;
        }
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        vwb.A(md1VarArr, new e30() { // from class: l.z010
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.a()), Float.valueOf(md1Var.b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.mode = this.f10093p.m15874c();
        bLiveCallVolume.volumes = concurrentHashMap;
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(8).m26431s(bLiveCallVolume));
        }
        this.f10086i.extString = this.f10092o.toJson(bLiveCallVolume);
        this.f3840e.f17745d.m14873f1(this.f10086i);
    }

    /* JADX INFO: renamed from: o0 */
    public void m12916o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.o0(j, i, mMLivePushType);
        yi10.a("onMemberLeaveChannel" + j);
        m12901E1(j);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(2).m26428p(Long.valueOf(j)));
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        if (vdt.b(2)) {
            RtcEngine.destroy();
        }
        yi10.a("start motionParams" + this.f10085h.toString());
        bj10 bj10Var = new bj10(true, this.f10093p, new w9j() { // from class: l.a110
            public final Object call(Object obj) {
                return this.f7334a.m12899C1((Long) obj);
            }
        });
        this.f10091n = bj10Var;
        this.f3840e.f17749h.m14892d(bj10Var);
        x010 x010Var = this.f10085h;
        this.f10087j = m12894y1(x010Var.f23517l, x010Var.f23516k, x010Var.f23515j);
        this.f10086i = m12893x1(this.f10088k);
        this.f3840e.f17745d.m14876i1(m5272W0());
        this.f3840e.f17745d.mo12833N(!this.f10085h.f22059n);
        boolean zMo5280e1 = mo5280e1();
        q0f q0fVar = this.f3840e;
        if (zMo5280e1) {
            q0fVar.f17745d.m14873f1(this.f10086i);
            String strD0 = ypv.a.D0();
            m12917w1(Long.parseLong(strD0));
            y74.InterfaceC0911a interfaceC0911a = this.f3836a;
            if (interfaceC0911a != null) {
                interfaceC0911a.mo11030a(y74.m26413a(6).m26429q(strD0));
            }
            gkh0.j("intl_rtc_up", "多人连麦 ， 已经在rtc频道 ， 跳过 enterroom");
        } else {
            q0fVar.f17745d.m14862U0(this.f10087j, m5270U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f10086i);
        }
        this.f3840e.f17745d.m14861T0(1000, 3);
        int i = this.f10085h.f22060o;
        if (i == 0) {
            return 0;
        }
        this.f3840e.f17745d.m14877j1(i);
        return 0;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m12917w1(long j) {
        this.f10090m.add(Long.valueOf(j));
        m12908K1();
    }

    /* JADX INFO: renamed from: z0 */
    public void m12918z0(long j, SurfaceView surfaceView) {
        super.z0(j, surfaceView);
        m12885F1(surfaceView, j);
        if (this.f10086i == null) {
            return;
        }
        yi10.a("onVideoChannelAdded sei = " + this.f10092o.toJson(this.f10086i));
    }
}
