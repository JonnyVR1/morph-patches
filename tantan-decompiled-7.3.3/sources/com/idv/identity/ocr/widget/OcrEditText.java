package com.idv.identity.ocr.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.EditText;
import p153l.azb;
import p153l.y9c0;

/* JADX INFO: loaded from: classes7.dex */
public class OcrEditText extends EditText {
    public OcrEditText(Context context) {
        super(context);
        m19128a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m19128a(Context context) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(azb.f74128d.getOcrResultInfoContentColor(y9c0.f198078c));
            setBackground(gradientDrawable);
        }
        setTextDirection(5);
        setTextDirection(5);
    }

    public OcrEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19128a(context);
    }

    public OcrEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19128a(context);
    }
}
