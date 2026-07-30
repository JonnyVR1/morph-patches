package p153l;

import android.content.res.Resources;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gwb {
    /* JADX INFO: renamed from: a */
    public static float m132648a(float f, float f2, float f3) {
        return Math.max(Math.min(f, f3), f2);
    }

    /* JADX INFO: renamed from: b */
    public static void m132649b(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m132650c(int i, int i2, int i3, int i4, RectF rectF) {
        rectF.set(Math.max(rectF.left, i), Math.max(rectF.top, i2), Math.min(rectF.right, i3), Math.min(rectF.bottom, i4));
    }

    /* JADX INFO: renamed from: d */
    public static void m132651d(@Nullable File file) {
        if (file != null) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m132652e(int i) {
        return Math.round(Resources.getSystem().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: f */
    public static RectF m132653f(float f, @NonNull RectF rectF) {
        rectF.top -= f;
        rectF.bottom += f;
        rectF.left -= f;
        rectF.right += f;
        return rectF;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m132654g(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static RectF m132655h(@NonNull RectF rectF, float f, float f2, int i, int i2, @NonNull RectF rectF2) {
        float fM132648a = m132648a(rectF.left + f, 0.0f, i - rectF.width());
        float fWidth = rectF.width() + fM132648a;
        float fM132648a2 = m132648a(rectF.top + f2, 0.0f, i2 - rectF.height());
        rectF2.set(fM132648a, fM132648a2, fWidth, rectF.height() + fM132648a2);
        return rectF2;
    }
}
