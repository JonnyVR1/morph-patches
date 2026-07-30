package p153l;

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
public class ode extends Drawable {

    /* JADX INFO: renamed from: m */
    public static final float f146888m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a */
    public final Paint f146889a;

    /* JADX INFO: renamed from: b */
    public float f146890b;

    /* JADX INFO: renamed from: c */
    public float f146891c;

    /* JADX INFO: renamed from: d */
    public float f146892d;

    /* JADX INFO: renamed from: e */
    public float f146893e;

    /* JADX INFO: renamed from: f */
    public boolean f146894f;

    /* JADX INFO: renamed from: g */
    public final Path f146895g;

    /* JADX INFO: renamed from: h */
    public final int f146896h;

    /* JADX INFO: renamed from: i */
    public boolean f146897i;

    /* JADX INFO: renamed from: j */
    public float f146898j;

    /* JADX INFO: renamed from: k */
    public float f146899k;

    /* JADX INFO: renamed from: l */
    public int f146900l;

    public ode(Context context) {
        Paint paint = new Paint();
        this.f146889a = paint;
        this.f146895g = new Path();
        this.f146897i = false;
        this.f146900l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, gic0.f104315T0, s8c0.f166765B, ugc0.f178881b);
        m167289c(typedArrayObtainStyledAttributes.getColor(gic0.f104333X0, 0));
        m167288b(typedArrayObtainStyledAttributes.getDimension(gic0.f104351b1, 0.0f));
        m167292f(typedArrayObtainStyledAttributes.getBoolean(gic0.f104346a1, true));
        m167290d(Math.round(typedArrayObtainStyledAttributes.getDimension(gic0.f104341Z0, 0.0f)));
        this.f146896h = typedArrayObtainStyledAttributes.getDimensionPixelSize(gic0.f104337Y0, 0);
        this.f146891c = Math.round(typedArrayObtainStyledAttributes.getDimension(gic0.f104329W0, 0.0f));
        this.f146890b = Math.round(typedArrayObtainStyledAttributes.getDimension(gic0.f104320U0, 0.0f));
        this.f146892d = typedArrayObtainStyledAttributes.getDimension(gic0.f104325V0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static float m167287a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX INFO: renamed from: b */
    public void m167288b(float f) {
        if (this.f146889a.getStrokeWidth() != f) {
            this.f146889a.setStrokeWidth(f);
            this.f146899k = (float) (((double) (f / 2.0f)) * Math.cos(f146888m));
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m167289c(@ColorInt int i) {
        if (i != this.f146889a.getColor()) {
            this.f146889a.setColor(i);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m167290d(float f) {
        if (f != this.f146893e) {
            this.f146893e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f146900l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? oce.m167166f(this) == 0 : oce.m167166f(this) == 1))) {
            z = true;
        }
        float f = this.f146890b;
        float fM167287a = m167287a(this.f146891c, (float) Math.sqrt(f * f * 2.0f), this.f146898j);
        float fM167287a2 = m167287a(this.f146891c, this.f146892d, this.f146898j);
        float fRound = Math.round(m167287a(0.0f, this.f146899k, this.f146898j));
        float fM167287a3 = m167287a(0.0f, f146888m, this.f146898j);
        float fM167287a4 = m167287a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f146898j);
        double d = fM167287a;
        double d2 = fM167287a3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.f146895g.rewind();
        float fM167287a5 = m167287a(this.f146893e + this.f146889a.getStrokeWidth(), -this.f146899k, this.f146898j);
        float f2 = (-fM167287a2) / 2.0f;
        this.f146895g.moveTo(f2 + fRound, 0.0f);
        this.f146895g.rLineTo(fM167287a2 - (fRound * 2.0f), 0.0f);
        this.f146895g.moveTo(f2, fM167287a5);
        this.f146895g.rLineTo(fRound2, fRound3);
        this.f146895g.moveTo(f2, -fM167287a5);
        this.f146895g.rLineTo(fRound2, -fRound3);
        this.f146895g.close();
        canvas.save();
        float strokeWidth = this.f146889a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f3 = this.f146893e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f3 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f3);
        if (this.f146894f) {
            canvas.rotate(fM167287a4 * (this.f146897i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f146895g, this.f146889a);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m167291e(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        if (this.f146898j != f) {
            this.f146898j = f;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m167292f(boolean z) {
        if (this.f146894f != z) {
            this.f146894f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f146896h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f146896h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f146889a.getAlpha()) {
            this.f146889a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f146889a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
