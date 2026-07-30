package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.H5Merchandise;
import com.p046p1.mobile.putong.core.data.H5PayOrderData;
import com.p046p1.mobile.putong.core.data.H5PaymentChannels;
import com.p046p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundRelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinPayCoolsView;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VText;
import p149l.d3c0;
import p149l.hc60;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinPayCoolsView extends RoundRelativeLayout {

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f38245b;

    /* JADX INFO: renamed from: c */
    public TextView f38246c;

    /* JADX INFO: renamed from: d */
    public VText f38247d;

    /* JADX INFO: renamed from: e */
    public TextView f38248e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinPayCoolsView$a */
    public static class C9055a {
        /* JADX INFO: renamed from: b */
        public static void m58138b(TanTanCoinPayCoolsView tanTanCoinPayCoolsView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            tanTanCoinPayCoolsView.f38245b = (AutoVDraweeView) viewGroup.getChildAt(0);
            tanTanCoinPayCoolsView.f38246c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            tanTanCoinPayCoolsView.f38247d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            tanTanCoinPayCoolsView.f38248e = (TextView) viewGroup.getChildAt(2);
        }
    }

    public TanTanCoinPayCoolsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58129a(Act act, List list, ArrayList arrayList, H5PaymentChannels h5PaymentChannels, View view) {
        new hc60(act).m130413v(list, arrayList, h5PaymentChannels);
        zvf0.m220399u("e_intl_premium_sku", OMSDialogPositon.p_wallet, vwb.m200311Y("intl_sub_duration", ((H5Merchandise) list.get(0)).quantity + ""));
    }

    /* JADX INFO: renamed from: f */
    public final void m58134f(View view) {
        C9055a.m58138b(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m58135g(final Act act, final List<H5Merchandise> list, final ArrayList<H5PayOrderData> arrayList, final H5PaymentChannels h5PaymentChannels) {
        m58134f(this);
        zvf0.m220368A("e_intl_premium_sku", OMSDialogPositon.p_wallet, vwb.m200311Y("intl_sub_duration", list.get(0).quantity + ""));
        this.f38246c.setText(act.getString(R$string.f27663y6, list.get(0).quantity + ""));
        this.f38245b.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IklCNUtKQk5YVENYRkJJVkpJRDZSVFNMRDdTUVg0QzEzIiwidyI6MjQzLCJoIjoxOTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk0OTI0OTAyMzQwMTc0NzU4fQ.png", 1);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ayh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TanTanCoinPayCoolsView.m58129a(act, list, arrayList, h5PaymentChannels, view);
            }
        });
        if (m58136h(act, arrayList)) {
            return;
        }
        H5StockKeepUnit h5StockKeepUnit = list.get(0).defaultStockKeepUnit;
        if (NullChecker.m81303a(h5StockKeepUnit)) {
            Prices prices = h5StockKeepUnit.prices;
            if (NullChecker.m81303a(prices)) {
                this.f38248e.setText(((int) prices.price) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + prices.currencyCode);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m58136h(Act act, ArrayList<H5PayOrderData> arrayList) {
        if (!NullChecker.m81303a(arrayList) || arrayList.isEmpty()) {
            return false;
        }
        this.f38248e.setText("Pending");
        this.f38248e.setCompoundDrawables(act.getDrawable(d3c0.f83764U0), null, null, null);
        this.f38248e.setCompoundDrawablePadding(xdl0.m208407w(4.0f));
        return true;
    }

    public TanTanCoinPayCoolsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinPayCoolsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
