package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallTopLineView extends View {

    /* JADX INFO: renamed from: a */
    public String f52259a;

    /* JADX INFO: renamed from: b */
    public Paint f52260b;

    public MultiCallTopLineView(Context context) {
        super(context);
        this.f52259a = "2x2";
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f52260b == null) {
            Paint paint = new Paint();
            this.f52260b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f52260b.setStrokeWidth(qa00.f156317d);
            this.f52260b.setColor(Color.parseColor("#38373B"));
            this.f52260b.setAntiAlias(true);
        }
        int width = getWidth();
        int width2 = getWidth();
        String str = this.f52259a;
        str.getClass();
        switch (str) {
            case "2x2":
                float f = width2;
                float f2 = f * 0.5f;
                float f3 = width;
                canvas.drawLine(0.0f, f2, f3 * 1.0f, f2, this.f52260b);
                float f4 = f3 * 0.5f;
                canvas.drawLine(f4, 0.0f, f4, f * 1.0f, this.f52260b);
                break;
            case "3x3":
                float f5 = width2;
                float f6 = f5 * 0.333f;
                float f7 = width;
                float f8 = f7 * 1.0f;
                canvas.drawLine(0.0f, f6, f8, f6, this.f52260b);
                float f9 = f5 * 0.667f;
                canvas.drawLine(0.0f, f9, f8, f9, this.f52260b);
                float f10 = f7 * 0.333f;
                float f11 = f5 * 1.0f;
                canvas.drawLine(f10, 0.0f, f10, f11, this.f52260b);
                float f12 = f7 * 0.667f;
                canvas.drawLine(f12, 0.0f, f12, f11, this.f52260b);
                break;
            case "1plus5":
                float f13 = width2;
                float f14 = f13 * 0.667f;
                float f15 = width;
                float f16 = f15 * 1.0f;
                canvas.drawLine(0.0f, f14, f16, f14, this.f52260b);
                float f17 = f15 * 0.667f;
                float f18 = f13 * 1.0f;
                canvas.drawLine(f17, 0.0f, f17, f18, this.f52260b);
                float f19 = f13 * 0.333f;
                canvas.drawLine(f17, f19, f16, f19, this.f52260b);
                float f20 = f15 * 0.333f;
                canvas.drawLine(f20, f14, f20, f18, this.f52260b);
                break;
            case "1plus8":
                float f21 = width;
                float f22 = f21 * 0.5f;
                float f23 = width2;
                float f24 = f23 * 0.0f;
                float f25 = f23 * 1.0f;
                canvas.drawLine(f22, f24, f22, f25, this.f52260b);
                float f26 = f21 * 0.75f;
                canvas.drawLine(f26, f24, f26, f25, this.f52260b);
                float f27 = f23 * 0.25f;
                float f28 = f21 * 1.0f;
                canvas.drawLine(f22, f27, f28, f27, this.f52260b);
                float f29 = f23 * 0.5f;
                canvas.drawLine(f22, f29, f28, f29, this.f52260b);
                float f30 = f23 * 0.75f;
                canvas.drawLine(f22, f30, f28, f30, this.f52260b);
                break;
        }
    }

    public MultiCallTopLineView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52259a = "2x2";
    }

    public MultiCallTopLineView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52259a = "2x2";
    }
}
