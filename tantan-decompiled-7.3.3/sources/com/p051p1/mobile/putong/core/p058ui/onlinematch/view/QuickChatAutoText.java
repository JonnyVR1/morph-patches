package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class QuickChatAutoText extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f33637i;

    /* JADX INFO: renamed from: j */
    public float f33638j;

    /* JADX INFO: renamed from: k */
    public int f33639k;

    /* JADX INFO: renamed from: l */
    public int f33640l;

    /* JADX INFO: renamed from: m */
    public float f33641m;

    /* JADX INFO: renamed from: n */
    public boolean f33642n;

    public QuickChatAutoText(Context context) {
        super(context);
        this.f33639k = -1;
        this.f33642n = true;
        m51578p();
    }

    /* JADX INFO: renamed from: p */
    private void m51578p() {
        this.f33637i = new Paint(getPaint());
        this.f33640l = qa00.m175859d(4.0f);
        this.f33641m = getTextSize();
    }

    /* JADX INFO: renamed from: l */
    public final void m51579l(String str, int i) {
        if (i <= 0) {
            return;
        }
        this.f33638j = getTextSize();
        Drawable[] compoundDrawables = getCompoundDrawables();
        int iWidth = 0;
        for (int i2 = 0; i2 < compoundDrawables.length; i2++) {
            if (NullChecker.m82486a(compoundDrawables[i2])) {
                iWidth += compoundDrawables[i2].getBounds().width();
            }
        }
        int paddingLeft = ((((i - getPaddingLeft()) - getPaddingRight()) - getCompoundDrawablePadding()) - iWidth) - this.f33640l;
        float fM51580o = m51580o(this.f33638j, str);
        while (true) {
            float f = paddingLeft;
            float f2 = this.f33638j;
            if (fM51580o <= f) {
                setTextSize(0, f2);
                return;
            } else {
                float f3 = f2 - 1.0f;
                this.f33638j = f3;
                fM51580o = m51580o(f3, str);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final float m51580o(float f, String str) {
        this.f33637i.setTextSize(f);
        float f2 = 0.0f;
        for (String str2 : str.split(SignParameters.NEW_LINE)) {
            float fMeasureText = this.f33637i.measureText(str2);
            if (f2 < fMeasureText) {
                f2 = fMeasureText;
            }
        }
        return f2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f33642n) {
            this.f33639k = Math.max(this.f33639k, getWidth());
            m51579l(getText().toString(), this.f33639k);
        }
    }

    public QuickChatAutoText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33639k = -1;
        this.f33642n = true;
        m51578p();
    }

    public QuickChatAutoText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33639k = -1;
        this.f33642n = true;
        m51578p();
    }
}
