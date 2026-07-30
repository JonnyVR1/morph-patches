package com.p051p1.mobile.putong.core.p058ui.pricerecall;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p151v.VText;
import p153l.jbc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qu80;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecallTellPriceSelectItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f33744a;

    /* JADX INFO: renamed from: b */
    public VText f33745b;

    /* JADX INFO: renamed from: c */
    public VText f33746c;

    /* JADX INFO: renamed from: d */
    public VText f33747d;

    /* JADX INFO: renamed from: e */
    public Merchandise f33748e;

    public PriceRecallTellPriceSelectItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m51679a(View view) {
        qu80.m178136a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m51680b(Merchandise merchandise) {
        this.f33748e = merchandise;
        this.f33747d.setTypeface(lyh0.m156283c(2), 1);
        this.f33744a.setTypeface(lyh0.m156283c(2), 1);
        String string = CoreModule.f18263b.getString(R$string.f28494x0, Integer.valueOf(merchandise.quantity));
        String str = merchandise.quantity + "";
        SpannableStringBuilder spannableStringBuilderM175798d0 = q8g0.m175798d0(string, jyb.m147507f0(str), jyb.m147507f0(Integer.valueOf(Color.parseColor("#333333"))), Typeface.create(lyh0.m156283c(2), 1), qa00.m175859d(21.0f));
        int iIndexOf = string.indexOf(str);
        spannableStringBuilderM175798d0.setSpan(new MarginBottomSubscriptSpan(qa00.f156314a), iIndexOf, str.length() + iIndexOf, 17);
        this.f33744a.setText(spannableStringBuilderM175798d0);
        this.f33746c.setTypeface(lyh0.m156283c(3), 1);
        this.f33745b.setTypeface(lyh0.m156283c(3), 1);
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.f33747d.getPaint().setFlags(17);
        this.f33746c.setText(decimalFormat.format(merchandise.getFirstCouponPrice()));
        this.f33747d.setText(CoreModule.f18263b.getString(R$string.f28369m0, "¥" + decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price)));
    }

    public Merchandise getCurrentMerchandise() {
        return this.f33748e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51679a(this);
    }

    public void setSelectState(boolean z) {
        if (z) {
            setBackgroundResource(jbc0.f119450W5);
            this.f33745b.setTextColor(Color.parseColor("#ff5435"));
            this.f33746c.setTextColor(Color.parseColor("#ff5435"));
            this.f33747d.setTextColor(Color.parseColor("#ff5435"));
            return;
        }
        setBackgroundResource(jbc0.f119463X5);
        this.f33745b.setTextColor(Color.parseColor("#666666"));
        this.f33746c.setTextColor(Color.parseColor("#666666"));
        this.f33747d.setTextColor(Color.parseColor("#999999"));
    }

    public PriceRecallTellPriceSelectItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallTellPriceSelectItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
