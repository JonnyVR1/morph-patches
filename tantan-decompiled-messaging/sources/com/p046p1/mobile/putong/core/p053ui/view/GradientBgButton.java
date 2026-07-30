package com.p046p1.mobile.putong.core.p053ui.view;

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
import p149l.eqh0;
import p149l.i9c0;
import p149l.osk0;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class GradientBgButton extends ShadowButton {

    /* JADX INFO: renamed from: A */
    public int f36744A;

    /* JADX INFO: renamed from: B */
    public int f36745B;

    /* JADX INFO: renamed from: C */
    public int f36746C;

    /* JADX INFO: renamed from: D */
    public double f36747D;

    /* JADX INFO: renamed from: E */
    public double f36748E;

    /* JADX INFO: renamed from: F */
    public boolean f36749F;

    /* JADX INFO: renamed from: G */
    public Rect f36750G;

    /* JADX INFO: renamed from: H */
    public String f36751H;

    /* JADX INFO: renamed from: I */
    public int f36752I;

    /* JADX INFO: renamed from: J */
    public float f36753J;

    /* JADX INFO: renamed from: K */
    public Paint f36754K;

    /* JADX INFO: renamed from: L */
    public Pair<int[], float[]> f36755L;

    /* JADX INFO: renamed from: w */
    public int f36756w;

    /* JADX INFO: renamed from: x */
    public int f36757x;

    /* JADX INFO: renamed from: y */
    public int f36758y;

    /* JADX INFO: renamed from: z */
    public int f36759z;

    public GradientBgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m56111e(context, attributeSet);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.ShadowButton
    /* JADX INFO: renamed from: c */
    public void mo56110c(Canvas canvas, float f) {
        LinearGradient linearGradient;
        if (this.f36749F) {
            return;
        }
        float f2 = f / (this.f36725a.f36905c / 2.0f);
        this.f36860j.setColor(this.f36853c);
        double d = f;
        double d2 = this.f36747D;
        this.f36759z = (int) ((d * d2) + d);
        double d3 = this.f36748E;
        this.f36745B = (int) (d - (d * d3));
        this.f36744A = (int) (d - (d2 * d));
        this.f36746C = (int) (d + (d3 * d));
        if (this.f36755L == null) {
            linearGradient = new LinearGradient(this.f36759z, this.f36745B, this.f36744A, this.f36746C, this.f36756w, this.f36757x, Shader.TileMode.CLAMP);
        } else {
            float f3 = this.f36759z;
            float f4 = this.f36745B;
            float f5 = this.f36744A;
            float f6 = this.f36746C;
            Pair<int[], float[]> pair = this.f36755L;
            linearGradient = new LinearGradient(f3, f4, f5, f6, (int[]) pair.first, (float[]) pair.second, Shader.TileMode.CLAMP);
        }
        this.f36860j.setShader(linearGradient);
        m56112g(canvas, f, f2);
        if (!NullChecker.m81303a(this.f36862l)) {
            if (TextUtils.isEmpty(this.f36751H)) {
                return;
            }
            canvas.drawText(this.f36751H, canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((this.f36754K.descent() + this.f36754K.ascent()) / 2.0f)), this.f36754K);
            return;
        }
        Drawable drawable = this.f36862l;
        Bitmap bitmapM56114i = ((drawable instanceof VectorDrawable) || (drawable instanceof osk0)) ? m56114i(drawable, (int) this.f36857g, (int) this.f36858h) : ((BitmapDrawable) drawable).getBitmap();
        float f7 = this.f36863m;
        float f8 = f7 - ((this.f36857g / 2.0f) * f2);
        float f9 = f7 - ((this.f36858h / 2.0f) * f2);
        if (f8 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        if (this.f36750G == null) {
            this.f36750G = new Rect();
        }
        this.f36750G.set((int) f8, (int) f9, (int) (f8 + (this.f36857g * f2)), (int) (f9 + (this.f36858h * f2)));
        canvas.drawBitmap(bitmapM56114i, (Rect) null, this.f36750G, this.f36860j);
    }

    /* JADX INFO: renamed from: e */
    public final void m56111e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f112169f0);
        this.f36756w = typedArrayObtainStyledAttributes.getColor(i9c0.f112181l0, -1);
        this.f36757x = typedArrayObtainStyledAttributes.getColor(i9c0.f112179k0, -65536);
        this.f36758y = typedArrayObtainStyledAttributes.getInt(i9c0.f112177j0, 0);
        this.f36749F = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112189p0, false);
        this.f36751H = typedArrayObtainStyledAttributes.getString(i9c0.f112183m0);
        this.f36752I = typedArrayObtainStyledAttributes.getColor(i9c0.f112185n0, -1);
        this.f36753J = typedArrayObtainStyledAttributes.getDimension(i9c0.f112187o0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 24.0f : t100.m186892f(24));
        typedArrayObtainStyledAttributes.recycle();
        this.f36747D = Math.sin(this.f36758y);
        this.f36748E = Math.cos(this.f36758y);
        Paint paint = new Paint();
        this.f36754K = paint;
        paint.setAntiAlias(true);
        this.f36754K.setStyle(Paint.Style.FILL);
        this.f36754K.setColor(this.f36752I);
        this.f36754K.setTextSize(this.f36753J);
        this.f36754K.setTextAlign(Paint.Align.CENTER);
        if (isInEditMode()) {
            return;
        }
        this.f36754K.setTypeface(eqh0.m117752c(3));
    }

    /* JADX INFO: renamed from: g */
    public void m56112g(Canvas canvas, float f, float f2) {
        m56113h(canvas, f, f2);
    }

    /* JADX INFO: renamed from: h */
    public void m56113h(Canvas canvas, float f, float f2) {
        if (this.f36865o) {
            Paint paint = this.f36860j;
            float f3 = this.f36859i;
            paint.setShadowLayer(f3, 0.0f, f3, m56166a(this.f36854d, f2));
            float f4 = this.f36863m;
            canvas.drawCircle(f4, f4, f, this.f36860j);
            this.f36860j.setShadowLayer(this.f36859i, 0.0f, 0.0f, m56166a(this.f36855e, f2));
        }
        float f5 = this.f36863m;
        canvas.drawCircle(f5, f5, f, this.f36860j);
        this.f36860j.clearShadowLayer();
    }

    /* JADX INFO: renamed from: i */
    public final Bitmap m56114i(Drawable drawable, int i, int i2) {
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
        this.f36758y = i;
        double d = i;
        this.f36747D = Math.sin(d);
        this.f36748E = Math.cos(d);
    }

    public void setButtonColorAngleD(double d) {
        this.f36747D = Math.sin(d);
        this.f36748E = Math.cos(d);
    }

    public void setButtonColorEnd(int i) {
        this.f36757x = i;
        this.f36755L = null;
    }

    public void setButtonColorStart(int i) {
        this.f36756w = i;
        this.f36755L = null;
    }

    public void setCenterText(String str) {
        this.f36751H = str;
    }

    public void setEmpty(boolean z) {
        this.f36749F = z;
    }

    public GradientBgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m56111e(context, attributeSet);
    }
}
