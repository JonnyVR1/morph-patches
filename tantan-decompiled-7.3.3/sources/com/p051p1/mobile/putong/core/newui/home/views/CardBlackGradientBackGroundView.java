package com.p051p1.mobile.putong.core.newui.home.views;

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
import p153l.qa00;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class CardBlackGradientBackGroundView extends View {

    /* JADX INFO: renamed from: a */
    public HashMap<String, LinearGradient> f24121a;

    /* JADX INFO: renamed from: b */
    public Paint f24122b;

    /* JADX INFO: renamed from: c */
    public int f24123c;

    /* JADX INFO: renamed from: d */
    public int f24124d;

    /* JADX INFO: renamed from: e */
    public int f24125e;

    /* JADX INFO: renamed from: f */
    public int f24126f;

    /* JADX INFO: renamed from: g */
    public int f24127g;

    /* JADX INFO: renamed from: h */
    public final Paint f24128h;

    public CardBlackGradientBackGroundView(Context context) {
        super(context);
        this.f24121a = new HashMap<>();
        this.f24122b = new Paint();
        this.f24123c = 0;
        this.f24124d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f24125e = qa00.m175859d(200.0f);
        this.f24126f = 0;
        this.f24127g = qa00.m175859d(20.0f);
        this.f24128h = new Paint(1);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24121a.clear();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        String str = String.valueOf(this.f24123c) + this.f24124d;
        LinearGradient linearGradient = this.f24121a.get(str);
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(this.f24125e - qa00.m175859d(20.0f), qa00.m175859d(20.0f)), this.f24123c, this.f24124d, Shader.TileMode.CLAMP);
            this.f24121a.put(str, linearGradient2);
            linearGradient = linearGradient2;
        }
        this.f24122b.setShader(linearGradient);
        this.f24122b.setStyle(Paint.Style.FILL);
        if (this.f24126f == 0) {
            int i = this.f24127g;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i, i, this.f24122b);
        } else {
            canvas.drawRect(0.0f, 0.0f, measuredWidth, this.f24125e, this.f24122b);
        }
        this.f24128h.setColor(this.f24124d);
        int iMax = Math.max(this.f24125e - qa00.m175859d(22.0f), qa00.m175859d(22.0f));
        int i2 = (int) measuredWidth;
        Path path = new Path();
        float fM175859d = qa00.m175859d(20.0f);
        path.reset();
        float f = iMax;
        path.moveTo(0.0f, f);
        float f2 = i2;
        path.lineTo(f2, f);
        float f3 = (int) measuredHeight;
        path.lineTo(f2, f3 - fM175859d);
        float f4 = 2.0f * fM175859d;
        float f5 = f3 - f4;
        path.arcTo(new RectF(f2 - f4, f5, f2, f3), 0.0f, 90.0f);
        path.lineTo(fM175859d + 0.0f, f3);
        path.arcTo(new RectF(0.0f, f5, f4 + 0.0f, f3), 90.0f, 90.0f);
        path.lineTo(0.0f, f);
        path.close();
        canvas.drawPath(path, this.f24128h);
    }

    public CardBlackGradientBackGroundView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24121a = new HashMap<>();
        this.f24122b = new Paint();
        this.f24123c = 0;
        this.f24124d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f24125e = qa00.m175859d(200.0f);
        this.f24126f = 0;
        this.f24127g = qa00.m175859d(20.0f);
        this.f24128h = new Paint(1);
    }

    public CardBlackGradientBackGroundView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24121a = new HashMap<>();
        this.f24122b = new Paint();
        this.f24123c = 0;
        this.f24124d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f24125e = qa00.m175859d(200.0f);
        this.f24126f = 0;
        this.f24127g = qa00.m175859d(20.0f);
        this.f24128h = new Paint(1);
    }
}
