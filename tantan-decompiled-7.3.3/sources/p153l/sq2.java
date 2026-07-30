package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class sq2 implements fm80 {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config f170125a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    public static Method f170126b;

    /* JADX INFO: renamed from: d */
    public static void m187504d(Bitmap bitmap, Bitmap bitmap2) {
        if (!ie20.m139588a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (f170126b == null) {
                int i = Bitmaps.f6497a;
                f170126b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            f170126b.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e) {
            vtq0.m202761a("Wrong Native code setup, reflection failed.", e);
        } catch (IllegalAccessException e2) {
            vtq0.m202761a("Wrong Native code setup, reflection failed.", e2);
        } catch (NoSuchMethodException e3) {
            vtq0.m202761a("Wrong Native code setup, reflection failed.", e3);
        } catch (InvocationTargetException e4) {
            vtq0.m202761a("Wrong Native code setup, reflection failed.", e4);
        }
    }

    @Override // p153l.fm80
    /* JADX INFO: renamed from: a */
    public by3 mo104840a() {
        return null;
    }

    @Override // p153l.fm80
    /* JADX INFO: renamed from: b */
    public fb5<Bitmap> mo126182b(Bitmap bitmap, xc80 xc80Var) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f170125a;
        }
        fb5<Bitmap> fb5VarMo188699d = xc80Var.mo188699d(width, height, config);
        try {
            m187505f(fb5VarMo188699d.m124875B(), bitmap);
            return fb5VarMo188699d.clone();
        } finally {
            fb5.m124874v(fb5VarMo188699d);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m187505f(Bitmap bitmap, Bitmap bitmap2) {
        m187504d(bitmap, bitmap2);
        mo104841e(bitmap);
    }

    @Override // p153l.fm80
    public String getName() {
        return "Unknown postprocessor";
    }

    /* JADX INFO: renamed from: e */
    public void mo104841e(Bitmap bitmap) {
    }
}
