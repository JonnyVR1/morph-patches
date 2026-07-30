package p153l;

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
public class zdn0 extends ruf0 implements Animatable {

    /* JADX INFO: renamed from: i */
    public static final int f203902i = -qa00.f156316c;

    /* JADX INFO: renamed from: a */
    public ColorMatrix f203903a;

    /* JADX INFO: renamed from: b */
    public C21793a f203904b;

    /* JADX INFO: renamed from: c */
    public String f203905c;

    /* JADX INFO: renamed from: d */
    public float f203906d;

    /* JADX INFO: renamed from: e */
    public boolean f203907e;

    /* JADX INFO: renamed from: f */
    public Rect f203908f;

    /* JADX INFO: renamed from: g */
    public int f203909g;

    /* JADX INFO: renamed from: h */
    public Paint f203910h;

    public zdn0(nxp nxpVar, Bitmap bitmap) {
        this.f203904b = new C21793a(nxpVar, bitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f203903a = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(nxpVar.m165214h(), "gray") ? 0.0f : 1.0f);
        this.f203910h = m219346b(this.f203904b.f203915e.m165212f());
        this.f203904b.f203911a.setColorFilter(new ColorMatrixColorFilter(this.f203903a));
        this.f203904b.f203913c.setColorFilter(new ColorMatrixColorFilter(this.f203903a));
        this.f203904b.f203912b.setColorFilter(new ColorMatrixColorFilter(this.f203903a));
    }

    /* JADX INFO: renamed from: b */
    public static Paint m219346b(int i) {
        Paint paint = new Paint(7);
        paint.setColor(-1);
        paint.setLetterSpacing(0.05f);
        paint.setTextSize(i / 2.5f);
        return paint;
    }

