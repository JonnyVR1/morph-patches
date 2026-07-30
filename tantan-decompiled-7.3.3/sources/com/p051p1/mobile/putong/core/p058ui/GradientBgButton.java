package com.p051p1.mobile.putong.core.p058ui;

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
import p153l.lyh0;
import p153l.qa00;
import p153l.u1l0;
import p153l.xhc0;

/* JADX INFO: loaded from: classes6.dex */
public class GradientBgButton extends ShadowButton {

    /* JADX INFO: renamed from: A */
    public int f28821A;

    /* JADX INFO: renamed from: B */
    public int f28822B;

    /* JADX INFO: renamed from: C */
    public int f28823C;

    /* JADX INFO: renamed from: D */
    public int f28824D;

    /* JADX INFO: renamed from: E */
    public double f28825E;

    /* JADX INFO: renamed from: F */
    public double f28826F;

    /* JADX INFO: renamed from: G */
    public boolean f28827G;

    /* JADX INFO: renamed from: H */
    public Rect f28828H;

    /* JADX INFO: renamed from: I */
    public String f28829I;

    /* JADX INFO: renamed from: J */
    public int f28830J;

    /* JADX INFO: renamed from: K */
    public float f28831K;

    /* JADX INFO: renamed from: L */
    public Paint f28832L;

    /* JADX INFO: renamed from: M */
    public Pair<int[], float[]> f28833M;

    /* JADX INFO: renamed from: x */
    public int f28834x;

    /* JADX INFO: renamed from: y */
    public int f28835y;

    /* JADX INFO: renamed from: z */
    public int f28836z;

    public GradientBgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m45080f(context, attributeSet);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.ShadowButton
    /* JADX INFO: renamed from: d */
    public void mo45079d(Canvas canvas, float f) {
        LinearGradient linearGradient;
        if (this.f28827G) {
            return;
        }
        float f2 = f / (this.f28819a.f29037c / 2.0f);
        this.f29004j.setColor(this.f28997c);
        double d = f;
        double d2 = this.f28825E;
        this.f28821A = (int) ((d * d2) + d);
        double d3 = this.f28826F;
        this.f28823C = (int) (d - (d * d3));
        this.f28822B = (int) (d - (d2 * d));
        this.f28824D = (int) (d + (d3 * d));
        if (this.f28833M == null) {
            linearGradient = new LinearGradient(this.f28821A, this.f28823C, this.f28822B, this.f28824D, this.f28834x, this.f28835y, Shader.TileMode.CLAMP);
        } else {
            float f3 = this.f28821A;
            float f4 = this.f28823C;
            float f5 = this.f28822B;
            float f6 = this.f28824D;
            Pair<int[], float[]> pair = this.f28833M;
            linearGradient = new LinearGradient(f3, f4, f5, f6, (int[]) pair.first, (float[]) pair.second, Shader.TileMode.CLAMP);
        }
        this.f29004j.setShader(linearGradient);
        mo45081h(canvas, f, f2);
        if (!NullChecker.m82486a(this.f29006l)) {
            if (TextUtils.isEmpty(this.f28829I)) {
                return;
            }
            canvas.drawText(this.f28829I, canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((this.f28832L.descent() + this.f28832L.ascent()) / 2.0f)), this.f28832L);
            return;
        }
        Drawable drawable = this.f29006l;
        Bitmap bitmapM45084k = ((drawable instanceof VectorDrawable) || (drawable instanceof u1l0)) ? m45084k(drawable, (int) this.f29001g, (int) this.f29002h) : ((BitmapDrawable) drawable).getBitmap();
        float f7 = this.f29007m;
        float f8 = f7 - ((this.f29001g / 2.0f) * f2);
        float f9 = f7 - ((this.f29002h / 2.0f) * f2);
        if (f8 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        if (this.f28828H == null) {
            this.f28828H = new Rect();
        }
        this.f28828H.set((int) f8, (int) f9, (int) (f8 + (this.f29001g * f2)), (int) (f9 + (this.f29002h * f2)));
        canvas.drawBitmap(bitmapM45084k, (Rect) null, this.f28828H, this.f29004j);
    }

