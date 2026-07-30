package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.jbc0;
import p153l.lyh0;
import p153l.w7n;
import p153l.y20;
import p153l.z7a;

/* JADX INFO: loaded from: classes4.dex */
public class IntlCoinPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f35202a;

    /* JADX INFO: renamed from: b */
    public VText f35203b;

    /* JADX INFO: renamed from: c */
    public VText f35204c;

    /* JADX INFO: renamed from: d */
    public VImage f35205d;

    public IntlCoinPurchaseSheetItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m54285b(View view) {
        w7n.m205352a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m54286c(final C8928d c8928d, int i, final y20<C8928d> y20Var, int i2) {
        C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
        this.f35202a.setBackgroundResource(c8928d.m54713l() ? jbc0.f119236G9 : jbc0.f119222F9);
        bnl0.m105525M0(this.f35205d, i == i2 && c8928d.m54713l());
        this.f35203b.setTypeface(lyh0.m156283c(3), 0);
        String strValueOf = String.valueOf(aVarM54703b.m54788w());
        this.f35203b.setText(z7a.m218873p0(strValueOf, aVarM54703b.m54789x(), strValueOf.length() > 3 ? 20 : 24));
        bnl0.m105515H0(this.f35204c, aVarM54703b.m54791z());
        setOnClickListener(new View.OnClickListener() { // from class: l.v7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(c8928d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54285b(this);
    }

    public IntlCoinPurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlCoinPurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public IntlCoinPurchaseSheetItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
