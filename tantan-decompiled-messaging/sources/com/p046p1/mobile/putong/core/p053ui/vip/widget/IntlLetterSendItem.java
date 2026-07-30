package com.p046p1.mobile.putong.core.p053ui.vip.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.data.LetterWrapper;
import p147v.VText;
import p149l.nu0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLetterSendItem extends VText {
    public IntlLetterSendItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public void m57690l(LetterWrapper letterWrapper) {
        int color;
        Drawable drawableM161424b;
        setText("\"" + letterWrapper.letter + "\"");
        if (letterWrapper.select) {
            color = Color.parseColor("#ffffff");
            drawableM161424b = nu0.m161424b(getContext(), x2c0.f189588Np);
        } else {
            color = Color.parseColor("#de000000");
            drawableM161424b = nu0.m161424b(getContext(), x2c0.f190440ot);
        }
        setTextColor(color);
        setBackground(drawableM161424b);
    }

    public IntlLetterSendItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLetterSendItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
