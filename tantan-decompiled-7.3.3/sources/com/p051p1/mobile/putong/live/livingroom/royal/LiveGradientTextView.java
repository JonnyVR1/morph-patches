package com.p051p1.mobile.putong.live.livingroom.royal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p151v.VText;
import p153l.und0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveGradientTextView extends VText {

    /* JADX INFO: renamed from: i */
    @Nullable
    public int[] f52658i;

    public LiveGradientTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public final Shader m77507l() {
        float f;
        float f2;
        int iMax = Math.max(1, (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight());
        float compoundPaddingLeft = getCompoundPaddingLeft();
        float f3 = iMax + compoundPaddingLeft;
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() <= 0) {
            f = f3;
            f2 = compoundPaddingLeft;
        } else {
            float lineLeft = layout.getLineLeft(0);
            float lineRight = layout.getLineRight(0);
            for (int i = 1; i < layout.getLineCount(); i++) {
                lineRight = Math.max(lineRight, layout.getLineRight(i));
            }
            float fMax = Math.max(1.0f, lineRight - lineLeft);
            float compoundPaddingLeft2 = lineLeft + getCompoundPaddingLeft();
            f2 = compoundPaddingLeft2;
            f = fMax + compoundPaddingLeft2;
        }
        int[] iArr = this.f52658i;
        if (iArr == null || iArr.length < 2) {
            return new LinearGradient(f2, 0.0f, f, 0.0f, und0.f179718a, und0.f179719b, Shader.TileMode.CLAMP);
        }
        int length = iArr.length;
        if (length == 2) {
            int[] iArr2 = this.f52658i;
            return new LinearGradient(f2, 0.0f, f, 0.0f, iArr2[0], iArr2[1], Shader.TileMode.CLAMP);
        }
        float[] fArr = new float[length];
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = i2 / (length - 1);
        }
        return new LinearGradient(f2, 0.0f, f, 0.0f, this.f52658i, fArr, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m77508o() {
        int[] iArr;
        return (TextUtils.isEmpty(getText()) || (iArr = this.f52658i) == null || iArr.length < 2) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (!m77508o()) {
            super.onDraw(canvas);
            return;
        }
        TextPaint paint = getPaint();
        Shader shader = paint.getShader();
        int color = paint.getColor();
        ColorFilter colorFilter = paint.getColorFilter();
        try {
            paint.setColorFilter(null);
            paint.setShader(m77507l());
            paint.setColor(-1);
            super.onDraw(canvas);
        } catch (Exception unused) {
        } finally {
            paint.setShader(shader);
            paint.setColor(color);
            paint.setColorFilter(colorFilter);
        }
    }

    public void setUserGradientColors(@Nullable int[] iArr) {
        if (iArr != null && iArr.length < 2) {
            iArr = null;
        }
        int[] iArr2 = iArr != null ? (int[]) iArr.clone() : null;
        if (Arrays.equals(this.f52658i, iArr2)) {
            return;
        }
        this.f52658i = iArr2;
        invalidate();
    }

    public LiveGradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
