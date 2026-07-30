package p149l;

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
public class xif0 implements cfw {

    /* JADX INFO: renamed from: d */
    private static final Bitmap.Config[] f193105d;

    /* JADX INFO: renamed from: e */
    private static final Bitmap.Config[] f193106e;

    /* JADX INFO: renamed from: f */
    private static final Bitmap.Config[] f193107f;

    /* JADX INFO: renamed from: g */
    private static final Bitmap.Config[] f193108g;

    /* JADX INFO: renamed from: h */
    private static final Bitmap.Config[] f193109h;

    /* JADX INFO: renamed from: a */
    private final C21158c f193110a = new C21158c();

    /* JADX INFO: renamed from: b */
    private final xnk<C21157b, Bitmap> f193111b = new xnk<>();

    /* JADX INFO: renamed from: c */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f193112c = new HashMap();

    /* JADX INFO: renamed from: l.xif0$a */
    public static /* synthetic */ class C21156a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f193113a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f193113a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f193113a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f193113a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f193113a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.xif0$b */
    @VisibleForTesting
    public static final class C21157b implements xa80 {

        /* JADX INFO: renamed from: a */
        private final C21158c f193114a;

        /* JADX INFO: renamed from: b */
        int f193115b;

        /* JADX INFO: renamed from: c */
        private Bitmap.Config f193116c;

        public C21157b(C21158c c21158c) {
            this.f193114a = c21158c;
        }

        @Override // p149l.xa80
        /* JADX INFO: renamed from: a */
        public void mo188636a() {
            this.f193114a.m137122c(this);
        }

        /* JADX INFO: renamed from: b */
        public void m209644b(int i, Bitmap.Config config) {
            this.f193115b = i;
            this.f193116c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C21157b) {
                C21157b c21157b = (C21157b) obj;
                if (this.f193115b == c21157b.f193115b && sck0.m183404d(this.f193116c, c21157b.f193116c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f193115b * 31;
            Bitmap.Config config = this.f193116c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return xif0.m209641h(this.f193115b, this.f193116c);
        }
    }

    /* JADX INFO: renamed from: l.xif0$c */
    @VisibleForTesting
    public static class C21158c extends in2<C21157b> {
        @Override // p149l.in2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C21157b mo137120a() {
            return new C21157b(this);
        }

        /* JADX INFO: renamed from: e */
        public C21157b m209646e(int i, Bitmap.Config config) {
            C21157b c21157bM137121b = m137121b();
            c21157bM137121b.m209644b(i, config);
            return c21157bM137121b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f193105d = configArr;
        f193106e = configArr;
        f193107f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f193108g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f193109h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: f */
    private void m209639f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapM209643j = m209643j(bitmap.getConfig());
        Integer num2 = navigableMapM209643j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM209643j.remove(num);
                return;
            } else {
                navigableMapM209643j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strMo106612e = mo106612e(bitmap);
        sb.append(", removed: ");
        sb.append(strMo106612e);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    private C21157b m209640g(int i, Bitmap.Config config) {
        C21157b c21157bM209646e = this.f193110a.m209646e(i, config);
        for (Bitmap.Config config2 : m209642i(config)) {
            Integer numCeilingKey = m209643j(config2).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f193110a.m137122c(c21157bM209646e);
                return this.f193110a.m209646e(numCeilingKey.intValue(), config2);
            }
        }
        return c21157bM209646e;
    }

    /* JADX INFO: renamed from: h */
    public static String m209641h(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* JADX INFO: renamed from: i */
    private static Bitmap.Config[] m209642i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f193106e;
        }
        int i = C21156a.f193113a[config.ordinal()];
        if (i == 1) {
            return f193105d;
        }
        if (i == 2) {
            return f193107f;
        }
        if (i != 3) {
            return i != 4 ? new Bitmap.Config[]{config} : f193109h;
        }
        return f193108g;
    }

    /* JADX INFO: renamed from: j */
    private NavigableMap<Integer, Integer> m209643j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f193112c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f193112c.put(config, treeMap);
        return treeMap;
    }

    @Override // p149l.cfw
    /* JADX INFO: renamed from: a */
    public String mo106608a(int i, int i2, Bitmap.Config config) {
        return m209641h(sck0.m183407g(i, i2, config), config);
    }

    @Override // p149l.cfw
    /* JADX INFO: renamed from: b */
    public int mo106609b(Bitmap bitmap) {
        return sck0.m183408h(bitmap);
    }

    @Override // p149l.cfw
    /* JADX INFO: renamed from: c */
    public void mo106610c(Bitmap bitmap) {
        C21157b c21157bM209646e = this.f193110a.m209646e(sck0.m183408h(bitmap), bitmap.getConfig());
        this.f193111b.m210178d(c21157bM209646e, bitmap);
        NavigableMap<Integer, Integer> navigableMapM209643j = m209643j(bitmap.getConfig());
        Integer num = navigableMapM209643j.get(Integer.valueOf(c21157bM209646e.f193115b));
        navigableMapM209643j.put(Integer.valueOf(c21157bM209646e.f193115b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p149l.cfw
    @Nullable
    /* JADX INFO: renamed from: d */
    public Bitmap mo106611d(int i, int i2, Bitmap.Config config) {
        C21157b c21157bM209640g = m209640g(sck0.m183407g(i, i2, config), config);
        Bitmap bitmapM210177a = this.f193111b.m210177a(c21157bM209640g);
        if (bitmapM210177a != null) {
            m209639f(Integer.valueOf(c21157bM209640g.f193115b), bitmapM210177a);
            bitmapM210177a.reconfigure(i, i2, config);
        }
        return bitmapM210177a;
    }

    @Override // p149l.cfw
    /* JADX INFO: renamed from: e */
    public String mo106612e(Bitmap bitmap) {
        return m209641h(sck0.m183408h(bitmap), bitmap.getConfig());
    }

    @Override // p149l.cfw
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapM210179f = this.f193111b.m210179f();
        if (bitmapM210179f != null) {
            m209639f(Integer.valueOf(sck0.m183408h(bitmapM210179f)), bitmapM210179f);
        }
        return bitmapM210179f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f193111b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f193112c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f193112c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
