package com.p000p1.mobile.putong.core.p004ui.vip.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p1.mobile.putong.data.LetterWrapper;
import l.nu0;
import p006l.u59;
import p006l.x2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LetterSendItem extends VText {
    public LetterSendItem(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m11224l(LetterWrapper letterWrapper, String str) {
        int color;
        Drawable drawableB;
        setText(letterWrapper.letter);
        if (!"spotlight_messages".equals(str)) {
            boolean zM24998f0 = u59.m24998f0();
            boolean z = letterWrapper.select;
            if (zM24998f0) {
                if (z) {
                    color = Color.parseColor("#ffffff");
                    drawableB = nu0.b(getContext(), x2c0.f26247Ro);
                } else {
                    color = Color.parseColor("#de000000");
                    drawableB = nu0.b(getContext(), x2c0.f26216Qo);
                }
            } else if (z) {
                color = Color.parseColor("#ffffff");
                drawableB = nu0.b(getContext(), x2c0.f26124Np);
            } else {
                color = Color.parseColor("#de000000");
                drawableB = nu0.b(getContext(), x2c0.f26093Mp);
            }
        } else if (letterWrapper.select) {
            color = Color.parseColor("#ffffff");
            drawableB = nu0.b(getContext(), x2c0.f27132tp);
        } else {
            color = Color.parseColor("#de000000");
            drawableB = nu0.b(getContext(), x2c0.f27100sp);
        }
        setTextColor(color);
        setBackground(drawableB);
    }

    public LetterSendItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterSendItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
