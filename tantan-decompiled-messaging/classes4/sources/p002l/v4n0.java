package p002l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.imf0;
import l.kvc0;
import l.t0g0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v4n0 extends imf0 implements Animatable {

    /* JADX INFO: renamed from: i */
    public static final int f20957i = -t100.c;

    /* JADX INFO: renamed from: a */
    public ColorMatrix f20958a;

    /* JADX INFO: renamed from: b */
    public C0861a f20959b;

    /* JADX INFO: renamed from: c */
    public String f20960c;

    /* JADX INFO: renamed from: d */
    public float f20961d;

    /* JADX INFO: renamed from: e */
    public boolean f20962e;

    /* JADX INFO: renamed from: f */
    public Rect f20963f;

    /* JADX INFO: renamed from: g */
    public int f20964g;

    /* JADX INFO: renamed from: h */
    public Paint f20965h;

    public v4n0(nvp nvpVar, Bitmap bitmap) {
        this.f20959b = new C0861a(nvpVar, bitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f20958a = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(nvpVar.m19113h(), "gray") ? 0.0f : 1.0f);
        this.f20965h = m23742b(this.f20959b.f20970e.m19111f());
        this.f20959b.f20966a.setColorFilter(new ColorMatrixColorFilter(this.f20958a));
        this.f20959b.f20968c.setColorFilter(new ColorMatrixColorFilter(this.f20958a));
        this.f20959b.f20967b.setColorFilter(new ColorMatrixColorFilter(this.f20958a));
    }

    /* JADX INFO: renamed from: b */
    public static Paint m23742b(int i) {
        Paint paint = new Paint(7);
        paint.setColor(-1);
        paint.setLetterSpacing(0.05f);
        paint.setTextSize(i / 2.5f);
        return paint;
    }

    /* JADX INFO: renamed from: c */
    private void m23743c(Canvas canvas, Rect rect) {
        float f = rect.bottom / 5.0f;
        float f2 = rect.right;
        int iM23752d = this.f20959b.m23752d();
        int iM23751c = this.f20959b.m23751c();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f20959b.f20967b.setShader(new LinearGradient(0.0f, 0.0f, f2, 0.0f, iM23752d, iM23751c, tileMode));
        int i = (rect.bottom / 2) + (this.f20959b.f20970e.m19117l() ? 0 : f20957i);
        float f3 = rect.left + i;
        float f4 = rect.top;
        int i2 = rect.bottom;
        canvas.drawRoundRect(f3, (i2 * 0.16f) + f4, rect.right, i2 * 0.84f, f, f, this.f20959b.f20967b);
        if (this.f20959b.m23750b() == 0 || this.f20959b.m23749a() == 0) {
            return;
        }
        this.f20959b.f20968c.setShader(new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f20959b.m23750b(), this.f20959b.m23749a(), tileMode));
        int i3 = rect.bottom;
        int i4 = i3 / 40;
        this.f20959b.f20968c.setStrokeWidth(i3 / 20.0f);
        float f5 = rect.left + i4 + i;
        float f6 = rect.top;
        int i5 = rect.bottom;
        float f7 = i4;
        canvas.drawRoundRect(f5, f6 + (i5 * 0.16f) + f7, rect.right - i4, (i5 * 0.84f) - f7, f, f, this.f20959b.f20968c);
    }

    /* JADX INFO: renamed from: d */
    public static String m23744d(CharSequence charSequence) {
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

    /* JADX INFO: renamed from: e */
    public static int m23745e(Paint paint, String str, int i) {
        if (paint == null) {
            paint = m23742b(i);
        }
        return ((int) paint.measureText(str)) + ((int) (i * 1.5f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public int m23746a() {
        int i = this.f20964g;
        return i == 0 ? getBounds().width() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f20959b.f20969d;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        m23743c(canvas, bounds);
        if (this.f20963f == null) {
            this.f20963f = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        int width = (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight);
        int i = this.f20959b.f20970e.m19117l() ? 0 : f20957i;
        this.f20963f.set(i, 0, width + i, iHeight);
        canvas.save();
        canvas.drawBitmap(bitmap, (Rect) null, this.f20963f, this.f20959b.f20966a);
        canvas.restore();
        canvas.drawText(this.f20960c, i + (this.f20963f.bottom * 1.1f), this.f20961d, this.f20965h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m23747f(String str) {
        this.f20960c = m23744d(str);
        Paint paintM23742b = m23742b(this.f20959b.f20970e.m19111f());
        this.f20965h = paintM23742b;
        int iM23745e = m23745e(paintM23742b, str, this.f20959b.f20970e.m19111f());
        this.f20964g = iM23745e;
        setBounds(0, 0, iM23745e, this.f20959b.f20970e.m19111f());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m23748g(int i) {
        nvp nvpVar;
        C0861a c0861a = this.f20959b;
        if (c0861a == null || (nvpVar = c0861a.f20970e) == null) {
            return;
        }
        nvpVar.m19120o(i);
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f20959b;
    }

    public int getOpacity() {
        Bitmap bitmap = this.f20959b.f20969d;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f20959b.f20966a.getAlpha() < 255) ? -3 : -1;
    }

    public float getRatio() {
        return 3.5714285f;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public Drawable mutate() {
        if (!this.f20962e && super/*android.graphics.drawable.Drawable*/.mutate() == this) {
            this.f20959b = new C0861a(this.f20959b);
            this.f20962e = true;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBoundsChange(Rect rect) {
        Paint.FontMetrics fontMetrics = this.f20965h.getFontMetrics();
        this.f20961d = ((this.f20959b.f20970e.m19111f() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        int iM23745e = m23745e(this.f20965h, this.f20960c, this.f20959b.f20970e.m19111f());
        this.f20964g = iM23745e;
        setBounds(0, 0, iM23745e, this.f20959b.f20970e.m19111f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAlpha(int i) {
        if (i != this.f20959b.f20966a.getAlpha()) {
            this.f20959b.f20966a.setAlpha(i);
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f20959b.f20966a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.v4n0$a */
    public static final class C0861a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f20966a;

        /* JADX INFO: renamed from: b */
        public final Paint f20967b;

        /* JADX INFO: renamed from: c */
        public final Paint f20968c;

        /* JADX INFO: renamed from: d */
        public Bitmap f20969d;

        /* JADX INFO: renamed from: e */
        public nvp f20970e;

        public C0861a(nvp nvpVar, Bitmap bitmap) {
            this.f20970e = nvpVar;
            this.f20969d = bitmap;
            this.f20966a = new Paint(7);
            this.f20967b = new Paint(7);
            Paint paint = new Paint(7);
            this.f20968c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(t100.d(1.0f));
        }

        /* JADX INFO: renamed from: a */
        public int m23749a() {
            return kvc0.h(this.f20970e.m19107b(), 0);
        }

        /* JADX INFO: renamed from: b */
        public int m23750b() {
            return kvc0.h(this.f20970e.m19108c(), 0);
        }

        /* JADX INFO: renamed from: c */
        public int m23751c() {
            return kvc0.g(this.f20970e.m19109d());
        }

        /* JADX INFO: renamed from: d */
        public int m23752d() {
            return kvc0.g(this.f20970e.m19114i());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new v4n0(this);
        }

        public C0861a(C0861a c0861a) {
            this.f20970e = c0861a.f20970e;
            this.f20969d = c0861a.f20969d;
            this.f20966a = new Paint(c0861a.f20966a);
            this.f20967b = new Paint(c0861a.f20967b);
            this.f20968c = new Paint(c0861a.f20968c);
        }
    }

    public v4n0(C0861a c0861a) {
        this.f20959b = c0861a;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f20958a = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(c0861a.f20970e.m19113h(), "gray") ? 0.0f : 1.0f);
        this.f20965h = m23742b(this.f20959b.f20970e.m19111f());
        this.f20959b.f20966a.setColorFilter(new ColorMatrixColorFilter(this.f20958a));
        this.f20959b.f20968c.setColorFilter(new ColorMatrixColorFilter(this.f20958a));
        this.f20959b.f20967b.setColorFilter(new ColorMatrixColorFilter(this.f20958a));
    }
}
