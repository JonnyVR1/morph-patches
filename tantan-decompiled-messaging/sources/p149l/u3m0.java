package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class u3m0 extends x6s<nnn0, j3m0> {

    /* JADX INFO: renamed from: j */
    public String f173638j;

    /* JADX INFO: renamed from: k */
    public String f173639k;

    public u3m0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m191592U3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m191593V3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m191596Y3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m191599d4(soj0 soj0Var) {
        m191607j4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22306c m191600b4(BLiveEnvelope bLiveEnvelope) {
        return VoiceVirtualApi.changeGameMode(((nnn0) m206027E2()).m149814k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ C22306c m191601c4(String str, Unit unit) {
        return gql0.m127606m(((nnn0) m206027E2()).m149814k(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m191602e4(u8n0 u8n0Var) {
        if (!x4s.m207014d(((nnn0) m206027E2()).mo149813j().liveMode)) {
            osi0.m165783g("开启小玩法前，请先切换至聚会模式");
        } else if (VirtualVoiceMotionType.undercover.equals(u8n0Var.f175146a.m187557a().template)) {
            m191606i4();
        } else {
            m191605h4(u8n0Var.f175146a.m187557a().type);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m191603f4(List<BLiveVoicePlayModeItem> list) {
        if (this.viewModel == 0) {
            j3m0 j3m0Var = new j3m0(this.f188512e.f77095a, this);
            this.viewModel = j3m0Var;
            mo51532C(j3m0Var);
        }
        ((j3m0) this.viewModel).m139594U(list, this.f173639k, this.f173638j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m191604g4() {
        if ((VirtualVoiceMotionType.undercover.equals(((nnn0) m206027E2()).m160256T2()) || "game".equals(((nnn0) m206027E2()).m160256T2())) && x4s.m207014d(((nnn0) m206027E2()).mo149813j().liveMode)) {
            m191607j4();
            this.f173638j = ((nnn0) m206027E2()).m160254S2();
            this.f173639k = ((nnn0) m206027E2()).m160256T2();
            ((nnn0) m206027E2()).m160245M3("");
            ((nnn0) m206027E2()).m160246N3("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m191605h4(final String str) {
        if ("game".equals(((nnn0) m206027E2()).mo149813j().template)) {
            duringCreated(gql0.m127606m(((nnn0) m206027E2()).m149814k(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.s3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    u3m0.m191593V3((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.t3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165783g(((TantanException.Client.CoreService) ((Throwable) obj)).metaMessage);
                }
            }));
        } else {
            duringCreated(VoiceVirtualApi.switchTemplate(((nnn0) m206027E2()).m149814k(), VirtualVoiceMotionType.announcement)).delay(500L, TimeUnit.MILLISECONDS).flatMap(new w9j() { // from class: l.o3m0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f141693a.m191600b4((BLiveEnvelope) obj);
                }
            }).flatMap(new w9j() { // from class: l.p3m0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f147002a.m191601c4(str, (Unit) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.q3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    u3m0.m191592U3((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.r3m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    osi0.m165783g(((TantanException.Client.CoreService) ((Throwable) obj)).metaMessage);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m191606i4() {
        duringCreated(VoiceVirtualApi.switchTemplate(((nnn0) m206027E2()).m149814k(), VirtualVoiceMotionType.undercover)).subscribe(ffw.m121194e(new e30() { // from class: l.n3m0
            @Override // p149l.e30
            public final void call(Object obj) {
                u3m0.m191596Y3((BLiveEnvelope) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m191607j4() {
        duringCreated(VoiceVirtualApi.getVoiceGamesConfigs(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121193d(new e30() { // from class: l.m3m0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131109a.m191603f4((List) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceVirtualLiveEvent.showChangeModeDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.l3m0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125928a.m191599d4((soj0) obj);
            }
        }));
        m191604g4();
    }
}
