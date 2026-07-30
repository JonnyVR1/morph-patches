package p149l;

import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class js2 extends C12714b {

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, Float> f119470h;

    /* JADX INFO: renamed from: i */
    public BLiveCallVolume f119471i;

    /* JADX INFO: renamed from: j */
    public ks2 f119472j;

    /* JADX INFO: renamed from: k */
    public long f119473k;

    public js2(ks2 ks2Var) {
        super(ks2Var);
        this.f119470h = new ConcurrentHashMap<>();
        this.f119471i = new BLiveCallVolume();
        this.f119473k = 0L;
        this.f119472j = ks2Var;
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m142982q1(MMLiveMediaConfig mMLiveMediaConfig) {
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m142984s1(MMLiveMediaConfig mMLiveMediaConfig) {
        mMLiveMediaConfig.encodeWidth = 480;
        mMLiveMediaConfig.encodeHeight = 640;
    }

    /* JADX INFO: renamed from: t1 */
    private MMLiveMediaConfig m142985t1() {
        final MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 48000;
        mMLiveMediaConfig.url = this.f119472j.f124414m;
        if (vdt.m198092b(3)) {
            mMLiveMediaConfig.videoBitRate = 1200000;
            cu00.m108718a(new d30() { // from class: l.hs2
                @Override // p149l.d30
                public final void call() {
                    js2.m142982q1(mMLiveMediaConfig);
                }
            }, new d30() { // from class: l.is2
                @Override // p149l.d30
                public final void call() {
                    js2.m142984s1(mMLiveMediaConfig);
                }
            });
        }
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f119472j.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f119472j.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: v1 */
    public static String m142986v1() {
        return ypv.f199497e.getFilesDir().getAbsolutePath() + File.separator + "preset";
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: A0 */
    public void mo110340A0(MMLiveTranscoding mMLiveTranscoding) {
        super.mo110340A0(mMLiveTranscoding);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        gkh0.m126627j("[voice][call]", "onTokenPrivilegeWillExpire:");
        this.f119472j.f124413l.call(2, this.f119472j.f47788d);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        gkh0.m126627j("[voice][call]", "onLocalLeaveChannel uid:" + str);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: S */
    public void mo110350S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo110350S(mMLivePushType, i, i2);
        gkh0.m126627j("[voice][call]", "onEngineError LivePushType " + mMLivePushType + ", error id " + i + ", extra " + i2);
        if (i2 == 1011) {
            return;
        }
        ks2 ks2Var = this.f119472j;
        if (i2 == 109) {
            ks2Var.f124413l.call(2, this.f119472j.f47788d);
        } else {
            ks2Var.f124413l.call(4, new Object());
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        super.mo71895X0();
        m71896Y0();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: Z */
    public void mo110354Z() {
        super.mo110354Z();
        gkh0.m126627j("[live][voice][sing-together]", " song start, call back is  null");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        gkh0.m126627j("[voice][call]", "onVideoChannelRemove uid" + j + " reason:" + i);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        this.f119472j.f124413l.call(3, Long.valueOf(j));
        gkh0.m126627j("[voice][call]", "onLocalJoinChannel");
        if (vdt.m198092b(3)) {
            this.f47798e.f152052d.m133219c1(false);
        } else {
            i3t.m134301c(String.valueOf(System.currentTimeMillis() - this.f119473k), "enterRoomUntilLocalSuccess", "voice", this instanceof gcm0, false);
        }
        h5j0.INSTANCE.m129402a("voice_anchor_call", "onLocalJoinChannel");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e */
    public void mo110357e(long j, boolean z) {
        super.mo110357e(j, z);
        gkh0.m126627j("[voice][call]", "onMemberVideoMuted，uid:" + j + "，muted：" + z);
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
        if (md1VarArr.length == 1 && md1VarArr[0].m154034a() == 0) {
            return;
        }
        this.f119470h.clear();
        vwb.m200287A(md1VarArr, new e30() { // from class: l.fs2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99027a.m142988w1((md1) obj);
            }
        });
        this.f119471i.volumes = this.f119470h;
        this.f119472j.f124413l.call(1, this.f119471i);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: m1 */
    public void mo71909m1(f30<Integer, Object> f30Var) {
        super.mo71909m1(f30Var);
        if (f30Var != null) {
            this.f119472j.f124413l = f30Var;
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
        gkh0.m126627j("[voice][call]", "onMemberLeaveChannel uid:" + j);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        this.f47798e.f152052d.mo118673N(true);
        this.f47798e.f152052d.m133221e1(true);
        this.f47798e.f152052d.m133225i1(m71894W0());
        if (this.f119472j.f47788d.contains("volcengine")) {
            m142990y1();
        }
        if (vdt.m198092b(3)) {
            this.f47798e.f152052d.m133211U0(m142985t1(), m71892U0(m142987u1(this.f119472j.f124415n), false), new MMLiveTranscoding());
        } else {
            this.f119473k = System.currentTimeMillis();
            i3t.m134299a(new d30() { // from class: l.gs2
                @Override // p149l.d30
                public final void call() {
                    this.f104134a.m142989x1();
                }
            }, "enterRoom", "voice", this instanceof gcm0, false);
        }
        boolean zM198092b = vdt.m198092b(3);
        q0f q0fVar = this.f47798e;
        if (zM198092b) {
            q0fVar.f152052d.m133210T0(400, 3);
        } else {
            q0fVar.f152052d.m133210T0(1000, 3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u1 */
    public MMLiveRoomParams.MMLiveClientRole m142987u1(boolean z) {
        MMLiveRoomParams.MMLiveClientRole mMLiveClientRole = z ? MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster : MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience;
        gkh0.m126627j("[voice][call]", "getRole" + mMLiveClientRole.toString());
        return mMLiveClientRole;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m142988w1(md1 md1Var) {
        this.f119470h.put(String.valueOf(md1Var.m154034a()), Float.valueOf(md1Var.m154035b()));
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: x0 */
    public void mo110365x0(long j, int i, int i2) {
        super.mo110365x0(j, i, i2);
        gkh0.m126627j("[voice][call]", "onReceivedFirstVideoFrame,uid:" + j + "width:" + i + ",height:" + i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m142989x1() {
        this.f47798e.f152052d.m133211U0(m142985t1(), m71892U0(m142987u1(this.f119472j.f124415n), false), new MMLiveTranscoding());
    }

    /* JADX INFO: renamed from: y1 */
    public final void m142990y1() {
        try {
            File file = new File(m142986v1());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtc.sami_app_key", this.f119472j.f124411j);
            jSONObject.put("rtc.sami_token", this.f119472j.f124412k);
            String absolutePath = file.getAbsolutePath();
            file.exists();
            jSONObject.put("rtc.sami_resource_path", absolutePath);
            this.f47798e.f152053e.m71871d1(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        gkh0.m126627j("[voice][call]", "onVideoChannelAdded,width:uid:" + j);
    }

    /* JADX INFO: renamed from: z1 */
    public void m142991z1(boolean z) {
        this.f47798e.f152052d.m133220d1(m142987u1(z));
    }
}
