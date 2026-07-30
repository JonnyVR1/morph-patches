package com.p046p1.mobile.putong.core.p053ui.promotion;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.z4c0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchasePromotionTitleView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f34324a;

    public PurchasePromotionTitleView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m53073a(C8751a.a aVar) {
        this.f34324a.setText(String.format("【%s】%s", aVar.f34327a, aVar.f34329c));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f34324a = (TextView) findViewById(z4c0.f201565t0);
    }

    public PurchasePromotionTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PurchasePromotionTitleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
