package p149l;

import android.content.res.Resources;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sub {
    /* JADX INFO: renamed from: a */
    public static float m186004a(float f, float f2, float f3) {
        return Math.max(Math.min(f, f3), f2);
    }

    /* JADX INFO: renamed from: b */
    public static void m186005b(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m186006c(int i, int i2, int i3, int i4, RectF rectF) {
        rectF.set(Math.max(rectF.left, i), Math.max(rectF.top, i2), Math.min(rectF.right, i3), Math.min(rectF.bottom, i4));
    }

    /* JADX INFO: renamed from: d */
    public static void m186007d(@Nullable File file) {
        if (file != null) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m186008e(int i) {
        return Math.round(Resources.getSystem().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: f */
    public static RectF m186009f(float f, @NonNull RectF rectF) {
        rectF.top -= f;
        rectF.bottom += f;
        rectF.left -= f;
        rectF.right += f;
        return rectF;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m186010g(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static RectF m186011h(@NonNull RectF rectF, float f, float f2, int i, int i2, @NonNull RectF rectF2) {
        float fM186004a = m186004a(rectF.left + f, 0.0f, i - rectF.width());
        float fWidth = rectF.width() + fM186004a;
        float fM186004a2 = m186004a(rectF.top + f2, 0.0f, i2 - rectF.height());
        rectF2.set(fM186004a, fM186004a2, fWidth, rectF.height() + fM186004a2);
        return rectF2;
    }
}
