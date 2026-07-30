package p149l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xyq0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public int f195111a;

    /* JADX INFO: renamed from: b */
    public long f195112b;

    /* JADX INFO: renamed from: c */
    public int f195113c;

    /* JADX INFO: renamed from: d */
    public int f195114d;

    /* JADX INFO: renamed from: e */
    public int f195115e;

    /* JADX INFO: renamed from: f */
    public int f195116f;

    /* JADX INFO: renamed from: g */
    public boolean f195117g;

    /* JADX INFO: renamed from: h */
    public boolean f195118h;

    /* JADX INFO: renamed from: i */
    public wyq0 f195119i;

    /* JADX INFO: renamed from: j */
    public Drawable f195120j;

    /* JADX INFO: renamed from: k */
    public Drawable f195121k;

    /* JADX INFO: renamed from: l */
    public boolean f195122l;

    /* JADX INFO: renamed from: m */
    public boolean f195123m;

    /* JADX INFO: renamed from: n */
    public boolean f195124n;

    /* JADX INFO: renamed from: o */
    public int f195125o;

    public xyq0(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(null);
        drawable = drawable == null ? uyq0.f178899a : drawable;
        this.f195120j = drawable;
        drawable.setCallback(this);
        wyq0 wyq0Var = this.f195119i;
        wyq0Var.f188666b = drawable.getChangingConfigurations() | wyq0Var.f188666b;
        drawable2 = drawable2 == null ? uyq0.f178899a : drawable2;
        this.f195121k = drawable2;
        drawable2.setCallback(this);
        this.f195119i.f188666b |= drawable2.getChangingConfigurations();
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m211873a() {
        return this.f195121k;
    }

    /* JADX INFO: renamed from: b */
    public final void m211874b(int i) {
        this.f195113c = this.f195114d;
        this.f195116f = 0;
        this.f195115e = 250;
        this.f195111a = 1;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m211875c() {
        if (!this.f195122l) {
            boolean z = false;
            if (this.f195120j.getConstantState() != null && this.f195121k.getConstantState() != null) {
                z = true;
            }
            this.f195123m = z;
            this.f195122l = true;
        }
        return this.f195123m;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2 = this.f195111a;
        int i3 = 0;
        if (i2 == 1) {
            this.f195112b = SystemClock.uptimeMillis();
            this.f195111a = 2;
            z = false;
        } else if (i2 == 2 && this.f195112b >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f195112b) / this.f195115e;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.f195111a = 0;
            }
            this.f195116f = (int) ((this.f195113c * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z = true;
        }
        int i4 = this.f195116f;
        boolean z2 = this.f195117g;
        Drawable drawable = this.f195120j;
        Drawable drawable2 = this.f195121k;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.f195114d - i4);
                i3 = 1;
            }
            drawable.draw(canvas);
            if (i3 != 0) {
                drawable.setAlpha(this.f195114d);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f195114d);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.f195114d;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.f195114d;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        wyq0 wyq0Var = this.f195119i;
        return wyq0Var.f188666b | changingConfigurations | wyq0Var.f188665a;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!m211875c()) {
            return null;
        }
        this.f195119i.f188665a = getChangingConfigurations();
        return this.f195119i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f195120j.getIntrinsicHeight(), this.f195121k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f195120j.getIntrinsicWidth(), this.f195121k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f195124n) {
            this.f195125o = Drawable.resolveOpacity(this.f195120j.getOpacity(), this.f195121k.getOpacity());
            this.f195124n = true;
        }
        return this.f195125o;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.f195118h || super.mutate() != this) {
            return this;
        }
        if (!m211875c()) {
            qkq0.m175383a("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            return null;
        }
        this.f195120j.mutate();
        this.f195121k.mutate();
        this.f195118h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f195120j.setBounds(rect);
        this.f195121k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f195116f == this.f195114d) {
            this.f195116f = i;
        }
        this.f195114d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f195120j.setColorFilter(colorFilter);
        this.f195121k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public xyq0(@Nullable wyq0 wyq0Var) {
        this.f195111a = 0;
        this.f195114d = 255;
        this.f195116f = 0;
        this.f195117g = true;
        this.f195119i = new wyq0(wyq0Var);
    }
}
