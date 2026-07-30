package com.p000p1.mobile.putong.core.p001ui.pricerecall;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import l.b1c0;
import l.eqh0;
import l.xdl0;
import l.yl80;
import p002l.zl80;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PriceRecallGetSurpriseItem2 extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f711d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f712e;

    /* JADX INFO: renamed from: f */
    public VText f713f;

    /* JADX INFO: renamed from: g */
    public VText f714g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f715h;

    /* JADX INFO: renamed from: i */
    public VText f716i;

    /* JADX INFO: renamed from: j */
    public TextView f717j;

    public PriceRecallGetSurpriseItem2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m928h0(View view) {
        yl80.a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m929i0(Merchandise merchandise, boolean z) {
        m930j0(merchandise, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public void m930j0(Merchandise merchandise, boolean z, boolean z2) {
        this.f712e.setTypeface(eqh0.c(3));
        this.f716i.setTypeface(eqh0.c(3));
        double firstCouponPrice = merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice();
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(firstCouponPrice);
        this.f716i.setText("¥" + str);
        boolean zEquals = TEnum.equals(merchandise.category, "tttVip");
        TextView textView = this.f717j;
        if (zEquals) {
            textView.setText(CoreModule.b.getString(R.string.n0, "VIP"));
            GradientDrawable gradientDrawable = (GradientDrawable) this.f715h.getBackground();
            gradientDrawable.setColor(Color.parseColor("#19fe7e1d"));
            this.f716i.setTextColor(getResources().getColor(b1c0.l));
            this.f717j.setTextColor(getResources().getColor(b1c0.l));
            this.f715h.setBackground(gradientDrawable);
        } else {
            textView.setText(CoreModule.b.getString(R.string.n0, "SVIP"));
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.f715h.getBackground();
            gradientDrawable2.setColor(Color.parseColor("#ffedca"));
            this.f716i.setTextColor(Color.parseColor("#efb134"));
            this.f717j.setTextColor(Color.parseColor("#efb134"));
            this.f715h.setBackground(gradientDrawable2);
        }
        if (merchandise.monthly()) {
            CoreModule.b.getString(R.string.D);
        } else if (merchandise.quarterly()) {
            CoreModule.b.getString(R.string.E);
        } else if (!merchandise.semiAnnual() && merchandise.yearly()) {
            CoreModule.b.getString(R.string.F);
        }
        if (z) {
            xdl0.M(this.f713f, true);
            String strM27411f = z2 ? "2" : zl80.m27411f(merchandise);
            Application application = CoreModule.b;
            this.f713f.setText(application.getString(R.string.r0, application.getString(R.string.s0, strM27411f)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m928h0(this);
    }

    public PriceRecallGetSurpriseItem2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallGetSurpriseItem2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
