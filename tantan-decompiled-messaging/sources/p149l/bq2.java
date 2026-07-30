package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class bq2 implements yd80 {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config f76749a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    public static Method f76750b;

    /* JADX INFO: renamed from: d */
    public static void m103349d(Bitmap bitmap, Bitmap bitmap2) {
        if (!a620.m95107a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (f76750b == null) {
                int i = Bitmaps.f6460a;
                f76750b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            f76750b.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e) {
            pkq0.m170054a("Wrong Native code setup, reflection failed.", e);
        } catch (IllegalAccessException e2) {
            pkq0.m170054a("Wrong Native code setup, reflection failed.", e2);
        } catch (NoSuchMethodException e3) {
            pkq0.m170054a("Wrong Native code setup, reflection failed.", e3);
        } catch (InvocationTargetException e4) {
            pkq0.m170054a("Wrong Native code setup, reflection failed.", e4);
        }
    }

    @Override // p149l.yd80
    /* JADX INFO: renamed from: a */
    public cx3 mo102087a() {
        return null;
    }

    @Override // p149l.yd80
    /* JADX INFO: renamed from: b */
    public fa5<Bitmap> mo103350b(Bitmap bitmap, r480 r480Var) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f76749a;
        }
        fa5<Bitmap> fa5VarMo152410d = r480Var.mo152410d(width, height, config);
        try {
            m103351f(fa5VarMo152410d.m120155B(), bitmap);
            return fa5VarMo152410d.clone();
        } finally {
            fa5.m120154v(fa5VarMo152410d);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m103351f(Bitmap bitmap, Bitmap bitmap2) {
        m103349d(bitmap, bitmap2);
        mo102088e(bitmap);
    }

    @Override // p149l.yd80
    public String getName() {
        return "Unknown postprocessor";
    }

    /* JADX INFO: renamed from: e */
    public void mo102088e(Bitmap bitmap) {
    }
}
