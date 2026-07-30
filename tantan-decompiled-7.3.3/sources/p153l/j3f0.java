package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j3f0 {

    /* JADX INFO: renamed from: a */
    public Matrix f118177a;

    /* JADX INFO: renamed from: l.j3f0$a */
    public interface InterfaceC17865a {
        void onSharedElementsReady();
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m143341a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (intrinsicWidth * fMin);
        int i2 = (int) (intrinsicHeight * fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public Parcelable m143342b(View view, Matrix matrix, RectF rectF) {
        Bitmap bitmapM143341a;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null && (bitmapM143341a = m143341a(drawable)) != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("sharedElement:snapshot:bitmap", bitmapM143341a);
                bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                }
                return bundle;
            }
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
        int i = (int) (iRound * fMin);
        int i2 = (int) (iRound2 * fMin);
        if (this.f118177a == null) {
            this.f118177a = new Matrix();
        }
        this.f118177a.set(matrix);
        this.f118177a.postTranslate(-rectF.left, -rectF.top);
        this.f118177a.postScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.concat(this.f118177a);
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public View m143343c(Context context, Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            if (!(parcelable instanceof Bitmap)) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
            return imageView;
        }
        Bundle bundle = (Bundle) parcelable;
        Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
        if (bitmap == null) {
            return null;
        }
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageBitmap(bitmap);
        imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
        if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
            float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView2.setImageMatrix(matrix);
        }
        return imageView2;
    }

    /* JADX INFO: renamed from: h */
    public void m143348h(List<String> list, List<View> list2, InterfaceC17865a interfaceC17865a) {
        interfaceC17865a.onSharedElementsReady();
    }

    /* JADX INFO: renamed from: e */
    public void m143345e(List<View> list) {
    }

    /* JADX INFO: renamed from: d */
    public void m143344d(List<String> list, Map<String, View> map) {
    }

    /* JADX INFO: renamed from: f */
    public void m143346f(List<String> list, List<View> list2, List<View> list3) {
    }

    /* JADX INFO: renamed from: g */
    public void m143347g(List<String> list, List<View> list2, List<View> list3) {
    }
}
