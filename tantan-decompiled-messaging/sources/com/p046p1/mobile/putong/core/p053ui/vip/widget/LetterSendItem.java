package com.p046p1.mobile.putong.core.p053ui.vip.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.data.LetterWrapper;
import p147v.VText;
import p149l.nu0;
import p149l.u59;
import p149l.x2c0;

/* JADX INFO: loaded from: classes9.dex */
public class LetterSendItem extends VText {
    public LetterSendItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public void m57728l(LetterWrapper letterWrapper, String str) {
        int color;
        Drawable drawableM161424b;
        setText(letterWrapper.letter);
        if (!"spotlight_messages".equals(str)) {
            boolean zM191827f0 = u59.m191827f0();
            boolean z = letterWrapper.select;
            if (zM191827f0) {
                if (z) {
                    color = Color.parseColor("#ffffff");
                    drawableM161424b = nu0.m161424b(getContext(), x2c0.f189711Ro);
                } else {
                    color = Color.parseColor("#de000000");
                    drawableM161424b = nu0.m161424b(getContext(), x2c0.f189680Qo);
                }
            } else if (z) {
                color = Color.parseColor("#ffffff");
                drawableM161424b = nu0.m161424b(getContext(), x2c0.f189588Np);
            } else {
                color = Color.parseColor("#de000000");
                drawableM161424b = nu0.m161424b(getContext(), x2c0.f189557Mp);
            }
        } else if (letterWrapper.select) {
            color = Color.parseColor("#ffffff");
            drawableM161424b = nu0.m161424b(getContext(), x2c0.f190596tp);
        } else {
            color = Color.parseColor("#de000000");
            drawableM161424b = nu0.m161424b(getContext(), x2c0.f190564sp);
        }
        setTextColor(color);
        setBackground(drawableM161424b);
    }

    public LetterSendItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterSendItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
