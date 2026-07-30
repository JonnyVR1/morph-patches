package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCompliance;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: classes5.dex */
public class tep extends y8s<oo2, yep> implements C13038a.a {

    /* JADX INFO: renamed from: j */
    public C13038a f173888j;

    public tep(dum<? extends oo2> dumVar) {
        super(dumVar);
        mo52715C(new yep(dumVar.f90815a, this));
        this.f173888j = new C13038a(dumVar.f90815a);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m190866T3(y20 y20Var, Throwable th) {
        th.toString();
        nsh0.m164608j("intl_sud_sdk", "load  sud sdk failed");
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m190872Z3(y20 y20Var, LoadEvent loadEvent) {
        if (loadEvent.m82621c()) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ mkj m190877e4(mkj mkjVar, BLiveUserCompliance bLiveUserCompliance) {
        return mkjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m190879l4(vxj0 vxj0Var) {
        ((yep) this.viewModel).mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m190880p4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m190881g4(this.f173888j, new x20() { // from class: l.oep
                @Override // p153l.x20
                public final void call() {
                    this.f147008a.m190886m4();
                }
            });
        } else if (c4470c == C4470c.f16268j) {
            m190881g4(this.f173888j, new x20() { // from class: l.pep
                @Override // p153l.x20
                public final void call() {
                    this.f152114a.m190887n4();
                }
            });
        } else if (c4470c == C4470c.f16271m) {
            m190881g4(this.f173888j, new x20() { // from class: l.qep
                @Override // p153l.x20
                public final void call() {
                    this.f157197a.m190888o4();
                }
            });
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        this.f173888j.m76453w();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_sudgames_game_start";
        i4g0.m138515m(q4fVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        elt.m121259C();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: Z */
    public void mo76473Z(View view) {
        ((yep) this.viewModel).f199390m.addView(view, -1, -1);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m190881g4(C13038a c13038a, x20 x20Var) {
        if (NullChecker.m82486a(c13038a)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m190882h4(final y20<Boolean> y20Var) {
        if (elt.m121284v()) {
            y20Var.call(Boolean.TRUE);
        } else {
            duringCreated(elt.m121285w()).subscribe(dhw.m115826e(new y20() { // from class: l.iep
                @Override // p153l.y20
                public final void call(Object obj) {
                    tep.m190872Z3(y20Var, (LoadEvent) obj);
                }
            }, new y20() { // from class: l.jep
                @Override // p153l.y20
                public final void call(Object obj) {
                    tep.m190866T3(y20Var, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m190883i4() {
        this.f173888j.m76462I(0L);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m190884j4(mkj mkjVar, Boolean bool) {
        if (!bool.booleanValue()) {
            o1j0.m165649w(R$string.f47524F9);
            return;
        }
        ((yep) this.viewModel).m215441L(mkjVar);
        m190890r4();
        this.f173888j.m76436D(m213810E2().m202194o(), Long.parseLong(mkjVar.m158794c()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m190885k4(final mkj mkjVar) {
        if (TextUtils.isEmpty(mkjVar.m158794c())) {
            return;
        }
        m190882h4(new y20() { // from class: l.rep
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162664a.m190884j4(mkjVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m190886m4() {
        this.f173888j.m76456z();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: n0 */
    public void mo76474n0() {
        m190889q4(new x20() { // from class: l.nep
            @Override // p153l.x20
            public final void call() {
                this.f141672a.m190883i4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m190887n4() {
        this.f173888j.m76454x();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m190888o4() {
        this.f173888j.m76453w();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    public void onGameDestroyed() {
        ((yep) this.viewModel).mo73021p();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    public void onGameStarted() {
        this.f196919f.getWindow().setSoftInputMode(19);
        if (u8n.m195065a()) {
            r1j0.m179419f(R$string.f48325qc);
        } else {
            r1j0.m179419f(R$string.f48303pc);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m190889q4(final x20 x20Var) {
        m213811F2().FastRechargeEventGroup.showFastRechargeDialog().mo199273j(new bkg.C16028a().m104805g(2).m104808j("liveIntlSudGame").m104804f(new x20() { // from class: l.hep
            @Override // p153l.x20
            public final void call() {
                x20Var.call();
            }
        }).m104803e());
    }

    /* JADX INFO: renamed from: r4 */
    public final void m190890r4() {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = new GameViewInfoModel.GameViewRectModel();
        gameViewRectModel.left = 0;
        gameViewRectModel.top = 0;
        gameViewRectModel.right = 0;
        gameViewRectModel.bottom = 0;
        C13038a c13038a = this.f173888j;
        c13038a.f51845k = gameViewRectModel;
        GameConfigModel gameConfigModelM76460G = c13038a.m76460G();
        gameConfigModelM76460G.f51847ui.ping.hide = false;
        gameConfigModelM76460G.gameCPU = i9n.m139129d() ? 1 : 0;
        SudMGP.getCfg().setShowLoadingGameBg(false);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        this.f173888j.m76468O(this);
        duringCreated(m213811F2().IntlSudGameEvent.show().m199270g()).flatMap(new qcj() { // from class: l.fep
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLivingNormalApiProvider.intlCheckUserCompliance().filter(new qcj() { // from class: l.sep
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((BLiveUserCompliance) obj2).isPass);
                    }
                }).map(new qcj() { // from class: l.gep
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return tep.m190877e4(mkjVar, (BLiveUserCompliance) obj2);
                    }
                });
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.kep
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126205a.m190885k4((mkj) obj);
            }
        }));
        duringCreated(m213811F2().IntlSudGameEvent.close().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.lep
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131771a.m190879l4((vxj0) obj);
            }
        }));
        duringCreated(lifecycle().asObservable()).subscribe(dhw.m115825d(new y20() { // from class: l.mep
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136551a.m190880p4((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: t0 */
    public void mo76476t0() {
        ((yep) this.viewModel).f199390m.removeAllViews();
    }
}
