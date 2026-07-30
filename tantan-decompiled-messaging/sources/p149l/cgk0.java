package p149l;

import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class cgk0 extends h4t<nnn0, fgk0> implements iik0 {

    /* JADX INFO: renamed from: i */
    public HashMap<String, BLiveVoiceCall> f80780i;

    public cgk0(bsm bsmVar) {
        super(bsmVar);
        this.f80780i = new HashMap<>();
        mo51532C(new fgk0());
    }

    /* JADX INFO: renamed from: A4 */
    private void m106738A4() {
        m206028F2().VoiceCallEvent.updateApplyCountEvent().mo172463j(Integer.valueOf(this.f80780i.size()));
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m106748T3(Throwable th) {
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m106752X3(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    private void m106757c4(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        if (alk0.m97313l(bLiveVoiceCall)) {
            return;
        }
        this.f80780i.put(bLiveVoiceCall.f44485id, bLiveVoiceCall);
        m106738A4();
        if (isShowing()) {
            mo106770c();
        }
    }

    /* JADX INFO: renamed from: e4 */
    private List<d1q<?>> m106758e4(final kmn0 kmn0Var) {
        return vwb.m200303Q(kmn0Var.m146544i(), new w9j() { // from class: l.kfk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122944a.m106775k4(kmn0Var, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public void m106759g4(cmn0 cmn0Var) {
        int iM107682j = cmn0Var.m107682j();
        if (iM107682j != 1) {
            if (iM107682j == 2) {
                m106757c4(cmn0Var.m107677e(), cmn0Var.m107679g());
                return;
            }
            if (iM107682j == 3) {
                m106781w4(cmn0Var.m107677e());
                return;
            } else if (iM107682j != 6) {
                if (iM107682j != 9 && iM107682j != 12 && iM107682j != 13) {
                    return;
                } else {
                    m106781w4(cmn0Var.m107677e());
                }
            }
        }
        this.f80780i.remove(cmn0Var.m107678f());
        m106738A4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public void m106760i4(bik0.C15867a c15867a) {
        if (c15867a.f75773b == 4 && c15867a.m102078a()) {
            m106781w4(c15867a.f75772a);
        }
    }

    private boolean isShowing() {
        return m206031K2().m182463f(LiveDialogEnum.VOICE_CALL_ALL_LIST_DIALOG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ Boolean m106761p4(bik0.C15867a c15867a) {
        return Boolean.valueOf(isShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ Boolean m106762q4(BLiveVoiceCall bLiveVoiceCall) {
        return Boolean.valueOf(isShowing());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m106763r4(xpm0 xpm0Var) {
        m106771d4(xpm0Var.f193937a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public void m106764t4(BLiveVoiceCall bLiveVoiceCall) {
        this.f80780i.remove(bLiveVoiceCall.f44485id);
        m106738A4();
        ((fgk0) this.viewModel).m121259n(bLiveVoiceCall);
        m206028F2().VoiceCallEvent.callAgreedEvent().mo172463j(bLiveVoiceCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void m106777m4() {
        duringCreated(VoiceRoomApiProvider.openFreeCall(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.pfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148569a.m106779o4((roj0) obj);
            }
        }, new e30() { // from class: l.qfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                cgk0.m106752X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m106766v4(String str) {
        u4n0.m191752k(this, ((nnn0) m206027E2()).m132146l0().f56011id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m106767x4(kmn0 kmn0Var) {
        this.f80780i.clear();
        this.f80780i.putAll(kmn0Var.f123814b);
        m106738A4();
        m106768y4(m106758e4(kmn0Var));
    }

    /* JADX INFO: renamed from: y4 */
    private void m106768y4(List<d1q<?>> list) {
        ((fgk0) this.viewModel).m121257l(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public void m106769z4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        if (ypv.f199493a.m199309D0().equals(voiceFreeCallUpdate.getUserId())) {
            return;
        }
        ((fgk0) this.viewModel).m121258m(voiceFreeCallUpdate.getFreeCall());
        mo106770c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.iik0
    /* JADX INFO: renamed from: c */
    public void mo106770c() {
        duringCreated(VCallApiProvider.callApplyList(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).mo132103W0())).subscribe(ffw.m121194e(new e30() { // from class: l.agk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69378a.m106767x4((kmn0) obj);
            }
        }, new e30() { // from class: l.bgk0
            @Override // p149l.e30
            public final void call(Object obj) {
                s25.m182058c((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public void m106771d4(String str) {
        rsm0.m180694b(((nnn0) m206027E2()).mo97490p(), ((nnn0) m206027E2()).m132146l0().f56011id, ((nnn0) m206027E2()).m149814k());
        duringCreated(VCallApiProvider.agreeVoiceCall(str)).subscribe(ffw.m121194e(new e30() { // from class: l.ofk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143715a.m106764t4((BLiveVoiceCall) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: f4 */
    public final ifk0 m106772f4(final BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar) {
        return new ifk0(bLiveVoiceCall, mqvVar).m135943O(new e30() { // from class: l.rfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159161a.m106776l4(bLiveVoiceCall, (ifk0) obj);
            }
        }).m135944P(new e30() { // from class: l.sfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164302a.m106766v4((String) obj);
            }
        });
    }

    @Override // p149l.iik0
    public String getTabName() {
        String strM202217t = w8u.m202217t(R$string.f47656yf);
        if (this.f80780i.size() == 0) {
            return strM202217t;
        }
        return strM202217t + "(" + this.f80780i.size() + ")";
    }

    @Override // p149l.iik0
    public View getView() {
        return ((fgk0) this.viewModel).m121255i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public void m106773h4(boolean z) {
        if (z) {
            act().dialog().m20500D(R$string.f46617Cg).m20560v0(this.f188513f.getString(R$string.f47423o2), new Runnable() { // from class: l.lfk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f127902a.m106777m4();
                }
            }).m20543m0(this.f188513f.getString(R$string.f46842N1)).m20568z0();
        } else {
            duringCreated(VoiceRoomApiProvider.closeFreeCall(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.mfk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f133599a.m106778n4((roj0) obj);
                }
            }, new e30() { // from class: l.nfk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cgk0.m106748T3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m106774j4() {
        return btl0.m103863c(this.f188512e);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ d1q m106775k4(kmn0 kmn0Var, BLiveVoiceCall bLiveVoiceCall) {
        return m106772f4(bLiveVoiceCall, kmn0Var.m146543h(bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m106776l4(BLiveVoiceCall bLiveVoiceCall, ifk0 ifk0Var) {
        m106771d4(bLiveVoiceCall.f44485id);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m106778n4(roj0 roj0Var) {
        ((fgk0) this.viewModel).m121258m(false);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m106779o4(roj0 roj0Var) {
        ((fgk0) this.viewModel).m121258m(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ Boolean m106780s4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return Boolean.valueOf(m206032L2() || ((nnn0) m206027E2()).m132091S0(""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0()).subscribe(ffw.m121193d(new e30() { // from class: l.jfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117673a.m106759g4((cmn0) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160251Q2()).filter(new w9j() { // from class: l.tfk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f169998a.m106761p4((bik0.C15867a) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ufk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176267a.m106760i4((bik0.C15867a) obj);
            }
        }));
        duringCreated(m206028F2().VoiceCallEvent.removeWaitCallEvent().m172460g()).filter(new w9j() { // from class: l.vfk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181282a.m106762q4((BLiveVoiceCall) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.wfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186090a.m106781w4((BLiveVoiceCall) obj);
            }
        }));
        ((fgk0) this.viewModel).m121258m(((nnn0) m206027E2()).mo149817n().freeCall);
        duringCreated(m206028F2().VoiceCallEvent.agreeVoiceCallEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192692a.m106763r4((xpm0) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189088a1()).filter(new w9j() { // from class: l.yfk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198075a.m106780s4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.zfk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202957a.m106769z4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public void m106781w4(BLiveVoiceCall bLiveVoiceCall) {
        this.f80780i.remove(bLiveVoiceCall.f44485id);
        m106738A4();
        if (isShowing()) {
            ((fgk0) this.viewModel).m121256k(bLiveVoiceCall);
        }
    }
}
