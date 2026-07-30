package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p004ui.roundcorners.view.RoundRelativeLayout;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinPayCoolsView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.H5Merchandise;
import com.p1.mobile.putong.core.data.H5PayOrderData;
import com.p1.mobile.putong.core.data.H5PaymentChannels;
import com.p1.mobile.putong.core.data.H5StockKeepUnit;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d3c0;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.hc60;
import v.AutoVDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinPayCoolsView extends RoundRelativeLayout {

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f8026b;

    /* JADX INFO: renamed from: c */
    public TextView f8027c;

    /* JADX INFO: renamed from: d */
    public VText f8028d;

    /* JADX INFO: renamed from: e */
    public TextView f8029e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinPayCoolsView$a */
    public static class C0491a {
        /* JADX INFO: renamed from: b */
        public static void m11671b(TanTanCoinPayCoolsView tanTanCoinPayCoolsView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            tanTanCoinPayCoolsView.f8026b = viewGroup.getChildAt(0);
            tanTanCoinPayCoolsView.f8027c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            tanTanCoinPayCoolsView.f8028d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            tanTanCoinPayCoolsView.f8029e = (TextView) viewGroup.getChildAt(2);
        }
    }

    public TanTanCoinPayCoolsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11662a(Act act, List list, ArrayList arrayList, H5PaymentChannels h5PaymentChannels, View view) {
        new hc60(act).m16163v(list, arrayList, h5PaymentChannels);
        zvf0.u("e_intl_premium_sku", "p_wallet", new j760[]{vwb.Y("intl_sub_duration", ((H5Merchandise) list.get(0)).quantity + "")});
    }

    /* JADX INFO: renamed from: f */
    public final void m11667f(View view) {
        C0491a.m11671b(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m11668g(final Act act, final List<H5Merchandise> list, final ArrayList<H5PayOrderData> arrayList, final H5PaymentChannels h5PaymentChannels) {
        m11667f(this);
        zvf0.A("e_intl_premium_sku", "p_wallet", new j760[]{vwb.Y("intl_sub_duration", list.get(0).quantity + "")});
        this.f8027c.setText(act.getString(R.string.y6, list.get(0).quantity + ""));
        this.f8026b.x("https://auto.tancdn.com/v1/images/eyJpZCI6IklCNUtKQk5YVENYRkJJVkpJRDZSVFNMRDdTUVg0QzEzIiwidyI6MjQzLCJoIjoxOTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk0OTI0OTAyMzQwMTc0NzU4fQ.png", 1);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ayh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TanTanCoinPayCoolsView.m11662a(act, list, arrayList, h5PaymentChannels, view);
            }
        });
        if (m11669h(act, arrayList)) {
            return;
        }
        H5StockKeepUnit h5StockKeepUnit = list.get(0).defaultStockKeepUnit;
        if (NullChecker.a(h5StockKeepUnit)) {
            Prices prices = h5StockKeepUnit.prices;
            if (NullChecker.a(prices)) {
                this.f8029e.setText(((int) prices.price) + " " + prices.currencyCode);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m11669h(Act act, ArrayList<H5PayOrderData> arrayList) {
        if (!NullChecker.a(arrayList) || arrayList.isEmpty()) {
            return false;
        }
        this.f8029e.setText("Pending");
        this.f8029e.setCompoundDrawables(act.getDrawable(d3c0.U0), null, null, null);
        this.f8029e.setCompoundDrawablePadding(xdl0.w(4.0f));
        return true;
    }

    public TanTanCoinPayCoolsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinPayCoolsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
