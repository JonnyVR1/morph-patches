package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextPaint;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class r13 extends x23 {
    /* JADX INFO: renamed from: a */
    public static Bitmap m177436a(Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap == null) {
            jfd0.m141176a("Bitmap can't be null");
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width > height) {
            f2 = (width - height) / 2.0f;
            width = height;
            f = 0.0f;
        } else {
            f = (height - width) / 2.0f;
            f2 = 0.0f;
        }
        float f3 = i;
        float f4 = (1.0f * f3) / width;
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f4);
        int i3 = (int) width;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) f2, (int) f, i3, i3, matrix, true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        float f5 = i2;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, f3, f3), f5, f5, paint);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: b */
    public static String m177437b(String str, int i, TextPaint textPaint) {
        if (str == null || i <= 0 || str.length() <= 0) {
            return str;
        }
        int i2 = 1;
        String str2 = str;
        while (i2 < str.length()) {
            String strConcat = str.substring(0, i2).concat("...");
            if (textPaint.measureText(strConcat) > i) {
                break;
            }
            i2++;
            str2 = strConcat;
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m177438c(String str, int i, int i2, int i3, int i4) {
        return m177439d(str, i, i2, i3, i4, null);
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m177439d(String str, int i, int i2, int i3, int i4, Typeface typeface) {
        TextPaint textPaint = new TextPaint();
        if (NullChecker.m81303a(typeface)) {
            textPaint.setTypeface(typeface);
        } else {
            textPaint.setTypeface(eqh0.m117752c(2));
        }
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setColor(i3);
        textPaint.setFlags(textPaint.getFlags() | 128);
        float f = textPaint.getFontMetrics().descent;
        int i5 = (int) (f - textPaint.getFontMetrics().ascent);
        int iMeasureText = (int) textPaint.measureText(str);
        int iMin = i2 == 0 ? iMeasureText : Math.min(iMeasureText, i2);
        if (i2 != 0 && iMeasureText > i2) {
            str = m177437b(str, i2, textPaint);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i4);
        canvas.drawText(str, 0.0f, i5 - f, textPaint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e */
    public static void m177440e(SimpleDraweeView simpleDraweeView, String str, bc70 bc70Var) {
        m177441f(simpleDraweeView, str, bc70Var, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m177441f(SimpleDraweeView simpleDraweeView, String str, bc70 bc70Var, ym2 ym2Var) {
        simpleDraweeView.setController(l6j.m148750g().mo8210b(simpleDraweeView.getController()).m8205C(ImageRequestBuilder.m8592y(Uri.parse(str)).m8603K(new diq(bc70Var, str)).m8614a()).m8204B(new sl2.C19981b(ym2Var)).build());
    }

    /* JADX INFO: renamed from: g */
    public static j760<Integer, Integer> m177442g(int i) {
        return new j760<>(4, Integer.valueOf((100 - i) / 4));
    }
}
