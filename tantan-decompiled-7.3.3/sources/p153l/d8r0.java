package p153l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class d8r0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a */
    public int f85664a;

    /* JADX INFO: renamed from: b */
    public long f85665b;

    /* JADX INFO: renamed from: c */
    public int f85666c;

    /* JADX INFO: renamed from: d */
    public int f85667d;

    /* JADX INFO: renamed from: e */
    public int f85668e;

    /* JADX INFO: renamed from: f */
    public int f85669f;

    /* JADX INFO: renamed from: g */
    public boolean f85670g;

    /* JADX INFO: renamed from: h */
    public boolean f85671h;

    /* JADX INFO: renamed from: i */
    public c8r0 f85672i;

    /* JADX INFO: renamed from: j */
    public Drawable f85673j;

    /* JADX INFO: renamed from: k */
    public Drawable f85674k;

    /* JADX INFO: renamed from: l */
    public boolean f85675l;

    /* JADX INFO: renamed from: m */
    public boolean f85676m;

    /* JADX INFO: renamed from: n */
    public boolean f85677n;

    /* JADX INFO: renamed from: o */
    public int f85678o;

    public d8r0(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(null);
        drawable = drawable == null ? a8r0.f68941a : drawable;
        this.f85673j = drawable;
        drawable.setCallback(this);
        c8r0 c8r0Var = this.f85672i;
        c8r0Var.f80236b = drawable.getChangingConfigurations() | c8r0Var.f80236b;
        drawable2 = drawable2 == null ? a8r0.f68941a : drawable2;
        this.f85674k = drawable2;
        drawable2.setCallback(this);
        this.f85672i.f80236b |= drawable2.getChangingConfigurations();
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m114921a() {
        return this.f85674k;
    }

    /* JADX INFO: renamed from: b */
    public final void m114922b(int i) {
        this.f85666c = this.f85667d;
        this.f85669f = 0;
        this.f85668e = 250;
        this.f85664a = 1;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m114923c() {
        if (!this.f85675l) {
            boolean z = false;
            if (this.f85673j.getConstantState() != null && this.f85674k.getConstantState() != null) {
                z = true;
            }
            this.f85676m = z;
            this.f85675l = true;
        }
        return this.f85676m;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2 = this.f85664a;
        int i3 = 0;
        if (i2 == 1) {
            this.f85665b = SystemClock.uptimeMillis();
            this.f85664a = 2;
            z = false;
        } else if (i2 == 2 && this.f85665b >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f85665b) / this.f85668e;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.f85664a = 0;
            }
            this.f85669f = (int) ((this.f85666c * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z = true;
        }
        int i4 = this.f85669f;
        boolean z2 = this.f85670g;
        Drawable drawable = this.f85673j;
        Drawable drawable2 = this.f85674k;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.f85667d - i4);
                i3 = 1;
            }
            drawable.draw(canvas);
            if (i3 != 0) {
                drawable.setAlpha(this.f85667d);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f85667d);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.f85667d;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.f85667d;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c8r0 c8r0Var = this.f85672i;
        return c8r0Var.f80236b | changingConfigurations | c8r0Var.f80235a;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!m114923c()) {
            return null;
        }
        this.f85672i.f80235a = getChangingConfigurations();
        return this.f85672i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f85673j.getIntrinsicHeight(), this.f85674k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f85673j.getIntrinsicWidth(), this.f85674k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f85677n) {
            this.f85678o = Drawable.resolveOpacity(this.f85673j.getOpacity(), this.f85674k.getOpacity());
            this.f85677n = true;
        }
        return this.f85678o;
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
        if (this.f85671h || super.mutate() != this) {
            return this;
        }
        if (!m114923c()) {
            wtq0.m207906a("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            return null;
        }
        this.f85673j.mutate();
        this.f85674k.mutate();
        this.f85671h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f85673j.setBounds(rect);
        this.f85674k.setBounds(rect);
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
        if (this.f85669f == this.f85667d) {
            this.f85669f = i;
        }
        this.f85667d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f85673j.setColorFilter(colorFilter);
        this.f85674k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public d8r0(@Nullable c8r0 c8r0Var) {
        this.f85664a = 0;
        this.f85667d = 255;
        this.f85669f = 0;
        this.f85670g = true;
        this.f85672i = new c8r0(c8r0Var);
    }
}
