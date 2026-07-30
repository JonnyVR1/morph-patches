package p149l;

import android.view.SurfaceView;
import com.google.gson.Gson;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.momoengine.CoreEngineAction;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class q210 extends C12714b {

    /* JADX INFO: renamed from: h */
    public final m210 f152191h;

    /* JADX INFO: renamed from: i */
    public bj10 f152192i;

    /* JADX INFO: renamed from: j */
    public final Gson f152193j;

    /* JADX INFO: renamed from: k */
    public je10 f152194k;

    /* JADX INFO: renamed from: l */
    public final e30<CoreEngineAction> f152195l;

    public q210(m210 m210Var) {
        super(m210Var);
        this.f152194k = new je10("2x2");
        this.f152195l = new e30() { // from class: l.o210
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141503a.m172427v1((CoreEngineAction) obj);
            }
        };
        this.f152191h = m210Var;
        this.f152193j = new Gson();
    }

    /* JADX INFO: renamed from: s1 */
    private MMLiveMediaConfig m172422s1() {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.videoFPS = 20;
        mMLiveMediaConfig.encodeWidth = 540;
        mMLiveMediaConfig.encodeHeight = 804;
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f152191h.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f152191h.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: t1 */
    public static C12714b m172423t1(MotionParams motionParams) {
        if (motionParams.mo71888a() != MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_AUDIENCE) {
            return null;
        }
        return new q210((m210) motionParams);
    }

    /* JADX INFO: renamed from: u1 */
    private void m172424u1() {
        this.f47798e.f152051c.m185842u1(this.f152195l);
        this.f47798e.f152052d.m133211U0(m172422s1(), m71892U0(MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster, false), new MMLiveTranscoding());
        this.f47798e.f152052d.m133210T0(1000, 3);
        int i = this.f152191h.f130880n;
        if (i != 0) {
            this.f47798e.f152052d.m133226j1(i);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m172425A1(Integer num) {
        this.f47798e.f152052d.m133226j1(num.intValue());
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: B0 */
    public void mo110341B0() {
        super.mo110341B0();
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(1).m213297n(this.f152191h.f47788d));
        }
        yi10.m214879a("onTokenPrivilegeWillExpire");
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        yi10.m214879a("onLocalLeaveChannel " + str);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(5));
        }
        this.f152192i.mo101817b();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: S */
    public void mo110350S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo110350S(mMLivePushType, i, i2);
        if (i2 == 1011) {
            return;
        }
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (i2 == 109) {
            interfaceC21330a.mo106704a(y74.m213284a(1).m213297n(this.f152191h.f47788d));
        } else {
            interfaceC21330a.mo106704a(y74.m213284a(7));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        super.mo71895X0();
    }

    /* JADX INFO: renamed from: a */
    public void m172426a() {
        yi10.m214879a("stopPreview");
        this.f47798e.f152050b.mo68554a();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: a1 */
    public void mo71898a1() {
        if (NullChecker.m81303a(this.f152192i)) {
            this.f152192i.m102148j();
        }
        super.mo71898a1();
        yi10.m214879a("goToEnd");
        m71896Y0();
        m172426a();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: b */
    public void mo110355b(long j, int i) {
        super.mo110355b(j, i);
        yi10.m214879a("onVideoChannelRemove,uid:" + j);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
        yi10.m214879a("onLocalJoinChannel " + j);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(6));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e0 */
    public void mo110358e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110358e0(str, j, mMLivePushType);
        yi10.m214879a("onMemberJoinChannel " + j);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(10));
        }
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
        vwb.m200287A(md1VarArr, new e30() { // from class: l.n210
            @Override // p149l.e30
            public final void call(Object obj) {
                md1 md1Var = (md1) obj;
                concurrentHashMap.put(String.valueOf(md1Var.m154034a()), Float.valueOf(md1Var.m154035b()));
            }
        });
        BLiveCallVolume bLiveCallVolume = new BLiveCallVolume();
        bLiveCallVolume.volumes = concurrentHashMap;
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(8).m213302s(bLiveCallVolume));
        }
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
        yi10.m214879a("onMemberLeaveChannel " + j);
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            interfaceC21330a.mo106704a(y74.m213284a(9));
        }
        this.f152192i.m102149k(j);
        this.f152192i.mo101817b();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        yi10.m214879a("audience motion start params:" + this.f152193j.toJson(this.f152191h));
        this.f47798e.f152056h.mo133283b(this.f152191h.f130878l);
        this.f47798e.f152056h.mo133284c(this.f152191h.f130879m);
        je10 je10Var = new je10(this.f152191h.f130876j);
        this.f152194k = je10Var;
        bj10 bj10Var = new bj10(false, je10Var, new w9j() { // from class: l.p210
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f146797a.m172428w1((Long) obj);
            }
        });
        this.f152192i = bj10Var;
        this.f47798e.f152056h.m133285d(bj10Var);
        this.f47798e.f152052d.m133225i1(m71894W0());
        boolean z = this.f152191h.f130877k;
        q0f q0fVar = this.f47798e;
        if (z) {
            q0fVar.f152052d.mo118673N(false);
            this.f47798e.f152051c.m185832l1(this.f152195l);
            q0f q0fVar2 = this.f47798e;
            q0fVar2.f152051c.mo185833m0(q0fVar2.f152049a);
            this.f47798e.f152056h.mo133282a();
        } else {
            q0fVar.f152052d.mo118673N(true);
            m172424u1();
        }
        return 0;
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m172427v1(CoreEngineAction coreEngineAction) {
        if (coreEngineAction == CoreEngineAction.ACTION_AFTER_PREVIEW) {
            m172424u1();
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ Integer m172428w1(Long l2) {
        y74.InterfaceC21330a interfaceC21330a = this.f47794a;
        if (interfaceC21330a != null) {
            return Integer.valueOf(interfaceC21330a.mo106704a(y74.m213284a(4).m213299p(l2)).m213291h());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m172429x1() {
        bj10 bj10Var = this.f152192i;
        if (bj10Var != null) {
            bj10Var.mo101817b();
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m172430y1(String str) {
        je10 je10Var = new je10(str);
        this.f152194k = je10Var;
        this.f152192i.m102150l(je10Var);
        this.f152192i.mo101817b();
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        yi10.m214879a("onVideoChannelAdded " + j);
        this.f152192i.m102145g(Long.valueOf(j), surfaceView);
        this.f152192i.mo101817b();
    }

    /* JADX INFO: renamed from: z1 */
    public void m172431z1() {
        yi10.m214879a("switch to video mode");
        this.f47798e.f152052d.mo118673N(false);
        this.f47798e.f152052d.m133221e1(true);
        q0f q0fVar = this.f47798e;
        q0fVar.f152051c.mo185833m0(q0fVar.f152049a);
        this.f47798e.f152056h.mo133282a();
    }
}
