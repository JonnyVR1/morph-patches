package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyItemView;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Pair;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class scp0<D extends rwn0> extends m1m0<D, VoiceVirtualNineDeputyWidgetView> {
    public scp0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m185379d4(uxj0 uxj0Var) {
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: N1 */
    public void mo156707N1(BLiveVoiceCall bLiveVoiceCall) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78066N1(bLiveVoiceCall);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: R3 */
    public void mo113719R3(hrk0.C17564a c17564a) {
        int i = c17564a.f111360b;
        boolean z = true;
        if (i == 1) {
            ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setData(m213810E2().m183411P2());
            mo185387l4(m213810E2().m183411P2());
        } else if (i == 3 && c17564a.m136888a()) {
            m185386k4(c17564a.f111359a.position);
            ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setData(m213810E2().m183411P2());
        } else {
            int i2 = c17564a.f111360b;
            if (i2 == 2) {
                ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78076t2(m213810E2().m183411P2(), c17564a.f111359a);
            } else if (i2 == 4) {
                ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setData(m213810E2().m183411P2());
            } else if (i2 == 5) {
                m185386k4(c17564a.f111359a.intendPosition);
                ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78076t2(m213810E2().m183411P2(), c17564a.f111359a);
            }
        }
        VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView = (VoiceVirtualNineDeputyWidgetView) this.viewModel;
        if (!m213810E2().mo118373p() && !i9o0.m139137h(this)) {
            z = false;
        }
        voiceVirtualNineDeputyWidgetView.m78101w0(z);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ydn0.m215260m(this);
        m153103z2(new tkp0(this.f196918e));
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: U3 */
    public void mo156710U3(nsv<h64> nsvVar) {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(nsvVar.f143542a.f107997a);
        if (bLiveVoiceCallM136873l == null) {
            return;
        }
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78076t2(m213810E2().m183411P2(), bLiveVoiceCallM136873l);
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: V1 */
    public void mo162760V1(nsv<h64> nsvVar) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78103z0(nsvVar);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: V3 */
    public void mo156711V3(nsv<h64> nsvVar, nsv<h64> nsvVar2, BLiveVoiceCall bLiveVoiceCall, BLiveVoiceCall bLiveVoiceCall2, boolean z, String str, String str2) {
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
            voiceVirtualNineDeputyWidgetView.m78073p0(bLiveVoiceCall, str2);
            return;
        }
        if (i2 - i != 1 || i == 1 || i == 5) {
            return;
        }
        VoiceVirtualNineDeputyWidgetView voiceVirtualNineDeputyWidgetView2 = (VoiceVirtualNineDeputyWidgetView) this.viewModel;
        if (!z) {
            str2 = "";
        }
        voiceVirtualNineDeputyWidgetView2.m78073p0(bLiveVoiceCall2, str2);
    }

    /* JADX INFO: renamed from: f4 */
    public final Pair<int[], Integer> m185381f4(nfn0 nfn0Var) {
        VoiceVirtualNineDeputyItemView voiceVirtualNineDeputyItemView = ((VoiceVirtualNineDeputyWidgetView) this.viewModel).getDeputyViewList().get(nfn0Var.f141747c);
        return voiceVirtualNineDeputyItemView == null ? new Pair<>(new int[2], 0) : new Pair<>(i0k.m137975b(voiceVirtualNineDeputyItemView.f53099e.getRealAvatarView()), Integer.valueOf(voiceVirtualNineDeputyItemView.f53099e.getRealAvatarView().getWidth()));
    }

    /* JADX INFO: renamed from: g4 */
    public void m185382g4() {
        duringCreated(VirtualVoiceRoomApiProvider.clearPopularity(m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.rcp0
            @Override // p153l.y20
            public final void call(Object obj) {
                scp0.m185379d4((uxj0) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: h4 */
    public void m185383h4(BLiveVoiceCall bLiveVoiceCall) {
        if (m213810E2().m168532l0() == null) {
            return;
        }
        String str = m213810E2().m168532l0().f56859id;
        if (NullChecker.m82486a(bLiveVoiceCall)) {
            ydn0.m215258k(this, str, bLiveVoiceCall.user);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m185384i4(Integer num) {
        if (guk0.m132329h(m213810E2().m183423Y2())) {
            BLiveMember bLiveMemberM97111G = m213810E2().m183411P2().m136879r().m97111G(zrv.f205799a.m207631D0());
            if (m213810E2().mo118373p() || bLiveMemberM97111G.isManager) {
                m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
                return;
            } else if (num.intValue() == 0) {
                o1j0.m165651y("暂无法申请上房主麦位");
                return;
            } else {
                o1j0.m165651y("已在麦上");
                return;
            }
        }
        if (num.intValue() != 0 && m213810E2().mo118373p()) {
            m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
            return;
        }
        if (num.intValue() == 0 && !m213810E2().mo118373p()) {
            o1j0.m165651y("暂无法申请上房主麦位");
            return;
        }
        bzm0 bzm0Var = new bzm0();
        bzm0Var.m107186g(num.intValue());
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(bzm0Var);
    }

    /* JADX INFO: renamed from: j4 */
    public void m185385j4(String str) {
        m213811F2().VoiceVirtualLiveEvent.openUserLeaderBoard().mo199273j(str);
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: k0 */
    public void mo162767k0(BLiveVoiceCall bLiveVoiceCall) {
        nsv<h64> nsvVarM136874m;
        if (bLiveVoiceCall == null || (nsvVarM136874m = m213810E2().m183411P2().m136874m(bLiveVoiceCall.user)) == null) {
            return;
        }
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78102y0(nsvVarM136874m, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: k4 */
    public void m185386k4(int i) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78067Q3(i, true);
    }

    @Override // p153l.m1m0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78075t();
        m138860d3(nfn0.class, new qcj() { // from class: l.qcp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156613a.m185381f4((nfn0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public void mo185387l4(hrk0 hrk0Var) {
    }
}
