package p149l;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class mu0 {

    /* JADX INFO: renamed from: c */
    public static final int[] f135715c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final ProgressBar f135716a;

    /* JADX INFO: renamed from: b */
    public Bitmap f135717b;

    public mu0(ProgressBar progressBar) {
        this.f135716a = progressBar;
    }

    /* JADX INFO: renamed from: a */
    public final Shape m156367a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m156368b() {
        return this.f135717b;
    }

    /* JADX INFO: renamed from: c */
    public void mo156369c(AttributeSet attributeSet, int i) {
        qri0 qri0VarM175993u = qri0.m175993u(this.f135716a.getContext(), attributeSet, f135715c, i, 0);
        Drawable drawableM176001h = qri0VarM175993u.m176001h(0);
        if (drawableM176001h != null) {
            this.f135716a.setIndeterminateDrawable(m156371e(drawableM176001h));
        }
        Drawable drawableM176001h2 = qri0VarM175993u.m176001h(1);
        if (drawableM176001h2 != null) {
            this.f135716a.setProgressDrawable(m156370d(drawableM176001h2, false));
        }
        qri0VarM175993u.m176012v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Drawable m156370d(Drawable drawable, boolean z) {
        if (drawable instanceof ibq0) {
            ibq0 ibq0Var = (ibq0) drawable;
            Drawable drawableM135269b = ibq0Var.m135269b();
            if (drawableM135269b != null) {
                ibq0Var.m135268a(m156370d(drawableM135269b, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m156370d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f135717b == null) {
                    this.f135717b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m156367a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m156371e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable drawableM156370d = m156370d(animationDrawable.getFrame(i), true);
            drawableM156370d.setLevel(10000);
            animationDrawable2.addFrame(drawableM156370d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
