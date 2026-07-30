package p149l;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes8.dex */
public class d43 {

    /* JADX INFO: renamed from: a */
    public static Object f84277a = null;

    /* JADX INFO: renamed from: b */
    public static int f84278b = 25;

    /* JADX INFO: renamed from: a */
    public static Bitmap m109969a(Bitmap bitmap, int i, boolean z) {
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
            RenderScript renderScriptCreate = (RenderScript) f84277a;
            if (renderScriptCreate == null) {
                renderScriptCreate = RenderScript.create(App.f15369e);
                f84277a = renderScriptCreate;
            }
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            int i4 = f84278b;
            if (i > i4) {
                i = i4;
            }
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            return bitmap;
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m109970b(Bitmap bitmap, int i, boolean z) {
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
            RenderScript renderScriptCreate = (RenderScript) f84277a;
            if (renderScriptCreate == null) {
                renderScriptCreate = RenderScript.create(App.f15369e);
                f84277a = renderScriptCreate;
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
            CrashHelper.m81296c(th);
            return bitmap;
        }
    }
}
