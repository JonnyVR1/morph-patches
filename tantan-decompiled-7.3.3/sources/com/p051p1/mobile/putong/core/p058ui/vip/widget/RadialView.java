package com.p051p1.mobile.putong.core.p058ui.vip.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.khc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class RadialView extends View {

    /* JADX INFO: renamed from: a */
    public RectF f38885a;

    /* JADX INFO: renamed from: b */
    public RectF f38886b;

    /* JADX INFO: renamed from: c */
    public float[] f38887c;

    /* JADX INFO: renamed from: d */
    public float[] f38888d;

    /* JADX INFO: renamed from: e */
    public float f38889e;

    /* JADX INFO: renamed from: f */
    public Paint f38890f;

    /* JADX INFO: renamed from: g */
    public int f38891g;

    /* JADX INFO: renamed from: h */
    public float f38892h;

    /* JADX INFO: renamed from: i */
    public int f38893i;

    /* JADX INFO: renamed from: j */
    public int f38894j;

    /* JADX INFO: renamed from: k */
    public float f38895k;

    /* JADX INFO: renamed from: l */
    public Drawable f38896l;

    /* JADX INFO: renamed from: m */
    public Path f38897m;

    /* JADX INFO: renamed from: n */
    public float f38898n;

    /* JADX INFO: renamed from: o */
    public int f38899o;

    /* JADX INFO: renamed from: p */
    public int f38900p;

    /* JADX INFO: renamed from: q */
    public float f38901q;

    /* JADX INFO: renamed from: r */
    public float f38902r;

    /* JADX INFO: renamed from: s */
    public AnimatorSet f38903s;

    public RadialView(Context context) {
        super(context);
        this.f38885a = new RectF();
        this.f38886b = new RectF();
        this.f38887c = new float[2];
        this.f38901q = 0.0f;
        this.f38902r = 0.0f;
        m58952b(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m58951a() {
        int i = this.f38891g;
        this.f38888d = new float[i];
        float f = 360 / i;
        float f2 = 0.4333f * f;
        this.f38889e = f2;
        float f3 = f2 / 2.0f;
        int i2 = 0;
        while (true) {
            float[] fArr = this.f38888d;
            if (i2 >= fArr.length) {
                return;
            }
            fArr[i2] = (i2 * f) - f3;
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58952b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126836r1);
        this.f38895k = typedArrayObtainStyledAttributes.getDimension(khc0.f126842t1, qa00.f156322i);
        this.f38896l = typedArrayObtainStyledAttributes.getDrawable(khc0.f126839s1);
        this.f38891g = typedArrayObtainStyledAttributes.getInt(khc0.f126845u1, 8);
        this.f38893i = typedArrayObtainStyledAttributes.getColor(khc0.f126851w1, Color.parseColor("#00ffffff"));
        this.f38894j = typedArrayObtainStyledAttributes.getColor(khc0.f126848v1, Color.parseColor("#22ffffff"));
        float f = typedArrayObtainStyledAttributes.getFloat(khc0.f126854x1, 0.5f);
        this.f38892h = typedArrayObtainStyledAttributes.getFloat(khc0.f126857y1, 0.618f);
        typedArrayObtainStyledAttributes.recycle();
        this.f38899o = getContext().getResources().getDisplayMetrics().widthPixels;
        int iM105590x0 = bnl0.m105590x0(getContext());
        this.f38900p = iM105590x0;
        int i = this.f38899o;
        float f2 = i * f * i * f;
        float f3 = this.f38892h;
        this.f38898n = (float) Math.sqrt(f2 + (iM105590x0 * f3 * iM105590x0 * f3));
        Paint paint = new Paint();
        this.f38890f = paint;
        paint.setColor(-1);
        this.f38890f.setStyle(Paint.Style.FILL);
        m58951a();
        if (this.f38896l == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f38896l = gradientDrawable;
            gradientDrawable.setGradientType(0);
            ((GradientDrawable) this.f38896l).setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        }
    }

    public float getRadiateTranslationY() {
        float f = this.f38887c[1];
        int i = this.f38900p;
        return (this.f38892h - (f / i)) * i;
    }

    @Keep
    public float getRotateAngle() {
        return this.f38901q;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!NullChecker.m82486a(this.f38903s) || this.f38903s.isRunning()) {
            return;
        }
        this.f38903s.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (NullChecker.m82486a(this.f38897m)) {
            canvas.clipPath(this.f38897m);
        }
        this.f38896l.draw(canvas);
        canvas.rotate(this.f38901q, this.f38885a.centerX(), this.f38885a.centerY() + this.f38902r);
        canvas.translate(0.0f, this.f38902r);
        for (float f : this.f38888d) {
            canvas.drawArc(this.f38885a, f, this.f38889e, true, this.f38890f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float[] fArr = this.f38887c;
        this.f38890f.setShader(new RadialGradient(fArr[0], fArr[1], this.f38898n, this.f38893i, this.f38894j, Shader.TileMode.CLAMP));
        RectF rectF = this.f38885a;
        float f = i >> 1;
        float f2 = this.f38898n;
        float f3 = f - f2;
        rectF.left = f3;
        float f4 = f + f2;
        rectF.right = f4;
        float f5 = i2 >> 1;
        float f6 = f5 - f2;
        rectF.top = f6;
        float f7 = f5 + f2;
        rectF.bottom = f7;
        this.f38896l.setBounds((int) f3, (int) f6, (int) f4, (int) f7);
        setVisualRect(new RectF(0.0f, 0.0f, i, i2));
    }

    @Keep
    public void setRotateAngle(float f) {
        if (this.f38901q != f) {
            this.f38901q = f;
            invalidate();
        }
    }

    public void setVisualRect(RectF rectF) {
        this.f38886b.set(rectF);
        Path path = this.f38897m;
        if (path == null) {
            this.f38897m = new Path();
        } else {
            path.reset();
        }
        Path path2 = this.f38897m;
        RectF rectF2 = this.f38886b;
        float f = this.f38895k;
        path2.addRoundRect(rectF2, f, f, Path.Direction.CW);
    }

    public RadialView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38885a = new RectF();
        this.f38886b = new RectF();
        this.f38887c = new float[2];
        this.f38901q = 0.0f;
        this.f38902r = 0.0f;
        m58952b(context, attributeSet);
    }

    public RadialView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38885a = new RectF();
        this.f38886b = new RectF();
        this.f38887c = new float[2];
        this.f38901q = 0.0f;
        this.f38902r = 0.0f;
        m58952b(context, attributeSet);
    }
}
