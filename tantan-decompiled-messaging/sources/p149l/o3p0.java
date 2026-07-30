package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyItemView;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Pair;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class o3p0<D extends nnn0> extends isl0<D, VoiceVirtualNineDeputyWidgetView> {
    public o3p0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m162459d4(roj0 roj0Var) {
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: N1 */
    public void mo138047N1(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76883N1(bLiveVoiceCall);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: R3 */
    public void mo138048R3(bik0.C15867a c15867a) {
        int i = c15867a.f75773b;
        boolean z = true;
        if (i == 1) {
            ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setData(m206027E2().m160249P2());
            mo162467l4(m206027E2().m160249P2());
        } else if (i == 3 && c15867a.m102078a()) {
            m162466k4(c15867a.f75772a.position);
            ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setData(m206027E2().m160249P2());
        } else {
            int i2 = c15867a.f75773b;
            if (i2 == 2) {
                ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76893t2(m206027E2().m160249P2(), c15867a.f75772a);
            } else if (i2 == 4) {
                ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setData(m206027E2().m160249P2());
            } else if (i2 == 5) {
                m162466k4(c15867a.f75772a.intendPosition);
                ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76893t2(m206027E2().m160249P2(), c15867a.f75772a);
            }
        }
        VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView = (VoiceVirtualNineDeputyWidgetView) this.viewModel;
        if (!m206027E2().mo97490p() && !e0o0.m114322h(this)) {
            z = false;
        }
        voiceVirtualNineDeputyWidgetView.m76918w0(z);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        u4n0.m191754m(this);
        m144512z2(new pbp0(this.f188512e));
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: U3 */
    public void mo138051U3(mqv<i54> mqvVar) {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(mqvVar.f135304a.f111520a);
        if (bLiveVoiceCallM102063l == null) {
            return;
        }
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76893t2(m206027E2().m160249P2(), bLiveVoiceCallM102063l);
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: V1 */
    public void mo139728V1(mqv<i54> mqvVar) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76920z0(mqvVar);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: V3 */
    public void mo138052V3(mqv<i54> mqvVar, mqv<i54> mqvVar2, BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2, boolean z, String str, String str2) {
        if (bLiveVoiceCall == null || bLiveVoiceCall2 == null) {
            return;
        }
        int i = bLiveVoiceCall.position;
        int i2 = bLiveVoiceCall2.position;
        if (i - i2 == 1 && i2 != 1 && i2 != 5) {
            VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView = (VoiceVirtualNineDeputyWidgetView) this.viewModel;
            if (!z) {
                str2 = "";
            }
            voiceVirtualNineDeputyWidgetView.m76890p0(bLiveVoiceCall, str2);
            return;
        }
        if (i2 - i != 1 || i == 1 || i == 5) {
            return;
        }
        VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView2 = (VoiceVirtualNineDeputyWidgetView) this.viewModel;
        if (!z) {
            str2 = "";
        }
        voiceVirtualNineDeputyWidgetView2.m76890p0(bLiveVoiceCall2, str2);
    }

    /* JADX INFO: renamed from: f4 */
    public final Pair<int[], Integer> m162461f4(j6n0 j6n0Var) {
        VoiceVirtualNineDeputyItemView voiceVirtualNineDeputyItemView = ((VoiceVirtualNineDeputyWidgetView) this.viewModel).getDeputyViewList().get(j6n0Var.f116488c);
        return voiceVirtualNineDeputyItemView == null ? new Pair<>(new int[2], 0) : new Pair<>(sxj.m186441b(voiceVirtualNineDeputyItemView.f52251e.getRealAvatarView()), Integer.valueOf(voiceVirtualNineDeputyItemView.f52251e.getRealAvatarView().getWidth()));
    }

    /* JADX INFO: renamed from: g4 */
    public void m162462g4() {
        duringCreated(VirtualVoiceRoomApiProvider.clearPopularity(m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.n3p0
            @Override // p149l.e30
            public final void call(Object obj) {
                o3p0.m162459d4((roj0) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: h4 */
    public void m162463h4(BLiveVoiceCall bLiveVoiceCall) {
        if (m206027E2().m132146l0() == null) {
            return;
        }
        String str = m206027E2().m132146l0().f56011id;
        if (NullChecker.m81303a(bLiveVoiceCall)) {
            u4n0.m191752k(this, str, bLiveVoiceCall.user);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m162464i4(Integer num) {
        if (alk0.m97309h(m206027E2().m160261Y2())) {
            BLiveMember bLiveMemberM201354G = m206027E2().m160249P2().m102069r().m201354G(ypv.f199493a.m199309D0());
            if (m206027E2().mo97490p() || bLiveMemberM201354G.isManager) {
                m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
                return;
            } else if (num.intValue() == 0) {
                lsi0.m151595y("暂无法申请上房主麦位");
                return;
            } else {
                lsi0.m151595y("已在麦上");
                return;
            }
        }
        if (num.intValue() != 0 && m206027E2().mo97490p()) {
            m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
            return;
        }
        if (num.intValue() == 0 && !m206027E2().mo97490p()) {
            lsi0.m151595y("暂无法申请上房主麦位");
            return;
        }
        xpm0 xpm0Var = new xpm0();
        xpm0Var.m210513g(num.intValue());
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(xpm0Var);
    }

    /* JADX INFO: renamed from: j4 */
    public void m162465j4(String str) {
        m206028F2().VoiceVirtualLiveEvent.openUserLeaderBoard().mo172463j(str);
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: k0 */
    public void mo139738k0(BLiveVoiceCall bLiveVoiceCall) {
        mqv<i54> mqvVarM102064m;
        if (bLiveVoiceCall == null || (mqvVarM102064m = m206027E2().m160249P2().m102064m(bLiveVoiceCall.user)) == null) {
            return;
        }
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76919y0(mqvVarM102064m, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: k4 */
    public void m162466k4(int i) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76884Q3(i, true);
    }

    @Override // p149l.isl0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76892t();
        m129301d3(j6n0.class, new w9j() { // from class: l.m3p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f131113a.m162461f4((j6n0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public void mo162467l4(bik0 bik0Var) {
    }
}