    /* JADX INFO: renamed from: f */
    public final void m45080f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194303K);
        this.f28834x = typedArrayObtainStyledAttributes.getColor(xhc0.f194309Q, -1);
        this.f28835y = typedArrayObtainStyledAttributes.getColor(xhc0.f194308P, -65536);
        this.f28836z = typedArrayObtainStyledAttributes.getInt(xhc0.f194307O, 0);
        this.f28827G = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194314V, false);
        this.f28829I = typedArrayObtainStyledAttributes.getString(xhc0.f194311S);
        this.f28830J = typedArrayObtainStyledAttributes.getColor(xhc0.f194312T, -1);
        this.f28831K = typedArrayObtainStyledAttributes.getDimension(xhc0.f194313U, isInEditMode() ? context.getResources().getDisplayMetrics().density * 24.0f : qa00.m175861f(24));
        typedArrayObtainStyledAttributes.recycle();
        this.f28825E = Math.sin(this.f28836z);
        this.f28826F = Math.cos(this.f28836z);
        Paint paint = new Paint();
        this.f28832L = paint;
        paint.setAntiAlias(true);
        this.f28832L.setStyle(Paint.Style.FILL);
        this.f28832L.setColor(this.f28830J);
        this.f28832L.setTextSize(this.f28831K);
        this.f28832L.setTextAlign(Paint.Align.CENTER);
        if (isInEditMode()) {
            return;
        }
        this.f28832L.setTypeface(lyh0.m156283c(3));
    }

    /* JADX INFO: renamed from: h */
    public void mo45081h(Canvas canvas, float f, float f2) {
        m45083j(canvas, f, f2);
    }

    /* JADX INFO: renamed from: i */
    public void m45082i(Canvas canvas, float f, float f2) {
        Shader shader = this.f29004j.getShader();
        this.f29004j.setShader(null);
        if (this.f29009o) {
            Paint paint = this.f29004j;
            float f3 = this.f29003i;
            paint.setShadowLayer(f3, 0.0f, f3, m45247b(this.f28998d, f2));
            float f4 = this.f29007m;
            canvas.drawCircle(f4, f4, f, this.f29004j);
            this.f29004j.setShadowLayer(this.f29003i, 0.0f, 0.0f, m45247b(this.f28999e, f2));
            float f5 = this.f29007m;
            canvas.drawCircle(f5, f5, f, this.f29004j);
            this.f29004j.clearShadowLayer();
        }
        this.f29004j.setShader(shader);
        float f6 = this.f29007m;
        canvas.drawCircle(f6, f6, f, this.f29004j);
    }

    /* JADX INFO: renamed from: j */
    public void m45083j(Canvas canvas, float f, float f2) {
        if (this.f29009o) {
            Paint paint = this.f29004j;
            float f3 = this.f29003i;
            paint.setShadowLayer(f3, 0.0f, f3, m45247b(this.f28998d, f2));
            float f4 = this.f29007m;
            canvas.drawCircle(f4, f4, f, this.f29004j);
            this.f29004j.setShadowLayer(this.f29003i, 0.0f, 0.0f, m45247b(this.f28999e, f2));
        }
        float f5 = this.f29007m;
        canvas.drawCircle(f5, f5, f, this.f29004j);
        this.f29004j.clearShadowLayer();
    }

    /* JADX INFO: renamed from: k */
    public final Bitmap m45084k(Drawable drawable, int i, int i2) {
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
        this.f28836z = i;
        double d = i;
        this.f28825E = Math.sin(d);
        this.f28826F = Math.cos(d);
    }

    public void setButtonColorAngleD(double d) {
        this.f28825E = Math.sin(d);
        this.f28826F = Math.cos(d);
    }

    public void setButtonColorEnd(int i) {
        this.f28835y = i;
        this.f28833M = null;
    }

    public void setButtonColorStart(int i) {
        this.f28834x = i;
        this.f28833M = null;
    }

    public void setCenterText(String str) {
        this.f28829I = str;
    }

    public void setEmpty(boolean z) {
        this.f28827G = z;
    }

    public GradientBgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45080f(context, attributeSet);
    }
}
