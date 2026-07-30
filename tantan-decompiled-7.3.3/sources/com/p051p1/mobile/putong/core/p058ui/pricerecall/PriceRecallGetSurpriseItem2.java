package com.p051p1.mobile.putong.core.p058ui.pricerecall;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.bnl0;
import p153l.cu80;
import p153l.du80;
import p153l.h9c0;
import p153l.lyh0;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecallGetSurpriseItem2 extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LinearLayout f33737d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f33738e;

    /* JADX INFO: renamed from: f */
    public VText f33739f;

    /* JADX INFO: renamed from: g */
    public VText f33740g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f33741h;

    /* JADX INFO: renamed from: i */
    public VText f33742i;

    /* JADX INFO: renamed from: j */
    public TextView f33743j;

    public PriceRecallGetSurpriseItem2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m51676h0(View view) {
        cu80.m112653a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m51677i0(Merchandise merchandise, boolean z) {
        m51678j0(merchandise, z, false);
    }

    /* JADX INFO: renamed from: j0 */
    public void m51678j0(Merchandise merchandise, boolean z, boolean z2) {
        this.f33738e.setTypeface(lyh0.m156283c(3));
        this.f33742i.setTypeface(lyh0.m156283c(3));
        double firstCouponPrice = merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice();
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(firstCouponPrice);
        this.f33742i.setText("¥" + str);
        boolean zEquals = TEnum.equals(merchandise.category, ProductCategory.tttVip);
        TextView textView = this.f33743j;
        if (zEquals) {
            textView.setText(CoreModule.f18263b.getString(R$string.f28381n0, "VIP"));
            GradientDrawable gradientDrawable = (GradientDrawable) this.f33741h.getBackground();
            gradientDrawable.setColor(Color.parseColor("#19fe7e1d"));
            this.f33742i.setTextColor(getResources().getColor(h9c0.f108379l));
            this.f33743j.setTextColor(getResources().getColor(h9c0.f108379l));
            this.f33741h.setBackground(gradientDrawable);
        } else {
            textView.setText(CoreModule.f18263b.getString(R$string.f28381n0, "SVIP"));
            GradientDrawable gradientDrawable2 = (GradientDrawable) this.f33741h.getBackground();
            gradientDrawable2.setColor(Color.parseColor("#ffedca"));
            this.f33742i.setTextColor(Color.parseColor("#efb134"));
            this.f33743j.setTextColor(Color.parseColor("#efb134"));
            this.f33741h.setBackground(gradientDrawable2);
        }
        if (merchandise.monthly()) {
            CoreModule.f18263b.getString(R$string.f27971D);
        } else if (merchandise.quarterly()) {
            CoreModule.f18263b.getString(R$string.f27982E);
        } else if (!merchandise.semiAnnual() && merchandise.yearly()) {
            CoreModule.f18263b.getString(R$string.f27993F);
        }
        if (z) {
            bnl0.m105524M(this.f33739f, true);
            String strM118105f = z2 ? "2" : du80.m118105f(merchandise);
            Application application = CoreModule.f18263b;
            this.f33739f.setText(application.getString(R$string.f28428r0, application.getString(R$string.f28439s0, strM118105f)));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51676h0(this);
    }

    public PriceRecallGetSurpriseItem2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallGetSurpriseItem2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
