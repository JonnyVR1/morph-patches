package p002l;

import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import l.d30;
import l.e30;
import l.f30;
import l.gkh0;
import l.h5j0;
import l.i3t;
import l.md1;
import l.vdt;
import l.vwb;
import l.ypv;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class js2 extends C0303b {

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap<String, Float> f13994h;

    /* JADX INFO: renamed from: i */
    public BLiveCallVolume f13995i;

    /* JADX INFO: renamed from: j */
    public ks2 f13996j;

    /* JADX INFO: renamed from: k */
    public long f13997k;

    public js2(ks2 ks2Var) {
        super(ks2Var);
        this.f13994h = new ConcurrentHashMap<>();
        this.f13995i = new BLiveCallVolume();
        this.f13997k = 0L;
        this.f13996j = ks2Var;
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m16189q1(MMLiveMediaConfig mMLiveMediaConfig) {
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 960;
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m16191s1(MMLiveMediaConfig mMLiveMediaConfig) {
        mMLiveMediaConfig.encodeWidth = 480;
        mMLiveMediaConfig.encodeHeight = 640;
    }

    /* JADX INFO: renamed from: t1 */
    private MMLiveMediaConfig m16192t1() {
        final MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 48000;
        mMLiveMediaConfig.url = this.f13996j.f14492m;
        if (vdt.b(3)) {
            mMLiveMediaConfig.videoBitRate = 1200000;
            cu00.m11349a(new d30() { // from class: l.hs2
                public final void call() {
                    js2.m16189q1(mMLiveMediaConfig);
                }
            }, new d30() { // from class: l.is2
                public final void call() {
                    js2.m16191s1(mMLiveMediaConfig);
                }
            });
        }
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f13996j.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f13996j.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: v1 */
    public static String m16193v1() {
        return ypv.e.getFilesDir().getAbsolutePath() + File.separator + "preset";
    }

    /* JADX INFO: renamed from: A0 */
    public void m16194A0(MMLiveTranscoding mMLiveTranscoding) {
        super.A0(mMLiveTranscoding);
    }

    /* JADX INFO: renamed from: B0 */
    public void m16195B0() {
        super.B0();
        gkh0.j("[voice][call]", "onTokenPrivilegeWillExpire:");
        this.f13996j.f14491l.call(2, this.f13996j.f3830d);
    }

    /* JADX INFO: renamed from: C0 */
    public void m16196C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.C0(str, i, mMLivePushType);
        gkh0.j("[voice][call]", "onLocalLeaveChannel uid:" + str);
    }

    /* JADX INFO: renamed from: S */
    public void m16197S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.S(mMLivePushType, i, i2);
        gkh0.j("[voice][call]", "onEngineError LivePushType " + mMLivePushType + ", error id " + i + ", extra " + i2);
        if (i2 == 1011) {
            return;
        }
        ks2 ks2Var = this.f13996j;
        if (i2 == 109) {
            ks2Var.f14491l.call(2, this.f13996j.f3830d);
        } else {
            ks2Var.f14491l.call(4, new Object());
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        super.mo5273X0();
        m5274Y0();
    }

    /* JADX INFO: renamed from: Z */
    public void m16198Z() {
        super.Z();
        gkh0.j("[live][voice][sing-together]", " song start, call back is  null");
    }

    /* JADX INFO: renamed from: b */
    public void m16199b(long j, int i) {
        super.b(j, i);
        gkh0.j("[voice][call]", "onVideoChannelRemove uid" + j + " reason:" + i);
    }

    /* JADX INFO: renamed from: d0 */
    public void m16200d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.d0(str, j, mMLivePushType);
        this.f13996j.f14491l.call(3, Long.valueOf(j));
        gkh0.j("[voice][call]", "onLocalJoinChannel");
        if (vdt.b(3)) {
            this.f3840e.f17745d.m14870c1(false);
        } else {
            i3t.c(String.valueOf(System.currentTimeMillis() - this.f13997k), "enterRoomUntilLocalSuccess", "voice", this instanceof gcm0, false);
        }
        h5j0.INSTANCE.a("voice_anchor_call", "onLocalJoinChannel");
    }

    /* JADX INFO: renamed from: e */
    public void m16201e(long j, boolean z) {
        super.e(j, z);
        gkh0.j("[voice][call]", "onMemberVideoMuted，uid:" + j + "，muted：" + z);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTC;
    }

    /* JADX INFO: renamed from: l0 */
    public void m16202l0(md1[] md1VarArr) {
        super.l0(md1VarArr);
        if (md1VarArr.length == 1 && md1VarArr[0].a() == 0) {
            return;
        }
        this.f13994h.clear();
        vwb.A(md1VarArr, new e30() { // from class: l.fs2
            public final void call(Object obj) {
                this.f10615a.m16205w1((md1) obj);
            }
        });
        this.f13995i.volumes = this.f13994h;
        this.f13996j.f14491l.call(1, this.f13995i);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: m1 */
    public void mo5288m1(f30<Integer, Object> f30Var) {
        super.mo5288m1(f30Var);
        if (f30Var != null) {
            this.f13996j.f14491l = f30Var;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m16203o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.o0(j, i, mMLivePushType);
        gkh0.j("[voice][call]", "onMemberLeaveChannel uid:" + j);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        this.f3840e.f17745d.mo12833N(true);
        this.f3840e.f17745d.m14872e1(true);
        this.f3840e.f17745d.m14876i1(m5272W0());
        if (this.f13996j.f3830d.contains("volcengine")) {
            m16208y1();
        }
        if (vdt.b(3)) {
            this.f3840e.f17745d.m14862U0(m16192t1(), m5270U0(m16204u1(this.f13996j.f14493n), false), new MMLiveTranscoding());
        } else {
            this.f13997k = System.currentTimeMillis();
            i3t.a(new d30() { // from class: l.gs2
                public final void call() {
                    this.f11603a.m16207x1();
                }
            }, "enterRoom", "voice", this instanceof gcm0, false);
        }
        boolean zB = vdt.b(3);
        q0f q0fVar = this.f3840e;
        if (zB) {
            q0fVar.f17745d.m14861T0(400, 3);
        } else {
            q0fVar.f17745d.m14861T0(1000, 3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u1 */
    public MMLiveRoomParams.MMLiveClientRole m16204u1(boolean z) {
        MMLiveRoomParams.MMLiveClientRole mMLiveClientRole = z ? MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster : MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleAudience;
        gkh0.j("[voice][call]", "getRole" + mMLiveClientRole.toString());
        return mMLiveClientRole;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m16205w1(md1 md1Var) {
        this.f13994h.put(String.valueOf(md1Var.a()), Float.valueOf(md1Var.b()));
    }

    /* JADX INFO: renamed from: x0 */
    public void m16206x0(long j, int i, int i2) {
        super.x0(j, i, i2);
        gkh0.j("[voice][call]", "onReceivedFirstVideoFrame,uid:" + j + "width:" + i + ",height:" + i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m16207x1() {
        this.f3840e.f17745d.m14862U0(m16192t1(), m5270U0(m16204u1(this.f13996j.f14493n), false), new MMLiveTranscoding());
    }

    /* JADX INFO: renamed from: y1 */
    public final void m16208y1() {
        try {
            File file = new File(m16193v1());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtc.sami_app_key", this.f13996j.f14489j);
            jSONObject.put("rtc.sami_token", this.f13996j.f14490k);
            String absolutePath = file.getAbsolutePath();
            file.exists();
            jSONObject.put("rtc.sami_resource_path", absolutePath);
            this.f3840e.f17746e.m5249d1(jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m16209z0(long j, SurfaceView surfaceView) {
        super.z0(j, surfaceView);
        gkh0.j("[voice][call]", "onVideoChannelAdded,width:uid:" + j);
    }

    /* JADX INFO: renamed from: z1 */
    public void m16210z1(boolean z) {
        this.f3840e.f17745d.m14871d1(m16204u1(z));
    }
}
