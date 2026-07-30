package p149l;

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

/* JADX INFO: loaded from: classes4.dex */
public class v4n0 extends imf0 implements Animatable {

    /* JADX INFO: renamed from: i */
    public static final int f179949i = -t100.f167254c;

    /* JADX INFO: renamed from: a */
    public ColorMatrix f179950a;

    /* JADX INFO: renamed from: b */
    public C20578a f179951b;

    /* JADX INFO: renamed from: c */
    public String f179952c;

    /* JADX INFO: renamed from: d */
    public float f179953d;

    /* JADX INFO: renamed from: e */
    public boolean f179954e;

    /* JADX INFO: renamed from: f */
    public Rect f179955f;

    /* JADX INFO: renamed from: g */
    public int f179956g;

    /* JADX INFO: renamed from: h */
    public Paint f179957h;

    public v4n0(nvp nvpVar, Bitmap bitmap) {
        this.f179951b = new C20578a(nvpVar, bitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f179950a = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(nvpVar.m161714h(), "gray") ? 0.0f : 1.0f);
        this.f179957h = m197044b(this.f179951b.f179962e.m161712f());
        this.f179951b.f179958a.setColorFilter(new ColorMatrixColorFilter(this.f179950a));
        this.f179951b.f179960c.setColorFilter(new ColorMatrixColorFilter(this.f179950a));
        this.f179951b.f179959b.setColorFilter(new ColorMatrixColorFilter(this.f179950a));
    }

    /* JADX INFO: renamed from: b */
    public static Paint m197044b(int i) {
        Paint paint = new Paint(7);
        paint.setColor(-1);
        paint.setLetterSpacing(0.05f);
        paint.setTextSize(i / 2.5f);
        return paint;
    }

