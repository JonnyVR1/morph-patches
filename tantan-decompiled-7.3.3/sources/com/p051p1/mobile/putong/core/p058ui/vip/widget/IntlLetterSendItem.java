package com.p051p1.mobile.putong.core.p058ui.vip.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.data.LetterWrapper;
import p151v.VText;
import p153l.dbc0;
import p153l.tu0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlLetterSendItem extends VText {
    public IntlLetterSendItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public void m58873l(LetterWrapper letterWrapper) {
        int color;
        Drawable drawableM192702b;
        setText("\"" + letterWrapper.letter + "\"");
        if (letterWrapper.select) {
            color = Color.parseColor("#ffffff");
            drawableM192702b = tu0.m192702b(getContext(), dbc0.f86035Bq);
        } else {
            color = Color.parseColor("#de000000");
            drawableM192702b = tu0.m192702b(getContext(), dbc0.f86905cu);
        }
        setTextColor(color);
        setBackground(drawableM192702b);
    }

    public IntlLetterSendItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLetterSendItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
