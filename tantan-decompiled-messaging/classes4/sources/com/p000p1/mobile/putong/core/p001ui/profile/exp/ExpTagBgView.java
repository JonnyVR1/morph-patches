package com.p000p1.mobile.putong.core.p001ui.profile.exp;

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
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpTagBgView extends LinearLayout {

    /* JADX INFO: renamed from: e */
    public static Bitmap f988e;

    /* JADX INFO: renamed from: a */
    public int f989a;

    /* JADX INFO: renamed from: b */
    public Paint f990b;

    /* JADX INFO: renamed from: c */
    public Rect f991c;

    /* JADX INFO: renamed from: d */
    public RectF f992d;

    public ExpTagBgView(Context context) {
        super(context);
        this.f989a = -1;
        m1406a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1406a() {
        if (f988e == null) {
            f988e = BitmapFactory.decodeResource(getResources(), x2c0.W6);
        }
        this.f991c = new Rect(0, 0, 0, 0);
        this.f992d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f990b = paint;
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: b */
    public void m1407b(int i) {
        this.f989a = i;
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m1408c() {
        this.f989a = -1;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f989a;
        Paint paint = this.f990b;
        if (i != -1) {
            paint.setColor(i);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f990b);
            return;
        }
        paint.setColor(-526345);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f990b);
        int iMin = Math.min(f988e.getWidth(), (getMeasuredWidth() * f988e.getHeight()) / getMeasuredHeight());
        this.f991c.set(0, 0, iMin, f988e.getHeight());
        this.f992d.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f988e.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f988e, this.f991c, this.f992d, this.f990b);
    }

    public ExpTagBgView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f989a = -1;
        m1406a();
    }

    public ExpTagBgView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f989a = -1;
        m1406a();
    }
}
