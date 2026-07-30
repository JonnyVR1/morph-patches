package com.p046p1.mobile.putong.core.p053ui;

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
import p149l.osk0;
import p149l.r9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes6.dex */
public class GradientBgButton extends ShadowButton {

    /* JADX INFO: renamed from: A */
    public int f27973A;

    /* JADX INFO: renamed from: B */
    public int f27974B;

    /* JADX INFO: renamed from: C */
    public int f27975C;

    /* JADX INFO: renamed from: D */
    public int f27976D;

    /* JADX INFO: renamed from: E */
    public double f27977E;

    /* JADX INFO: renamed from: F */
    public double f27978F;

    /* JADX INFO: renamed from: G */
    public boolean f27979G;

    /* JADX INFO: renamed from: H */
    public Rect f27980H;

    /* JADX INFO: renamed from: I */
    public String f27981I;

    /* JADX INFO: renamed from: J */
    public int f27982J;

    /* JADX INFO: renamed from: K */
    public float f27983K;

    /* JADX INFO: renamed from: L */
    public Paint f27984L;

    /* JADX INFO: renamed from: M */
    public Pair<int[], float[]> f27985M;

    /* JADX INFO: renamed from: x */
    public int f27986x;

    /* JADX INFO: renamed from: y */
    public int f27987y;

    /* JADX INFO: renamed from: z */
    public int f27988z;

    public GradientBgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43894f(context, attributeSet);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.ShadowButton
    /* JADX INFO: renamed from: d */
    public void mo43893d(Canvas canvas, float f) {
        LinearGradient linearGradient;
        if (this.f27979G) {
            return;
        }
        float f2 = f / (this.f27971a.f28189c / 2.0f);
        this.f28156j.setColor(this.f28149c);
        double d = f;
        double d2 = this.f27977E;
        this.f27973A = (int) ((d * d2) + d);
        double d3 = this.f27978F;
        this.f27975C = (int) (d - (d * d3));
        this.f27974B = (int) (d - (d2 * d));
        this.f27976D = (int) (d + (d3 * d));
        if (this.f27985M == null) {
            linearGradient = new LinearGradient(this.f27973A, this.f27975C, this.f27974B, this.f27976D, this.f27986x, this.f27987y, Shader.TileMode.CLAMP);
        } else {
            float f3 = this.f27973A;
            float f4 = this.f27975C;
            float f5 = this.f27974B;
            float f6 = this.f27976D;
            Pair<int[], float[]> pair = this.f27985M;
            linearGradient = new LinearGradient(f3, f4, f5, f6, (int[]) pair.first, (float[]) pair.second, Shader.TileMode.CLAMP);
        }
        this.f28156j.setShader(linearGradient);
        mo43895h(canvas, f, f2);
        if (!NullChecker.m81303a(this.f28158l)) {
            if (TextUtils.isEmpty(this.f27981I)) {
                return;
            }
            canvas.drawText(this.f27981I, canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((this.f27984L.descent() + this.f27984L.ascent()) / 2.0f)), this.f27984L);
            return;
        }
        Drawable drawable = this.f28158l;
        Bitmap bitmapM43898k = ((drawable instanceof VectorDrawable) || (drawable instanceof osk0)) ? m43898k(drawable, (int) this.f28153g, (int) this.f28154h) : ((BitmapDrawable) drawable).getBitmap();
        float f7 = this.f28159m;
        float f8 = f7 - ((this.f28153g / 2.0f) * f2);
        float f9 = f7 - ((this.f28154h / 2.0f) * f2);
        if (f8 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        if (this.f27980H == null) {
            this.f27980H = new Rect();
        }
        this.f27980H.set((int) f8, (int) f9, (int) (f8 + (this.f28153g * f2)), (int) (f9 + (this.f28154h * f2)));
        canvas.drawBitmap(bitmapM43898k, (Rect) null, this.f27980H, this.f28156j);
    }

