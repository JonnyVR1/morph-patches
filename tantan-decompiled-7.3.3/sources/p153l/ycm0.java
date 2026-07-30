package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class ycm0 extends y8s<rwn0, ncm0> {

    /* JADX INFO: renamed from: j */
    public String f198525j;

    /* JADX INFO: renamed from: k */
    public String f198526k;

    public ycm0(dum<? extends rwn0> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m215155U3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m215156V3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m215159Y3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m215162d4(vxj0 vxj0Var) {
        m215170j4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22421c m215163b4(BLiveEnvelope bLiveEnvelope) {
        return VoiceVirtualApi.changeGameMode(((rwn0) m213810E2()).m202191k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ C22421c m215164c4(String str, Unit unit) {
        return kzl0.m152191m(((rwn0) m213810E2()).m202191k(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m215165e4(yhn0 yhn0Var) {
        if (!y6s.m214496d(((rwn0) m213810E2()).mo183435j().liveMode)) {
            r1j0.m179420g("开启小玩法前，请先切换至聚会模式");
        } else if (VirtualVoiceMotionType.undercover.equals(yhn0Var.f199979a.m211072a().template)) {
            m215169i4();
        } else {
            m215168h4(yhn0Var.f199979a.m211072a().type);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m215166f4(List<BLiveVoicePlayModeItem> list) {
        if (this.viewModel == 0) {
            ncm0 ncm0Var = new ncm0(this.f196918e.f90815a, this);
            this.viewModel = ncm0Var;
            mo52715C(ncm0Var);
        }
        ((ncm0) this.viewModel).m162582U(list, this.f198526k, this.f198525j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m215167g4() {
        if ((VirtualVoiceMotionType.undercover.equals(((rwn0) m213810E2()).m183418T2()) || "game".equals(((rwn0) m213810E2()).m183418T2())) && y6s.m214496d(((rwn0) m213810E2()).mo183435j().liveMode)) {
            m215170j4();
            this.f198525j = ((rwn0) m213810E2()).m183416S2();
            this.f198526k = ((rwn0) m213810E2()).m183418T2();
            ((rwn0) m213810E2()).m183407M3("");
            ((rwn0) m213810E2()).m183408N3("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m215168h4(final String str) {
        if ("game".equals(((rwn0) m213810E2()).mo183435j().template)) {
            duringCreated(kzl0.m152191m(((rwn0) m213810E2()).m202191k(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.wcm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ycm0.m215156V3((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.xcm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179420g(((TantanException.Client.CoreService) ((Throwable) obj)).metaMessage);
                }
            }));
        } else {
            duringCreated(VoiceVirtualApi.switchTemplate(((rwn0) m213810E2()).m202191k(), VirtualVoiceMotionType.announcement)).delay(500L, TimeUnit.MILLISECONDS).flatMap(new qcj() { // from class: l.scm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f167271a.m215163b4((BLiveEnvelope) obj);
                }
            }).flatMap(new qcj() { // from class: l.tcm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f173259a.m215164c4(str, (Unit) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.ucm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ycm0.m215155U3((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.vcm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    r1j0.m179420g(((TantanException.Client.CoreService) ((Throwable) obj)).metaMessage);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m215169i4() {
        duringCreated(VoiceVirtualApi.switchTemplate(((rwn0) m213810E2()).m202191k(), VirtualVoiceMotionType.undercover)).subscribe(dhw.m115826e(new y20() { // from class: l.rcm0
            @Override // p153l.y20
            public final void call(Object obj) {
                ycm0.m215159Y3((BLiveEnvelope) obj);
            }
        }, new z2e0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m215170j4() {
        duringCreated(VoiceVirtualApi.getVoiceGamesConfigs(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115825d(new y20() { // from class: l.qcm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156610a.m215166f4((List) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceVirtualLiveEvent.showChangeModeDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.pcm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151613a.m215162d4((vxj0) obj);
            }
        }));
        m215167g4();
    }
}
