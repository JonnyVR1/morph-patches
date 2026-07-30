package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.H5Merchandise;
import com.p051p1.mobile.putong.core.data.H5PayOrderData;
import com.p051p1.mobile.putong.core.data.H5PaymentChannels;
import com.p051p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundRelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinPayCoolsView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jbc0;
import p153l.jyb;
import p153l.mk60;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinPayCoolsView extends RoundRelativeLayout {

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f39093b;

    /* JADX INFO: renamed from: c */
    public TextView f39094c;

    /* JADX INFO: renamed from: d */
    public VText f39095d;

    /* JADX INFO: renamed from: e */
    public TextView f39096e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinPayCoolsView$a */
    public static class C9218a {
        /* JADX INFO: renamed from: b */
        public static void m59321b(TanTanCoinPayCoolsView tanTanCoinPayCoolsView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            tanTanCoinPayCoolsView.f39093b = (AutoVDraweeView) viewGroup.getChildAt(0);
            tanTanCoinPayCoolsView.f39094c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            tanTanCoinPayCoolsView.f39095d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            tanTanCoinPayCoolsView.f39096e = (TextView) viewGroup.getChildAt(2);
        }
    }

    public TanTanCoinPayCoolsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m59312a(Act act, List list, ArrayList arrayList, H5PaymentChannels h5PaymentChannels, View view) {
        new mk60(act).m158725v(list, arrayList, h5PaymentChannels);
        i4g0.m138523u("e_intl_premium_sku", OMSDialogPositon.p_wallet, jyb.m147494Y("intl_sub_duration", ((H5Merchandise) list.get(0)).quantity + ""));
    }

    /* JADX INFO: renamed from: f */
    public final void m59317f(View view) {
        C9218a.m59321b(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m59318g(final Act act, final List<H5Merchandise> list, final ArrayList<H5PayOrderData> arrayList, final H5PaymentChannels h5PaymentChannels) {
        m59317f(this);
        i4g0.m138492A("e_intl_premium_sku", OMSDialogPositon.p_wallet, jyb.m147494Y("intl_sub_duration", list.get(0).quantity + ""));
        this.f39094c.setText(act.getString(R$string.f28511y6, list.get(0).quantity + ""));
        this.f39093b.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IklCNUtKQk5YVENYRkJJVkpJRDZSVFNMRDdTUVg0QzEzIiwidyI6MjQzLCJoIjoxOTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk0OTI0OTAyMzQwMTc0NzU4fQ.png", 1);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.i6i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TanTanCoinPayCoolsView.m59312a(act, list, arrayList, h5PaymentChannels, view);
            }
        });
        if (m59319h(act, arrayList)) {
            return;
        }
        H5StockKeepUnit h5StockKeepUnit = list.get(0).defaultStockKeepUnit;
        if (NullChecker.m82486a(h5StockKeepUnit)) {
            Prices prices = h5StockKeepUnit.prices;
            if (NullChecker.m82486a(prices)) {
                this.f39096e.setText(((int) prices.price) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + prices.currencyCode);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m59319h(Act act, ArrayList<H5PayOrderData> arrayList) {
        if (!NullChecker.m82486a(arrayList) || arrayList.isEmpty()) {
            return false;
        }
        this.f39096e.setText("Pending");
        this.f39096e.setCompoundDrawables(act.getDrawable(jbc0.f119419U0), null, null, null);
        this.f39096e.setCompoundDrawablePadding(bnl0.m105587w(4.0f));
        return true;
    }

    public TanTanCoinPayCoolsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinPayCoolsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
