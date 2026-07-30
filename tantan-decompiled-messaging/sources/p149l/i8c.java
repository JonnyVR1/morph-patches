package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.BigEyeFilter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i8c extends Drawable implements wgm {

    /* JADX INFO: renamed from: a */
    public String f112003a;

    /* JADX INFO: renamed from: b */
    public String f112004b;

    /* JADX INFO: renamed from: c */
    public int f112005c;

    /* JADX INFO: renamed from: d */
    public int f112006d;

    /* JADX INFO: renamed from: e */
    public int f112007e;

    /* JADX INFO: renamed from: f */
    public String f112008f;

    /* JADX INFO: renamed from: g */
    public ftd0 f112009g;

    /* JADX INFO: renamed from: i */
    public int f112011i;

    /* JADX INFO: renamed from: j */
    public int f112012j;

    /* JADX INFO: renamed from: p */
    public int f112018p;

    /* JADX INFO: renamed from: q */
    public int f112019q;

    /* JADX INFO: renamed from: r */
    public int f112020r;

    /* JADX INFO: renamed from: s */
    public int f112021s;

    /* JADX INFO: renamed from: t */
    public int f112022t;

    /* JADX INFO: renamed from: u */
    public long f112023u;

    /* JADX INFO: renamed from: v */
    public String f112024v;

    /* JADX INFO: renamed from: h */
    public HashMap<String, String> f112010h = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public int f112013k = 80;

    /* JADX INFO: renamed from: l */
    public final Paint f112014l = new Paint(1);

    /* JADX INFO: renamed from: m */
    public final Matrix f112015m = new Matrix();

    /* JADX INFO: renamed from: n */
    public final Rect f112016n = new Rect();

    /* JADX INFO: renamed from: o */
    public final RectF f112017o = new RectF();

    /* JADX INFO: renamed from: w */
    public int f112025w = -1;

    /* JADX INFO: renamed from: x */
    public int f112026x = 0;

    public i8c() {
        m134969i();
    }

    /* JADX INFO: renamed from: g */
    public static String m134961g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    @Override // p149l.wgm
    /* JADX INFO: renamed from: a */
    public void mo134962a(long j) {
        this.f112023u = j;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public void m134963b(String str, String str2) {
        this.f112010h.put(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m134964c(Canvas canvas, String str, Object obj) {
        m134966e(canvas, str, String.valueOf(obj), -1);
    }

    /* JADX INFO: renamed from: d */
    public final void m134965d(Canvas canvas, String str, String str2) {
        m134966e(canvas, str, str2, -1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f112014l.setStyle(Paint.Style.STROKE);
        this.f112014l.setStrokeWidth(2.0f);
        this.f112014l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f112014l);
        Paint paint = this.f112014l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f112014l.setColor(this.f112026x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f112014l);
        this.f112014l.setStyle(style);
        this.f112014l.setStrokeWidth(0.0f);
        this.f112014l.setColor(-1);
        this.f112021s = this.f112018p;
        this.f112022t = this.f112019q;
        String str = this.f112004b;
        String str2 = this.f112003a;
        if (str != null) {
            m134965d(canvas, "IDs", m134961g("%s, %s", str2, str));
        } else {
            m134965d(canvas, "ID", str2);
        }
        m134965d(canvas, "D", m134961g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            m134964c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        m134966e(canvas, "I", m134961g("%dx%d", Integer.valueOf(this.f112005c), Integer.valueOf(this.f112006d)), m134967f(this.f112005c, this.f112006d, this.f112009g));
        int i = this.f112006d;
        if (i > 0) {
            m134964c(canvas, "IAR", Float.valueOf(this.f112005c / i));
        }
        m134965d(canvas, "I", m134961g("%d KiB", Integer.valueOf(this.f112007e / 1024)));
        String str3 = this.f112008f;
        if (str3 != null) {
            m134965d(canvas, "i format", str3);
        }
        int i2 = this.f112011i;
        if (i2 > 0) {
            m134965d(canvas, "anim", m134961g("f %d, l %d", Integer.valueOf(i2), Integer.valueOf(this.f112012j)));
        }
        ftd0 ftd0Var = this.f112009g;
        if (ftd0Var != null) {
            m134964c(canvas, BigEyeFilter.UNIFORM_SCALE, ftd0Var);
        }
        long j = this.f112023u;
        if (j >= 0) {
            m134965d(canvas, Constants.KEY_T, m134961g("%d ms", Long.valueOf(j)));
        }
        String str4 = this.f112024v;
        if (str4 != null) {
            m134966e(canvas, "origin", str4, this.f112025w);
        }
        for (Map.Entry<String, String> entry : this.f112010h.entrySet()) {
            m134965d(canvas, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m134966e(Canvas canvas, String str, String str2, int i) {
        String str3 = str + ": ";
        float fMeasureText = this.f112014l.measureText(str3);
        float fMeasureText2 = this.f112014l.measureText(str2);
        this.f112014l.setColor(1711276032);
        int i2 = this.f112021s;
        int i3 = this.f112022t;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + fMeasureText + fMeasureText2 + 4.0f, i3 + this.f112020r + 8, this.f112014l);
        this.f112014l.setColor(-1);
        canvas.drawText(str3, this.f112021s, this.f112022t, this.f112014l);
        this.f112014l.setColor(i);
        canvas.drawText(str2, this.f112021s + fMeasureText, this.f112022t, this.f112014l);
        this.f112022t += this.f112020r;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public int m134967f(int i, int i2, ftd0 ftd0Var) {
        int i3;
        int i4;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i > 0 && i2 > 0) {
            if (ftd0Var != null) {
                Rect rect = this.f112016n;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f112015m.reset();
                i3 = i;
                i4 = i2;
                ftd0Var.mo118081a(this.f112015m, this.f112016n, i3, i4, 0.0f, 0.0f);
                RectF rectF = this.f112017o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i3;
                rectF.bottom = i4;
                this.f112015m.mapRect(rectF);
                int iWidth2 = (int) this.f112017o.width();
                int iHeight2 = (int) this.f112017o.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i3 = i;
                i4 = i2;
            }
            float f = iWidth;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = iHeight;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int iAbs = Math.abs(i3 - iWidth);
            int iAbs2 = Math.abs(i4 - iHeight);
            float f7 = iAbs;
            if (f7 < f2 && iAbs2 < f5) {
                return -16711936;
            }
            if (f7 < f3 && iAbs2 < f6) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m134968h(Rect rect, int i, int i2) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f112014l.setTextSize(iMin);
        int i3 = iMin + 8;
        this.f112020r = i3;
        int i4 = this.f112013k;
        if (i4 == 80) {
            this.f112020r = i3 * (-1);
        }
        this.f112018p = rect.left + 10;
        this.f112019q = i4 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    /* JADX INFO: renamed from: i */
    public void m134969i() {
        this.f112005c = -1;
        this.f112006d = -1;
        this.f112007e = -1;
        this.f112010h = new HashMap<>();
        this.f112011i = -1;
        this.f112012j = -1;
        this.f112008f = null;
        m134970j(null);
        this.f112023u = -1L;
        this.f112024v = null;
        this.f112025w = -1;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: j */
    public void m134970j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f112003a = str;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m134971k(int i, int i2) {
        this.f112005c = i;
        this.f112006d = i2;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m134972l(int i) {
        this.f112007e = i;
    }

    /* JADX INFO: renamed from: m */
    public void m134973m(ftd0 ftd0Var) {
        this.f112009g = ftd0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m134968h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
