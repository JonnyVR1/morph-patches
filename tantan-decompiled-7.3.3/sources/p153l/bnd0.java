package p153l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class bnd0 extends jnd0 {

    /* JADX INFO: renamed from: J */
    public static boolean f77454J = false;

    /* JADX INFO: renamed from: D */
    public final Paint f77455D;

    /* JADX INFO: renamed from: E */
    public final Paint f77456E;

    /* JADX INFO: renamed from: F */
    public final Bitmap f77457F;

    /* JADX INFO: renamed from: G */
    public WeakReference<Bitmap> f77458G;

    /* JADX INFO: renamed from: H */
    public boolean f77459H;

    /* JADX INFO: renamed from: I */
    public RectF f77460I;

    public bnd0(Resources resources, Bitmap bitmap, Paint paint, boolean z) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f77455D = paint2;
        Paint paint3 = new Paint(1);
        this.f77456E = paint3;
        this.f77460I = null;
        this.f77457F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f77459H = z;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m105371p() {
        return f77454J;
    }

    @Override // p153l.jnd0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (i9j.m139099d()) {
            i9j.m139097a("RoundedBitmapDrawable#draw");
        }
        if (!mo105372j()) {
            super.draw(canvas);
            if (i9j.m139099d()) {
                i9j.m139098b();
                return;
            }
            return;
        }
        mo105373o();
        m146237k();
        m105374q();
        int iSave = canvas.save();
        canvas.concat(this.f121826u);
        if (this.f77459H || this.f77460I == null) {
            canvas.drawPath(this.f121810e, this.f77455D);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f77460I);
            canvas.drawPath(this.f121810e, this.f77455D);
            canvas.restoreToCount(iSave2);
        }
        float f = this.f121809d;
        if (f > 0.0f) {
            this.f77456E.setStrokeWidth(f);
            this.f77456E.setColor(fde.m125088c(this.f121812g, this.f77455D.getAlpha()));
            canvas.drawPath(this.f121813h, this.f77456E);
        }
        canvas.restoreToCount(iSave);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
    }

    @Override // p153l.jnd0, p153l.and0
    /* JADX INFO: renamed from: f */
    public void mo8295f(boolean z) {
        this.f77459H = z;
    }

    @Override // p153l.jnd0
    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public boolean mo105372j() {
        return super.mo105372j() && this.f77457F != null;
    }

    @Override // p153l.jnd0
    /* JADX INFO: renamed from: o */
    public void mo105373o() {
        super.mo105373o();
        if (this.f77459H) {
            return;
        }
        if (this.f77460I == null) {
            this.f77460I = new RectF();
        }
        this.f121829x.mapRect(this.f77460I, this.f121819n);
    }

    /* JADX INFO: renamed from: q */
    public final void m105374q() {
        Shader shader;
        WeakReference<Bitmap> weakReference = this.f77458G;
        if (weakReference == null || weakReference.get() != this.f77457F) {
            this.f77458G = new WeakReference<>(this.f77457F);
            if (this.f77457F != null) {
                Paint paint = this.f77455D;
                Bitmap bitmap = this.f77457F;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f121811f = true;
            }
        }
        if (this.f121811f && (shader = this.f77455D.getShader()) != null) {
            shader.setLocalMatrix(this.f121829x);
            this.f121811f = false;
        }
        this.f77455D.setFilterBitmap(m146236h());
    }

    @Override // p153l.jnd0, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f77455D.getAlpha()) {
            this.f77455D.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // p153l.jnd0, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f77455D.setColorFilter(colorFilter);
    }
}
