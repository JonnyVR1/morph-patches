package p149l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
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
public final class sck0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f163748a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    private static final char[] f163749b = new char[64];

    /* JADX INFO: renamed from: l.sck0$a */
    public static /* synthetic */ class C19906a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f163750a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f163750a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f163750a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f163750a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f163750a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f163750a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m183401a() {
        if (m183416p()) {
            return;
        }
        ig3.m135964a("You must call this method on a background thread");
    }

    /* JADX INFO: renamed from: b */
    public static void m183402b() {
        if (m183417q()) {
            return;
        }
        ig3.m135964a("You must call this method on the main thread");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m183403c(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof c600 ? ((c600) obj).m105362a(obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m183404d(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private static String m183405e(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f163748a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> Queue<T> m183406f(int i) {
        return new ArrayDeque(i);
    }

    /* JADX INFO: renamed from: g */
    public static int m183407g(int i, int i2, @Nullable Bitmap.Config config) {
        return i * i2 * m183409i(config);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: h */
    public static int m183408h(@NonNull Bitmap bitmap) {
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
        sb.append(BaseSei.f13930X);
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: i */
    private static int m183409i(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C19906a.f163750a[config.ordinal()];
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
    public static <T> List<T> m183410j(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static int m183411k(float f) {
        return m183412l(f, 17);
    }

    /* JADX INFO: renamed from: l */
    public static int m183412l(float f, int i) {
        return m183413m(Float.floatToIntBits(f), i);
    }

    /* JADX INFO: renamed from: m */
    public static int m183413m(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* JADX INFO: renamed from: n */
    public static int m183414n(@Nullable Object obj, int i) {
        return m183413m(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX INFO: renamed from: o */
    public static int m183415o(boolean z, int i) {
        return m183413m(z ? 1 : 0, i);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m183416p() {
        return !m183417q();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m183417q() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: r */
    private static boolean m183418r(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m183419s(int i, int i2) {
        return m183418r(i) && m183418r(i2);
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static String m183420t(@NonNull byte[] bArr) {
        String strM183405e;
        char[] cArr = f163749b;
        synchronized (cArr) {
            strM183405e = m183405e(bArr, cArr);
        }
        return strM183405e;
    }
}
