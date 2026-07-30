package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p149l.nnn0;
import p149l.scy;

/* JADX INFO: loaded from: classes11.dex */
public class ody<D extends nnn0, VM extends scy> extends gay<D, VM> {

    /* JADX INFO: renamed from: j */
    public final HashMap<String, BLiveVoiceCall> f143255j;

    public ody(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        this.f143255j = new HashMap<>();
        mo51532C(vm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m163733C4(View view) {
        m163737J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m163734E4(xpm0 xpm0Var) {
        m163772p4(xpm0Var.f193937a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ Boolean m163735F4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return Boolean.valueOf(m206032L2() || m206027E2().m132091S0(""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public void m163736I4(BLiveVoiceCall bLiveVoiceCall) {
        this.f143255j.remove(bLiveVoiceCall.f44485id);
        m163742Q4();
        ((scy) this.viewModel).m183438j(bLiveVoiceCall);
        m206028F2().VoiceCallEvent.callAgreedEvent().mo172463j(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: J4 */
    private void m163737J4() {
        duringCreated(VoiceRoomApiProvider.openFreeCall(m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.ndy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138564a.m163769H4((roj0) obj);
            }
        }, new e30() { // from class: l.wcy
            @Override // p149l.e30
            public final void call(Object obj) {
                ody.m163747b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public void m163738M4(kmn0 kmn0Var) {
        this.f143255j.clear();
        this.f143255j.putAll(kmn0Var.f123814b);
        m163742Q4();
        m163740O4(m163761q4(kmn0Var));
    }

    /* JADX INFO: renamed from: N4 */
    private void m163739N4() {
        m207199N3(VCallApiProvider.callApplyList(m206027E2().m149814k(), m206027E2().mo132103W0())).subscribe(ffw.m121194e(new e30() { // from class: l.mdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133329a.m163738M4((kmn0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: O4 */
    private void m163740O4(List<d1q<?>> list) {
        ((scy) this.viewModel).m183439k(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public void m163741P4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        if (ypv.f199493a.m199309D0().equals(voiceFreeCallUpdate.getUserId())) {
            return;
        }
        m206027E2().mo149817n().freeCall = voiceFreeCallUpdate.getFreeCall();
        ((scy) this.viewModel).m183440l(voiceFreeCallUpdate.getFreeCall());
        mo115769V3();
    }

    /* JADX INFO: renamed from: Q4 */
    private void m163742Q4() {
        m206028F2().VoiceCallEvent.updateApplyCountEvent().mo172463j(Integer.valueOf(this.f143255j.size()));
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m163747b4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m163748c4(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    private void m163760o4(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        if (alk0.m97313l(bLiveVoiceCall)) {
            return;
        }
        this.f143255j.put(bLiveVoiceCall.f44485id, bLiveVoiceCall);
        m163742Q4();
        mo115769V3();
    }

    /* JADX INFO: renamed from: q4 */
    private List<d1q<?>> m163761q4(final kmn0 kmn0Var) {
        return vwb.m200303Q(kmn0Var.m146544i(), new w9j() { // from class: l.xcy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f192285a.m163777y4(kmn0Var, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    private void m163762r4() {
        duringCreated(VoiceRoomApiProvider.closeFreeCall(m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.ady
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68975a.m163778z4((roj0) obj);
            }
        }, new e30() { // from class: l.bdy
            @Override // p149l.e30
            public final void call(Object obj) {
                ody.m163748c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public void m163763u4(cmn0 cmn0Var) {
        int iM107682j = cmn0Var.m107682j();
        if (iM107682j != 1) {
            if (iM107682j == 2) {
                m163760o4(cmn0Var.m107677e(), cmn0Var.m107679g());
                return;
            }
            if (iM107682j != 3) {
                if (iM107682j != 6) {
                    if (iM107682j != 9 && iM107682j != 16 && iM107682j != 12 && iM107682j != 13) {
                        return;
                    }
                }
            }
            m163771L4(cmn0Var.m107677e());
            return;
        }
        this.f143255j.remove(cmn0Var.m107678f());
        m163742Q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public void m163764w4(bik0.C15867a c15867a) {
        if (c15867a.f75773b == 4 && c15867a.m102078a()) {
            m163771L4(c15867a.f75772a);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m163765A4(BLiveVoiceCall bLiveVoiceCall) {
        m163772p4(bLiveVoiceCall.f44485id);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m163766B4(BLiveVoiceCall bLiveVoiceCall) {
        m163770K4(bLiveVoiceCall.f44485id);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m163767D4(View view) {
        m163762r4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m163768G4(soj0 soj0Var) {
        m163737J4();
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m163769H4(roj0 roj0Var) {
        m206027E2().mo149817n().freeCall = true;
        ((scy) this.viewModel).m183440l(true);
    }

    /* JADX INFO: renamed from: K4 */
    public void m163770K4(String str) {
        rsm0.m180701i(m206027E2().mo97490p(), m206027E2().m132146l0().f56011id, m206027E2().m149814k());
        duringCreated(VCallApiProvider.refuseVoiceCall(str)).subscribe(ffw.m121194e(new gdy(this), new z2k()));
    }

    /* JADX INFO: renamed from: L4 */
    public void m163771L4(BLiveVoiceCall bLiveVoiceCall) {
        this.f143255j.remove(bLiveVoiceCall.f44485id);
        m163742Q4();
        ((scy) this.viewModel).m183437i(bLiveVoiceCall);
        ((scy) this.viewModel).m183441m();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo115766S3() {
        return new vay("上麦申请", ((scy) this.viewModel).m183435e(), 3);
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo115767T3() {
        return 3;
    }

    @Override // p149l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo115769V3() {
        m163739N4();
    }

    @Override // p149l.wxs
    public Act act() {
        return this.f188512e.f77095a;
    }

    public void init() {
        ((scy) this.viewModel).m183436f(this);
        m207199N3(m206027E2().m132160q1().m189155x0()).subscribe(ffw.m121193d(new e30() { // from class: l.vcy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181001a.m163763u4((cmn0) obj);
            }
        }));
        m207199N3(m206027E2().m160251Q2()).subscribe(ffw.m121193d(new e30() { // from class: l.fdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97084a.m163764w4((bik0.C15867a) obj);
            }
        }));
        m207199N3((C22306c) m206028F2().VoiceCallEvent.removeWaitCallEvent().m172460g()).subscribe(ffw.m121193d(new gdy(this)));
        ((scy) this.viewModel).m183440l(m206027E2().mo149817n().freeCall);
        m207199N3((C22306c) m206028F2().VoiceCallEvent.agreeVoiceCallEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.hdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107320a.m163734E4((xpm0) obj);
            }
        }));
        m207199N3(m206027E2().m132160q1().m189088a1()).filter(new w9j() { // from class: l.idy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112698a.m163735F4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.jdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117452a.m163741P4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
        m129304h3(m206028F2().GameEvent.loadGame(), new e30() { // from class: l.kdy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122642a.m163768G4((soj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public void m163772p4(String str) {
        rsm0.m180700h(m206027E2().mo97490p(), m206027E2().m132146l0().f56011id, m206027E2().m149814k());
        duringCreated(VCallApiProvider.agreeVoiceCall(str)).subscribe(ffw.m121194e(new e30() { // from class: l.ldy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127623a.m163736I4((BLiveVoiceCall) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: s4 */
    public final qcy m163773s4(final BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar, String str) {
        return new qcy(bLiveVoiceCall, mqvVar).m173935I(new d30() { // from class: l.cdy
            @Override // p149l.d30
            public final void call() {
                this.f80420a.m163765A4(bLiveVoiceCall);
            }
        }).m173937K(new d30() { // from class: l.ddy
            @Override // p149l.d30
            public final void call() {
                this.f85684a.m163766B4(bLiveVoiceCall);
            }
        }).m173936J(new e30() { // from class: l.edy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90652a.m125041W3((String) obj);
            }
        }).m173938L(str);
    }

    /* JADX INFO: renamed from: t4 */
    public int m163774t4() {
        return this.f143255j.size();
    }

    /* JADX INFO: renamed from: v4 */
    public void m163775v4(boolean z) {
        if (z) {
            new xh0.C21150a(act()).m208730i(R$string.f46617Cg).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.ycy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197508a.m163733C4(view);
                }
            }).m208726e(R$string.f46842N1).m208722a().m208721g();
        } else if (btl0.m103862b(this.f188512e)) {
            new xh0.C21150a(act()).m208731j("关闭后，将会影响游戏参与人数，请谨慎关闭").m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.zcy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202603a.m163767D4(view);
                }
            }).m208726e(R$string.f46842N1).m208722a().m208721g();
        } else {
            m163762r4();
        }
    }

    /* JADX INFO: renamed from: x4 */
    public boolean m163776x4() {
        return btl0.m103863c(this.f188512e);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ d1q m163777y4(kmn0 kmn0Var, BLiveVoiceCall bLiveVoiceCall) {
        return m163773s4(bLiveVoiceCall, kmn0Var.m146543h(bLiveVoiceCall.user), kmn0Var.m146545j(bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m163778z4(roj0 roj0Var) {
        m206027E2().mo149817n().freeCall = false;
        ((scy) this.viewModel).m183440l(false);
    }
}
