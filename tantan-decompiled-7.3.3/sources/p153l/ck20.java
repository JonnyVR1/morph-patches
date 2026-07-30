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

/* JADX INFO: loaded from: classes13.dex */
public class ck20 extends ruf0 implements Animatable {

    /* JADX INFO: renamed from: a */
    public C16293a f82256a;

    /* JADX INFO: renamed from: b */
    public boolean f82257b;

    public ck20(Bitmap bitmap) {
        this.f82256a = new C16293a(bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f82256a.f82259b;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f82256a.f82258a);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f82256a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f82256a.f82259b;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f82256a.f82258a.getAlpha() < 255) ? -3 : -1;
    }

    @Override // p153l.a6m
    public float getRatio() {
        return this.f82256a.f82260c;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f82257b && super.mutate() == this) {
            this.f82256a = new C16293a(this.f82256a);
            this.f82257b = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f82256a.f82258a.getAlpha()) {
            this.f82256a.f82258a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f82256a.f82258a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public ck20(C16293a c16293a) {
        this.f82256a = c16293a;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.ck20$a */
    public static final class C16293a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f82258a;

        /* JADX INFO: renamed from: b */
        public Bitmap f82259b;

        /* JADX INFO: renamed from: c */
        public float f82260c;

        public C16293a(Bitmap bitmap) {
            this.f82260c = 1.0f;
            this.f82259b = bitmap;
            this.f82258a = new Paint(7);
            if (bitmap.getHeight() != 0) {
                this.f82260c = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new ck20(this);
        }

        public C16293a(C16293a c16293a) {
            this.f82260c = 1.0f;
            this.f82259b = c16293a.f82259b;
            this.f82258a = new Paint(c16293a.f82258a);
            this.f82260c = c16293a.f82260c;
        }
    }
}
