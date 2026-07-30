package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.i9c0;
import l.osk0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class GradientBgButton extends ShadowButton {

    /* JADX INFO: renamed from: A */
    public int f6525A;

    /* JADX INFO: renamed from: B */
    public int f6526B;

    /* JADX INFO: renamed from: C */
    public int f6527C;

    /* JADX INFO: renamed from: D */
    public double f6528D;

    /* JADX INFO: renamed from: E */
    public double f6529E;

    /* JADX INFO: renamed from: F */
    public boolean f6530F;

    /* JADX INFO: renamed from: G */
    public Rect f6531G;

    /* JADX INFO: renamed from: H */
    public String f6532H;

    /* JADX INFO: renamed from: I */
    public int f6533I;

    /* JADX INFO: renamed from: J */
    public float f6534J;

    /* JADX INFO: renamed from: K */
    public Paint f6535K;

    /* JADX INFO: renamed from: L */
    public Pair<int[], float[]> f6536L;

    /* JADX INFO: renamed from: w */
    public int f6537w;

    /* JADX INFO: renamed from: x */
    public int f6538x;

    /* JADX INFO: renamed from: y */
    public int f6539y;

    /* JADX INFO: renamed from: z */
    public int f6540z;

    public GradientBgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9536e(context, attributeSet);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.ShadowButton
    /* JADX INFO: renamed from: c */
    public void mo9535c(Canvas canvas, float f) {
        LinearGradient linearGradient;
        if (this.f6530F) {
            return;
        }
        float f2 = f / (this.f6506a.f6686c / 2.0f);
        this.f6641j.setColor(this.f6634c);
        double d = f;
        double d2 = this.f6528D;
        this.f6540z = (int) ((d * d2) + d);
        double d3 = this.f6529E;
        this.f6526B = (int) (d - (d * d3));
        this.f6525A = (int) (d - (d2 * d));
        this.f6527C = (int) (d + (d3 * d));
        if (this.f6536L == null) {
            linearGradient = new LinearGradient(this.f6540z, this.f6526B, this.f6525A, this.f6527C, this.f6537w, this.f6538x, Shader.TileMode.CLAMP);
        } else {
            float f3 = this.f6540z;
            float f4 = this.f6526B;
            float f5 = this.f6525A;
            float f6 = this.f6527C;
            Pair<int[], float[]> pair = this.f6536L;
            linearGradient = new LinearGradient(f3, f4, f5, f6, (int[]) pair.first, (float[]) pair.second, Shader.TileMode.CLAMP);
        }
        this.f6641j.setShader(linearGradient);
        m9537g(canvas, f, f2);
        if (!NullChecker.a(this.f6643l)) {
            if (TextUtils.isEmpty(this.f6532H)) {
                return;
            }
            canvas.drawText(this.f6532H, canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((this.f6535K.descent() + this.f6535K.ascent()) / 2.0f)), this.f6535K);
            return;
        }
        Drawable drawable = this.f6643l;
        Bitmap bitmapM9539i = ((drawable instanceof VectorDrawable) || (drawable instanceof osk0)) ? m9539i(drawable, (int) this.f6638g, (int) this.f6639h) : ((BitmapDrawable) drawable).getBitmap();
        float f7 = this.f6644m;
        float f8 = f7 - ((this.f6638g / 2.0f) * f2);
        float f9 = f7 - ((this.f6639h / 2.0f) * f2);
        if (f8 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        if (this.f6531G == null) {
            this.f6531G = new Rect();
        }
        this.f6531G.set((int) f8, (int) f9, (int) (f8 + (this.f6638g * f2)), (int) (f9 + (this.f6639h * f2)));
        canvas.drawBitmap(bitmapM9539i, (Rect) null, this.f6531G, this.f6641j);
    }

    /* JADX INFO: renamed from: e */
    public final void m9536e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f0);
        this.f6537w = typedArrayObtainStyledAttributes.getColor(i9c0.l0, -1);
        this.f6538x = typedArrayObtainStyledAttributes.getColor(i9c0.k0, -65536);
        this.f6539y = typedArrayObtainStyledAttributes.getInt(i9c0.j0, 0);
        this.f6530F = typedArrayObtainStyledAttributes.getBoolean(i9c0.p0, false);
        this.f6532H = typedArrayObtainStyledAttributes.getString(i9c0.m0);
        this.f6533I = typedArrayObtainStyledAttributes.getColor(i9c0.n0, -1);
        this.f6534J = typedArrayObtainStyledAttributes.getDimension(i9c0.o0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 24.0f : t100.f(24));
        typedArrayObtainStyledAttributes.recycle();
        this.f6528D = Math.sin(this.f6539y);
        this.f6529E = Math.cos(this.f6539y);
        Paint paint = new Paint();
        this.f6535K = paint;
        paint.setAntiAlias(true);
        this.f6535K.setStyle(Paint.Style.FILL);
        this.f6535K.setColor(this.f6533I);
        this.f6535K.setTextSize(this.f6534J);
        this.f6535K.setTextAlign(Paint.Align.CENTER);
        if (isInEditMode()) {
            return;
        }
        this.f6535K.setTypeface(eqh0.c(3));
    }

    /* JADX INFO: renamed from: g */
    public void m9537g(Canvas canvas, float f, float f2) {
        m9538h(canvas, f, f2);
    }

    /* JADX INFO: renamed from: h */
    public void m9538h(Canvas canvas, float f, float f2) {
        if (this.f6646o) {
            Paint paint = this.f6641j;
            float f3 = this.f6640i;
            paint.setShadowLayer(f3, 0.0f, f3, m9593a(this.f6635d, f2));
            float f4 = this.f6644m;
            canvas.drawCircle(f4, f4, f, this.f6641j);
            this.f6641j.setShadowLayer(this.f6640i, 0.0f, 0.0f, m9593a(this.f6636e, f2));
        }
        float f5 = this.f6644m;
        canvas.drawCircle(f5, f5, f, this.f6641j);
        this.f6641j.clearShadowLayer();
    }

    /* JADX INFO: renamed from: i */
    public final Bitmap m9539i(Drawable drawable, int i, int i2) {
        if (i == 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public void setButtonColorAngle(int i) {
        this.f6539y = i;
        double d = i;
        this.f6528D = Math.sin(d);
        this.f6529E = Math.cos(d);
    }

    public void setButtonColorAngleD(double d) {
        this.f6528D = Math.sin(d);
        this.f6529E = Math.cos(d);
    }

    public void setButtonColorEnd(int i) {
        this.f6538x = i;
        this.f6536L = null;
    }

    public void setButtonColorStart(int i) {
        this.f6537w = i;
        this.f6536L = null;
    }

    public void setCenterText(String str) {
        this.f6532H = str;
    }

    public void setEmpty(boolean z) {
        this.f6530F = z;
    }

    public GradientBgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9536e(context, attributeSet);
    }
}
