package com.hellogroup.p036mk.business.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p153l.chc0;
import p153l.w9c0;

/* JADX INFO: loaded from: classes7.dex */
public class CompatAppbarLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private boolean f12337a;

    /* JADX INFO: renamed from: b */
    private int f12338b;

    /* JADX INFO: renamed from: c */
    private Paint f12339c;

    public CompatAppbarLayout(Context context) {
        super(context);
        this.f12337a = false;
        this.f12338b = getResources().getColor(w9c0.f187998d);
        m18266a(context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m18266a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, chc0.f81775a);
            this.f12337a = typedArrayObtainStyledAttributes.getBoolean(chc0.f81777c, this.f12337a);
            this.f12338b = typedArrayObtainStyledAttributes.getColor(chc0.f81776b, getResources().getColor(w9c0.f187998d));
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f12339c = paint;
        paint.setColor(this.f12338b);
        this.f12339c.setStyle(Paint.Style.STROKE);
    }

    /* JADX INFO: renamed from: b */
    public void m18267b(boolean z) {
        if (this.f12337a == z) {
            return;
        }
        this.f12337a = z;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f12337a || this.f12339c == null) {
            return;
        }
        canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight(), this.f12339c);
    }

    public CompatAppbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12337a = false;
        this.f12338b = getResources().getColor(w9c0.f187998d);
        m18266a(context, attributeSet);
    }
}
