package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinFrag;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.H5MerchandiseData;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.WalletAccount;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.IsCurrencyMerchantData;
import com.p1.mobile.putong.data.PaymentData;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.c4g0;
import l.e30;
import l.fd5;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.n4i0;
import l.o6j0;
import l.osi0;
import l.roj0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ozh0 extends jq2<e0i0> {

    /* JADX INFO: renamed from: a */
    public TanTanCoinFrag f18510a;

    /* JADX INFO: renamed from: b */
    public boolean f18511b;

    /* JADX INFO: renamed from: c */
    public c4g0 f18512c;

    /* JADX INFO: renamed from: d */
    public long f18513d;

    /* JADX INFO: renamed from: e */
    public int f18514e;

    /* JADX INFO: renamed from: f */
    public List<Privilege> f18515f;

    /* JADX INFO: renamed from: g */
    public View.OnClickListener f18516g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f18517h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f18518i;

    /* JADX INFO: renamed from: j */
    public View.OnClickListener f18519j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f18520k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f18521l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f18522m;

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f18523n;

    public ozh0(mcr mcrVar, TanTanCoinFrag tanTanCoinFrag) {
        ArrayList arrayListN;
        super(mcrVar);
        boolean zM5745c = CoreModule.f1546o.m25559d().m5745c();
        this.f18511b = zM5745c;
        if (zM5745c) {
            ArrayList arrayListF0 = vwb.f0(new Privilege[]{Privilege.immediately_match, Privilege.boost, Privilege.vip_super_like, Privilege.online_match_tickets_extra, Privilege.see_greet_gp, Privilege.letter, Privilege.compliment});
            final CoreBusinessService coreBusinessServiceM11706a = CoreModule.m1854P().m11706a();
            Objects.requireNonNull(coreBusinessServiceM11706a);
            arrayListN = vwb.n(arrayListF0, new w9j() { // from class: l.oyh0
                public final Object call(Object obj) {
                    return Boolean.valueOf(coreBusinessServiceM11706a.m5292Ks((Privilege) obj));
                }
            });
        } else {
            ArrayList arrayListF1 = vwb.f0(new Privilege[]{Privilege.immediately_match, Privilege.boost, Privilege.vip_super_like, Privilege.see_greet_gp, Privilege.vip_letter_gp, Privilege.see_letter_gp, Privilege.letter, Privilege.compliment});
            final CoreBusinessService coreBusinessServiceM11706a2 = CoreModule.m1854P().m11706a();
            Objects.requireNonNull(coreBusinessServiceM11706a2);
            arrayListN = vwb.n(arrayListF1, new w9j() { // from class: l.oyh0
                public final Object call(Object obj) {
                    return Boolean.valueOf(coreBusinessServiceM11706a2.m5292Ks((Privilege) obj));
                }
            });
        }
        this.f18515f = arrayListN;
        this.f18516g = new View.OnClickListener() { // from class: l.pyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19455a.m20949n1(view);
            }
        };
        this.f18517h = new View.OnClickListener() { // from class: l.qyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20162a.m20951o1(view);
            }
        };
        this.f18518i = new View.OnClickListener() { // from class: l.ryh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20919a.m20953p1(view);
            }
        };
        this.f18519j = new View.OnClickListener() { // from class: l.syh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21766a.m20955q1(view);
            }
        };
        this.f18520k = new View.OnClickListener() { // from class: l.tyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22349a.m20959t1(view);
            }
        };
        this.f18521l = new View.OnClickListener() { // from class: l.uyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23817a.m20961u1(view);
            }
        };
        this.f18522m = new View.OnClickListener() { // from class: l.vyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24542a.m20962v1(view);
            }
        };
        this.f18523n = new View.OnClickListener() { // from class: l.wyh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25500a.m20988x1(view);
            }
        };
        this.f18510a = tanTanCoinFrag;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m20929N0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public /* synthetic */ void m20935d1(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zBooleanValue) {
            ((e0i0) s7mVar).m14378f0();
        } else {
            ((e0i0) s7mVar).m14366Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m20937e1(Throwable th) {
        ((e0i0) ((jq2) this).viewModel).m14366Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public /* synthetic */ void m20944k1(roj0 roj0Var) {
        ((e0i0) ((jq2) this).viewModel).m14377e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m20946l1(Throwable th) {
        ((e0i0) ((jq2) this).viewModel).m14365P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m20949n1(View view) {
        CoreModule.m1855Q().getH5PageApi().d(act());
        zvf0.r("e_live_income_button", "p_wallet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m20951o1(View view) {
        CoreModule.m1855Q().getH5PageApi().c(act());
        zvf0.r("e_bill_record", "p_wallet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m20953p1(View view) {
        CoreModule.m1855Q().getH5PageApi().a(act());
        zvf0.r("e_live_my_level", "p_wallet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m20955q1(View view) {
        kkp0.m18162c(act(), this.f18510a.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m20959t1(View view) {
        act().progress(R.string.T1, true);
        duringCreated(CoreModule.f1534c.f3593S0.m6124w3()).subscribe(mkd0.H(new e30() { // from class: l.dzh0
            public final void call(Object obj) {
                this.f10670a.m20986r1((PaymentData) obj);
            }
        }, new e30() { // from class: l.ezh0
            public final void call(Object obj) {
                this.f11540a.m20987s1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m20961u1(View view) {
        CoreModule.m1855Q().getH5PageApi().b(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public /* synthetic */ void m20962v1(View view) {
        zvf0.r("e_bill_red_packet", "p_wallet");
        act().startActivity(MkWebViewAct.a2(act(), "红包记录", C0154a.m3202Z("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/red_package/index.html?speed=true&_bid=1005143#/red_package")));
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m20965z0(Envelope envelope) {
        osi0.f(envelope.meta.code == 200 ? R.string.Y7 : R.string.X7);
        CoreModule.f1534c.f3559H0.m27536k5();
        CoreModule.f1534c.f3562I0.m17376N3();
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m20966B1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: C1 */
    public void m20967C1() {
        duringCreated(CoreModule.f1534c.f3559H0.m27496B5()).subscribe(mkd0.H(new e30() { // from class: l.fzh0
            public final void call(Object obj) {
                ozh0.m20965z0((Envelope) obj);
            }
        }, new e30() { // from class: l.gzh0
            public final void call(Object obj) {
                osi0.f(R.string.X7);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public void m20968D1(boolean z) {
        if (z) {
            act().progress(R.string.T1, true);
            duringCreated(CoreModule.f1534c.f3593S0.m6124w3()).subscribe(mkd0.H(new e30() { // from class: l.yyh0
                public final void call(Object obj) {
                    this.f28502a.m20989z1((PaymentData) obj);
                }
            }, new e30() { // from class: l.zyh0
                public final void call(Object obj) {
                    this.f29041a.m20966B1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m20969E1(String str) {
        CoreModule.m1855Q().getH5PageApi().e(act(), str);
    }

    /* JADX INFO: renamed from: U0 */
    public void m20970U0(boolean z) {
        ((e0i0) ((jq2) this).viewModel).m14382r();
        if (CoreModule.m1854P().m11706a().m5379Xi() && !xma.m27355L3() && xma.m27395m4() && xma.m27385h4() && h6a.m16053g()) {
            this.f18512c = duringCreated(mkd0.r(CoreModule.f1534c.f3593S0.m6121s3(), CoreModule.f1534c.f3593S0.m6122t3(), new x9j() { // from class: l.azh0
                public final Object call(Object obj, Object obj2) {
                    return j760.a((H5MerchandiseData) obj, (List) obj2);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.bzh0
                public final void call(Object obj) {
                    this.f9243a.m20985m1((j760) obj);
                }
            }, new e30() { // from class: l.czh0
                public final void call(Object obj) {
                    ozh0.m20929N0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m20971V0(Bundle bundle) {
        this.f18510a.setHasOptionsMenu(true);
        act().setTitle(R.string.ga);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m20972W0(IsCurrencyMerchantData isCurrencyMerchantData) {
        ((e0i0) ((jq2) this).viewModel).m14375c0(isCurrencyMerchantData.isCoiner);
        ((e0i0) ((jq2) this).viewModel).m14376d0(isCurrencyMerchantData.isDiamondCoiner);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m20973X0(Coin coin) {
        ((e0i0) ((jq2) this).viewModel).m14362M(swh0.m24266U(coin.available));
        ((e0i0) ((jq2) this).viewModel).m14361L(swh0.m24266U(coin.merchantAvailable));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m20974Y0(Long l2) {
        ((e0i0) ((jq2) this).viewModel).m14363N(l2.longValue());
        ((e0i0) ((jq2) this).viewModel).m14373a0(CoreModule.f1534c.f3562I0.m17365C3());
    }

    /* JADX INFO: renamed from: Z */
    public void m20975Z() {
        super.Z();
        CoreModule.f1534c.f3559H0.m27536k5();
        if (CoreModule.m1851K().xf()) {
            CoreModule.f1534c.f3562I0.m17378P3();
        }
        if (CoreModule.m1854P().m11706a().m5444h5()) {
            CoreModule.f1534c.f3559H0.m27540m5();
        }
        if (CoreModule.m1853N().Co()) {
            this.f18515f.remove(Privilege.letter);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m20976a0() {
        super.a0();
        creates(new e30() { // from class: l.byh0
            public final void call(Object obj) {
                this.f9228a.m20971V0((Bundle) obj);
            }
        });
        c cVarDuringCreated = duringCreated(CoreModule.f1534c.f3562I0.m17366D3());
        e30 e30Var = new e30() { // from class: l.dyh0
            public final void call(Object obj) {
                this.f10656a.m20972W0((IsCurrencyMerchantData) obj);
            }
        };
        final CoreBusinessService coreBusinessServiceM11706a = CoreModule.m1854P().m11706a();
        Objects.requireNonNull(coreBusinessServiceM11706a);
        cVarDuringCreated.subscribe(mkd0.H(e30Var, new e30() { // from class: l.myh0
            public final void call(Object obj) {
                coreBusinessServiceM11706a.m5542uo((Throwable) obj);
            }
        }));
        c cVarDuringCreated2 = duringCreated(CoreModule.f1534c.f3559H0.m27561x4());
        e30 e30Var2 = new e30() { // from class: l.iyh0
            public final void call(Object obj) {
                this.f14880a.m20973X0((Coin) obj);
            }
        };
        final CoreBusinessService coreBusinessServiceM11706a2 = CoreModule.m1854P().m11706a();
        Objects.requireNonNull(coreBusinessServiceM11706a2);
        cVarDuringCreated2.subscribe(mkd0.H(e30Var2, new e30() { // from class: l.myh0
            public final void call(Object obj) {
                coreBusinessServiceM11706a2.m5542uo((Throwable) obj);
            }
        }));
        if (CoreModule.m1851K().xf()) {
            c map = duringCreated(CoreModule.f1534c.f3562I0.m17376N3()).map(new w9j() { // from class: l.jyh0
                public final Object call(Object obj) {
                    return Long.valueOf(CoreModule.f1534c.f3562I0.m17373K3());
                }
            });
            e30 e30Var3 = new e30() { // from class: l.kyh0
                public final void call(Object obj) {
                    this.f16102a.m20974Y0((Long) obj);
                }
            };
            final CoreBusinessService coreBusinessServiceM11706a3 = CoreModule.m1854P().m11706a();
            Objects.requireNonNull(coreBusinessServiceM11706a3);
            map.subscribe(mkd0.H(e30Var3, new e30() { // from class: l.myh0
                public final void call(Object obj) {
                    coreBusinessServiceM11706a3.m5542uo((Throwable) obj);
                }
            }));
            c map2 = duringCreated(CoreModule.f1534c.f3562I0.m17375M3()).map(new w9j() { // from class: l.lyh0
                public final Object call(Object obj) {
                    return Long.valueOf(((IntlCurrencyDiamond) obj).available);
                }
            });
            e30 e30Var4 = new e30() { // from class: l.nyh0
                public final void call(Object obj) {
                    this.f17938a.m20977a1((Long) obj);
                }
            };
            final CoreBusinessService coreBusinessServiceM11706a4 = CoreModule.m1854P().m11706a();
            Objects.requireNonNull(coreBusinessServiceM11706a4);
            map2.subscribe(mkd0.H(e30Var4, new e30() { // from class: l.myh0
                public final void call(Object obj) {
                    coreBusinessServiceM11706a4.m5542uo((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f1534c.f3559H0.m27558v5()).subscribe(mkd0.H(new e30() { // from class: l.xyh0
                public final void call(Object obj) {
                    this.f27799a.m20978b1((j760) obj);
                }
            }, new e30() { // from class: l.hzh0
                public final void call(Object obj) {
                    this.f14150a.m20979c1((Throwable) obj);
                }
            }));
        }
        duringCreated(CoreModule.f1534c.f3559H0.m27556u5()).subscribe(mkd0.H(new e30() { // from class: l.izh0
            public final void call(Object obj) {
                this.f14904a.m20935d1((Boolean) obj);
            }
        }, new e30() { // from class: l.jzh0
            public final void call(Object obj) {
                this.f15511a.m20937e1((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3559H0.m27524a5()).subscribe(mkd0.G(new e30() { // from class: l.kzh0
            public final void call(Object obj) {
                this.f16113a.m20980f1((Coin) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.lzh0
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.mzh0
            public final void call(Object obj) {
                this.f17407a.m20981g1((com.p1.mobile.android.app.c) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.nzh0
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.cyh0
            public final void call(Object obj) {
                this.f9933a.m20982h1((com.p1.mobile.android.app.c) obj);
            }
        }));
        if (CoreModule.m1854P().m11706a().m5444h5()) {
            duringCreated(CoreModule.f1534c.f3559H0.m27502E5()).subscribe(mkd0.H(new e30() { // from class: l.eyh0
                public final void call(Object obj) {
                    this.f11513a.m20983i1((Optional) obj);
                }
            }, new e30() { // from class: l.fyh0
                public final void call(Object obj) {
                    this.f12988a.m20984j1((Throwable) obj);
                }
            }));
        }
        if (CoreModule.m1855Q().a().b()) {
            duringCreated(CoreModule.f1534c.f3559H0.m27560w5()).subscribe(mkd0.H(new e30() { // from class: l.gyh0
                public final void call(Object obj) {
                    this.f13589a.m20944k1((roj0) obj);
                }
            }, new e30() { // from class: l.hyh0
                public final void call(Object obj) {
                    this.f14141a.m20946l1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m20977a1(Long l2) {
        ((e0i0) ((jq2) this).viewModel).m14363N(l2.longValue());
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m20978b1(j760 j760Var) {
        this.f18514e = ((Integer) j760Var.b).intValue();
        ((e0i0) ((jq2) this).viewModel).m14380h0(((Boolean) j760Var.a).booleanValue());
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m20979c1(Throwable th) {
        ((e0i0) ((jq2) this).viewModel).m14380h0(false);
    }

    public void destroy() {
        mkd0.z(this.f18512c);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m20980f1(Coin coin) {
        long j = coin.available;
        this.f18513d = j;
        ((e0i0) ((jq2) this).viewModel).m14374b0(j);
        ((e0i0) ((jq2) this).viewModel).m14362M(swh0.m24266U(coin.available));
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m20981g1(com.p1.mobile.android.app.c cVar) {
        if (this.f18515f.contains(Privilege.boost)) {
            swh0.m24262P1(1, swh0.m24268W() > 0);
        }
        if (this.f18515f.contains(Privilege.vip_super_like)) {
            swh0.m24262P1(2, swh0.m24327x0() > 0);
        }
        if (this.f18515f.contains(Privilege.online_match_tickets_extra)) {
            swh0.m24262P1(3, swh0.m24314s0() > 0);
        }
        if (this.f18515f.contains(Privilege.immediately_match)) {
            o6j0.h("e_wallet_instantmatch_btn", "p_wallet", new o6j0.a[0]);
        }
        zvf0.A("e_recharge", "p_wallet", new j760[]{vwb.Y("module", "p_wallet")});
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m20982h1(com.p1.mobile.android.app.c cVar) {
        CoreModule.f1534c.f3559H0.m27536k5();
        if (CoreModule.m1851K().xf()) {
            CoreModule.f1534c.f3562I0.m17378P3();
        }
        if (this.f18512c != null) {
            ((e0i0) ((jq2) this).viewModel).m14371Y();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m20983i1(Optional optional) {
        if (!optional.isPresent()) {
            ((e0i0) ((jq2) this).viewModel).m14367R();
            return;
        }
        WalletAccount walletAccount = (WalletAccount) optional.get();
        if (TextUtils.isEmpty(walletAccount.balance) || Double.parseDouble(walletAccount.balance) <= 0.0d) {
            ((e0i0) ((jq2) this).viewModel).m14367R();
        } else {
            ((e0i0) ((jq2) this).viewModel).m14379g0(walletAccount.balance);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m20984j1(Throwable th) {
        ((e0i0) ((jq2) this).viewModel).m14367R();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m20985m1(j760 j760Var) {
        ((e0i0) ((jq2) this).viewModel).m14368S((H5MerchandiseData) j760Var.a, (List) j760Var.b);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m20986r1(PaymentData paymentData) {
        act().progressDismiss();
        if (paymentData.isCanUse("wallet", paymentData.getCOutName())) {
            CoreModule.f1534c.f3593S0.m6126z3(act(), "wallet", true);
        } else if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f1534c.f3593S0.m6126z3(act(), "wallet", false);
        } else {
            new fd5.e(act()).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).c(0).d("p_wallet,charge").l();
            zvf0.u("e_recharge", "p_wallet", new j760[]{vwb.Y("module", "p_wallet")});
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m20987s1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m20988x1(View view) {
        act().startActivity(CoreModule.m1854P().m11706a().m5271Hk(act()));
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m20989z1(PaymentData paymentData) {
        act().progressDismiss();
        if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f1534c.f3593S0.m6126z3(act(), "wallet", true);
        } else if (paymentData.isCanUse("wallet", paymentData.getCodaName())) {
            CoreModule.f1534c.f3593S0.m6126z3(act(), "wallet", false);
        } else {
            new fd5.e(act()).j(PurchaseType.TYPE_INTL_TTT_COIN).c(0).d("p_wallet,charge").l();
            zvf0.u("e_recharge", "p_wallet", new j760[]{vwb.Y("module", "p_wallet")});
        }
    }
}
