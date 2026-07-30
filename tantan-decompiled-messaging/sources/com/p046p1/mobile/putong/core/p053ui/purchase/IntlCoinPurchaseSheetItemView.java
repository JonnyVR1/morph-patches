package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.d3c0;
import p149l.e30;
import p149l.eqh0;
import p149l.n6a;
import p149l.w5n;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class IntlCoinPurchaseSheetItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f34354a;

    /* JADX INFO: renamed from: b */
    public VText f34355b;

    /* JADX INFO: renamed from: c */
    public VText f34356c;

    /* JADX INFO: renamed from: d */
    public VImage f34357d;

    public IntlCoinPurchaseSheetItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m53102b(View view) {
        w5n.m201658a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m53103c(final C8765d c8765d, int i, final e30<C8765d> e30Var, int i2) {
        C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
        this.f34354a.setBackgroundResource(c8765d.m53530l() ? d3c0.f83581G9 : d3c0.f83567F9);
        xdl0.m208345M0(this.f34357d, i == i2 && c8765d.m53530l());
        this.f34355b.setTypeface(eqh0.m117752c(3), 0);
        String strValueOf = String.valueOf(aVarM53520b.m53605w());
        this.f34355b.setText(n6a.m158028p0(strValueOf, aVarM53520b.m53606x(), strValueOf.length() > 3 ? 20 : 24));
        xdl0.m208335H0(this.f34356c, aVarM53520b.m53608z());
        setOnClickListener(new View.OnClickListener() { // from class: l.v5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(c8765d);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53102b(this);
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
