package com.p046p1.mobile.putong.live.base.view;

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
import p149l.n9c0;

/* JADX INFO: loaded from: classes13.dex */
public class ClipRoundImageView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f44626a;

    /* JADX INFO: renamed from: b */
    public Path f44627b;

    /* JADX INFO: renamed from: c */
    public float f44628c;

    /* JADX INFO: renamed from: d */
    public RectF f44629d;

    /* JADX INFO: renamed from: e */
    public Rect f44630e;

    /* JADX INFO: renamed from: f */
    public Rect f44631f;

    /* JADX INFO: renamed from: g */
    public Paint f44632g;

    /* JADX INFO: renamed from: h */
    public float f44633h;

    /* JADX INFO: renamed from: i */
    public float f44634i;

    /* JADX INFO: renamed from: j */
    public float f44635j;

    public ClipRoundImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44627b = new Path();
        this.f44628c = 0.0f;
        this.f44629d = new RectF();
        this.f44630e = new Rect();
        this.f44631f = new Rect();
        this.f44632g = new Paint();
        this.f44633h = 0.0f;
        this.f44634i = 0.0f;
        this.f44635j = 0.0f;
        m68704a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m68704a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137780t);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(n9c0.f137781u, 0);
        if (resourceId != 0) {
            this.f44626a = BitmapFactory.decodeResource(context.getResources(), resourceId);
        }
        this.f44633h = typedArrayObtainStyledAttributes.getDimension(n9c0.f137782v, 0.0f);
        this.f44634i = typedArrayObtainStyledAttributes.getDimension(n9c0.f137783w, 0.0f);
        this.f44635j = typedArrayObtainStyledAttributes.getDimension(n9c0.f137784x, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        Bitmap bitmap = this.f44626a;
        if (bitmap != null) {
            this.f44630e.set(0, 0, bitmap.getWidth(), this.f44626a.getHeight());
            this.f44632g.setAntiAlias(true);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f44626a == null) {
            return;
        }
        canvas.save();
        canvas.clipPath(this.f44627b);
        canvas.drawBitmap(this.f44626a, this.f44630e, this.f44631f, this.f44632g);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f44626a == null) {
            return;
        }
        this.f44627b.reset();
        float measuredWidth = getMeasuredWidth() * this.f44628c;
        if (measuredWidth > getMeasuredWidth() - this.f44633h) {
            measuredWidth = getMeasuredWidth() - this.f44633h;
        }
        this.f44629d.set((int) this.f44633h, 0.0f, measuredWidth, getMeasuredHeight());
        Path path = this.f44627b;
        RectF rectF = this.f44629d;
        float f = this.f44635j;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int measuredHeight = getMeasuredHeight() - ((int) (this.f44634i * 2.0f));
        int measuredHeight2 = (getMeasuredHeight() - measuredHeight) / 2;
        this.f44631f.set((int) this.f44633h, measuredHeight2, this.f44626a.getWidth() + ((int) this.f44633h), measuredHeight + measuredHeight2);
    }

    public void setProgress(float f) {
        if (this.f44626a == null) {
            return;
        }
        this.f44628c = f;
        requestLayout();
    }

    public ClipRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipRoundImageView(Context context) {
        this(context, null);
    }
}
