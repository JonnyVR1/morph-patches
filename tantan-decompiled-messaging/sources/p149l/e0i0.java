package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4745k;
import com.p046p1.mobile.putong.core.data.H5Merchandise;
import com.p046p1.mobile.putong.core.data.H5MerchandiseData;
import com.p046p1.mobile.putong.core.data.H5PayOrderConfigData;
import com.p046p1.mobile.putong.core.data.H5PayOrderData;
import com.p046p1.mobile.putong.core.data.H5PaymentChannels;
import com.p046p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p046p1.mobile.putong.core.data.LuckyTtConfig;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinFrag;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinHeadItem;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinPayCoolsView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p147v.AutoVDraweeView;
import p147v.VIcon;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class e0i0 implements s7m<ozh0> {

    /* JADX INFO: renamed from: A */
    public c4g0 f88619A;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f88620a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f88621b;

    /* JADX INFO: renamed from: c */
    public VText f88622c;

    /* JADX INFO: renamed from: d */
    public TextView f88623d;

    /* JADX INFO: renamed from: e */
    public VText f88624e;

    /* JADX INFO: renamed from: f */
    public VText f88625f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f88626g;

    /* JADX INFO: renamed from: h */
    public VText f88627h;

    /* JADX INFO: renamed from: i */
    public TextView f88628i;

    /* JADX INFO: renamed from: j */
    public VText f88629j;

    /* JADX INFO: renamed from: k */
    public TextView f88630k;

    /* JADX INFO: renamed from: l */
    public VText f88631l;

    /* JADX INFO: renamed from: m */
    public TextView f88632m;

    /* JADX INFO: renamed from: n */
    public TextView f88633n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f88634o;

    /* JADX INFO: renamed from: p */
    public ozh0 f88635p;

    /* JADX INFO: renamed from: q */
    public TanTanCoinFrag f88636q;

    /* JADX INFO: renamed from: r */
    public GridLayoutManager f88637r;

    /* JADX INFO: renamed from: s */
    public jxk f88638s;

    /* JADX INFO: renamed from: t */
    public fvh0 f88639t;

    /* JADX INFO: renamed from: u */
    public TanTanCoinHeadItem f88640u;

    /* JADX INFO: renamed from: v */
    public TanTanCoinHeadItem f88641v;

    /* JADX INFO: renamed from: w */
    public TanTanCoinHeadItem f88642w;

    /* JADX INFO: renamed from: x */
    public TanTanCoinHeadItem f88643x;

    /* JADX INFO: renamed from: y */
    public View f88644y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f88645z;

    /* JADX INFO: renamed from: l.e0i0$a */
    public static class C16517a {
        /* JADX INFO: renamed from: b */
        public static void m114294b(e0i0 e0i0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            e0i0Var.f88620a = (VNavigationBar) viewGroup.getChildAt(0);
            e0i0Var.f88621b = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            e0i0Var.f88622c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
            e0i0Var.f88623d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
            e0i0Var.f88624e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
            e0i0Var.f88625f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
            e0i0Var.f88626g = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            e0i0Var.f88627h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
            e0i0Var.f88628i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
            e0i0Var.f88629j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
            e0i0Var.f88630k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(4);
            e0i0Var.f88631l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(5);
            e0i0Var.f88632m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(6);
            e0i0Var.f88633n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(7);
            e0i0Var.f88634o = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m114295c(e0i0 e0i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(m6c0.f131628o2, viewGroup, false);
            m114294b(e0i0Var, viewInflate);
            return viewInflate;
        }
    }

    public e0i0(TanTanCoinFrag tanTanCoinFrag) {
        this.f88636q = tanTanCoinFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m114244T(View view) {
        String str = (String) vwb.m200347s(this.f88636q.f38230D, new w9j() { // from class: l.tzh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return e0i0.m114252f((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.m81303a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m28126v() ? "&area=US" : "";
        getAct().startActivity(MkWebViewAct.m80236a2(getAct(), getAct().string(R$string.f27318U7), xh5.m208767o(m114270J() + string + str2)));
        zvf0.m220396r("e_bill_button", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m114245V() {
        this.f88635p.m166820C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m114246W(View view) {
        Act act = getAct();
        ozh0 ozh0Var = this.f88635p;
        swh0.m186196H1(act, ozh0Var.f146444d, ozh0Var.f146445e, new d30() { // from class: l.c0i0
            @Override // p149l.d30
            public final void call() {
                this.f78153a.m114245V();
            }
        }, new d30() { // from class: l.d0i0
            @Override // p149l.d30
            public final void call() {
                e0i0.m114257m();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m114249c(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m114252f(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m114257m() {
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f88636q.getContext();
    }

    /* JADX INFO: renamed from: H */
    public View m114268H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16517a.m114295c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m114269I(Map.Entry<String, ArrayList<H5Merchandise>> entry, ArrayList<H5Merchandise> arrayList, int i) {
        H5PayOrderConfigData h5PayOrderConfigDataNew_ = H5PayOrderConfigData.new_();
        h5PayOrderConfigDataNew_.itemId = entry.getKey();
        H5StockKeepUnit h5StockKeepUnit = arrayList.get(0).defaultStockKeepUnit;
        if (NullChecker.m81303a(h5StockKeepUnit)) {
            Prices prices = h5StockKeepUnit.prices;
            if (NullChecker.m81303a(prices)) {
                h5PayOrderConfigDataNew_.price = prices.price;
            }
        }
        h5PayOrderConfigDataNew_.title = getAct().getString(R$string.f27663y6, i + "");
        C4745k.f20046V.add(h5PayOrderConfigDataNew_);
    }

    /* JADX INFO: renamed from: J */
    public final String m114270J() {
        return CoreModule.m29932K().mo30835xf() ? "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/diamond" : "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/";
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ozh0 ozh0Var) {
        this.f88635p = ozh0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m114272L(String str) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f88642w;
        if (tanTanCoinHeadItem != null) {
            tanTanCoinHeadItem.m58095B(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m114273M(String str) {
        this.f88624e.setText(str);
        this.f88629j.setText(str);
    }

    /* JADX INFO: renamed from: N */
    public void m114274N(long j) {
        this.f88631l.setText(swh0.m186215U(j));
    }

    /* JADX INFO: renamed from: O */
    public final void m114275O(H5PaymentChannels h5PaymentChannels, String str, List<H5Merchandise> list, ArrayList<H5PayOrderData> arrayList, boolean z) {
        TanTanCoinPayCoolsView tanTanCoinPayCoolsView = (TanTanCoinPayCoolsView) getAct().inflater().inflate(m6c0.f131669z, (ViewGroup) null);
        tanTanCoinPayCoolsView.setTag(str);
        tanTanCoinPayCoolsView.m58135g(getAct(), list, arrayList, h5PaymentChannels);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, xdl0.m208407w(90.0f));
        layoutParams.bottomMargin = xdl0.m208407w(12.0f);
        if (!z) {
            layoutParams.topMargin = xdl0.m208407w(12.0f);
        }
        this.f88645z.addView(tanTanCoinPayCoolsView, layoutParams);
    }

    /* JADX INFO: renamed from: P */
    public void m114276P() {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f88640u;
        if (tanTanCoinHeadItem != null) {
            xdl0.m208344M(tanTanCoinHeadItem, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m114277Q() {
        View view = this.f88644y;
        if (view != null) {
            xdl0.m208344M(view, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m114278R() {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f88641v;
        if (tanTanCoinHeadItem != null) {
            xdl0.m208344M(tanTanCoinHeadItem, false);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m114279S(H5MerchandiseData h5MerchandiseData, List<H5PayOrderData> list) {
        if (NullChecker.m81303a(h5MerchandiseData)) {
            HashMap mapM200289C = vwb.m200289C(h5MerchandiseData.merchandises, new w9j() { // from class: l.zzh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((H5Merchandise) obj).defaultStockKeepUnit.f20411id;
                }
            });
            HashMap mapM200289C2 = vwb.m200289C(list, new w9j() { // from class: l.a0i0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((H5PayOrderData) obj).itemId;
                }
            });
            ArrayList arrayListM200339n = vwb.m200339n(h5MerchandiseData.paymentChannels, new w9j() { // from class: l.b0i0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("payCools".equals(((H5PaymentChannels) obj).payment));
                }
            });
            H5PaymentChannels h5PaymentChannels = arrayListM200339n.isEmpty() ? null : (H5PaymentChannels) arrayListM200339n.get(0);
            if (mapM200289C.values().size() > 0) {
                C4745k.f20046V.clear();
                boolean z = true;
                for (Map.Entry<String, ArrayList<H5Merchandise>> entry : mapM200289C.entrySet()) {
                    ArrayList<H5Merchandise> value = entry.getValue();
                    if (NullChecker.m81303a(value) && !value.isEmpty()) {
                        int i = value.get(0).quantity;
                        m114269I(entry, value, i);
                        if (!h6a.m129472e() || i == 1) {
                            if (!h6a.m129473f() || i == 3) {
                                if (!h6a.m129471d() || i == 12) {
                                    m114275O(h5PaymentChannels, entry.getKey(), value, (ArrayList) mapM200289C2.get(entry.getKey()), z);
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
    public final /* synthetic */ void m114280U(LuckyTtConfig luckyTtConfig, View view) {
        this.f88635p.m166822E1(luckyTtConfig.jumpUrl);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m114281X(List list) {
        HashMap mapM200289C = vwb.m200289C(list, new w9j() { // from class: l.uzh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((H5PayOrderData) obj).itemId;
            }
        });
        for (int i = 0; i < this.f88645z.getChildCount(); i++) {
            View childAt = this.f88645z.getChildAt(i);
            if (childAt instanceof TanTanCoinPayCoolsView) {
                TanTanCoinPayCoolsView tanTanCoinPayCoolsView = (TanTanCoinPayCoolsView) childAt;
                tanTanCoinPayCoolsView.m58136h(getAct(), (ArrayList) mapM200289C.get(tanTanCoinPayCoolsView.getTag()));
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m114282Y() {
        if (!xma.m210047L3() && xma.m210087m4() && xma.m210077h4()) {
            m114283Z(this.f88619A);
            this.f88619A = getAct().duringCreated(CoreModule.f17545c.f19604S0.m34185t3()).subscribe(mkd0.m154956H(new e30() { // from class: l.xzh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f195203a.m114281X((List) obj);
                }
            }, new e30() { // from class: l.yzh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e0i0.m114249c((Throwable) obj);
                }
            }));
            return;
        }
        for (int i = 0; i < this.f88645z.getChildCount(); i++) {
            View childAt = this.f88645z.getChildAt(i);
            if (childAt instanceof TanTanCoinPayCoolsView) {
                xdl0.m208344M(childAt, false);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m114283Z(c4g0 c4g0Var) {
        mkd0.m154992z(c4g0Var);
    }

    /* JADX INFO: renamed from: a0 */
    public void m114284a0(long j) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f88643x;
        if (tanTanCoinHeadItem != null) {
            tanTanCoinHeadItem.m58095B(String.valueOf(j));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f88636q.act();
    }

    /* JADX INFO: renamed from: b0 */
    public void m114285b0(long j) {
        this.f88632m.setEnabled(j > 0);
        this.f88632m.setTextColor(j > 0 ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#4c000000"));
    }

    /* JADX INFO: renamed from: c0 */
    public void m114286c0(boolean z) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f88642w;
        if (tanTanCoinHeadItem != null) {
            xdl0.m208344M(tanTanCoinHeadItem, z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m114287d0(boolean z) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f88643x;
        if (tanTanCoinHeadItem != null) {
            xdl0.m208344M(tanTanCoinHeadItem, z);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        m114283Z(this.f88619A);
    }

    /* JADX INFO: renamed from: e0 */
    public void m114288e0() {
        if (this.f88640u != null) {
            boolean zM28123s = IntlCountryCodeController.m28123s();
            TanTanCoinHeadItem tanTanCoinHeadItem = this.f88640u;
            if (zM28123s) {
                xdl0.m208344M(tanTanCoinHeadItem, false);
            } else {
                xdl0.m208344M(tanTanCoinHeadItem, true);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m114289f0() {
        View view = this.f88644y;
        if (view != null) {
            xdl0.m208344M(view, NullChecker.m81303a(CoreModule.f17545c.f19654j0.f19296i0));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m114290g0(String str) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f88641v;
        if (tanTanCoinHeadItem != null) {
            xdl0.m208344M(tanTanCoinHeadItem, CoreModule.m29935P().m94651a().mo33507h5());
            TanTanCoinHeadItem tanTanCoinHeadItem2 = this.f88641v;
            tanTanCoinHeadItem2.m58095B(String.format("%s%s", str, tanTanCoinHeadItem2.getContext().getString(R$string.f27323V1)));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m114291h0(boolean z) {
        this.f88632m.setEnabled(z);
        this.f88632m.setTextColor(z ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#4c000000"));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m114268H(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m114292r() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getAct(), 2);
        this.f88637r = gridLayoutManager;
        this.f88634o.setLayoutManager(gridLayoutManager);
        if (IntlCountryCodeController.m28115k()) {
            List<Privilege> list = this.f88635p.f146446f;
            Privilege privilege = Privilege.intl_message_read;
            if (list.contains(privilege)) {
                this.f88635p.f146446f.remove(privilege);
            }
        }
        TanTanCoinFrag tanTanCoinFrag = this.f88636q;
        ozh0 ozh0Var = this.f88635p;
        fvh0 fvh0Var = new fvh0(tanTanCoinFrag, ozh0Var.f146446f, ozh0Var.f146442b);
        this.f88639t = fvh0Var;
        this.f88638s = new jxk(fvh0Var);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f88645z = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f88645z.setOrientation(1);
        if (qib0.f154713b0.f139232c.mo67237Qj() && (CoreModule.f17557o.m195057d().mo33802b() || CoreModule.m29936Q().mo67255a().mo124836c() || IntlCountryCodeController.m28123s())) {
            View view = (LinearLayout) this.f88636q.mo20578H2().inflate(m6c0.f131612k2, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = t100.m186890d(22.0f);
            layoutParams.bottomMargin = t100.m186890d(12.0f);
            view.setLayoutParams(layoutParams);
            zvf0.m220402x("e_live_send_gift_record_button", OMSDialogPositon.p_wallet);
            zvf0.m220402x("e_live_my_level", OMSDialogPositon.p_wallet);
            TanTanCoinHeadItem tanTanCoinHeadItem = (TanTanCoinHeadItem) view.findViewById(z4c0.f201544l0);
            tanTanCoinHeadItem.m58096H(R$string.f27152F6).m58098q(d3c0.f83937gb);
            TanTanCoinHeadItem tanTanCoinHeadItem2 = (TanTanCoinHeadItem) view.findViewById(z4c0.f201553o0);
            tanTanCoinHeadItem2.m58096H(R$string.f27185I6).m58098q(d3c0.f84063pb);
            TanTanCoinHeadItem tanTanCoinHeadItem3 = (TanTanCoinHeadItem) view.findViewById(z4c0.f201550n0);
            this.f88640u = tanTanCoinHeadItem3;
            tanTanCoinHeadItem3.m58096H(R$string.f27174H6).m58098q(d3c0.f84049ob);
            TanTanCoinHeadItem tanTanCoinHeadItem4 = (TanTanCoinHeadItem) view.findViewById(z4c0.f201547m0);
            tanTanCoinHeadItem4.m58096H(R$string.f27667z).m58098q(d3c0.f83951hb);
            xdl0.m208329E0(tanTanCoinHeadItem4, this.f88635p.f146448h);
            TanTanCoinHeadItem tanTanCoinHeadItem5 = (TanTanCoinHeadItem) view.findViewById(z4c0.f201467E0);
            tanTanCoinHeadItem5.m58096H(R$string.f27189J).m58098q(d3c0.f84091rb);
            TanTanCoinHeadItem tanTanCoinHeadItem6 = (TanTanCoinHeadItem) view.findViewById(z4c0.f201469F0);
            this.f88641v = tanTanCoinHeadItem6;
            tanTanCoinHeadItem6.m58096H(R$string.f27125D1).m58098q(d3c0.f84105sb);
            xdl0.m208329E0(this.f88641v, this.f88635p.f146454n);
            TanTanCoinHeadItem tanTanCoinHeadItem7 = (TanTanCoinHeadItem) view.findViewById(z4c0.f201521d1);
            this.f88642w = tanTanCoinHeadItem7;
            tanTanCoinHeadItem7.m58096H(R$string.f27147F1).m58098q(d3c0.f84133ub).m58099z(false);
            TanTanCoinHeadItem tanTanCoinHeadItem8 = (TanTanCoinHeadItem) view.findViewById(z4c0.f201576z);
            this.f88643x = tanTanCoinHeadItem8;
            tanTanCoinHeadItem8.m58096H(R$string.f27158G1).m58098q(d3c0.f83993kb).m58099z(false);
            xdl0.m208329E0(this.f88640u, this.f88635p.f146447g);
            xdl0.m208329E0(tanTanCoinHeadItem2, this.f88635p.f146449i);
            xdl0.m208344M(tanTanCoinHeadItem5, false);
            this.f88645z.addView(view);
            if (IntlCountryCodeController.m28123s()) {
                xdl0.m208344M(tanTanCoinHeadItem, false);
                xdl0.m208344M(this.f88640u, false);
            } else {
                zvf0.m220402x("e_live_receive_gift_record_button", OMSDialogPositon.p_wallet);
                zvf0.m220402x("e_live_income_button", OMSDialogPositon.p_wallet);
            }
            if (CoreModule.m29936Q().getLiveVerification().mo103895a()) {
                xdl0.m208344M(tanTanCoinHeadItem, true);
                xdl0.m208329E0(tanTanCoinHeadItem, this.f88635p.f146452l);
            } else {
                xdl0.m208344M(tanTanCoinHeadItem, false);
            }
        } else {
            View view2 = (TextView) this.f88636q.mo20578H2().inflate(m6c0.f131582e0, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = t100.m186890d(24.0f);
            layoutParams2.bottomMargin = t100.m186890d(12.0f);
            view2.setLayoutParams(layoutParams2);
            this.f88645z.addView(view2);
        }
        this.f88638s.m143815H(this.f88645z);
        View viewInflate = this.f88636q.mo20578H2().inflate(m6c0.f131608j2, (ViewGroup) null);
        this.f88644y = viewInflate;
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.m186890d(100.0f)));
        this.f88638s.m143813F(this.f88644y);
        this.f88634o.setAdapter(this.f88638s);
        VText vText = this.f88625f;
        boolean zM28115k = IntlCountryCodeController.m28115k();
        ozh0 ozh0Var2 = this.f88635p;
        xdl0.m208329E0(vText, zM28115k ? ozh0Var2.f146450j : ozh0Var2.f146451k);
        TextView textView = this.f88633n;
        boolean zM28115k2 = IntlCountryCodeController.m28115k();
        ozh0 ozh0Var3 = this.f88635p;
        xdl0.m208329E0(textView, zM28115k2 ? ozh0Var3.f146450j : ozh0Var3.f146451k);
        this.f88620a.setLeftIconAsBack(getAct());
        this.f88620a.setLeftIconResource(d3c0.f84023n);
        this.f88620a.setTitle(R$string.f27459ga);
        VIcon vIcon = new VIcon(getContext());
        vIcon.setIconStyle(3);
        vIcon.setImageResource(d3c0.f83916f4);
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.szh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f167059a.m114244T(view3);
            }
        });
        this.f88620a.setRightIconViews(vIcon);
        this.f88620a.getLeftIconContainer().setBackgroundResource(d3c0.f84009m);
        vIcon.setBackgroundResource(d3c0.f84009m);
        vIcon.setPadding(t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f), t100.m186890d(3.0f));
        final LuckyTtConfig luckyTtConfig = CoreModule.f17545c.f19654j0.f19296i0;
        if (NullChecker.m81303a(luckyTtConfig)) {
            AutoVDraweeView autoVDraweeView = (AutoVDraweeView) this.f88644y.findViewById(z4c0.f201537j);
            autoVDraweeView.m222887x(luckyTtConfig.bannerUrl, 1);
            xdl0.m208329E0(autoVDraweeView, new View.OnClickListener() { // from class: l.vzh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f183636a.m114280U(luckyTtConfig, view3);
                }
            });
        }
        xdl0.m208344M(this.f88644y, false);
        xdl0.m208344M(this.f88621b, true ^ n4i0.m157866b());
        xdl0.m208344M(this.f88626g, n4i0.m157866b());
        xdl0.m208329E0(this.f88632m, new View.OnClickListener() { // from class: l.wzh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f188734a.m114246W(view3);
            }
        });
    }
}
