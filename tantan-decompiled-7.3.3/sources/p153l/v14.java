package p153l;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class v14 extends C12877b {

    /* JADX INFO: renamed from: h */
    public String f181922h;

    /* JADX INFO: renamed from: i */
    public final x14 f181923i;

    /* JADX INFO: renamed from: j */
    public b24 f181924j;

    public v14(x14 x14Var) {
        super(x14Var);
        this.f181922h = "[live]CallAudienceMotion";
        this.f181923i = x14Var;
    }

    /* JADX INFO: renamed from: r1 */
    public static C12877b m198969r1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE) {
            return null;
        }
        return new v14((x14) motionParams);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        this.f181923i.f191982k.call(4, this.f181923i.f48636d);
        g64.m129083d("onTokenPrivilegeWillExpire");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        g64.m129083d("onLocalLeaveChannel " + str);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: I */
    public void mo120101I(long j, boolean z) {
        super.mo120101I(j, z);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
        m73079Y0();
    }

    /* JADX INFO: renamed from: a */
    public void m198970a() {
        g64.m129083d("stopPreview");
        this.f48646e.f176993b.mo69737a();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: a1 */
    public void mo73081a1() {
        super.mo73081a1();
        g64.m129083d("goToEnd");
        this.f181924j.mo100755c();
        m198970a();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        g64.m129083d("onVideoChannelRemove " + j);
        int iIntValue = this.f181923i.f191982k.call(2, Long.valueOf(j)).intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            this.f181924j.m101627l(j);
        }
        this.f181924j.mo100754b();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        g64.m129083d("onLocalJoinChannel " + j);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e */
    public void mo120111e(long j, boolean z) {
        super.mo120111e(j, z);
        g64.m129083d("onMemberVideoMuted " + z);
        x14 x14Var = this.f181923i;
        boolean zM101634s = false;
        if (z) {
            int iIntValue = x14Var.f191982k.call(2, Long.valueOf(j)).intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                zM101634s = this.f181924j.m101634s(j, false);
            }
        } else {
            int iIntValue2 = x14Var.f191982k.call(1, Long.valueOf(j)).intValue();
            if (iIntValue2 == 1 || iIntValue2 == 2) {
                zM101634s = this.f181924j.m101634s(j, true);
            }
        }
        if (zM101634s) {
            this.f181924j.mo100754b();
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e0 */
    public void mo96687e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96687e0(str, j, mMLivePushType);
        g64.m129083d("onMemberJoinChannel " + j);
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
        final ConcurrentHashMap<String, Float> concurrentHashMap = new ConcurrentHashMap<>();
        jyb.m147470A(td1VarArr, new y20() { // from class: l.u14
            @Override // p153l.y20
            public final void call(Object obj) {
                td1 td1Var = (td1) obj;
                concurrentHashMap.put(String.valueOf(td1Var.m190565a()), Float.valueOf(td1Var.m190566b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        this.f181923i.f191982k.call(3, bLiveCallVolume);
        g64.m129083d("onAudioVolumeIndication" + bLiveCallVolume.toJson());
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
        g64.m129083d("onMemberLeaveChannel " + j);
        this.f181924j.m101627l(j);
        this.f181924j.mo100754b();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        g64.m129083d("audience motion start params:" + this.f181923i.toString());
        this.f48646e.f176999h.mo113413c(this.f181923i.f191981j);
        this.f48646e.f176999h.mo113411a();
        b24 b24Var = new b24();
        this.f181924j = b24Var;
        this.f48646e.f176999h.m179837d(b24Var);
        this.f181924j.m101631p(2);
        this.f48646e.f176995d.m170531i1(m73077W0());
        this.f48646e.f176995d.mo170509N(true);
        this.f48646e.f176995d.m170514U0(m198971q1(), m73075U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, false), new MMLiveTranscoding());
        this.f48646e.f176995d.m170513T0(1000, 3);
        return 0;
    }

    /* JADX INFO: renamed from: q1 */
    public final MMLiveMediaConfig m198971q1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 804;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f181923i.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f181923i.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: s1 */
    public void m198972s1(Act act, boolean z, FrameLayout frameLayout) {
        g64.m129083d("enableVideo :" + z);
        this.f48646e.f176995d.mo170509N(z ^ true);
        if (!z) {
            m198970a();
            this.f181924j.m101631p(2);
            return;
        }
        this.f48646e.f176994c.mo101596m0(act);
        this.f48646e.f176999h.mo113412b(frameLayout);
        this.f48646e.f176999h.mo113411a();
        this.f181924j.m101631p(3);
        ynp0.m216935l(this.f48646e.f176999h.m179841h(), 0, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: t1 */
    public void m198973t1(Act act, FrameLayout frameLayout) {
        this.f48646e.f176994c.mo101596m0(act);
        this.f48646e.f176994c.m101598n1();
        this.f181924j.m101631p(1);
        this.f48646e.f176999h.mo113412b(frameLayout);
        this.f48646e.f176999h.mo113411a();
        ynp0.m216935l(this.f48646e.f176999h.m179841h(), 0, 0, 0, 0, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: u1 */
    public void m198974u1(String str, boolean z) {
        b24 b24Var = this.f181924j;
        if (b24Var != null) {
            b24Var.m101637v(Long.valueOf(str), z);
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        g64.m129083d("onVideoChannelAdded " + j);
        int iIntValue = this.f181923i.f191982k.call(1, Long.valueOf(j)).intValue();
        if (iIntValue == 1) {
            this.f181924j.m101625i(j, surfaceView, true, true);
        } else {
            b24 b24Var = this.f181924j;
            if (iIntValue == 2) {
                b24Var.m101625i(j, surfaceView, false, true);
            } else {
                b24Var.m101625i(j, surfaceView, false, false);
            }
        }
        this.f181924j.mo100754b();
    }
}
