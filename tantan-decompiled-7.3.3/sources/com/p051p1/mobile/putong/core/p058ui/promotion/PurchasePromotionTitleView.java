package com.p051p1.mobile.putong.core.p058ui.promotion;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.fdc0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchasePromotionTitleView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f35172a;

    public PurchasePromotionTitleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m54256a(C8914a.a aVar) {
        this.f35172a.setText(String.format("【%s】%s", aVar.f35175a, aVar.f35177c));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f35172a = (TextView) findViewById(fdc0.f98441t0);
    }

    public PurchasePromotionTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchasePromotionTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
