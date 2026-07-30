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

/* JADX INFO: loaded from: classes13.dex */
public class tb20 extends imf0 implements Animatable {

    /* JADX INFO: renamed from: a */
    public C20137a f169202a;

    /* JADX INFO: renamed from: b */
    public boolean f169203b;

    public tb20(Bitmap bitmap) {
        this.f169202a = new C20137a(bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f169202a.f169205b;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f169202a.f169204a);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f169202a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f169202a.f169205b;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f169202a.f169204a.getAlpha() < 255) ? -3 : -1;
    }

    @Override // p149l.j3m
    public float getRatio() {
        return this.f169202a.f169206c;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f169203b && super.mutate() == this) {
            this.f169202a = new C20137a(this.f169202a);
            this.f169203b = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f169202a.f169204a.getAlpha()) {
            this.f169202a.f169204a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f169202a.f169204a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public tb20(C20137a c20137a) {
        this.f169202a = c20137a;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.tb20$a */
    public static final class C20137a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f169204a;

        /* JADX INFO: renamed from: b */
        public Bitmap f169205b;

        /* JADX INFO: renamed from: c */
        public float f169206c;

        public C20137a(Bitmap bitmap) {
            this.f169206c = 1.0f;
            this.f169205b = bitmap;
            this.f169204a = new Paint(7);
            if (bitmap.getHeight() != 0) {
                this.f169206c = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new tb20(this);
        }

        public C20137a(C20137a c20137a) {
            this.f169206c = 1.0f;
            this.f169205b = c20137a.f169205b;
            this.f169204a = new Paint(c20137a.f169204a);
            this.f169206c = c20137a.f169206c;
        }
    }
}
