package com.p046p1.mobile.putong.live.base.view;

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
import p149l.n9c0;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 19)
public class CountdownGiftProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f44640a;

    /* JADX INFO: renamed from: b */
    public Paint f44641b;

    /* JADX INFO: renamed from: c */
    public Paint f44642c;

    /* JADX INFO: renamed from: d */
    public boolean f44643d;

    /* JADX INFO: renamed from: e */
    public int f44644e;

    /* JADX INFO: renamed from: f */
    public SparseArray<float[]> f44645f;

    public CountdownGiftProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44640a = 1;
        this.f44643d = false;
        this.f44644e = 0;
        this.f44645f = new SparseArray<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137785y);
        this.f44640a = typedArrayObtainStyledAttributes.getInt(n9c0.f137786z, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private Path getCurrentProgressPath() {
        Path path = new Path();
        path.addRect(new RectF(getLeft(), getTop(), getLeft() + ((int) (getWidth() * (this.f44644e / 100.0f))), getBottom()), Path.Direction.CW);
        return path;
    }

    private Path getExactlyPath() {
        Path path = new Path();
        path.addRoundRect(getRectWhole(), m68707c(this.f44640a), Path.Direction.CW);
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
    public final void m68705a(Canvas canvas) {
        canvas.drawPath(getExactlyPath(), this.f44642c);
    }

    /* JADX INFO: renamed from: b */
    public final void m68706b(Canvas canvas) {
        Path finalPath = getFinalPath();
        finalPath.op(getCurrentProgressPath(), Path.Op.INTERSECT);
        canvas.drawPath(finalPath, this.f44641b);
    }

    /* JADX INFO: renamed from: c */
    public final float[] m68707c(int i) {
        float[] fArr = this.f44645f.get(i);
        return fArr == null ? m68709e(i) : fArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m68708d() {
        this.f44643d = true;
        float width = getWidth();
        int color = Color.parseColor("#667A3DD2");
        int color2 = Color.parseColor("#66C56CD7");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, width, 0.0f, color, color2, tileMode);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, Color.parseColor("#7A3DD2"), Color.parseColor("#C56CD7"), tileMode);
        Paint paint = new Paint();
        this.f44641b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f44641b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f44641b.setShader(linearGradient2);
        Paint paint3 = new Paint();
        this.f44642c = paint3;
        paint3.setAntiAlias(true);
        this.f44642c.setStyle(style);
        this.f44642c.setShader(linearGradient);
    }

    /* JADX INFO: renamed from: e */
    public final float[] m68709e(int i) {
        float[] fArr;
        int height = getHeight() / 2;
        if (i != 2) {
            float f = height;
            fArr = new float[]{f, f, f, f, f, f, f, f};
        } else {
            float f2 = height;
            fArr = new float[]{f2, f2, f2, f2, 0.0f, 0.0f, f2, f2};
        }
        this.f44645f.put(i, fArr);
        return fArr;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.f44643d) {
            m68708d();
        }
        m68705a(canvas);
        m68706b(canvas);
    }

    public void setProgress(int i) {
        if (i == this.f44644e) {
            return;
        }
        this.f44644e = i;
        postInvalidate();
    }

    public CountdownGiftProgressView(Context context) {
        super(context);
        this.f44640a = 1;
        this.f44643d = false;
        this.f44644e = 0;
        this.f44645f = new SparseArray<>();
    }
}
