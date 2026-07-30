package p007l;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class d43 {

    /* JADX INFO: renamed from: a */
    public static Object f2511a = null;

    /* JADX INFO: renamed from: b */
    public static int f2512b = 25;

    /* JADX INFO: renamed from: a */
    public static Bitmap m8839a(Bitmap bitmap, int i, boolean z) {
        SystemClock.uptimeMillis();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width - (width % 4);
        int i3 = height - (height % 4);
        if (i2 != width || i3 != height) {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        if ((bitmap.getConfig() == null || bitmap.getConfig() != Bitmap.Config.ARGB_8888 || z) && !bitmap.isRecycled()) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        try {
            RenderScript renderScriptCreate = (RenderScript) f2511a;
            if (renderScriptCreate == null) {
                renderScriptCreate = RenderScript.create(App.f1068e);
                f2511a = renderScriptCreate;
            }
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            int i4 = f2512b;
            if (i > i4) {
                i = i4;
            }
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            return bitmap;
        } catch (Throwable th) {
            CrashHelper.c(th);
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m8840b(Bitmap bitmap, int i, boolean z) {
        SystemClock.uptimeMillis();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width - (width % 4);
        int i3 = height - (height % 4);
        if (i2 != width || i3 != height) {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        if ((bitmap.getConfig() == null || bitmap.getConfig() != Bitmap.Config.ARGB_8888 || z) && !bitmap.isRecycled()) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        try {
            RenderScript renderScriptCreate = (RenderScript) f2511a;
            if (renderScriptCreate == null) {
                renderScriptCreate = RenderScript.create(App.f1068e);
                f2511a = renderScriptCreate;
            }
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            return bitmap;
        } catch (Throwable th) {
            CrashHelper.c(th);
            return bitmap;
        }
    }
}
