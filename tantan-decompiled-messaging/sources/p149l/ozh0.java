package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.H5MerchandiseData;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.WalletAccount;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinFrag;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.IsCurrencyMerchantData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ozh0 extends jq2<e0i0> {

    /* JADX INFO: renamed from: a */
    public TanTanCoinFrag f146441a;

    /* JADX INFO: renamed from: b */
    public boolean f146442b;

    /* JADX INFO: renamed from: c */
    public c4g0 f146443c;

    /* JADX INFO: renamed from: d */
    public long f146444d;

    /* JADX INFO: renamed from: e */
    public int f146445e;

    /* JADX INFO: renamed from: f */
    public List<Privilege> f146446f;

    /* JADX INFO: renamed from: g */
    public View.OnClickListener f146447g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f146448h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f146449i;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f146450j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f146451k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f146452l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f146453m;

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f146454n;

    public ozh0(mcr mcrVar, TanTanCoinFrag tanTanCoinFrag) {
        ArrayList arrayListM200339n;
        super(mcrVar);
        boolean zMo33808c = CoreModule.f17557o.m195057d().mo33808c();
        this.f146442b = zMo33808c;
        if (zMo33808c) {
            ArrayList arrayListM200324f0 = vwb.m200324f0(Privilege.immediately_match, Privilege.boost, Privilege.vip_super_like, Privilege.online_match_tickets_extra, Privilege.see_greet_gp, Privilege.letter, Privilege.compliment);
            final CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
            Objects.requireNonNull(coreBusinessServiceM94651a);
            arrayListM200339n = vwb.m200339n(arrayListM200324f0, new w9j() { // from class: l.oyh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(coreBusinessServiceM94651a.mo33355Ks((Privilege) obj));
                }
            });
        } else {
            ArrayList arrayListM200324f1 = vwb.m200324f0(Privilege.immediately_match, Privilege.boost, Privilege.vip_super_like, Privilege.see_greet_gp, Privilege.vip_letter_gp, Privilege.see_letter_gp, Privilege.letter, Privilege.compliment);
            final CoreBusinessService coreBusinessServiceM94651a2 = CoreModule.m29935P().m94651a();
            Objects.requireNonNull(coreBusinessServiceM94651a2);
            arrayListM200339n = vwb.m200339n(arrayListM200324f1, new w9j() { // from class: l.oyh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(coreBusinessServiceM94651a2.mo33355Ks((Privilege) obj));
                }
            });
        }
        this.f146446f = arrayListM200339n;
        this.f146447g = new View.OnClickListener() { // from class: l.pyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151856a.m166802n1(view);
            }
        };
        this.f146448h = new View.OnClickListener() { // from class: l.qyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156926a.m166804o1(view);
            }
        };
        this.f146449i = new View.OnClickListener() { // from class: l.ryh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161560a.m166806p1(view);
            }
        };
        this.f146450j = new View.OnClickListener() { // from class: l.syh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166960a.m166808q1(view);
            }
        };
        this.f146451k = new View.OnClickListener() { // from class: l.tyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172601a.m166812t1(view);
            }
        };
        this.f146452l = new View.OnClickListener() { // from class: l.uyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178864a.m166814u1(view);
            }
        };
        this.f146453m = new View.OnClickListener() { // from class: l.vyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183528a.m166815v1(view);
            }
        };
        this.f146454n = new View.OnClickListener() { // from class: l.wyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188567a.m166839x1(view);
            }
        };
        this.f146441a = tanTanCoinFrag;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m166782N0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m166788d1(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((e0i0) v2).m114289f0();
        } else {
            ((e0i0) v2).m114277Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m166790e1(Throwable th) {
        ((e0i0) this.viewModel).m114277Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public /* synthetic */ void m166797k1(roj0 roj0Var) {
        ((e0i0) this.viewModel).m114288e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m166799l1(Throwable th) {
        ((e0i0) this.viewModel).m114276P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m166802n1(View view) {
        CoreModule.m29936Q().getH5PageApi().mo133118d(act());
        zvf0.m220396r("e_live_income_button", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m166804o1(View view) {
        CoreModule.m29936Q().getH5PageApi().mo133117c(act());
        zvf0.m220396r("e_bill_record", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m166806p1(View view) {
        CoreModule.m29936Q().getH5PageApi().mo133115a(act());
        zvf0.m220396r("e_live_my_level", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m166808q1(View view) {
        kkp0.m146350c(act(), this.f146441a.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m166812t1(View view) {
        act().progress(R$string.f27301T1, true);
        duringCreated(CoreModule.f17545c.f19604S0.m34187w3()).subscribe(mkd0.m154956H(new e30() { // from class: l.dzh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88484a.m166837r1((PaymentData) obj);
            }
        }, new e30() { // from class: l.ezh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93900a.m166838s1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m166814u1(View view) {
        CoreModule.m29936Q().getH5PageApi().mo133116b(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m166815v1(View view) {
        zvf0.m220396r("e_bill_red_packet", OMSDialogPositon.p_wallet);
        act().startActivity(MkWebViewAct.m80236a2(act(), "红包记录", C4728a.m31272Z("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/red_package/index.html?speed=true&_bid=1005143#/red_package")));
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m166818z0(Envelope envelope) {
        osi0.m165782f(envelope.meta.code == 200 ? R$string.f27362Y7 : R$string.f27351X7);
        CoreModule.f17545c.f19570H0.m210361k5();
        CoreModule.f17545c.f19573I0.m140260N3();
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m166819B1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: C1 */
    public void m166820C1() {
        duringCreated(CoreModule.f17545c.f19570H0.m210321B5()).subscribe(mkd0.m154956H(new e30() { // from class: l.fzh0
            @Override // p149l.e30
            public final void call(Object obj) {
                ozh0.m166818z0((Envelope) obj);
            }
        }, new e30() { // from class: l.gzh0
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165782f(R$string.f27351X7);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public void m166821D1(boolean z) {
        if (z) {
            act().progress(R$string.f27301T1, true);
            duringCreated(CoreModule.f17545c.f19604S0.m34187w3()).subscribe(mkd0.m154956H(new e30() { // from class: l.yyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200773a.m166840z1((PaymentData) obj);
                }
            }, new e30() { // from class: l.zyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f205680a.m166819B1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m166822E1(String str) {
        CoreModule.m29936Q().getH5PageApi().mo133119e(act(), str);
    }

    /* JADX INFO: renamed from: U0 */
    public void m166823U0(boolean z) {
        ((e0i0) this.viewModel).m114292r();
        if (CoreModule.m29935P().m94651a().mo33442Xi() && !xma.m210047L3() && xma.m210087m4() && xma.m210077h4() && h6a.m129474g()) {
            this.f146443c = duringCreated(mkd0.m154984r(CoreModule.f17545c.f19604S0.m34184s3(), CoreModule.f17545c.f19604S0.m34185t3(), new x9j() { // from class: l.azh0
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return j760.m140076a((H5MerchandiseData) obj, (List) obj2);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.bzh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78034a.m166836m1((j760) obj);
                }
            }, new e30() { // from class: l.czh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ozh0.m166782N0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m166824V0(Bundle bundle) {
        this.f146441a.setHasOptionsMenu(true);
        act().setTitle(R$string.f27459ga);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m166825W0(IsCurrencyMerchantData isCurrencyMerchantData) {
        ((e0i0) this.viewModel).m114286c0(isCurrencyMerchantData.isCoiner);
        ((e0i0) this.viewModel).m114287d0(isCurrencyMerchantData.isDiamondCoiner);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m166826X0(Coin coin) {
        ((e0i0) this.viewModel).m114273M(swh0.m186215U(coin.available));
        ((e0i0) this.viewModel).m114272L(swh0.m186215U(coin.merchantAvailable));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m166827Y0(Long l2) {
        ((e0i0) this.viewModel).m114274N(l2.longValue());
        ((e0i0) this.viewModel).m114284a0(CoreModule.f17545c.f19573I0.m140249C3());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19570H0.m210361k5();
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140262P3();
        }
        if (CoreModule.m29935P().m94651a().mo33507h5()) {
            CoreModule.f17545c.f19570H0.m210365m5();
        }
        if (CoreModule.m29934N().mo60267Co()) {
            this.f146446f.remove(Privilege.letter);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.byh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77921a.m166824V0((Bundle) obj);
            }
        });
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19573I0.m140250D3());
        e30 e30Var = new e30() { // from class: l.dyh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88393a.m166825W0((IsCurrencyMerchantData) obj);
            }
        };
        final CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
        Objects.requireNonNull(coreBusinessServiceM94651a);
        c22306cDuringCreated.subscribe(mkd0.m154956H(e30Var, new e30() { // from class: l.myh0
            @Override // p149l.e30
            public final void call(Object obj) {
                coreBusinessServiceM94651a.mo33605uo((Throwable) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated2 = duringCreated(CoreModule.f17545c.f19570H0.m210386x4());
        e30 e30Var2 = new e30() { // from class: l.iyh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115459a.m166826X0((Coin) obj);
            }
        };
        final CoreBusinessService coreBusinessServiceM94651a2 = CoreModule.m29935P().m94651a();
        Objects.requireNonNull(coreBusinessServiceM94651a2);
        c22306cDuringCreated2.subscribe(mkd0.m154956H(e30Var2, new e30() { // from class: l.myh0
            @Override // p149l.e30
            public final void call(Object obj) {
                coreBusinessServiceM94651a2.mo33605uo((Throwable) obj);
            }
        }));
        if (CoreModule.m29932K().mo30835xf()) {
            C22306c map = duringCreated(CoreModule.f17545c.f19573I0.m140260N3()).map(new w9j() { // from class: l.jyh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Long.valueOf(CoreModule.f17545c.f19573I0.m140257K3());
                }
            });
            e30 e30Var3 = new e30() { // from class: l.kyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125308a.m166827Y0((Long) obj);
                }
            };
            final CoreBusinessService coreBusinessServiceM94651a3 = CoreModule.m29935P().m94651a();
            Objects.requireNonNull(coreBusinessServiceM94651a3);
            map.subscribe(mkd0.m154956H(e30Var3, new e30() { // from class: l.myh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    coreBusinessServiceM94651a3.mo33605uo((Throwable) obj);
                }
            }));
            C22306c map2 = duringCreated(CoreModule.f17545c.f19573I0.m140259M3()).map(new w9j() { // from class: l.lyh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Long.valueOf(((IntlCurrencyDiamond) obj).available);
                }
            });
            e30 e30Var4 = new e30() { // from class: l.nyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141119a.m166828a1((Long) obj);
                }
            };
            final CoreBusinessService coreBusinessServiceM94651a4 = CoreModule.m29935P().m94651a();
            Objects.requireNonNull(coreBusinessServiceM94651a4);
            map2.subscribe(mkd0.m154956H(e30Var4, new e30() { // from class: l.myh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    coreBusinessServiceM94651a4.mo33605uo((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19570H0.m210383v5()).subscribe(mkd0.m154956H(new e30() { // from class: l.xyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195052a.m166829b1((j760) obj);
                }
            }, new e30() { // from class: l.hzh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110198a.m166830c1((Throwable) obj);
                }
            }));
        }
        duringCreated(CoreModule.f17545c.f19570H0.m210381u5()).subscribe(mkd0.m154956H(new e30() { // from class: l.izh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115573a.m166788d1((Boolean) obj);
            }
        }, new e30() { // from class: l.jzh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120392a.m166790e1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19570H0.m210349a5()).subscribe(mkd0.m154955G(new e30() { // from class: l.kzh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125384a.m166831f1((Coin) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.lzh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.mzh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136385a.m166832g1((C4319c) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.nzh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.cyh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82989a.m166833h1((C4319c) obj);
            }
        }));
        if (CoreModule.m29935P().m94651a().mo33507h5()) {
            duringCreated(CoreModule.f17545c.f19570H0.m210327E5()).subscribe(mkd0.m154956H(new e30() { // from class: l.eyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f93753a.m166834i1((Optional) obj);
                }
            }, new e30() { // from class: l.fyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99874a.m166835j1((Throwable) obj);
                }
            }));
        }
        if (CoreModule.m29936Q().mo67255a().mo124835b()) {
            duringCreated(CoreModule.f17545c.f19570H0.m210385w5()).subscribe(mkd0.m154956H(new e30() { // from class: l.gyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f105018a.m166797k1((roj0) obj);
                }
            }, new e30() { // from class: l.hyh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110120a.m166799l1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m166828a1(Long l2) {
        ((e0i0) this.viewModel).m114274N(l2.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m166829b1(j760 j760Var) {
        this.f146445e = ((Integer) j760Var.f116565b).intValue();
        ((e0i0) this.viewModel).m114291h0(((Boolean) j760Var.f116564a).booleanValue());
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m166830c1(Throwable th) {
        ((e0i0) this.viewModel).m114291h0(false);
    }

    @Override // p149l.q0m
    public void destroy() {
        mkd0.m154992z(this.f146443c);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m166831f1(Coin coin) {
        long j = coin.available;
        this.f146444d = j;
        ((e0i0) this.viewModel).m114285b0(j);
        ((e0i0) this.viewModel).m114273M(swh0.m186215U(coin.available));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m166832g1(C4319c c4319c) {
        if (this.f146446f.contains(Privilege.boost)) {
            swh0.m186211P1(1, swh0.m186217W() > 0);
        }
        if (this.f146446f.contains(Privilege.vip_super_like)) {
            swh0.m186211P1(2, swh0.m186276x0() > 0);
        }
        if (this.f146446f.contains(Privilege.online_match_tickets_extra)) {
            swh0.m186211P1(3, swh0.m186263s0() > 0);
        }
        if (this.f146446f.contains(Privilege.immediately_match)) {
            o6j0.m162864h("e_wallet_instantmatch_btn", OMSDialogPositon.p_wallet, new o6j0.C18854a[0]);
        }
        zvf0.m220368A("e_recharge", OMSDialogPositon.p_wallet, vwb.m200311Y("module", OMSDialogPositon.p_wallet));
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m166833h1(C4319c c4319c) {
        CoreModule.f17545c.f19570H0.m210361k5();
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140262P3();
        }
        if (this.f146443c != null) {
            ((e0i0) this.viewModel).m114282Y();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m166834i1(Optional optional) {
        if (!optional.isPresent()) {
            ((e0i0) this.viewModel).m114278R();
            return;
        }
        WalletAccount walletAccount = (WalletAccount) optional.get();
        if (TextUtils.isEmpty(walletAccount.balance) || Double.parseDouble(walletAccount.balance) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            ((e0i0) this.viewModel).m114278R();
        } else {
            ((e0i0) this.viewModel).m114290g0(walletAccount.balance);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m166835j1(Throwable th) {
        ((e0i0) this.viewModel).m114278R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m166836m1(j760 j760Var) {
        ((e0i0) this.viewModel).m114279S((H5MerchandiseData) j760Var.f116564a, (List) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m166837r1(PaymentData paymentData) {
        act().progressDismiss();
        if (paymentData.isCanUse("wallet", paymentData.getCOutName())) {
            CoreModule.f17545c.f19604S0.m34189z3(act(), "wallet", true);
        } else if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f17545c.f19604S0.m34189z3(act(), "wallet", false);
        } else {
            new fd5.C16808e(act()).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120951c(0).m120952d("p_wallet,charge").m120960l();
            zvf0.m220399u("e_recharge", OMSDialogPositon.p_wallet, vwb.m200311Y("module", OMSDialogPositon.p_wallet));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m166838s1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m166839x1(View view) {
        act().startActivity(CoreModule.m29935P().m94651a().mo33334Hk(act()));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m166840z1(PaymentData paymentData) {
        act().progressDismiss();
        if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f17545c.f19604S0.m34189z3(act(), "wallet", true);
        } else if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f17545c.f19604S0.m34189z3(act(), "wallet", false);
        } else {
            new fd5.C16808e(act()).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120951c(0).m120952d("p_wallet,charge").m120960l();
            zvf0.m220399u("e_recharge", OMSDialogPositon.p_wallet, vwb.m200311Y("module", OMSDialogPositon.p_wallet));
        }
    }
}
