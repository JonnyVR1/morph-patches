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

/* JADX INFO: loaded from: classes5.dex */
public class wvm0 extends lnm0<rwn0, zvm0> {

    /* JADX INFO: renamed from: j */
    public HashMap<String, BLiveVoiceCall> f190973j;

    public wvm0(dum dumVar) {
        super(dumVar);
        this.f190973j = new HashMap<>();
        mo52715C(new zvm0(dumVar.f90815a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public void m208070C4(String str) {
        ydn0.m215258k(this, ((rwn0) m213810E2()).m168532l0().f56859id, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    private void m208071F4() {
        m214779N3(VCallApiProvider.callApplyList(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).mo168489W0())).subscribe(dhw.m115826e(new y20() { // from class: l.hvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111769a.m208092E4((ovn0) obj);
            }
        }, new r5k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    private void m208072G4(List<d3q<?>> list) {
        ((zvm0) this.viewModel).m221797l(list, ((rwn0) m213810E2()).mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m208079c4(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m208082f4(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        m214779N3(((rwn0) m213810E2()).m168545q1().m98337x0()).subscribe(dhw.m115825d(new y20() { // from class: l.gvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106654a.m208099p4((gvn0) obj);
            }
        }));
        m214779N3(((rwn0) m213810E2()).m183413Q2()).subscribe(dhw.m115825d(new y20() { // from class: l.nvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143820a.m208088r4((hrk0.C17564a) obj);
            }
        }));
        m214779N3(m213811F2().VoiceCallEvent.removeWaitCallEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ovm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149282a.m208091D4((BLiveVoiceCall) obj);
            }
        }));
        ((zvm0) this.viewModel).m221798m(((rwn0) m213810E2()).mo183440n().freeCall);
        m214779N3(m213811F2().VoiceCallEvent.agreeVoiceCallEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.pvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154308a.m208106x4((bzm0) obj);
            }
        }));
        m214779N3(((rwn0) m213810E2()).m168545q1().m98270a1()).filter(new qcj() { // from class: l.qvm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f159788a.m208107y4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.rvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165033a.m208093H4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public void m208088r4(hrk0.C17564a c17564a) {
        if (c17564a.f111360b == 4 && c17564a.m136888a()) {
            m208091D4(c17564a.f111359a);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m208089A4(BLiveVoiceCall bLiveVoiceCall) {
        this.f190973j.remove(bLiveVoiceCall.f45333id);
        m208094I4();
        ((zvm0) this.viewModel).m221799n(bLiveVoiceCall);
        m213811F2().VoiceCallEvent.callAgreedEvent().mo199273j(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final void m208090B4() {
        duringCreated(VoiceRoomApiProvider.openFreeCall(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.jvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122820a.m208108z4((uxj0) obj);
            }
        }, new y20() { // from class: l.kvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                wvm0.m208079c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public void m208091D4(BLiveVoiceCall bLiveVoiceCall) {
        this.f190973j.remove(bLiveVoiceCall.f45333id);
        m208094I4();
        ((zvm0) this.viewModel).m221796k(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m208092E4(ovn0 ovn0Var) {
        this.f190973j.clear();
        this.f190973j.putAll(ovn0Var.f149284b);
        m208094I4();
        m208072G4(m208097n4(ovn0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m208093H4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        if (zrv.f205799a.m207631D0().equals(voiceFreeCallUpdate.getUserId())) {
            return;
        }
        ((rwn0) m213810E2()).mo183440n().freeCall = voiceFreeCallUpdate.getFreeCall();
        ((zvm0) this.viewModel).m221798m(voiceFreeCallUpdate.getFreeCall());
        mo154987V3();
    }

    /* JADX INFO: renamed from: I4 */
    public final void m208094I4() {
        m213811F2().VoiceCallEvent.updateApplyCountEvent().mo199273j(Integer.valueOf(this.f190973j.size()));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.lnm0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public fom0 mo154984S3() {
        return new fom0(xau.m209910t(R$string.f48504yf), ((zvm0) this.viewModel).m221795i(), 1);
    }

    @Override // p153l.lnm0
    /* JADX INFO: renamed from: T3 */
    public int mo154985T3() {
        return 1;
    }

    @Override // p153l.lnm0
    /* JADX INFO: renamed from: V3 */
    public void mo154987V3() {
        m208071F4();
    }

    @Override // p153l.xzs
    public Act act() {
        return this.f196918e.f90815a;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m208095l4(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        if (guk0.m132333l(bLiveVoiceCall)) {
            return;
        }
        this.f190973j.put(bLiveVoiceCall.f45333id, bLiveVoiceCall);
        m208094I4();
        mo154987V3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public void m208096m4(String str) {
        if (y6s.m214494b(((rwn0) m213810E2()).mo183435j().liveMode)) {
            v1n0.m199030h(((rwn0) m213810E2()).mo118373p(), ((rwn0) m213810E2()).m168532l0().f56859id, ((rwn0) m213810E2()).m202191k());
        } else {
            v1n0.m199024b(((rwn0) m213810E2()).mo118373p(), ((rwn0) m213810E2()).m168532l0().f56859id, ((rwn0) m213810E2()).m202191k());
        }
        duringCreated(VCallApiProvider.agreeVoiceCall(str)).subscribe(dhw.m115826e(new y20() { // from class: l.vvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185945a.m208089A4((BLiveVoiceCall) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: n4 */
    public final List<d3q<?>> m208097n4(final ovn0 ovn0Var) {
        return jyb.m147486Q(ovn0Var.m169464i(), new qcj() { // from class: l.ivm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f117098a.m208102t4(ovn0Var, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final bvm0 m208098o4(final BLiveVoiceCall bLiveVoiceCall, nsv<User> nsvVar) {
        return new bvm0(bLiveVoiceCall, nsvVar, ((rwn0) m213810E2()).mo183435j().liveMode).m106581I(new x20() { // from class: l.lvm0
            @Override // p153l.x20
            public final void call() {
                this.f133718a.m208103u4(bLiveVoiceCall);
            }
        }).m106582J(new y20() { // from class: l.mvm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138910a.m208070C4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m208099p4(gvn0 gvn0Var) {
        int iM132569j = gvn0Var.m132569j();
        if (iM132569j != 1) {
            if (iM132569j == 2) {
                m208095l4(gvn0Var.m132564e(), gvn0Var.m132566g());
                return;
            }
            if (iM132569j != 3) {
                if (iM132569j != 6) {
                    if (iM132569j != 9 && iM132569j != 12 && iM132569j != 13) {
                        return;
                    }
                }
            }
            m208091D4(gvn0Var.m132564e());
            return;
        }
        this.f190973j.remove(gvn0Var.m132565f());
        m208094I4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m208100q4(boolean z) {
        if (z) {
            new th0.C20312a(act()).m191150i(R$string.f47465Cg).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.svm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f170861a.m208104v4(view);
                }
            }).m191146e(R$string.f47690N1).m191142a().m191141g();
        } else {
            duringCreated(VoiceRoomApiProvider.closeFreeCall(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.tvm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176270a.m208105w4((uxj0) obj);
                }
            }, new y20() { // from class: l.uvm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    wvm0.m208082f4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s4 */
    public boolean m208101s4() {
        return f2m0.m123633c(this.f196918e);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ d3q m208102t4(ovn0 ovn0Var, BLiveVoiceCall bLiveVoiceCall) {
        return m208098o4(bLiveVoiceCall, ovn0Var.m169463h(bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m208103u4(BLiveVoiceCall bLiveVoiceCall) {
        m208096m4(bLiveVoiceCall.f45333id);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m208104v4(View view) {
        m208090B4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m208105w4(uxj0 uxj0Var) {
        ((rwn0) m213810E2()).mo183440n().freeCall = false;
        ((zvm0) this.viewModel).m221798m(false);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m208106x4(bzm0 bzm0Var) {
        m208096m4(bzm0Var.f79147a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m208107y4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return Boolean.valueOf(m213815L2() || ((rwn0) m213810E2()).m168477S0(""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m208108z4(uxj0 uxj0Var) {
        ((rwn0) m213810E2()).mo183440n().freeCall = true;
        ((zvm0) this.viewModel).m221798m(true);
    }
}
