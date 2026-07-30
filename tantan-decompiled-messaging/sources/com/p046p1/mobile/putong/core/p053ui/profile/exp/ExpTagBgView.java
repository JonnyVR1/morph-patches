package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpTagBgView extends LinearLayout {

    /* JADX INFO: renamed from: e */
    public static Bitmap f33166e;

    /* JADX INFO: renamed from: a */
    public int f33167a;

    /* JADX INFO: renamed from: b */
    public Paint f33168b;

    /* JADX INFO: renamed from: c */
    public Rect f33169c;

    /* JADX INFO: renamed from: d */
    public RectF f33170d;

    public ExpTagBgView(Context context) {
        super(context);
        this.f33167a = -1;
        m50958a();
    }

    /* JADX INFO: renamed from: a */
    public final void m50958a() {
        if (f33166e == null) {
            f33166e = BitmapFactory.decodeResource(getResources(), x2c0.f189848W6);
        }
        this.f33169c = new Rect(0, 0, 0, 0);
        this.f33170d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f33168b = paint;
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: b */
    public void m50959b(int i) {
        this.f33167a = i;
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m50960c() {
        this.f33167a = -1;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f33167a;
        Paint paint = this.f33168b;
        if (i != -1) {
            paint.setColor(i);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33168b);
            return;
        }
        paint.setColor(-526345);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33168b);
        int iMin = Math.min(f33166e.getWidth(), (getMeasuredWidth() * f33166e.getHeight()) / getMeasuredHeight());
        this.f33169c.set(0, 0, iMin, f33166e.getHeight());
        this.f33170d.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f33166e.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f33166e, this.f33169c, this.f33170d, this.f33168b);
    }

    public ExpTagBgView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33167a = -1;
        m50958a();
    }

    public ExpTagBgView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33167a = -1;
        m50958a();
    }
}
