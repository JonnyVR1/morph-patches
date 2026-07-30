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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.d30;
import l.e30;
import l.h54;
import l.md1;
import l.vdt;
import l.vwb;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hz3 extends C0303b {

    /* JADX INFO: renamed from: h */
    public String f12368h;

    /* JADX INFO: renamed from: i */
    public final jz3 f12369i;

    /* JADX INFO: renamed from: j */
    public MMLiveTranscoding f12370j;

    /* JADX INFO: renamed from: k */
    public MMLiveMediaConfig f12371k;

    /* JADX INFO: renamed from: l */
    public int[] f12372l;

    /* JADX INFO: renamed from: m */
    public int f12373m;

    /* JADX INFO: renamed from: n */
    public HashMap<Long, Integer> f12374n;

    /* JADX INFO: renamed from: o */
    public kz3 f12375o;

    /* JADX INFO: renamed from: p */
    public final Gson f12376p;

    public hz3(jz3 jz3Var) {
        super(jz3Var);
        this.f12368h = "[live]CallAnchorMotion";
        this.f12372l = new int[]{540, 960};
        this.f12373m = 1200000;
        this.f12374n = new HashMap<>();
        this.f12369i = jz3Var;
        this.f12376p = new Gson();
    }

    /* JADX INFO: renamed from: F1 */
    private void m14938F1() {
        if (this.f12370j == null || this.f12374n.get(Long.valueOf(Long.parseLong(ypv.a.D0()))) == null) {
            return;
        }
        this.f12370j.infoMembers.clear();
        this.f12370j.confMembers.clear();
        final Map.Entry<Long, Integer> entry = (Map.Entry) vwb.r(this.f12374n.entrySet(), new w9j() { // from class: l.ez3
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) ((Map.Entry) obj).getValue()).intValue() == 2);
            }
        });
        vwb.z(this.f12374n.entrySet(), new e30() { // from class: l.fz3
            public final void call(Object obj) {
                this.f10691a.m14945A1(entry, (Map.Entry) obj);
            }
        });
        MMLiveTranscoding mMLiveTranscoding = this.f12370j;
        if (entry == null) {
            int[] iArr = this.f12372l;
            int i = iArr[0];
            mMLiveTranscoding.canvasWidth = i;
            int i2 = iArr[1];
            mMLiveTranscoding.canvasHeight = i2;
            MMLiveMediaConfig mMLiveMediaConfig = this.f12371k;
            mMLiveMediaConfig.encodeWidth = i;
            mMLiveMediaConfig.encodeHeight = i2;
        } else {
            mMLiveTranscoding.canvasWidth = 1080;
            mMLiveTranscoding.canvasHeight = 804;
            MMLiveMediaConfig mMLiveMediaConfig2 = this.f12371k;
            mMLiveMediaConfig2.encodeWidth = 540;
            mMLiveMediaConfig2.encodeHeight = 804;
        }
        this.f3840e.f17745d.m14874g1(this.f12371k);
        this.f3840e.f17745d.m14873f1(this.f12370j);
        this.f12375o.m16890m(entry);
        this.f12375o.mo10326b();
        h54.d("updateCanvasAndVideoResolution sei = " + this.f12370j.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public static C0303b m14944x1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR) {
            return null;
        }
        return new hz3((jz3) motionParams);
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m14945A1(Map.Entry entry, Map.Entry entry2) {
        hz3 hz3Var;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = String.valueOf(entry2.getKey());
        int iIntValue = ((Integer) entry2.getValue()).intValue();
        if (iIntValue == 1) {
            hz3Var = this;
            if (entry == null) {
                hz3Var.m14951E1(mMLiveLinkMember, 1.0f, 1.0f, 0.0f, 0.0f);
            } else {
                hz3Var.m14951E1(mMLiveLinkMember, 0.5f, 1.0f, 0.0f, 0.0f);
            }
        } else if (iIntValue == 2) {
            hz3Var = this;
            hz3Var.m14951E1(mMLiveLinkMember, 0.5f, 1.0f, 0.5f, 0.0f);
        } else if (iIntValue != 3) {
            hz3Var = this;
        } else if (this.f12369i.f3830d.contains("tencent")) {
            hz3Var = this;
            hz3Var.m14951E1(mMLiveLinkMember, 0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            hz3Var = this;
            hz3Var.m14951E1(mMLiveLinkMember, 0.003f, 0.003f, 0.0f, 0.0f);
        }
        hz3Var.f12370j.infoMembers.add(mMLiveLinkMember);
        hz3Var.f12370j.confMembers.add(mMLiveLinkMember);
    }

    /* JADX INFO: renamed from: B0 */
    public void m14946B0() {
        super.B0();
        this.f12369i.f14144m.call(6, this.f12369i.f3830d);
        h54.d("onRequestChannelKey");
    }

    /* JADX INFO: renamed from: B1 */
    public final void m14947B1(SurfaceView surfaceView, long j) {
        kz3 kz3Var = this.f12375o;
        if (surfaceView != null) {
            kz3Var.m16884f(surfaceView, j);
            m14959u1(j, true);
            this.f12369i.f14144m.call(4, Long.valueOf(j));
        } else if (kz3Var.m16887j(j)) {
            m14959u1(j, true);
            this.f12369i.f14144m.call(4, Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m14948C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.C0(str, i, mMLivePushType);
        h54.d("onLocalLeaveChannel" + str);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m14949C1(long j) {
        m14950D1(j, true);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m14950D1(long j, boolean z) {
        if (TextUtils.equals(ypv.a.D0(), String.valueOf(j))) {
            this.f12374n.remove(Long.valueOf(j));
        } else if (z && this.f12374n.get(Long.valueOf(j)) != null) {
            this.f12374n.put(Long.valueOf(j), 3);
        } else if (this.f12374n.get(Long.valueOf(j)) != null) {
            this.f12374n.remove(Long.valueOf(j));
        }
        m14938F1();
    }

    /* JADX INFO: renamed from: E1 */
    public final void m14951E1(MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember, float f, float f2, float f3, float f4) {
        mMLiveLinkMember.w = f;
        mMLiveLinkMember.h = f2;
        mMLiveLinkMember.x = f3;
        mMLiveLinkMember.y = f4;
    }

    /* JADX INFO: renamed from: I */
    public void m14952I(long j, boolean z) {
        super.I(j, z);
        h54.d("onMemberAudioMuted" + j);
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
        h54.d("goToEnd");
    }

    /* JADX INFO: renamed from: b */
    public void m14953b(long j, int i) {
        super.b(j, i);
        m14949C1(j);
        h54.d("onVideoChannelRemove uid:" + j + ",reason:" + i);
    }

    /* JADX INFO: renamed from: d0 */
    public void m14954d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.d0(str, j, mMLivePushType);
        m14959u1(j, false);
        h54.d("onLocalJoinChannel result channel = " + str + " uid = " + j);
    }

    /* JADX INFO: renamed from: e */
    public void m14955e(long j, boolean z) {
        super.e(j, z);
        if (z) {
            m14949C1(j);
        } else {
            m14947B1(null, j);
        }
        h54.d("onMemberVideoMuted uid:" + j + ",muted:" + z);
    }

    /* JADX INFO: renamed from: e0 */
    public void m14956e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        h54.d("onMemberJoinChannel" + j);
        super.e0(str, j, mMLivePushType);
        m14959u1(j, false);
        this.f12369i.f14144m.call(1, Long.valueOf(j));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTC;
    }

    /* JADX INFO: renamed from: l0 */
    public void m14957l0(md1[] md1VarArr) {
        super.l0(md1VarArr);
        if ((md1VarArr.length == 1 && md1VarArr[0].a() == 0) || this.f12370j == null) {
            return;
        }
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        vwb.A(md1VarArr, new e30() { // from class: l.gz3
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.a()), Float.valueOf(md1Var.b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        this.f12369i.f14144m.call(5, bLiveCallVolume);
        this.f12370j.extString = this.f12376p.toJson(bLiveCallVolume);
        this.f3840e.f17745d.m14873f1(this.f12370j);
        h54.d("onAudioVolumeIndication" + this.f12376p.toJson(bLiveCallVolume));
    }

    /* JADX INFO: renamed from: o0 */
    public void m14958o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.o0(j, i, mMLivePushType);
        h54.d("onMemberLeaveChannel" + j);
        m14950D1(j, false);
        this.f12369i.f14144m.call(2, Long.valueOf(j));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        if (vdt.b(2)) {
            RtcEngine.destroy();
        }
        h54.d("start motionParams" + this.f12369i.toString());
        kz3 kz3Var = new kz3();
        this.f12375o = kz3Var;
        this.f3840e.f17749h.m14892d(kz3Var);
        jz3 jz3Var = this.f12369i;
        this.f12371k = m14961w1(jz3Var.f23517l, jz3Var.f23516k, jz3Var.f23515j);
        this.f12370j = m14960v1(this.f12372l);
        this.f3840e.f17745d.m14876i1(m5272W0());
        this.f3840e.f17745d.m14862U0(this.f12371k, m5270U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f12370j);
        this.f3840e.f17745d.m14861T0(1000, 3);
        return 0;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m14959u1(long j, boolean z) {
        if (TextUtils.equals(ypv.a.D0(), String.valueOf(j))) {
            this.f12374n.put(Long.valueOf(j), 1);
        } else {
            HashMap<Long, Integer> map = this.f12374n;
            if (z) {
                map.put(Long.valueOf(j), 2);
            } else {
                map.put(Long.valueOf(j), 3);
            }
        }
        m14938F1();
    }

    /* JADX INFO: renamed from: v1 */
    public final MMLiveTranscoding m14960v1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f12373m;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM5271V0 = m5271V0(ypv.a.D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM5271V0);
        mMLiveTranscoding.userid = ypv.a.D0();
        mMLiveTranscoding.mid = ypv.a.D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 2;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: w1 */
    public final MMLiveMediaConfig m14961w1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f12373m = 1200000;
        cu00.m11349a(new d30() { // from class: l.cz3
            public final void call() {
                this.f8996a.m14962y1();
            }
        }, new d30() { // from class: l.dz3
            public final void call() {
                this.f9491a.m14964z1();
            }
        });
        int[] iArr = this.f12372l;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f12373m = i2;
            int[] iArr2 = this.f12372l;
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
                this.f12373m = i3;
                int[] iArr3 = this.f12372l;
                iArr3[0] = bLiveVideoQualityM22650a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM22650a1.pushHeight;
                i = bLiveVideoQualityM22650a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f12372l;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f12369i.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f12369i.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m14962y1() {
        int[] iArr = this.f12372l;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: z0 */
    public void m14963z0(long j, SurfaceView surfaceView) {
        super.z0(j, surfaceView);
        m14947B1(surfaceView, j);
        h54.d("onVideoChannelAdded sei = " + this.f12370j.toString());
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m14964z1() {
        int[] iArr = this.f12372l;
        iArr[0] = 480;
        iArr[1] = 640;
    }
}
