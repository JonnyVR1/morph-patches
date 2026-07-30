package p153l;

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
import com.clevertap.android.sdk.Constants;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class n5g extends ruf0 implements Animatable {

    /* JADX INFO: renamed from: q */
    public static final int[] f140332q = {Color.parseColor("#00ffffff"), Color.parseColor("#55ffffff"), Color.parseColor("#00ffffff")};

    /* JADX INFO: renamed from: r */
    public static final float[] f140333r = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: s */
    public static final int f140334s;

    /* JADX INFO: renamed from: t */
    public static final int f140335t;

    /* JADX INFO: renamed from: u */
    public static final int f140336u;

    /* JADX INFO: renamed from: a */
    public final Paint f140337a;

    /* JADX INFO: renamed from: b */
    public final RectF f140338b;

    /* JADX INFO: renamed from: c */
    public final Path f140339c;

    /* JADX INFO: renamed from: d */
    public final Path f140340d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f140341e;

    /* JADX INFO: renamed from: f */
    public LinearGradient f140342f;

    /* JADX INFO: renamed from: g */
    public LinearGradient f140343g;

    /* JADX INFO: renamed from: h */
    public boolean f140344h;

    /* JADX INFO: renamed from: i */
    public ColorMatrix f140345i;

    /* JADX INFO: renamed from: j */
    public C18804a f140346j;

    /* JADX INFO: renamed from: k */
    public String f140347k;

    /* JADX INFO: renamed from: l */
    public float f140348l;

    /* JADX INFO: renamed from: m */
    public boolean f140349m;

    /* JADX INFO: renamed from: n */
    public Rect f140350n;

    /* JADX INFO: renamed from: o */
    public int f140351o;

    /* JADX INFO: renamed from: p */
    public Paint f140352p;

    static {
        int i = qa00.f156328o;
        f140334s = i;
        f140335t = i / 3;
        f140336u = -qa00.f156316c;
    }

    public n5g(nxp nxpVar, Bitmap bitmap) {
        this.f140337a = new Paint(7);
        this.f140338b = new RectF();
        this.f140339c = new Path();
        this.f140340d = new Path();
        this.f140346j = new C18804a(nxpVar, bitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f140345i = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(nxpVar.m165214h(), "gray") ? 0.0f : 1.0f);
        this.f140352p = m161711b(this.f140346j.f140357e.m165212f());
        this.f140346j.f140353a.setColorFilter(new ColorMatrixColorFilter(this.f140345i));
        this.f140346j.f140355c.setColorFilter(new ColorMatrixColorFilter(this.f140345i));
        this.f140346j.f140354b.setColorFilter(new ColorMatrixColorFilter(this.f140345i));
    }

    /* JADX INFO: renamed from: b */
    public static Paint m161711b(int i) {
        Paint paint = new Paint(7);
        paint.setColor(-1);
        paint.setLetterSpacing(0.05f);
        paint.setTextSize(i * 0.57f);
        return paint;
    }

    /* JADX INFO: renamed from: g */
    public static String m161712g(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            i = a9g0.m96573h(cCharAt) ? i + 2 : i + 1;
            if (i > 24) {
                return sb.toString();
            }
            sb.append(cCharAt);
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* JADX INFO: renamed from: h */
    public static int m161713h(Paint paint, String str, int i) {
        if (paint == null) {
            paint = m161711b(i);
        }
        return ((int) paint.measureText(str)) + ((int) (i * 1.5f));
    }

    @Override // p153l.ruf0
    /* JADX INFO: renamed from: a */
    public int mo161714a() {
        int i = this.f140351o;
        return i == 0 ? getBounds().width() : i;
    }

    /* JADX INFO: renamed from: c */
    public final void m161715c(Canvas canvas, Rect rect) {
        float fM175859d = qa00.m175859d(8.0f);
        int iM175859d = qa00.m175859d(2.0f);
        float f = rect.left + iM175859d;
        float f2 = rect.top;
        int i = rect.bottom;
        canvas.drawRoundRect(f, f2 + (i * 0.0f), rect.right, i * 1.0f, fM175859d, fM175859d, this.f140346j.f140354b);
        this.f140340d.reset();
        Path path = this.f140340d;
        float f3 = rect.left + iM175859d;
        float f4 = rect.top;
        int i2 = rect.bottom;
        path.addRoundRect(f3, f4 + (i2 * 0.0f), rect.right, i2 * 1.0f, fM175859d, fM175859d, Path.Direction.CCW);
        if (this.f140346j.m161723b() == 0 || this.f140346j.m161722a() == 0) {
            return;
        }
        this.f140346j.f140355c.setStrokeWidth(rect.bottom / 20.0f);
        float f5 = rect.left + 2 + iM175859d;
        float f6 = rect.top;
        int i3 = rect.bottom;
        canvas.drawRoundRect(f5, f6 + (i3 * 0.0f) + 2.0f, rect.right - 2, (i3 * 1.0f) - 2.0f, fM175859d, fM175859d, this.f140346j.f140355c);
    }

    /* JADX INFO: renamed from: d */
    public final void m161716d(Canvas canvas, Rect rect) {
        this.f140338b.left = ((rect.width() * 10) * m161717e()) - rect.width();
        RectF rectF = this.f140338b;
        rectF.right = rectF.left + f140334s;
        rectF.top = 0.0f;
        rectF.bottom = rect.height();
        Objects.toString(this.f140338b);
        this.f140339c.reset();
        Path path = this.f140339c;
        RectF rectF2 = this.f140338b;
        path.moveTo(rectF2.left, rectF2.top);
        Path path2 = this.f140339c;
        RectF rectF3 = this.f140338b;
        path2.lineTo(rectF3.right, rectF3.top);
        Path path3 = this.f140339c;
        RectF rectF4 = this.f140338b;
        float f = rectF4.right;
        int i = f140335t;
        path3.lineTo(f - i, rectF4.bottom);
        Path path4 = this.f140339c;
        RectF rectF5 = this.f140338b;
        path4.lineTo(rectF5.left - i, rectF5.bottom);
        Path path5 = this.f140339c;
        RectF rectF6 = this.f140338b;
        path5.lineTo(rectF6.left, rectF6.top);
        this.f140339c.op(this.f140340d, Path.Op.INTERSECT);
        canvas.drawPath(this.f140339c, this.f140337a);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f140346j.f140356d;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        m161715c(canvas, bounds);
        if (this.f140350n == null) {
            this.f140350n = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        this.f140350n.set(0, 0, (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight), iHeight);
        canvas.save();
        if (this.f140344h) {
            m161716d(canvas, bounds);
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f140350n, this.f140346j.f140353a);
        canvas.restore();
        canvas.drawText(this.f140347k, 0.0f + (this.f140350n.width() * 1.1f), this.f140348l, this.f140352p);
    }

    /* JADX INFO: renamed from: e */
    public float m161717e() {
        return ((System.currentTimeMillis() % Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) * 1.0f) / 5000.0f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m161718f() {
        return this.f140344h;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f140346j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f140346j.f140356d;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f140346j.f140353a.getAlpha() < 255) ? -3 : -1;
    }

    @Override // p153l.a6m
    public float getRatio() {
        return 3.5714285f;
    }

    /* JADX INFO: renamed from: i */
    public void m161719i(boolean z) {
        this.f140344h = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m161720j(String str) {
        this.f140347k = m161712g(str);
        Paint paintM161711b = m161711b(this.f140346j.f140357e.m165212f());
        this.f140352p = paintM161711b;
        int iM161713h = m161713h(paintM161711b, str, this.f140346j.f140357e.m165212f());
        this.f140351o = iM161713h;
        setBounds(0, 0, iM161713h, this.f140346j.f140357e.m165212f());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m161721k(int i) {
        nxp nxpVar;
        C18804a c18804a = this.f140346j;
        if (c18804a == null || (nxpVar = c18804a.f140357e) == null) {
            return;
        }
        nxpVar.m165221o(i);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f140349m && super.mutate() == this) {
            this.f140346j = new C18804a(this.f140346j);
            this.f140349m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Paint.FontMetrics fontMetrics = this.f140352p.getFontMetrics();
        this.f140348l = ((this.f140346j.f140357e.m165212f() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        int iM161713h = m161713h(this.f140352p, this.f140347k, this.f140346j.f140357e.m165212f());
        this.f140351o = iM161713h;
        setBounds(0, 0, iM161713h, this.f140346j.f140357e.m165212f());
        if (this.f140341e == null && rect.right > 0) {
            LinearGradient linearGradient = new LinearGradient(rect.left, 0.0f, rect.right, (f140334s * f140335t) / rect.bottom, f140332q, f140333r, Shader.TileMode.CLAMP);
            this.f140341e = linearGradient;
            this.f140337a.setShader(linearGradient);
        }
        if (this.f140342f == null && rect.bottom > 0) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, rect.bottom, this.f140346j.m161725d(), this.f140346j.m161724c(), Shader.TileMode.CLAMP);
            this.f140342f = linearGradient2;
            this.f140346j.f140354b.setShader(linearGradient2);
        }
        if (this.f140343g != null || rect.right <= 0) {
            return;
        }
        LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f140346j.m161723b(), this.f140346j.m161722a(), Shader.TileMode.CLAMP);
        this.f140343g = linearGradient3;
        this.f140346j.f140355c.setShader(linearGradient3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f140346j.f140353a.getAlpha()) {
            this.f140346j.f140353a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f140346j.f140353a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.n5g$a */
    public static final class C18804a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f140353a;

        /* JADX INFO: renamed from: b */
        public final Paint f140354b;

        /* JADX INFO: renamed from: c */
        public final Paint f140355c;

        /* JADX INFO: renamed from: d */
        public Bitmap f140356d;

        /* JADX INFO: renamed from: e */
        public nxp f140357e;

        public C18804a(nxp nxpVar, Bitmap bitmap) {
            this.f140357e = nxpVar;
            this.f140356d = bitmap;
            this.f140353a = new Paint(7);
            this.f140354b = new Paint(7);
            Paint paint = new Paint(7);
            this.f140355c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(qa00.m175859d(2.0f));
        }

        /* JADX INFO: renamed from: a */
        public int m161722a() {
            return n3d0.m161284h(this.f140357e.m165207a(), 0);
        }

        /* JADX INFO: renamed from: b */
        public int m161723b() {
            return n3d0.m161284h(this.f140357e.m165207a(), 0);
        }

        /* JADX INFO: renamed from: c */
        public int m161724c() {
            return n3d0.m161283g(this.f140357e.m165210d());
        }

        /* JADX INFO: renamed from: d */
        public int m161725d() {
            return n3d0.m161283g(this.f140357e.m165215i());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new n5g(this);
        }

        public C18804a(C18804a c18804a) {
            this.f140357e = c18804a.f140357e;
            this.f140356d = c18804a.f140356d;
            this.f140353a = new Paint(c18804a.f140353a);
            this.f140354b = new Paint(c18804a.f140354b);
            this.f140355c = new Paint(c18804a.f140355c);
        }
    }

    public n5g(C18804a c18804a) {
        this.f140337a = new Paint(7);
        this.f140338b = new RectF();
        this.f140339c = new Path();
        this.f140340d = new Path();
        this.f140346j = c18804a;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f140345i = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(c18804a.f140357e.m165214h(), "gray") ? 0.0f : 1.0f);
        this.f140352p = m161711b(this.f140346j.f140357e.m165212f());
        this.f140346j.f140353a.setColorFilter(new ColorMatrixColorFilter(this.f140345i));
        this.f140346j.f140355c.setColorFilter(new ColorMatrixColorFilter(this.f140345i));
        this.f140346j.f140354b.setColorFilter(new ColorMatrixColorFilter(this.f140345i));
    }
}
