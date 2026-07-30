package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.n6a;
import l.w5n;
import l.xdl0;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlCoinPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f2176a;

    /* JADX INFO: renamed from: b */
    public VText f2177b;

    /* JADX INFO: renamed from: c */
    public VText f2178c;

    /* JADX INFO: renamed from: d */
    public VImage f2179d;

    public IntlCoinPurchaseSheetItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m3668b(View view) {
        w5n.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m3669c(final C0190d c0190d, int i, final e30<C0190d> e30Var, int i2) {
        C0190d.a aVarM4086b = c0190d.m4097m() ? c0190d.m4086b() : c0190d.m4088d();
        this.f2176a.setBackgroundResource(c0190d.m4096l() ? d3c0.G9 : d3c0.F9);
        xdl0.M0(this.f2179d, i == i2 && c0190d.m4096l());
        this.f2177b.setTypeface(eqh0.c(3), 0);
        String strValueOf = String.valueOf(aVarM4086b.m4171w());
        this.f2177b.setText(n6a.p0(strValueOf, aVarM4086b.m4172x(), strValueOf.length() > 3 ? 20 : 24));
        xdl0.H0(this.f2178c, aVarM4086b.m4174z());
        setOnClickListener(new View.OnClickListener() { // from class: l.v5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c0190d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3668b(this);
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
