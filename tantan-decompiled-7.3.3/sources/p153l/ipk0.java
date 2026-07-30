package p153l;

import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ipk0 extends i6t<rwn0, lpk0> implements ork0 {

    /* JADX INFO: renamed from: i */
    public HashMap<String, BLiveVoiceCall> f116289i;

    public ipk0(dum dumVar) {
        super(dumVar);
        this.f116289i = new HashMap<>();
        mo52715C(new lpk0());
    }

    /* JADX INFO: renamed from: A4 */
    private void m141487A4() {
        m213811F2().VoiceCallEvent.updateApplyCountEvent().mo199273j(Integer.valueOf(this.f116289i.size()));
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m141497T3(Throwable th) {
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m141501X3(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    private void m141506c4(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        if (guk0.m132333l(bLiveVoiceCall)) {
            return;
        }
        this.f116289i.put(bLiveVoiceCall.f45333id, bLiveVoiceCall);
        m141487A4();
        if (isShowing()) {
            mo141519c();
        }
    }

    /* JADX INFO: renamed from: e4 */
    private List<d3q<?>> m141507e4(final ovn0 ovn0Var) {
        return jyb.m147486Q(ovn0Var.m169464i(), new qcj() { // from class: l.qok0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158737a.m141524k4(ovn0Var, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public void m141508g4(gvn0 gvn0Var) {
        int iM132569j = gvn0Var.m132569j();
        if (iM132569j != 1) {
            if (iM132569j == 2) {
                m141506c4(gvn0Var.m132564e(), gvn0Var.m132566g());
                return;
            }
            if (iM132569j == 3) {
                m141530w4(gvn0Var.m132564e());
                return;
            } else if (iM132569j != 6) {
                if (iM132569j != 9 && iM132569j != 12 && iM132569j != 13) {
                    return;
                } else {
                    m141530w4(gvn0Var.m132564e());
                }
            }
        }
        this.f116289i.remove(gvn0Var.m132565f());
        m141487A4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public void m141509i4(hrk0.C17564a c17564a) {
        if (c17564a.f111360b == 4 && c17564a.m136888a()) {
            m141530w4(c17564a.f111359a);
        }
    }

    private boolean isShowing() {
        return m213814K2().m189699f(LiveDialogEnum.VOICE_CALL_ALL_LIST_DIALOG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ Boolean m141510p4(hrk0.C17564a c17564a) {
        return Boolean.valueOf(isShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ Boolean m141511q4(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(isShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m141512r4(bzm0 bzm0Var) {
        m141520d4(bzm0Var.f79147a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public void m141513t4(BLiveVoiceCall bLiveVoiceCall) {
        this.f116289i.remove(bLiveVoiceCall.f45333id);
        m141487A4();
        ((lpk0) this.viewModel).m155268n(bLiveVoiceCall);
        m213811F2().VoiceCallEvent.callAgreedEvent().mo199273j(bLiveVoiceCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void m141526m4() {
        duringCreated(VoiceRoomApiProvider.openFreeCall(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.vok0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185059a.m141528o4((uxj0) obj);
            }
        }, new y20() { // from class: l.wok0
            @Override // p153l.y20
            public final void call(Object obj) {
                ipk0.m141501X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m141515v4(String str) {
        ydn0.m215258k(this, ((rwn0) m213810E2()).m168532l0().f56859id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m141516x4(ovn0 ovn0Var) {
        this.f116289i.clear();
        this.f116289i.putAll(ovn0Var.f149284b);
        m141487A4();
        m141517y4(m141507e4(ovn0Var));
    }

    /* JADX INFO: renamed from: y4 */
    private void m141517y4(List<d3q<?>> list) {
        ((lpk0) this.viewModel).m155266l(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public void m141518z4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        if (zrv.f205799a.m207631D0().equals(voiceFreeCallUpdate.getUserId())) {
            return;
        }
        ((lpk0) this.viewModel).m155267m(voiceFreeCallUpdate.getFreeCall());
        mo141519c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ork0
    /* JADX INFO: renamed from: c */
    public void mo141519c() {
        duringCreated(VCallApiProvider.callApplyList(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).mo168489W0())).subscribe(dhw.m115826e(new y20() { // from class: l.gpk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105470a.m141516x4((ovn0) obj);
            }
        }, new y20() { // from class: l.hpk0
            @Override // p153l.y20
            public final void call(Object obj) {
                r35.m179578c((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public void m141520d4(String str) {
        v1n0.m199024b(((rwn0) m213810E2()).mo118373p(), ((rwn0) m213810E2()).m168532l0().f56859id, ((rwn0) m213810E2()).m202191k());
        duringCreated(VCallApiProvider.agreeVoiceCall(str)).subscribe(dhw.m115826e(new y20() { // from class: l.uok0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180101a.m141513t4((BLiveVoiceCall) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: f4 */
    public final ook0 m141521f4(final BLiveVoiceCall bLiveVoiceCall, nsv<User> nsvVar) {
        return new ook0(bLiveVoiceCall, nsvVar).m168591O(new y20() { // from class: l.xok0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195582a.m141525l4(bLiveVoiceCall, (ook0) obj);
            }
        }).m168592P(new y20() { // from class: l.yok0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200989a.m141515v4((String) obj);
            }
        });
    }

    @Override // p153l.ork0
    public String getTabName() {
        String strM209910t = xau.m209910t(R$string.f48504yf);
        if (this.f116289i.size() == 0) {
            return strM209910t;
        }
        return strM209910t + "(" + this.f116289i.size() + ")";
    }

    @Override // p153l.ork0
    public View getView() {
        return ((lpk0) this.viewModel).m155264i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m141522h4(boolean z) {
        if (z) {
            act().dialog().m21499D(R$string.f47465Cg).m21559v0(this.f196919f.getString(R$string.f48271o2), new Runnable() { // from class: l.rok0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164213a.m141526m4();
                }
            }).m21542m0(this.f196919f.getString(R$string.f47690N1)).m21567z0();
        } else {
            duringCreated(VoiceRoomApiProvider.closeFreeCall(((rwn0) m213810E2()).m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.sok0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f169901a.m141527n4((uxj0) obj);
                }
            }, new y20() { // from class: l.tok0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ipk0.m141497T3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m141523j4() {
        return f2m0.m123633c(this.f196918e);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ d3q m141524k4(ovn0 ovn0Var, BLiveVoiceCall bLiveVoiceCall) {
        return m141521f4(bLiveVoiceCall, ovn0Var.m169463h(bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m141525l4(BLiveVoiceCall bLiveVoiceCall, ook0 ook0Var) {
        m141520d4(bLiveVoiceCall.f45333id);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m141527n4(uxj0 uxj0Var) {
        ((lpk0) this.viewModel).m155267m(false);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m141528o4(uxj0 uxj0Var) {
        ((lpk0) this.viewModel).m155267m(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ Boolean m141529s4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return Boolean.valueOf(m213815L2() || ((rwn0) m213810E2()).m168477S0(""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0()).subscribe(dhw.m115825d(new y20() { // from class: l.pok0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153414a.m141508g4((gvn0) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183413Q2()).filter(new qcj() { // from class: l.zok0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205358a.m141510p4((hrk0.C17564a) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.apk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72730a.m141509i4((hrk0.C17564a) obj);
            }
        }));
        duringCreated(m213811F2().VoiceCallEvent.removeWaitCallEvent().m199270g()).filter(new qcj() { // from class: l.bpk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77785a.m141511q4((BLiveVoiceCall) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.cpk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83004a.m141530w4((BLiveVoiceCall) obj);
            }
        }));
        ((lpk0) this.viewModel).m155267m(((rwn0) m213810E2()).mo183440n().freeCall);
        duringCreated(m213811F2().VoiceCallEvent.agreeVoiceCallEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.dpk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90065a.m141512r4((bzm0) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98270a1()).filter(new qcj() { // from class: l.epk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95257a.m141529s4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.fpk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100201a.m141518z4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public void m141530w4(BLiveVoiceCall bLiveVoiceCall) {
        this.f116289i.remove(bLiveVoiceCall.f45333id);
        m141487A4();
        if (isShowing()) {
            ((lpk0) this.viewModel).m155265k(bLiveVoiceCall);
        }
    }
}
