package p002l;

import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import java.util.concurrent.ConcurrentHashMap;
import l.e30;
import l.h54;
import l.md1;
import l.t100;
import l.uep0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w04 extends C0303b {

    /* JADX INFO: renamed from: h */
    public String f21399h;

    /* JADX INFO: renamed from: i */
    public final y04 f21400i;

    /* JADX INFO: renamed from: j */
    public c14 f21401j;

    public w04(y04 y04Var) {
        super(y04Var);
        this.f21399h = "[live]CallAudienceMotion";
        this.f21400i = y04Var;
    }

    /* JADX INFO: renamed from: r1 */
    public static C0303b m24238r1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE) {
            return null;
        }
        return new w04((y04) motionParams);
    }

    /* JADX INFO: renamed from: B0 */
    public void m24239B0() {
        super.B0();
        this.f21400i.f22561k.call(4, this.f21400i.f3830d);
        h54.d("onTokenPrivilegeWillExpire");
    }

    /* JADX INFO: renamed from: C0 */
    public void m24240C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.C0(str, i, mMLivePushType);
        h54.d("onLocalLeaveChannel " + str);
    }

    /* JADX INFO: renamed from: I */
    public void m24241I(long j, boolean z) {
        super.I(j, z);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        super.mo5273X0();
        m5274Y0();
    }

    /* JADX INFO: renamed from: a */
    public void m24242a() {
        h54.d("stopPreview");
        this.f3840e.f17743b.a();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: a1 */
    public void mo5276a1() {
        super.mo5276a1();
        h54.d("goToEnd");
        this.f21401j.mo10327c();
        m24242a();
    }

    /* JADX INFO: renamed from: b */
    public void m24243b(long j, int i) {
        super.b(j, i);
        h54.d("onVideoChannelRemove " + j);
        int iIntValue = ((Integer) this.f21400i.f22561k.call(2, Long.valueOf(j))).intValue();
        if (iIntValue == 1 || iIntValue == 2) {
            this.f21401j.m10712l(j);
        }
        this.f21401j.mo10326b();
    }

    /* JADX INFO: renamed from: d0 */
    public void m24244d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.d0(str, j, mMLivePushType);
        h54.d("onLocalJoinChannel " + j);
    }

    /* JADX INFO: renamed from: e */
    public void m24245e(long j, boolean z) {
        super.e(j, z);
        h54.d("onMemberVideoMuted " + z);
        y04 y04Var = this.f21400i;
        boolean zM10719s = false;
        if (z) {
            int iIntValue = ((Integer) y04Var.f22561k.call(2, Long.valueOf(j))).intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                zM10719s = this.f21401j.m10719s(j, false);
            }
        } else {
            int iIntValue2 = ((Integer) y04Var.f22561k.call(1, Long.valueOf(j))).intValue();
            if (iIntValue2 == 1 || iIntValue2 == 2) {
                zM10719s = this.f21401j.m10719s(j, true);
            }
        }
        if (zM10719s) {
            this.f21401j.mo10326b();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m24246e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.e0(str, j, mMLivePushType);
        h54.d("onMemberJoinChannel " + j);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTC;
    }

    /* JADX INFO: renamed from: l0 */
    public void m24247l0(md1[] md1VarArr) {
        super.l0(md1VarArr);
        if (md1VarArr.length == 1 && md1VarArr[0].a() == 0) {
            return;
        }
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        vwb.A(md1VarArr, new e30() { // from class: l.v04
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.a()), Float.valueOf(md1Var.b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        this.f21400i.f22561k.call(3, bLiveCallVolume);
        h54.d("onAudioVolumeIndication" + bLiveCallVolume.toJson());
    }

    /* JADX INFO: renamed from: o0 */
    public void m24248o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.o0(j, i, mMLivePushType);
        h54.d("onMemberLeaveChannel " + j);
        this.f21401j.m10712l(j);
        this.f21401j.mo10326b();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        h54.d("audience motion start params:" + this.f21400i.toString());
        this.f3840e.f17749h.mo14891c(this.f21400i.f22560j);
        this.f3840e.f17749h.mo14889a();
        c14 c14Var = new c14();
        this.f21401j = c14Var;
        this.f3840e.f17749h.m14892d(c14Var);
        this.f21401j.m10716p(2);
        this.f3840e.f17745d.m14876i1(m5272W0());
        this.f3840e.f17745d.mo12833N(true);
        this.f3840e.f17745d.m14862U0(m24249q1(), m5270U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, false), new MMLiveTranscoding());
        this.f3840e.f17745d.m14861T0(1000, 3);
        return 0;
    }

    /* JADX INFO: renamed from: q1 */
    public final MMLiveMediaConfig m24249q1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 804;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f21400i.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f21400i.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: s1 */
    public void m24250s1(Act act, boolean z, FrameLayout frameLayout) {
        h54.d("enableVideo :" + z);
        this.f3840e.f17745d.mo12833N(z ^ true);
        if (!z) {
            m24242a();
            this.f21401j.m10716p(2);
            return;
        }
        this.f3840e.f17744c.mo22663m0(act);
        this.f3840e.f17749h.mo14890b(frameLayout);
        this.f3840e.f17749h.mo14889a();
        this.f21401j.m10716p(3);
        uep0.l(this.f3840e.f17749h.m14896h(), 0, 0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: t1 */
    public void m24251t1(Act act, FrameLayout frameLayout) {
        this.f3840e.f17744c.mo22663m0(act);
        this.f3840e.f17744c.m22665n1();
        this.f21401j.m10716p(1);
        this.f3840e.f17749h.mo14890b(frameLayout);
        this.f3840e.f17749h.mo14889a();
        uep0.l(this.f3840e.f17749h.m14896h(), 0, 0, 0, 0, t100.d(10.0f));
    }

    /* JADX INFO: renamed from: u1 */
    public void m24252u1(String str, boolean z) {
        c14 c14Var = this.f21401j;
        if (c14Var != null) {
            c14Var.m10722v(Long.valueOf(str), z);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m24253z0(long j, SurfaceView surfaceView) {
        super.z0(j, surfaceView);
        h54.d("onVideoChannelAdded " + j);
        int iIntValue = ((Integer) this.f21400i.f22561k.call(1, Long.valueOf(j))).intValue();
        if (iIntValue == 1) {
            this.f21401j.m10710i(j, surfaceView, true, true);
        } else {
            c14 c14Var = this.f21401j;
            if (iIntValue == 2) {
                c14Var.m10710i(j, surfaceView, false, true);
            } else {
                c14Var.m10710i(j, surfaceView, false, false);
            }
        }
        this.f21401j.mo10326b();
    }
}
