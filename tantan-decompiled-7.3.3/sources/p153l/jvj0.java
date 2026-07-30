package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverCurrentPlayer;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes5.dex */
public class jvj0 extends i6t<rwn0, UndercoverMainView> {

    /* JADX INFO: renamed from: i */
    public qwj0 f122804i;

    /* JADX INFO: renamed from: j */
    public mvj0 f122805j;

    /* JADX INFO: renamed from: k */
    public rvj0 f122806k;

    /* JADX INFO: renamed from: l */
    public uvj0 f122807l;

    /* JADX INFO: renamed from: m */
    public awj0 f122808m;

    /* JADX INFO: renamed from: n */
    public fwj0 f122809n;

    /* JADX INFO: renamed from: o */
    public lwj0 f122810o;

    /* JADX INFO: renamed from: p */
    public kcg0 f122811p;

    /* JADX INFO: renamed from: q */
    public ouj0 f122812q;

    /* JADX INFO: renamed from: r */
    public BLiveUndercoverGame f122813r;

    /* JADX INFO: renamed from: s */
    public List<BLiveUserMask> f122814s;

    /* JADX WARN: Multi-variable type inference failed */
    public jvj0(dum<? extends rwn0> dumVar, UndercoverMainView undercoverMainView) {
        super(dumVar);
        this.f122814s = new ArrayList();
        mo52715C(undercoverMainView);
        this.f122804i = new qwj0(dumVar, (VFrame) this.viewModel, this);
        this.f122807l = new uvj0(dumVar, (VFrame) this.viewModel);
        this.f122806k = new rvj0(dumVar, (VFrame) this.viewModel);
        this.f122809n = new fwj0(dumVar, (VFrame) this.viewModel, this);
        this.f122810o = new lwj0(dumVar, (VFrame) this.viewModel, this);
        this.f122805j = new mvj0(dumVar, (VFrame) this.viewModel);
        this.f122808m = new awj0(dumVar, (VFrame) this.viewModel, this);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m147040L3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m147043O3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m147055n4(Integer num) {
        m147076w4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ Boolean m147056o4(Integer num) {
        return Boolean.valueOf(num.intValue() == 4 && this.f122812q != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m147057p4(Integer num) {
        m147058b4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m153103z2(this.f122804i);
        m153103z2(this.f122807l);
        m153103z2(this.f122806k);
        m153103z2(this.f122809n);
        m153103z2(this.f122810o);
        m153103z2(this.f122805j);
        m153103z2(this.f122808m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public void m147058b4() {
        duringCreated(nuj0.m164809n(((rwn0) m213810E2()).m202191k(), this.f122813r.f45312id, "stop")).subscribe(dhw.m115826e(new y20() { // from class: l.vuj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185820a.m147065i4((BLiveUndercoverGame) obj);
            }
        }, new y20() { // from class: l.wuj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190869a.m147066j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m147059c4() {
        this.f122813r = null;
        if (this.f122812q == null) {
            return;
        }
        kcg0 kcg0Var = this.f122811p;
        if (kcg0Var != null) {
            kcg0Var.unsubscribe();
            this.f122811p = null;
        }
        ain0.m98000f().m98008k();
        ((UndercoverMainView) this.viewModel).m79338w(true);
        this.f122812q.m169314L3();
        this.f122812q = null;
        m213811F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo199273j(Boolean.TRUE);
        m213811F2().VoiceGameChangeEvent.stopVoiceGame().mo199273j(4);
    }

    /* JADX INFO: renamed from: d4 */
    public final pvj0 m147060d4(String str) {
        BLiveUndercoverGame bLiveUndercoverGame = this.f122813r;
        if (bLiveUndercoverGame == null || bLiveUndercoverGame.currentPlayers.size() == 0 || (this.f122812q instanceof qwj0)) {
            return null;
        }
        for (BLiveUndercoverCurrentPlayer bLiveUndercoverCurrentPlayer : this.f122813r.currentPlayers) {
            if (TextUtils.equals(str, bLiveUndercoverCurrentPlayer.userId)) {
                return new pvj0(bLiveUndercoverCurrentPlayer);
            }
        }
        return new pvj0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final int m147061e4() {
        if (((rwn0) m213810E2()).mo118373p()) {
            return 2;
        }
        return ((rwn0) m213810E2()).m183411P2().m136873l(zrv.f205799a.m207631D0()) != null ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final BLiveUserMask m147062f4(String str) {
        nsv<h64> nsvVarM136874m = ((rwn0) m213810E2()).m183411P2().m136874m(str);
        if (nsvVarM136874m == null) {
            return null;
        }
        return ((l6o0) nsvVarM136874m.m164642g()).f130275b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m147063g4() {
        List<BLiveVoiceCall> listM136877p = ((rwn0) m213810E2()).m183411P2().m136877p();
        this.f122814s = new ArrayList();
        jyb.m147537z(listM136877p, new y20() { // from class: l.zuj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206130a.m147067k4((BLiveVoiceCall) obj);
            }
        });
        ouj0 ouj0Var = this.f122812q;
        if ((ouj0Var instanceof fwj0) || (ouj0Var instanceof qwj0)) {
            ouj0Var.m169315M3(this.f122813r, m147061e4(), this.f122814s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m147064h4() {
        kcg0 kcg0Var = this.f122811p;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f122811p = duringCreated(((rwn0) m213810E2()).m183413Q2()).subscribe(dhw.m115825d(new y20() { // from class: l.yuj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201622a.m147068l4((hrk0.C17564a) obj);
                }
            }));
            m147063g4();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m147065i4(BLiveUndercoverGame bLiveUndercoverGame) {
        m147059c4();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m147066j4(Throwable th) {
        m147059c4();
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m147067k4(BLiveVoiceCall bLiveVoiceCall) {
        BLiveUserMask bLiveUserMaskM147062f4 = m147062f4(bLiveVoiceCall.user);
        if (bLiveUserMaskM147062f4 != null) {
            this.f122814s.add(bLiveUserMaskM147062f4);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m147068l4(hrk0.C17564a c17564a) {
        m147063g4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m147069m4(BLiveUndercoverGame bLiveUndercoverGame) {
        m147077x4(bLiveUndercoverGame);
        m213811F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo199273j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m147070q4(jsv jsvVar) {
        m147059c4();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m147071r4(VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        m147074u4();
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m147072s4(BLiveVoice bLiveVoice) {
        m147074u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (((rwn0) m213810E2()).mo118373p()) {
            duringCreated(m213811F2().VoiceGameChangeEvent.startVoiceGame().m199270g()).filter(new qcj() { // from class: l.ruj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == 4);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.dvj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90930a.m147055n4((Integer) obj);
                }
            }));
            duringCreated(m213811F2().VoiceGameChangeEvent.stopVoiceGame().m199270g()).filter(new qcj() { // from class: l.evj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f96005a.m147056o4((Integer) obj);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.fvj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101045a.m147057p4((Integer) obj);
                }
            }));
        } else {
            duringCreated(((rwn0) m213810E2()).m202192l()).filter(new obt()).subscribe(dhw.m115829h(new y20() { // from class: l.gvj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106650a.m147070q4((jsv) obj);
                }
            }));
        }
        ((UndercoverMainView) this.viewModel).m79337v(((rwn0) m213810E2()).mo118373p());
        duringCreated(((rwn0) m213810E2()).m168545q1().f71686Y).map(new bun0()).subscribe(dhw.m115825d(new hvj0(this)));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98302l0()).subscribe(dhw.m115825d(new y20() { // from class: l.ivj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117081a.m147071r4((VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183409O2().m188658d()).doOnNext(new y20() { // from class: l.suj0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((BLiveVoice) obj).template;
            }
        }).filter(new qcj() { // from class: l.avj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveVoice bLiveVoice = (BLiveVoice) obj;
                return Boolean.valueOf(!TextUtils.isEmpty(bLiveVoice.template) && VirtualVoiceMotionType.undercover.equals(bLiveVoice.template));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.bvj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78602a.m147072s4((BLiveVoice) obj);
            }
        }));
        m138860d3(qvj0.class, new qcj() { // from class: l.cvj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84009a.m147073t4((qvj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ pvj0 m147073t4(qvj0 qvj0Var) {
        return m147060d4(qvj0Var.m178301e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m147074u4() {
        duringCreated(nuj0.m164807l(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.tuj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176195a.m147069m4((BLiveUndercoverGame) obj);
            }
        }, new y20() { // from class: l.uuj0
            @Override // p153l.y20
            public final void call(Object obj) {
                jvj0.m147043O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public void m147075v4() {
        px50.C19461a c19461a = new px50.C19461a(9000);
        c19461a.m174141B(efv.f93867x);
        c19461a.m174152z(1.0d, 0.44d);
        c19461a.m174146t(80);
        c19461a.m174145s(24);
        m213811F2().OpenH5Event.open().mo199273j(c19461a.m174143q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m147076w4() {
        duringCreated(nuj0.m164808m(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new hvj0(this), new y20() { // from class: l.xuj0
            @Override // p153l.y20
            public final void call(Object obj) {
                jvj0.m147040L3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public void m147077x4(BLiveUndercoverGame bLiveUndercoverGame) {
        bLiveUndercoverGame.toString();
        if (!TextUtils.isEmpty(bLiveUndercoverGame.toast)) {
            o1j0.m165651y(bLiveUndercoverGame.toast);
        }
        if (!"end".equals(bLiveUndercoverGame.status)) {
            ain0.m98000f().m98006i(4);
        }
        this.f122813r = bLiveUndercoverGame;
        m147064h4();
        String str = bLiveUndercoverGame.status;
        str.getClass();
        switch (str) {
            case "questionAnnouncing":
                ouj0 ouj0Var = this.f122812q;
                if (ouj0Var != null && !(ouj0Var instanceof rvj0) && !(ouj0Var instanceof uvj0)) {
                    ouj0Var.m169314L3();
                    if (m147061e4() == 0) {
                        this.f122812q = this.f122806k;
                    } else {
                        this.f122812q = this.f122807l;
                    }
                }
                m213811F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo199273j(Boolean.TRUE);
                break;
            case "speakingInTurn":
                ouj0 ouj0Var2 = this.f122812q;
                if (ouj0Var2 != null && !(ouj0Var2 instanceof fwj0)) {
                    ouj0Var2.m169314L3();
                }
                this.f122812q = this.f122809n;
                break;
            case "voting":
                ouj0 ouj0Var3 = this.f122812q;
                if (ouj0Var3 != null && !(ouj0Var3 instanceof lwj0)) {
                    ouj0Var3.m169314L3();
                }
                this.f122812q = this.f122810o;
                break;
            case "end":
                m147059c4();
                break;
            case "votingResult":
                ouj0 ouj0Var4 = this.f122812q;
                if (ouj0Var4 != null && !(ouj0Var4 instanceof mvj0)) {
                    ouj0Var4.m169314L3();
                }
                this.f122812q = this.f122805j;
                m213811F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo199273j(Boolean.TRUE);
                break;
            case "resultAnnouncing":
                ouj0 ouj0Var5 = this.f122812q;
                if (ouj0Var5 != null && !(ouj0Var5 instanceof awj0)) {
                    ouj0Var5.m169314L3();
                }
                this.f122812q = this.f122808m;
                break;
            case "waiting":
                ouj0 ouj0Var6 = this.f122812q;
                if (ouj0Var6 != null && !(ouj0Var6 instanceof qwj0)) {
                    ouj0Var6.m169314L3();
                }
                this.f122812q = this.f122804i;
                m213811F2().UndercoverPlayerChangeEvent.undercoverPlayerChange().mo199273j(Boolean.TRUE);
                break;
        }
        ouj0 ouj0Var7 = this.f122812q;
        if (ouj0Var7 != null) {
            ouj0Var7.m169313K3();
            ((UndercoverMainView) this.viewModel).m79338w(false);
            this.f122812q.m169315M3(bLiveUndercoverGame, m147061e4(), this.f122814s);
        }
    }
}
