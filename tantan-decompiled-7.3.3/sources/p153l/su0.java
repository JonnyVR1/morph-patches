package p153l;

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
public class su0 {

    /* JADX INFO: renamed from: c */
    public static final int[] f170632c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final ProgressBar f170633a;

    /* JADX INFO: renamed from: b */
    public Bitmap f170634b;

    public su0(ProgressBar progressBar) {
        this.f170633a = progressBar;
    }

    /* JADX INFO: renamed from: a */
    public final Shape m187977a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m187978b() {
        return this.f170634b;
    }

    /* JADX INFO: renamed from: c */
    public void mo187979c(AttributeSet attributeSet, int i) {
        t0j0 t0j0VarM188782u = t0j0.m188782u(this.f170633a.getContext(), attributeSet, f170632c, i, 0);
        Drawable drawableM188790h = t0j0VarM188782u.m188790h(0);
        if (drawableM188790h != null) {
            this.f170633a.setIndeterminateDrawable(m187981e(drawableM188790h));
        }
        Drawable drawableM188790h2 = t0j0VarM188782u.m188790h(1);
        if (drawableM188790h2 != null) {
            this.f170633a.setProgressDrawable(m187980d(drawableM188790h2, false));
        }
        t0j0VarM188782u.m188801v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Drawable m187980d(Drawable drawable, boolean z) {
        if (drawable instanceof nkq0) {
            nkq0 nkq0Var = (nkq0) drawable;
            Drawable drawableM163664b = nkq0Var.m163664b();
            if (drawableM163664b != null) {
                nkq0Var.m163663a(m187980d(drawableM163664b, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m187980d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
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
                if (this.f170634b == null) {
                    this.f170634b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m187977a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m187981e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable drawableM187980d = m187980d(animationDrawable.getFrame(i), true);
            drawableM187980d.setLevel(10000);
            animationDrawable2.addFrame(drawableM187980d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
