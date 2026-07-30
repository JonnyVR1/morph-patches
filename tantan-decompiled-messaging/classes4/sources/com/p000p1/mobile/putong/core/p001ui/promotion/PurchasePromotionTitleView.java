package com.p000p1.mobile.putong.core.p001ui.promotion;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.z4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PurchasePromotionTitleView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f2146a;

    public PurchasePromotionTitleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m3633a(C0176a.a aVar) {
        this.f2146a.setText(String.format("【%s】%s", aVar.f2149a, aVar.f2151c));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2146a = (TextView) findViewById(z4c0.t0);
    }

    public PurchasePromotionTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchasePromotionTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
