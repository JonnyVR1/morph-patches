package com.p000p1.mobile.putong.core.p004ui.vip.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p1.mobile.putong.data.LetterWrapper;
import l.nu0;
import p006l.x2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlLetterSendItem extends VText {
    public IntlLetterSendItem(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m11183l(LetterWrapper letterWrapper) {
        int color;
        Drawable drawableB;
        setText("\"" + letterWrapper.letter + "\"");
        if (letterWrapper.select) {
            color = Color.parseColor("#ffffff");
            drawableB = nu0.b(getContext(), x2c0.f26124Np);
        } else {
            color = Color.parseColor("#de000000");
            drawableB = nu0.b(getContext(), x2c0.f26976ot);
        }
        setTextColor(color);
        setBackground(drawableB);
    }

    public IntlLetterSendItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLetterSendItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
