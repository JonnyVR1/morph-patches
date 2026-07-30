package p153l;

import android.view.SurfaceView;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ab10 extends C12877b {

    /* JADX INFO: renamed from: h */
    public final wa10 f69190h;

    /* JADX INFO: renamed from: i */
    public lr10 f69191i;

    /* JADX INFO: renamed from: j */
    public final Gson f69192j;

    /* JADX INFO: renamed from: k */
    public tm10 f69193k;

    /* JADX INFO: renamed from: l */
    public final y20<CoreEngineAction> f69194l;

    public ab10(wa10 wa10Var) {
        super(wa10Var);
        this.f69193k = new tm10("2x2");
        this.f69194l = new y20() { // from class: l.ya10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198146a.m96690v1((CoreEngineAction) obj);
            }
        };
        this.f69190h = wa10Var;
        this.f69192j = new Gson();
    }

    /* JADX INFO: renamed from: s1 */
    private MMLiveMediaConfig m96677s1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 804;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f69190h.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f69190h.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: t1 */
    public static C12877b m96678t1(MotionParams motionParams) {
        if (motionParams.mo73071a() != MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE) {
            return null;
        }
        return new ab10((wa10) motionParams);
    }

    /* JADX INFO: renamed from: u1 */
    private void m96679u1() {
        this.f48646e.f176994c.m101605u1(this.f69194l);
        this.f48646e.f176995d.m170514U0(m96677s1(), m73075U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, false), new MMLiveTranscoding());
        this.f48646e.f176995d.m170513T0(1000, 3);
        int i = this.f69190h.f188083n;
        if (i != 0) {
            this.f48646e.f176995d.m170532j1(i);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m96680A1(Integer num) {
        this.f48646e.f176995d.m170532j1(num.intValue());
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: B0 */
    public void mo96681B0() {
        super.mo96681B0();
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(1).m209681n(this.f69190h.f48636d));
        }
        ir10.m141746a("onTokenPrivilegeWillExpire");
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        ir10.m141746a("onLocalLeaveChannel " + str);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(5));
        }
        this.f69191i.mo100754b();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: S */
    public void mo96683S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo96683S(mMLivePushType, i, i2);
        if (i2 == 1011) {
            return;
        }
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (i2 == 109) {
            interfaceC21264a.mo99054a(x84.m209668a(1).m209681n(this.f69190h.f48636d));
        } else {
            interfaceC21264a.mo99054a(x84.m209668a(7));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
    }

    /* JADX INFO: renamed from: a */
    public void m96684a() {
        ir10.m141746a("stopPreview");
        this.f48646e.f176993b.mo69737a();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: a1 */
    public void mo73081a1() {
        if (NullChecker.m82486a(this.f69191i)) {
            this.f69191i.m155519j();
        }
        super.mo73081a1();
        ir10.m141746a("goToEnd");
        m73079Y0();
        m96684a();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: b */
    public void mo96685b(long j, int i) {
        super.mo96685b(j, i);
        ir10.m141746a("onVideoChannelRemove,uid:" + j);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
        ir10.m141746a("onLocalJoinChannel " + j);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(6));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e0 */
    public void mo96687e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96687e0(str, j, mMLivePushType);
        ir10.m141746a("onMemberJoinChannel " + j);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(10));
        }
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
        jyb.m147470A(td1VarArr, new y20() { // from class: l.xa10
            @Override // p153l.y20
            public final void call(Object obj) {
                td1 td1Var = (td1) obj;
                concurrentHashMap.put(String.valueOf(td1Var.m190565a()), Float.valueOf(td1Var.m190566b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(8).m209686s(bLiveCallVolume));
        }
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
        ir10.m141746a("onMemberLeaveChannel " + j);
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            interfaceC21264a.mo99054a(x84.m209668a(9));
        }
        this.f69191i.m155520k(j);
        this.f69191i.mo100754b();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        ir10.m141746a("audience motion start params:" + this.f69192j.toJson(this.f69190h));
        this.f48646e.f176999h.mo113412b(this.f69190h.f188081l);
        this.f48646e.f176999h.mo113413c(this.f69190h.f188082m);
        tm10 tm10Var = new tm10(this.f69190h.f188079j);
        this.f69193k = tm10Var;
        lr10 lr10Var = new lr10(false, tm10Var, new qcj() { // from class: l.za10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203532a.m96691w1((Long) obj);
            }
        });
        this.f69191i = lr10Var;
        this.f48646e.f176999h.m179837d(lr10Var);
        this.f48646e.f176995d.m170531i1(m73077W0());
        boolean z = this.f69190h.f188080k;
        u1f u1fVar = this.f48646e;
        if (z) {
            u1fVar.f176995d.mo170509N(false);
            this.f48646e.f176994c.m101595l1(this.f69194l);
            u1f u1fVar2 = this.f48646e;
            u1fVar2.f176994c.mo101596m0(u1fVar2.f176992a);
            this.f48646e.f176999h.mo113411a();
        } else {
            u1fVar.f176995d.mo170509N(true);
            m96679u1();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m96690v1(CoreEngineAction coreEngineAction) {
        if (coreEngineAction == CoreEngineAction.ACTION_AFTER_PREVIEW) {
            m96679u1();
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ Integer m96691w1(Long l2) {
        x84.InterfaceC21264a interfaceC21264a = this.f48642a;
        if (interfaceC21264a != null) {
            return Integer.valueOf(interfaceC21264a.mo99054a(x84.m209668a(4).m209683p(l2)).m209675h());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m96692x1() {
        lr10 lr10Var = this.f69191i;
        if (lr10Var != null) {
            lr10Var.mo100754b();
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m96693y1(String str) {
        tm10 tm10Var = new tm10(str);
        this.f69193k = tm10Var;
        this.f69191i.m155521l(tm10Var);
        this.f69191i.mo100754b();
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        ir10.m141746a("onVideoChannelAdded " + j);
        this.f69191i.m155516g(Long.valueOf(j), surfaceView);
        this.f69191i.mo100754b();
    }

    /* JADX INFO: renamed from: z1 */
    public void m96695z1() {
        ir10.m141746a("switch to video mode");
        this.f48646e.f176995d.mo170509N(false);
        this.f48646e.f176995d.m170526e1(true);
        u1f u1fVar = this.f48646e;
        u1fVar.f176994c.mo101596m0(u1fVar.f176992a);
        this.f48646e.f176999h.mo113411a();
    }
}
