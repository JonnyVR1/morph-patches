package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class ScrollGuideView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f52937a;

    /* JADX INFO: renamed from: b */
    public float f52938b;

    /* JADX INFO: renamed from: c */
    public float f52939c;

    /* JADX INFO: renamed from: d */
    public int f52940d;

    /* JADX INFO: renamed from: e */
    public int f52941e;

    public ScrollGuideView(Context context) {
        super(context);
        this.f52937a = new Paint(1);
        this.f52938b = 0.0f;
        this.f52939c = qa00.m175859d(110.0f);
        this.f52940d = qa00.m175859d(42.0f);
        this.f52941e = qa00.m175859d(58.0f);
        this.f52937a.setColor(Color.parseColor("#D0D0D0"));
        this.f52937a.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: a */
    public void m77836a(float f, float f2) {
        this.f52938b = qa00.m175859d(f);
        this.f52939c = qa00.m175859d(f2);
        invalidate();
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f52940d, this.f52938b, this.f52941e, this.f52939c, 40.0f, 40.0f, this.f52937a);
    }

    public ScrollGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52937a = new Paint(1);
        this.f52938b = 0.0f;
        this.f52939c = qa00.m175859d(110.0f);
        this.f52940d = qa00.m175859d(42.0f);
        this.f52941e = qa00.m175859d(58.0f);
        this.f52937a.setColor(Color.parseColor("#D0D0D0"));
        this.f52937a.setStyle(Paint.Style.FILL);
    }

    public ScrollGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52937a = new Paint(1);
        this.f52938b = 0.0f;
        this.f52939c = qa00.m175859d(110.0f);
        this.f52940d = qa00.m175859d(42.0f);
        this.f52941e = qa00.m175859d(58.0f);
        this.f52937a.setColor(Color.parseColor("#D0D0D0"));
        this.f52937a.setStyle(Paint.Style.FILL);
    }
}