    /* JADX INFO: renamed from: f */
    public final void m43894f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158303K);
        this.f27986x = typedArrayObtainStyledAttributes.getColor(r9c0.f158309Q, -1);
        this.f27987y = typedArrayObtainStyledAttributes.getColor(r9c0.f158308P, -65536);
        this.f27988z = typedArrayObtainStyledAttributes.getInt(r9c0.f158307O, 0);
        this.f27979G = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158314V, false);
        this.f27981I = typedArrayObtainStyledAttributes.getString(r9c0.f158311S);
        this.f27982J = typedArrayObtainStyledAttributes.getColor(r9c0.f158312T, -1);
        this.f27983K = typedArrayObtainStyledAttributes.getDimension(r9c0.f158313U, isInEditMode() ? context.getResources().getDisplayMetrics().density * 24.0f : t100.m186892f(24));
        typedArrayObtainStyledAttributes.recycle();
        this.f27977E = Math.sin(this.f27988z);
        this.f27978F = Math.cos(this.f27988z);
        Paint paint = new Paint();
        this.f27984L = paint;
        paint.setAntiAlias(true);
        this.f27984L.setStyle(Paint.Style.FILL);
        this.f27984L.setColor(this.f27982J);
        this.f27984L.setTextSize(this.f27983K);
        this.f27984L.setTextAlign(Paint.Align.CENTER);
        if (isInEditMode()) {
            return;
        }
        this.f27984L.setTypeface(eqh0.m117752c(3));
    }

    /* JADX INFO: renamed from: h */
    public void mo43895h(Canvas canvas, float f, float f2) {
        m43897j(canvas, f, f2);
    }

    /* JADX INFO: renamed from: i */
    public void m43896i(Canvas canvas, float f, float f2) {
        Shader shader = this.f28156j.getShader();
        this.f28156j.setShader(null);
        if (this.f28161o) {
            Paint paint = this.f28156j;
            float f3 = this.f28155i;
            paint.setShadowLayer(f3, 0.0f, f3, m44064b(this.f28150d, f2));
            float f4 = this.f28159m;
            canvas.drawCircle(f4, f4, f, this.f28156j);
            this.f28156j.setShadowLayer(this.f28155i, 0.0f, 0.0f, m44064b(this.f28151e, f2));
            float f5 = this.f28159m;
            canvas.drawCircle(f5, f5, f, this.f28156j);
            this.f28156j.clearShadowLayer();
        }
        this.f28156j.setShader(shader);
        float f6 = this.f28159m;
        canvas.drawCircle(f6, f6, f, this.f28156j);
    }

    /* JADX INFO: renamed from: j */
    public void m43897j(Canvas canvas, float f, float f2) {
        if (this.f28161o) {
            Paint paint = this.f28156j;
            float f3 = this.f28155i;
            paint.setShadowLayer(f3, 0.0f, f3, m44064b(this.f28150d, f2));
            float f4 = this.f28159m;
            canvas.drawCircle(f4, f4, f, this.f28156j);
            this.f28156j.setShadowLayer(this.f28155i, 0.0f, 0.0f, m44064b(this.f28151e, f2));
        }
        float f5 = this.f28159m;
        canvas.drawCircle(f5, f5, f, this.f28156j);
        this.f28156j.clearShadowLayer();
    }

    /* JADX INFO: renamed from: k */
    public final Bitmap m43898k(Drawable drawable, int i, int i2) {
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
        this.f27988z = i;
        double d = i;
        this.f27977E = Math.sin(d);
        this.f27978F = Math.cos(d);
    }

    public void setButtonColorAngleD(double d) {
        this.f27977E = Math.sin(d);
        this.f27978F = Math.cos(d);
    }

    public void setButtonColorEnd(int i) {
        this.f27987y = i;
        this.f27985M = null;
    }

    public void setButtonColorStart(int i) {
        this.f27986x = i;
        this.f27985M = null;
    }

    public void setCenterText(String str) {
        this.f27981I = str;
    }

    public void setEmpty(boolean z) {
        this.f27979G = z;
    }

    public GradientBgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43894f(context, attributeSet);
    }
}
