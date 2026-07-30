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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class hz3 extends C12714b {

    /* JADX INFO: renamed from: h */
    public String f110165h;

    /* JADX INFO: renamed from: i */
    public final jz3 f110166i;

    /* JADX INFO: renamed from: j */
    public MMLiveTranscoding f110167j;

    /* JADX INFO: renamed from: k */
    public MMLiveMediaConfig f110168k;

    /* JADX INFO: renamed from: l */
    public int[] f110169l;

    /* JADX INFO: renamed from: m */
    public int f110170m;

    /* JADX INFO: renamed from: n */
    public HashMap<Long, Integer> f110171n;

    /* JADX INFO: renamed from: o */
    public kz3 f110172o;

    /* JADX INFO: renamed from: p */
    public final Gson f110173p;

    public hz3(jz3 jz3Var) {
        super(jz3Var);
        this.f110165h = "[live]CallAnchorMotion";
        this.f110169l = new int[]{540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        this.f110170m = 1200000;
        this.f110171n = new HashMap<>();
        this.f110166i = jz3Var;
        this.f110173p = new Gson();
    }

    /* JADX INFO: renamed from: F1 */
    private void m133633F1() {
        if (this.f110167j == null || this.f110171n.get(Long.valueOf(Long.parseLong(ypv.f199493a.m199309D0()))) == null) {
            return;
        }
        this.f110167j.infoMembers.clear();
        this.f110167j.confMembers.clear();
        final Map.Entry<Long, Integer> entry = (Map.Entry) vwb.m200346r(this.f110171n.entrySet(), new w9j() { // from class: l.ez3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) ((Map.Entry) obj).getValue()).intValue() == 2);
            }
        });
        vwb.m200354z(this.f110171n.entrySet(), new e30() { // from class: l.fz3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99927a.m133640A1(entry, (Map.Entry) obj);
            }
        });
        MMLiveTranscoding mMLiveTranscoding = this.f110167j;
        if (entry == null) {
            int[] iArr = this.f110169l;
            int i = iArr[0];
            mMLiveTranscoding.canvasWidth = i;
            int i2 = iArr[1];
            mMLiveTranscoding.canvasHeight = i2;
            MMLiveMediaConfig mMLiveMediaConfig = this.f110168k;
            mMLiveMediaConfig.encodeWidth = i;
            mMLiveMediaConfig.encodeHeight = i2;
        } else {
            mMLiveTranscoding.canvasWidth = 1080;
            mMLiveTranscoding.canvasHeight = 804;
            MMLiveMediaConfig mMLiveMediaConfig2 = this.f110168k;
            mMLiveMediaConfig2.encodeWidth = 540;
            mMLiveMediaConfig2.encodeHeight = 804;
        }
        this.f47798e.f152052d.m133223g1(this.f110168k);
        this.f47798e.f152052d.m133222f1(this.f110167j);
        this.f110172o.m147935m(entry);
        this.f110172o.mo101817b();
        h54.m129377d("updateCanvasAndVideoResolution sei = " + this.f110167j.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public static C12714b m133639x1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR) {
            return null;
        }
        return new hz3((jz3) motionParams);
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m133640A1(Map.Entry entry, Map.Entry entry2) {
        hz3 hz3Var;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = String.valueOf(entry2.getKey());
        int iIntValue = ((Integer) entry2.getValue()).intValue();
        if (iIntValue == 1) {
            hz3Var = this;
            if (entry == null) {
                hz3Var.m133644E1(mMLiveLinkMember, 1.0f, 1.0f, 0.0f, 0.0f);
            } else {
                hz3Var.m133644E1(mMLiveLinkMember, 0.5f, 1.0f, 0.0f, 0.0f);
            }
        } else if (iIntValue == 2) {
            hz3Var = this;
            hz3Var.m133644E1(mMLiveLinkMember, 0.5f, 1.0f, 0.5f, 0.0f);
        } else if (iIntValue != 3) {
            hz3Var = this;
        } else if (this.f110166i.f47788d.contains("tencent")) {
            hz3Var = this;
            hz3Var.m133644E1(mMLiveLinkMember, 0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            hz3Var = this;
            hz3Var.m133644E1(mMLiveLinkMember, 0.003f, 0.003f, 0.0f, 0.0f);
        }
        hz3Var.f110167j.infoMembers.add(mMLiveLinkMember);
        hz3Var.f110167j.confMembers.add(mMLiveLinkMember);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        this.f110166i.f120348m.call(6, this.f110166i.f47788d);
        h54.m129377d("onRequestChannelKey");
    }

    /* JADX INFO: renamed from: B1 */
    public final void m133641B1(SurfaceView surfaceView, long j) {
        kz3 kz3Var = this.f110172o;
        if (surfaceView != null) {
            kz3Var.m147929f(surfaceView, j);
            m133645u1(j, true);
            this.f110166i.f120348m.call(4, Long.valueOf(j));
        } else if (kz3Var.m147932j(j)) {
            m133645u1(j, true);
            this.f110166i.f120348m.call(4, Long.valueOf(j));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        h54.m129377d("onLocalLeaveChannel" + str);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m133642C1(long j) {
        m133643D1(j, true);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m133643D1(long j, boolean z) {
        if (TextUtils.equals(ypv.f199493a.m199309D0(), String.valueOf(j))) {
            this.f110171n.remove(Long.valueOf(j));
        } else if (z && this.f110171n.get(Long.valueOf(j)) != null) {
            this.f110171n.put(Long.valueOf(j), 3);
        } else if (this.f110171n.get(Long.valueOf(j)) != null) {
            this.f110171n.remove(Long.valueOf(j));
        }
        m133633F1();
    }

    /* JADX INFO: renamed from: E1 */
    public final void m133644E1(MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember, float f, float f2, float f3, float f4) {
        mMLiveLinkMember.f13962w = f;
        mMLiveLinkMember.f13961h = f2;
        mMLiveLinkMember.f13963x = f3;
        mMLiveLinkMember.f13964y = f4;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: I */
    public void mo110343I(long j, boolean z) {
        super.mo110343I(j, z);
        h54.m129377d("onMemberAudioMuted" + j);
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
        h54.m129377d("goToEnd");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        m133642C1(j);
        h54.m129377d("onVideoChannelRemove uid:" + j + ",reason:" + i);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        m133645u1(j, false);
        h54.m129377d("onLocalJoinChannel result channel = " + str + " uid = " + j);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e */
    public void mo110357e(long j, boolean z) {
        super.mo110357e(j, z);
        if (z) {
            m133642C1(j);
        } else {
            m133641B1(null, j);
        }
        h54.m129377d("onMemberVideoMuted uid:" + j + ",muted:" + z);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e0 */
    public void mo110358e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        h54.m129377d("onMemberJoinChannel" + j);
        super.mo110358e0(str, j, mMLivePushType);
        m133645u1(j, false);
        this.f110166i.f120348m.call(1, Long.valueOf(j));
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
        if ((md1VarArr.length == 1 && md1VarArr[0].m154034a() == 0) || this.f110167j == null) {
            return;
        }
        final ConcurrentHashMap<String, Float> concurrentHashMap = new ConcurrentHashMap<>();
        vwb.m200287A(md1VarArr, new e30() { // from class: l.gz3
            @Override // p149l.e30
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.m154034a()), Float.valueOf(md1Var.m154035b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        this.f110166i.f120348m.call(5, bLiveCallVolume);
        this.f110167j.extString = this.f110173p.toJson(bLiveCallVolume);
        this.f47798e.f152052d.m133222f1(this.f110167j);
        h54.m129377d("onAudioVolumeIndication" + this.f110173p.toJson(bLiveCallVolume));
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
        h54.m129377d("onMemberLeaveChannel" + j);
        m133643D1(j, false);
        this.f110166i.f120348m.call(2, Long.valueOf(j));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        if (vdt.m198092b(2)) {
            RtcEngine.destroy();
        }
        h54.m129377d("start motionParams" + this.f110166i.toString());
        kz3 kz3Var = new kz3();
        this.f110172o = kz3Var;
        this.f47798e.f152056h.m133285d(kz3Var);
        jz3 jz3Var = this.f110166i;
        this.f110168k = m133647w1(jz3Var.f203960l, jz3Var.f203959k, jz3Var.f203958j);
        this.f110167j = m133646v1(this.f110169l);
        this.f47798e.f152052d.m133225i1(m71894W0());
        this.f47798e.f152052d.m133211U0(this.f110168k, m71892U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, true), this.f110167j);
        this.f47798e.f152052d.m133210T0(1000, 3);
        return 0;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m133645u1(long j, boolean z) {
        if (TextUtils.equals(ypv.f199493a.m199309D0(), String.valueOf(j))) {
            this.f110171n.put(Long.valueOf(j), 1);
        } else {
            HashMap<Long, Integer> map = this.f110171n;
            if (z) {
                map.put(Long.valueOf(j), 2);
            } else {
                map.put(Long.valueOf(j), 3);
            }
        }
        m133633F1();
    }

    /* JADX INFO: renamed from: v1 */
    public final MMLiveTranscoding m133646v1(int[] iArr) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = iArr[0];
        mMLiveTranscoding.canvasHeight = iArr[1];
        mMLiveTranscoding.videoBitrate = this.f110170m;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMemberM71893V0 = m71893V0(ypv.f199493a.m199309D0(), 1.0f, 1.0f, 0.0f, 0.0f);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMemberM71893V0);
        mMLiveTranscoding.userid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.mid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.inv = String.valueOf(System.currentTimeMillis());
        mMLiveTranscoding.ctyp = 2;
        return mMLiveTranscoding;
    }

    /* JADX INFO: renamed from: w1 */
    public final MMLiveMediaConfig m133647w1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 20;
        this.f110170m = 1200000;
        cu00.m108718a(new d30() { // from class: l.cz3
            @Override // p149l.d30
            public final void call() {
                this.f83055a.m133648y1();
            }
        }, new d30() { // from class: l.dz3
            @Override // p149l.d30
            public final void call() {
                this.f88447a.m133649z1();
            }
        });
        int[] iArr = this.f110169l;
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m81303a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            mMLiveMediaConfig.videoFPS = bLiveEncode.fps;
            int i2 = bLiveEncode.bitRate;
            mMLiveMediaConfig.videoBitRate = i2;
            this.f110170m = i2;
            int[] iArr2 = this.f110169l;
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
                this.f110170m = i3;
                int[] iArr3 = this.f110169l;
                iArr3[0] = bLiveVideoQualityM185820a1.pushWidth;
                iArr3[1] = bLiveVideoQualityM185820a1.pushHeight;
                i = bLiveVideoQualityM185820a1.videoCodecType;
            }
        }
        int[] iArr4 = this.f110169l;
        mMLiveMediaConfig.encodeWidth = iArr4[0];
        mMLiveMediaConfig.encodeHeight = iArr4[1];
        mMLiveMediaConfig.videoCodecType = i;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f110166i.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f110166i.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m133648y1() {
        int[] iArr = this.f110169l;
        iArr[0] = 540;
        iArr[1] = 960;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        m133641B1(surfaceView, j);
        h54.m129377d("onVideoChannelAdded sei = " + this.f110167j.toString());
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m133649z1() {
        int[] iArr = this.f110169l;
        iArr[0] = 480;
        iArr[1] = 640;
    }
}
