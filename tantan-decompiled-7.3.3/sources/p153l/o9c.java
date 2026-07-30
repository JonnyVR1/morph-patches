package p153l;

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
public class o9c extends Drawable implements zim {

    /* JADX INFO: renamed from: a */
    public String f145521a;

    /* JADX INFO: renamed from: b */
    public String f145522b;

    /* JADX INFO: renamed from: c */
    public int f145523c;

    /* JADX INFO: renamed from: d */
    public int f145524d;

    /* JADX INFO: renamed from: e */
    public int f145525e;

    /* JADX INFO: renamed from: f */
    public String f145526f;

    /* JADX INFO: renamed from: g */
    public h1e0 f145527g;

    /* JADX INFO: renamed from: i */
    public int f145529i;

    /* JADX INFO: renamed from: j */
    public int f145530j;

    /* JADX INFO: renamed from: p */
    public int f145536p;

    /* JADX INFO: renamed from: q */
    public int f145537q;

    /* JADX INFO: renamed from: r */
    public int f145538r;

    /* JADX INFO: renamed from: s */
    public int f145539s;

    /* JADX INFO: renamed from: t */
    public int f145540t;

    /* JADX INFO: renamed from: u */
    public long f145541u;

    /* JADX INFO: renamed from: v */
    public String f145542v;

    /* JADX INFO: renamed from: h */
    public HashMap<String, String> f145528h = new HashMap<>();

    /* JADX INFO: renamed from: k */
    public int f145531k = 80;

    /* JADX INFO: renamed from: l */
    public final Paint f145532l = new Paint(1);

    /* JADX INFO: renamed from: m */
    public final Matrix f145533m = new Matrix();

    /* JADX INFO: renamed from: n */
    public final Rect f145534n = new Rect();

    /* JADX INFO: renamed from: o */
    public final RectF f145535o = new RectF();

    /* JADX INFO: renamed from: w */
    public int f145543w = -1;

    /* JADX INFO: renamed from: x */
    public int f145544x = 0;

    public o9c() {
        m166699i();
    }

    /* JADX INFO: renamed from: g */
    public static String m166691g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    @Override // p153l.zim
    /* JADX INFO: renamed from: a */
    public void mo166692a(long j) {
        this.f145541u = j;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public void m166693b(String str, String str2) {
        this.f145528h.put(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m166694c(Canvas canvas, String str, Object obj) {
        m166696e(canvas, str, String.valueOf(obj), -1);
    }

    /* JADX INFO: renamed from: d */
    public final void m166695d(Canvas canvas, String str, String str2) {
        m166696e(canvas, str, str2, -1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f145532l.setStyle(Paint.Style.STROKE);
        this.f145532l.setStrokeWidth(2.0f);
        this.f145532l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f145532l);
        Paint paint = this.f145532l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f145532l.setColor(this.f145544x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f145532l);
        this.f145532l.setStyle(style);
        this.f145532l.setStrokeWidth(0.0f);
        this.f145532l.setColor(-1);
        this.f145539s = this.f145536p;
        this.f145540t = this.f145537q;
        String str = this.f145522b;
        String str2 = this.f145521a;
        if (str != null) {
            m166695d(canvas, "IDs", m166691g("%s, %s", str2, str));
        } else {
            m166695d(canvas, "ID", str2);
        }
        m166695d(canvas, "D", m166691g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            m166694c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        m166696e(canvas, "I", m166691g("%dx%d", Integer.valueOf(this.f145523c), Integer.valueOf(this.f145524d)), m166697f(this.f145523c, this.f145524d, this.f145527g));
        int i = this.f145524d;
        if (i > 0) {
            m166694c(canvas, "IAR", Float.valueOf(this.f145523c / i));
        }
        m166695d(canvas, "I", m166691g("%d KiB", Integer.valueOf(this.f145525e / 1024)));
        String str3 = this.f145526f;
        if (str3 != null) {
            m166695d(canvas, "i format", str3);
        }
        int i2 = this.f145529i;
        if (i2 > 0) {
            m166695d(canvas, "anim", m166691g("f %d, l %d", Integer.valueOf(i2), Integer.valueOf(this.f145530j)));
        }
        h1e0 h1e0Var = this.f145527g;
        if (h1e0Var != null) {
            m166694c(canvas, BigEyeFilter.UNIFORM_SCALE, h1e0Var);
        }
        long j = this.f145541u;
        if (j >= 0) {
            m166695d(canvas, Constants.KEY_T, m166691g("%d ms", Long.valueOf(j)));
        }
        String str4 = this.f145542v;
        if (str4 != null) {
            m166696e(canvas, "origin", str4, this.f145543w);
        }
        for (Map.Entry<String, String> entry : this.f145528h.entrySet()) {
            m166695d(canvas, entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m166696e(Canvas canvas, String str, String str2, int i) {
        String str3 = str + ": ";
        float fMeasureText = this.f145532l.measureText(str3);
        float fMeasureText2 = this.f145532l.measureText(str2);
        this.f145532l.setColor(1711276032);
        int i2 = this.f145539s;
        int i3 = this.f145540t;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + fMeasureText + fMeasureText2 + 4.0f, i3 + this.f145538r + 8, this.f145532l);
        this.f145532l.setColor(-1);
        canvas.drawText(str3, this.f145539s, this.f145540t, this.f145532l);
        this.f145532l.setColor(i);
        canvas.drawText(str2, this.f145539s + fMeasureText, this.f145540t, this.f145532l);
        this.f145540t += this.f145538r;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public int m166697f(int i, int i2, h1e0 h1e0Var) {
        int i3;
        int i4;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i > 0 && i2 > 0) {
            if (h1e0Var != null) {
                Rect rect = this.f145534n;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f145533m.reset();
                i3 = i;
                i4 = i2;
                h1e0Var.mo128503a(this.f145533m, this.f145534n, i3, i4, 0.0f, 0.0f);
                RectF rectF = this.f145535o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i3;
                rectF.bottom = i4;
                this.f145533m.mapRect(rectF);
                int iWidth2 = (int) this.f145535o.width();
                int iHeight2 = (int) this.f145535o.height();
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
    public final void m166698h(Rect rect, int i, int i2) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f145532l.setTextSize(iMin);
        int i3 = iMin + 8;
        this.f145538r = i3;
        int i4 = this.f145531k;
        if (i4 == 80) {
            this.f145538r = i3 * (-1);
        }
        this.f145536p = rect.left + 10;
        this.f145537q = i4 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    /* JADX INFO: renamed from: i */
    public void m166699i() {
        this.f145523c = -1;
        this.f145524d = -1;
        this.f145525e = -1;
        this.f145528h = new HashMap<>();
        this.f145529i = -1;
        this.f145530j = -1;
        this.f145526f = null;
        m166700j(null);
        this.f145541u = -1L;
        this.f145542v = null;
        this.f145543w = -1;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: j */
    public void m166700j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f145521a = str;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m166701k(int i, int i2) {
        this.f145523c = i;
        this.f145524d = i2;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m166702l(int i) {
        this.f145525e = i;
    }

    /* JADX INFO: renamed from: m */
    public void m166703m(h1e0 h1e0Var) {
        this.f145527g = h1e0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m166698h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
