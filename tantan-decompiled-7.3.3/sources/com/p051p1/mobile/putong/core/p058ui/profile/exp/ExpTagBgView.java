package com.p051p1.mobile.putong.core.p058ui.profile.exp;

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
import p153l.dbc0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpTagBgView extends LinearLayout {

    /* JADX INFO: renamed from: e */
    public static Bitmap f34014e;

    /* JADX INFO: renamed from: a */
    public int f34015a;

    /* JADX INFO: renamed from: b */
    public Paint f34016b;

    /* JADX INFO: renamed from: c */
    public Rect f34017c;

    /* JADX INFO: renamed from: d */
    public RectF f34018d;

    public ExpTagBgView(Context context) {
        super(context);
        this.f34015a = -1;
        m52141a();
    }

    /* JADX INFO: renamed from: a */
    public final void m52141a() {
        if (f34014e == null) {
            f34014e = BitmapFactory.decodeResource(getResources(), dbc0.f86719X6);
        }
        this.f34017c = new Rect(0, 0, 0, 0);
        this.f34018d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.f34016b = paint;
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: b */
    public void m52142b(int i) {
        this.f34015a = i;
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m52143c() {
        this.f34015a = -1;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f34015a;
        Paint paint = this.f34016b;
        if (i != -1) {
            paint.setColor(i);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34016b);
            return;
        }
        paint.setColor(-526345);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34016b);
        int iMin = Math.min(f34014e.getWidth(), (getMeasuredWidth() * f34014e.getHeight()) / getMeasuredHeight());
        this.f34017c.set(0, 0, iMin, f34014e.getHeight());
        this.f34018d.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f34014e.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f34014e, this.f34017c, this.f34018d, this.f34016b);
    }

    public ExpTagBgView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34015a = -1;
        m52141a();
    }

    public ExpTagBgView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34015a = -1;
        m52141a();
    }
}
