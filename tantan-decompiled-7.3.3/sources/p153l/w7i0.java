package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.H5MerchandiseData;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.WalletAccount;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinFrag;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.IsCurrencyMerchantData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class w7i0 extends ar2<m8i0> {

    /* JADX INFO: renamed from: a */
    public TanTanCoinFrag f187749a;

    /* JADX INFO: renamed from: b */
    public boolean f187750b;

    /* JADX INFO: renamed from: c */
    public kcg0 f187751c;

    /* JADX INFO: renamed from: d */
    public long f187752d;

    /* JADX INFO: renamed from: e */
    public int f187753e;

    /* JADX INFO: renamed from: f */
    public List<Privilege> f187754f;

    /* JADX INFO: renamed from: g */
    public View.OnClickListener f187755g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f187756h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f187757i;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f187758j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f187759k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f187760l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f187761m;

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f187762n;

    public w7i0(ner nerVar, TanTanCoinFrag tanTanCoinFrag) {
        ArrayList arrayListM147522n;
        super(nerVar);
        boolean zMo34811c = CoreModule.f18276o.m132214d().mo34811c();
        this.f187750b = zMo34811c;
        if (zMo34811c) {
            ArrayList arrayListM147507f0 = jyb.m147507f0(Privilege.immediately_match, Privilege.boost, Privilege.vip_super_like, Privilege.online_match_tickets_extra, Privilege.see_greet_gp, Privilege.letter, Privilege.compliment);
            final CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
            Objects.requireNonNull(coreBusinessServiceM143405a);
            arrayListM147522n = jyb.m147522n(arrayListM147507f0, new qcj() { // from class: l.w6i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(coreBusinessServiceM143405a.mo34358Ks((Privilege) obj));
                }
            });
        } else {
            ArrayList arrayListM147507f1 = jyb.m147507f0(Privilege.immediately_match, Privilege.boost, Privilege.vip_super_like, Privilege.see_greet_gp, Privilege.vip_letter_gp, Privilege.see_letter_gp, Privilege.letter, Privilege.compliment);
            final CoreBusinessService coreBusinessServiceM143405a2 = CoreModule.m30933P().m143405a();
            Objects.requireNonNull(coreBusinessServiceM143405a2);
            arrayListM147522n = jyb.m147522n(arrayListM147507f1, new qcj() { // from class: l.w6i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(coreBusinessServiceM143405a2.mo34358Ks((Privilege) obj));
                }
            });
        }
        this.f187754f = arrayListM147522n;
        this.f187755g = new View.OnClickListener() { // from class: l.x6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192598a.m205309n1(view);
            }
        };
        this.f187756h = new View.OnClickListener() { // from class: l.y6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197690a.m205311o1(view);
            }
        };
        this.f187757i = new View.OnClickListener() { // from class: l.z6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203162a.m205313p1(view);
            }
        };
        this.f187758j = new View.OnClickListener() { // from class: l.a7i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68823a.m205315q1(view);
            }
        };
        this.f187759k = new View.OnClickListener() { // from class: l.b7i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75304a.m205319t1(view);
            }
        };
        this.f187760l = new View.OnClickListener() { // from class: l.c7i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80116a.m205321u1(view);
            }
        };
        this.f187761m = new View.OnClickListener() { // from class: l.d7i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85517a.m205322v1(view);
            }
        };
        this.f187762n = new View.OnClickListener() { // from class: l.e7i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92435a.m205346x1(view);
            }
        };
        this.f187749a = tanTanCoinFrag;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m205289N0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m205295d1(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((m8i0) v2).m157485f0();
        } else {
            ((m8i0) v2).m157473Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m205297e1(Throwable th) {
        ((m8i0) this.viewModel).m157473Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public /* synthetic */ void m205304k1(uxj0 uxj0Var) {
        ((m8i0) this.viewModel).m157484e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m205306l1(Throwable th) {
        ((m8i0) this.viewModel).m157472P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m205309n1(View view) {
        CoreModule.m30934Q().getH5PageApi().mo213358d(act());
        i4g0.m138520r("e_live_income_button", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m205311o1(View view) {
        CoreModule.m30934Q().getH5PageApi().mo213357c(act());
        i4g0.m138520r("e_bill_record", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m205313p1(View view) {
        CoreModule.m30934Q().getH5PageApi().mo213355a(act());
        i4g0.m138520r("e_live_my_level", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m205315q1(View view) {
        otp0.m169162c(act(), this.f187749a.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m205319t1(View view) {
        act().progress(R$string.f28149T1, true);
        duringCreated(CoreModule.f18264c.f20346S0.m35190w3()).subscribe(psd0.m173597H(new y20() { // from class: l.l7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130364a.m205344r1((PaymentData) obj);
            }
        }, new y20() { // from class: l.m7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135081a.m205345s1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m205321u1(View view) {
        CoreModule.m30934Q().getH5PageApi().mo213356b(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m205322v1(View view) {
        i4g0.m138520r("e_bill_red_packet", OMSDialogPositon.p_wallet);
        act().startActivity(MkWebViewAct.m81419b2(act(), "红包记录", C4879a.m32275Z("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/red_package/index.html?speed=true&_bid=1005143#/red_package")));
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m205325z0(Envelope envelope) {
        r1j0.m179419f(envelope.meta.code == 200 ? R$string.f28210Y7 : R$string.f28199X7);
        CoreModule.f18264c.f20312H0.m155449k5();
        CoreModule.f18264c.f20315I0.m144057N3();
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m205326B1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: C1 */
    public void m205327C1() {
        duringCreated(CoreModule.f18264c.f20312H0.m155409B5()).subscribe(psd0.m173597H(new y20() { // from class: l.n7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                w7i0.m205325z0((Envelope) obj);
            }
        }, new y20() { // from class: l.o7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179419f(R$string.f28199X7);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public void m205328D1(boolean z) {
        if (z) {
            act().progress(R$string.f28149T1, true);
            duringCreated(CoreModule.f18264c.f20346S0.m35190w3()).subscribe(psd0.m173597H(new y20() { // from class: l.g7i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102588a.m205347z1((PaymentData) obj);
                }
            }, new y20() { // from class: l.h7i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108130a.m205326B1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m205329E1(String str) {
        CoreModule.m30934Q().getH5PageApi().mo213359e(act(), str);
    }

    /* JADX INFO: renamed from: U0 */
    public void m205330U0(boolean z) {
        ((m8i0) this.viewModel).m157488r();
        if (CoreModule.m30933P().m143405a().mo34445Xi() && !joa.m146361M3() && joa.m146401n4() && joa.m146392i4() && t7a.m189551g()) {
            this.f187751c = duringCreated(psd0.m173625r(CoreModule.f18264c.f20346S0.m35187s3(), CoreModule.f18264c.f20346S0.m35188t3(), new rcj() { // from class: l.i7i0
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return pf60.m172085a((H5MerchandiseData) obj, (List) obj2);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.j7i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118689a.m205343m1((pf60) obj);
                }
            }, new y20() { // from class: l.k7i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    w7i0.m205289N0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m205331V0(Bundle bundle) {
        this.f187749a.setHasOptionsMenu(true);
        act().setTitle(R$string.f28307ga);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m205332W0(IsCurrencyMerchantData isCurrencyMerchantData) {
        ((m8i0) this.viewModel).m157482c0(isCurrencyMerchantData.isCoiner);
        ((m8i0) this.viewModel).m157483d0(isCurrencyMerchantData.isDiamondCoiner);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m205333X0(Coin coin) {
        ((m8i0) this.viewModel).m157469M(a5i0.m96120U(coin.available));
        ((m8i0) this.viewModel).m157468L(a5i0.m96120U(coin.merchantAvailable));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m205334Y0(Long l2) {
        ((m8i0) this.viewModel).m157470N(l2.longValue());
        ((m8i0) this.viewModel).m157480a0(CoreModule.f18264c.f20315I0.m144046C3());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20312H0.m155449k5();
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3();
        }
        if (CoreModule.m30933P().m143405a().mo34510h5()) {
            CoreModule.f18264c.f20312H0.m155453m5();
        }
        if (CoreModule.m30932N().mo61451Co()) {
            this.f187754f.remove(Privilege.letter);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.j6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118565a.m205331V0((Bundle) obj);
            }
        });
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20315I0.m144047D3());
        y20 y20Var = new y20() { // from class: l.l6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130259a.m205332W0((IsCurrencyMerchantData) obj);
            }
        };
        final CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
        Objects.requireNonNull(coreBusinessServiceM143405a);
        c22421cDuringCreated.subscribe(psd0.m173597H(y20Var, new y20() { // from class: l.u6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                coreBusinessServiceM143405a.mo34608uo((Throwable) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(CoreModule.f18264c.f20312H0.m155474x4());
        y20 y20Var2 = new y20() { // from class: l.q6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155817a.m205333X0((Coin) obj);
            }
        };
        final CoreBusinessService coreBusinessServiceM143405a2 = CoreModule.m30933P().m143405a();
        Objects.requireNonNull(coreBusinessServiceM143405a2);
        c22421cDuringCreated2.subscribe(psd0.m173597H(y20Var2, new y20() { // from class: l.u6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                coreBusinessServiceM143405a2.mo34608uo((Throwable) obj);
            }
        }));
        if (CoreModule.m30930K().mo31838xf()) {
            C22421c map = duringCreated(CoreModule.f18264c.f20315I0.m144057N3()).map(new qcj() { // from class: l.r6i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Long.valueOf(CoreModule.f18264c.f20315I0.m144054K3());
                }
            });
            y20 y20Var3 = new y20() { // from class: l.s6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166579a.m205334Y0((Long) obj);
                }
            };
            final CoreBusinessService coreBusinessServiceM143405a3 = CoreModule.m30933P().m143405a();
            Objects.requireNonNull(coreBusinessServiceM143405a3);
            map.subscribe(psd0.m173597H(y20Var3, new y20() { // from class: l.u6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    coreBusinessServiceM143405a3.mo34608uo((Throwable) obj);
                }
            }));
            C22421c map2 = duringCreated(CoreModule.f18264c.f20315I0.m144056M3()).map(new qcj() { // from class: l.t6i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Long.valueOf(((IntlCurrencyDiamond) obj).available);
                }
            });
            y20 y20Var4 = new y20() { // from class: l.v6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182655a.m205335a1((Long) obj);
                }
            };
            final CoreBusinessService coreBusinessServiceM143405a4 = CoreModule.m30933P().m143405a();
            Objects.requireNonNull(coreBusinessServiceM143405a4);
            map2.subscribe(psd0.m173597H(y20Var4, new y20() { // from class: l.u6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    coreBusinessServiceM143405a4.mo34608uo((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20312H0.m155471v5()).subscribe(psd0.m173597H(new y20() { // from class: l.f7i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97571a.m205336b1((pf60) obj);
                }
            }, new y20() { // from class: l.p7i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150940a.m205337c1((Throwable) obj);
                }
            }));
        }
        duringCreated(CoreModule.f18264c.f20312H0.m155469u5()).subscribe(psd0.m173597H(new y20() { // from class: l.q7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155964a.m205295d1((Boolean) obj);
            }
        }, new y20() { // from class: l.r7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161619a.m205297e1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20312H0.m155437a5()).subscribe(psd0.m173596G(new y20() { // from class: l.s7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166691a.m205338f1((Coin) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.t7i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.u7i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177909a.m205339g1((C4470c) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.v7i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.k6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124183a.m205340h1((C4470c) obj);
            }
        }));
        if (CoreModule.m30933P().m143405a().mo34510h5()) {
            duringCreated(CoreModule.f18264c.f20312H0.m155415E5()).subscribe(psd0.m173597H(new y20() { // from class: l.m6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f135010a.m205341i1((Optional) obj);
                }
            }, new y20() { // from class: l.n6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140470a.m205342j1((Throwable) obj);
                }
            }));
        }
        if (CoreModule.m30934Q().mo68438a().mo134410b()) {
            duringCreated(CoreModule.f18264c.f20312H0.m155473w5()).subscribe(psd0.m173597H(new y20() { // from class: l.o6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145169a.m205304k1((uxj0) obj);
                }
            }, new y20() { // from class: l.p6i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150855a.m205306l1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m205335a1(Long l2) {
        ((m8i0) this.viewModel).m157470N(l2.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m205336b1(pf60 pf60Var) {
        this.f187753e = ((Integer) pf60Var.f152157b).intValue();
        ((m8i0) this.viewModel).m157487h0(((Boolean) pf60Var.f152156a).booleanValue());
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m205337c1(Throwable th) {
        ((m8i0) this.viewModel).m157487h0(false);
    }

    @Override // p153l.k3m
    public void destroy() {
        psd0.m173633z(this.f187751c);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m205338f1(Coin coin) {
        long j = coin.available;
        this.f187752d = j;
        ((m8i0) this.viewModel).m157481b0(j);
        ((m8i0) this.viewModel).m157469M(a5i0.m96120U(coin.available));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m205339g1(C4470c c4470c) {
        if (this.f187754f.contains(Privilege.boost)) {
            a5i0.m96116P1(1, a5i0.m96122W() > 0);
        }
        if (this.f187754f.contains(Privilege.vip_super_like)) {
            a5i0.m96116P1(2, a5i0.m96181x0() > 0);
        }
        if (this.f187754f.contains(Privilege.online_match_tickets_extra)) {
            a5i0.m96116P1(3, a5i0.m96168s0() > 0);
        }
        if (this.f187754f.contains(Privilege.immediately_match)) {
            sfj0.m185601h("e_wallet_instantmatch_btn", OMSDialogPositon.p_wallet, new sfj0.C20032a[0]);
        }
        i4g0.m138492A("e_recharge", OMSDialogPositon.p_wallet, jyb.m147494Y("module", OMSDialogPositon.p_wallet));
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m205340h1(C4470c c4470c) {
        CoreModule.f18264c.f20312H0.m155449k5();
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3();
        }
        if (this.f187751c != null) {
            ((m8i0) this.viewModel).m157478Y();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m205341i1(Optional optional) {
        if (!optional.isPresent()) {
            ((m8i0) this.viewModel).m157474R();
            return;
        }
        WalletAccount walletAccount = (WalletAccount) optional.get();
        if (TextUtils.isEmpty(walletAccount.balance) || Double.parseDouble(walletAccount.balance) <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            ((m8i0) this.viewModel).m157474R();
        } else {
            ((m8i0) this.viewModel).m157486g0(walletAccount.balance);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m205342j1(Throwable th) {
        ((m8i0) this.viewModel).m157474R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m205343m1(pf60 pf60Var) {
        ((m8i0) this.viewModel).m157475S((H5MerchandiseData) pf60Var.f152156a, (List) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m205344r1(PaymentData paymentData) {
        act().progressDismiss();
        if (paymentData.isCanUse("wallet", paymentData.getCOutName())) {
            CoreModule.f18264c.f20346S0.m35192z3(act(), "wallet", true);
        } else if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f18264c.f20346S0.m35192z3(act(), "wallet", false);
        } else {
            new fe5.C16962e(act()).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125274c(0).m125275d("p_wallet,charge").m125283l();
            i4g0.m138523u("e_recharge", OMSDialogPositon.p_wallet, jyb.m147494Y("module", OMSDialogPositon.p_wallet));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m205345s1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m205346x1(View view) {
        act().startActivity(CoreModule.m30933P().m143405a().mo34337Hk(act()));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m205347z1(PaymentData paymentData) {
        act().progressDismiss();
        if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f18264c.f20346S0.m35192z3(act(), "wallet", true);
        } else if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f18264c.f20346S0.m35192z3(act(), "wallet", false);
        } else {
            new fe5.C16962e(act()).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125274c(0).m125275d("p_wallet,charge").m125283l();
            i4g0.m138523u("e_recharge", OMSDialogPositon.p_wallet, jyb.m147494Y("module", OMSDialogPositon.p_wallet));
        }
    }
}
