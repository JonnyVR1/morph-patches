package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import androidx.legacy.widget.Space;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tencent.liteav.TXLiteAVCode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p153l.dic0;
import p153l.kkl0;
import p153l.pac0;
import p153l.zkl0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayout extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public static final AbstractC0438i f2152A;

    /* JADX INFO: renamed from: B */
    public static final AbstractC0438i f2153B;

    /* JADX INFO: renamed from: C */
    public static final AbstractC0438i f2154C;

    /* JADX INFO: renamed from: i */
    public static final Printer f2155i = new LogPrinter(3, GridLayout.class.getName());

    /* JADX INFO: renamed from: j */
    public static final Printer f2156j = new C0430a();

    /* JADX INFO: renamed from: k */
    public static final int f2157k = dic0.f88608e;

    /* JADX INFO: renamed from: l */
    public static final int f2158l = dic0.f88609f;

    /* JADX INFO: renamed from: m */
    public static final int f2159m = dic0.f88606c;

    /* JADX INFO: renamed from: n */
    public static final int f2160n = dic0.f88611h;

    /* JADX INFO: renamed from: o */
    public static final int f2161o = dic0.f88605b;

    /* JADX INFO: renamed from: p */
    public static final int f2162p = dic0.f88610g;

    /* JADX INFO: renamed from: q */
    public static final int f2163q = dic0.f88607d;

    /* JADX INFO: renamed from: r */
    public static final AbstractC0438i f2164r = new C0431b();

    /* JADX INFO: renamed from: s */
    public static final AbstractC0438i f2165s;

    /* JADX INFO: renamed from: t */
    public static final AbstractC0438i f2166t;

    /* JADX INFO: renamed from: u */
    public static final AbstractC0438i f2167u;

    /* JADX INFO: renamed from: v */
    public static final AbstractC0438i f2168v;

    /* JADX INFO: renamed from: w */
    public static final AbstractC0438i f2169w;

    /* JADX INFO: renamed from: x */
    public static final AbstractC0438i f2170x;

    /* JADX INFO: renamed from: y */
    public static final AbstractC0438i f2171y;

    /* JADX INFO: renamed from: z */
    public static final AbstractC0438i f2172z;

    /* JADX INFO: renamed from: a */
    public final C0440k f2173a;

    /* JADX INFO: renamed from: b */
    public final C0440k f2174b;

    /* JADX INFO: renamed from: c */
    public int f2175c;

    /* JADX INFO: renamed from: d */
    public boolean f2176d;

    /* JADX INFO: renamed from: e */
    public int f2177e;

    /* JADX INFO: renamed from: f */
    public int f2178f;

    /* JADX INFO: renamed from: g */
    public int f2179g;

    /* JADX INFO: renamed from: h */
    public Printer f2180h;

    public static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<K> keyType;
        private final Class<V> valueType;

        private Assoc(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        /* JADX INFO: renamed from: of */
        public static <K, V> Assoc<K, V> m2882of(Class<K> cls, Class<V> cls2) {
            return new Assoc<>(cls, cls2);
        }

        public C0445p<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = get(i).first;
                objArr2[i] = get(i).second;
            }
            return new C0445p<>(objArr, objArr2);
        }

        public void put(K k, V v2) {
            add(Pair.create(k, v2));
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$a */
    public static class C0430a implements Printer {
        @Override // android.util.Printer
        public void println(String str) {
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$b */
    public static class C0431b extends AbstractC0438i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: a */
        public int mo2883a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: c */
        public String mo2884c() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: d */
        public int mo2885d(View view, int i) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$c */
    public static class C0432c extends AbstractC0438i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: a */
        public int mo2883a(View view, int i, int i2) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: c */
        public String mo2884c() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: d */
        public int mo2885d(View view, int i) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$d */
    public static class C0433d extends AbstractC0438i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: a */
        public int mo2883a(View view, int i, int i2) {
            return i;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: c */
        public String mo2884c() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: d */
        public int mo2885d(View view, int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$e */
    public static class C0434e extends AbstractC0438i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0438i f2181a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0438i f2182b;

        public C0434e(AbstractC0438i abstractC0438i, AbstractC0438i abstractC0438i2) {
            this.f2181a = abstractC0438i;
            this.f2182b = abstractC0438i2;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: a */
        public int mo2883a(View view, int i, int i2) {
            return (kkl0.m150191x(view) == 1 ? this.f2182b : this.f2181a).mo2883a(view, i, i2);
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: c */
        public String mo2884c() {
            return "SWITCHING[L:" + this.f2181a.mo2884c() + ", R:" + this.f2182b.mo2884c() + Constants.AES_SUFFIX;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: d */
        public int mo2885d(View view, int i) {
            return (kkl0.m150191x(view) == 1 ? this.f2182b : this.f2181a).mo2885d(view, i);
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$f */
    public static class C0435f extends AbstractC0438i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: a */
        public int mo2883a(View view, int i, int i2) {
            return i >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: c */
        public String mo2884c() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: d */
        public int mo2885d(View view, int i) {
            return i >> 1;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$g */
    public static class C0436g extends AbstractC0438i {

        /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$g$a */
        public class a extends C0441l {

            /* JADX INFO: renamed from: d */
            public int f2183d;

            public a() {
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0441l
            /* JADX INFO: renamed from: a */
            public int mo2887a(GridLayout gridLayout, View view, AbstractC0438i abstractC0438i, int i, boolean z) {
                return Math.max(0, super.mo2887a(gridLayout, view, abstractC0438i, i, z));
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0441l
            /* JADX INFO: renamed from: b */
            public void mo2888b(int i, int i2) {
                super.mo2888b(i, i2);
                this.f2183d = Math.max(this.f2183d, i + i2);
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0441l
            /* JADX INFO: renamed from: d */
            public void mo2889d() {
                super.mo2889d();
                this.f2183d = Integer.MIN_VALUE;
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0441l
            /* JADX INFO: renamed from: e */
            public int mo2890e(boolean z) {
                return Math.max(super.mo2890e(z), this.f2183d);
            }
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: a */
        public int mo2883a(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: b */
        public C0441l mo2886b() {
            return new a();
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: c */
        public String mo2884c() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: d */
        public int mo2885d(View view, int i) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$h */
    public static class C0437h extends AbstractC0438i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: a */
        public int mo2883a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: c */
        public String mo2884c() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: d */
        public int mo2885d(View view, int i) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0438i
        /* JADX INFO: renamed from: e */
        public int mo2891e(View view, int i, int i2) {
            return i2;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$i */
    public static abstract class AbstractC0438i {
        /* JADX INFO: renamed from: a */
        public abstract int mo2883a(View view, int i, int i2);

        /* JADX INFO: renamed from: b */
        public C0441l mo2886b() {
            return new C0441l();
        }

        /* JADX INFO: renamed from: c */
        public abstract String mo2884c();

        /* JADX INFO: renamed from: d */
        public abstract int mo2885d(View view, int i);

        /* JADX INFO: renamed from: e */
        public int mo2891e(View view, int i, int i2) {
            return i;
        }

        public String toString() {
            return "Alignment:" + mo2884c();
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$j */
    public static final class C0439j {

        /* JADX INFO: renamed from: a */
        public final C0442m f2185a;

        /* JADX INFO: renamed from: b */
        public final C0444o f2186b;

        /* JADX INFO: renamed from: c */
        public boolean f2187c = true;

        public C0439j(C0442m c0442m, C0444o c0444o) {
            this.f2185a = c0442m;
            this.f2186b = c0444o;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2185a);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(!this.f2187c ? "+>" : "->");
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(this.f2186b);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$k */
    public final class C0440k {

        /* JADX INFO: renamed from: a */
        public final boolean f2188a;

        /* JADX INFO: renamed from: d */
        public C0445p<C0446q, C0441l> f2191d;

        /* JADX INFO: renamed from: f */
        public C0445p<C0442m, C0444o> f2193f;

        /* JADX INFO: renamed from: h */
        public C0445p<C0442m, C0444o> f2195h;

        /* JADX INFO: renamed from: j */
        public int[] f2197j;

        /* JADX INFO: renamed from: l */
        public int[] f2199l;

        /* JADX INFO: renamed from: n */
        public C0439j[] f2201n;

        /* JADX INFO: renamed from: p */
        public int[] f2203p;

        /* JADX INFO: renamed from: r */
        public boolean f2205r;

        /* JADX INFO: renamed from: t */
        public int[] f2207t;

        /* JADX INFO: renamed from: b */
        public int f2189b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        public int f2190c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e */
        public boolean f2192e = false;

        /* JADX INFO: renamed from: g */
        public boolean f2194g = false;

        /* JADX INFO: renamed from: i */
        public boolean f2196i = false;

        /* JADX INFO: renamed from: k */
        public boolean f2198k = false;

        /* JADX INFO: renamed from: m */
        public boolean f2200m = false;

        /* JADX INFO: renamed from: o */
        public boolean f2202o = false;

        /* JADX INFO: renamed from: q */
        public boolean f2204q = false;

        /* JADX INFO: renamed from: s */
        public boolean f2206s = false;

        /* JADX INFO: renamed from: u */
        public boolean f2208u = true;

        /* JADX INFO: renamed from: v */
        public C0444o f2209v = new C0444o(0);

        /* JADX INFO: renamed from: w */
        public C0444o f2210w = new C0444o(TXLiteAVCode.ERR_SERVER_INFO_UNPACKING_ERROR);

        /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$k$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public C0439j[] f2212a;

            /* JADX INFO: renamed from: b */
            public int f2213b;

            /* JADX INFO: renamed from: c */
            public C0439j[][] f2214c;

            /* JADX INFO: renamed from: d */
            public int[] f2215d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0439j[] f2216e;

            public a(C0439j[] c0439jArr) {
                this.f2216e = c0439jArr;
                C0439j[] c0439jArr2 = new C0439j[c0439jArr.length];
                this.f2212a = c0439jArr2;
                this.f2213b = c0439jArr2.length - 1;
                this.f2214c = C0440k.this.m2937z(c0439jArr);
                this.f2215d = new int[C0440k.this.m2927p() + 1];
            }

            /* JADX INFO: renamed from: a */
            public C0439j[] m2938a() {
                int length = this.f2214c.length;
                for (int i = 0; i < length; i++) {
                    m2939b(i);
                }
                return this.f2212a;
            }

            /* JADX INFO: renamed from: b */
            public void m2939b(int i) {
                int[] iArr = this.f2215d;
                if (iArr[i] != 0) {
                    return;
                }
                iArr[i] = 1;
                for (C0439j c0439j : this.f2214c[i]) {
                    m2939b(c0439j.f2185a.f2222b);
                    C0439j[] c0439jArr = this.f2212a;
                    int i2 = this.f2213b;
                    this.f2213b = i2 - 1;
                    c0439jArr[i2] = c0439j;
                }
                this.f2215d[i] = 2;
            }
        }

        public C0440k(boolean z) {
            this.f2188a = z;
        }

        /* JADX INFO: renamed from: A */
        public final boolean m2892A() {
            if (!this.f2206s) {
                this.f2205r = m2918g();
                this.f2206s = true;
            }
            return this.f2205r;
        }

        /* JADX INFO: renamed from: B */
        public final void m2893B(List<C0439j> list, C0442m c0442m, C0444o c0444o) {
            m2894C(list, c0442m, c0444o, true);
        }

        /* JADX INFO: renamed from: C */
        public final void m2894C(List<C0439j> list, C0442m c0442m, C0444o c0444o, boolean z) {
            if (c0442m.m2942b() == 0) {
                return;
            }
            if (z) {
                Iterator<C0439j> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f2185a.equals(c0442m)) {
                        return;
                    }
                }
            }
            list.add(new C0439j(c0442m, c0444o));
        }

        /* JADX INFO: renamed from: D */
        public final void m2895D(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        /* JADX INFO: renamed from: E */
        public void m2896E() {
            this.f2190c = Integer.MIN_VALUE;
            this.f2191d = null;
            this.f2193f = null;
            this.f2195h = null;
            this.f2197j = null;
            this.f2199l = null;
            this.f2201n = null;
            this.f2203p = null;
            this.f2207t = null;
            this.f2206s = false;
            m2897F();
        }

        /* JADX INFO: renamed from: F */
        public void m2897F() {
            this.f2192e = false;
            this.f2194g = false;
            this.f2196i = false;
            this.f2198k = false;
            this.f2200m = false;
            this.f2202o = false;
            this.f2204q = false;
        }

        /* JADX INFO: renamed from: G */
        public void m2898G(int i) {
            m2903L(i, i);
            m2932u();
        }

        /* JADX INFO: renamed from: H */
        public final void m2899H(String str, C0439j[] c0439jArr, boolean[] zArr) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < c0439jArr.length; i++) {
                C0439j c0439j = c0439jArr[i];
                if (zArr[i]) {
                    arrayList.add(c0439j);
                }
                if (!c0439j.f2187c) {
                    arrayList2.add(c0439j);
                }
            }
            GridLayout.this.f2180h.println(str + " constraints: " + m2913b(arrayList) + " are inconsistent; permanently removing: " + m2913b(arrayList2) + ". ");
        }

        /* JADX INFO: renamed from: I */
        public final boolean m2900I(int[] iArr, C0439j c0439j) {
            if (!c0439j.f2187c) {
                return false;
            }
            C0442m c0442m = c0439j.f2185a;
            int i = c0442m.f2221a;
            int i2 = c0442m.f2222b;
            int i3 = iArr[i] + c0439j.f2186b.f2239a;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        /* JADX INFO: renamed from: J */
        public void m2901J(int i) {
            if (i != Integer.MIN_VALUE && i < m2933v()) {
                GridLayout.m2860w((this.f2188a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            }
            this.f2189b = i;
        }

        /* JADX INFO: renamed from: K */
        public void m2902K(boolean z) {
            this.f2208u = z;
            m2896E();
        }

        /* JADX INFO: renamed from: L */
        public final void m2903L(int i, int i2) {
            this.f2209v.f2239a = i;
            this.f2210w.f2239a = -i2;
            this.f2204q = false;
        }

        /* JADX INFO: renamed from: M */
        public final void m2904M(int i, float f) {
            Arrays.fill(this.f2207t, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    C0443n c0443nM2873q = GridLayout.this.m2873q(childAt);
                    float f2 = (this.f2188a ? c0443nM2873q.f2238b : c0443nM2873q.f2237a).f2247d;
                    if (f2 != 0.0f) {
                        int iRound = Math.round((i * f2) / f);
                        this.f2207t[i2] = iRound;
                        i -= iRound;
                        f -= f2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: N */
        public final int m2905N(int[] iArr) {
            return iArr[m2927p()];
        }

        /* JADX INFO: renamed from: O */
        public final boolean m2906O(int[] iArr) {
            return m2907P(m2925n(), iArr);
        }

        /* JADX INFO: renamed from: P */
        public final boolean m2907P(C0439j[] c0439jArr, int[] iArr) {
            return m2908Q(c0439jArr, iArr, true);
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m2908Q(C0439j[] c0439jArr, int[] iArr, boolean z) {
            String str = this.f2188a ? "horizontal" : "vertical";
            int iM2927p = m2927p() + 1;
            boolean[] zArr = null;
            for (int i = 0; i < c0439jArr.length; i++) {
                m2895D(iArr);
                for (int i2 = 0; i2 < iM2927p; i2++) {
                    boolean zM2900I = false;
                    for (C0439j c0439j : c0439jArr) {
                        zM2900I |= m2900I(iArr, c0439j);
                    }
                    if (!zM2900I) {
                        if (zArr != null) {
                            m2899H(str, c0439jArr, zArr);
                        }
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[c0439jArr.length];
                for (int i3 = 0; i3 < iM2927p; i3++) {
                    int length = c0439jArr.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        zArr2[i4] = zArr2[i4] | m2900I(iArr, c0439jArr[i4]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                for (int i5 = 0; i5 < c0439jArr.length; i5++) {
                    if (zArr2[i5]) {
                        C0439j c0439j2 = c0439jArr[i5];
                        C0442m c0442m = c0439j2.f2185a;
                        if (c0442m.f2221a >= c0442m.f2222b) {
                            c0439j2.f2187c = false;
                            break;
                        }
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: R */
        public final void m2909R(int[] iArr) {
            Arrays.fill(m2928q(), 0);
            m2906O(iArr);
            boolean z = true;
            int childCount = (this.f2209v.f2239a * GridLayout.this.getChildCount()) + 1;
            if (childCount < 2) {
                return;
            }
            float fM2915d = m2915d();
            int i = -1;
            int i2 = 0;
            while (i2 < childCount) {
                int i3 = (int) ((((long) i2) + ((long) childCount)) / 2);
                m2897F();
                m2904M(i3, fM2915d);
                boolean zM2908Q = m2908Q(m2925n(), iArr, false);
                if (zM2908Q) {
                    i2 = i3 + 1;
                    i = i3;
                } else {
                    childCount = i3;
                }
                z = zM2908Q;
            }
            if (i <= 0 || z) {
                return;
            }
            m2897F();
            m2904M(i, fM2915d);
            m2906O(iArr);
        }

        /* JADX INFO: renamed from: S */
        public final C0439j[] m2910S(List<C0439j> list) {
            return m2911T((C0439j[]) list.toArray(new C0439j[list.size()]));
        }

        /* JADX INFO: renamed from: T */
        public final C0439j[] m2911T(C0439j[] c0439jArr) {
            return new a(c0439jArr).m2938a();
        }

        /* JADX INFO: renamed from: a */
        public final void m2912a(List<C0439j> list, C0445p<C0442m, C0444o> c0445p) {
            int i = 0;
            while (true) {
                C0442m[] c0442mArr = c0445p.f2241b;
                if (i >= c0442mArr.length) {
                    return;
                }
                m2894C(list, c0442mArr[i], c0445p.f2242c[i], false);
                i++;
            }
        }

        /* JADX INFO: renamed from: b */
        public final String m2913b(List<C0439j> list) {
            StringBuilder sb;
            String str = this.f2188a ? BaseSei.f14624X : BaseSei.f14625Y;
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (C0439j c0439j : list) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(", ");
                }
                C0442m c0442m = c0439j.f2185a;
                int i = c0442m.f2221a;
                int i2 = c0442m.f2222b;
                int i3 = c0439j.f2186b.f2239a;
                if (i < i2) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i);
                    sb.append(">=");
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i2);
                    sb.append("<=");
                    i3 = -i3;
                }
                sb.append(i3);
                sb2.append(sb.toString());
            }
            return sb2.toString();
        }

        /* JADX INFO: renamed from: c */
        public final int m2914c() {
            int childCount = GridLayout.this.getChildCount();
            int iMax = -1;
            for (int i = 0; i < childCount; i++) {
                C0443n c0443nM2873q = GridLayout.this.m2873q(GridLayout.this.getChildAt(i));
                C0442m c0442m = (this.f2188a ? c0443nM2873q.f2238b : c0443nM2873q.f2237a).f2245b;
                iMax = Math.max(Math.max(Math.max(iMax, c0442m.f2221a), c0442m.f2222b), c0442m.m2942b());
            }
            if (iMax == -1) {
                return Integer.MIN_VALUE;
            }
            return iMax;
        }

        /* JADX INFO: renamed from: d */
        public final float m2915d() {
            int childCount = GridLayout.this.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    C0443n c0443nM2873q = GridLayout.this.m2873q(childAt);
                    f += (this.f2188a ? c0443nM2873q.f2238b : c0443nM2873q.f2237a).f2247d;
                }
            }
            return f;
        }

        /* JADX INFO: renamed from: e */
        public final void m2916e() {
            m2929r();
            m2926o();
        }

        /* JADX INFO: renamed from: f */
        public final void m2917f() {
            for (C0441l c0441l : this.f2191d.f2242c) {
                c0441l.mo2889d();
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                C0443n c0443nM2873q = GridLayout.this.m2873q(childAt);
                boolean z = this.f2188a;
                C0446q c0446q = z ? c0443nM2873q.f2238b : c0443nM2873q.f2237a;
                this.f2191d.m2950c(i).m2940c(GridLayout.this, childAt, c0446q, this, GridLayout.this.m2877u(childAt, z) + (c0446q.f2247d == 0.0f ? 0 : m2928q()[i]));
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m2918g() {
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    C0443n c0443nM2873q = GridLayout.this.m2873q(childAt);
                    if ((this.f2188a ? c0443nM2873q.f2238b : c0443nM2873q.f2237a).f2247d != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final void m2919h(C0445p<C0442m, C0444o> c0445p, boolean z) {
            for (C0444o c0444o : c0445p.f2242c) {
                c0444o.m2947a();
            }
            C0441l[] c0441lArr = m2930s().f2242c;
            for (int i = 0; i < c0441lArr.length; i++) {
                int iMo2890e = c0441lArr[i].mo2890e(z);
                C0444o c0444oM2950c = c0445p.m2950c(i);
                int i2 = c0444oM2950c.f2239a;
                if (!z) {
                    iMo2890e = -iMo2890e;
                }
                c0444oM2950c.f2239a = Math.max(i2, iMo2890e);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m2920i(int[] iArr) {
            if (m2892A()) {
                m2909R(iArr);
            } else {
                m2906O(iArr);
            }
            if (this.f2208u) {
                return;
            }
            int i = iArr[0];
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = iArr[i2] - i;
            }
        }

        /* JADX INFO: renamed from: j */
        public final void m2921j(boolean z) {
            int[] iArr = z ? this.f2197j : this.f2199l;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    C0443n c0443nM2873q = GridLayout.this.m2873q(childAt);
                    boolean z2 = this.f2188a;
                    C0442m c0442m = (z2 ? c0443nM2873q.f2238b : c0443nM2873q.f2237a).f2245b;
                    int i2 = z ? c0442m.f2221a : c0442m.f2222b;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.m2875s(childAt, z2, z));
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public final C0439j[] m2922k() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m2912a(arrayList, m2929r());
            m2912a(arrayList2, m2926o());
            if (this.f2208u) {
                int i = 0;
                while (i < m2927p()) {
                    int i2 = i + 1;
                    m2893B(arrayList, new C0442m(i, i2), new C0444o(0));
                    i = i2;
                }
            }
            int iM2927p = m2927p();
            m2894C(arrayList, new C0442m(0, iM2927p), this.f2209v, false);
            m2894C(arrayList2, new C0442m(iM2927p, 0), this.f2210w, false);
            return (C0439j[]) GridLayout.m2854b(m2910S(arrayList), m2910S(arrayList2));
        }

        /* JADX INFO: renamed from: l */
        public final C0445p<C0446q, C0441l> m2923l() {
            Assoc assocM2882of = Assoc.m2882of(C0446q.class, C0441l.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0443n c0443nM2873q = GridLayout.this.m2873q(GridLayout.this.getChildAt(i));
                boolean z = this.f2188a;
                C0446q c0446q = z ? c0443nM2873q.f2238b : c0443nM2873q.f2237a;
                assocM2882of.put(c0446q, c0446q.m2952b(z).mo2886b());
            }
            return assocM2882of.pack();
        }

        /* JADX INFO: renamed from: m */
        public final C0445p<C0442m, C0444o> m2924m(boolean z) {
            Assoc assocM2882of = Assoc.m2882of(C0442m.class, C0444o.class);
            C0446q[] c0446qArr = m2930s().f2241b;
            int length = c0446qArr.length;
            for (int i = 0; i < length; i++) {
                assocM2882of.put(z ? c0446qArr[i].f2245b : c0446qArr[i].f2245b.m2941a(), new C0444o());
            }
            return assocM2882of.pack();
        }

        /* JADX INFO: renamed from: n */
        public C0439j[] m2925n() {
            if (this.f2201n == null) {
                this.f2201n = m2922k();
            }
            if (!this.f2202o) {
                m2916e();
                this.f2202o = true;
            }
            return this.f2201n;
        }

        /* JADX INFO: renamed from: o */
        public final C0445p<C0442m, C0444o> m2926o() {
            if (this.f2195h == null) {
                this.f2195h = m2924m(false);
            }
            if (!this.f2196i) {
                m2919h(this.f2195h, false);
                this.f2196i = true;
            }
            return this.f2195h;
        }

        /* JADX INFO: renamed from: p */
        public int m2927p() {
            return Math.max(this.f2189b, m2933v());
        }

        /* JADX INFO: renamed from: q */
        public int[] m2928q() {
            if (this.f2207t == null) {
                this.f2207t = new int[GridLayout.this.getChildCount()];
            }
            return this.f2207t;
        }

        /* JADX INFO: renamed from: r */
        public final C0445p<C0442m, C0444o> m2929r() {
            if (this.f2193f == null) {
                this.f2193f = m2924m(true);
            }
            if (!this.f2194g) {
                m2919h(this.f2193f, true);
                this.f2194g = true;
            }
            return this.f2193f;
        }

        /* JADX INFO: renamed from: s */
        public C0445p<C0446q, C0441l> m2930s() {
            if (this.f2191d == null) {
                this.f2191d = m2923l();
            }
            if (!this.f2192e) {
                m2917f();
                this.f2192e = true;
            }
            return this.f2191d;
        }

        /* JADX INFO: renamed from: t */
        public int[] m2931t() {
            if (this.f2197j == null) {
                this.f2197j = new int[m2927p() + 1];
            }
            if (!this.f2198k) {
                m2921j(true);
                this.f2198k = true;
            }
            return this.f2197j;
        }

        /* JADX INFO: renamed from: u */
        public int[] m2932u() {
            if (this.f2203p == null) {
                this.f2203p = new int[m2927p() + 1];
            }
            if (!this.f2204q) {
                m2920i(this.f2203p);
                this.f2204q = true;
            }
            return this.f2203p;
        }

        /* JADX INFO: renamed from: v */
        public final int m2933v() {
            if (this.f2190c == Integer.MIN_VALUE) {
                this.f2190c = Math.max(0, m2914c());
            }
            return this.f2190c;
        }

        /* JADX INFO: renamed from: w */
        public int m2934w(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return m2935x(0, size);
            }
            if (mode == 0) {
                return m2935x(0, LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
            }
            if (mode != 1073741824) {
                return 0;
            }
            return m2935x(size, size);
        }

        /* JADX INFO: renamed from: x */
        public final int m2935x(int i, int i2) {
            m2903L(i, i2);
            return m2905N(m2932u());
        }

        /* JADX INFO: renamed from: y */
        public int[] m2936y() {
            if (this.f2199l == null) {
                this.f2199l = new int[m2927p() + 1];
            }
            if (!this.f2200m) {
                m2921j(false);
                this.f2200m = true;
            }
            return this.f2199l;
        }

        /* JADX INFO: renamed from: z */
        public C0439j[][] m2937z(C0439j[] c0439jArr) {
            int iM2927p = m2927p() + 1;
            C0439j[][] c0439jArr2 = new C0439j[iM2927p][];
            int[] iArr = new int[iM2927p];
            for (C0439j c0439j : c0439jArr) {
                int i = c0439j.f2185a.f2221a;
                iArr[i] = iArr[i] + 1;
            }
            for (int i2 = 0; i2 < iM2927p; i2++) {
                c0439jArr2[i2] = new C0439j[iArr[i2]];
            }
            Arrays.fill(iArr, 0);
            for (C0439j c0439j2 : c0439jArr) {
                int i3 = c0439j2.f2185a.f2221a;
                C0439j[] c0439jArr3 = c0439jArr2[i3];
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                c0439jArr3[i4] = c0439j2;
            }
            return c0439jArr2;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$l */
    public static class C0441l {

        /* JADX INFO: renamed from: a */
        public int f2218a;

        /* JADX INFO: renamed from: b */
        public int f2219b;

        /* JADX INFO: renamed from: c */
        public int f2220c;

        public C0441l() {
            mo2889d();
        }

        /* JADX INFO: renamed from: a */
        public int mo2887a(GridLayout gridLayout, View view, AbstractC0438i abstractC0438i, int i, boolean z) {
            return this.f2218a - abstractC0438i.mo2883a(view, i, zkl0.m220114a(gridLayout));
        }

        /* JADX INFO: renamed from: b */
        public void mo2888b(int i, int i2) {
            this.f2218a = Math.max(this.f2218a, i);
            this.f2219b = Math.max(this.f2219b, i2);
        }

        /* JADX INFO: renamed from: c */
        public final void m2940c(GridLayout gridLayout, View view, C0446q c0446q, C0440k c0440k, int i) {
            this.f2220c &= c0446q.m2953c();
            int iMo2883a = c0446q.m2952b(c0440k.f2188a).mo2883a(view, i, zkl0.m220114a(gridLayout));
            mo2888b(iMo2883a, i - iMo2883a);
        }

        /* JADX INFO: renamed from: d */
        public void mo2889d() {
            this.f2218a = Integer.MIN_VALUE;
            this.f2219b = Integer.MIN_VALUE;
            this.f2220c = 2;
        }

        /* JADX INFO: renamed from: e */
        public int mo2890e(boolean z) {
            return (z || !GridLayout.m2855c(this.f2220c)) ? this.f2218a + this.f2219b : LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
        }

        public String toString() {
            return "Bounds{before=" + this.f2218a + ", after=" + this.f2219b + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$m */
    public static final class C0442m {

        /* JADX INFO: renamed from: a */
        public final int f2221a;

        /* JADX INFO: renamed from: b */
        public final int f2222b;

        public C0442m(int i, int i2) {
            this.f2221a = i;
            this.f2222b = i2;
        }

        /* JADX INFO: renamed from: a */
        public C0442m m2941a() {
            return new C0442m(this.f2222b, this.f2221a);
        }

        /* JADX INFO: renamed from: b */
        public int m2942b() {
            return this.f2222b - this.f2221a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0442m.class != obj.getClass()) {
                return false;
            }
            C0442m c0442m = (C0442m) obj;
            return this.f2222b == c0442m.f2222b && this.f2221a == c0442m.f2221a;
        }

        public int hashCode() {
            return (this.f2221a * 31) + this.f2222b;
        }

        public String toString() {
            return "[" + this.f2221a + ", " + this.f2222b + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$p */
    public static final class C0445p<K, V> {

        /* JADX INFO: renamed from: a */
        public final int[] f2240a;

        /* JADX INFO: renamed from: b */
        public final K[] f2241b;

        /* JADX INFO: renamed from: c */
        public final V[] f2242c;

        public C0445p(K[] kArr, V[] vArr) {
            int[] iArrM2949b = m2949b(kArr);
            this.f2240a = iArrM2949b;
            this.f2241b = (K[]) m2948a(kArr, iArrM2949b);
            this.f2242c = (V[]) m2948a(vArr, iArrM2949b);
        }

        /* JADX INFO: renamed from: a */
        public static <K> K[] m2948a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.m2846A(iArr, -1) + 1));
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }

        /* JADX INFO: renamed from: b */
        public static <K> int[] m2949b(K[] kArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer numValueOf = (Integer) map.get(k);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(k, numValueOf);
                }
                iArr[i] = numValueOf.intValue();
            }
            return iArr;
        }

        /* JADX INFO: renamed from: c */
        public V m2950c(int i) {
            return this.f2242c[this.f2240a[i]];
        }
    }

    static {
        C0432c c0432c = new C0432c();
        f2165s = c0432c;
        C0433d c0433d = new C0433d();
        f2166t = c0433d;
        f2167u = c0432c;
        f2168v = c0433d;
        f2169w = c0432c;
        f2170x = c0433d;
        f2171y = m2857h(c0432c, c0433d);
        f2172z = m2857h(c0433d, c0432c);
        f2152A = new C0435f();
        f2153B = new C0436g();
        f2154C = new C0437h();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2173a = new C0440k(true);
        this.f2174b = new C0440k(false);
        this.f2175c = 0;
        this.f2176d = false;
        this.f2177e = 1;
        this.f2179g = 0;
        this.f2180h = f2155i;
        this.f2178f = context.getResources().getDimensionPixelOffset(pac0.f151255a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dic0.f88604a);
        try {
            setRowCount(typedArrayObtainStyledAttributes.getInt(f2158l, Integer.MIN_VALUE));
            setColumnCount(typedArrayObtainStyledAttributes.getInt(f2159m, Integer.MIN_VALUE));
            setOrientation(typedArrayObtainStyledAttributes.getInt(f2157k, 0));
            setUseDefaultMargins(typedArrayObtainStyledAttributes.getBoolean(f2160n, false));
            setAlignmentMode(typedArrayObtainStyledAttributes.getInt(f2161o, 1));
            setRowOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f2162p, true));
            setColumnOrderPreserved(typedArrayObtainStyledAttributes.getBoolean(f2163q, true));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m2846A(int[] iArr, int i) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX INFO: renamed from: D */
    public static void m2847D(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    /* JADX INFO: renamed from: E */
    public static void m2848E(C0443n c0443n, int i, int i2, int i3, int i4) {
        c0443n.m2946d(new C0442m(i, i2 + i));
        c0443n.m2945c(new C0442m(i3, i4 + i3));
    }

    /* JADX INFO: renamed from: F */
    public static C0446q m2849F(int i) {
        return m2850G(i, 1);
    }

    /* JADX INFO: renamed from: G */
    public static C0446q m2850G(int i, int i2) {
        return m2851H(i, i2, f2164r);
    }

    /* JADX INFO: renamed from: H */
    public static C0446q m2851H(int i, int i2, AbstractC0438i abstractC0438i) {
        return m2852I(i, i2, abstractC0438i, 0.0f);
    }

    /* JADX INFO: renamed from: I */
    public static C0446q m2852I(int i, int i2, AbstractC0438i abstractC0438i, float f) {
        return new C0446q(i != Integer.MIN_VALUE, i, i2, abstractC0438i, f);
    }

    /* JADX INFO: renamed from: a */
    public static int m2853a(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 + i), View.MeasureSpec.getMode(i));
    }

    /* JADX INFO: renamed from: b */
    public static <T> T[] m2854b(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2855c(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m2856e(C0442m c0442m, boolean z, int i) {
        int iM2942b = c0442m.m2942b();
        if (i == 0) {
            return iM2942b;
        }
        return Math.min(iM2942b, i - (z ? Math.min(c0442m.f2221a, i) : 0));
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0438i m2857h(AbstractC0438i abstractC0438i, AbstractC0438i abstractC0438i2) {
        return new C0434e(abstractC0438i, abstractC0438i2);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2858i(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return false;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC0438i m2859m(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        if (i2 == 1) {
            return f2152A;
        }
        if (i2 == 3) {
            return z ? f2171y : f2167u;
        }
        if (i2 == 5) {
            return z ? f2172z : f2168v;
        }
        if (i2 == 7) {
            return f2154C;
        }
        if (i2 != 8388611) {
            return i2 != 8388613 ? f2164r : f2170x;
        }
        return f2169w;
    }

    /* JADX INFO: renamed from: w */
    public static void m2860w(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    /* JADX INFO: renamed from: B */
    public final void m2861B(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, m2878v(view, true), i3), ViewGroup.getChildMeasureSpec(i2, m2878v(view, false), i4));
    }

    /* JADX INFO: renamed from: C */
    public final void m2862C(int i, int i2, boolean z) {
        int i3;
        int i4;
        GridLayout gridLayout;
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                gridLayout = this;
                i3 = i;
                i4 = i2;
            } else {
                C0443n c0443nM2873q = this.m2873q(childAt);
                if (z) {
                    int i6 = ((ViewGroup.MarginLayoutParams) c0443nM2873q).width;
                    int i7 = ((ViewGroup.MarginLayoutParams) c0443nM2873q).height;
                    gridLayout = this;
                    i3 = i;
                    i4 = i2;
                    gridLayout.m2861B(childAt, i3, i4, i6, i7);
                } else {
                    i3 = i;
                    i4 = i2;
                    boolean z2 = this.f2175c == 0;
                    C0446q c0446q = z2 ? c0443nM2873q.f2238b : c0443nM2873q.f2237a;
                    if (c0446q.m2952b(z2) == f2154C) {
                        C0442m c0442m = c0446q.f2245b;
                        int[] iArrM2932u = (z2 ? this.f2173a : this.f2174b).m2932u();
                        int iM2878v = (iArrM2932u[c0442m.f2222b] - iArrM2932u[c0442m.f2221a]) - this.m2878v(childAt, z2);
                        if (z2) {
                            int i8 = ((ViewGroup.MarginLayoutParams) c0443nM2873q).height;
                            gridLayout = this;
                            gridLayout.m2861B(childAt, i3, i4, iM2878v, i8);
                        } else {
                            int i9 = ((ViewGroup.MarginLayoutParams) c0443nM2873q).width;
                            gridLayout = this;
                            gridLayout.m2861B(childAt, i3, i4, i9, iM2878v);
                        }
                    } else {
                        gridLayout = this;
                    }
                }
            }
            i5++;
            this = gridLayout;
            i = i3;
            i2 = i4;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m2863J() {
        boolean z = this.f2175c == 0;
        int i = (z ? this.f2173a : this.f2174b).f2189b;
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int[] iArr = new int[i];
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            C0443n c0443n = (C0443n) getChildAt(i4).getLayoutParams();
            C0446q c0446q = z ? c0443n.f2237a : c0443n.f2238b;
            C0442m c0442m = c0446q.f2245b;
            boolean z2 = c0446q.f2244a;
            int iM2942b = c0442m.m2942b();
            if (z2) {
                i2 = c0442m.f2221a;
            }
            C0446q c0446q2 = z ? c0443n.f2238b : c0443n.f2237a;
            C0442m c0442m2 = c0446q2.f2245b;
            boolean z3 = c0446q2.f2244a;
            int iM2856e = m2856e(c0442m2, z3, i);
            if (z3) {
                i3 = c0442m2.f2221a;
            }
            if (i != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i5 = i3 + iM2856e;
                        if (m2858i(iArr, i2, i3, i5)) {
                            break;
                        }
                        if (z3) {
                            i2++;
                        } else if (i5 <= i) {
                            i3++;
                        } else {
                            i2++;
                            i3 = 0;
                        }
                    }
                }
                m2847D(iArr, i3, i3 + iM2856e, i2 + iM2942b);
            }
            if (z) {
                m2848E(c0443n, i2, iM2942b, i3, iM2856e);
            } else {
                m2848E(c0443n, i3, iM2856e, i2, iM2942b);
            }
            i3 += iM2856e;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0443n)) {
            return false;
        }
        C0443n c0443n = (C0443n) layoutParams;
        m2864d(c0443n, true);
        m2864d(c0443n, false);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m2864d(C0443n c0443n, boolean z) {
        String str = z ? "column" : "row";
        C0442m c0442m = (z ? c0443n.f2238b : c0443n.f2237a).f2245b;
        int i = c0442m.f2221a;
        if (i != Integer.MIN_VALUE && i < 0) {
            m2860w(str.concat(" indices must be positive"));
        }
        int i2 = (z ? this.f2173a : this.f2174b).f2189b;
        if (i2 != Integer.MIN_VALUE) {
            if (c0442m.f2222b > i2) {
                m2860w(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (c0442m.m2942b() > i2) {
                m2860w(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m2865f() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                iHashCode = (iHashCode * 31) + ((C0443n) childAt.getLayoutParams()).hashCode();
            }
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: g */
    public final void m2866g() {
        int i = this.f2179g;
        if (i == 0) {
            m2863J();
            this.f2179g = m2865f();
        } else if (i != m2865f()) {
            this.f2180h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            m2879x();
            m2866g();
        }
    }

    public int getAlignmentMode() {
        return this.f2177e;
    }

    public int getColumnCount() {
        return this.f2173a.m2927p();
    }

    public int getOrientation() {
        return this.f2175c;
    }

    public Printer getPrinter() {
        return this.f2180h;
    }

    public int getRowCount() {
        return this.f2174b.m2927p();
    }

    public boolean getUseDefaultMargins() {
        return this.f2176d;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0443n generateDefaultLayoutParams() {
        return new C0443n();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0443n generateLayoutParams(AttributeSet attributeSet) {
        return new C0443n(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0443n generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0443n) {
            return new C0443n((C0443n) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0443n((ViewGroup.MarginLayoutParams) layoutParams) : new C0443n(layoutParams);
    }

    /* JADX INFO: renamed from: n */
    public final int m2870n(View view, C0443n c0443n, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (!this.f2176d) {
            return 0;
        }
        C0446q c0446q = z ? c0443n.f2238b : c0443n.f2237a;
        C0440k c0440k = z ? this.f2173a : this.f2174b;
        C0442m c0442m = c0446q.f2245b;
        if (z && m2881z()) {
            z3 = !z2;
        } else {
            z3 = z2;
        }
        if (!z3 ? c0442m.f2222b == c0440k.m2927p() : c0442m.f2221a == 0) {
            z4 = true;
        }
        return m2872p(view, z4, z, z2);
    }

    /* JADX INFO: renamed from: o */
    public final int m2871o(View view, boolean z, boolean z2) {
        if (view.getClass() == Space.class || view.getClass() == android.widget.Space.class) {
            return 0;
        }
        return this.f2178f / 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        GridLayout gridLayout = this;
        gridLayout.m2866g();
        int i8 = i3 - i;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        gridLayout.f2173a.m2898G((i8 - paddingLeft) - paddingRight);
        gridLayout.f2174b.m2898G(((i4 - i2) - paddingTop) - paddingBottom);
        int[] iArrM2932u = gridLayout.f2173a.m2932u();
        int[] iArrM2932u2 = gridLayout.f2174b.m2932u();
        int childCount = gridLayout.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = gridLayout.getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                i5 = i8;
                i6 = paddingLeft;
                i7 = paddingTop;
            } else {
                C0443n c0443nM2873q = gridLayout.m2873q(childAt);
                C0446q c0446q = c0443nM2873q.f2238b;
                C0446q c0446q2 = c0443nM2873q.f2237a;
                C0442m c0442m = c0446q.f2245b;
                C0442m c0442m2 = c0446q2.f2245b;
                int i10 = iArrM2932u[c0442m.f2221a];
                int i11 = iArrM2932u2[c0442m2.f2221a];
                int i12 = iArrM2932u[c0442m.f2222b] - i10;
                int i13 = iArrM2932u2[c0442m2.f2222b] - i11;
                int iM2876t = gridLayout.m2876t(childAt, true);
                i5 = i8;
                int iM2876t2 = gridLayout.m2876t(childAt, false);
                AbstractC0438i abstractC0438iM2952b = c0446q.m2952b(true);
                AbstractC0438i abstractC0438iM2952b2 = c0446q2.m2952b(false);
                C0441l c0441lM2950c = gridLayout.f2173a.m2930s().m2950c(i9);
                C0441l c0441lM2950c2 = gridLayout.f2174b.m2930s().m2950c(i9);
                i6 = paddingLeft;
                int iMo2885d = abstractC0438iM2952b.mo2885d(childAt, i12 - c0441lM2950c.mo2890e(true));
                int iMo2885d2 = abstractC0438iM2952b2.mo2885d(childAt, i13 - c0441lM2950c2.mo2890e(true));
                int iM2874r = gridLayout.m2874r(childAt, true, true);
                int iM2874r2 = gridLayout.m2874r(childAt, false, true);
                int iM2874r3 = gridLayout.m2874r(childAt, true, false);
                int i14 = iM2874r + iM2874r3;
                int iM2874r4 = iM2874r2 + gridLayout.m2874r(childAt, false, false);
                int iMo2887a = c0441lM2950c.mo2887a(gridLayout, childAt, abstractC0438iM2952b, iM2876t + i14, true);
                i7 = paddingTop;
                int iMo2887a2 = c0441lM2950c2.mo2887a(this, childAt, abstractC0438iM2952b2, iM2876t2 + iM2874r4, false);
                int iMo2891e = abstractC0438iM2952b.mo2891e(childAt, iM2876t, i12 - i14);
                int iMo2891e2 = abstractC0438iM2952b2.mo2891e(childAt, iM2876t2, i13 - iM2874r4);
                int i15 = i10 + iMo2885d + iMo2887a;
                int i16 = !m2881z() ? i6 + iM2874r + i15 : (((i5 - iMo2891e) - paddingRight) - iM2874r3) - i15;
                int i17 = i7 + i11 + iMo2885d2 + iMo2887a2 + iM2874r2;
                if (iMo2891e != childAt.getMeasuredWidth() || iMo2891e2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iMo2891e, 1073741824), View.MeasureSpec.makeMeasureSpec(iMo2891e2, 1073741824));
                }
                childAt.layout(i16, i17, iMo2891e + i16, iMo2891e2 + i17);
            }
            i9++;
            gridLayout = this;
            paddingTop = i7;
            i8 = i5;
            paddingLeft = i6;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iM2934w;
        int iM2934w2;
        m2866g();
        m2880y();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iM2853a = m2853a(i, -paddingLeft);
        int iM2853a2 = m2853a(i2, -paddingTop);
        m2862C(iM2853a, iM2853a2, true);
        if (this.f2175c == 0) {
            iM2934w = this.f2173a.m2934w(iM2853a);
            m2862C(iM2853a, iM2853a2, false);
            iM2934w2 = this.f2174b.m2934w(iM2853a2);
        } else {
            int iM2934w3 = this.f2174b.m2934w(iM2853a2);
            m2862C(iM2853a, iM2853a2, false);
            iM2934w = this.f2173a.m2934w(iM2853a);
            iM2934w2 = iM2934w3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iM2934w + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(iM2934w2 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    /* JADX INFO: renamed from: p */
    public final int m2872p(View view, boolean z, boolean z2, boolean z3) {
        return m2871o(view, z2, z3);
    }

    /* JADX INFO: renamed from: q */
    public final C0443n m2873q(View view) {
        return (C0443n) view.getLayoutParams();
    }

    /* JADX INFO: renamed from: r */
    public final int m2874r(View view, boolean z, boolean z2) {
        if (this.f2177e == 1) {
            return m2875s(view, z, z2);
        }
        C0440k c0440k = z ? this.f2173a : this.f2174b;
        int[] iArrM2931t = z2 ? c0440k.m2931t() : c0440k.m2936y();
        C0443n c0443nM2873q = m2873q(view);
        C0442m c0442m = (z ? c0443nM2873q.f2238b : c0443nM2873q.f2237a).f2245b;
        return iArrM2931t[z2 ? c0442m.f2221a : c0442m.f2222b];
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        m2879x();
    }

    /* JADX INFO: renamed from: s */
    public int m2875s(View view, boolean z, boolean z2) {
        int i;
        C0443n c0443nM2873q = m2873q(view);
        if (z) {
            i = z2 ? ((ViewGroup.MarginLayoutParams) c0443nM2873q).leftMargin : ((ViewGroup.MarginLayoutParams) c0443nM2873q).rightMargin;
        } else {
            i = z2 ? ((ViewGroup.MarginLayoutParams) c0443nM2873q).topMargin : ((ViewGroup.MarginLayoutParams) c0443nM2873q).bottomMargin;
        }
        return i == Integer.MIN_VALUE ? m2870n(view, c0443nM2873q, z, z2) : i;
    }

    public void setAlignmentMode(int i) {
        this.f2177e = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.f2173a.m2901J(i);
        m2879x();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.f2173a.m2902K(z);
        m2879x();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.f2175c != i) {
            this.f2175c = i;
            m2879x();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = f2156j;
        }
        this.f2180h = printer;
    }

    public void setRowCount(int i) {
        this.f2174b.m2901J(i);
        m2879x();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.f2174b.m2902K(z);
        m2879x();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.f2176d = z;
        requestLayout();
    }

    /* JADX INFO: renamed from: t */
    public final int m2876t(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: u */
    public final int m2877u(View view, boolean z) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return m2876t(view, z) + m2878v(view, z);
    }

    /* JADX INFO: renamed from: v */
    public final int m2878v(View view, boolean z) {
        return m2874r(view, z, true) + m2874r(view, z, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m2879x() {
        this.f2179g = 0;
        C0440k c0440k = this.f2173a;
        if (c0440k != null) {
            c0440k.m2896E();
        }
        C0440k c0440k2 = this.f2174b;
        if (c0440k2 != null) {
            c0440k2.m2896E();
        }
        m2880y();
    }

    /* JADX INFO: renamed from: y */
    public final void m2880y() {
        C0440k c0440k = this.f2173a;
        if (c0440k == null || this.f2174b == null) {
            return;
        }
        c0440k.m2897F();
        this.f2174b.m2897F();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2881z() {
        return kkl0.m150191x(this) == 1;
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$o */
    public static final class C0444o {

        /* JADX INFO: renamed from: a */
        public int f2239a;

        public C0444o() {
            m2947a();
        }

        /* JADX INFO: renamed from: a */
        public void m2947a() {
            this.f2239a = Integer.MIN_VALUE;
        }

        public String toString() {
            return Integer.toString(this.f2239a);
        }

        public C0444o(int i) {
            this.f2239a = i;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$q */
    public static class C0446q {

        /* JADX INFO: renamed from: e */
        public static final C0446q f2243e = GridLayout.m2849F(Integer.MIN_VALUE);

        /* JADX INFO: renamed from: a */
        public final boolean f2244a;

        /* JADX INFO: renamed from: b */
        public final C0442m f2245b;

        /* JADX INFO: renamed from: c */
        public final AbstractC0438i f2246c;

        /* JADX INFO: renamed from: d */
        public final float f2247d;

        public C0446q(boolean z, C0442m c0442m, AbstractC0438i abstractC0438i, float f) {
            this.f2244a = z;
            this.f2245b = c0442m;
            this.f2246c = abstractC0438i;
            this.f2247d = f;
        }

        /* JADX INFO: renamed from: a */
        public final C0446q m2951a(C0442m c0442m) {
            return new C0446q(this.f2244a, c0442m, this.f2246c, this.f2247d);
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0438i m2952b(boolean z) {
            AbstractC0438i abstractC0438i = this.f2246c;
            if (abstractC0438i != GridLayout.f2164r) {
                return abstractC0438i;
            }
            if (this.f2247d == 0.0f) {
                return z ? GridLayout.f2169w : GridLayout.f2153B;
            }
            return GridLayout.f2154C;
        }

        /* JADX INFO: renamed from: c */
        public final int m2953c() {
            return (this.f2246c == GridLayout.f2164r && this.f2247d == 0.0f) ? 0 : 2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0446q c0446q = (C0446q) obj;
            return this.f2246c.equals(c0446q.f2246c) && this.f2245b.equals(c0446q.f2245b);
        }

        public int hashCode() {
            return (this.f2245b.hashCode() * 31) + this.f2246c.hashCode();
        }

        public C0446q(boolean z, int i, int i2, AbstractC0438i abstractC0438i, float f) {
            this(z, new C0442m(i, i2 + i), abstractC0438i, f);
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$n */
    public static class C0443n extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c */
        public static final C0442m f2223c;

        /* JADX INFO: renamed from: d */
        public static final int f2224d;

        /* JADX INFO: renamed from: e */
        public static final int f2225e;

        /* JADX INFO: renamed from: f */
        public static final int f2226f;

        /* JADX INFO: renamed from: g */
        public static final int f2227g;

        /* JADX INFO: renamed from: h */
        public static final int f2228h;

        /* JADX INFO: renamed from: i */
        public static final int f2229i;

        /* JADX INFO: renamed from: j */
        public static final int f2230j;

        /* JADX INFO: renamed from: k */
        public static final int f2231k;

        /* JADX INFO: renamed from: l */
        public static final int f2232l;

        /* JADX INFO: renamed from: m */
        public static final int f2233m;

        /* JADX INFO: renamed from: n */
        public static final int f2234n;

        /* JADX INFO: renamed from: o */
        public static final int f2235o;

        /* JADX INFO: renamed from: p */
        public static final int f2236p;

        /* JADX INFO: renamed from: a */
        public C0446q f2237a;

        /* JADX INFO: renamed from: b */
        public C0446q f2238b;

        static {
            C0442m c0442m = new C0442m(Integer.MIN_VALUE, -2147483647);
            f2223c = c0442m;
            f2224d = c0442m.m2942b();
            f2225e = dic0.f88613j;
            f2226f = dic0.f88614k;
            f2227g = dic0.f88615l;
            f2228h = dic0.f88616m;
            f2229i = dic0.f88617n;
            f2230j = dic0.f88618o;
            f2231k = dic0.f88619p;
            f2232l = dic0.f88620q;
            f2233m = dic0.f88622s;
            f2234n = dic0.f88623t;
            f2235o = dic0.f88624u;
            f2236p = dic0.f88621r;
        }

        public C0443n(C0443n c0443n) {
            super((ViewGroup.MarginLayoutParams) c0443n);
            C0446q c0446q = C0446q.f2243e;
            this.f2237a = c0446q;
            this.f2238b = c0446q;
            this.f2237a = c0443n.f2237a;
            this.f2238b = c0443n.f2238b;
        }

        /* JADX INFO: renamed from: a */
        public final void m2943a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dic0.f88612i);
            try {
                int i = typedArrayObtainStyledAttributes.getInt(f2236p, 0);
                int i2 = typedArrayObtainStyledAttributes.getInt(f2230j, Integer.MIN_VALUE);
                int i3 = f2231k;
                int i4 = f2224d;
                this.f2238b = GridLayout.m2852I(i2, typedArrayObtainStyledAttributes.getInt(i3, i4), GridLayout.m2859m(i, true), typedArrayObtainStyledAttributes.getFloat(f2232l, 0.0f));
                this.f2237a = GridLayout.m2852I(typedArrayObtainStyledAttributes.getInt(f2233m, Integer.MIN_VALUE), typedArrayObtainStyledAttributes.getInt(f2234n, i4), GridLayout.m2859m(i, false), typedArrayObtainStyledAttributes.getFloat(f2235o, 0.0f));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2944b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dic0.f88612i);
            try {
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2225e, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2226f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2227g, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2228h, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(f2229i, dimensionPixelSize);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m2945c(C0442m c0442m) {
            this.f2238b = this.f2238b.m2951a(c0442m);
        }

        /* JADX INFO: renamed from: d */
        public final void m2946d(C0442m c0442m) {
            this.f2237a = this.f2237a.m2951a(c0442m);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0443n c0443n = (C0443n) obj;
            return this.f2238b.equals(c0443n.f2238b) && this.f2237a.equals(c0443n.f2237a);
        }

        public int hashCode() {
            return (this.f2237a.hashCode() * 31) + this.f2238b.hashCode();
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i2, -2);
        }

        public C0443n(C0446q c0446q, C0446q c0446q2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, c0446q, c0446q2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public C0443n() {
            C0446q c0446q = C0446q.f2243e;
            this(c0446q, c0446q);
        }

        public C0443n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            C0446q c0446q = C0446q.f2243e;
            this.f2237a = c0446q;
            this.f2238b = c0446q;
        }

        public C0443n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            C0446q c0446q = C0446q.f2243e;
            this.f2237a = c0446q;
            this.f2238b = c0446q;
        }

        public C0443n(int i, int i2, int i3, int i4, int i5, int i6, C0446q c0446q, C0446q c0446q2) {
            super(i, i2);
            C0446q c0446q3 = C0446q.f2243e;
            this.f2237a = c0446q3;
            this.f2238b = c0446q3;
            setMargins(i3, i4, i5, i6);
            this.f2237a = c0446q;
            this.f2238b = c0446q2;
        }

        public C0443n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0446q c0446q = C0446q.f2243e;
            this.f2237a = c0446q;
            this.f2238b = c0446q;
            m2944b(context, attributeSet);
            m2943a(context, attributeSet);
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }
}
