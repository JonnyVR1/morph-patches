package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class a9g extends imf0 implements Animatable {

    /* JADX INFO: renamed from: a */
    public C15547a f68158a;

    /* JADX INFO: renamed from: b */
    public String f68159b;

    /* JADX INFO: renamed from: c */
    public float f68160c;

    /* JADX INFO: renamed from: d */
    public float f68161d;

    /* JADX INFO: renamed from: e */
    public boolean f68162e;

    /* JADX INFO: renamed from: f */
    public Rect f68163f;

    /* JADX INFO: renamed from: g */
    public Rect f68164g;

    /* JADX INFO: renamed from: h */
    public Bitmap f68165h;

    public a9g(Bitmap bitmap, Bitmap bitmap2) {
        this.f68158a = new C15547a(bitmap, bitmap2);
        this.f68165h = bitmap;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m95419b() {
        return this.f68165h;
    }

    /* JADX INFO: renamed from: c */
    public final void m95420c() {
        this.f68161d = this.f68158a.f68167b.measureText(this.f68159b);
    }

    /* JADX INFO: renamed from: d */
    public void m95421d(String str) {
        this.f68159b = str;
        m95420c();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        C15547a c15547a = this.f68158a;
        Bitmap bitmap = c15547a.f68168c;
        Bitmap bitmap2 = c15547a.f68169d;
        Rect bounds = getBounds();
        if (bitmap == null || bitmap2 == null) {
            return;
        }
        if (this.f68164g == null) {
            this.f68164g = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        this.f68164g.set(0, 0, (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight), iHeight);
        canvas.save();
        canvas.drawBitmap(bitmap, (Rect) null, this.f68164g, this.f68158a.f68166a);
        canvas.restore();
        setBounds(this.f68164g);
        if (this.f68163f == null) {
            this.f68163f = new Rect();
        }
        int iHeight2 = (int) (bounds.height() * 1.0f);
        int width = (int) (((bitmap2.getWidth() * 1.0f) / bitmap2.getHeight()) * iHeight2);
        this.f68163f.set(0, 0, width, iHeight2);
        canvas.save();
        canvas.translate(bounds.width() * 0.06f, 0.0f);
        canvas.drawBitmap(bitmap2, (Rect) null, this.f68163f, this.f68158a.f68166a);
        canvas.restore();
        float fWidth = (bounds.width() * 0.06f) + width;
        canvas.drawText(this.f68159b, (fWidth + (((bounds.width() - fWidth) - this.f68161d) / 2.0f)) - (bounds.width() * 0.03f), this.f68160c, this.f68158a.f68167b);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f68158a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f68158a.f68168c;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f68158a.f68166a.getAlpha() < 255) ? -3 : -1;
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
        if (!this.f68162e && super.mutate() == this) {
            this.f68158a = new C15547a(this.f68158a);
            this.f68162e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f68158a.f68167b.setTextSize(rect.height() * 0.57f);
        Paint.FontMetrics fontMetrics = this.f68158a.f68167b.getFontMetrics();
        this.f68160c = ((rect.height() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        m95420c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f68158a.f68166a.getAlpha()) {
            this.f68158a.f68166a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f68158a.f68166a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public a9g(C15547a c15547a) {
        this.f68158a = c15547a;
        this.f68165h = c15547a.f68168c;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.a9g$a */
    public static final class C15547a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f68166a;

        /* JADX INFO: renamed from: b */
        public final Paint f68167b;

        /* JADX INFO: renamed from: c */
        public Bitmap f68168c;

        /* JADX INFO: renamed from: d */
        public Bitmap f68169d;

        public C15547a(Bitmap bitmap, Bitmap bitmap2) {
            this.f68168c = bitmap;
            this.f68169d = bitmap2;
            this.f68166a = new Paint(7);
            Paint paint = new Paint(7);
            this.f68167b = paint;
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

        public C15547a(C15547a c15547a) {
            this.f68168c = c15547a.f68168c;
            this.f68169d = c15547a.f68169d;
            this.f68166a = new Paint(c15547a.f68166a);
            this.f68167b = new Paint(c15547a.f68167b);
        }
    }
}
