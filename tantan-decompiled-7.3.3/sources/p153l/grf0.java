package p153l;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class grf0 implements ahw {

    /* JADX INFO: renamed from: d */
    private static final Bitmap.Config[] f106023d;

    /* JADX INFO: renamed from: e */
    private static final Bitmap.Config[] f106024e;

    /* JADX INFO: renamed from: f */
    private static final Bitmap.Config[] f106025f;

    /* JADX INFO: renamed from: g */
    private static final Bitmap.Config[] f106026g;

    /* JADX INFO: renamed from: h */
    private static final Bitmap.Config[] f106027h;

    /* JADX INFO: renamed from: a */
    private final C17280c f106028a = new C17280c();

    /* JADX INFO: renamed from: b */
    private final nqk<C17279b, Bitmap> f106029b = new nqk<>();

    /* JADX INFO: renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f106030c = new HashMap();

    /* JADX INFO: renamed from: l.grf0$a */
    public static /* synthetic */ class C17278a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f106031a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f106031a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106031a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106031a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106031a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.grf0$b */
    @VisibleForTesting
    public static final class C17279b implements dj80 {

        /* JADX INFO: renamed from: a */
        private final C17280c f106032a;

        /* JADX INFO: renamed from: b */
        int f106033b;

        /* JADX INFO: renamed from: c */
        private Bitmap.Config f106034c;

        public C17279b(C17280c c17280c) {
            this.f106032a = c17280c;
        }

        @Override // p153l.dj80
        /* JADX INFO: renamed from: a */
        public void mo116071a() {
            this.f106032a.m173001c(this);
        }

        /* JADX INFO: renamed from: b */
        public void m131793b(int i, Bitmap.Config config) {
            this.f106033b = i;
            this.f106034c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C17279b) {
                C17279b c17279b = (C17279b) obj;
                if (this.f106033b == c17279b.f106033b && ylk0.m216580d(this.f106034c, c17279b.f106034c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f106033b * 31;
            Bitmap.Config config = this.f106034c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return grf0.m131790h(this.f106033b, this.f106034c);
        }
    }

    /* JADX INFO: renamed from: l.grf0$c */
    @VisibleForTesting
    public static class C17280c extends pn2<C17279b> {
        @Override // p153l.pn2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C17279b mo131794a() {
            return new C17279b(this);
        }

        /* JADX INFO: renamed from: e */
        public C17279b m131796e(int i, Bitmap.Config config) {
            C17279b c17279bM173000b = m173000b();
            c17279bM173000b.m131793b(i, config);
            return c17279bM173000b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f106023d = configArr;
        f106024e = configArr;
        f106025f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f106026g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f106027h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: f */
    private void m131788f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapM131792j = m131792j(bitmap.getConfig());
        Integer num2 = navigableMapM131792j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM131792j.remove(num);
                return;
            } else {
                navigableMapM131792j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strMo97939e = mo97939e(bitmap);
        sb.append(", removed: ");
        sb.append(strMo97939e);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    private C17279b m131789g(int i, Bitmap.Config config) {
        C17279b c17279bM131796e = this.f106028a.m131796e(i, config);
        for (Bitmap.Config config2 : m131791i(config)) {
            Integer numCeilingKey = m131792j(config2).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f106028a.m173001c(c17279bM131796e);
                return this.f106028a.m131796e(numCeilingKey.intValue(), config2);
            }
        }
        return c17279bM131796e;
    }

    /* JADX INFO: renamed from: h */
    public static String m131790h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* JADX INFO: renamed from: i */
    private static Bitmap.Config[] m131791i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f106024e;
        }
        int i = C17278a.f106031a[config.ordinal()];
        if (i == 1) {
            return f106023d;
        }
        if (i == 2) {
            return f106025f;
        }
        if (i != 3) {
            return i != 4 ? new Bitmap.Config[]{config} : f106027h;
        }
        return f106026g;
    }

    /* JADX INFO: renamed from: j */
    private NavigableMap<Integer, Integer> m131792j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f106030c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f106030c.put(config, treeMap);
        return treeMap;
    }

    @Override // p153l.ahw
    /* JADX INFO: renamed from: a */
    public String mo97935a(int i, int i2, Bitmap.Config config) {
        return m131790h(ylk0.m216583g(i, i2, config), config);
    }

    @Override // p153l.ahw
    /* JADX INFO: renamed from: b */
    public int mo97936b(Bitmap bitmap) {
        return ylk0.m216584h(bitmap);
    }

    @Override // p153l.ahw
    /* JADX INFO: renamed from: c */
    public void mo97937c(Bitmap bitmap) {
        C17279b c17279bM131796e = this.f106028a.m131796e(ylk0.m216584h(bitmap), bitmap.getConfig());
        this.f106029b.m164328d(c17279bM131796e, bitmap);
        NavigableMap<Integer, Integer> navigableMapM131792j = m131792j(bitmap.getConfig());
        Integer num = navigableMapM131792j.get(Integer.valueOf(c17279bM131796e.f106033b));
        navigableMapM131792j.put(Integer.valueOf(c17279bM131796e.f106033b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p153l.ahw
    @Nullable
    /* JADX INFO: renamed from: d */
    public Bitmap mo97938d(int i, int i2, Bitmap.Config config) {
        C17279b c17279bM131789g = m131789g(ylk0.m216583g(i, i2, config), config);
        Bitmap bitmapM164327a = this.f106029b.m164327a(c17279bM131789g);
        if (bitmapM164327a != null) {
            m131788f(Integer.valueOf(c17279bM131789g.f106033b), bitmapM164327a);
            bitmapM164327a.reconfigure(i, i2, config);
        }
        return bitmapM164327a;
    }

    @Override // p153l.ahw
    /* JADX INFO: renamed from: e */
    public String mo97939e(Bitmap bitmap) {
        return m131790h(ylk0.m216584h(bitmap), bitmap.getConfig());
    }

    @Override // p153l.ahw
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapM164329f = this.f106029b.m164329f();
        if (bitmapM164329f != null) {
            m131788f(Integer.valueOf(ylk0.m216584h(bitmapM164329f)), bitmapM164329f);
        }
        return bitmapM164329f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f106029b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f106030c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f106030c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
