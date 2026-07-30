package com.idv.identity.ocr.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.EditText;
import p149l.mxb;
import p149l.r1c0;

/* JADX INFO: loaded from: classes7.dex */
public class OcrEditText extends EditText {
    public OcrEditText(Context context) {
        super(context);
        m18051a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m18051a(Context context) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(mxb.f136154d.getOcrResultInfoContentColor(r1c0.f157263c));
            setBackground(gradientDrawable);
        }
        setTextDirection(5);
        setTextDirection(5);
    }

    public OcrEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18051a(context);
    }

    public OcrEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18051a(context);
    }
}
