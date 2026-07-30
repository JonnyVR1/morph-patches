package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.o9c0;

/* JADX INFO: loaded from: classes13.dex */
public class ClipLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f45714a;

    /* JADX INFO: renamed from: b */
    public int f45715b;

    /* JADX INFO: renamed from: c */
    public float f45716c;

    /* JADX INFO: renamed from: d */
    public final RectF f45717d;

    public ClipLayout(@NonNull Context context) {
        super(context);
        this.f45714a = new Path();
        this.f45715b = 1;
        this.f45716c = 0.0f;
        this.f45717d = new RectF();
        m70239a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m70239a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o9c0.f142705a);
        this.f45715b = typedArrayObtainStyledAttributes.getInt(o9c0.f142707c, 1);
        this.f45716c = typedArrayObtainStyledAttributes.getDimension(o9c0.f142706b, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m70240b(int i, int i2) {
        this.f45717d.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f45714a.reset();
        int i3 = this.f45715b;
        if (i3 == 0) {
            this.f45714a.addCircle(this.f45717d.centerX(), this.f45717d.centerY(), Math.min(this.f45717d.width(), this.f45717d.height()) / 2.0f, Path.Direction.CW);
        } else {
            if (i3 != 1) {
                return;
            }
            Path path = this.f45714a;
            RectF rectF = this.f45717d;
            float f = this.f45716c;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f45714a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m70240b(i, i2);
    }

    public ClipLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45714a = new Path();
        this.f45715b = 1;
        this.f45716c = 0.0f;
        this.f45717d = new RectF();
        m70239a(context, attributeSet);
    }
}
