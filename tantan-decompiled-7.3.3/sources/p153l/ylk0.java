package p153l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class ylk0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f200557a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f200558b = new char[64];

    /* JADX INFO: renamed from: c */
    @Nullable
    private static volatile Handler f200559c;

    /* JADX INFO: renamed from: l.ylk0$a */
    public static /* synthetic */ class C21625a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f200560a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f200560a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f200560a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f200560a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f200560a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f200560a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private ylk0() {
    }

    /* JADX INFO: renamed from: a */
    public static void m216577a() {
        if (m216594r()) {
            return;
        }
        wg3.m206174a("You must call this method on a background thread");
    }

    /* JADX INFO: renamed from: b */
    public static void m216578b() {
        if (m216595s()) {
            return;
        }
        wg3.m206174a("You must call this method on the main thread");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m216579c(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof le00 ? ((le00) obj).m153826a(obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m216580d(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private static String m216581e(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f200557a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> Queue<T> m216582f(int i) {
        return new ArrayDeque(i);
    }

    /* JADX INFO: renamed from: g */
    public static int m216583g(int i, int i2, @Nullable Bitmap.Config config) {
        return i * i2 * m216585i(config);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: h */
    public static int m216584h(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append(BaseSei.f14624X);
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: i */
    public static int m216585i(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C21625a.f200560a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static <T> List<T> m216586j(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private static Handler m216587k() {
        if (f200559c == null) {
            synchronized (ylk0.class) {
                try {
                    if (f200559c == null) {
                        f200559c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f200559c;
    }

    /* JADX INFO: renamed from: l */
    public static int m216588l(float f) {
        return m216589m(f, 17);
    }

    /* JADX INFO: renamed from: m */
    public static int m216589m(float f, int i) {
        return m216591o(Float.floatToIntBits(f), i);
    }

    /* JADX INFO: renamed from: n */
    public static int m216590n(int i) {
        return m216591o(i, 17);
    }

    /* JADX INFO: renamed from: o */
    public static int m216591o(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* JADX INFO: renamed from: p */
    public static int m216592p(@Nullable Object obj, int i) {
        return m216591o(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX INFO: renamed from: q */
    public static int m216593q(boolean z, int i) {
        return m216591o(z ? 1 : 0, i);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m216594r() {
        return !m216595s();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m216595s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: t */
    private static boolean m216596t(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m216597u(int i, int i2) {
        return m216596t(i) && m216596t(i2);
    }

    /* JADX INFO: renamed from: v */
    public static void m216598v(Runnable runnable) {
        m216587k().post(runnable);
    }

    /* JADX INFO: renamed from: w */
    public static void m216599w(Runnable runnable) {
        m216587k().removeCallbacks(runnable);
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public static String m216600x(@NonNull byte[] bArr) {
        String strM216581e;
        char[] cArr = f200558b;
        synchronized (cArr) {
            strM216581e = m216581e(bArr, cArr);
        }
        return strM216581e;
    }
}
