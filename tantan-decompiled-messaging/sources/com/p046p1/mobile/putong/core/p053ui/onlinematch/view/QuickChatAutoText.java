package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class QuickChatAutoText extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f32789i;

    /* JADX INFO: renamed from: j */
    public float f32790j;

    /* JADX INFO: renamed from: k */
    public int f32791k;

    /* JADX INFO: renamed from: l */
    public int f32792l;

    /* JADX INFO: renamed from: m */
    public float f32793m;

    /* JADX INFO: renamed from: n */
    public boolean f32794n;

    public QuickChatAutoText(Context context) {
        super(context);
        this.f32791k = -1;
        this.f32794n = true;
        m50395p();
    }

    /* JADX INFO: renamed from: p */
    private void m50395p() {
        this.f32789i = new Paint(getPaint());
        this.f32792l = t100.m186890d(4.0f);
        this.f32793m = getTextSize();
    }

    /* JADX INFO: renamed from: l */
    public final void m50396l(String str, int i) {
        if (i <= 0) {
            return;
        }
        this.f32790j = getTextSize();
        Drawable[] compoundDrawables = getCompoundDrawables();
        int iWidth = 0;
        for (int i2 = 0; i2 < compoundDrawables.length; i2++) {
            if (NullChecker.m81303a(compoundDrawables[i2])) {
                iWidth += compoundDrawables[i2].getBounds().width();
            }
        }
        int paddingLeft = ((((i - getPaddingLeft()) - getPaddingRight()) - getCompoundDrawablePadding()) - iWidth) - this.f32792l;
        float fM50397o = m50397o(this.f32790j, str);
        while (true) {
            float f = paddingLeft;
            float f2 = this.f32790j;
            if (fM50397o <= f) {
                setTextSize(0, f2);
                return;
            } else {
                float f3 = f2 - 1.0f;
                this.f32790j = f3;
                fM50397o = m50397o(f3, str);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final float m50397o(float f, String str) {
        this.f32789i.setTextSize(f);
        float f2 = 0.0f;
        for (String str2 : str.split(SignParameters.NEW_LINE)) {
            float fMeasureText = this.f32789i.measureText(str2);
            if (f2 < fMeasureText) {
                f2 = fMeasureText;
            }
        }
        return f2;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f32794n) {
            this.f32791k = Math.max(this.f32791k, getWidth());
            m50396l(getText().toString(), this.f32791k);
        }
    }

    public QuickChatAutoText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32791k = -1;
        this.f32794n = true;
        m50395p();
    }

    public QuickChatAutoText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32791k = -1;
        this.f32794n = true;
        m50395p();
    }
}
