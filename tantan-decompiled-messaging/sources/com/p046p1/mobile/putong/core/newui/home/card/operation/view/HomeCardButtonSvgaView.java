package com.p046p1.mobile.putong.core.newui.home.card.operation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardButtonSvgaView extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public float f22913a;

    public HomeCardButtonSvgaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f22913a = 1.0f;
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.f22913a), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.f22913a), View.MeasureSpec.getMode(i)));
    }

    public void setLayoutScale(float f) {
        this.f22913a = f;
    }

    public HomeCardButtonSvgaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22913a = 1.0f;
    }

    public HomeCardButtonSvgaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22913a = 1.0f;
    }
}
