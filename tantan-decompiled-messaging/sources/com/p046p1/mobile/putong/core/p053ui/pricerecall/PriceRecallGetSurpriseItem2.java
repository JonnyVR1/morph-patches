package com.p046p1.mobile.putong.core.p053ui.pricerecall;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p147v.VText;
import p147v.VText_AutoFit;
import p149l.b1c0;
import p149l.eqh0;
import p149l.xdl0;
import p149l.yl80;
import p149l.zl80;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecallGetSurpriseItem2 extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f32889d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f32890e;

    /* JADX INFO: renamed from: f */
    public VText f32891f;

    /* JADX INFO: renamed from: g */
    public VText f32892g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f32893h;

    /* JADX INFO: renamed from: i */
    public VText f32894i;

    /* JADX INFO: renamed from: j */
    public TextView f32895j;

    public PriceRecallGetSurpriseItem2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m50493h0(View view) {
        yl80.m215259a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m50494i0(Merchandise merchandise, boolean z) {
        m50495j0(merchandise, z, false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m50495j0(Merchandise merchandise, boolean z, boolean z2) {
        this.f32890e.setTypeface(eqh0.m117752c(3));
        this.f32894i.setTypeface(eqh0.m117752c(3));
        double firstCouponPrice = merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice();
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(firstCouponPrice);
        this.f32894i.setText("¥" + str);
        boolean zEquals = TEnum.equals(merchandise.category, ProductCategory.tttVip);
        TextView textView = this.f32895j;
        if (zEquals) {
            textView.setText(CoreModule.f17544b.getString(R$string.f27533n0, "VIP"));
            GradientDrawable gradientDrawable = (GradientDrawable) this.f32893h.getBackground();
            gradientDrawable.setColor(Color.parseColor("#19fe7e1d"));
            this.f32894i.setTextColor(getResources().getColor(b1c0.f72559l));
            this.f32895j.setTextColor(getResources().getColor(b1c0.f72559l));
            this.f32893h.setBackground(gradientDrawable);
        } else {
            textView.setText(CoreModule.f17544b.getString(R$string.f27533n0, "SVIP"));
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.f32893h.getBackground();
            gradientDrawable2.setColor(Color.parseColor("#ffedca"));
            this.f32894i.setTextColor(Color.parseColor("#efb134"));
            this.f32895j.setTextColor(Color.parseColor("#efb134"));
            this.f32893h.setBackground(gradientDrawable2);
        }
        if (merchandise.monthly()) {
            CoreModule.f17544b.getString(R$string.f27123D);
        } else if (merchandise.quarterly()) {
            CoreModule.f17544b.getString(R$string.f27134E);
        } else if (!merchandise.semiAnnual() && merchandise.yearly()) {
            CoreModule.f17544b.getString(R$string.f27145F);
        }
        if (z) {
            xdl0.m208344M(this.f32891f, true);
            String strM219251f = z2 ? "2" : zl80.m219251f(merchandise);
            Application application = CoreModule.f17544b;
            this.f32891f.setText(application.getString(R$string.f27580r0, application.getString(R$string.f27591s0, strM219251f)));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50493h0(this);
    }

    public PriceRecallGetSurpriseItem2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallGetSurpriseItem2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
