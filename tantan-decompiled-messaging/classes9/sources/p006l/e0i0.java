package p006l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0171k;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinFrag;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinHeadItem;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinPayCoolsView;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.H5Merchandise;
import com.p1.mobile.putong.core.data.H5MerchandiseData;
import com.p1.mobile.putong.core.data.H5PayOrderConfigData;
import com.p1.mobile.putong.core.data.H5PayOrderData;
import com.p1.mobile.putong.core.data.H5PaymentChannels;
import com.p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p1.mobile.putong.core.data.LuckyTtConfig;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l.c4g0;
import l.d30;
import l.d3c0;
import l.e30;
import l.jxk;
import l.m6c0;
import l.mkd0;
import l.n4i0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.z4c0;
import l.zvf0;
import v.AutoVDraweeView;
import v.VIcon;
import v.VRecyclerView;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class e0i0 implements s7m<ozh0> {

    /* JADX INFO: renamed from: A */
    public c4g0 f10688A;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f10689a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f10690b;

    /* JADX INFO: renamed from: c */
    public VText f10691c;

    /* JADX INFO: renamed from: d */
    public TextView f10692d;

    /* JADX INFO: renamed from: e */
    public VText f10693e;

    /* JADX INFO: renamed from: f */
    public VText f10694f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f10695g;

    /* JADX INFO: renamed from: h */
    public VText f10696h;

    /* JADX INFO: renamed from: i */
    public TextView f10697i;

    /* JADX INFO: renamed from: j */
    public VText f10698j;

    /* JADX INFO: renamed from: k */
    public TextView f10699k;

    /* JADX INFO: renamed from: l */
    public VText f10700l;

    /* JADX INFO: renamed from: m */
    public TextView f10701m;

    /* JADX INFO: renamed from: n */
    public TextView f10702n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f10703o;

    /* JADX INFO: renamed from: p */
    public ozh0 f10704p;

    /* JADX INFO: renamed from: q */
    public TanTanCoinFrag f10705q;

    /* JADX INFO: renamed from: r */
    public GridLayoutManager f10706r;

    /* JADX INFO: renamed from: s */
    public jxk f10707s;

    /* JADX INFO: renamed from: t */
    public fvh0 f10708t;

    /* JADX INFO: renamed from: u */
    public TanTanCoinHeadItem f10709u;

    /* JADX INFO: renamed from: v */
    public TanTanCoinHeadItem f10710v;

    /* JADX INFO: renamed from: w */
    public TanTanCoinHeadItem f10711w;

    /* JADX INFO: renamed from: x */
    public TanTanCoinHeadItem f10712x;

    /* JADX INFO: renamed from: y */
    public View f10713y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f10714z;

    /* JADX INFO: renamed from: l.e0i0$a */
    public static class C0662a {
        /* JADX INFO: renamed from: b */
        public static void m14384b(e0i0 e0i0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            e0i0Var.f10689a = viewGroup.getChildAt(0);
            e0i0Var.f10690b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            e0i0Var.f10691c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
            e0i0Var.f10692d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
            e0i0Var.f10693e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
            e0i0Var.f10694f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
            e0i0Var.f10695g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            e0i0Var.f10696h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
            e0i0Var.f10697i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
            e0i0Var.f10698j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
            e0i0Var.f10699k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(4);
            e0i0Var.f10700l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(5);
            e0i0Var.f10701m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(6);
            e0i0Var.f10702n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(7);
            e0i0Var.f10703o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m14385c(e0i0 e0i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(m6c0.o2, viewGroup, false);
            m14384b(e0i0Var, viewInflate);
            return viewInflate;
        }
    }

    public e0i0(TanTanCoinFrag tanTanCoinFrag) {
        this.f10705q = tanTanCoinFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m14332T(View view) {
        String str = (String) vwb.s(this.f10705q.f8011D, new w9j() { // from class: l.tzh0
            public final Object call(Object obj) {
                return e0i0.m14340f((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m21v() ? "&area=US" : "";
        act().startActivity(MkWebViewAct.a2(act(), act().string(R.string.U7), xh5.m27256o(m14359J() + string + str2)));
        zvf0.r("e_bill_button", "p_wallet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m14333V() {
        this.f10704p.m20967C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m14334W(View view) {
        Act act = act();
        ozh0 ozh0Var = this.f10704p;
        swh0.m24247H1(act, ozh0Var.f18513d, ozh0Var.f18514e, new d30() { // from class: l.c0i0
            public final void call() {
                this.f9267a.m14333V();
            }
        }, new d30() { // from class: l.d0i0
            public final void call() {
                e0i0.m14345m();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14337c(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m14340f(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m14345m() {
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14356C0() {
        return this.f10705q.getContext();
    }

    /* JADX INFO: renamed from: H */
    public View m14357H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0662a.m14385c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m14358I(Map.Entry<String, ArrayList<H5Merchandise>> entry, ArrayList<H5Merchandise> arrayList, int i) {
        H5PayOrderConfigData h5PayOrderConfigDataNew_ = H5PayOrderConfigData.new_();
        h5PayOrderConfigDataNew_.itemId = entry.getKey();
        H5StockKeepUnit h5StockKeepUnit = arrayList.get(0).defaultStockKeepUnit;
        if (NullChecker.a(h5StockKeepUnit)) {
            Prices prices = h5StockKeepUnit.prices;
            if (NullChecker.a(prices)) {
                h5PayOrderConfigDataNew_.price = prices.price;
            }
        }
        h5PayOrderConfigDataNew_.title = act().getString(R.string.y6, i + "");
        C0171k.f4035V.add(h5PayOrderConfigDataNew_);
    }

    /* JADX INFO: renamed from: J */
    public final String m14359J() {
        return CoreModule.m1851K().xf() ? "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/diamond" : "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/";
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m14381i1(ozh0 ozh0Var) {
        this.f10704p = ozh0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m14361L(String str) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f10711w;
        if (tanTanCoinHeadItem != null) {
            tanTanCoinHeadItem.m11628B(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m14362M(String str) {
        this.f10693e.setText(str);
        this.f10698j.setText(str);
    }

    /* JADX INFO: renamed from: N */
    public void m14363N(long j) {
        this.f10700l.setText(swh0.m24266U(j));
    }

    /* JADX INFO: renamed from: O */
    public final void m14364O(H5PaymentChannels h5PaymentChannels, String str, List<H5Merchandise> list, ArrayList<H5PayOrderData> arrayList, boolean z) {
        TanTanCoinPayCoolsView tanTanCoinPayCoolsView = (TanTanCoinPayCoolsView) act().inflater().inflate(m6c0.z, (ViewGroup) null);
        tanTanCoinPayCoolsView.setTag(str);
        tanTanCoinPayCoolsView.m11668g(act(), list, arrayList, h5PaymentChannels);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, xdl0.w(90.0f));
        layoutParams.bottomMargin = xdl0.w(12.0f);
        if (!z) {
            layoutParams.topMargin = xdl0.w(12.0f);
        }
        this.f10714z.addView(tanTanCoinPayCoolsView, layoutParams);
    }

    /* JADX INFO: renamed from: P */
    public void m14365P() {
        VRelative vRelative = this.f10709u;
        if (vRelative != null) {
            xdl0.M(vRelative, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m14366Q() {
        View view = this.f10713y;
        if (view != null) {
            xdl0.M(view, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m14367R() {
        VRelative vRelative = this.f10710v;
        if (vRelative != null) {
            xdl0.M(vRelative, false);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m14368S(H5MerchandiseData h5MerchandiseData, List<H5PayOrderData> list) {
        if (NullChecker.a(h5MerchandiseData)) {
            HashMap mapC = vwb.C(h5MerchandiseData.merchandises, new w9j() { // from class: l.zzh0
                public final Object call(Object obj) {
                    return ((H5Merchandise) obj).defaultStockKeepUnit.id;
                }
            });
            HashMap mapC2 = vwb.C(list, new w9j() { // from class: l.a0i0
                public final Object call(Object obj) {
                    return ((H5PayOrderData) obj).itemId;
                }
            });
            ArrayList arrayListN = vwb.n(h5MerchandiseData.paymentChannels, new w9j() { // from class: l.b0i0
                public final Object call(Object obj) {
                    return Boolean.valueOf("payCools".equals(((H5PaymentChannels) obj).payment));
                }
            });
            H5PaymentChannels h5PaymentChannels = arrayListN.isEmpty() ? null : (H5PaymentChannels) arrayListN.get(0);
            if (mapC.values().size() > 0) {
                C0171k.f4035V.clear();
                boolean z = true;
                for (Map.Entry<String, ArrayList<H5Merchandise>> entry : mapC.entrySet()) {
                    ArrayList<H5Merchandise> value = entry.getValue();
                    if (NullChecker.a(value) && !value.isEmpty()) {
                        int i = value.get(0).quantity;
                        m14358I(entry, value, i);
                        if (!h6a.m16051e() || i == 1) {
                            if (!h6a.m16052f() || i == 3) {
                                if (!h6a.m16050d() || i == 12) {
                                    m14364O(h5PaymentChannels, entry.getKey(), value, (ArrayList) mapC2.get(entry.getKey()), z);
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m14369U(LuckyTtConfig luckyTtConfig, View view) {
        this.f10704p.m20969E1(luckyTtConfig.jumpUrl);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m14370X(List list) {
        HashMap mapC = vwb.C(list, new w9j() { // from class: l.uzh0
            public final Object call(Object obj) {
                return ((H5PayOrderData) obj).itemId;
            }
        });
        for (int i = 0; i < this.f10714z.getChildCount(); i++) {
            View childAt = this.f10714z.getChildAt(i);
            if (childAt instanceof TanTanCoinPayCoolsView) {
                TanTanCoinPayCoolsView tanTanCoinPayCoolsView = (TanTanCoinPayCoolsView) childAt;
                tanTanCoinPayCoolsView.m11669h(act(), (ArrayList) mapC.get(tanTanCoinPayCoolsView.getTag()));
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m14371Y() {
        if (!xma.m27355L3() && xma.m27395m4() && xma.m27385h4()) {
            m14372Z(this.f10688A);
            this.f10688A = act().duringCreated(CoreModule.f1534c.f3593S0.m6122t3()).subscribe(mkd0.H(new e30() { // from class: l.xzh0
                public final void call(Object obj) {
                    this.f27828a.m14370X((List) obj);
                }
            }, new e30() { // from class: l.yzh0
                public final void call(Object obj) {
                    e0i0.m14337c((Throwable) obj);
                }
            }));
            return;
        }
        for (int i = 0; i < this.f10714z.getChildCount(); i++) {
            View childAt = this.f10714z.getChildAt(i);
            if (childAt instanceof TanTanCoinPayCoolsView) {
                xdl0.M(childAt, false);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m14372Z(c4g0 c4g0Var) {
        mkd0.z(c4g0Var);
    }

    /* JADX INFO: renamed from: a0 */
    public void m14373a0(long j) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f10712x;
        if (tanTanCoinHeadItem != null) {
            tanTanCoinHeadItem.m11628B(String.valueOf(j));
        }
    }

    @Nullable
    public Act act() {
        return this.f10705q.act();
    }

    /* JADX INFO: renamed from: b0 */
    public void m14374b0(long j) {
        this.f10701m.setEnabled(j > 0);
        this.f10701m.setTextColor(j > 0 ? -16777216 : Color.parseColor("#4c000000"));
    }

    /* JADX INFO: renamed from: c0 */
    public void m14375c0(boolean z) {
        VRelative vRelative = this.f10711w;
        if (vRelative != null) {
            xdl0.M(vRelative, z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m14376d0(boolean z) {
        VRelative vRelative = this.f10712x;
        if (vRelative != null) {
            xdl0.M(vRelative, z);
        }
    }

    public void destroy() {
        m14372Z(this.f10688A);
    }

    /* JADX INFO: renamed from: e0 */
    public void m14377e0() {
        if (this.f10709u != null) {
            boolean zM18s = IntlCountryCodeController.m18s();
            VRelative vRelative = this.f10709u;
            if (zM18s) {
                xdl0.M(vRelative, false);
            } else {
                xdl0.M(vRelative, true);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m14378f0() {
        View view = this.f10713y;
        if (view != null) {
            xdl0.M(view, NullChecker.a(CoreModule.f1534c.f3643j0.f3285i0));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.p1.mobile.putong.core.ui.wallet.TanTanCoinHeadItem] */
    /* JADX INFO: renamed from: g0 */
    public void m14379g0(String str) {
        VRelative vRelative = this.f10710v;
        if (vRelative != null) {
            xdl0.M(vRelative, CoreModule.m1854P().m11706a().m5444h5());
            ?? r2 = this.f10710v;
            r2.m11628B(String.format("%s%s", str, r2.getContext().getString(R.string.V1)));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m14380h0(boolean z) {
        this.f10701m.setEnabled(z);
        this.f10701m.setTextColor(z ? -16777216 : Color.parseColor("#4c000000"));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14357H(layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [android.view.View, com.p1.mobile.putong.core.ui.wallet.TanTanCoinHeadItem] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.View, com.p1.mobile.putong.core.ui.wallet.TanTanCoinHeadItem] */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.view.View, com.p1.mobile.putong.core.ui.wallet.TanTanCoinHeadItem] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View, com.p1.mobile.putong.core.ui.wallet.TanTanCoinHeadItem] */
    /* JADX INFO: renamed from: r */
    public void m14382r() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
        this.f10706r = gridLayoutManager;
        this.f10703o.setLayoutManager(gridLayoutManager);
        if (IntlCountryCodeController.m10k()) {
            List<Privilege> list = this.f10704p.f18515f;
            Privilege privilege = Privilege.intl_message_read;
            if (list.contains(privilege)) {
                this.f10704p.f18515f.remove(privilege);
            }
        }
        TanTanCoinFrag tanTanCoinFrag = this.f10705q;
        ozh0 ozh0Var = this.f10704p;
        fvh0 fvh0Var = new fvh0(tanTanCoinFrag, ozh0Var.f18515f, ozh0Var.f18511b);
        this.f10708t = fvh0Var;
        this.f10707s = new jxk(fvh0Var);
        LinearLayout linearLayout = new LinearLayout(m14356C0());
        this.f10714z = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f10714z.setOrientation(1);
        if (qib0.f19804b0.f17708c.Qj() && (CoreModule.f1546o.m25559d().m5739b() || CoreModule.m1855Q().a().c() || IntlCountryCodeController.m18s())) {
            View view = (LinearLayout) this.f10705q.m1542H2().inflate(m6c0.k2, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = t100.d(22.0f);
            layoutParams.bottomMargin = t100.d(12.0f);
            view.setLayoutParams(layoutParams);
            zvf0.x("e_live_send_gift_record_button", "p_wallet");
            zvf0.x("e_live_my_level", "p_wallet");
            ?? r3 = (TanTanCoinHeadItem) view.findViewById(z4c0.l0);
            r3.m11629H(R.string.F6).m11631q(d3c0.gb);
            ?? r7 = (TanTanCoinHeadItem) view.findViewById(z4c0.o0);
            r7.m11629H(R.string.I6).m11631q(d3c0.pb);
            TanTanCoinHeadItem tanTanCoinHeadItem = (TanTanCoinHeadItem) view.findViewById(z4c0.n0);
            this.f10709u = tanTanCoinHeadItem;
            tanTanCoinHeadItem.m11629H(R.string.H6).m11631q(d3c0.ob);
            ?? r8 = (TanTanCoinHeadItem) view.findViewById(z4c0.m0);
            r8.m11629H(R.string.z).m11631q(d3c0.hb);
            xdl0.E0((View) r8, this.f10704p.f18517h);
            ?? r9 = (TanTanCoinHeadItem) view.findViewById(z4c0.E0);
            r9.m11629H(R.string.J).m11631q(d3c0.rb);
            TanTanCoinHeadItem tanTanCoinHeadItem2 = (TanTanCoinHeadItem) view.findViewById(z4c0.F0);
            this.f10710v = tanTanCoinHeadItem2;
            tanTanCoinHeadItem2.m11629H(R.string.D1).m11631q(d3c0.sb);
            xdl0.E0(this.f10710v, this.f10704p.f18523n);
            TanTanCoinHeadItem tanTanCoinHeadItem3 = (TanTanCoinHeadItem) view.findViewById(z4c0.d1);
            this.f10711w = tanTanCoinHeadItem3;
            tanTanCoinHeadItem3.m11629H(R.string.F1).m11631q(d3c0.ub).m11632z(false);
            TanTanCoinHeadItem tanTanCoinHeadItem4 = (TanTanCoinHeadItem) view.findViewById(z4c0.z);
            this.f10712x = tanTanCoinHeadItem4;
            tanTanCoinHeadItem4.m11629H(R.string.G1).m11631q(d3c0.kb).m11632z(false);
            xdl0.E0(this.f10709u, this.f10704p.f18516g);
            xdl0.E0((View) r7, this.f10704p.f18518i);
            xdl0.M((View) r9, false);
            this.f10714z.addView(view);
            if (IntlCountryCodeController.m18s()) {
                xdl0.M((View) r3, false);
                xdl0.M(this.f10709u, false);
            } else {
                zvf0.x("e_live_receive_gift_record_button", "p_wallet");
                zvf0.x("e_live_income_button", "p_wallet");
            }
            if (CoreModule.m1855Q().getLiveVerification().a()) {
                xdl0.M((View) r3, true);
                xdl0.E0((View) r3, this.f10704p.f18521l);
            } else {
                xdl0.M((View) r3, false);
            }
        } else {
            View view2 = (TextView) this.f10705q.m1542H2().inflate(m6c0.e0, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = t100.d(24.0f);
            layoutParams2.bottomMargin = t100.d(12.0f);
            view2.setLayoutParams(layoutParams2);
            this.f10714z.addView(view2);
        }
        this.f10707s.H(this.f10714z);
        View viewInflate = this.f10705q.m1542H2().inflate(m6c0.j2, (ViewGroup) null);
        this.f10713y = viewInflate;
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.d(100.0f)));
        this.f10707s.F(this.f10713y);
        this.f10703o.setAdapter(this.f10707s);
        VText vText = this.f10694f;
        boolean zM10k = IntlCountryCodeController.m10k();
        ozh0 ozh0Var2 = this.f10704p;
        xdl0.E0(vText, zM10k ? ozh0Var2.f18519j : ozh0Var2.f18520k);
        TextView textView = this.f10702n;
        boolean zM10k2 = IntlCountryCodeController.m10k();
        ozh0 ozh0Var3 = this.f10704p;
        xdl0.E0(textView, zM10k2 ? ozh0Var3.f18519j : ozh0Var3.f18520k);
        this.f10689a.setLeftIconAsBack(act());
        this.f10689a.setLeftIconResource(d3c0.n);
        this.f10689a.setTitle(R.string.ga);
        View vIcon = new VIcon(m14356C0());
        vIcon.setIconStyle(3);
        vIcon.setImageResource(d3c0.f4);
        xdl0.E0(vIcon, new View.OnClickListener() { // from class: l.szh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f21779a.m14332T(view3);
            }
        });
        this.f10689a.setRightIconViews(new View[]{vIcon});
        this.f10689a.getLeftIconContainer().setBackgroundResource(d3c0.m);
        vIcon.setBackgroundResource(d3c0.m);
        vIcon.setPadding(t100.d(3.0f), t100.d(3.0f), t100.d(3.0f), t100.d(3.0f));
        final LuckyTtConfig luckyTtConfig = CoreModule.f1534c.f3643j0.f3285i0;
        if (NullChecker.a(luckyTtConfig)) {
            AutoVDraweeView autoVDraweeViewFindViewById = this.f10713y.findViewById(z4c0.j);
            autoVDraweeViewFindViewById.x(luckyTtConfig.bannerUrl, 1);
            xdl0.E0(autoVDraweeViewFindViewById, new View.OnClickListener() { // from class: l.vzh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f24561a.m14369U(luckyTtConfig, view3);
                }
            });
        }
        xdl0.M(this.f10713y, false);
        xdl0.M(this.f10690b, true ^ n4i0.b());
        xdl0.M(this.f10695g, n4i0.b());
        xdl0.E0(this.f10701m, new View.OnClickListener() { // from class: l.wzh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f25509a.m14334W(view3);
            }
        });
    }
}
