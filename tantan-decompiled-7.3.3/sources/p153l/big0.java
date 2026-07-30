package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class big0 extends BitmapDrawable {

    /* JADX INFO: renamed from: a */
    public Drawable f76874a;

    /* JADX INFO: renamed from: b */
    public final long f76875b;

    /* JADX INFO: renamed from: c */
    public boolean f76876c;

    /* JADX INFO: renamed from: d */
    public int f76877d;

    static {
        new Paint();
    }

    public big0(Context context, Bitmap bitmap, Drawable drawable, int i) {
        super(context.getResources(), bitmap);
        this.f76877d = 255;
        float f = context.getResources().getDisplayMetrics().density;
        if (i != 1) {
            this.f76874a = drawable;
            this.f76876c = true;
            this.f76875b = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m104462a(ImageView imageView) {
        imageView.setImageDrawable(null);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m104463b(ImageView imageView, Context context, Bitmap bitmap, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new big0(context, bitmap, drawable, i));
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.f76876c) {
            super.draw(canvas);
            return;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() - this.f76875b) / 200.0f;
        if (fUptimeMillis >= 1.0f) {
            this.f76876c = false;
            this.f76874a = null;
            super.draw(canvas);
        } else {
            Drawable drawable = this.f76874a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            super.setAlpha((int) (this.f76877d * fUptimeMillis));
            super.draw(canvas);
            super.setAlpha(this.f76877d);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f76874a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f76877d = i;
        Drawable drawable = this.f76874a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f76874a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
