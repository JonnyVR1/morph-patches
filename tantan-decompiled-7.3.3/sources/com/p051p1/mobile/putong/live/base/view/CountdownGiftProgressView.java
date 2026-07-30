package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p153l.thc0;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 19)
public class CountdownGiftProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f45488a;

    /* JADX INFO: renamed from: b */
    public Paint f45489b;

    /* JADX INFO: renamed from: c */
    public Paint f45490c;

    /* JADX INFO: renamed from: d */
    public boolean f45491d;

    /* JADX INFO: renamed from: e */
    public int f45492e;

    /* JADX INFO: renamed from: f */
    public SparseArray<float[]> f45493f;

    public CountdownGiftProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45488a = 1;
        this.f45491d = false;
        this.f45492e = 0;
        this.f45493f = new SparseArray<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174343y);
        this.f45488a = typedArrayObtainStyledAttributes.getInt(thc0.f174344z, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Path getCurrentProgressPath() {
        Path path = new Path();
        path.addRect(new RectF(getLeft(), getTop(), getLeft() + ((int) (getWidth() * (this.f45492e / 100.0f))), getBottom()), Path.Direction.CW);
        return path;
    }

    private Path getExactlyPath() {
        Path path = new Path();
        path.addRoundRect(getRectWhole(), m69890c(this.f45488a), Path.Direction.CW);
        return path;
    }

    private Path getFinalPath() {
        Path progressPath = getProgressPath();
        progressPath.op(getExactlyPath(), Path.Op.UNION);
        return progressPath;
    }

    private Path getProgressPath() {
        Path path = new Path();
        float height = getHeight() / 2;
        path.addRoundRect(getRectWhole(), height, height, Path.Direction.CW);
        return path;
    }

    private RectF getRectWhole() {
        return new RectF(getLeft(), getTop(), getRight(), getBottom());
    }

    /* JADX INFO: renamed from: a */
    public final void m69888a(Canvas canvas) {
        canvas.drawPath(getExactlyPath(), this.f45490c);
    }

    /* JADX INFO: renamed from: b */
    public final void m69889b(Canvas canvas) {
        Path finalPath = getFinalPath();
        finalPath.op(getCurrentProgressPath(), Path.Op.INTERSECT);
        canvas.drawPath(finalPath, this.f45489b);
    }

    /* JADX INFO: renamed from: c */
    public final float[] m69890c(int i) {
        float[] fArr = this.f45493f.get(i);
        return fArr == null ? m69892e(i) : fArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m69891d() {
        this.f45491d = true;
        float width = getWidth();
        int color = Color.parseColor("#667A3DD2");
        int color2 = Color.parseColor("#66C56CD7");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, width, 0.0f, color, color2, tileMode);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#7A3DD2"), Color.parseColor("#C56CD7"), tileMode);
        Paint paint = new Paint();
        this.f45489b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f45489b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f45489b.setShader(linearGradient2);
        Paint paint3 = new Paint();
        this.f45490c = paint3;
        paint3.setAntiAlias(true);
        this.f45490c.setStyle(style);
        this.f45490c.setShader(linearGradient);
    }

    /* JADX INFO: renamed from: e */
    public final float[] m69892e(int i) {
        float[] fArr;
        int height = getHeight() / 2;
        if (i != 2) {
            float f = height;
            fArr = new float[]{f, f, f, f, f, f, f, f};
        } else {
            float f2 = height;
            fArr = new float[]{f2, f2, f2, f2, 0.0f, 0.0f, f2, f2};
        }
        this.f45493f.put(i, fArr);
        return fArr;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f45491d) {
            m69891d();
        }
        m69888a(canvas);
        m69889b(canvas);
    }

    public void setProgress(int i) {
        if (i == this.f45492e) {
            return;
        }
        this.f45492e = i;
        postInvalidate();
    }

    public CountdownGiftProgressView(Context context) {
        super(context);
        this.f45488a = 1;
        this.f45491d = false;
        this.f45492e = 0;
        this.f45493f = new SparseArray<>();
    }
}