    /* JADX INFO: renamed from: c */
    private void m197045c(Canvas canvas, Rect rect) {
        float f = rect.bottom / 5.0f;
        float f2 = rect.right;
        int iM197053d = this.f179951b.m197053d();
        int iM197052c = this.f179951b.m197052c();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f179951b.f179959b.setShader(new LinearGradient(0.0f, 0.0f, f2, 0.0f, iM197053d, iM197052c, tileMode));
        int i = (rect.bottom / 2) + (this.f179951b.f179962e.m161718l() ? 0 : f179949i);
        float f3 = rect.left + i;
        float f4 = rect.top;
        int i2 = rect.bottom;
        canvas.drawRoundRect(f3, (i2 * 0.16f) + f4, rect.right, i2 * 0.84f, f, f, this.f179951b.f179959b);
        if (this.f179951b.m197051b() == 0 || this.f179951b.m197050a() == 0) {
            return;
        }
        this.f179951b.f179960c.setShader(new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f179951b.m197051b(), this.f179951b.m197050a(), tileMode));
        int i3 = rect.bottom;
        int i4 = i3 / 40;
        this.f179951b.f179960c.setStrokeWidth(i3 / 20.0f);
        float f5 = rect.left + i4 + i;
        float f6 = rect.top;
        int i5 = rect.bottom;
        float f7 = i4;
        canvas.drawRoundRect(f5, f6 + (i5 * 0.16f) + f7, rect.right - i4, (i5 * 0.84f) - f7, f, f, this.f179951b.f179960c);
    }

    /* JADX INFO: renamed from: d */
    public static String m197046d(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            i = t0g0.m186867h(cCharAt) ? i + 2 : i + 1;
            if (i > 24) {
                return sb.toString();
            }
            sb.append(cCharAt);
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* JADX INFO: renamed from: e */
    public static int m197047e(Paint paint, String str, int i) {
        if (paint == null) {
            paint = m197044b(i);
        }
        return ((int) paint.measureText(str)) + ((int) (i * 1.5f));
    }

    @Override // p149l.imf0
    /* JADX INFO: renamed from: a */
    public int mo137069a() {
        int i = this.f179956g;
        return i == 0 ? getBounds().width() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f179951b.f179961d;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        m197045c(canvas, bounds);
        if (this.f179955f == null) {
            this.f179955f = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        int width = (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight);
        int i = this.f179951b.f179962e.m161718l() ? 0 : f179949i;
        this.f179955f.set(i, 0, width + i, iHeight);
        canvas.save();
        canvas.drawBitmap(bitmap, (Rect) null, this.f179955f, this.f179951b.f179958a);
        canvas.restore();
        canvas.drawText(this.f179952c, i + (this.f179955f.bottom * 1.1f), this.f179953d, this.f179957h);
    }

    /* JADX INFO: renamed from: f */
    public void m197048f(String str) {
        this.f179952c = m197046d(str);
        Paint paintM197044b = m197044b(this.f179951b.f179962e.m161712f());
        this.f179957h = paintM197044b;
        int iM197047e = m197047e(paintM197044b, str, this.f179951b.f179962e.m161712f());
        this.f179956g = iM197047e;
        setBounds(0, 0, iM197047e, this.f179951b.f179962e.m161712f());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m197049g(int i) {
        nvp nvpVar;
        C20578a c20578a = this.f179951b;
        if (c20578a == null || (nvpVar = c20578a.f179962e) == null) {
            return;
        }
        nvpVar.m161721o(i);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f179951b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f179951b.f179961d;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f179951b.f179958a.getAlpha() < 255) ? -3 : -1;
    }

    @Override // p149l.j3m
    public float getRatio() {
        return 3.5714285f;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f179954e && super.mutate() == this) {
            this.f179951b = new C20578a(this.f179951b);
            this.f179954e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Paint.FontMetrics fontMetrics = this.f179957h.getFontMetrics();
        this.f179953d = ((this.f179951b.f179962e.m161712f() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        int iM197047e = m197047e(this.f179957h, this.f179952c, this.f179951b.f179962e.m161712f());
        this.f179956g = iM197047e;
        setBounds(0, 0, iM197047e, this.f179951b.f179962e.m161712f());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f179951b.f179958a.getAlpha()) {
            this.f179951b.f179958a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f179951b.f179958a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.v4n0$a */
    public static final class C20578a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f179958a;

        /* JADX INFO: renamed from: b */
        public final Paint f179959b;

        /* JADX INFO: renamed from: c */
        public final Paint f179960c;

        /* JADX INFO: renamed from: d */
        public Bitmap f179961d;

        /* JADX INFO: renamed from: e */
        public nvp f179962e;

        public C20578a(nvp nvpVar, Bitmap bitmap) {
            this.f179962e = nvpVar;
            this.f179961d = bitmap;
            this.f179958a = new Paint(7);
            this.f179959b = new Paint(7);
            Paint paint = new Paint(7);
            this.f179960c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(t100.m186890d(1.0f));
        }

        /* JADX INFO: renamed from: a */
        public int m197050a() {
            return kvc0.m147359h(this.f179962e.m161708b(), 0);
        }

        /* JADX INFO: renamed from: b */
        public int m197051b() {
            return kvc0.m147359h(this.f179962e.m161709c(), 0);
        }

        /* JADX INFO: renamed from: c */
        public int m197052c() {
            return kvc0.m147358g(this.f179962e.m161710d());
        }

        /* JADX INFO: renamed from: d */
        public int m197053d() {
            return kvc0.m147358g(this.f179962e.m161715i());
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

        public C20578a(C20578a c20578a) {
            this.f179962e = c20578a.f179962e;
            this.f179961d = c20578a.f179961d;
            this.f179958a = new Paint(c20578a.f179958a);
            this.f179959b = new Paint(c20578a.f179959b);
            this.f179960c = new Paint(c20578a.f179960c);
        }
    }

    public v4n0(C20578a c20578a) {
        this.f179951b = c20578a;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f179950a = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(c20578a.f179962e.m161714h(), "gray") ? 0.0f : 1.0f);
        this.f179957h = m197044b(this.f179951b.f179962e.m161712f());
        this.f179951b.f179958a.setColorFilter(new ColorMatrixColorFilter(this.f179950a));
        this.f179951b.f179960c.setColorFilter(new ColorMatrixColorFilter(this.f179950a));
        this.f179951b.f179959b.setColorFilter(new ColorMatrixColorFilter(this.f179950a));
    }
}
