package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.tencent.connect.avatar.b */
/* JADX INFO: loaded from: classes13.dex */
public class C13821b extends View {

    /* JADX INFO: renamed from: a */
    private Rect f57153a;

    /* JADX INFO: renamed from: b */
    private Paint f57154b;

    public C13821b(Context context) {
        super(context);
        m82129b();
    }

    /* JADX INFO: renamed from: b */
    private void m82129b() {
        this.f57154b = new Paint();
    }

    /* JADX INFO: renamed from: a */
    public Rect m82130a() {
        if (this.f57153a == null) {
            this.f57153a = new Rect();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int iMin = Math.min(Math.min(measuredHeight - 140, measuredWidth), 640);
            int i = (measuredWidth - iMin) / 2;
            int i2 = (measuredHeight - iMin) / 2;
            this.f57153a.set(i, i2, i + iMin, iMin + i2);
        }
        return this.f57153a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rectM82130a = m82130a();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f57154b.setStyle(Paint.Style.FILL);
        this.f57154b.setColor(Color.argb(100, 0, 0, 0));
        float f = measuredWidth;
        canvas.drawRect(0.0f, 0.0f, f, rectM82130a.top, this.f57154b);
        canvas.drawRect(0.0f, rectM82130a.bottom, f, measuredHeight, this.f57154b);
        canvas.drawRect(0.0f, rectM82130a.top, rectM82130a.left, rectM82130a.bottom, this.f57154b);
        canvas.drawRect(rectM82130a.right, rectM82130a.top, f, rectM82130a.bottom, this.f57154b);
        canvas.drawColor(Color.argb(100, 0, 0, 0));
        this.f57154b.setStyle(Paint.Style.STROKE);
        this.f57154b.setColor(-1);
        canvas.drawRect(rectM82130a.left, rectM82130a.top, rectM82130a.right - 1, rectM82130a.bottom, this.f57154b);
    }
}
