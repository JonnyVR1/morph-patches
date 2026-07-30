package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public class kce extends Drawable {

    /* JADX INFO: renamed from: m */
    public static final float f122314m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a */
    public final Paint f122315a;

    /* JADX INFO: renamed from: b */
    public float f122316b;

    /* JADX INFO: renamed from: c */
    public float f122317c;

    /* JADX INFO: renamed from: d */
    public float f122318d;

    /* JADX INFO: renamed from: e */
    public float f122319e;

    /* JADX INFO: renamed from: f */
    public boolean f122320f;

    /* JADX INFO: renamed from: g */
    public final Path f122321g;

    /* JADX INFO: renamed from: h */
    public final int f122322h;

    /* JADX INFO: renamed from: i */
    public boolean f122323i;

    /* JADX INFO: renamed from: j */
    public float f122324j;

    /* JADX INFO: renamed from: k */
    public float f122325k;

    /* JADX INFO: renamed from: l */
    public int f122326l;

    public kce(Context context) {
        Paint paint = new Paint();
        this.f122315a = paint;
        this.f122321g = new Path();
        this.f122323i = false;
        this.f122326l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, aac0.f68389T0, n0c0.f136493B, p8c0.f147583b);
        m145374c(typedArrayObtainStyledAttributes.getColor(aac0.f68407X0, 0));
        m145373b(typedArrayObtainStyledAttributes.getDimension(aac0.f68425b1, 0.0f));
        m145377f(typedArrayObtainStyledAttributes.getBoolean(aac0.f68420a1, true));
        m145375d(Math.round(typedArrayObtainStyledAttributes.getDimension(aac0.f68415Z0, 0.0f)));
        this.f122322h = typedArrayObtainStyledAttributes.getDimensionPixelSize(aac0.f68411Y0, 0);
        this.f122317c = Math.round(typedArrayObtainStyledAttributes.getDimension(aac0.f68403W0, 0.0f));
        this.f122316b = Math.round(typedArrayObtainStyledAttributes.getDimension(aac0.f68394U0, 0.0f));
        this.f122318d = typedArrayObtainStyledAttributes.getDimension(aac0.f68399V0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static float m145372a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX INFO: renamed from: b */
    public void m145373b(float f) {
        if (this.f122315a.getStrokeWidth() != f) {
            this.f122315a.setStrokeWidth(f);
            this.f122325k = (float) (((double) (f / 2.0f)) * Math.cos(f122314m));
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m145374c(@ColorInt int i) {
        if (i != this.f122315a.getColor()) {
            this.f122315a.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m145375d(float f) {
        if (f != this.f122319e) {
            this.f122319e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f122326l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? kbe.m145272f(this) == 0 : kbe.m145272f(this) == 1))) {
            z = true;
        }
        float f = this.f122316b;
        float fM145372a = m145372a(this.f122317c, (float) Math.sqrt(f * f * 2.0f), this.f122324j);
        float fM145372a2 = m145372a(this.f122317c, this.f122318d, this.f122324j);
        float fRound = Math.round(m145372a(0.0f, this.f122325k, this.f122324j));
        float fM145372a3 = m145372a(0.0f, f122314m, this.f122324j);
        float fM145372a4 = m145372a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f122324j);
        double d = fM145372a;
        double d2 = fM145372a3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.f122321g.rewind();
        float fM145372a5 = m145372a(this.f122319e + this.f122315a.getStrokeWidth(), -this.f122325k, this.f122324j);
        float f2 = (-fM145372a2) / 2.0f;
        this.f122321g.moveTo(f2 + fRound, 0.0f);
        this.f122321g.rLineTo(fM145372a2 - (fRound * 2.0f), 0.0f);
        this.f122321g.moveTo(f2, fM145372a5);
        this.f122321g.rLineTo(fRound2, fRound3);
        this.f122321g.moveTo(f2, -fM145372a5);
        this.f122321g.rLineTo(fRound2, -fRound3);
        this.f122321g.close();
        canvas.save();
        float strokeWidth = this.f122315a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f3 = this.f122319e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f3 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f3);
        if (this.f122320f) {
            canvas.rotate(fM145372a4 * (this.f122323i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f122321g, this.f122315a);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m145376e(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        if (this.f122324j != f) {
            this.f122324j = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m145377f(boolean z) {
        if (this.f122320f != z) {
            this.f122320f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f122322h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f122322h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f122315a.getAlpha()) {
            this.f122315a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f122315a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
