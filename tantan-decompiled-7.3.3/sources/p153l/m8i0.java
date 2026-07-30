package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4896k;
import com.p051p1.mobile.putong.core.data.H5Merchandise;
import com.p051p1.mobile.putong.core.data.H5MerchandiseData;
import com.p051p1.mobile.putong.core.data.H5PayOrderConfigData;
import com.p051p1.mobile.putong.core.data.H5PayOrderData;
import com.p051p1.mobile.putong.core.data.H5PaymentChannels;
import com.p051p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p051p1.mobile.putong.core.data.LuckyTtConfig;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinFrag;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinHeadItem;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinPayCoolsView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p151v.AutoVDraweeView;
import p151v.VIcon;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class m8i0 implements iam<w7i0> {

    /* JADX INFO: renamed from: A */
    public kcg0 f135232A;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f135233a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f135234b;

    /* JADX INFO: renamed from: c */
    public VText f135235c;

    /* JADX INFO: renamed from: d */
    public TextView f135236d;

    /* JADX INFO: renamed from: e */
    public VText f135237e;

    /* JADX INFO: renamed from: f */
    public VText f135238f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f135239g;

    /* JADX INFO: renamed from: h */
    public VText f135240h;

    /* JADX INFO: renamed from: i */
    public TextView f135241i;

    /* JADX INFO: renamed from: j */
    public VText f135242j;

    /* JADX INFO: renamed from: k */
    public TextView f135243k;

    /* JADX INFO: renamed from: l */
    public VText f135244l;

    /* JADX INFO: renamed from: m */
    public TextView f135245m;

    /* JADX INFO: renamed from: n */
    public TextView f135246n;

    /* JADX INFO: renamed from: o */
    public VRecyclerView f135247o;

    /* JADX INFO: renamed from: p */
    public w7i0 f135248p;

    /* JADX INFO: renamed from: q */
    public TanTanCoinFrag f135249q;

    /* JADX INFO: renamed from: r */
    public GridLayoutManager f135250r;

    /* JADX INFO: renamed from: s */
    public zzk f135251s;

    /* JADX INFO: renamed from: t */
    public n3i0 f135252t;

    /* JADX INFO: renamed from: u */
    public TanTanCoinHeadItem f135253u;

    /* JADX INFO: renamed from: v */
    public TanTanCoinHeadItem f135254v;

    /* JADX INFO: renamed from: w */
    public TanTanCoinHeadItem f135255w;

    /* JADX INFO: renamed from: x */
    public TanTanCoinHeadItem f135256x;

    /* JADX INFO: renamed from: y */
    public View f135257y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f135258z;

    /* JADX INFO: renamed from: l.m8i0$a */
    public static class C18567a {
        /* JADX INFO: renamed from: b */
        public static void m157490b(m8i0 m8i0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            m8i0Var.f135233a = (VNavigationBar) viewGroup.getChildAt(0);
            m8i0Var.f135234b = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            m8i0Var.f135235c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
            m8i0Var.f135236d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
            m8i0Var.f135237e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
            m8i0Var.f135238f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
            m8i0Var.f135239g = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            m8i0Var.f135240h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
            m8i0Var.f135241i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
            m8i0Var.f135242j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
            m8i0Var.f135243k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(4);
            m8i0Var.f135244l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(5);
            m8i0Var.f135245m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(6);
            m8i0Var.f135246n = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(7);
            m8i0Var.f135247o = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m157491c(m8i0 m8i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(rec0.f162588o2, viewGroup, false);
            m157490b(m8i0Var, viewInflate);
            return viewInflate;
        }
    }

    public m8i0(TanTanCoinFrag tanTanCoinFrag) {
        this.f135249q = tanTanCoinFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m157440T(View view) {
        String str = (String) jyb.m147530s(this.f135249q.f39078D, new qcj() { // from class: l.b8i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return m8i0.m157448f((String) obj);
            }
        });
        StringBuilder sb = new StringBuilder("?language=");
        if (!NullChecker.m82486a(str)) {
            str = "en";
        }
        sb.append(str);
        String string = sb.toString();
        String str2 = IntlCountryCodeController.m29125v() ? "&area=US" : "";
        getAct().startActivity(MkWebViewAct.m81419b2(getAct(), getAct().string(R$string.f28166U7), xi5.m211113o(m157466J() + string + str2)));
        i4g0.m138520r("e_bill_button", OMSDialogPositon.p_wallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m157441V() {
        this.f135248p.m205327C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m157442W(View view) {
        Act act = getAct();
        w7i0 w7i0Var = this.f135248p;
        a5i0.m96101H1(act, w7i0Var.f187752d, w7i0Var.f187753e, new x20() { // from class: l.k8i0
            @Override // p153l.x20
            public final void call() {
                this.f124386a.m157441V();
            }
        }, new x20() { // from class: l.l8i0
            @Override // p153l.x20
            public final void call() {
                m8i0.m157453m();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m157445c(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m157448f(String str) {
        String string = Locale.getDefault().toString();
        if ("in_ID".equals(string)) {
            string = "id_ID";
        }
        return Boolean.valueOf(string.contains(str));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m157453m() {
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f135249q.getContext();
    }

    /* JADX INFO: renamed from: H */
    public View m157464H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18567a.m157491c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final void m157465I(Map.Entry<String, ArrayList<H5Merchandise>> entry, ArrayList<H5Merchandise> arrayList, int i) {
        H5PayOrderConfigData h5PayOrderConfigDataNew_ = H5PayOrderConfigData.new_();
        h5PayOrderConfigDataNew_.itemId = entry.getKey();
        H5StockKeepUnit h5StockKeepUnit = arrayList.get(0).defaultStockKeepUnit;
        if (NullChecker.m82486a(h5StockKeepUnit)) {
            Prices prices = h5StockKeepUnit.prices;
            if (NullChecker.m82486a(prices)) {
                h5PayOrderConfigDataNew_.price = prices.price;
            }
        }
        h5PayOrderConfigDataNew_.title = getAct().getString(R$string.f28511y6, i + "");
        C4896k.f20788V.add(h5PayOrderConfigDataNew_);
    }

    /* JADX INFO: renamed from: J */
    public final String m157466J() {
        return CoreModule.m30930K().mo31838xf() ? "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/diamond" : "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/bill-details/index.html?speed=true&_bid=1005128#/";
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w7i0 w7i0Var) {
        this.f135248p = w7i0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m157468L(String str) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f135255w;
        if (tanTanCoinHeadItem != null) {
            tanTanCoinHeadItem.m59278B(str);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m157469M(String str) {
        this.f135237e.setText(str);
        this.f135242j.setText(str);
    }

    /* JADX INFO: renamed from: N */
    public void m157470N(long j) {
        this.f135244l.setText(a5i0.m96120U(j));
    }

    /* JADX INFO: renamed from: O */
    public final void m157471O(H5PaymentChannels h5PaymentChannels, String str, List<H5Merchandise> list, ArrayList<H5PayOrderData> arrayList, boolean z) {
        TanTanCoinPayCoolsView tanTanCoinPayCoolsView = (TanTanCoinPayCoolsView) getAct().inflater().inflate(rec0.f162629z, (ViewGroup) null);
        tanTanCoinPayCoolsView.setTag(str);
        tanTanCoinPayCoolsView.m59318g(getAct(), list, arrayList, h5PaymentChannels);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, bnl0.m105587w(90.0f));
        layoutParams.bottomMargin = bnl0.m105587w(12.0f);
        if (!z) {
            layoutParams.topMargin = bnl0.m105587w(12.0f);
        }
        this.f135258z.addView(tanTanCoinPayCoolsView, layoutParams);
    }

    /* JADX INFO: renamed from: P */
    public void m157472P() {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f135253u;
        if (tanTanCoinHeadItem != null) {
            bnl0.m105524M(tanTanCoinHeadItem, false);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m157473Q() {
        View view = this.f135257y;
        if (view != null) {
            bnl0.m105524M(view, false);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m157474R() {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f135254v;
        if (tanTanCoinHeadItem != null) {
            bnl0.m105524M(tanTanCoinHeadItem, false);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m157475S(H5MerchandiseData h5MerchandiseData, List<H5PayOrderData> list) {
        if (NullChecker.m82486a(h5MerchandiseData)) {
            HashMap mapM147472C = jyb.m147472C(h5MerchandiseData.merchandises, new qcj() { // from class: l.h8i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((H5Merchandise) obj).defaultStockKeepUnit.f21153id;
                }
            });
            HashMap mapM147472C2 = jyb.m147472C(list, new qcj() { // from class: l.i8i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((H5PayOrderData) obj).itemId;
                }
            });
            ArrayList arrayListM147522n = jyb.m147522n(h5MerchandiseData.paymentChannels, new qcj() { // from class: l.j8i0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("payCools".equals(((H5PaymentChannels) obj).payment));
                }
            });
            H5PaymentChannels h5PaymentChannels = arrayListM147522n.isEmpty() ? null : (H5PaymentChannels) arrayListM147522n.get(0);
            if (mapM147472C.values().size() > 0) {
                C4896k.f20788V.clear();
                boolean z = true;
                for (Map.Entry<String, ArrayList<H5Merchandise>> entry : mapM147472C.entrySet()) {
                    ArrayList<H5Merchandise> value = entry.getValue();
                    if (NullChecker.m82486a(value) && !value.isEmpty()) {
                        int i = value.get(0).quantity;
                        m157465I(entry, value, i);
                        if (!t7a.m189549e() || i == 1) {
                            if (!t7a.m189550f() || i == 3) {
                                if (!t7a.m189548d() || i == 12) {
                                    m157471O(h5PaymentChannels, entry.getKey(), value, (ArrayList) mapM147472C2.get(entry.getKey()), z);
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
    public final /* synthetic */ void m157476U(LuckyTtConfig luckyTtConfig, View view) {
        this.f135248p.m205329E1(luckyTtConfig.jumpUrl);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m157477X(List list) {
        HashMap mapM147472C = jyb.m147472C(list, new qcj() { // from class: l.c8i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((H5PayOrderData) obj).itemId;
            }
        });
        for (int i = 0; i < this.f135258z.getChildCount(); i++) {
            View childAt = this.f135258z.getChildAt(i);
            if (childAt instanceof TanTanCoinPayCoolsView) {
                TanTanCoinPayCoolsView tanTanCoinPayCoolsView = (TanTanCoinPayCoolsView) childAt;
                tanTanCoinPayCoolsView.m59319h(getAct(), (ArrayList) mapM147472C.get(tanTanCoinPayCoolsView.getTag()));
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m157478Y() {
        if (!joa.m146361M3() && joa.m146401n4() && joa.m146392i4()) {
            m157479Z(this.f135232A);
            this.f135232A = getAct().duringCreated(CoreModule.f18264c.f20346S0.m35188t3()).subscribe(psd0.m173597H(new y20() { // from class: l.f8i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97742a.m157477X((List) obj);
                }
            }, new y20() { // from class: l.g8i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    m8i0.m157445c((Throwable) obj);
                }
            }));
            return;
        }
        for (int i = 0; i < this.f135258z.getChildCount(); i++) {
            View childAt = this.f135258z.getChildAt(i);
            if (childAt instanceof TanTanCoinPayCoolsView) {
                bnl0.m105524M(childAt, false);
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m157479Z(kcg0 kcg0Var) {
        psd0.m173633z(kcg0Var);
    }

    /* JADX INFO: renamed from: a0 */
    public void m157480a0(long j) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f135256x;
        if (tanTanCoinHeadItem != null) {
            tanTanCoinHeadItem.m59278B(String.valueOf(j));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f135249q.act();
    }

    /* JADX INFO: renamed from: b0 */
    public void m157481b0(long j) {
        this.f135245m.setEnabled(j > 0);
        this.f135245m.setTextColor(j > 0 ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#4c000000"));
    }

    /* JADX INFO: renamed from: c0 */
    public void m157482c0(boolean z) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f135255w;
        if (tanTanCoinHeadItem != null) {
            bnl0.m105524M(tanTanCoinHeadItem, z);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m157483d0(boolean z) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f135256x;
        if (tanTanCoinHeadItem != null) {
            bnl0.m105524M(tanTanCoinHeadItem, z);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        m157479Z(this.f135232A);
    }

    /* JADX INFO: renamed from: e0 */
    public void m157484e0() {
        if (this.f135253u != null) {
            boolean zM29122s = IntlCountryCodeController.m29122s();
            TanTanCoinHeadItem tanTanCoinHeadItem = this.f135253u;
            if (zM29122s) {
                bnl0.m105524M(tanTanCoinHeadItem, false);
            } else {
                bnl0.m105524M(tanTanCoinHeadItem, true);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m157485f0() {
        View view = this.f135257y;
        if (view != null) {
            bnl0.m105524M(view, NullChecker.m82486a(CoreModule.f18264c.f20396j0.f20038i0));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m157486g0(String str) {
        TanTanCoinHeadItem tanTanCoinHeadItem = this.f135254v;
        if (tanTanCoinHeadItem != null) {
            bnl0.m105524M(tanTanCoinHeadItem, CoreModule.m30933P().m143405a().mo34510h5());
            TanTanCoinHeadItem tanTanCoinHeadItem2 = this.f135254v;
            tanTanCoinHeadItem2.m59278B(String.format("%s%s", str, tanTanCoinHeadItem2.getContext().getString(R$string.f28171V1)));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m157487h0(boolean z) {
        this.f135245m.setEnabled(z);
        this.f135245m.setTextColor(z ? RoundedDrawable.DEFAULT_BORDER_COLOR : Color.parseColor("#4c000000"));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m157464H(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m157488r() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getAct(), 2);
        this.f135250r = gridLayoutManager;
        this.f135247o.setLayoutManager(gridLayoutManager);
        if (IntlCountryCodeController.m29114k()) {
            List<Privilege> list = this.f135248p.f187754f;
            Privilege privilege = Privilege.intl_message_read;
            if (list.contains(privilege)) {
                this.f135248p.f187754f.remove(privilege);
            }
        }
        TanTanCoinFrag tanTanCoinFrag = this.f135249q;
        w7i0 w7i0Var = this.f135248p;
        n3i0 n3i0Var = new n3i0(tanTanCoinFrag, w7i0Var.f187754f, w7i0Var.f187750b);
        this.f135252t = n3i0Var;
        this.f135251s = new zzk(n3i0Var);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f135258z = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f135258z.setOrientation(1);
        if (uqb0.f180396b0.f170326c.mo68420Qj() && (CoreModule.f18276o.m132214d().mo34805b() || CoreModule.m30934Q().mo68438a().mo134411c() || IntlCountryCodeController.m29122s())) {
            View view = (LinearLayout) this.f135249q.mo21577H2().inflate(rec0.f162572k2, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = qa00.m175859d(22.0f);
            layoutParams.bottomMargin = qa00.m175859d(12.0f);
            view.setLayoutParams(layoutParams);
            i4g0.m138526x("e_live_send_gift_record_button", OMSDialogPositon.p_wallet);
            i4g0.m138526x("e_live_my_level", OMSDialogPositon.p_wallet);
            TanTanCoinHeadItem tanTanCoinHeadItem = (TanTanCoinHeadItem) view.findViewById(fdc0.f98420l0);
            tanTanCoinHeadItem.m59279H(R$string.f28000F6).m59281q(jbc0.f119592gb);
            TanTanCoinHeadItem tanTanCoinHeadItem2 = (TanTanCoinHeadItem) view.findViewById(fdc0.f98429o0);
            tanTanCoinHeadItem2.m59279H(R$string.f28033I6).m59281q(jbc0.f119718pb);
            TanTanCoinHeadItem tanTanCoinHeadItem3 = (TanTanCoinHeadItem) view.findViewById(fdc0.f98426n0);
            this.f135253u = tanTanCoinHeadItem3;
            tanTanCoinHeadItem3.m59279H(R$string.f28022H6).m59281q(jbc0.f119704ob);
            TanTanCoinHeadItem tanTanCoinHeadItem4 = (TanTanCoinHeadItem) view.findViewById(fdc0.f98423m0);
            tanTanCoinHeadItem4.m59279H(R$string.f28515z).m59281q(jbc0.f119606hb);
            bnl0.m105509E0(tanTanCoinHeadItem4, this.f135248p.f187756h);
            TanTanCoinHeadItem tanTanCoinHeadItem5 = (TanTanCoinHeadItem) view.findViewById(fdc0.f98343E0);
            tanTanCoinHeadItem5.m59279H(R$string.f28037J).m59281q(jbc0.f119746rb);
            TanTanCoinHeadItem tanTanCoinHeadItem6 = (TanTanCoinHeadItem) view.findViewById(fdc0.f98345F0);
            this.f135254v = tanTanCoinHeadItem6;
            tanTanCoinHeadItem6.m59279H(R$string.f27973D1).m59281q(jbc0.f119760sb);
            bnl0.m105509E0(this.f135254v, this.f135248p.f187762n);
            TanTanCoinHeadItem tanTanCoinHeadItem7 = (TanTanCoinHeadItem) view.findViewById(fdc0.f98397d1);
            this.f135255w = tanTanCoinHeadItem7;
            tanTanCoinHeadItem7.m59279H(R$string.f27995F1).m59281q(jbc0.f119788ub).m59282z(false);
            TanTanCoinHeadItem tanTanCoinHeadItem8 = (TanTanCoinHeadItem) view.findViewById(fdc0.f98452z);
            this.f135256x = tanTanCoinHeadItem8;
            tanTanCoinHeadItem8.m59279H(R$string.f28006G1).m59281q(jbc0.f119648kb).m59282z(false);
            bnl0.m105509E0(this.f135253u, this.f135248p.f187755g);
            bnl0.m105509E0(tanTanCoinHeadItem2, this.f135248p.f187757i);
            bnl0.m105524M(tanTanCoinHeadItem5, false);
            this.f135258z.addView(view);
            if (IntlCountryCodeController.m29122s()) {
                bnl0.m105524M(tanTanCoinHeadItem, false);
                bnl0.m105524M(this.f135253u, false);
            } else {
                i4g0.m138526x("e_live_receive_gift_record_button", OMSDialogPositon.p_wallet);
                i4g0.m138526x("e_live_income_button", OMSDialogPositon.p_wallet);
            }
            if (CoreModule.m30934Q().getLiveVerification().mo112873a()) {
                bnl0.m105524M(tanTanCoinHeadItem, true);
                bnl0.m105509E0(tanTanCoinHeadItem, this.f135248p.f187760l);
            } else {
                bnl0.m105524M(tanTanCoinHeadItem, false);
            }
        } else {
            View view2 = (TextView) this.f135249q.mo21577H2().inflate(rec0.f162542e0, (ViewGroup) null);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = qa00.m175859d(24.0f);
            layoutParams2.bottomMargin = qa00.m175859d(12.0f);
            view2.setLayoutParams(layoutParams2);
            this.f135258z.addView(view2);
        }
        this.f135251s.m222265H(this.f135258z);
        View viewInflate = this.f135249q.mo21577H2().inflate(rec0.f162568j2, (ViewGroup) null);
        this.f135257y = viewInflate;
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, qa00.m175859d(100.0f)));
        this.f135251s.m222263F(this.f135257y);
        this.f135247o.setAdapter(this.f135251s);
        VText vText = this.f135238f;
        boolean zM29114k = IntlCountryCodeController.m29114k();
        w7i0 w7i0Var2 = this.f135248p;
        bnl0.m105509E0(vText, zM29114k ? w7i0Var2.f187758j : w7i0Var2.f187759k);
        TextView textView = this.f135246n;
        boolean zM29114k2 = IntlCountryCodeController.m29114k();
        w7i0 w7i0Var3 = this.f135248p;
        bnl0.m105509E0(textView, zM29114k2 ? w7i0Var3.f187758j : w7i0Var3.f187759k);
        this.f135233a.setLeftIconAsBack(getAct());
        this.f135233a.setLeftIconResource(jbc0.f119678n);
        this.f135233a.setTitle(R$string.f28307ga);
        VIcon vIcon = new VIcon(getContext());
        vIcon.setIconStyle(3);
        vIcon.setImageResource(jbc0.f119571f4);
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.a8i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f68924a.m157440T(view3);
            }
        });
        this.f135233a.setRightIconViews(vIcon);
        this.f135233a.getLeftIconContainer().setBackgroundResource(jbc0.f119664m);
        vIcon.setBackgroundResource(jbc0.f119664m);
        vIcon.setPadding(qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f), qa00.m175859d(3.0f));
        final LuckyTtConfig luckyTtConfig = CoreModule.f18264c.f20396j0.f20038i0;
        if (NullChecker.m82486a(luckyTtConfig)) {
            AutoVDraweeView autoVDraweeView = (AutoVDraweeView) this.f135257y.findViewById(fdc0.f98413j);
            autoVDraweeView.m224133x(luckyTtConfig.bannerUrl, 1);
            bnl0.m105509E0(autoVDraweeView, new View.OnClickListener() { // from class: l.d8i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f85600a.m157476U(luckyTtConfig, view3);
                }
            });
        }
        bnl0.m105524M(this.f135257y, false);
        bnl0.m105524M(this.f135234b, true ^ wci0.m205821b());
        bnl0.m105524M(this.f135239g, wci0.m205821b());
        bnl0.m105509E0(this.f135245m, new View.OnClickListener() { // from class: l.e8i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f92546a.m157442W(view3);
            }
        });
    }
}
