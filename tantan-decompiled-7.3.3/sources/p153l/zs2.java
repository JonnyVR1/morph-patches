package p153l;

import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class zs2 extends C12877b {

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, Float> f205839h;

    /* JADX INFO: renamed from: i */
    public BLiveCallVolume f205840i;

    /* JADX INFO: renamed from: j */
    public at2 f205841j;

    /* JADX INFO: renamed from: k */
    public long f205842k;

    public zs2(at2 at2Var) {
        super(at2Var);
        this.f205839h = new ConcurrentHashMap<>();
        this.f205840i = new BLiveCallVolume();
        this.f205842k = 0L;
        this.f205841j = at2Var;
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m221299q1(MMLiveMediaConfig mMLiveMediaConfig) {
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m221301s1(MMLiveMediaConfig mMLiveMediaConfig) {
        mMLiveMediaConfig.encodeWidth = 480;
        mMLiveMediaConfig.encodeHeight = 640;
    }

    /* JADX INFO: renamed from: t1 */
    private MMLiveMediaConfig m221302t1() {
        final MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 48000;
        mMLiveMediaConfig.url = this.f205841j.f73204m;
        if (wft.m206159b(3)) {
            mMLiveMediaConfig.videoBitRate = 1200000;
            l210.m152547a(new x20() { // from class: l.xs2
                @Override // p153l.x20
                public final void call() {
                    zs2.m221299q1(mMLiveMediaConfig);
                }
            }, new x20() { // from class: l.ys2
                @Override // p153l.x20
                public final void call() {
                    zs2.m221301s1(mMLiveMediaConfig);
                }
            });
        }
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f205841j.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f205841j.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: v1 */
    public static String m221303v1() {
        return zrv.f205803e.getFilesDir().getAbsolutePath() + File.separator + "preset";
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: A0 */
    public void mo105805A0(MMLiveTranscoding mMLiveTranscoding) {
        super.mo105805A0(mMLiveTranscoding);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        nsh0.m164608j("[voice][call]", "onTokenPrivilegeWillExpire:");
        this.f205841j.f73203l.call(2, this.f205841j.f48636d);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        nsh0.m164608j("[voice][call]", "onLocalLeaveChannel uid:" + str);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: S */
    public void mo96683S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo96683S(mMLivePushType, i, i2);
        nsh0.m164608j("[voice][call]", "onEngineError LivePushType " + mMLivePushType + ", error id " + i + ", extra " + i2);
        if (i2 == 1011) {
            return;
        }
        at2 at2Var = this.f205841j;
        if (i2 == 109) {
            at2Var.f73203l.call(2, this.f205841j.f48636d);
        } else {
            at2Var.f73203l.call(4, new Object());
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
        m73079Y0();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: Z */
    public void mo120110Z() {
        super.mo120110Z();
        nsh0.m164608j("[live][voice][sing-together]", " song start, call back is  null");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        nsh0.m164608j("[voice][call]", "onVideoChannelRemove uid" + j + " reason:" + i);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        this.f205841j.f73203l.call(3, Long.valueOf(j));
        nsh0.m164608j("[voice][call]", "onLocalJoinChannel");
        if (wft.m206159b(3)) {
            this.f48646e.f176995d.m170524c1(false);
        } else {
            j5t.m143593c(String.valueOf(System.currentTimeMillis() - this.f205842k), "enterRoomUntilLocalSuccess", "voice", this instanceof klm0, false);
        }
        lej0.INSTANCE.m153907a("voice_anchor_call", "onLocalJoinChannel");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e */
    public void mo120111e(long j, boolean z) {
        super.mo120111e(j, z);
        nsh0.m164608j("[voice][call]", "onMemberVideoMuted，uid:" + j + "，muted：" + z);
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
        if (td1VarArr.length == 1 && td1VarArr[0].m190565a() == 0) {
            return;
        }
        this.f205839h.clear();
        jyb.m147470A(td1VarArr, new y20() { // from class: l.vs2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185550a.m221305w1((td1) obj);
            }
        });
        this.f205840i.volumes = this.f205839h;
        this.f205841j.f73203l.call(1, this.f205840i);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: m1 */
    public void mo73092m1(z20<Integer, Object> z20Var) {
        super.mo73092m1(z20Var);
        if (z20Var != null) {
            this.f205841j.f73203l = z20Var;
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
        nsh0.m164608j("[voice][call]", "onMemberLeaveChannel uid:" + j);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        this.f48646e.f176995d.mo170509N(true);
        this.f48646e.f176995d.m170526e1(true);
        this.f48646e.f176995d.m170531i1(m73077W0());
        if (this.f205841j.f48636d.contains("volcengine")) {
            m221307y1();
        }
        if (wft.m206159b(3)) {
            this.f48646e.f176995d.m170514U0(m221302t1(), m73075U0(m221304u1(this.f205841j.f73205n), false), new MMLiveTranscoding());
        } else {
            this.f205842k = System.currentTimeMillis();
            j5t.m143591a(new x20() { // from class: l.ws2
                @Override // p153l.x20
                public final void call() {
                    this.f190590a.m221306x1();
                }
            }, "enterRoom", "voice", this instanceof klm0, false);
        }
        boolean zM206159b = wft.m206159b(3);
        u1f u1fVar = this.f48646e;
        if (zM206159b) {
            u1fVar.f176995d.m170513T0(400, 3);
        } else {
            u1fVar.f176995d.m170513T0(1000, 3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u1 */
    public MMLiveRoomParams.MMLiveClientRole m221304u1(boolean z) {
        MMLiveRoomParams.MMLiveClientRole mMLiveClientRole = z ? MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster : MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience;
        nsh0.m164608j("[voice][call]", "getRole" + mMLiveClientRole.toString());
        return mMLiveClientRole;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m221305w1(td1 td1Var) {
        this.f205839h.put(String.valueOf(td1Var.m190565a()), Float.valueOf(td1Var.m190566b()));
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: x0 */
    public void mo105807x0(long j, int i, int i2) {
        super.mo105807x0(j, i, i2);
        nsh0.m164608j("[voice][call]", "onReceivedFirstVideoFrame,uid:" + j + "width:" + i + ",height:" + i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m221306x1() {
        this.f48646e.f176995d.m170514U0(m221302t1(), m73075U0(m221304u1(this.f205841j.f73205n), false), new MMLiveTranscoding());
    }

    /* JADX INFO: renamed from: y1 */
    public final void m221307y1() {
        try {
            File file = new File(m221303v1());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtc.sami_app_key", this.f205841j.f73201j);
            jSONObject.put("rtc.sami_token", this.f205841j.f73202k);
            String absolutePath = file.getAbsolutePath();
            file.exists();
            jSONObject.put("rtc.sami_resource_path", absolutePath);
            this.f48646e.f176996e.m73054d1(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        nsh0.m164608j("[voice][call]", "onVideoChannelAdded,width:uid:" + j);
    }

    /* JADX INFO: renamed from: z1 */
    public void m221308z1(boolean z) {
        this.f48646e.f176995d.m170525d1(m221304u1(z));
    }
}