    /* JADX INFO: renamed from: c */
    private void m219347c(Canvas canvas, Rect rect) {
        float f = rect.bottom / 5.0f;
        float f2 = rect.right;
        int iM219355d = this.f203904b.m219355d();
        int iM219354c = this.f203904b.m219354c();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f203904b.f203912b.setShader(new LinearGradient(0.0f, 0.0f, f2, 0.0f, iM219355d, iM219354c, tileMode));
        int i = (rect.bottom / 2) + (this.f203904b.f203915e.m165218l() ? 0 : f203902i);
        float f3 = rect.left + i;
        float f4 = rect.top;
        int i2 = rect.bottom;
        canvas.drawRoundRect(f3, (i2 * 0.16f) + f4, rect.right, i2 * 0.84f, f, f, this.f203904b.f203912b);
        if (this.f203904b.m219353b() == 0 || this.f203904b.m219352a() == 0) {
            return;
        }
        this.f203904b.f203913c.setShader(new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f203904b.m219353b(), this.f203904b.m219352a(), tileMode));
        int i3 = rect.bottom;
        int i4 = i3 / 40;
        this.f203904b.f203913c.setStrokeWidth(i3 / 20.0f);
        float f5 = rect.left + i4 + i;
        float f6 = rect.top;
        int i5 = rect.bottom;
        float f7 = i4;
        canvas.drawRoundRect(f5, f6 + (i5 * 0.16f) + f7, rect.right - i4, (i5 * 0.84f) - f7, f, f, this.f203904b.f203913c);
    }

    /* JADX INFO: renamed from: d */
    public static String m219348d(CharSequence charSequence) {
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

    /* JADX INFO: renamed from: e */
    public static int m219349e(Paint paint, String str, int i) {
        if (paint == null) {
            paint = m219346b(i);
        }
        return ((int) paint.measureText(str)) + ((int) (i * 1.5f));
    }

    @Override // p153l.ruf0
    /* JADX INFO: renamed from: a */
    public int mo161714a() {
        int i = this.f203909g;
        return i == 0 ? getBounds().width() : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f203904b.f203914d;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        m219347c(canvas, bounds);
        if (this.f203908f == null) {
            this.f203908f = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        int width = (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight);
        int i = this.f203904b.f203915e.m165218l() ? 0 : f203902i;
        this.f203908f.set(i, 0, width + i, iHeight);
        canvas.save();
        canvas.drawBitmap(bitmap, (Rect) null, this.f203908f, this.f203904b.f203911a);
        canvas.restore();
        canvas.drawText(this.f203905c, i + (this.f203908f.bottom * 1.1f), this.f203906d, this.f203910h);
    }

    /* JADX INFO: renamed from: f */
    public void m219350f(String str) {
        this.f203905c = m219348d(str);
        Paint paintM219346b = m219346b(this.f203904b.f203915e.m165212f());
        this.f203910h = paintM219346b;
        int iM219349e = m219349e(paintM219346b, str, this.f203904b.f203915e.m165212f());
        this.f203909g = iM219349e;
        setBounds(0, 0, iM219349e, this.f203904b.f203915e.m165212f());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m219351g(int i) {
        nxp nxpVar;
        C21793a c21793a = this.f203904b;
        if (c21793a == null || (nxpVar = c21793a.f203915e) == null) {
            return;
        }
        nxpVar.m165221o(i);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f203904b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f203904b.f203914d;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f203904b.f203911a.getAlpha() < 255) ? -3 : -1;
    }

    @Override // p153l.a6m
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
        if (!this.f203907e && super.mutate() == this) {
            this.f203904b = new C21793a(this.f203904b);
            this.f203907e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Paint.FontMetrics fontMetrics = this.f203910h.getFontMetrics();
        this.f203906d = ((this.f203904b.f203915e.m165212f() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        int iM219349e = m219349e(this.f203910h, this.f203905c, this.f203904b.f203915e.m165212f());
        this.f203909g = iM219349e;
        setBounds(0, 0, iM219349e, this.f203904b.f203915e.m165212f());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f203904b.f203911a.getAlpha()) {
            this.f203904b.f203911a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f203904b.f203911a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.zdn0$a */
    public static final class C21793a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f203911a;

        /* JADX INFO: renamed from: b */
        public final Paint f203912b;

        /* JADX INFO: renamed from: c */
        public final Paint f203913c;

        /* JADX INFO: renamed from: d */
        public Bitmap f203914d;

        /* JADX INFO: renamed from: e */
        public nxp f203915e;

        public C21793a(nxp nxpVar, Bitmap bitmap) {
            this.f203915e = nxpVar;
            this.f203914d = bitmap;
            this.f203911a = new Paint(7);
            this.f203912b = new Paint(7);
            Paint paint = new Paint(7);
            this.f203913c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(qa00.m175859d(1.0f));
        }

        /* JADX INFO: renamed from: a */
        public int m219352a() {
            return n3d0.m161284h(this.f203915e.m165208b(), 0);
        }

        /* JADX INFO: renamed from: b */
        public int m219353b() {
            return n3d0.m161284h(this.f203915e.m165209c(), 0);
        }

        /* JADX INFO: renamed from: c */
        public int m219354c() {
            return n3d0.m161283g(this.f203915e.m165210d());
        }

        /* JADX INFO: renamed from: d */
        public int m219355d() {
            return n3d0.m161283g(this.f203915e.m165215i());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new zdn0(this);
        }

        public C21793a(C21793a c21793a) {
            this.f203915e = c21793a.f203915e;
            this.f203914d = c21793a.f203914d;
            this.f203911a = new Paint(c21793a.f203911a);
            this.f203912b = new Paint(c21793a.f203912b);
            this.f203913c = new Paint(c21793a.f203913c);
        }
    }

    public zdn0(C21793a c21793a) {
        this.f203904b = c21793a;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f203903a = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(c21793a.f203915e.m165214h(), "gray") ? 0.0f : 1.0f);
        this.f203910h = m219346b(this.f203904b.f203915e.m165212f());
        this.f203904b.f203911a.setColorFilter(new ColorMatrixColorFilter(this.f203903a));
        this.f203904b.f203913c.setColorFilter(new ColorMatrixColorFilter(this.f203903a));
        this.f203904b.f203912b.setColorFilter(new ColorMatrixColorFilter(this.f203903a));
    }
}
