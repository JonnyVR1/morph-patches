package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.tencent.connect.avatar.b */
/* JADX INFO: loaded from: classes12.dex */
public class C13984b extends View {

    /* JADX INFO: renamed from: a */
    private Rect f58001a;

    /* JADX INFO: renamed from: b */
    private Paint f58002b;

    public C13984b(Context context) {
        super(context);
        m83312b();
    }

    /* JADX INFO: renamed from: b */
    private void m83312b() {
        this.f58002b = new Paint();
    }

    /* JADX INFO: renamed from: a */
    public Rect m83313a() {
        if (this.f58001a == null) {
            this.f58001a = new Rect();
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int iMin = Math.min(Math.min(measuredHeight - 140, measuredWidth), 640);
            int i = (measuredWidth - iMin) / 2;
            int i2 = (measuredHeight - iMin) / 2;
            this.f58001a.set(i, i2, i + iMin, iMin + i2);
        }
        return this.f58001a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rectM83313a = m83313a();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f58002b.setStyle(Paint.Style.FILL);
        this.f58002b.setColor(Color.argb(100, 0, 0, 0));
        float f = measuredWidth;
        canvas.drawRect(0.0f, 0.0f, f, rectM83313a.top, this.f58002b);
        canvas.drawRect(0.0f, rectM83313a.bottom, f, measuredHeight, this.f58002b);
        canvas.drawRect(0.0f, rectM83313a.top, rectM83313a.left, rectM83313a.bottom, this.f58002b);
        canvas.drawRect(rectM83313a.right, rectM83313a.top, f, rectM83313a.bottom, this.f58002b);
        canvas.drawColor(Color.argb(100, 0, 0, 0));
        this.f58002b.setStyle(Paint.Style.STROKE);
        this.f58002b.setColor(-1);
        canvas.drawRect(rectM83313a.left, rectM83313a.top, rectM83313a.right - 1, rectM83313a.bottom, this.f58002b);
    }
}
