package p002l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.imf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a9g extends imf0 implements Animatable {

    /* JADX INFO: renamed from: a */
    public C0486a f7457a;

    /* JADX INFO: renamed from: b */
    public String f7458b;

    /* JADX INFO: renamed from: c */
    public float f7459c;

    /* JADX INFO: renamed from: d */
    public float f7460d;

    /* JADX INFO: renamed from: e */
    public boolean f7461e;

    /* JADX INFO: renamed from: f */
    public Rect f7462f;

    /* JADX INFO: renamed from: g */
    public Rect f7463g;

    /* JADX INFO: renamed from: h */
    public Bitmap f7464h;

    public a9g(Bitmap bitmap, Bitmap bitmap2) {
        this.f7457a = new C0486a(bitmap, bitmap2);
        this.f7464h = bitmap;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m9456b() {
        return this.f7464h;
    }

    /* JADX INFO: renamed from: c */
    public final void m9457c() {
        this.f7460d = this.f7457a.f7466b.measureText(this.f7458b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public void m9458d(String str) {
        this.f7458b = str;
        m9457c();
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(@NonNull Canvas canvas) {
        C0486a c0486a = this.f7457a;
        Bitmap bitmap = c0486a.f7467c;
        Bitmap bitmap2 = c0486a.f7468d;
        Rect bounds = getBounds();
        if (bitmap == null || bitmap2 == null) {
            return;
        }
        if (this.f7463g == null) {
            this.f7463g = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        this.f7463g.set(0, 0, (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight), iHeight);
        canvas.save();
        canvas.drawBitmap(bitmap, (Rect) null, this.f7463g, this.f7457a.f7465a);
        canvas.restore();
        setBounds(this.f7463g);
        if (this.f7462f == null) {
            this.f7462f = new Rect();
        }
        int iHeight2 = (int) (bounds.height() * 1.0f);
        int width = (int) (((bitmap2.getWidth() * 1.0f) / bitmap2.getHeight()) * iHeight2);
        this.f7462f.set(0, 0, width, iHeight2);
        canvas.save();
        canvas.translate(bounds.width() * 0.06f, 0.0f);
        canvas.drawBitmap(bitmap2, (Rect) null, this.f7462f, this.f7457a.f7465a);
        canvas.restore();
        float fWidth = (bounds.width() * 0.06f) + width;
        canvas.drawText(this.f7458b, (fWidth + (((bounds.width() - fWidth) - this.f7460d) / 2.0f)) - (bounds.width() * 0.03f), this.f7459c, this.f7457a.f7466b);
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f7457a;
    }

    public int getOpacity() {
        Bitmap bitmap = this.f7457a.f7467c;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f7457a.f7465a.getAlpha() < 255) ? -3 : -1;
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
        if (!this.f7461e && super/*android.graphics.drawable.Drawable*/.mutate() == this) {
            this.f7457a = new C0486a(this.f7457a);
            this.f7461e = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        this.f7457a.f7466b.setTextSize(rect.height() * 0.57f);
        Paint.FontMetrics fontMetrics = this.f7457a.f7466b.getFontMetrics();
        this.f7459c = ((rect.height() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        m9457c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAlpha(int i) {
        if (i != this.f7457a.f7465a.getAlpha()) {
            this.f7457a.f7465a.setAlpha(i);
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f7457a.f7465a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public a9g(C0486a c0486a) {
        this.f7457a = c0486a;
        this.f7464h = c0486a.f7467c;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.a9g$a */
    public static final class C0486a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f7465a;

        /* JADX INFO: renamed from: b */
        public final Paint f7466b;

        /* JADX INFO: renamed from: c */
        public Bitmap f7467c;

        /* JADX INFO: renamed from: d */
        public Bitmap f7468d;

        public C0486a(Bitmap bitmap, Bitmap bitmap2) {
            this.f7467c = bitmap;
            this.f7468d = bitmap2;
            this.f7465a = new Paint(7);
            Paint paint = new Paint(7);
            this.f7466b = paint;
            paint.setColor(-1);
            paint.setLetterSpacing(0.05f);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new a9g(this);
        }

        public C0486a(C0486a c0486a) {
            this.f7467c = c0486a.f7467c;
            this.f7468d = c0486a.f7468d;
            this.f7465a = new Paint(c0486a.f7465a);
            this.f7466b = new Paint(c0486a.f7466b);
        }
    }
}
