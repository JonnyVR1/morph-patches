package p009l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import java.util.List;
import l.alk0;
import l.bik0;
import l.bsm;
import l.btl0;
import l.bwr;
import l.cmn0;
import l.d1q;
import l.d30;
import l.e30;
import l.ffw;
import l.i54;
import l.kmn0;
import l.mqv;
import l.nnn0;
import l.roj0;
import l.rsm0;
import l.soj0;
import l.ult;
import l.vwb;
import l.w9j;
import l.wxs;
import l.xh0;
import l.xpm0;
import l.z2k;
import p009l.scy;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ody<D extends nnn0, VM extends scy> extends gay<D, VM> {

    /* JADX INFO: renamed from: j */
    public final HashMap<String, BLiveVoiceCall> f17934j;

    public ody(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        this.f17934j = new HashMap<>();
        C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m19682C4(View view) {
        m19686J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m19683E4(xpm0 xpm0Var) {
        m19723p4(xpm0Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ Boolean m19684F4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return Boolean.valueOf(L2() || E2().S0(""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public void m19685I4(BLiveVoiceCall bLiveVoiceCall) {
        this.f17934j.remove(bLiveVoiceCall.id);
        m19691Q4();
        ((scy) ((bwr) this).viewModel).m22064j(bLiveVoiceCall);
        F2().VoiceCallEvent.callAgreedEvent().j(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: J4 */
    private void m19686J4() {
        duringCreated(VoiceRoomApiProvider.openFreeCall(E2().o())).subscribe(ffw.e(new e30() { // from class: l.ndy
            public final void call(Object obj) {
                this.f17430a.m19718H4((roj0) obj);
            }
        }, new e30() { // from class: l.wcy
            public final void call(Object obj) {
                ody.m19696b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public void m19687M4(kmn0 kmn0Var) {
        this.f17934j.clear();
        this.f17934j.putAll(kmn0Var.b);
        m19691Q4();
        m19689O4(m19710q4(kmn0Var));
    }

    /* JADX INFO: renamed from: N4 */
    private void m19688N4() {
        N3(VCallApiProvider.callApplyList(E2().k(), E2().W0())).subscribe(ffw.e(new e30() { // from class: l.mdy
            public final void call(Object obj) {
                this.f16849a.m19687M4((kmn0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: O4 */
    private void m19689O4(List<d1q<?>> list) {
        ((scy) ((bwr) this).viewModel).m22065k(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m19690P4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        if (ypv.f23196a.m23619D0().equals(voiceFreeCallUpdate.getUserId())) {
            return;
        }
        E2().X2().freeCall = voiceFreeCallUpdate.getFreeCall();
        ((scy) ((bwr) this).viewModel).m22066l(voiceFreeCallUpdate.getFreeCall());
        mo13822V3();
    }

    /* JADX INFO: renamed from: Q4 */
    private void m19691Q4() {
        F2().VoiceCallEvent.updateApplyCountEvent().j(Integer.valueOf(this.f17934j.size()));
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m19696b4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m19697c4(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    private void m19709o4(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        if (alk0.l(bLiveVoiceCall)) {
            return;
        }
        this.f17934j.put(bLiveVoiceCall.id, bLiveVoiceCall);
        m19691Q4();
        mo13822V3();
    }

    /* JADX INFO: renamed from: q4 */
    private List<d1q<?>> m19710q4(final kmn0 kmn0Var) {
        return vwb.Q(kmn0Var.i(), new w9j() { // from class: l.xcy
            public final Object call(Object obj) {
                return this.f22512a.m19728y4(kmn0Var, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    private void m19711r4() {
        duringCreated(VoiceRoomApiProvider.closeFreeCall(E2().o())).subscribe(ffw.e(new e30() { // from class: l.ady
            public final void call(Object obj) {
                this.f9428a.m19729z4((roj0) obj);
            }
        }, new e30() { // from class: l.bdy
            public final void call(Object obj) {
                ody.m19697c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public void m19712u4(cmn0 cmn0Var) {
        int iJ = cmn0Var.j();
        if (iJ != 1) {
            if (iJ == 2) {
                m19709o4(cmn0Var.e(), cmn0Var.g());
                return;
            }
            if (iJ != 3) {
                if (iJ != 6) {
                    if (iJ != 9 && iJ != 16 && iJ != 12 && iJ != 13) {
                        return;
                    }
                }
            }
            m19720L4(cmn0Var.e());
            return;
        }
        this.f17934j.remove(cmn0Var.f());
        m19691Q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public void m19713w4(bik0.a aVar) {
        if (aVar.b == 4 && aVar.a()) {
            m19720L4(aVar.a);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m19714A4(BLiveVoiceCall bLiveVoiceCall) {
        m19723p4(bLiveVoiceCall.id);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m19715B4(BLiveVoiceCall bLiveVoiceCall) {
        m19719K4(bLiveVoiceCall.id);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m19716D4(View view) {
        m19711r4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m19717G4(soj0 soj0Var) {
        m19686J4();
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m19718H4(roj0 roj0Var) {
        E2().X2().freeCall = true;
        ((scy) ((bwr) this).viewModel).m22066l(true);
    }

    /* JADX INFO: renamed from: K4 */
    public void m19719K4(String str) {
        rsm0.i(E2().p(), ((DbObject) E2().l0()).id, E2().k());
        duringCreated(VCallApiProvider.refuseVoiceCall(str)).subscribe(ffw.e(new gdy(this), new z2k()));
    }

    /* JADX INFO: renamed from: L4 */
    public void m19720L4(BLiveVoiceCall bLiveVoiceCall) {
        this.f17934j.remove(bLiveVoiceCall.id);
        m19691Q4();
        ((scy) ((bwr) this).viewModel).m22062i(bLiveVoiceCall);
        ((scy) ((bwr) this).viewModel).m22067m();
    }

    /* JADX INFO: renamed from: O3 */
    public void m19721O3() {
        super.O3();
    }

    /* JADX INFO: renamed from: P3 */
    public void m19722P3() {
        super.P3();
        init();
    }

    @Override // p009l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo13819S3() {
        return new vay("上麦申请", ((scy) ((bwr) this).viewModel).m22060e(), 3);
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo13820T3() {
        return 3;
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo13822V3() {
        m19688N4();
    }

    public Act act() {
        return ((wxs) this).e.a;
    }

    public void init() {
        ((scy) ((bwr) this).viewModel).m22061f(this);
        N3(E2().q1().x0()).subscribe(ffw.d(new e30() { // from class: l.vcy
            public final void call(Object obj) {
                this.f21538a.m19712u4((cmn0) obj);
            }
        }));
        N3(E2().Q2()).subscribe(ffw.d(new e30() { // from class: l.fdy
            public final void call(Object obj) {
                this.f12960a.m19713w4((bik0.a) obj);
            }
        }));
        N3((c) F2().VoiceCallEvent.removeWaitCallEvent().g()).subscribe(ffw.d(new gdy(this)));
        ((scy) ((bwr) this).viewModel).m22066l(E2().X2().freeCall);
        N3((c) F2().VoiceCallEvent.agreeVoiceCallEvent().g()).subscribe(ffw.d(new e30() { // from class: l.hdy
            public final void call(Object obj) {
                this.f14010a.m19683E4((xpm0) obj);
            }
        }));
        N3(E2().q1().a1()).filter(new w9j() { // from class: l.idy
            public final Object call(Object obj) {
                return this.f14590a.m19684F4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.jdy
            public final void call(Object obj) {
                this.f15067a.m19690P4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
        h3(F2().GameEvent.loadGame(), new e30() { // from class: l.kdy
            public final void call(Object obj) {
                this.f15617a.m19717G4((soj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public void m19723p4(String str) {
        rsm0.h(E2().p(), ((DbObject) E2().l0()).id, E2().k());
        duringCreated(VCallApiProvider.agreeVoiceCall(str)).subscribe(ffw.e(new e30() { // from class: l.ldy
            public final void call(Object obj) {
                this.f16116a.m19685I4((BLiveVoiceCall) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: s4 */
    public final qcy m19724s4(final BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar, String str) {
        return new qcy(bLiveVoiceCall, mqvVar).m20854I(new d30() { // from class: l.cdy
            public final void call() {
                this.f10562a.m19714A4(bLiveVoiceCall);
            }
        }).m20856K(new d30() { // from class: l.ddy
            public final void call() {
                this.f11781a.m19715B4(bLiveVoiceCall);
            }
        }).m20855J(new e30() { // from class: l.edy
            public final void call(Object obj) {
                this.f12517a.m14852W3((String) obj);
            }
        }).m20857L(str);
    }

    /* JADX INFO: renamed from: t4 */
    public int m19725t4() {
        return this.f17934j.size();
    }

    /* JADX INFO: renamed from: v4 */
    public void m19726v4(boolean z) {
        if (z) {
            new xh0.a(act()).i(R.string.Cg).q(R.string.o2).o(new View.OnClickListener() { // from class: l.ycy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22999a.m19682C4(view);
                }
            }).e(R.string.N1).a().g();
        } else if (btl0.b(((wxs) this).e)) {
            new xh0.a(act()).j("关闭后，将会影响游戏参与人数，请谨慎关闭").q(R.string.o2).o(new View.OnClickListener() { // from class: l.zcy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23579a.m19716D4(view);
                }
            }).e(R.string.N1).a().g();
        } else {
            m19711r4();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public boolean m19727x4() {
        return btl0.c(((wxs) this).e);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ d1q m19728y4(kmn0 kmn0Var, BLiveVoiceCall bLiveVoiceCall) {
        return m19724s4(bLiveVoiceCall, kmn0Var.h(bLiveVoiceCall.user), kmn0Var.j(bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m19729z4(roj0 roj0Var) {
        E2().X2().freeCall = false;
        ((scy) ((bwr) this).viewModel).m22066l(false);
    }
}
