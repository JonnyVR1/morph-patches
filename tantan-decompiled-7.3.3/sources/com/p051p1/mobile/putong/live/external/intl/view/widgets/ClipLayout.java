package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.uhc0;

/* JADX INFO: loaded from: classes9.dex */
public class ClipLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Path f46562a;

    /* JADX INFO: renamed from: b */
    public int f46563b;

    /* JADX INFO: renamed from: c */
    public float f46564c;

    /* JADX INFO: renamed from: d */
    public final RectF f46565d;

    public ClipLayout(@NonNull Context context) {
        super(context);
        this.f46562a = new Path();
        this.f46563b = 1;
        this.f46564c = 0.0f;
        this.f46565d = new RectF();
        m71422a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m71422a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uhc0.f179010a);
        this.f46563b = typedArrayObtainStyledAttributes.getInt(uhc0.f179012c, 1);
        this.f46564c = typedArrayObtainStyledAttributes.getDimension(uhc0.f179011b, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m71423b(int i, int i2) {
        this.f46565d.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f46562a.reset();
        int i3 = this.f46563b;
        if (i3 == 0) {
            this.f46562a.addCircle(this.f46565d.centerX(), this.f46565d.centerY(), Math.min(this.f46565d.width(), this.f46565d.height()) / 2.0f, Path.Direction.CW);
        } else {
            if (i3 != 1) {
                return;
            }
            Path path = this.f46562a;
            RectF rectF = this.f46565d;
            float f = this.f46564c;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f46562a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m71423b(i, i2);
    }

    public ClipLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46562a = new Path();
        this.f46563b = 1;
        this.f46564c = 0.0f;
        this.f46565d = new RectF();
        m71422a(context, attributeSet);
    }
}
