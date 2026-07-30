package p149l;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class zz0 extends Drawable implements Drawable.Callback, n7j0, m7j0 {

    /* JADX INFO: renamed from: a */
    public n7j0 f205763a;

    /* JADX INFO: renamed from: c */
    public final Drawable[] f205765c;

    /* JADX INFO: renamed from: d */
    public final qbe[] f205766d;

    /* JADX INFO: renamed from: b */
    public final rbe f205764b = new rbe();

    /* JADX INFO: renamed from: e */
    public final Rect f205767e = new Rect();

    /* JADX INFO: renamed from: f */
    public boolean f205768f = false;

    /* JADX INFO: renamed from: g */
    public boolean f205769g = false;

    /* JADX INFO: renamed from: h */
    public boolean f205770h = false;

    /* JADX INFO: renamed from: l.zz0$a */
    public class C21824a implements qbe {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f205771a;

        public C21824a(int i) {
            this.f205771a = i;
        }

        @Override // p149l.qbe
        /* JADX INFO: renamed from: i */
        public Drawable mo173824i() {
            return zz0.this.m220984b(this.f205771a);
        }

        @Override // p149l.qbe
        /* JADX INFO: renamed from: k */
        public Drawable mo173825k(Drawable drawable) {
            return zz0.this.m220987e(this.f205771a, drawable);
        }
    }

    public zz0(Drawable[] drawableArr) {
        int i = 0;
        rf80.m179116g(drawableArr);
        this.f205765c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f205765c;
            if (i >= drawableArr2.length) {
                this.f205766d = new qbe[drawableArr2.length];
                return;
            } else {
                bce.m101058d(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final qbe m220983a(int i) {
        return new C21824a(i);
    }

    /* JADX INFO: renamed from: b */
    public Drawable m220984b(int i) {
        rf80.m179111b(Boolean.valueOf(i >= 0));
        rf80.m179111b(Boolean.valueOf(i < this.f205765c.length));
        return this.f205765c[i];
    }

    /* JADX INFO: renamed from: c */
    public qbe m220985c(int i) {
        rf80.m179111b(Boolean.valueOf(i >= 0));
        rf80.m179111b(Boolean.valueOf(i < this.f205766d.length));
        qbe[] qbeVarArr = this.f205766d;
        if (qbeVarArr[i] == null) {
            qbeVarArr[i] = m220983a(i);
        }
        return this.f205766d[i];
    }

    /* JADX INFO: renamed from: d */
    public int m220986d() {
        return this.f205765c.length;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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
    public Drawable m220987e(int i, Drawable drawable) {
        rf80.m179111b(Boolean.valueOf(i >= 0));
        rf80.m179111b(Boolean.valueOf(i < this.f205765c.length));
        Drawable drawable2 = this.f205765c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f205770h) {
                drawable.mutate();
            }
            bce.m101058d(this.f205765c[i], null, null);
            bce.m101058d(drawable, null, null);
            bce.m101059e(drawable, this.f205764b);
            bce.m101055a(drawable, this);
            bce.m101058d(drawable, this, this);
            this.f205769g = false;
            this.f205765c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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
            Drawable[] drawableArr = this.f205765c;
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
        if (this.f205765c.length == 0) {
            return -2;
        }
        int i = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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
        Rect rect2 = this.f205767e;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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

    @Override // p149l.n7j0
    /* JADX INFO: renamed from: h */
    public void mo158145h(RectF rectF) {
        n7j0 n7j0Var = this.f205763a;
        if (n7j0Var != null) {
            n7j0Var.mo158145h(rectF);
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
        if (!this.f205769g) {
            this.f205768f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f205765c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f205768f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f205768f = z2 | z;
                i++;
            }
            this.f205769g = true;
        }
        return this.f205768f;
    }

    @Override // p149l.n7j0
    /* JADX INFO: renamed from: j */
    public void mo158146j(Matrix matrix) {
        n7j0 n7j0Var = this.f205763a;
        if (n7j0Var != null) {
            n7j0Var.mo158146j(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // p149l.m7j0
    /* JADX INFO: renamed from: l */
    public void mo125887l(n7j0 n7j0Var) {
        this.f205763a = n7j0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
            if (i >= drawableArr.length) {
                this.f205770h = true;
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
            Drawable[] drawableArr = this.f205765c;
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
            Drawable[] drawableArr = this.f205765c;
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
            Drawable[] drawableArr = this.f205765c;
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
        this.f205764b.m178596b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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
        this.f205764b.m178597c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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
        this.f205764b.m178598d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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
        this.f205764b.m178599e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f205765c;
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
            Drawable[] drawableArr = this.f205765c;
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
            Drawable[] drawableArr = this.f205765c;
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
