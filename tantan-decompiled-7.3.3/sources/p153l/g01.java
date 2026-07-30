package p153l;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class g01 extends Drawable implements Drawable.Callback, rgj0, qgj0 {

    /* JADX INFO: renamed from: a */
    public rgj0 f101573a;

    /* JADX INFO: renamed from: c */
    public final Drawable[] f101575c;

    /* JADX INFO: renamed from: d */
    public final uce[] f101576d;

    /* JADX INFO: renamed from: b */
    public final vce f101574b = new vce();

    /* JADX INFO: renamed from: e */
    public final Rect f101577e = new Rect();

    /* JADX INFO: renamed from: f */
    public boolean f101578f = false;

    /* JADX INFO: renamed from: g */
    public boolean f101579g = false;

    /* JADX INFO: renamed from: h */
    public boolean f101580h = false;

    /* JADX INFO: renamed from: l.g01$a */
    public class C17105a implements uce {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f101581a;

        public C17105a(int i) {
            this.f101581a = i;
        }

        @Override // p153l.uce
        /* JADX INFO: renamed from: i */
        public Drawable mo128371i() {
            return g01.this.m128365b(this.f101581a);
        }

        @Override // p153l.uce
        /* JADX INFO: renamed from: k */
        public Drawable mo128372k(Drawable drawable) {
            return g01.this.m128368e(this.f101581a, drawable);
        }
    }

    public g01(Drawable[] drawableArr) {
        int i = 0;
        wn80.m207182g(drawableArr);
        this.f101575c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f101575c;
            if (i >= drawableArr2.length) {
                this.f101576d = new uce[drawableArr2.length];
                return;
            } else {
                fde.m125089d(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final uce m128364a(int i) {
        return new C17105a(i);
    }

    /* JADX INFO: renamed from: b */
    public Drawable m128365b(int i) {
        wn80.m207177b(Boolean.valueOf(i >= 0));
        wn80.m207177b(Boolean.valueOf(i < this.f101575c.length));
        return this.f101575c[i];
    }

    /* JADX INFO: renamed from: c */
    public uce m128366c(int i) {
        wn80.m207177b(Boolean.valueOf(i >= 0));
        wn80.m207177b(Boolean.valueOf(i < this.f101576d.length));
        uce[] uceVarArr = this.f101576d;
        if (uceVarArr[i] == null) {
            uceVarArr[i] = m128364a(i);
        }
        return this.f101576d[i];
    }

    /* JADX INFO: renamed from: d */
    public int m128367d() {
        return this.f101575c.length;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public Drawable m128368e(int i, Drawable drawable) {
        wn80.m207177b(Boolean.valueOf(i >= 0));
        wn80.m207177b(Boolean.valueOf(i < this.f101575c.length));
        Drawable drawable2 = this.f101575c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f101580h) {
                drawable.mutate();
            }
            fde.m125089d(this.f101575c[i], null, null);
            fde.m125089d(drawable, null, null);
            fde.m125090e(drawable, this.f101574b);
            fde.m125086a(drawable, this);
            fde.m125089d(drawable, this, this);
            this.f101579g = false;
            this.f101575c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f101575c.length == 0) {
            return -2;
        }
        int i = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f101577e;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // p153l.rgj0
    /* JADX INFO: renamed from: h */
    public void mo128369h(RectF rectF) {
        rgj0 rgj0Var = this.f101573a;
        if (rgj0Var != null) {
            rgj0Var.mo128369h(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f101579g) {
            this.f101578f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f101575c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f101578f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f101578f = z2 | z;
                i++;
            }
            this.f101579g = true;
        }
        return this.f101578f;
    }

    @Override // p153l.rgj0
    /* JADX INFO: renamed from: j */
    public void mo96260j(Matrix matrix) {
        rgj0 rgj0Var = this.f101573a;
        if (rgj0Var != null) {
            rgj0Var.mo96260j(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // p153l.qgj0
    /* JADX INFO: renamed from: l */
    public void mo128370l(rgj0 rgj0Var) {
        this.f101573a = rgj0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                this.f101580h = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f101574b.m200798b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f101574b.m200799c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f101574b.m200800d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f101574b.m200801e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f101575c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
