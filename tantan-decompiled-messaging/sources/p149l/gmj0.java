package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class gmj0 extends h4t<nnn0, UndercoverMainView> {

    /* JADX INFO: renamed from: i */
    public nnj0 f103479i;

    /* JADX INFO: renamed from: j */
    public jmj0 f103480j;

    /* JADX INFO: renamed from: k */
    public omj0 f103481k;

    /* JADX INFO: renamed from: l */
    public rmj0 f103482l;

    /* JADX INFO: renamed from: m */
    public xmj0 f103483m;

    /* JADX INFO: renamed from: n */
    public cnj0 f103484n;

    /* JADX INFO: renamed from: o */
    public inj0 f103485o;

    /* JADX INFO: renamed from: p */
    public c4g0 f103486p;

    /* JADX INFO: renamed from: q */
    public llj0 f103487q;

    /* JADX INFO: renamed from: r */
    public BLiveUndercoverGame f103488r;

    /* JADX INFO: renamed from: s */
    public List<BLiveUserMask> f103489s;

    /* JADX WARN: Multi-variable type inference failed */
    public gmj0(bsm<? extends nnn0> bsmVar, UndercoverMainView undercoverMainView) {
        super(bsmVar);
        this.f103489s = new ArrayList();
        mo51532C(undercoverMainView);
        this.f103479i = new nnj0(bsmVar, (VFrame) this.viewModel, this);
        this.f103482l = new rmj0(bsmVar, (VFrame) this.viewModel);
        this.f103481k = new omj0(bsmVar, (VFrame) this.viewModel);
        this.f103484n = new cnj0(bsmVar, (VFrame) this.viewModel, this);
        this.f103485o = new inj0(bsmVar, (VFrame) this.viewModel, this);
        this.f103480j = new jmj0(bsmVar, (VFrame) this.viewModel);
        this.f103483m = new xmj0(bsmVar, (VFrame) this.viewModel, this);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m126986L3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m126989O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m127001n4(Integer num) {
        m127022w4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ Boolean m127002o4(Integer num) {
        return Boolean.valueOf(num.intValue() == 4 && this.f103487q != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m127003p4(Integer num) {
        m127004b4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m144512z2(this.f103479i);
        m144512z2(this.f103482l);
        m144512z2(this.f103481k);
        m144512z2(this.f103484n);
        m144512z2(this.f103485o);
        m144512z2(this.f103480j);
        m144512z2(this.f103483m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public void m127004b4() {
        duringCreated(klj0.m146416n(((nnn0) m206027E2()).m149814k(), this.f103488r.f44464id, "stop")).subscribe(ffw.m121194e(new e30() { // from class: l.slj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165233a.m127011i4((BLiveUndercoverGame) obj);
            }
        }, new e30() { // from class: l.tlj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171026a.m127012j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m127005c4() {
        this.f103488r = null;
        if (this.f103487q == null) {
            return;
        }
        c4g0 c4g0Var = this.f103486p;
        if (c4g0Var != null) {
            c4g0Var.unsubscribe();
            this.f103486p = null;
        }
        w8n0.m202192f().m202200k();
        ((UndercoverMainView) this.viewModel).m78155w(true);
        this.f103487q.m150496L3();
        this.f103487q = null;
        m206028F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo172463j(Boolean.TRUE);
        m206028F2().VoiceGameChangeEvent.stopVoiceGame().mo172463j(4);
    }

    /* JADX INFO: renamed from: d4 */
    public final mmj0 m127006d4(String str) {
        BLiveUndercoverGame bLiveUndercoverGame = this.f103488r;
        if (bLiveUndercoverGame == null || bLiveUndercoverGame.currentPlayers.size() == 0 || (this.f103487q instanceof nnj0)) {
            return null;
        }
        for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : this.f103488r.currentPlayers) {
            if (TextUtils.equals(str, bLiveUndercoverCurrentPlayer.userId)) {
                return new mmj0(bLiveUndercoverCurrentPlayer);
            }
        }
        return new mmj0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final int m127007e4() {
        if (((nnn0) m206027E2()).mo97490p()) {
            return 2;
        }
        return ((nnn0) m206027E2()).m160249P2().m102063l(ypv.f199493a.m199309D0()) != null ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final BLiveUserMask m127008f4(String str) {
        mqv<i54> mqvVarM102064m = ((nnn0) m206027E2()).m160249P2().m102064m(str);
        if (mqvVarM102064m == null) {
            return null;
        }
        return ((hxn0) mqvVarM102064m.m156004g()).f109896b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m127009g4() {
        List<BLiveVoiceCall> listM102067p = ((nnn0) m206027E2()).m160249P2().m102067p();
        this.f103489s = new ArrayList();
        vwb.m200354z(listM102067p, new e30() { // from class: l.wlj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186954a.m127013k4((BLiveVoiceCall) obj);
            }
        });
        llj0 llj0Var = this.f103487q;
        if ((llj0Var instanceof cnj0) || (llj0Var instanceof nnj0)) {
            llj0Var.m150497M3(this.f103488r, m127007e4(), this.f103489s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m127010h4() {
        c4g0 c4g0Var = this.f103486p;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f103486p = duringCreated(((nnn0) m206027E2()).m160251Q2()).subscribe(ffw.m121193d(new e30() { // from class: l.vlj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181956a.m127014l4((bik0.C15867a) obj);
                }
            }));
            m127009g4();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m127011i4(BLiveUndercoverGame bLiveUndercoverGame) {
        m127005c4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m127012j4(Throwable th) {
        m127005c4();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m127013k4(BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMaskM127008f4 = m127008f4(bLiveVoiceCall.user);
        if (bLiveUserMaskM127008f4 != null) {
            this.f103489s.add(bLiveUserMaskM127008f4);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m127014l4(bik0.C15867a c15867a) {
        m127009g4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m127015m4(BLiveUndercoverGame bLiveUndercoverGame) {
        m127023x4(bLiveUndercoverGame);
        m206028F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo172463j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m127016q4(iqv iqvVar) {
        m127005c4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m127017r4(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        m127020u4();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m127018s4(BLiveVoice bLiveVoice) {
        m127020u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (((nnn0) m206027E2()).mo97490p()) {
            duringCreated(m206028F2().VoiceGameChangeEvent.startVoiceGame().m172460g()).filter(new w9j() { // from class: l.olj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == 4);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.amj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70628a.m127001n4((Integer) obj);
                }
            }));
            duringCreated(m206028F2().VoiceGameChangeEvent.stopVoiceGame().m172460g()).filter(new w9j() { // from class: l.bmj0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f76287a.m127002o4((Integer) obj);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.cmj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81573a.m127003p4((Integer) obj);
                }
            }));
        } else {
            duringCreated(((nnn0) m206027E2()).m149815l()).filter(new n9t()).subscribe(ffw.m121197h(new e30() { // from class: l.dmj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86952a.m127016q4((iqv) obj);
                }
            }));
        }
        ((UndercoverMainView) this.viewModel).m78154v(((nnn0) m206027E2()).mo97490p());
        duringCreated(((nnn0) m206027E2()).m132160q1().f170419Y).map(new xkn0()).subscribe(ffw.m121193d(new emj0(this)));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189120l0()).subscribe(ffw.m121193d(new e30() { // from class: l.fmj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98305a.m127017r4((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160247O2().m165466d()).doOnNext(new e30() { // from class: l.plj0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((BLiveVoice) obj).template;
            }
        }).filter(new w9j() { // from class: l.xlj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveVoice bLiveVoice = (BLiveVoice) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(bLiveVoice.template) && VirtualVoiceMotionType.undercover.equals(bLiveVoice.template));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ylj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198900a.m127018s4((BLiveVoice) obj);
            }
        }));
        m129301d3(nmj0.class, new w9j() { // from class: l.zlj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203639a.m127019t4((nmj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ mmj0 m127019t4(nmj0 nmj0Var) {
        return m127006d4(nmj0Var.m160116e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m127020u4() {
        duringCreated(klj0.m146414l(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.qlj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155236a.m127015m4((BLiveUndercoverGame) obj);
            }
        }, new e30() { // from class: l.rlj0
            @Override // p149l.e30
            public final void call(Object obj) {
                gmj0.m126989O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public void m127021v4() {
        jp50.C17834a c17834a = new jp50.C17834a(9000);
        c17834a.m142598B(ddv.f85674x);
        c17834a.m142609z(1.0d, 0.44d);
        c17834a.m142603t(80);
        c17834a.m142602s(24);
        m206028F2().OpenH5Event.open().mo172463j(c17834a.m142600q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m127022w4() {
        duringCreated(klj0.m146415m(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new emj0(this), new e30() { // from class: l.ulj0
            @Override // p149l.e30
            public final void call(Object obj) {
                gmj0.m126986L3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public void m127023x4(BLiveUndercoverGame bLiveUndercoverGame) {
        bLiveUndercoverGame.toString();
        if (!TextUtils.isEmpty(bLiveUndercoverGame.toast)) {
            lsi0.m151595y(bLiveUndercoverGame.toast);
        }
        if (!"end".equals(bLiveUndercoverGame.status)) {
            w8n0.m202192f().m202198i(4);
        }
        this.f103488r = bLiveUndercoverGame;
        m127010h4();
        String str = bLiveUndercoverGame.status;
        str.getClass();
        switch (str) {
            case "questionAnnouncing":
                llj0 llj0Var = this.f103487q;
                if (llj0Var != null && !(llj0Var instanceof omj0) && !(llj0Var instanceof rmj0)) {
                    llj0Var.m150496L3();
                    if (m127007e4() == 0) {
                        this.f103487q = this.f103481k;
                    } else {
                        this.f103487q = this.f103482l;
                    }
                }
                m206028F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo172463j(Boolean.TRUE);
                break;
            case "speakingInTurn":
                llj0 llj0Var2 = this.f103487q;
                if (llj0Var2 != null && !(llj0Var2 instanceof cnj0)) {
                    llj0Var2.m150496L3();
                }
                this.f103487q = this.f103484n;
                break;
            case "voting":
                llj0 llj0Var3 = this.f103487q;
                if (llj0Var3 != null && !(llj0Var3 instanceof inj0)) {
                    llj0Var3.m150496L3();
                }
                this.f103487q = this.f103485o;
                break;
            case "end":
                m127005c4();
                break;
            case "votingResult":
                llj0 llj0Var4 = this.f103487q;
                if (llj0Var4 != null && !(llj0Var4 instanceof jmj0)) {
                    llj0Var4.m150496L3();
                }
                this.f103487q = this.f103480j;
                m206028F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo172463j(Boolean.TRUE);
                break;
            case "resultAnnouncing":
                llj0 llj0Var5 = this.f103487q;
                if (llj0Var5 != null && !(llj0Var5 instanceof xmj0)) {
                    llj0Var5.m150496L3();
                }
                this.f103487q = this.f103483m;
                break;
            case "waiting":
                llj0 llj0Var6 = this.f103487q;
                if (llj0Var6 != null && !(llj0Var6 instanceof nnj0)) {
                    llj0Var6.m150496L3();
                }
                this.f103487q = this.f103479i;
                m206028F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo172463j(Boolean.TRUE);
                break;
        }
        llj0 llj0Var7 = this.f103487q;
        if (llj0Var7 != null) {
            llj0Var7.m150495K3();
            ((UndercoverMainView) this.viewModel).m78155w(false);
            this.f103487q.m150497M3(bLiveUndercoverGame, m127007e4(), this.f103489s);
        }
    }
}
