package com.p046p1.mobile.putong.core.p053ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes6.dex */
public class GradientBgWithShadowButton extends GradientBgButton {

    /* JADX INFO: renamed from: N */
    public boolean f27989N;

    public GradientBgWithShadowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.GradientBgButton
    /* JADX INFO: renamed from: h */
    public void mo43895h(Canvas canvas, float f, float f2) {
        if (this.f27989N) {
            m43897j(canvas, f, f2);
        } else {
            m43896i(canvas, f, f2);
        }
    }

    public void setShadowColor(int i) {
        this.f28150d = i;
    }

    public void setShadowColorLight(int i) {
        this.f28151e = i;
    }

    public void setShadowColorSameWihtShader(boolean z) {
        this.f27989N = z;
    }

    public GradientBgWithShadowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
