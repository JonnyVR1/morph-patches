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

/* JADX INFO: loaded from: classes5.dex */
public class smm0 extends hem0<nnn0, vmm0> {

    /* JADX INFO: renamed from: j */
    public HashMap<String, BLiveVoiceCall> f165360j;

    public smm0(bsm bsmVar) {
        super(bsmVar);
        this.f165360j = new HashMap<>();
        mo51532C(new vmm0(bsmVar.f77095a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public void m184970C4(String str) {
        u4n0.m191752k(this, ((nnn0) m206027E2()).m132146l0().f56011id, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    private void m184971F4() {
        m207199N3(VCallApiProvider.callApplyList(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).mo132103W0())).subscribe(ffw.m121194e(new e30() { // from class: l.dmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86959a.m184992E4((kmn0) obj);
            }
        }, new z2k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    private void m184972G4(List<d1q<?>> list) {
        ((vmm0) this.viewModel).m198964l(list, ((nnn0) m206027E2()).mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m184979c4(Throwable th) {
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m184982f4(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        m207199N3(((nnn0) m206027E2()).m132160q1().m189155x0()).subscribe(ffw.m121193d(new e30() { // from class: l.cmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81587a.m184999p4((cmn0) obj);
            }
        }));
        m207199N3(((nnn0) m206027E2()).m160251Q2()).subscribe(ffw.m121193d(new e30() { // from class: l.jmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118692a.m184988r4((bik0.C15867a) obj);
            }
        }));
        m207199N3(m206028F2().VoiceCallEvent.removeWaitCallEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.kmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123812a.m184991D4((BLiveVoiceCall) obj);
            }
        }));
        ((vmm0) this.viewModel).m198965m(((nnn0) m206027E2()).mo149817n().freeCall);
        m207199N3(m206028F2().VoiceCallEvent.agreeVoiceCallEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128809a.m185006x4((xpm0) obj);
            }
        }));
        m207199N3(((nnn0) m206027E2()).m132160q1().m189088a1()).filter(new w9j() { // from class: l.mmm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f134681a.m185007y4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.nmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139634a.m184993H4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public void m184988r4(bik0.C15867a c15867a) {
        if (c15867a.f75773b == 4 && c15867a.m102078a()) {
            m184991D4(c15867a.f75772a);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final void m184989A4(BLiveVoiceCall bLiveVoiceCall) {
        this.f165360j.remove(bLiveVoiceCall.f44485id);
        m184994I4();
        ((vmm0) this.viewModel).m198966n(bLiveVoiceCall);
        m206028F2().VoiceCallEvent.callAgreedEvent().mo172463j(bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final void m184990B4() {
        duringCreated(VoiceRoomApiProvider.openFreeCall(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.fmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98313a.m185008z4((roj0) obj);
            }
        }, new e30() { // from class: l.gmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                smm0.m184979c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public void m184991D4(BLiveVoiceCall bLiveVoiceCall) {
        this.f165360j.remove(bLiveVoiceCall.f44485id);
        m184994I4();
        ((vmm0) this.viewModel).m198963k(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: E4 */
    public final void m184992E4(kmn0 kmn0Var) {
        this.f165360j.clear();
        this.f165360j.putAll(kmn0Var.f123814b);
        m184994I4();
        m184972G4(m184997n4(kmn0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H4 */
    public final void m184993H4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        if (ypv.f199493a.m199309D0().equals(voiceFreeCallUpdate.getUserId())) {
            return;
        }
        ((nnn0) m206027E2()).mo149817n().freeCall = voiceFreeCallUpdate.getFreeCall();
        ((vmm0) this.viewModel).m198965m(voiceFreeCallUpdate.getFreeCall());
        mo130657V3();
    }

    /* JADX INFO: renamed from: I4 */
    public final void m184994I4() {
        m206028F2().VoiceCallEvent.updateApplyCountEvent().mo172463j(Integer.valueOf(this.f165360j.size()));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.hem0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public bfm0 mo130654S3() {
        return new bfm0(w8u.m202217t(R$string.f47656yf), ((vmm0) this.viewModel).m198962i(), 1);
    }

    @Override // p149l.hem0
    /* JADX INFO: renamed from: T3 */
    public int mo130655T3() {
        return 1;
    }

    @Override // p149l.hem0
    /* JADX INFO: renamed from: V3 */
    public void mo130657V3() {
        m184971F4();
    }

    @Override // p149l.wxs
    public Act act() {
        return this.f188512e.f77095a;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m184995l4(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        if (alk0.m97313l(bLiveVoiceCall)) {
            return;
        }
        this.f165360j.put(bLiveVoiceCall.f44485id, bLiveVoiceCall);
        m184994I4();
        mo130657V3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public void m184996m4(String str) {
        if (x4s.m207012b(((nnn0) m206027E2()).mo149813j().liveMode)) {
            rsm0.m180700h(((nnn0) m206027E2()).mo97490p(), ((nnn0) m206027E2()).m132146l0().f56011id, ((nnn0) m206027E2()).m149814k());
        } else {
            rsm0.m180694b(((nnn0) m206027E2()).mo97490p(), ((nnn0) m206027E2()).m132146l0().f56011id, ((nnn0) m206027E2()).m149814k());
        }
        duringCreated(VCallApiProvider.agreeVoiceCall(str)).subscribe(ffw.m121194e(new e30() { // from class: l.rmm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160106a.m184989A4((BLiveVoiceCall) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: n4 */
    public final List<d1q<?>> m184997n4(final kmn0 kmn0Var) {
        return vwb.m200303Q(kmn0Var.m146544i(), new w9j() { // from class: l.emm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92228a.m185002t4(kmn0Var, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final xlm0 m184998o4(final BLiveVoiceCall bLiveVoiceCall, mqv<User> mqvVar) {
        return new xlm0(bLiveVoiceCall, mqvVar, ((nnn0) m206027E2()).mo149813j().liveMode).m209896I(new d30() { // from class: l.hmm0
            @Override // p149l.d30
            public final void call() {
                this.f108446a.m185003u4(bLiveVoiceCall);
            }
        }).m209897J(new e30() { // from class: l.imm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113945a.m184970C4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m184999p4(cmn0 cmn0Var) {
        int iM107682j = cmn0Var.m107682j();
        if (iM107682j != 1) {
            if (iM107682j == 2) {
                m184995l4(cmn0Var.m107677e(), cmn0Var.m107679g());
                return;
            }
            if (iM107682j != 3) {
                if (iM107682j != 6) {
                    if (iM107682j != 9 && iM107682j != 12 && iM107682j != 13) {
                        return;
                    }
                }
            }
            m184991D4(cmn0Var.m107677e());
            return;
        }
        this.f165360j.remove(cmn0Var.m107678f());
        m184994I4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m185000q4(boolean z) {
        if (z) {
            new xh0.C21150a(act()).m208730i(R$string.f46617Cg).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.omm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144672a.m185004v4(view);
                }
            }).m208726e(R$string.f46842N1).m208722a().m208721g();
        } else {
            duringCreated(VoiceRoomApiProvider.closeFreeCall(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.pmm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150242a.m185005w4((roj0) obj);
                }
            }, new e30() { // from class: l.qmm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    smm0.m184982f4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: s4 */
    public boolean m185001s4() {
        return btl0.m103863c(this.f188512e);
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ d1q m185002t4(kmn0 kmn0Var, BLiveVoiceCall bLiveVoiceCall) {
        return m184998o4(bLiveVoiceCall, kmn0Var.m146543h(bLiveVoiceCall.user));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m185003u4(BLiveVoiceCall bLiveVoiceCall) {
        m184996m4(bLiveVoiceCall.f44485id);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m185004v4(View view) {
        m184990B4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m185005w4(roj0 roj0Var) {
        ((nnn0) m206027E2()).mo149817n().freeCall = false;
        ((vmm0) this.viewModel).m198965m(false);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m185006x4(xpm0 xpm0Var) {
        m184996m4(xpm0Var.f193937a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ Boolean m185007y4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        return Boolean.valueOf(m206032L2() || ((nnn0) m206027E2()).m132091S0(""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m185008z4(roj0 roj0Var) {
        ((nnn0) m206027E2()).mo149817n().freeCall = true;
        ((vmm0) this.viewModel).m198965m(true);
    }
}
