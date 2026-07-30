package com.p051p1.mobile.putong.core.p058ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes6.dex */
public class GradientBgWithShadowButton extends GradientBgButton {

    /* JADX INFO: renamed from: N */
    public boolean f28837N;

    public GradientBgWithShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.GradientBgButton
    /* JADX INFO: renamed from: h */
    public void mo45081h(Canvas canvas, float f, float f2) {
        if (this.f28837N) {
            m45083j(canvas, f, f2);
        } else {
            m45082i(canvas, f, f2);
        }
    }

    public void setShadowColor(int i) {
        this.f28998d = i;
    }

    public void setShadowColorLight(int i) {
        this.f28999e = i;
    }

    public void setShadowColorSameWihtShader(boolean z) {
        this.f28837N = z;
    }

    public GradientBgWithShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
