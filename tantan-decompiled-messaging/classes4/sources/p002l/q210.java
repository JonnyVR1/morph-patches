package p002l;

import android.view.SurfaceView;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.ConcurrentHashMap;
import l.e30;
import l.md1;
import l.vwb;
import l.w9j;
import l.yi10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q210 extends C0303b {

    /* JADX INFO: renamed from: h */
    public final m210 f17763h;

    /* JADX INFO: renamed from: i */
    public bj10 f17764i;

    /* JADX INFO: renamed from: j */
    public final Gson f17765j;

    /* JADX INFO: renamed from: k */
    public je10 f17766k;

    /* JADX INFO: renamed from: l */
    public final e30<CoreEngineAction> f17767l;

    public q210(m210 m210Var) {
        super(m210Var);
        this.f17766k = new je10("2x2");
        this.f17767l = new e30() { // from class: l.o210
            public final void call(Object obj) {
                this.f16338a.m20810v1((CoreEngineAction) obj);
            }
        };
        this.f17763h = m210Var;
        this.f17765j = new Gson();
    }

    /* JADX INFO: renamed from: s1 */
    private MMLiveMediaConfig m20797s1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 804;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f17763h.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f17763h.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: t1 */
    public static C0303b m20798t1(MotionParams motionParams) {
        if (motionParams.mo5266a() != MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE) {
            return null;
        }
        return new q210((m210) motionParams);
    }

    /* JADX INFO: renamed from: u1 */
    private void m20799u1() {
        this.f3840e.f17744c.m22672u1(this.f17767l);
        this.f3840e.f17745d.m14862U0(m20797s1(), m5270U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, false), new MMLiveTranscoding());
        this.f3840e.f17745d.m14861T0(1000, 3);
        int i = this.f17763h.f15213n;
        if (i != 0) {
            this.f3840e.f17745d.m14877j1(i);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m20800A1(Integer num) {
        this.f3840e.f17745d.m14877j1(num.intValue());
    }

    /* JADX INFO: renamed from: B0 */
    public void m20801B0() {
        super.B0();
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(1).m26426n(this.f17763h.f3830d));
        }
        yi10.a("onTokenPrivilegeWillExpire");
    }

    /* JADX INFO: renamed from: C0 */
    public void m20802C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.C0(str, i, mMLivePushType);
        yi10.a("onLocalLeaveChannel " + str);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(5));
        }
        this.f17764i.mo10326b();
    }

    /* JADX INFO: renamed from: S */
    public void m20803S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.S(mMLivePushType, i, i2);
        if (i2 == 1011) {
            return;
        }
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (i2 == 109) {
            interfaceC0911a.mo11030a(y74.m26413a(1).m26426n(this.f17763h.f3830d));
        } else {
            interfaceC0911a.mo11030a(y74.m26413a(7));
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        super.mo5273X0();
    }

    /* JADX INFO: renamed from: a */
    public void m20804a() {
        yi10.a("stopPreview");
        this.f3840e.f17743b.a();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: a1 */
    public void mo5276a1() {
        if (NullChecker.a(this.f17764i)) {
            this.f17764i.m10382j();
        }
        super.mo5276a1();
        yi10.a("goToEnd");
        m5274Y0();
        m20804a();
    }

    /* JADX INFO: renamed from: b */
    public void m20805b(long j, int i) {
        super.b(j, i);
        yi10.a("onVideoChannelRemove,uid:" + j);
    }

    /* JADX INFO: renamed from: d0 */
    public void m20806d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.d0(str, j, mMLivePushType);
        yi10.a("onLocalJoinChannel " + j);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(6));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m20807e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.e0(str, j, mMLivePushType);
        yi10.a("onMemberJoinChannel " + j);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(10));
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: i1 */
    public MotionParams.MomoPushType mo5284i1() {
        return MotionParams.MomoPushType.RTC;
    }

    /* JADX INFO: renamed from: l0 */
    public void m20808l0(md1[] md1VarArr) {
        super.l0(md1VarArr);
        if (md1VarArr.length == 1 && md1VarArr[0].a() == 0) {
            return;
        }
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        vwb.A(md1VarArr, new e30() { // from class: l.n210
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.a()), Float.valueOf(md1Var.b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(8).m26431s(bLiveCallVolume));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m20809o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.o0(j, i, mMLivePushType);
        yi10.a("onMemberLeaveChannel " + j);
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            interfaceC0911a.mo11030a(y74.m26413a(9));
        }
        this.f17764i.m10383k(j);
        this.f17764i.mo10326b();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        yi10.a("audience motion start params:" + this.f17765j.toJson(this.f17763h));
        this.f3840e.f17749h.mo14890b(this.f17763h.f15211l);
        this.f3840e.f17749h.mo14891c(this.f17763h.f15212m);
        je10 je10Var = new je10(this.f17763h.f15209j);
        this.f17766k = je10Var;
        bj10 bj10Var = new bj10(false, je10Var, new w9j() { // from class: l.p210
            public final Object call(Object obj) {
                return this.f16984a.m20811w1((Long) obj);
            }
        });
        this.f17764i = bj10Var;
        this.f3840e.f17749h.m14892d(bj10Var);
        this.f3840e.f17745d.m14876i1(m5272W0());
        boolean z = this.f17763h.f15210k;
        q0f q0fVar = this.f3840e;
        if (z) {
            q0fVar.f17745d.mo12833N(false);
            this.f3840e.f17744c.m22662l1(this.f17767l);
            q0f q0fVar2 = this.f3840e;
            q0fVar2.f17744c.mo22663m0(q0fVar2.f17742a);
            this.f3840e.f17749h.mo14889a();
        } else {
            q0fVar.f17745d.mo12833N(true);
            m20799u1();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m20810v1(CoreEngineAction coreEngineAction) {
        if (coreEngineAction == CoreEngineAction.ACTION_AFTER_PREVIEW) {
            m20799u1();
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ Integer m20811w1(Long l2) {
        y74.InterfaceC0911a interfaceC0911a = this.f3836a;
        if (interfaceC0911a != null) {
            return Integer.valueOf(interfaceC0911a.mo11030a(y74.m26413a(4).m26428p(l2)).m26420h());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m20812x1() {
        bj10 bj10Var = this.f17764i;
        if (bj10Var != null) {
            bj10Var.mo10326b();
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m20813y1(String str) {
        je10 je10Var = new je10(str);
        this.f17766k = je10Var;
        this.f17764i.m10384l(je10Var);
        this.f17764i.mo10326b();
    }

    /* JADX INFO: renamed from: z0 */
    public void m20814z0(long j, SurfaceView surfaceView) {
        super.z0(j, surfaceView);
        yi10.a("onVideoChannelAdded " + j);
        this.f17764i.m10379g(Long.valueOf(j), surfaceView);
        this.f17764i.mo10326b();
    }

    /* JADX INFO: renamed from: z1 */
    public void m20815z1() {
        yi10.a("switch to video mode");
        this.f3840e.f17745d.mo12833N(false);
        this.f3840e.f17745d.m14872e1(true);
        q0f q0fVar = this.f3840e;
        q0fVar.f17744c.mo22663m0(q0fVar.f17742a);
        this.f3840e.f17749h.mo14889a();
    }
}
