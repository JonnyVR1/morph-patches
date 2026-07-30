package com.p051p1.mobile.putong.core.p058ui.vip.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.data.LetterWrapper;
import p151v.VText;
import p153l.d79;
import p153l.dbc0;
import p153l.tu0;

/* JADX INFO: loaded from: classes12.dex */
public class LetterSendItem extends VText {
    public LetterSendItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public void m58911l(LetterWrapper letterWrapper, String str) {
        int color;
        Drawable drawableM192702b;
        setText(letterWrapper.letter);
        if (!"spotlight_messages".equals(str)) {
            boolean zM114685j0 = d79.m114685j0();
            boolean z = letterWrapper.select;
            if (zM114685j0) {
                if (z) {
                    color = Color.parseColor("#ffffff");
                    drawableM192702b = tu0.m192702b(getContext(), dbc0.f86162Fp);
                } else {
                    color = Color.parseColor("#de000000");
                    drawableM192702b = tu0.m192702b(getContext(), dbc0.f86130Ep);
                }
            } else if (z) {
                color = Color.parseColor("#ffffff");
                drawableM192702b = tu0.m192702b(getContext(), dbc0.f86035Bq);
            } else {
                color = Color.parseColor("#de000000");
                drawableM192702b = tu0.m192702b(getContext(), dbc0.f86003Aq);
            }
        } else if (letterWrapper.select) {
            color = Color.parseColor("#ffffff");
            drawableM192702b = tu0.m192702b(getContext(), dbc0.f87065hq);
        } else {
            color = Color.parseColor("#de000000");
            drawableM192702b = tu0.m192702b(getContext(), dbc0.f87032gq);
        }
        setTextColor(color);
        setBackground(drawableM192702b);
    }

    public LetterSendItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterSendItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
