package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bnl0;
import p153l.h9c0;
import p153l.ie5;
import p153l.jbc0;
import p153l.q8g0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class CoinPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f35197a;

    /* JADX INFO: renamed from: b */
    public VText f35198b;

    /* JADX INFO: renamed from: c */
    public VText f35199c;

    /* JADX INFO: renamed from: d */
    public VText f35200d;

    /* JADX INFO: renamed from: e */
    public VText f35201e;

    public CoinPurchaseSheetItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m54280b(View view) {
        ie5.m139590a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m54281c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m54282d(final C8928d c8928d, int i, final y20<C8928d> y20Var) {
        C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        boolean zMo31838xf = CoreModule.m30930K().mo31838xf();
        VText vText = this.f35200d;
        if (zMo31838xf) {
            bnl0.m105505C0(vText, qa00.m175859d(18.0f));
            this.f35200d.setAutoSizeTextTypeWithDefaults(1);
            this.f35200d.setAutoSizeTextTypeUniformWithConfiguration(9, 14, 1, 2);
        } else {
            bnl0.m105505C0(vText, -2);
            this.f35200d.setSingleLine();
        }
        boolean zM54713l = c8928d.m54713l();
        LinearLayout linearLayout = this.f35197a;
        if (zM54713l) {
            linearLayout.setBackgroundResource(jbc0.f119236G9);
        } else {
            linearLayout.setBackgroundResource(jbc0.f119222F9);
        }
        if (NullChecker.m82486a(aVarM54703b.m54790y())) {
            m54283e(aVarM54703b.m54790y(), c8928d.m54713l());
        } else {
            if (i == 2 && c8928d.m54713l()) {
                this.f35201e.setText(R$string.f28354k9);
                this.f35201e.setBackgroundDrawable(m54281c().drawable(jbc0.f119250H9));
                bnl0.m105525M0(this.f35201e, true);
            } else {
                bnl0.m105525M0(this.f35201e, false);
            }
            this.f35198b.setText(String.valueOf(aVarM54703b.m54788w()));
            this.f35199c.setText(aVarM54703b.m54789x());
            this.f35200d.setText(aVarM54703b.m54791z());
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.he5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(c8928d);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m54283e(SummarizedPrivilegePrice summarizedPrivilegePrice, boolean z) {
        this.f35198b.setText(String.format("x%s", Integer.valueOf(summarizedPrivilegePrice.num)));
        this.f35199c.setText(String.format("%s探探币", Integer.valueOf(summarizedPrivilegePrice.price)));
        int i = summarizedPrivilegePrice.originalPrice;
        if (i <= 0) {
            i = 1;
        }
        double d = ((double) ((summarizedPrivilegePrice.price * 1.0f) / i)) * 10.0d;
        this.f35200d.setText(d >= 10.0d ? "7天有效" : String.format("7天有效 %s折", q8g0.m175774F(d, 1)));
        VText vText = this.f35200d;
        if (z) {
            vText.setTextColor(getResources().getColor(h9c0.f108379l));
        } else {
            vText.setTextColor(getResources().getColor(h9c0.f108361c));
        }
        VText vText2 = this.f35198b;
        int i2 = qa00.f156328o;
        bnl0.m105540X(vText2, i2);
        VText vText3 = this.f35199c;
        int i3 = qa00.f156321h;
        bnl0.m105540X(vText3, i3);
        bnl0.m105540X(this.f35200d, i3);
        bnl0.m105537U(this.f35200d, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54280b(this);
    }

    public CoinPurchaseSheetItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoinPurchaseSheetItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
