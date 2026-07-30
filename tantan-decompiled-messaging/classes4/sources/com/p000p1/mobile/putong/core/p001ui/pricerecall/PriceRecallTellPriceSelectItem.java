package com.p000p1.mobile.putong.core.p001ui.pricerecall;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.pay.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import l.d3c0;
import l.eqh0;
import l.i0g0;
import l.mm80;
import l.t100;
import l.vwb;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PriceRecallTellPriceSelectItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f718a;

    /* JADX INFO: renamed from: b */
    public VText f719b;

    /* JADX INFO: renamed from: c */
    public VText f720c;

    /* JADX INFO: renamed from: d */
    public VText f721d;

    /* JADX INFO: renamed from: e */
    public Merchandise f722e;

    public PriceRecallTellPriceSelectItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m931a(View view) {
        mm80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m932b(Merchandise merchandise) {
        this.f722e = merchandise;
        this.f721d.setTypeface(eqh0.c(2), 1);
        this.f718a.setTypeface(eqh0.c(2), 1);
        String string = CoreModule.b.getString(R.string.x0, Integer.valueOf(merchandise.quantity));
        String str = merchandise.quantity + "";
        SpannableStringBuilder spannableStringBuilderD0 = i0g0.d0(string, vwb.f0(new String[]{str}), vwb.f0(new Integer[]{Integer.valueOf(Color.parseColor("#333333"))}), Typeface.create(eqh0.c(2), 1), t100.d(21.0f));
        int iIndexOf = string.indexOf(str);
        spannableStringBuilderD0.setSpan(new MarginBottomSubscriptSpan(t100.a), iIndexOf, str.length() + iIndexOf, 17);
        this.f718a.setText(spannableStringBuilderD0);
        this.f720c.setTypeface(eqh0.c(3), 1);
        this.f719b.setTypeface(eqh0.c(3), 1);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.f721d.getPaint().setFlags(17);
        this.f720c.setText(decimalFormat.format(merchandise.getFirstCouponPrice()));
        this.f721d.setText(CoreModule.b.getString(R.string.m0, "¥" + decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price)));
    }

    public Merchandise getCurrentMerchandise() {
        return this.f722e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m931a(this);
    }

    public void setSelectState(boolean z) {
        if (z) {
            setBackgroundResource(d3c0.W5);
            this.f719b.setTextColor(Color.parseColor("#ff5435"));
            this.f720c.setTextColor(Color.parseColor("#ff5435"));
            this.f721d.setTextColor(Color.parseColor("#ff5435"));
            return;
        }
        setBackgroundResource(d3c0.X5);
        this.f719b.setTextColor(Color.parseColor("#666666"));
        this.f720c.setTextColor(Color.parseColor("#666666"));
        this.f721d.setTextColor(Color.parseColor("#999999"));
    }

    public PriceRecallTellPriceSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallTellPriceSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
