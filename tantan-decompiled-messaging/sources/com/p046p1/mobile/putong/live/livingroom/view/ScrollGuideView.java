package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class ScrollGuideView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f52089a;

    /* JADX INFO: renamed from: b */
    public float f52090b;

    /* JADX INFO: renamed from: c */
    public float f52091c;

    /* JADX INFO: renamed from: d */
    public int f52092d;

    /* JADX INFO: renamed from: e */
    public int f52093e;

    public ScrollGuideView(Context context) {
        super(context);
        this.f52089a = new Paint(1);
        this.f52090b = 0.0f;
        this.f52091c = t100.m186890d(110.0f);
        this.f52092d = t100.m186890d(42.0f);
        this.f52093e = t100.m186890d(58.0f);
        this.f52089a.setColor(Color.parseColor("#D0D0D0"));
        this.f52089a.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: a */
    public void m76653a(float f, float f2) {
        this.f52090b = t100.m186890d(f);
        this.f52091c = t100.m186890d(f2);
        invalidate();
    }

    @Override // android.view.View
    @RequiresApi(api = 21)
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f52092d, this.f52090b, this.f52093e, this.f52091c, 40.0f, 40.0f, this.f52089a);
    }

    public ScrollGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52089a = new Paint(1);
        this.f52090b = 0.0f;
        this.f52091c = t100.m186890d(110.0f);
        this.f52092d = t100.m186890d(42.0f);
        this.f52093e = t100.m186890d(58.0f);
        this.f52089a.setColor(Color.parseColor("#D0D0D0"));
        this.f52089a.setStyle(Paint.Style.FILL);
    }

    public ScrollGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52089a = new Paint(1);
        this.f52090b = 0.0f;
        this.f52091c = t100.m186890d(110.0f);
        this.f52092d = t100.m186890d(42.0f);
        this.f52093e = t100.m186890d(58.0f);
        this.f52089a.setColor(Color.parseColor("#D0D0D0"));
        this.f52089a.setStyle(Paint.Style.FILL);
    }
}
