package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p153l.ply;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class lmy<D extends rwn0, VM extends ply> extends djy<D, VM> {

    /* JADX INFO: renamed from: j */
    public final HashMap<String, BLiveVoiceCall> f132725j;

    public lmy(dum<D> dumVar, VM vm) {
        super(dumVar);
        this.f132725j = new HashMap<>();
        mo52715C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m154896C4(View view) {
        m154900J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m154897E4(bzm0 bzm0Var) {
        m154935p4(bzm0Var.f79147a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ Boolean m154898F4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return Boolean.valueOf(m213815L2() || m213810E2().m168477S0(""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public void m154899I4(BLiveVoiceCall bLiveVoiceCall) {
        this.f132725j.remove(bLiveVoiceCall.f45333id);
        m154905Q4();
        ((ply) this.viewModel).m172908j(bLiveVoiceCall);
        m213811F2().VoiceCallEvent.callAgreedEvent().mo199273j(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: J4 */
    private void m154900J4() {
        duringCreated(VoiceRoomApiProvider.openFreeCall(m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.kmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127542a.m154932H4((uxj0) obj);
            }
        }, new y20() { // from class: l.tly
            @Override // p153l.y20
            public final void call(Object obj) {
                lmy.m154910b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public void m154901M4(ovn0 ovn0Var) {
        this.f132725j.clear();
        this.f132725j.putAll(ovn0Var.f149284b);
        m154905Q4();
        m154903O4(m154924q4(ovn0Var));
    }

    /* JADX INFO: renamed from: N4 */
    private void m154902N4() {
        m214779N3(VCallApiProvider.callApplyList(m213810E2().m202191k(), m213810E2().mo168489W0())).subscribe(dhw.m115826e(new y20() { // from class: l.jmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121717a.m154901M4((ovn0) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: O4 */
    private void m154903O4(List<d3q<?>> list) {
        ((ply) this.viewModel).m172909k(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m154904P4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        if (zrv.f205799a.m207631D0().equals(voiceFreeCallUpdate.getUserId())) {
            return;
        }
        m213810E2().mo183440n().freeCall = voiceFreeCallUpdate.getFreeCall();
        ((ply) this.viewModel).m172910l(voiceFreeCallUpdate.getFreeCall());
        mo104944V3();
    }

    /* JADX INFO: renamed from: Q4 */
    private void m154905Q4() {
        m213811F2().VoiceCallEvent.updateApplyCountEvent().mo199273j(Integer.valueOf(this.f132725j.size()));
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m154910b4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m154911c4(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    private void m154923o4(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        if (guk0.m132333l(bLiveVoiceCall)) {
            return;
        }
        this.f132725j.put(bLiveVoiceCall.f45333id, bLiveVoiceCall);
        m154905Q4();
        mo104944V3();
    }

    /* JADX INFO: renamed from: q4 */
    private List<d3q<?>> m154924q4(final ovn0 ovn0Var) {
        return jyb.m147486Q(ovn0Var.m169464i(), new qcj() { // from class: l.uly
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f179584a.m154940y4(ovn0Var, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    private void m154925r4() {
        duringCreated(VoiceRoomApiProvider.closeFreeCall(m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.xly
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195032a.m154941z4((uxj0) obj);
            }
        }, new y20() { // from class: l.yly
            @Override // p153l.y20
            public final void call(Object obj) {
                lmy.m154911c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public void m154926u4(gvn0 gvn0Var) {
        int iM132569j = gvn0Var.m132569j();
        if (iM132569j != 1) {
            if (iM132569j == 2) {
                m154923o4(gvn0Var.m132564e(), gvn0Var.m132566g());
                return;
            }
            if (iM132569j != 3) {
                if (iM132569j != 6) {
                    if (iM132569j != 9 && iM132569j != 16 && iM132569j != 12 && iM132569j != 13) {
                        return;
                    }
                }
            }
            m154934L4(gvn0Var.m132564e());
            return;
        }
        this.f132725j.remove(gvn0Var.m132565f());
        m154905Q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public void m154927w4(hrk0.C17564a c17564a) {
        if (c17564a.f111360b == 4 && c17564a.m136888a()) {
            m154934L4(c17564a.f111359a);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m154928A4(BLiveVoiceCall bLiveVoiceCall) {
        m154935p4(bLiveVoiceCall.f45333id);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m154929B4(BLiveVoiceCall bLiveVoiceCall) {
        m154933K4(bLiveVoiceCall.f45333id);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m154930D4(View view) {
        m154925r4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m154931G4(vxj0 vxj0Var) {
        m154900J4();
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m154932H4(uxj0 uxj0Var) {
        m213810E2().mo183440n().freeCall = true;
        ((ply) this.viewModel).m172910l(true);
    }

    /* JADX INFO: renamed from: K4 */
    public void m154933K4(String str) {
        v1n0.m199031i(m213810E2().mo118373p(), m213810E2().m168532l0().f56859id, m213810E2().m202191k());
        duringCreated(VCallApiProvider.refuseVoiceCall(str)).subscribe(dhw.m115826e(new dmy(this), new r5k()));
    }

    /* JADX INFO: renamed from: L4 */
    public void m154934L4(BLiveVoiceCall bLiveVoiceCall) {
        this.f132725j.remove(bLiveVoiceCall.f45333id);
        m154905Q4();
        ((ply) this.viewModel).m172907i(bLiveVoiceCall);
        ((ply) this.viewModel).m172911m();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.djy
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public sjy mo104941S3() {
        return new sjy("上麦申请", ((ply) this.viewModel).m172905e(), 3);
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: T3 */
    public int mo104942T3() {
        return 3;
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: V3 */
    public void mo104944V3() {
        m154902N4();
    }

    @Override // p153l.xzs
    public Act act() {
        return this.f196918e.f90815a;
    }

    public void init() {
        ((ply) this.viewModel).m172906f(this);
        m214779N3(m213810E2().m168545q1().m98337x0()).subscribe(dhw.m115825d(new y20() { // from class: l.sly
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169465a.m154926u4((gvn0) obj);
            }
        }));
        m214779N3(m213810E2().m183413Q2()).subscribe(dhw.m115825d(new y20() { // from class: l.cmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82663a.m154927w4((hrk0.C17564a) obj);
            }
        }));
        m214779N3((C22421c) m213811F2().VoiceCallEvent.removeWaitCallEvent().m199270g()).subscribe(dhw.m115825d(new dmy(this)));
        ((ply) this.viewModel).m172910l(m213810E2().mo183440n().freeCall);
        m214779N3((C22421c) m213811F2().VoiceCallEvent.agreeVoiceCallEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.emy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94709a.m154897E4((bzm0) obj);
            }
        }));
        m214779N3(m213810E2().m168545q1().m98270a1()).filter(new qcj() { // from class: l.fmy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99859a.m154898F4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.gmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105043a.m154904P4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
        m138863h3(m213811F2().GameEvent.loadGame(), new y20() { // from class: l.hmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110680a.m154931G4((vxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public void m154935p4(String str) {
        v1n0.m199030h(m213810E2().mo118373p(), m213810E2().m168532l0().f56859id, m213810E2().m202191k());
        duringCreated(VCallApiProvider.agreeVoiceCall(str)).subscribe(dhw.m115826e(new y20() { // from class: l.imy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115846a.m154899I4((BLiveVoiceCall) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: s4 */
    public final nly m154936s4(final BLiveVoiceCall bLiveVoiceCall, nsv<User> nsvVar, String str) {
        return new nly(bLiveVoiceCall, nsvVar).m163786I(new x20() { // from class: l.zly
            @Override // p153l.x20
            public final void call() {
                this.f205013a.m154928A4(bLiveVoiceCall);
            }
        }).m163788K(new x20() { // from class: l.amy
            @Override // p153l.x20
            public final void call() {
                this.f72293a.m154929B4(bLiveVoiceCall);
            }
        }).m163787J(new y20() { // from class: l.bmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77419a.m116162W3((String) obj);
            }
        }).m163789L(str);
    }

    /* JADX INFO: renamed from: t4 */
    public int m154937t4() {
        return this.f132725j.size();
    }

    /* JADX INFO: renamed from: v4 */
    public void m154938v4(boolean z) {
        if (z) {
            new th0.C20312a(act()).m191150i(R$string.f47465Cg).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.vly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184651a.m154896C4(view);
                }
            }).m191146e(R$string.f47690N1).m191142a().m191141g();
        } else if (f2m0.m123632b(this.f196918e)) {
            new th0.C20312a(act()).m191151j("关闭后，将会影响游戏参与人数，请谨慎关闭").m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.wly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f189748a.m154930D4(view);
                }
            }).m191146e(R$string.f47690N1).m191142a().m191141g();
        } else {
            m154925r4();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public boolean m154939x4() {
        return f2m0.m123633c(this.f196918e);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ d3q m154940y4(ovn0 ovn0Var, BLiveVoiceCall bLiveVoiceCall) {
        return m154936s4(bLiveVoiceCall, ovn0Var.m169463h(bLiveVoiceCall.user), ovn0Var.m169465j(bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m154941z4(uxj0 uxj0Var) {
        m213810E2().mo183440n().freeCall = false;
        ((ply) this.viewModel).m172910l(false);
    }
}
