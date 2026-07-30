package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashMap;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBlackGradientBackGroundView extends View {

    /* JADX INFO: renamed from: a */
    public HashMap<String, LinearGradient> f2157a;

    /* JADX INFO: renamed from: b */
    public Paint f2158b;

    /* JADX INFO: renamed from: c */
    public int f2159c;

    /* JADX INFO: renamed from: d */
    public int f2160d;

    /* JADX INFO: renamed from: e */
    public int f2161e;

    /* JADX INFO: renamed from: f */
    public int f2162f;

    /* JADX INFO: renamed from: g */
    public int f2163g;

    /* JADX INFO: renamed from: h */
    public final Paint f2164h;

    public CardBlackGradientBackGroundView(Context context) {
        super(context);
        this.f2157a = new HashMap<>();
        this.f2158b = new Paint();
        this.f2159c = 0;
        this.f2160d = -16777216;
        this.f2161e = t100.d(200.0f);
        this.f2162f = 0;
        this.f2163g = t100.d(20.0f);
        this.f2164h = new Paint(1);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2157a.clear();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        String str = String.valueOf(this.f2159c) + this.f2160d;
        LinearGradient linearGradient = this.f2157a.get(str);
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(this.f2161e - t100.d(20.0f), t100.d(20.0f)), this.f2159c, this.f2160d, Shader.TileMode.CLAMP);
            this.f2157a.put(str, linearGradient2);
            linearGradient = linearGradient2;
        }
        this.f2158b.setShader(linearGradient);
        this.f2158b.setStyle(Paint.Style.FILL);
        if (this.f2162f == 0) {
            int i = this.f2163g;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i, i, this.f2158b);
        } else {
            canvas.drawRect(0.0f, 0.0f, measuredWidth, this.f2161e, this.f2158b);
        }
        this.f2164h.setColor(this.f2160d);
        int iMax = Math.max(this.f2161e - t100.d(22.0f), t100.d(22.0f));
        int i2 = (int) measuredWidth;
        Path path = new Path();
        float fD = t100.d(20.0f);
        path.reset();
        float f = iMax;
        path.moveTo(0.0f, f);
        float f2 = i2;
        path.lineTo(f2, f);
        float f3 = (int) measuredHeight;
        path.lineTo(f2, f3 - fD);
        float f4 = 2.0f * fD;
        float f5 = f3 - f4;
        path.arcTo(new RectF(f2 - f4, f5, f2, f3), 0.0f, 90.0f);
        path.lineTo(fD + 0.0f, f3);
        path.arcTo(new RectF(0.0f, f5, f4 + 0.0f, f3), 90.0f, 90.0f);
        path.lineTo(0.0f, f);
        path.close();
        canvas.drawPath(path, this.f2164h);
    }

    public CardBlackGradientBackGroundView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2157a = new HashMap<>();
        this.f2158b = new Paint();
        this.f2159c = 0;
        this.f2160d = -16777216;
        this.f2161e = t100.d(200.0f);
        this.f2162f = 0;
        this.f2163g = t100.d(20.0f);
        this.f2164h = new Paint(1);
    }

    public CardBlackGradientBackGroundView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2157a = new HashMap<>();
        this.f2158b = new Paint();
        this.f2159c = 0;
        this.f2160d = -16777216;
        this.f2161e = t100.d(200.0f);
        this.f2162f = 0;
        this.f2163g = t100.d(20.0f);
        this.f2164h = new Paint(1);
    }
}
