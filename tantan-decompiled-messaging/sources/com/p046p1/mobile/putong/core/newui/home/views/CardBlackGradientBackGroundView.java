package com.p046p1.mobile.putong.core.newui.home.views;

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
import p149l.t100;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class CardBlackGradientBackGroundView extends View {

    /* JADX INFO: renamed from: a */
    public HashMap<String, LinearGradient> f23379a;

    /* JADX INFO: renamed from: b */
    public Paint f23380b;

    /* JADX INFO: renamed from: c */
    public int f23381c;

    /* JADX INFO: renamed from: d */
    public int f23382d;

    /* JADX INFO: renamed from: e */
    public int f23383e;

    /* JADX INFO: renamed from: f */
    public int f23384f;

    /* JADX INFO: renamed from: g */
    public int f23385g;

    /* JADX INFO: renamed from: h */
    public final Paint f23386h;

    public CardBlackGradientBackGroundView(Context context) {
        super(context);
        this.f23379a = new HashMap<>();
        this.f23380b = new Paint();
        this.f23381c = 0;
        this.f23382d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f23383e = t100.m186890d(200.0f);
        this.f23384f = 0;
        this.f23385g = t100.m186890d(20.0f);
        this.f23386h = new Paint(1);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23379a.clear();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        String str = String.valueOf(this.f23381c) + this.f23382d;
        LinearGradient linearGradient = this.f23379a.get(str);
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(this.f23383e - t100.m186890d(20.0f), t100.m186890d(20.0f)), this.f23381c, this.f23382d, Shader.TileMode.CLAMP);
            this.f23379a.put(str, linearGradient2);
            linearGradient = linearGradient2;
        }
        this.f23380b.setShader(linearGradient);
        this.f23380b.setStyle(Paint.Style.FILL);
        if (this.f23384f == 0) {
            int i = this.f23385g;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i, i, this.f23380b);
        } else {
            canvas.drawRect(0.0f, 0.0f, measuredWidth, this.f23383e, this.f23380b);
        }
        this.f23386h.setColor(this.f23382d);
        int iMax = Math.max(this.f23383e - t100.m186890d(22.0f), t100.m186890d(22.0f));
        int i2 = (int) measuredWidth;
        Path path = new Path();
        float fM186890d = t100.m186890d(20.0f);
        path.reset();
        float f = iMax;
        path.moveTo(0.0f, f);
        float f2 = i2;
        path.lineTo(f2, f);
        float f3 = (int) measuredHeight;
        path.lineTo(f2, f3 - fM186890d);
        float f4 = 2.0f * fM186890d;
        float f5 = f3 - f4;
        path.arcTo(new RectF(f2 - f4, f5, f2, f3), 0.0f, 90.0f);
        path.lineTo(fM186890d + 0.0f, f3);
        path.arcTo(new RectF(0.0f, f5, f4 + 0.0f, f3), 90.0f, 90.0f);
        path.lineTo(0.0f, f);
        path.close();
        canvas.drawPath(path, this.f23386h);
    }

    public CardBlackGradientBackGroundView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23379a = new HashMap<>();
        this.f23380b = new Paint();
        this.f23381c = 0;
        this.f23382d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f23383e = t100.m186890d(200.0f);
        this.f23384f = 0;
        this.f23385g = t100.m186890d(20.0f);
        this.f23386h = new Paint(1);
    }

    public CardBlackGradientBackGroundView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23379a = new HashMap<>();
        this.f23380b = new Paint();
        this.f23381c = 0;
        this.f23382d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f23383e = t100.m186890d(200.0f);
        this.f23384f = 0;
        this.f23385g = t100.m186890d(20.0f);
        this.f23386h = new Paint(1);
    }
}
