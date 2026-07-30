package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class QuickChatAutoText extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f611i;

    /* JADX INFO: renamed from: j */
    public float f612j;

    /* JADX INFO: renamed from: k */
    public int f613k;

    /* JADX INFO: renamed from: l */
    public int f614l;

    /* JADX INFO: renamed from: m */
    public float f615m;

    /* JADX INFO: renamed from: n */
    public boolean f616n;

    public QuickChatAutoText(Context context) {
        super(context);
        this.f613k = -1;
        this.f616n = true;
        m826p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private void m826p() {
        this.f611i = new Paint(getPaint());
        this.f614l = t100.d(4.0f);
        this.f615m = getTextSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m827l(String str, int i) {
        if (i <= 0) {
            return;
        }
        this.f612j = getTextSize();
        Drawable[] compoundDrawables = getCompoundDrawables();
        int iWidth = 0;
        for (int i2 = 0; i2 < compoundDrawables.length; i2++) {
            if (NullChecker.a(compoundDrawables[i2])) {
                iWidth += compoundDrawables[i2].getBounds().width();
            }
        }
        int paddingLeft = ((((i - getPaddingLeft()) - getPaddingRight()) - getCompoundDrawablePadding()) - iWidth) - this.f614l;
        float fM828o = m828o(this.f612j, str);
        while (true) {
            float f = paddingLeft;
            float f2 = this.f612j;
            if (fM828o <= f) {
                setTextSize(0, f2);
                return;
            } else {
                float f3 = f2 - 1.0f;
                this.f612j = f3;
                fM828o = m828o(f3, str);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final float m828o(float f, String str) {
        this.f611i.setTextSize(f);
        float f2 = 0.0f;
        for (String str2 : str.split("\n")) {
            float fMeasureText = this.f611i.measureText(str2);
            if (f2 < fMeasureText) {
                f2 = fMeasureText;
            }
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (this.f616n) {
            this.f613k = Math.max(this.f613k, getWidth());
            m827l(getText().toString(), this.f613k);
        }
    }

    public QuickChatAutoText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f613k = -1;
        this.f616n = true;
        m826p();
    }

    public QuickChatAutoText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f613k = -1;
        this.f616n = true;
        m826p();
    }
}
