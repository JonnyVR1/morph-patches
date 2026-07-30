package com.p046p1.mobile.putong.core.newui.messages.promotion;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import p147v.VDraweeView;
import p147v.VText;
import p149l.b1f;
import p149l.e51;
import p149l.j760;
import p149l.o690;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class PrivilegePromotionHeaderView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f25871a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25872b;

    /* JADX INFO: renamed from: c */
    public ImageView f25873c;

    /* JADX INFO: renamed from: d */
    public VText f25874d;

    /* JADX INFO: renamed from: e */
    public VText f25875e;

    /* JADX INFO: renamed from: f */
    public VText f25876f;

    /* JADX INFO: renamed from: g */
    public ImageView f25877g;

    /* JADX INFO: renamed from: h */
    public DecimalFormat f25878h;

    /* JADX INFO: renamed from: i */
    public NumberFormat f25879i;

    /* JADX INFO: renamed from: j */
    public Merchandise f25880j;

    /* JADX INFO: renamed from: k */
    public Coupon f25881k;

    /* JADX INFO: renamed from: l */
    public double f25882l;

    /* JADX INFO: renamed from: m */
    public double f25883m;

    /* JADX INFO: renamed from: n */
    public Runnable f25884n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView$a */
    public class RunnableC8179a implements Runnable {
        public RunnableC8179a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PrivilegePromotionHeaderView.this.m42497e();
        }
    }

    public PrivilegePromotionHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25878h = new DecimalFormat("#.#");
        this.f25879i = new DecimalFormat("00");
        this.f25884n = new RunnableC8179a();
        m42494b(LayoutInflater.from(context), this);
        m42496d();
    }

    @Nullable
    private Act getAct() {
        Activity activityM208328E = xdl0.m208328E(this);
        if (activityM208328E instanceof Act) {
            return (Act) activityM208328E;
        }
        return null;
    }

    private CharSequence getPromotiontitle() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f25881k.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            spannableStringBuilder.append((CharSequence) "SVIP");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.f25878h.format(this.f25883m - this.f25882l));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f25881k.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            spannableStringBuilder.append((CharSequence) "VIP");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "卡立减");
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f25878h.format(this.f25883m - this.f25882l));
            spannableStringBuilder3.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
            spannableStringBuilder.append((CharSequence) "元");
            return spannableStringBuilder;
        }
        if (this.f25881k.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            spannableStringBuilder.append((CharSequence) "VIP首");
            spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
            spannableStringBuilder.append((CharSequence) "立省");
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(this.f25879i.format(100.0d - ((this.f25882l / this.f25883m) * 100.0d)));
            spannableStringBuilder4.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder4.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder4);
            spannableStringBuilder.append((CharSequence) "%");
            return spannableStringBuilder;
        }
        if (!this.f25881k.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            if (this.f25881k.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
                spannableStringBuilder.append((CharSequence) "VIP前3个月每月");
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(this.f25878h.format(this.f25882l));
                spannableStringBuilder5.setSpan(new ForegroundColorSpan(Color.parseColor("#FF8D47")), 0, spannableStringBuilder5.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableStringBuilder5);
                spannableStringBuilder.append((CharSequence) "元");
            }
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) "SVIP首");
        spannableStringBuilder.append((CharSequence) getUnitIntervalValue());
        spannableStringBuilder.append((CharSequence) "立省");
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(this.f25879i.format(100.0d - ((this.f25882l / this.f25883m) * 100.0d)));
        spannableStringBuilder6.setSpan(new ForegroundColorSpan(Color.parseColor("#FF7118")), 0, spannableStringBuilder6.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableStringBuilder6);
        spannableStringBuilder.append((CharSequence) "%");
        return spannableStringBuilder;
    }

    private String getUnitIntervalValue() {
        Merchandise merchandise = this.f25880j;
        return merchandise == null ? "月" : merchandise.quantityName();
    }

    /* JADX INFO: renamed from: b */
    public View m42494b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o690.m162828b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m42495c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("优惠");
        sb.append(str);
        sb.append("后过期");
        return sb;
    }

    /* JADX INFO: renamed from: d */
    public final void m42496d() {
        this.f25874d.getPaint().setFakeBoldText(true);
        this.f25876f.getPaint().setFakeBoldText(true);
        qib0.f154691G.m102331L0(this.f25872b, "https://auto.tancdn.com/v1/images/eyJpZCI6IjdTWU9MU0pMVElLTlhVTEMyWkFZQ0lOQTJNMjVFQjE0IiwidyI6MTA1MywiaCI6MjE2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6Njk5ODk4MDk4NzAwNDY1MzYwMH0.png");
    }

    /* JADX INFO: renamed from: e */
    public final void m42497e() {
        Act act;
        this.f25875e.setText("");
        if (this.f25881k == null || (act = getAct()) == null) {
            return;
        }
        j760<Boolean, String> j760VarM99830c = b1f.m99830c(this.f25881k);
        this.f25875e.setText(m42495c(j760VarM99830c.f116565b));
        e51.m114745J(this.f25884n);
        if (j760VarM99830c.f116564a.booleanValue()) {
            e51.m114743H(act, this.f25884n, 1000L);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m42498f() {
        e51.m114745J(this.f25884n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m42498f();
    }

    public PrivilegePromotionHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PrivilegePromotionHeaderView(Context context) {
        this(context, null);
    }
}
