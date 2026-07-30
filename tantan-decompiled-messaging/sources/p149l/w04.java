package p149l;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class w04 extends C12714b {

    /* JADX INFO: renamed from: h */
    public String f183709h;

    /* JADX INFO: renamed from: i */
    public final y04 f183710i;

    /* JADX INFO: renamed from: j */
    public c14 f183711j;

    public w04(y04 y04Var) {
        super(y04Var);
        this.f183709h = "[live]CallAudienceMotion";
        this.f183710i = y04Var;
    }

    /* JADX INFO: renamed from: r1 */
    public static C12714b m200822r1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE) {
            return null;
        }
        return new w04((y04) motionParams);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        this.f183710i.f195273k.call(4, this.f183710i.f47788d);
        h54.m129377d("onTokenPrivilegeWillExpire");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        h54.m129377d("onLocalLeaveChannel " + str);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: I */
    public void mo110343I(long j, boolean z) {
        super.mo110343I(j, z);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        super.mo71895X0();
        m71896Y0();
    }

    /* JADX INFO: renamed from: a */
    public void m200823a() {
        h54.m129377d("stopPreview");
        this.f47798e.f152050b.mo68554a();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: a1 */
    public void mo71898a1() {
        super.mo71898a1();
        h54.m129377d("goToEnd");
        this.f183711j.mo101818c();
        m200823a();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        h54.m129377d("onVideoChannelRemove " + j);
        int iIntValue = this.f183710i.f195273k.call(2, Long.valueOf(j)).intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            this.f183711j.m104797l(j);
        }
        this.f183711j.mo101817b();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        h54.m129377d("onLocalJoinChannel " + j);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e */
    public void mo110357e(long j, boolean z) {
        super.mo110357e(j, z);
        h54.m129377d("onMemberVideoMuted " + z);
        y04 y04Var = this.f183710i;
        boolean zM104804s = false;
        if (z) {
            int iIntValue = y04Var.f195273k.call(2, Long.valueOf(j)).intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                zM104804s = this.f183711j.m104804s(j, false);
            }
        } else {
            int iIntValue2 = y04Var.f195273k.call(1, Long.valueOf(j)).intValue();
            if (iIntValue2 == 1 || iIntValue2 == 2) {
                zM104804s = this.f183711j.m104804s(j, true);
            }
        }
        if (zM104804s) {
            this.f183711j.mo101817b();
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e0 */
    public void mo110358e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110358e0(str, j, mMLivePushType);
        h54.m129377d("onMemberJoinChannel " + j);
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
        final ConcurrentHashMap<String, Float> concurrentHashMap = new ConcurrentHashMap<>();
        vwb.m200287A(md1VarArr, new e30() { // from class: l.v04
            @Override // p149l.e30
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.m154034a()), Float.valueOf(md1Var.m154035b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        this.f183710i.f195273k.call(3, bLiveCallVolume);
        h54.m129377d("onAudioVolumeIndication" + bLiveCallVolume.toJson());
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
        h54.m129377d("onMemberLeaveChannel " + j);
        this.f183711j.m104797l(j);
        this.f183711j.mo101817b();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        h54.m129377d("audience motion start params:" + this.f183710i.toString());
        this.f47798e.f152056h.mo133284c(this.f183710i.f195272j);
        this.f47798e.f152056h.mo133282a();
        c14 c14Var = new c14();
        this.f183711j = c14Var;
        this.f47798e.f152056h.m133285d(c14Var);
        this.f183711j.m104801p(2);
        this.f47798e.f152052d.m133225i1(m71894W0());
        this.f47798e.f152052d.mo118673N(true);
        this.f47798e.f152052d.m133211U0(m200824q1(), m71892U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, false), new MMLiveTranscoding());
        this.f47798e.f152052d.m133210T0(1000, 3);
        return 0;
    }

    /* JADX INFO: renamed from: q1 */
    public final MMLiveMediaConfig m200824q1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 804;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f183710i.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f183710i.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: s1 */
    public void m200825s1(Act act, boolean z, FrameLayout frameLayout) {
        h54.m129377d("enableVideo :" + z);
        this.f47798e.f152052d.mo118673N(z ^ true);
        if (!z) {
            m200823a();
            this.f183711j.m104801p(2);
            return;
        }
        this.f47798e.f152051c.mo185833m0(act);
        this.f47798e.f152056h.mo133283b(frameLayout);
        this.f47798e.f152056h.mo133282a();
        this.f183711j.m104801p(3);
        uep0.m193325l(this.f47798e.f152056h.m133289h(), 0, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: t1 */
    public void m200826t1(Act act, FrameLayout frameLayout) {
        this.f47798e.f152051c.mo185833m0(act);
        this.f47798e.f152051c.m185835n1();
        this.f183711j.m104801p(1);
        this.f47798e.f152056h.mo133283b(frameLayout);
        this.f47798e.f152056h.mo133282a();
        uep0.m193325l(this.f47798e.f152056h.m133289h(), 0, 0, 0, 0, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: u1 */
    public void m200827u1(String str, boolean z) {
        c14 c14Var = this.f183711j;
        if (c14Var != null) {
            c14Var.m104807v(Long.valueOf(str), z);
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        h54.m129377d("onVideoChannelAdded " + j);
        int iIntValue = this.f183710i.f195273k.call(1, Long.valueOf(j)).intValue();
        if (iIntValue == 1) {
            this.f183711j.m104795i(j, surfaceView, true, true);
        } else {
            c14 c14Var = this.f183711j;
            if (iIntValue == 2) {
                c14Var.m104795i(j, surfaceView, false, true);
            } else {
                c14Var.m104795i(j, surfaceView, false, false);
            }
        }
        this.f183711j.mo101817b();
    }
}
