package com.p051p1.mobile.putong.core.newui.messages.promotion;

import android.app.Activity;
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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.g2f;
import p153l.l51;
import p153l.pf60;
import p153l.se90;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class PrivilegePromotionHeaderView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f26613a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f26614b;

    /* JADX INFO: renamed from: c */
    public ImageView f26615c;

    /* JADX INFO: renamed from: d */
    public VText f26616d;

    /* JADX INFO: renamed from: e */
    public VText f26617e;

    /* JADX INFO: renamed from: f */
    public VText f26618f;

    /* JADX INFO: renamed from: g */
    public ImageView f26619g;

    /* JADX INFO: renamed from: h */
    public DecimalFormat f26620h;

    /* JADX INFO: renamed from: i */
    public NumberFormat f26621i;

    /* JADX INFO: renamed from: j */
    public Merchandise f26622j;

    /* JADX INFO: renamed from: k */
    public Coupon f26623k;

    /* JADX INFO: renamed from: l */
    public double f26624l;

    /* JADX INFO: renamed from: m */
    public double f26625m;

    /* JADX INFO: renamed from: n */
    public Runnable f26626n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView$a */
    public class RunnableC8330a implements Runnable {
        public RunnableC8330a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PrivilegePromotionHeaderView.this.m43508e();
        }
    }

    public PrivilegePromotionHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26620h = new DecimalFormat("#.#");
        this.f26621i = new DecimalFormat("00");
        this.f26626n = new RunnableC8330a();
        m43505b(LayoutInflater.from(context), this);
        m43507d();
    }

    @Nullable
    private Act getAct() {
        Activity activityM105508E = bnl0.m105508E(this);
        if (activityM105508E instanceof Act) {
            return (Act) activityM105508E;
        }
        return null;
    }

    private CharSequence getPromotiontitle() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f26623k.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f26620h.format(this.f26625m - this.f26624l));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f26623k.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            spannableStringBuilder.append((CharSequence) "VIP");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f26620h.format(this.f26625m - this.f26624l));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f26623k.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            spannableStringBuilder.append((CharSequence) "VIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(this.f26621i.format(100.0d - ((this.f26624l / this.f26625m) * 100.0d)));
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder4.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (!this.f26623k.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            if (this.f26623k.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
                spannableStringBuilder.append((CharSequence) "VIP前3个月每月");
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(this.f26620h.format(this.f26624l));
                spannableStringBuilder5.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder5.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder5);
                spannableStringBuilder.append((CharSequence) "元");
            }
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) "SVIP首");
        spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
        spannableStringBuilder.append((CharSequence) "立省");
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(this.f26621i.format(100.0d - ((this.f26624l / this.f26625m) * 100.0d)));
        spannableStringBuilder6.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder6.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder6);
        spannableStringBuilder.append((CharSequence) "%");
        return spannableStringBuilder;
    }

    private String getUnitIntervalValue() {
        Merchandise merchandise = this.f26622j;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    /* JADX INFO: renamed from: b */
    public View m43505b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return se90.m185530b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m43506c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        sb.append(str);
        sb.append("后过期");
        return sb;
    }

    /* JADX INFO: renamed from: d */
    public final void m43507d() {
        this.f26616d.getPaint().setFakeBoldText(true);
        this.f26618f.getPaint().setFakeBoldText(true);
        uqb0.f180374G.m127115L0(this.f26614b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjdTWU9MU0pMVElLTlhVTEMyWkFZQ0lOQTJNMjVFQjE0IiwidyI6MTA1MywiaCI6MjE2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6Njk5ODk4MDk4NzAwNDY1MzYwMH0.png");
    }

    /* JADX INFO: renamed from: e */
    public final void m43508e() {
        Act act;
        this.f26617e.setText("");
        if (this.f26623k == null || (act = getAct()) == null) {
            return;
        }
        pf60<Boolean, String> pf60VarM128611c = g2f.m128611c(this.f26623k);
        this.f26617e.setText(m43506c(pf60VarM128611c.f152157b));
        l51.m152890J(this.f26626n);
        if (pf60VarM128611c.f152156a.booleanValue()) {
            l51.m152888H(act, this.f26626n, 1000L);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m43509f() {
        l51.m152890J(this.f26626n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m43509f();
    }

    public PrivilegePromotionHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegePromotionHeaderView(Context context) {
        this(context, null);
    }
}
