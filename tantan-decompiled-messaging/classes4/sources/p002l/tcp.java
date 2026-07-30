package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C0464a;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.live.base.data.BLiveUserCompliance;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import l.bwr;
import l.d30;
import l.djt;
import l.e30;
import l.ffw;
import l.gkh0;
import l.i7n;
import l.l3f;
import l.lsi0;
import l.osi0;
import l.soj0;
import l.u6n;
import l.w9j;
import l.zvf0;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tcp extends x6s<ho2, ycp> implements C0464a.a {

    /* JADX INFO: renamed from: j */
    public C0464a f20183j;

    public tcp(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new ycp(bsmVar.f8332a, this));
        this.f20183j = new C0464a(bsmVar.f8332a);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m22854T3(e30 e30Var, Throwable th) {
        th.toString();
        gkh0.j("intl_sud_sdk", "load  sud sdk failed");
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m22860Z3(e30 e30Var, LoadEvent loadEvent) {
        if (loadEvent.c()) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ shj m22865e4(shj shjVar, BLiveUserCompliance bLiveUserCompliance) {
        return shjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m22867l4(soj0 soj0Var) {
        ((ycp) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m22868p4(c cVar) {
        if (cVar == c.i) {
            m22870g4(this.f20183j, new d30() { // from class: l.ocp
                public final void call() {
                    this.f16525a.m22875m4();
                }
            });
        } else if (cVar == c.j) {
            m22870g4(this.f20183j, new d30() { // from class: l.pcp
                public final void call() {
                    this.f17198a.m22876n4();
                }
            });
        } else if (cVar == c.m) {
            m22870g4(this.f20183j, new d30() { // from class: l.qcp
                public final void call() {
                    this.f17906a.m22877o4();
                }
            });
        }
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        this.f20183j.m8889w();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        l3fVar.n = "p_sudgames_game_start";
        zvf0.m(l3fVar);
    }

    /* JADX INFO: renamed from: T */
    public void m22869T() {
        super.T();
        djt.C();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C0464a.a
    /* JADX INFO: renamed from: Z */
    public void mo8909Z(View view) {
        ((ycp) ((bwr) this).viewModel).f22805m.addView(view, -1, -1);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m22870g4(C0464a c0464a, d30 d30Var) {
        if (NullChecker.a(c0464a)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m22871h4(final e30<Boolean> e30Var) {
        if (djt.v()) {
            e30Var.call(Boolean.TRUE);
        } else {
            duringCreated(djt.w()).subscribe(ffw.e(new e30() { // from class: l.icp
                public final void call(Object obj) {
                    tcp.m22860Z3(e30Var, (LoadEvent) obj);
                }
            }, new e30() { // from class: l.jcp
                public final void call(Object obj) {
                    tcp.m22854T3(e30Var, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m22872i4() {
        this.f20183j.m8898I(0L);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m22873j4(shj shjVar, Boolean bool) {
        if (!bool.booleanValue()) {
            lsi0.w(R$string.f2718F9);
            return;
        }
        ((ycp) ((bwr) this).viewModel).m26650L(shjVar);
        m22879r4();
        this.f20183j.m8872D(m25547E2().m17239o(), Long.parseLong(shjVar.m22472c()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m22874k4(final shj shjVar) {
        if (TextUtils.isEmpty(shjVar.m22472c())) {
            return;
        }
        m22871h4(new e30() { // from class: l.rcp
            public final void call(Object obj) {
                this.f18464a.m22873j4(shjVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m22875m4() {
        this.f20183j.m8892z();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C0464a.a
    /* JADX INFO: renamed from: n0 */
    public void mo8910n0() {
        m22878q4(new d30() { // from class: l.ncp
            public final void call() {
                this.f15947a.m22872i4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m22876n4() {
        this.f20183j.m8890x();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m22877o4() {
        this.f20183j.m8889w();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C0464a.a
    public void onGameDestroyed() {
        ((ycp) ((bwr) this).viewModel).mo5216p();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C0464a.a
    public void onGameStarted() {
        this.f22037f.getWindow().setSoftInputMode(19);
        if (u6n.a()) {
            osi0.f(R$string.f3519qc);
        } else {
            osi0.f(R$string.f3497pc);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m22878q4(final d30 d30Var) {
        m25548F2().FastRechargeEventGroup.showFastRechargeDialog().j(new nig.C0701a().m18781g(2).m18784j("liveIntlSudGame").m18780f(new d30() { // from class: l.hcp
            public final void call() {
                d30Var.call();
            }
        }).m18779e());
    }

    /* JADX INFO: renamed from: r4 */
    public final void m22879r4() {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = new GameViewInfoModel.GameViewRectModel();
        gameViewRectModel.left = 0;
        gameViewRectModel.top = 0;
        gameViewRectModel.right = 0;
        gameViewRectModel.bottom = 0;
        C0464a c0464a = this.f20183j;
        c0464a.f7039k = gameViewRectModel;
        GameConfigModel gameConfigModelM8896G = c0464a.m8896G();
        gameConfigModelM8896G.f7041ui.ping.hide = false;
        gameConfigModelM8896G.gameCPU = i7n.d() ? 1 : 0;
        SudMGP.getCfg().setShowLoadingGameBg(false);
    }

    /* JADX INFO: renamed from: t */
    public void m22880t() {
        super.t();
        this.f20183j.m8904O(this);
        duringCreated((rx.c) m25548F2().IntlSudGameEvent.show().g()).flatMap(new w9j() { // from class: l.fcp
            public final Object call(Object obj) {
                return IntlLivingNormalApiProvider.intlCheckUserCompliance().filter(new w9j() { // from class: l.scp
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((BLiveUserCompliance) obj2).isPass);
                    }
                }).map(new w9j() { // from class: l.gcp
                    public final Object call(Object obj2) {
                        return tcp.m22865e4(shjVar, (BLiveUserCompliance) obj2);
                    }
                });
            }
        }).subscribe(ffw.d(new e30() { // from class: l.kcp
            public final void call(Object obj) {
                this.f14280a.m22874k4((shj) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().IntlSudGameEvent.close().g()).subscribe(ffw.d(new e30() { // from class: l.lcp
            public final void call(Object obj) {
                this.f14766a.m22867l4((soj0) obj);
            }
        }));
        duringCreated(lifecycle().asObservable()).subscribe(ffw.d(new e30() { // from class: l.mcp
            public final void call(Object obj) {
                this.f15339a.m22868p4((c) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C0464a.a
    /* JADX INFO: renamed from: t0 */
    public void mo8912t0() {
        ((ycp) ((bwr) this).viewModel).f22805m.removeAllViews();
    }
}
