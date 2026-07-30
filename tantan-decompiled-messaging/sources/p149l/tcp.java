package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCompliance;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: classes4.dex */
public class tcp extends x6s<ho2, ycp> implements C12875a.a {

    /* JADX INFO: renamed from: j */
    public C12875a f169468j;

    public tcp(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        mo51532C(new ycp(bsmVar.f77095a, this));
        this.f169468j = new C12875a(bsmVar.f77095a);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m188027T3(e30 e30Var, Throwable th) {
        th.toString();
        gkh0.m126627j("intl_sud_sdk", "load  sud sdk failed");
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m188033Z3(e30 e30Var, LoadEvent loadEvent) {
        if (loadEvent.m81438c()) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static /* synthetic */ shj m188038e4(shj shjVar, BLiveUserCompliance bLiveUserCompliance) {
        return shjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m188040l4(soj0 soj0Var) {
        ((ycp) this.viewModel).mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m188041p4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m188042g4(this.f169468j, new d30() { // from class: l.ocp
                @Override // p149l.d30
                public final void call() {
                    this.f143070a.m188047m4();
                }
            });
        } else if (c4319c == C4319c.f15549j) {
            m188042g4(this.f169468j, new d30() { // from class: l.pcp
                @Override // p149l.d30
                public final void call() {
                    this.f148204a.m188048n4();
                }
            });
        } else if (c4319c == C4319c.f15552m) {
            m188042g4(this.f169468j, new d30() { // from class: l.qcp
                @Override // p149l.d30
                public final void call() {
                    this.f153781a.m188049o4();
                }
            });
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        this.f169468j.m75270w();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_sudgames_game_start";
        zvf0.m220391m(l3fVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        djt.m112114C();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: Z */
    public void mo75290Z(View view) {
        ((ycp) this.viewModel).f197473m.addView(view, -1, -1);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m188042g4(C12875a c12875a, d30 d30Var) {
        if (NullChecker.m81303a(c12875a)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m188043h4(final e30<Boolean> e30Var) {
        if (djt.m112139v()) {
            e30Var.call(Boolean.TRUE);
        } else {
            duringCreated(djt.m112140w()).subscribe(ffw.m121194e(new e30() { // from class: l.icp
                @Override // p149l.e30
                public final void call(Object obj) {
                    tcp.m188033Z3(e30Var, (LoadEvent) obj);
                }
            }, new e30() { // from class: l.jcp
                @Override // p149l.e30
                public final void call(Object obj) {
                    tcp.m188027T3(e30Var, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m188044i4() {
        this.f169468j.m75279I(0L);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m188045j4(shj shjVar, Boolean bool) {
        if (!bool.booleanValue()) {
            lsi0.m151593w(R$string.f46676F9);
            return;
        }
        ((ycp) this.viewModel).m214189L(shjVar);
        m188051r4();
        this.f169468j.m75253D(m206027E2().m149818o(), Long.parseLong(shjVar.m184195c()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m188046k4(final shj shjVar) {
        if (TextUtils.isEmpty(shjVar.m184195c())) {
            return;
        }
        m188043h4(new e30() { // from class: l.rcp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158803a.m188045j4(shjVar, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m188047m4() {
        this.f169468j.m75273z();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: n0 */
    public void mo75291n0() {
        m188050q4(new d30() { // from class: l.ncp
            @Override // p149l.d30
            public final void call() {
                this.f138219a.m188044i4();
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m188048n4() {
        this.f169468j.m75271x();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m188049o4() {
        this.f169468j.m75270w();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    public void onGameDestroyed() {
        ((ycp) this.viewModel).mo71838p();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    public void onGameStarted() {
        this.f188513f.getWindow().setSoftInputMode(19);
        if (u6n.m192015a()) {
            osi0.m165782f(R$string.f47477qc);
        } else {
            osi0.m165782f(R$string.f47455pc);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m188050q4(final d30 d30Var) {
        m206028F2().FastRechargeEventGroup.showFastRechargeDialog().mo172463j(new nig.C18699a().m159507g(2).m159510j("liveIntlSudGame").m159506f(new d30() { // from class: l.hcp
            @Override // p149l.d30
            public final void call() {
                d30Var.call();
            }
        }).m159505e());
    }

    /* JADX INFO: renamed from: r4 */
    public final void m188051r4() {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = new GameViewInfoModel.GameViewRectModel();
        gameViewRectModel.left = 0;
        gameViewRectModel.top = 0;
        gameViewRectModel.right = 0;
        gameViewRectModel.bottom = 0;
        C12875a c12875a = this.f169468j;
        c12875a.f50997k = gameViewRectModel;
        GameConfigModel gameConfigModelM75277G = c12875a.m75277G();
        gameConfigModelM75277G.f50999ui.ping.hide = false;
        gameConfigModelM75277G.gameCPU = i7n.m134918d() ? 1 : 0;
        SudMGP.getCfg().setShowLoadingGameBg(false);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        this.f169468j.m75285O(this);
        duringCreated(m206028F2().IntlSudGameEvent.show().m172460g()).flatMap(new w9j() { // from class: l.fcp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLivingNormalApiProvider.intlCheckUserCompliance().filter(new w9j() { // from class: l.scp
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((BLiveUserCompliance) obj2).isPass);
                    }
                }).map(new w9j() { // from class: l.gcp
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return tcp.m188038e4(shjVar, (BLiveUserCompliance) obj2);
                    }
                });
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.kcp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122503a.m188046k4((shj) obj);
            }
        }));
        duringCreated(m206028F2().IntlSudGameEvent.close().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lcp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127439a.m188040l4((soj0) obj);
            }
        }));
        duringCreated(lifecycle().asObservable()).subscribe(ffw.m121193d(new e30() { // from class: l.mcp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133174a.m188041p4((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: t0 */
    public void mo75293t0() {
        ((ycp) this.viewModel).f197473m.removeAllViews();
    }
}
