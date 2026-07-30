package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.thc0;

/* JADX INFO: loaded from: classes13.dex */
public class ClipRoundImageView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f45474a;

    /* JADX INFO: renamed from: b */
    public Path f45475b;

    /* JADX INFO: renamed from: c */
    public float f45476c;

    /* JADX INFO: renamed from: d */
    public RectF f45477d;

    /* JADX INFO: renamed from: e */
    public Rect f45478e;

    /* JADX INFO: renamed from: f */
    public Rect f45479f;

    /* JADX INFO: renamed from: g */
    public Paint f45480g;

    /* JADX INFO: renamed from: h */
    public float f45481h;

    /* JADX INFO: renamed from: i */
    public float f45482i;

    /* JADX INFO: renamed from: j */
    public float f45483j;

    public ClipRoundImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45475b = new Path();
        this.f45476c = 0.0f;
        this.f45477d = new RectF();
        this.f45478e = new Rect();
        this.f45479f = new Rect();
        this.f45480g = new Paint();
        this.f45481h = 0.0f;
        this.f45482i = 0.0f;
        this.f45483j = 0.0f;
        m69887a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m69887a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174338t);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(thc0.f174339u, 0);
        if (resourceId != 0) {
            this.f45474a = BitmapFactory.decodeResource(context.getResources(), resourceId);
        }
        this.f45481h = typedArrayObtainStyledAttributes.getDimension(thc0.f174340v, 0.0f);
        this.f45482i = typedArrayObtainStyledAttributes.getDimension(thc0.f174341w, 0.0f);
        this.f45483j = typedArrayObtainStyledAttributes.getDimension(thc0.f174342x, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        Bitmap bitmap = this.f45474a;
        if (bitmap != null) {
            this.f45478e.set(0, 0, bitmap.getWidth(), this.f45474a.getHeight());
            this.f45480g.setAntiAlias(true);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f45474a == null) {
            return;
        }
        canvas.save();
        canvas.clipPath(this.f45475b);
        canvas.drawBitmap(this.f45474a, this.f45478e, this.f45479f, this.f45480g);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f45474a == null) {
            return;
        }
        this.f45475b.reset();
        float measuredWidth = getMeasuredWidth() * this.f45476c;
        if (measuredWidth > getMeasuredWidth() - this.f45481h) {
            measuredWidth = getMeasuredWidth() - this.f45481h;
        }
        this.f45477d.set((int) this.f45481h, 0.0f, measuredWidth, getMeasuredHeight());
        Path path = this.f45475b;
        RectF rectF = this.f45477d;
        float f = this.f45483j;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int measuredHeight = getMeasuredHeight() - ((int) (this.f45482i * 2.0f));
        int measuredHeight2 = (getMeasuredHeight() - measuredHeight) / 2;
        this.f45479f.set((int) this.f45481h, measuredHeight2, this.f45474a.getWidth() + ((int) this.f45481h), measuredHeight + measuredHeight2);
    }

    public void setProgress(float f) {
        if (this.f45474a == null) {
            return;
        }
        this.f45476c = f;
        requestLayout();
    }

    public ClipRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipRoundImageView(Context context) {
        this(context, null);
    }
}
