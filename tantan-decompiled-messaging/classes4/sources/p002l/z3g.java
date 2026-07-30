package p002l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import l.imf0;
import l.kvc0;
import l.t0g0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z3g extends imf0 implements Animatable {

    /* JADX INFO: renamed from: q */
    public static final int[] f23210q = {Color.parseColor("#00ffffff"), Color.parseColor("#55ffffff"), Color.parseColor("#00ffffff")};

    /* JADX INFO: renamed from: r */
    public static final float[] f23211r = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: s */
    public static final int f23212s;

    /* JADX INFO: renamed from: t */
    public static final int f23213t;

    /* JADX INFO: renamed from: u */
    public static final int f23214u;

    /* JADX INFO: renamed from: a */
    public final Paint f23215a;

    /* JADX INFO: renamed from: b */
    public final RectF f23216b;

    /* JADX INFO: renamed from: c */
    public final Path f23217c;

    /* JADX INFO: renamed from: d */
    public final Path f23218d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f23219e;

    /* JADX INFO: renamed from: f */
    public LinearGradient f23220f;

    /* JADX INFO: renamed from: g */
    public LinearGradient f23221g;

    /* JADX INFO: renamed from: h */
    public boolean f23222h;

    /* JADX INFO: renamed from: i */
    public ColorMatrix f23223i;

    /* JADX INFO: renamed from: j */
    public C0934a f23224j;

    /* JADX INFO: renamed from: k */
    public String f23225k;

    /* JADX INFO: renamed from: l */
    public float f23226l;

    /* JADX INFO: renamed from: m */
    public boolean f23227m;

    /* JADX INFO: renamed from: n */
    public Rect f23228n;

    /* JADX INFO: renamed from: o */
    public int f23229o;

    /* JADX INFO: renamed from: p */
    public Paint f23230p;

    static {
        int i = t100.o;
        f23212s = i;
        f23213t = i / 3;
        f23214u = -t100.c;
    }

    public z3g(nvp nvpVar, Bitmap bitmap) {
        this.f23215a = new Paint(7);
        this.f23216b = new RectF();
        this.f23217c = new Path();
        this.f23218d = new Path();
        this.f23224j = new C0934a(nvpVar, bitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f23223i = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(nvpVar.m19113h(), "gray") ? 0.0f : 1.0f);
        this.f23230p = m27050b(this.f23224j.f23235e.m19111f());
        this.f23224j.f23231a.setColorFilter(new ColorMatrixColorFilter(this.f23223i));
        this.f23224j.f23233c.setColorFilter(new ColorMatrixColorFilter(this.f23223i));
        this.f23224j.f23232b.setColorFilter(new ColorMatrixColorFilter(this.f23223i));
    }

    /* JADX INFO: renamed from: b */
    public static Paint m27050b(int i) {
        Paint paint = new Paint(7);
        paint.setColor(-1);
        paint.setLetterSpacing(0.05f);
        paint.setTextSize(i * 0.57f);
        return paint;
    }

    /* JADX INFO: renamed from: g */
    public static String m27051g(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            i = t0g0.h(cCharAt) ? i + 2 : i + 1;
            if (i > 24) {
                return sb.toString();
            }
            sb.append(cCharAt);
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* JADX INFO: renamed from: h */
    public static int m27052h(Paint paint, String str, int i) {
        if (paint == null) {
            paint = m27050b(i);
        }
        return ((int) paint.measureText(str)) + ((int) (i * 1.5f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public int m27053a() {
        int i = this.f23229o;
        return i == 0 ? getBounds().width() : i;
    }

    /* JADX INFO: renamed from: c */
    public final void m27054c(Canvas canvas, Rect rect) {
        float fD = t100.d(8.0f);
        int iD = t100.d(2.0f);
        float f = rect.left + iD;
        float f2 = rect.top;
        int i = rect.bottom;
        canvas.drawRoundRect(f, f2 + (i * 0.0f), rect.right, i * 1.0f, fD, fD, this.f23224j.f23232b);
        this.f23218d.reset();
        Path path = this.f23218d;
        float f3 = rect.left + iD;
        float f4 = rect.top;
        int i2 = rect.bottom;
        path.addRoundRect(f3, f4 + (i2 * 0.0f), rect.right, i2 * 1.0f, fD, fD, Path.Direction.CCW);
        if (this.f23224j.m27062b() == 0 || this.f23224j.m27061a() == 0) {
            return;
        }
        this.f23224j.f23233c.setStrokeWidth(rect.bottom / 20.0f);
        float f5 = rect.left + 2 + iD;
        float f6 = rect.top;
        int i3 = rect.bottom;
        canvas.drawRoundRect(f5, f6 + (i3 * 0.0f) + 2.0f, rect.right - 2, (i3 * 1.0f) - 2.0f, fD, fD, this.f23224j.f23233c);
    }

    /* JADX INFO: renamed from: d */
    public final void m27055d(Canvas canvas, Rect rect) {
        this.f23216b.left = ((rect.width() * 10) * m27056e()) - rect.width();
        RectF rectF = this.f23216b;
        rectF.right = rectF.left + f23212s;
        rectF.top = 0.0f;
        rectF.bottom = rect.height();
        Objects.toString(this.f23216b);
        this.f23217c.reset();
        Path path = this.f23217c;
        RectF rectF2 = this.f23216b;
        path.moveTo(rectF2.left, rectF2.top);
        Path path2 = this.f23217c;
        RectF rectF3 = this.f23216b;
        path2.lineTo(rectF3.right, rectF3.top);
        Path path3 = this.f23217c;
        RectF rectF4 = this.f23216b;
        float f = rectF4.right;
        int i = f23213t;
        path3.lineTo(f - i, rectF4.bottom);
        Path path4 = this.f23217c;
        RectF rectF5 = this.f23216b;
        path4.lineTo(rectF5.left - i, rectF5.bottom);
        Path path5 = this.f23217c;
        RectF rectF6 = this.f23216b;
        path5.lineTo(rectF6.left, rectF6.top);
        this.f23217c.op(this.f23218d, Path.Op.INTERSECT);
        canvas.drawPath(this.f23217c, this.f23215a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f23224j.f23234d;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        m27054c(canvas, bounds);
        if (this.f23228n == null) {
            this.f23228n = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        this.f23228n.set(0, 0, (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight), iHeight);
        canvas.save();
        if (this.f23222h) {
            m27055d(canvas, bounds);
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f23228n, this.f23224j.f23231a);
        canvas.restore();
        canvas.drawText(this.f23225k, 0.0f + (this.f23228n.width() * 1.1f), this.f23226l, this.f23230p);
    }

    /* JADX INFO: renamed from: e */
    public float m27056e() {
        return ((System.currentTimeMillis() % 5000) * 1.0f) / 5000.0f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m27057f() {
        return this.f23222h;
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f23224j;
    }

    public int getOpacity() {
        Bitmap bitmap = this.f23224j.f23234d;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f23224j.f23231a.getAlpha() < 255) ? -3 : -1;
    }

    public float getRatio() {
        return 3.5714285f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m27058i(boolean z) {
        this.f23222h = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m27059j(String str) {
        this.f23225k = m27051g(str);
        Paint paintM27050b = m27050b(this.f23224j.f23235e.m19111f());
        this.f23230p = paintM27050b;
        int iM27052h = m27052h(paintM27050b, str, this.f23224j.f23235e.m19111f());
        this.f23229o = iM27052h;
        setBounds(0, 0, iM27052h, this.f23224j.f23235e.m19111f());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m27060k(int i) {
        nvp nvpVar;
        C0934a c0934a = this.f23224j;
        if (c0934a == null || (nvpVar = c0934a.f23235e) == null) {
            return;
        }
        nvpVar.m19120o(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Drawable mutate() {
        if (!this.f23227m && super/*android.graphics.drawable.Drawable*/.mutate() == this) {
            this.f23224j = new C0934a(this.f23224j);
            this.f23227m = true;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBoundsChange(Rect rect) {
        Paint.FontMetrics fontMetrics = this.f23230p.getFontMetrics();
        this.f23226l = ((this.f23224j.f23235e.m19111f() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        int iM27052h = m27052h(this.f23230p, this.f23225k, this.f23224j.f23235e.m19111f());
        this.f23229o = iM27052h;
        setBounds(0, 0, iM27052h, this.f23224j.f23235e.m19111f());
        if (this.f23219e == null && rect.right > 0) {
            LinearGradient linearGradient = new LinearGradient(rect.left, 0.0f, rect.right, (f23212s * f23213t) / rect.bottom, f23210q, f23211r, Shader.TileMode.CLAMP);
            this.f23219e = linearGradient;
            this.f23215a.setShader(linearGradient);
        }
        if (this.f23220f == null && rect.bottom > 0) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, rect.bottom, this.f23224j.m27064d(), this.f23224j.m27063c(), Shader.TileMode.CLAMP);
            this.f23220f = linearGradient2;
            this.f23224j.f23232b.setShader(linearGradient2);
        }
        if (this.f23221g != null || rect.right <= 0) {
            return;
        }
        LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f23224j.m27062b(), this.f23224j.m27061a(), Shader.TileMode.CLAMP);
        this.f23221g = linearGradient3;
        this.f23224j.f23233c.setShader(linearGradient3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAlpha(int i) {
        if (i != this.f23224j.f23231a.getAlpha()) {
            this.f23224j.f23231a.setAlpha(i);
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f23224j.f23231a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.z3g$a */
    public static final class C0934a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f23231a;

        /* JADX INFO: renamed from: b */
        public final Paint f23232b;

        /* JADX INFO: renamed from: c */
        public final Paint f23233c;

        /* JADX INFO: renamed from: d */
        public Bitmap f23234d;

        /* JADX INFO: renamed from: e */
        public nvp f23235e;

        public C0934a(nvp nvpVar, Bitmap bitmap) {
            this.f23235e = nvpVar;
            this.f23234d = bitmap;
            this.f23231a = new Paint(7);
            this.f23232b = new Paint(7);
            Paint paint = new Paint(7);
            this.f23233c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(t100.d(2.0f));
        }

        /* JADX INFO: renamed from: a */
        public int m27061a() {
            return kvc0.h(this.f23235e.m19106a(), 0);
        }

        /* JADX INFO: renamed from: b */
        public int m27062b() {
            return kvc0.h(this.f23235e.m19106a(), 0);
        }

        /* JADX INFO: renamed from: c */
        public int m27063c() {
            return kvc0.g(this.f23235e.m19109d());
        }

        /* JADX INFO: renamed from: d */
        public int m27064d() {
            return kvc0.g(this.f23235e.m19114i());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new z3g(this);
        }

        public C0934a(C0934a c0934a) {
            this.f23235e = c0934a.f23235e;
            this.f23234d = c0934a.f23234d;
            this.f23231a = new Paint(c0934a.f23231a);
            this.f23232b = new Paint(c0934a.f23232b);
            this.f23233c = new Paint(c0934a.f23233c);
        }
    }

    public z3g(C0934a c0934a) {
        this.f23215a = new Paint(7);
        this.f23216b = new RectF();
        this.f23217c = new Path();
        this.f23218d = new Path();
        this.f23224j = c0934a;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f23223i = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(c0934a.f23235e.m19113h(), "gray") ? 0.0f : 1.0f);
        this.f23230p = m27050b(this.f23224j.f23235e.m19111f());
        this.f23224j.f23231a.setColorFilter(new ColorMatrixColorFilter(this.f23223i));
        this.f23224j.f23233c.setColorFilter(new ColorMatrixColorFilter(this.f23223i));
        this.f23224j.f23232b.setColorFilter(new ColorMatrixColorFilter(this.f23223i));
    }
}
