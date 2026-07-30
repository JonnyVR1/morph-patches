package p153l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.base.data.BLiveEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import io.agora.rtc2.RtcEngine;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class g04 extends C12877b {

    /* JADX INFO: renamed from: h */
    public String f101599h;

    /* JADX INFO: renamed from: i */
    public final i04 f101600i;

    /* JADX INFO: renamed from: j */
    public MMLiveTranscoding f101601j;

    /* JADX INFO: renamed from: k */
    public MMLiveMediaConfig f101602k;

    /* JADX INFO: renamed from: l */
    public int[] f101603l;

    /* JADX INFO: renamed from: m */
    public int f101604m;

    /* JADX INFO: renamed from: n */
    public HashMap<Long, Integer> f101605n;

    /* JADX INFO: renamed from: o */
    public j04 f101606o;

    /* JADX INFO: renamed from: p */
    public final Gson f101607p;

    public g04(i04 i04Var) {
        super(i04Var);
        this.f101599h = "[live]CallAnchorMotion";
        this.f101603l = new int[]{540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        this.f101604m = 1200000;
        this.f101605n = new HashMap<>();
        this.f101600i = i04Var;
        this.f101607p = new Gson();
    }

    /* JADX INFO: renamed from: F1 */
    private void m128384F1() {
        if (this.f101601j == null || this.f101605n.get(Long.valueOf(Long.parseLong(zrv.f205799a.m207631D0()))) == null) {
            return;
        }
        this.f101601j.infoMembers.clear();
        this.f101601j.confMembers.clear();
        final Map.Entry<Long, Integer> entry = (Map.Entry) jyb.m147529r(this.f101605n.entrySet(), new qcj() { // from class: l.d04
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) ((Map.Entry) obj).getValue()).intValue() == 2);
            }
        });
        jyb.m147537z(this.f101605n.entrySet(), new y20() { // from class: l.e04
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91408a.m128391A1(entry, (Map.Entry) obj);
            }
        });
        MMLiveTranscoding mMLiveTranscoding = this.f101601j;
        if (entry == null) {
            int[] iArr = this.f101603l;
            int i = iArr[0];
            mMLiveTranscoding.canvasWidth = i;
            int i2 = iArr[1];
            mMLiveTranscoding.canvasHeight = i2;
            MMLiveMediaConfig mMLiveMediaConfig = this.f101602k;
            mMLiveMediaConfig.encodeWidth = i;
            mMLiveMediaConfig.encodeHeight = i2;
        } else {
            mMLiveTranscoding.canvasWidth = 1080;
            mMLiveTranscoding.canvasHeight = 804;
            MMLiveMediaConfig mMLiveMediaConfig2 = this.f101602k;
            mMLiveMediaConfig2.encodeWidth = 540;
            mMLiveMediaConfig2.encodeHeight = 804;
        }
        this.f48646e.f176995d.m170528g1(this.f101602k);
        this.f48646e.f176995d.m170527f1(this.f101601j);
        this.f101606o.m142904m(entry);
        this.f101606o.mo100754b();
        g64.m129083d("updateCanvasAndVideoResolution sei = " + this.f101601j.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public static C12877b m128390x1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR) {
            return null;
        }
        return new g04((i04) motionParams);
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m128391A1(Map.Entry entry, Map.Entry entry2) {
        g04 g04Var;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = String.valueOf(entry2.getKey());
        int iIntValue = ((Integer) entry2.getValue()).intValue();
        if (iIntValue == 1) {
            g04Var = this;
            if (entry == null) {
                g04Var.m128395E1(mMLiveLinkMember, 1.0f, 1.0f, 0.0f, 0.0f);
            } else {
                g04Var.m128395E1(mMLiveLinkMember, 0.5f, 1.0f, 0.0f, 0.0f);
            }
        } else if (iIntValue == 2) {
            g04Var = this;
            g04Var.m128395E1(mMLiveLinkMember, 0.5f, 1.0f, 0.5f, 0.0f);
        } else if (iIntValue != 3) {
            g04Var = this;
        } else if (this.f101600i.f48636d.contains("tencent")) {
            g04Var = this;
            g04Var.m128395E1(mMLiveLinkMember, 0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            g04Var = this;
            g04Var.m128395E1(mMLiveLinkMember, 0.003f, 0.003f, 0.0f, 0.0f);
        }
        g04Var.f101601j.infoMembers.add(mMLiveLinkMember);
        g04Var.f101601j.confMembers.add(mMLiveLinkMember);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        this.f101600i.f112328m.call(6, this.f101600i.f48636d);
        g64.m129083d("onRequestChannelKey");
    }

    /* JADX INFO: renamed from: B1 */
    public final void m128392B1(SurfaceView surfaceView, long j) {
        j04 j04Var = this.f101606o;
        if (surfaceView != null) {
            j04Var.m142898f(surfaceView, j);
            m128396u1(j, true);
            this.f101600i.f112328m.call(4, Long.valueOf(j));
        } else if (j04Var.m142901j(j)) {
            m128396u1(j, true);
            this.f101600i.f112328m.call(4, Long.valueOf(j));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        g64.m129083d("onLocalLeaveChannel" + str);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m128393C1(long j) {
        m128394D1(j, true);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m128394D1(long j, boolean z) {
        if (TextUtils.equals(zrv.f205799a.m207631D0(), String.valueOf(j))) {
            this.f101605n.remove(Long.valueOf(j));
        } else if (z && this.f101605n.get(Long.valueOf(j)) != null) {
            this.f101605n.put(Long.valueOf(j), 3);
        } else if (this.f101605n.get(Long.valueOf(j)) != null) {
            this.f101605n.remove(Long.valueOf(j));
        }
        m128384F1();
    }

    /* JADX INFO: renamed from: E1 */
    public final void m128395E1(MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember, float f, float f2, float f3, float f4) {
        mMLiveLinkMember.f14656w = f;
        mMLiveLinkMember.f14655h = f2;
        mMLiveLinkMember.f14657x = f3;
        mMLiveLinkMember.f14658y = f4;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: I */
    public void mo120101I(long j, boolean z) {
        super.mo120101I(j, z);
        g64.m129083d("onMemberAudioMuted" + j);
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
        g64.m129083d("goToEnd");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        m128393C1(j);
        g64.m129083d("onVideoChannelRemove uid:" + j + ",reason:" + i);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        m128396u1(j, false);
        g64.m129083d("onLocalJoinChannel result channel = " + str + " uid = " + j);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e */
    public void mo120111e(long j, boolean z) {
        super.mo120111e(j, z);
        if (z) {
            m128393C1(j);
        } else {
            m128392B1(null, j);
        }
        g64.m129083d("onMemberVideoMuted uid:" + j + ",muted:" + z);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e0 */
    public void mo96687e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        g64.m129083d("onMemberJoinChannel" + j);
        super.mo96687e0(str, j, mMLivePushType);
        m128396u1(j, false);
        this.f101600i.f112328m.call(1, Long.valueOf(j));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo73088i1() {
        return MotionParams.MomoPushType.RTC;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: l0 */
    public void mo96688l0(td1[] td1VarArr) {
        super.mo96688l0(td1VarArr);
        if ((td1VarArr.length == 1 && td1VarArr[0].m190565a() == 0) || this.f101601j == null) {
            return;
        }
        final ConcurrentHashMap<String, Float> concurrentHashMap = new ConcurrentHashMap<>();
        jyb.m147470A(td1VarArr, new y20() { // from class: l.f04
            @Override // p153l.y20
            public final void call(Object obj) {
                td1 td1Var = (td1) obj;
                concurrentHashMap.put(String.valueOf(td1Var.m190565a()), Float.valueOf(td1Var.m190566b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        this.f101600i.f112328m.call(5, bLiveCallVolume);
        this.f101601j.extString = this.f101607p.toJson(bLiveCallVolume);
        this.f48646e.f176995d.m170527f1(this.f101601j);
        g64.m129083d("onAudioVolumeIndication" + this.f101607p.toJson(bLiveCallVolume));
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
        g64.m129083d("onMemberLeaveChannel" + j);
        m128394D1(j, false);
        this.f101600i.f112328m.call(2, Long.valueOf(j));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        if (wft.m206159b(2)) {
            RtcEngine.destroy();
        }
        g64.m129083d("start motionParams" + this.f101600i.toString());
        j04 j04Var = new j04();
        this.f101606o = j04Var;
        this.f48646e.f176999h.m179837d(j04Var);
        i04 i04Var = this.f101600i;
        this.f101602k = m128398w1(i04Var.f143915l, i04Var.f143914k, i04Var.f143913j);
        this.f101601j = m128397v1(this.f101603l);
        this.f48646e.f176995d.m170531i1(m73077W0());
        this.f48646e.f176995d.m170514U0(this.f101602k, m73075U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f101601j);
        this.f48646e.f176995d.m170513T0(1000, 3);
        return 0;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m128396u1(long j, boolean z) {
        if (TextUtils.equals(zrv.f205799a.m207631D0(), String.valueOf(j))) {
            this.f101605n.put(Long.valueOf(j), 1);
        } else {
            HashMap<Long, Integer> map = this.f101605n;
            if (z) {
                map.put(Long.valueOf(j), 2);
            } else {
                map.put(Long.valueOf(j), 3);
            }
        }
        m128384F1();
    }

    /* JADX INFO: renamed from: v1 */
    public final MMLiveTranscoding m128397v1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f101604m;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM73076V0 = m73076V0(zrv.f205799a.m207631D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM73076V0);
        mMLiveTranscoding.userid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.mid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 2;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: w1 */
    public final MMLiveMediaConfig m128398w1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f101604m = 1200000;
        l210.m152547a(new x20() { // from class: l.b04
            @Override // p153l.x20
            public final void call() {
                this.f74248a.m128399y1();
            }
        }, new x20() { // from class: l.c04
            @Override // p153l.x20
            public final void call() {
                this.f79203a.m128400z1();
            }
        });
        int[] iArr = this.f101603l;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m82486a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f101604m = i2;
            int[] iArr2 = this.f101603l;
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
                this.f101604m = i3;
                int[] iArr3 = this.f101603l;
                iArr3[0] = bLiveVideoQualityM101583a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM101583a1.pushHeight;
                i = bLiveVideoQualityM101583a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f101603l;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f101600i.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f101600i.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m128399y1() {
        int[] iArr = this.f101603l;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        m128392B1(surfaceView, j);
        g64.m129083d("onVideoChannelAdded sei = " + this.f101601j.toString());
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m128400z1() {
        int[] iArr = this.f101603l;
        iArr[0] = 480;
        iArr[1] = 640;
    }
}
