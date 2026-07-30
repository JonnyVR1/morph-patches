package p153l;

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
public class oag extends ruf0 implements Animatable {

    /* JADX INFO: renamed from: a */
    public C19066a f145711a;

    /* JADX INFO: renamed from: b */
    public String f145712b;

    /* JADX INFO: renamed from: c */
    public float f145713c;

    /* JADX INFO: renamed from: d */
    public float f145714d;

    /* JADX INFO: renamed from: e */
    public boolean f145715e;

    /* JADX INFO: renamed from: f */
    public Rect f145716f;

    /* JADX INFO: renamed from: g */
    public Rect f145717g;

    /* JADX INFO: renamed from: h */
    public Bitmap f145718h;

    public oag(Bitmap bitmap, Bitmap bitmap2) {
        this.f145711a = new C19066a(bitmap, bitmap2);
        this.f145718h = bitmap;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m166838b() {
        return this.f145718h;
    }

    /* JADX INFO: renamed from: c */
    public final void m166839c() {
        this.f145714d = this.f145711a.f145720b.measureText(this.f145712b);
    }

    /* JADX INFO: renamed from: d */
    public void m166840d(String str) {
        this.f145712b = str;
        m166839c();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        C19066a c19066a = this.f145711a;
        Bitmap bitmap = c19066a.f145721c;
        Bitmap bitmap2 = c19066a.f145722d;
        Rect bounds = getBounds();
        if (bitmap == null || bitmap2 == null) {
            return;
        }
        if (this.f145717g == null) {
            this.f145717g = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        this.f145717g.set(0, 0, (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight), iHeight);
        canvas.save();
        canvas.drawBitmap(bitmap, (Rect) null, this.f145717g, this.f145711a.f145719a);
        canvas.restore();
        setBounds(this.f145717g);
        if (this.f145716f == null) {
            this.f145716f = new Rect();
        }
        int iHeight2 = (int) (bounds.height() * 1.0f);
        int width = (int) (((bitmap2.getWidth() * 1.0f) / bitmap2.getHeight()) * iHeight2);
        this.f145716f.set(0, 0, width, iHeight2);
        canvas.save();
        canvas.translate(bounds.width() * 0.06f, 0.0f);
        canvas.drawBitmap(bitmap2, (Rect) null, this.f145716f, this.f145711a.f145719a);
        canvas.restore();
        float fWidth = (bounds.width() * 0.06f) + width;
        canvas.drawText(this.f145712b, (fWidth + (((bounds.width() - fWidth) - this.f145714d) / 2.0f)) - (bounds.width() * 0.03f), this.f145713c, this.f145711a.f145720b);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f145711a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f145711a.f145721c;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f145711a.f145719a.getAlpha() < 255) ? -3 : -1;
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
        if (!this.f145715e && super.mutate() == this) {
            this.f145711a = new C19066a(this.f145711a);
            this.f145715e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f145711a.f145720b.setTextSize(rect.height() * 0.57f);
        Paint.FontMetrics fontMetrics = this.f145711a.f145720b.getFontMetrics();
        this.f145713c = ((rect.height() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        m166839c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f145711a.f145719a.getAlpha()) {
            this.f145711a.f145719a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f145711a.f145719a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public oag(C19066a c19066a) {
        this.f145711a = c19066a;
        this.f145718h = c19066a.f145721c;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.oag$a */
    public static final class C19066a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f145719a;

        /* JADX INFO: renamed from: b */
        public final Paint f145720b;

        /* JADX INFO: renamed from: c */
        public Bitmap f145721c;

        /* JADX INFO: renamed from: d */
        public Bitmap f145722d;

        public C19066a(Bitmap bitmap, Bitmap bitmap2) {
            this.f145721c = bitmap;
            this.f145722d = bitmap2;
            this.f145719a = new Paint(7);
            Paint paint = new Paint(7);
            this.f145720b = paint;
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
            return new oag(this);
        }

        public C19066a(C19066a c19066a) {
            this.f145721c = c19066a.f145721c;
            this.f145722d = c19066a.f145722d;
            this.f145719a = new Paint(c19066a.f145719a);
            this.f145720b = new Paint(c19066a.f145720b);
        }
    }
}
