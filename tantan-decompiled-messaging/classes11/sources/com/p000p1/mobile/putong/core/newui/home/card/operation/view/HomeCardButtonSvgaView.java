package com.p000p1.mobile.putong.core.newui.home.card.operation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardButtonSvgaView extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public float f1691a;

    public HomeCardButtonSvgaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1691a = 1.0f;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.f1691a), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.f1691a), View.MeasureSpec.getMode(i)));
    }

    public void setLayoutScale(float f) {
        this.f1691a = f;
    }

    public HomeCardButtonSvgaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1691a = 1.0f;
    }

    public HomeCardButtonSvgaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1691a = 1.0f;
    }
}
