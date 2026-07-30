package com.p046p1.mobile.putong.core.p053ui.pricerecall;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p147v.VText;
import p149l.d3c0;
import p149l.eqh0;
import p149l.i0g0;
import p149l.mm80;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecallTellPriceSelectItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f32896a;

    /* JADX INFO: renamed from: b */
    public VText f32897b;

    /* JADX INFO: renamed from: c */
    public VText f32898c;

    /* JADX INFO: renamed from: d */
    public VText f32899d;

    /* JADX INFO: renamed from: e */
    public Merchandise f32900e;

    public PriceRecallTellPriceSelectItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50496a(View view) {
        mm80.m155310a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m50497b(Merchandise merchandise) {
        this.f32900e = merchandise;
        this.f32899d.setTypeface(eqh0.m117752c(2), 1);
        this.f32896a.setTypeface(eqh0.m117752c(2), 1);
        String string = CoreModule.f17544b.getString(R$string.f27646x0, Integer.valueOf(merchandise.quantity));
        String str = merchandise.quantity + "";
        SpannableStringBuilder spannableStringBuilderM133863d0 = i0g0.m133863d0(string, vwb.m200324f0(str), vwb.m200324f0(Integer.valueOf(Color.parseColor("#333333"))), Typeface.create(eqh0.m117752c(2), 1), t100.m186890d(21.0f));
        int iIndexOf = string.indexOf(str);
        spannableStringBuilderM133863d0.setSpan(new MarginBottomSubscriptSpan(t100.f167252a), iIndexOf, str.length() + iIndexOf, 17);
        this.f32896a.setText(spannableStringBuilderM133863d0);
        this.f32898c.setTypeface(eqh0.m117752c(3), 1);
        this.f32897b.setTypeface(eqh0.m117752c(3), 1);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.f32899d.getPaint().setFlags(17);
        this.f32898c.setText(decimalFormat.format(merchandise.getFirstCouponPrice()));
        this.f32899d.setText(CoreModule.f17544b.getString(R$string.f27521m0, "¥" + decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price)));
    }

    public Merchandise getCurrentMerchandise() {
        return this.f32900e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50496a(this);
    }

    public void setSelectState(boolean z) {
        if (z) {
            setBackgroundResource(d3c0.f83795W5);
            this.f32897b.setTextColor(Color.parseColor("#ff5435"));
            this.f32898c.setTextColor(Color.parseColor("#ff5435"));
            this.f32899d.setTextColor(Color.parseColor("#ff5435"));
            return;
        }
        setBackgroundResource(d3c0.f83808X5);
        this.f32897b.setTextColor(Color.parseColor("#666666"));
        this.f32898c.setTextColor(Color.parseColor("#666666"));
        this.f32899d.setTextColor(Color.parseColor("#999999"));
    }

    public PriceRecallTellPriceSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallTellPriceSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
