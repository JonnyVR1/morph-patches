package com.p000p1.mobile.putong.core.newui.messages.promotion;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import l.e51;
import l.j760;
import l.o690;
import l.qib0;
import l.xdl0;
import p009l.b1f;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PrivilegePromotionHeaderView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f4649a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4650b;

    /* JADX INFO: renamed from: c */
    public ImageView f4651c;

    /* JADX INFO: renamed from: d */
    public VText f4652d;

    /* JADX INFO: renamed from: e */
    public VText f4653e;

    /* JADX INFO: renamed from: f */
    public VText f4654f;

    /* JADX INFO: renamed from: g */
    public ImageView f4655g;

    /* JADX INFO: renamed from: h */
    public DecimalFormat f4656h;

    /* JADX INFO: renamed from: i */
    public NumberFormat f4657i;

    /* JADX INFO: renamed from: j */
    public Merchandise f4658j;

    /* JADX INFO: renamed from: k */
    public Coupon f4659k;

    /* JADX INFO: renamed from: l */
    public double f4660l;

    /* JADX INFO: renamed from: m */
    public double f4661m;

    /* JADX INFO: renamed from: n */
    public Runnable f4662n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView$a */
    public class RunnableC0343a implements Runnable {
        public RunnableC0343a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PrivilegePromotionHeaderView.this.m6656e();
        }
    }

    public PrivilegePromotionHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4656h = new DecimalFormat("#.#");
        this.f4657i = new DecimalFormat("00");
        this.f4662n = new RunnableC0343a();
        m6653b(LayoutInflater.from(context), this);
        m6655d();
    }

    @Nullable
    private Act getAct() {
        Act actE = xdl0.E(this);
        if (actE instanceof Act) {
            return actE;
        }
        return null;
    }

    private CharSequence getPromotiontitle() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f4659k.isBelongPromotion("lowPriceCallback3SVIP")) {
            spannableStringBuilder.append((CharSequence) "SVIP");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f4656h.format(this.f4661m - this.f4660l));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f4659k.isBelongPromotion("lowPriceCallback3VIP")) {
            spannableStringBuilder.append((CharSequence) "VIP");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f4656h.format(this.f4661m - this.f4660l));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f4659k.isBelongPromotion("lowPriceCustomerVIP")) {
            spannableStringBuilder.append((CharSequence) "VIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(this.f4657i.format(100.0d - ((this.f4660l / this.f4661m) * 100.0d)));
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder4.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (!this.f4659k.isBelongPromotion("lowPriceCustomerSVIP")) {
            if (this.f4659k.isBelongPromotion("lowPrice3Month")) {
                spannableStringBuilder.append((CharSequence) "VIP前3个月每月");
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(this.f4656h.format(this.f4660l));
                spannableStringBuilder5.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder5.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder5);
                spannableStringBuilder.append((CharSequence) "元");
            }
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) "SVIP首");
        spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
        spannableStringBuilder.append((CharSequence) "立省");
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(this.f4657i.format(100.0d - ((this.f4660l / this.f4661m) * 100.0d)));
        spannableStringBuilder6.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder6.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder6);
        spannableStringBuilder.append((CharSequence) "%");
        return spannableStringBuilder;
    }

    private String getUnitIntervalValue() {
        Merchandise merchandise = this.f4658j;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    /* JADX INFO: renamed from: b */
    public View m6653b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o690.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m6654c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        sb.append(str);
        sb.append("后过期");
        return sb;
    }

    /* JADX INFO: renamed from: d */
    public final void m6655d() {
        this.f4652d.getPaint().setFakeBoldText(true);
        this.f4654f.getPaint().setFakeBoldText(true);
        qib0.G.L0(this.f4650b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjdTWU9MU0pMVElLTlhVTEMyWkFZQ0lOQTJNMjVFQjE0IiwidyI6MTA1MywiaCI6MjE2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6Njk5ODk4MDk4NzAwNDY1MzYwMH0.png");
    }

    /* JADX INFO: renamed from: e */
    public final void m6656e() {
        Act act;
        this.f4653e.setText("");
        if (this.f4659k == null || (act = getAct()) == null) {
            return;
        }
        j760<Boolean, String> j760VarM11805c = b1f.m11805c(this.f4659k);
        this.f4653e.setText(m6654c((String) j760VarM11805c.b));
        e51.J(this.f4662n);
        if (((Boolean) j760VarM11805c.a).booleanValue()) {
            e51.H(act, this.f4662n, 1000L);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6657f() {
        e51.J(this.f4662n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6657f();
    }

    public PrivilegePromotionHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegePromotionHeaderView(Context context) {
        this(context, null);
    }
}
