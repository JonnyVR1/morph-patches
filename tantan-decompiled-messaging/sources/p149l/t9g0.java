package p149l;

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
public final class t9g0 extends BitmapDrawable {

    /* JADX INFO: renamed from: a */
    public Drawable f169024a;

    /* JADX INFO: renamed from: b */
    public final long f169025b;

    /* JADX INFO: renamed from: c */
    public boolean f169026c;

    /* JADX INFO: renamed from: d */
    public int f169027d;

    static {
        new Paint();
    }

    public t9g0(Context context, Bitmap bitmap, Drawable drawable, int i) {
        super(context.getResources(), bitmap);
        this.f169027d = 255;
        float f = context.getResources().getDisplayMetrics().density;
        if (i != 1) {
            this.f169024a = drawable;
            this.f169026c = true;
            this.f169025b = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m187631a(ImageView imageView) {
        imageView.setImageDrawable(null);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m187632b(ImageView imageView, Context context, Bitmap bitmap, int i) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new t9g0(context, bitmap, drawable, i));
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.f169026c) {
            super.draw(canvas);
            return;
        }
        float fUptimeMillis = (SystemClock.uptimeMillis() - this.f169025b) / 200.0f;
        if (fUptimeMillis >= 1.0f) {
            this.f169026c = false;
            this.f169024a = null;
            super.draw(canvas);
        } else {
            Drawable drawable = this.f169024a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            super.setAlpha((int) (this.f169027d * fUptimeMillis));
            super.draw(canvas);
            super.setAlpha(this.f169027d);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f169024a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f169027d = i;
        Drawable drawable = this.f169024a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f169024a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
