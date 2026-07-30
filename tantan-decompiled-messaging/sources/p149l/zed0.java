package p149l;

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
public class zed0 extends gfd0 {

    /* JADX INFO: renamed from: J */
    public static boolean f202797J = false;

    /* JADX INFO: renamed from: D */
    public final Paint f202798D;

    /* JADX INFO: renamed from: E */
    public final Paint f202799E;

    /* JADX INFO: renamed from: F */
    public final Bitmap f202800F;

    /* JADX INFO: renamed from: G */
    public WeakReference<Bitmap> f202801G;

    /* JADX INFO: renamed from: H */
    public boolean f202802H;

    /* JADX INFO: renamed from: I */
    public RectF f202803I;

    public zed0(Resources resources, Bitmap bitmap, Paint paint, boolean z) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f202798D = paint2;
        Paint paint3 = new Paint(1);
        this.f202799E = paint3;
        this.f202803I = null;
        this.f202800F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f202802H = z;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m218281p() {
        return f202797J;
    }

    @Override // p149l.gfd0, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (o6j.m162852d()) {
            o6j.m162850a("RoundedBitmapDrawable#draw");
        }
        if (!mo125885j()) {
            super.draw(canvas);
            if (o6j.m162852d()) {
                o6j.m162851b();
                return;
            }
            return;
        }
        mo125888o();
        m125886k();
        m218282q();
        int iSave = canvas.save();
        canvas.concat(this.f102382u);
        if (this.f202802H || this.f202803I == null) {
            canvas.drawPath(this.f102366e, this.f202798D);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f202803I);
            canvas.drawPath(this.f102366e, this.f202798D);
            canvas.restoreToCount(iSave2);
        }
        float f = this.f102365d;
        if (f > 0.0f) {
            this.f202799E.setStrokeWidth(f);
            this.f202799E.setColor(bce.m101057c(this.f102368g, this.f202798D.getAlpha()));
            canvas.drawPath(this.f102369h, this.f202799E);
        }
        canvas.restoreToCount(iSave);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
    }

    @Override // p149l.gfd0, p149l.yed0
    /* JADX INFO: renamed from: f */
    public void mo8241f(boolean z) {
        this.f202802H = z;
    }

    @Override // p149l.gfd0
    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public boolean mo125885j() {
        return super.mo125885j() && this.f202800F != null;
    }

    @Override // p149l.gfd0
    /* JADX INFO: renamed from: o */
    public void mo125888o() {
        super.mo125888o();
        if (this.f202802H) {
            return;
        }
        if (this.f202803I == null) {
            this.f202803I = new RectF();
        }
        this.f102385x.mapRect(this.f202803I, this.f102375n);
    }

    /* JADX INFO: renamed from: q */
    public final void m218282q() {
        Shader shader;
        WeakReference<Bitmap> weakReference = this.f202801G;
        if (weakReference == null || weakReference.get() != this.f202800F) {
            this.f202801G = new WeakReference<>(this.f202800F);
            if (this.f202800F != null) {
                Paint paint = this.f202798D;
                Bitmap bitmap = this.f202800F;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f102367f = true;
            }
        }
        if (this.f102367f && (shader = this.f202798D.getShader()) != null) {
            shader.setLocalMatrix(this.f102385x);
            this.f102367f = false;
        }
        this.f202798D.setFilterBitmap(m125884h());
    }

    @Override // p149l.gfd0, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f202798D.getAlpha()) {
            this.f202798D.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // p149l.gfd0, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f202798D.setColorFilter(colorFilter);
    }
}
