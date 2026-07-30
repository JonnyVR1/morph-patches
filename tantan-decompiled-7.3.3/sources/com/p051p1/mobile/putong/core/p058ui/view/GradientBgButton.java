package com.p051p1.mobile.putong.core.p058ui.view;

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
import p153l.ohc0;
import p153l.qa00;
import p153l.u1l0;

/* JADX INFO: loaded from: classes12.dex */
public class GradientBgButton extends ShadowButton {

    /* JADX INFO: renamed from: A */
    public int f37592A;

    /* JADX INFO: renamed from: B */
    public int f37593B;

    /* JADX INFO: renamed from: C */
    public int f37594C;

    /* JADX INFO: renamed from: D */
    public double f37595D;

    /* JADX INFO: renamed from: E */
    public double f37596E;

    /* JADX INFO: renamed from: F */
    public boolean f37597F;

    /* JADX INFO: renamed from: G */
    public Rect f37598G;

    /* JADX INFO: renamed from: H */
    public String f37599H;

    /* JADX INFO: renamed from: I */
    public int f37600I;

    /* JADX INFO: renamed from: J */
    public float f37601J;

    /* JADX INFO: renamed from: K */
    public Paint f37602K;

    /* JADX INFO: renamed from: L */
    public Pair<int[], float[]> f37603L;

    /* JADX INFO: renamed from: w */
    public int f37604w;

    /* JADX INFO: renamed from: x */
    public int f37605x;

    /* JADX INFO: renamed from: y */
    public int f37606y;

    /* JADX INFO: renamed from: z */
    public int f37607z;

    public GradientBgButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57294e(context, attributeSet);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.ShadowButton
    /* JADX INFO: renamed from: c */
    public void mo57293c(Canvas canvas, float f) {
        LinearGradient linearGradient;
        if (this.f37597F) {
            return;
        }
        float f2 = f / (this.f37573a.f37753c / 2.0f);
        this.f37708j.setColor(this.f37701c);
        double d = f;
        double d2 = this.f37595D;
        this.f37607z = (int) ((d * d2) + d);
        double d3 = this.f37596E;
        this.f37593B = (int) (d - (d * d3));
        this.f37592A = (int) (d - (d2 * d));
        this.f37594C = (int) (d + (d3 * d));
        if (this.f37603L == null) {
            linearGradient = new LinearGradient(this.f37607z, this.f37593B, this.f37592A, this.f37594C, this.f37604w, this.f37605x, Shader.TileMode.CLAMP);
        } else {
            float f3 = this.f37607z;
            float f4 = this.f37593B;
            float f5 = this.f37592A;
            float f6 = this.f37594C;
            Pair<int[], float[]> pair = this.f37603L;
            linearGradient = new LinearGradient(f3, f4, f5, f6, (int[]) pair.first, (float[]) pair.second, Shader.TileMode.CLAMP);
        }
        this.f37708j.setShader(linearGradient);
        m57295g(canvas, f, f2);
        if (!NullChecker.m82486a(this.f37710l)) {
            if (TextUtils.isEmpty(this.f37599H)) {
                return;
            }
            canvas.drawText(this.f37599H, canvas.getWidth() / 2, (int) ((canvas.getHeight() / 2) - ((this.f37602K.descent() + this.f37602K.ascent()) / 2.0f)), this.f37602K);
            return;
        }
        Drawable drawable = this.f37710l;
        Bitmap bitmapM57297i = ((drawable instanceof VectorDrawable) || (drawable instanceof u1l0)) ? m57297i(drawable, (int) this.f37705g, (int) this.f37706h) : ((BitmapDrawable) drawable).getBitmap();
        float f7 = this.f37711m;
        float f8 = f7 - ((this.f37705g / 2.0f) * f2);
        float f9 = f7 - ((this.f37706h / 2.0f) * f2);
        if (f8 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        if (this.f37598G == null) {
            this.f37598G = new Rect();
        }
        this.f37598G.set((int) f8, (int) f9, (int) (f8 + (this.f37705g * f2)), (int) (f9 + (this.f37706h * f2)));
        canvas.drawBitmap(bitmapM57297i, (Rect) null, this.f37598G, this.f37708j);
    }

    /* JADX INFO: renamed from: e */
    public final void m57294e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147394f0);
        this.f37604w = typedArrayObtainStyledAttributes.getColor(ohc0.f147406l0, -1);
        this.f37605x = typedArrayObtainStyledAttributes.getColor(ohc0.f147404k0, -65536);
        this.f37606y = typedArrayObtainStyledAttributes.getInt(ohc0.f147402j0, 0);
        this.f37597F = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147414p0, false);
        this.f37599H = typedArrayObtainStyledAttributes.getString(ohc0.f147408m0);
        this.f37600I = typedArrayObtainStyledAttributes.getColor(ohc0.f147410n0, -1);
        this.f37601J = typedArrayObtainStyledAttributes.getDimension(ohc0.f147412o0, isInEditMode() ? context.getResources().getDisplayMetrics().density * 24.0f : qa00.m175861f(24));
        typedArrayObtainStyledAttributes.recycle();
        this.f37595D = Math.sin(this.f37606y);
        this.f37596E = Math.cos(this.f37606y);
        Paint paint = new Paint();
        this.f37602K = paint;
        paint.setAntiAlias(true);
        this.f37602K.setStyle(Paint.Style.FILL);
        this.f37602K.setColor(this.f37600I);
        this.f37602K.setTextSize(this.f37601J);
        this.f37602K.setTextAlign(Paint.Align.CENTER);
        if (isInEditMode()) {
            return;
        }
        this.f37602K.setTypeface(lyh0.m156283c(3));
    }

    /* JADX INFO: renamed from: g */
    public void m57295g(Canvas canvas, float f, float f2) {
        m57296h(canvas, f, f2);
    }

    /* JADX INFO: renamed from: h */
    public void m57296h(Canvas canvas, float f, float f2) {
        if (this.f37713o) {
            Paint paint = this.f37708j;
            float f3 = this.f37707i;
            paint.setShadowLayer(f3, 0.0f, f3, m57349a(this.f37702d, f2));
            float f4 = this.f37711m;
            canvas.drawCircle(f4, f4, f, this.f37708j);
            this.f37708j.setShadowLayer(this.f37707i, 0.0f, 0.0f, m57349a(this.f37703e, f2));
        }
        float f5 = this.f37711m;
        canvas.drawCircle(f5, f5, f, this.f37708j);
        this.f37708j.clearShadowLayer();
    }

    /* JADX INFO: renamed from: i */
    public final Bitmap m57297i(Drawable drawable, int i, int i2) {
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
        this.f37606y = i;
        double d = i;
        this.f37595D = Math.sin(d);
        this.f37596E = Math.cos(d);
    }

    public void setButtonColorAngleD(double d) {
        this.f37595D = Math.sin(d);
        this.f37596E = Math.cos(d);
    }

    public void setButtonColorEnd(int i) {
        this.f37605x = i;
        this.f37603L = null;
    }

    public void setButtonColorStart(int i) {
        this.f37604w = i;
        this.f37603L = null;
    }

    public void setCenterText(String str) {
        this.f37599H = str;
    }

    public void setEmpty(boolean z) {
        this.f37597F = z;
    }

    public GradientBgButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57294e(context, attributeSet);
    }
}
