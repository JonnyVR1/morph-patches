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
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tencent.liteav.TXLiteAVCode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p149l.gbl0;
import p149l.i2c0;
import p149l.vbl0;
import p149l.x9c0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayout extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public static final AbstractC0437i f2152A;

    /* JADX INFO: renamed from: B */
    public static final AbstractC0437i f2153B;

    /* JADX INFO: renamed from: C */
    public static final AbstractC0437i f2154C;

    /* JADX INFO: renamed from: i */
    public static final Printer f2155i = new LogPrinter(3, GridLayout.class.getName());

    /* JADX INFO: renamed from: j */
    public static final Printer f2156j = new C0429a();

    /* JADX INFO: renamed from: k */
    public static final int f2157k = x9c0.f191593e;

    /* JADX INFO: renamed from: l */
    public static final int f2158l = x9c0.f191594f;

    /* JADX INFO: renamed from: m */
    public static final int f2159m = x9c0.f191591c;

    /* JADX INFO: renamed from: n */
    public static final int f2160n = x9c0.f191596h;

    /* JADX INFO: renamed from: o */
    public static final int f2161o = x9c0.f191590b;

    /* JADX INFO: renamed from: p */
    public static final int f2162p = x9c0.f191595g;

    /* JADX INFO: renamed from: q */
    public static final int f2163q = x9c0.f191592d;

    /* JADX INFO: renamed from: r */
    public static final AbstractC0437i f2164r = new C0430b();

    /* JADX INFO: renamed from: s */
    public static final AbstractC0437i f2165s;

    /* JADX INFO: renamed from: t */
    public static final AbstractC0437i f2166t;

    /* JADX INFO: renamed from: u */
    public static final AbstractC0437i f2167u;

    /* JADX INFO: renamed from: v */
    public static final AbstractC0437i f2168v;

    /* JADX INFO: renamed from: w */
    public static final AbstractC0437i f2169w;

    /* JADX INFO: renamed from: x */
    public static final AbstractC0437i f2170x;

    /* JADX INFO: renamed from: y */
    public static final AbstractC0437i f2171y;

    /* JADX INFO: renamed from: z */
    public static final AbstractC0437i f2172z;

    /* JADX INFO: renamed from: a */
    public final C0439k f2173a;

    /* JADX INFO: renamed from: b */
    public final C0439k f2174b;

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
        public static <K, V> Assoc<K, V> m2881of(Class<K> cls, Class<V> cls2) {
            return new Assoc<>(cls, cls2);
        }

        public C0444p<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = get(i).first;
                objArr2[i] = get(i).second;
            }
            return new C0444p<>(objArr, objArr2);
        }

        public void put(K k, V v2) {
            add(Pair.create(k, v2));
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$a */
    public static class C0429a implements Printer {
        @Override // android.util.Printer
        public void println(String str) {
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$b */
    public static class C0430b extends AbstractC0437i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: a */
        public int mo2882a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: c */
        public String mo2883c() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: d */
        public int mo2884d(View view, int i) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$c */
    public static class C0431c extends AbstractC0437i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: a */
        public int mo2882a(View view, int i, int i2) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: c */
        public String mo2883c() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: d */
        public int mo2884d(View view, int i) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$d */
    public static class C0432d extends AbstractC0437i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: a */
        public int mo2882a(View view, int i, int i2) {
            return i;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: c */
        public String mo2883c() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: d */
        public int mo2884d(View view, int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$e */
    public static class C0433e extends AbstractC0437i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0437i f2181a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0437i f2182b;

        public C0433e(AbstractC0437i abstractC0437i, AbstractC0437i abstractC0437i2) {
            this.f2181a = abstractC0437i;
            this.f2182b = abstractC0437i2;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: a */
        public int mo2882a(View view, int i, int i2) {
            return (gbl0.m125228x(view) == 1 ? this.f2182b : this.f2181a).mo2882a(view, i, i2);
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: c */
        public String mo2883c() {
            return "SWITCHING[L:" + this.f2181a.mo2883c() + ", R:" + this.f2182b.mo2883c() + Constants.AES_SUFFIX;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: d */
        public int mo2884d(View view, int i) {
            return (gbl0.m125228x(view) == 1 ? this.f2182b : this.f2181a).mo2884d(view, i);
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$f */
    public static class C0434f extends AbstractC0437i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: a */
        public int mo2882a(View view, int i, int i2) {
            return i >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: c */
        public String mo2883c() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: d */
        public int mo2884d(View view, int i) {
            return i >> 1;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$g */
    public static class C0435g extends AbstractC0437i {

        /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$g$a */
        public class a extends C0440l {

            /* JADX INFO: renamed from: d */
            public int f2183d;

            public a() {
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0440l
            /* JADX INFO: renamed from: a */
            public int mo2886a(GridLayout gridLayout, View view, AbstractC0437i abstractC0437i, int i, boolean z) {
                return Math.max(0, super.mo2886a(gridLayout, view, abstractC0437i, i, z));
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0440l
            /* JADX INFO: renamed from: b */
            public void mo2887b(int i, int i2) {
                super.mo2887b(i, i2);
                this.f2183d = Math.max(this.f2183d, i + i2);
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0440l
            /* JADX INFO: renamed from: d */
            public void mo2888d() {
                super.mo2888d();
                this.f2183d = Integer.MIN_VALUE;
            }

            @Override // androidx.gridlayout.widget.GridLayout.C0440l
            /* JADX INFO: renamed from: e */
            public int mo2889e(boolean z) {
                return Math.max(super.mo2889e(z), this.f2183d);
            }
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: a */
        public int mo2882a(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: b */
        public C0440l mo2885b() {
            return new a();
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: c */
        public String mo2883c() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: d */
        public int mo2884d(View view, int i) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$h */
    public static class C0436h extends AbstractC0437i {
        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: a */
        public int mo2882a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: c */
        public String mo2883c() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: d */
        public int mo2884d(View view, int i) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.AbstractC0437i
        /* JADX INFO: renamed from: e */
        public int mo2890e(View view, int i, int i2) {
            return i2;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$i */
    public static abstract class AbstractC0437i {
        /* JADX INFO: renamed from: a */
        public abstract int mo2882a(View view, int i, int i2);

        /* JADX INFO: renamed from: b */
        public C0440l mo2885b() {
            return new C0440l();
        }

        /* JADX INFO: renamed from: c */
        public abstract String mo2883c();

        /* JADX INFO: renamed from: d */
        public abstract int mo2884d(View view, int i);

        /* JADX INFO: renamed from: e */
        public int mo2890e(View view, int i, int i2) {
            return i;
        }

        public String toString() {
            return "Alignment:" + mo2883c();
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$j */
    public static final class C0438j {

        /* JADX INFO: renamed from: a */
        public final C0441m f2185a;

        /* JADX INFO: renamed from: b */
        public final C0443o f2186b;

        /* JADX INFO: renamed from: c */
        public boolean f2187c = true;

        public C0438j(C0441m c0441m, C0443o c0443o) {
            this.f2185a = c0441m;
            this.f2186b = c0443o;
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
    public final class C0439k {

        /* JADX INFO: renamed from: a */
        public final boolean f2188a;

        /* JADX INFO: renamed from: d */
        public C0444p<C0445q, C0440l> f2191d;

        /* JADX INFO: renamed from: f */
        public C0444p<C0441m, C0443o> f2193f;

        /* JADX INFO: renamed from: h */
        public C0444p<C0441m, C0443o> f2195h;

        /* JADX INFO: renamed from: j */
        public int[] f2197j;

        /* JADX INFO: renamed from: l */
        public int[] f2199l;

        /* JADX INFO: renamed from: n */
        public C0438j[] f2201n;

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
        public C0443o f2209v = new C0443o(0);

        /* JADX INFO: renamed from: w */
        public C0443o f2210w = new C0443o(TXLiteAVCode.ERR_SERVER_INFO_UNPACKING_ERROR);

        /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$k$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public C0438j[] f2212a;

            /* JADX INFO: renamed from: b */
            public int f2213b;

            /* JADX INFO: renamed from: c */
            public C0438j[][] f2214c;

            /* JADX INFO: renamed from: d */
            public int[] f2215d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0438j[] f2216e;

            public a(C0438j[] c0438jArr) {
                this.f2216e = c0438jArr;
                C0438j[] c0438jArr2 = new C0438j[c0438jArr.length];
                this.f2212a = c0438jArr2;
                this.f2213b = c0438jArr2.length - 1;
                this.f2214c = C0439k.this.m2936z(c0438jArr);
                this.f2215d = new int[C0439k.this.m2926p() + 1];
            }

            /* JADX INFO: renamed from: a */
            public C0438j[] m2937a() {
                int length = this.f2214c.length;
                for (int i = 0; i < length; i++) {
                    m2938b(i);
                }
                return this.f2212a;
            }

            /* JADX INFO: renamed from: b */
            public void m2938b(int i) {
                int[] iArr = this.f2215d;
                if (iArr[i] != 0) {
                    return;
                }
                iArr[i] = 1;
                for (C0438j c0438j : this.f2214c[i]) {
                    m2938b(c0438j.f2185a.f2222b);
                    C0438j[] c0438jArr = this.f2212a;
                    int i2 = this.f2213b;
                    this.f2213b = i2 - 1;
                    c0438jArr[i2] = c0438j;
                }
                this.f2215d[i] = 2;
            }
        }

        public C0439k(boolean z) {
            this.f2188a = z;
        }

        /* JADX INFO: renamed from: A */
        public final boolean m2891A() {
            if (!this.f2206s) {
                this.f2205r = m2917g();
                this.f2206s = true;
            }
            return this.f2205r;
        }

        /* JADX INFO: renamed from: B */
        public final void m2892B(List<C0438j> list, C0441m c0441m, C0443o c0443o) {
            m2893C(list, c0441m, c0443o, true);
        }

        /* JADX INFO: renamed from: C */
        public final void m2893C(List<C0438j> list, C0441m c0441m, C0443o c0443o, boolean z) {
            if (c0441m.m2941b() == 0) {
                return;
            }
            if (z) {
                Iterator<C0438j> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f2185a.equals(c0441m)) {
                        return;
                    }
                }
            }
            list.add(new C0438j(c0441m, c0443o));
        }

        /* JADX INFO: renamed from: D */
        public final void m2894D(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        /* JADX INFO: renamed from: E */
        public void m2895E() {
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
            m2896F();
        }

        /* JADX INFO: renamed from: F */
        public void m2896F() {
            this.f2192e = false;
            this.f2194g = false;
            this.f2196i = false;
            this.f2198k = false;
            this.f2200m = false;
            this.f2202o = false;
            this.f2204q = false;
        }

        /* JADX INFO: renamed from: G */
        public void m2897G(int i) {
            m2902L(i, i);
            m2931u();
        }

        /* JADX INFO: renamed from: H */
        public final void m2898H(String str, C0438j[] c0438jArr, boolean[] zArr) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < c0438jArr.length; i++) {
                C0438j c0438j = c0438jArr[i];
                if (zArr[i]) {
                    arrayList.add(c0438j);
                }
                if (!c0438j.f2187c) {
                    arrayList2.add(c0438j);
                }
            }
            GridLayout.this.f2180h.println(str + " constraints: " + m2912b(arrayList) + " are inconsistent; permanently removing: " + m2912b(arrayList2) + ". ");
        }

        /* JADX INFO: renamed from: I */
        public final boolean m2899I(int[] iArr, C0438j c0438j) {
            if (!c0438j.f2187c) {
                return false;
            }
            C0441m c0441m = c0438j.f2185a;
            int i = c0441m.f2221a;
            int i2 = c0441m.f2222b;
            int i3 = iArr[i] + c0438j.f2186b.f2239a;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        /* JADX INFO: renamed from: J */
        public void m2900J(int i) {
            if (i != Integer.MIN_VALUE && i < m2932v()) {
                GridLayout.m2859w((this.f2188a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            }
            this.f2189b = i;
        }

        /* JADX INFO: renamed from: K */
        public void m2901K(boolean z) {
            this.f2208u = z;
            m2895E();
        }

        /* JADX INFO: renamed from: L */
        public final void m2902L(int i, int i2) {
            this.f2209v.f2239a = i;
            this.f2210w.f2239a = -i2;
            this.f2204q = false;
        }

        /* JADX INFO: renamed from: M */
        public final void m2903M(int i, float f) {
            Arrays.fill(this.f2207t, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    C0442n c0442nM2872q = GridLayout.this.m2872q(childAt);
                    float f2 = (this.f2188a ? c0442nM2872q.f2238b : c0442nM2872q.f2237a).f2247d;
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
        public final int m2904N(int[] iArr) {
            return iArr[m2926p()];
        }

        /* JADX INFO: renamed from: O */
        public final boolean m2905O(int[] iArr) {
            return m2906P(m2924n(), iArr);
        }

        /* JADX INFO: renamed from: P */
        public final boolean m2906P(C0438j[] c0438jArr, int[] iArr) {
            return m2907Q(c0438jArr, iArr, true);
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m2907Q(C0438j[] c0438jArr, int[] iArr, boolean z) {
            String str = this.f2188a ? "horizontal" : "vertical";
            int iM2926p = m2926p() + 1;
            boolean[] zArr = null;
            for (int i = 0; i < c0438jArr.length; i++) {
                m2894D(iArr);
                for (int i2 = 0; i2 < iM2926p; i2++) {
                    boolean zM2899I = false;
                    for (C0438j c0438j : c0438jArr) {
                        zM2899I |= m2899I(iArr, c0438j);
                    }
                    if (!zM2899I) {
                        if (zArr != null) {
                            m2898H(str, c0438jArr, zArr);
                        }
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[c0438jArr.length];
                for (int i3 = 0; i3 < iM2926p; i3++) {
                    int length = c0438jArr.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        zArr2[i4] = zArr2[i4] | m2899I(iArr, c0438jArr[i4]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                for (int i5 = 0; i5 < c0438jArr.length; i5++) {
                    if (zArr2[i5]) {
                        C0438j c0438j2 = c0438jArr[i5];
                        C0441m c0441m = c0438j2.f2185a;
                        if (c0441m.f2221a >= c0441m.f2222b) {
                            c0438j2.f2187c = false;
                            break;
                        }
                    }
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: R */
        public final void m2908R(int[] iArr) {
            Arrays.fill(m2927q(), 0);
            m2905O(iArr);
            boolean z = true;
            int childCount = (this.f2209v.f2239a * GridLayout.this.getChildCount()) + 1;
            if (childCount < 2) {
                return;
            }
            float fM2914d = m2914d();
            int i = -1;
            int i2 = 0;
            while (i2 < childCount) {
                int i3 = (int) ((((long) i2) + ((long) childCount)) / 2);
                m2896F();
                m2903M(i3, fM2914d);
                boolean zM2907Q = m2907Q(m2924n(), iArr, false);
                if (zM2907Q) {
                    i2 = i3 + 1;
                    i = i3;
                } else {
                    childCount = i3;
                }
                z = zM2907Q;
            }
            if (i <= 0 || z) {
                return;
            }
            m2896F();
            m2903M(i, fM2914d);
            m2905O(iArr);
        }

        /* JADX INFO: renamed from: S */
        public final C0438j[] m2909S(List<C0438j> list) {
            return m2910T((C0438j[]) list.toArray(new C0438j[list.size()]));
        }

        /* JADX INFO: renamed from: T */
        public final C0438j[] m2910T(C0438j[] c0438jArr) {
            return new a(c0438jArr).m2937a();
        }

        /* JADX INFO: renamed from: a */
        public final void m2911a(List<C0438j> list, C0444p<C0441m, C0443o> c0444p) {
            int i = 0;
            while (true) {
                C0441m[] c0441mArr = c0444p.f2241b;
                if (i >= c0441mArr.length) {
                    return;
                }
                m2893C(list, c0441mArr[i], c0444p.f2242c[i], false);
                i++;
            }
        }

        /* JADX INFO: renamed from: b */
        public final String m2912b(List<C0438j> list) {
            StringBuilder sb;
            String str = this.f2188a ? BaseSei.f13930X : BaseSei.f13931Y;
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (C0438j c0438j : list) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(", ");
                }
                C0441m c0441m = c0438j.f2185a;
                int i = c0441m.f2221a;
                int i2 = c0441m.f2222b;
                int i3 = c0438j.f2186b.f2239a;
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
        public final int m2913c() {
            int childCount = GridLayout.this.getChildCount();
            int iMax = -1;
            for (int i = 0; i < childCount; i++) {
                C0442n c0442nM2872q = GridLayout.this.m2872q(GridLayout.this.getChildAt(i));
                C0441m c0441m = (this.f2188a ? c0442nM2872q.f2238b : c0442nM2872q.f2237a).f2245b;
                iMax = Math.max(Math.max(Math.max(iMax, c0441m.f2221a), c0441m.f2222b), c0441m.m2941b());
            }
            if (iMax == -1) {
                return Integer.MIN_VALUE;
            }
            return iMax;
        }

        /* JADX INFO: renamed from: d */
        public final float m2914d() {
            int childCount = GridLayout.this.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    C0442n c0442nM2872q = GridLayout.this.m2872q(childAt);
                    f += (this.f2188a ? c0442nM2872q.f2238b : c0442nM2872q.f2237a).f2247d;
                }
            }
            return f;
        }

        /* JADX INFO: renamed from: e */
        public final void m2915e() {
            m2928r();
            m2925o();
        }

        /* JADX INFO: renamed from: f */
        public final void m2916f() {
            for (C0440l c0440l : this.f2191d.f2242c) {
                c0440l.mo2888d();
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                C0442n c0442nM2872q = GridLayout.this.m2872q(childAt);
                boolean z = this.f2188a;
                C0445q c0445q = z ? c0442nM2872q.f2238b : c0442nM2872q.f2237a;
                this.f2191d.m2949c(i).m2939c(GridLayout.this, childAt, c0445q, this, GridLayout.this.m2876u(childAt, z) + (c0445q.f2247d == 0.0f ? 0 : m2927q()[i]));
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m2917g() {
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    C0442n c0442nM2872q = GridLayout.this.m2872q(childAt);
                    if ((this.f2188a ? c0442nM2872q.f2238b : c0442nM2872q.f2237a).f2247d != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public final void m2918h(C0444p<C0441m, C0443o> c0444p, boolean z) {
            for (C0443o c0443o : c0444p.f2242c) {
                c0443o.m2946a();
            }
            C0440l[] c0440lArr = m2929s().f2242c;
            for (int i = 0; i < c0440lArr.length; i++) {
                int iMo2889e = c0440lArr[i].mo2889e(z);
                C0443o c0443oM2949c = c0444p.m2949c(i);
                int i2 = c0443oM2949c.f2239a;
                if (!z) {
                    iMo2889e = -iMo2889e;
                }
                c0443oM2949c.f2239a = Math.max(i2, iMo2889e);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m2919i(int[] iArr) {
            if (m2891A()) {
                m2908R(iArr);
            } else {
                m2905O(iArr);
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
        public final void m2920j(boolean z) {
            int[] iArr = z ? this.f2197j : this.f2199l;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    C0442n c0442nM2872q = GridLayout.this.m2872q(childAt);
                    boolean z2 = this.f2188a;
                    C0441m c0441m = (z2 ? c0442nM2872q.f2238b : c0442nM2872q.f2237a).f2245b;
                    int i2 = z ? c0441m.f2221a : c0441m.f2222b;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.m2874s(childAt, z2, z));
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public final C0438j[] m2921k() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m2911a(arrayList, m2928r());
            m2911a(arrayList2, m2925o());
            if (this.f2208u) {
                int i = 0;
                while (i < m2926p()) {
                    int i2 = i + 1;
                    m2892B(arrayList, new C0441m(i, i2), new C0443o(0));
                    i = i2;
                }
            }
            int iM2926p = m2926p();
            m2893C(arrayList, new C0441m(0, iM2926p), this.f2209v, false);
            m2893C(arrayList2, new C0441m(iM2926p, 0), this.f2210w, false);
            return (C0438j[]) GridLayout.m2853b(m2909S(arrayList), m2909S(arrayList2));
        }

        /* JADX INFO: renamed from: l */
        public final C0444p<C0445q, C0440l> m2922l() {
            Assoc assocM2881of = Assoc.m2881of(C0445q.class, C0440l.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0442n c0442nM2872q = GridLayout.this.m2872q(GridLayout.this.getChildAt(i));
                boolean z = this.f2188a;
                C0445q c0445q = z ? c0442nM2872q.f2238b : c0442nM2872q.f2237a;
                assocM2881of.put(c0445q, c0445q.m2951b(z).mo2885b());
            }
            return assocM2881of.pack();
        }

        /* JADX INFO: renamed from: m */
        public final C0444p<C0441m, C0443o> m2923m(boolean z) {
            Assoc assocM2881of = Assoc.m2881of(C0441m.class, C0443o.class);
            C0445q[] c0445qArr = m2929s().f2241b;
            int length = c0445qArr.length;
            for (int i = 0; i < length; i++) {
                assocM2881of.put(z ? c0445qArr[i].f2245b : c0445qArr[i].f2245b.m2940a(), new C0443o());
            }
            return assocM2881of.pack();
        }

        /* JADX INFO: renamed from: n */
        public C0438j[] m2924n() {
            if (this.f2201n == null) {
                this.f2201n = m2921k();
            }
            if (!this.f2202o) {
                m2915e();
                this.f2202o = true;
            }
            return this.f2201n;
        }

        /* JADX INFO: renamed from: o */
        public final C0444p<C0441m, C0443o> m2925o() {
            if (this.f2195h == null) {
                this.f2195h = m2923m(false);
            }
            if (!this.f2196i) {
                m2918h(this.f2195h, false);
                this.f2196i = true;
            }
            return this.f2195h;
        }

        /* JADX INFO: renamed from: p */
        public int m2926p() {
            return Math.max(this.f2189b, m2932v());
        }

        /* JADX INFO: renamed from: q */
        public int[] m2927q() {
            if (this.f2207t == null) {
                this.f2207t = new int[GridLayout.this.getChildCount()];
            }
            return this.f2207t;
        }

        /* JADX INFO: renamed from: r */
        public final C0444p<C0441m, C0443o> m2928r() {
            if (this.f2193f == null) {
                this.f2193f = m2923m(true);
            }
            if (!this.f2194g) {
                m2918h(this.f2193f, true);
                this.f2194g = true;
            }
            return this.f2193f;
        }

        /* JADX INFO: renamed from: s */
        public C0444p<C0445q, C0440l> m2929s() {
            if (this.f2191d == null) {
                this.f2191d = m2922l();
            }
            if (!this.f2192e) {
                m2916f();
                this.f2192e = true;
            }
            return this.f2191d;
        }

        /* JADX INFO: renamed from: t */
        public int[] m2930t() {
            if (this.f2197j == null) {
                this.f2197j = new int[m2926p() + 1];
            }
            if (!this.f2198k) {
                m2920j(true);
                this.f2198k = true;
            }
            return this.f2197j;
        }

        /* JADX INFO: renamed from: u */
        public int[] m2931u() {
            if (this.f2203p == null) {
                this.f2203p = new int[m2926p() + 1];
            }
            if (!this.f2204q) {
                m2919i(this.f2203p);
                this.f2204q = true;
            }
            return this.f2203p;
        }

        /* JADX INFO: renamed from: v */
        public final int m2932v() {
            if (this.f2190c == Integer.MIN_VALUE) {
                this.f2190c = Math.max(0, m2913c());
            }
            return this.f2190c;
        }

        /* JADX INFO: renamed from: w */
        public int m2933w(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return m2934x(0, size);
            }
            if (mode == 0) {
                return m2934x(0, LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
            }
            if (mode != 1073741824) {
                return 0;
            }
            return m2934x(size, size);
        }

        /* JADX INFO: renamed from: x */
        public final int m2934x(int i, int i2) {
            m2902L(i, i2);
            return m2904N(m2931u());
        }

        /* JADX INFO: renamed from: y */
        public int[] m2935y() {
            if (this.f2199l == null) {
                this.f2199l = new int[m2926p() + 1];
            }
            if (!this.f2200m) {
                m2920j(false);
                this.f2200m = true;
            }
            return this.f2199l;
        }

        /* JADX INFO: renamed from: z */
        public C0438j[][] m2936z(C0438j[] c0438jArr) {
            int iM2926p = m2926p() + 1;
            C0438j[][] c0438jArr2 = new C0438j[iM2926p][];
            int[] iArr = new int[iM2926p];
            for (C0438j c0438j : c0438jArr) {
                int i = c0438j.f2185a.f2221a;
                iArr[i] = iArr[i] + 1;
            }
            for (int i2 = 0; i2 < iM2926p; i2++) {
                c0438jArr2[i2] = new C0438j[iArr[i2]];
            }
            Arrays.fill(iArr, 0);
            for (C0438j c0438j2 : c0438jArr) {
                int i3 = c0438j2.f2185a.f2221a;
                C0438j[] c0438jArr3 = c0438jArr2[i3];
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                c0438jArr3[i4] = c0438j2;
            }
            return c0438jArr2;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$l */
    public static class C0440l {

        /* JADX INFO: renamed from: a */
        public int f2218a;

        /* JADX INFO: renamed from: b */
        public int f2219b;

        /* JADX INFO: renamed from: c */
        public int f2220c;

        public C0440l() {
            mo2888d();
        }

        /* JADX INFO: renamed from: a */
        public int mo2886a(GridLayout gridLayout, View view, AbstractC0437i abstractC0437i, int i, boolean z) {
            return this.f2218a - abstractC0437i.mo2882a(view, i, vbl0.m197722a(gridLayout));
        }

        /* JADX INFO: renamed from: b */
        public void mo2887b(int i, int i2) {
            this.f2218a = Math.max(this.f2218a, i);
            this.f2219b = Math.max(this.f2219b, i2);
        }

        /* JADX INFO: renamed from: c */
        public final void m2939c(GridLayout gridLayout, View view, C0445q c0445q, C0439k c0439k, int i) {
            this.f2220c &= c0445q.m2952c();
            int iMo2882a = c0445q.m2951b(c0439k.f2188a).mo2882a(view, i, vbl0.m197722a(gridLayout));
            mo2887b(iMo2882a, i - iMo2882a);
        }

        /* JADX INFO: renamed from: d */
        public void mo2888d() {
            this.f2218a = Integer.MIN_VALUE;
            this.f2219b = Integer.MIN_VALUE;
            this.f2220c = 2;
        }

        /* JADX INFO: renamed from: e */
        public int mo2889e(boolean z) {
            return (z || !GridLayout.m2854c(this.f2220c)) ? this.f2218a + this.f2219b : LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
        }

        public String toString() {
            return "Bounds{before=" + this.f2218a + ", after=" + this.f2219b + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$m */
    public static final class C0441m {

        /* JADX INFO: renamed from: a */
        public final int f2221a;

        /* JADX INFO: renamed from: b */
        public final int f2222b;

        public C0441m(int i, int i2) {
            this.f2221a = i;
            this.f2222b = i2;
        }

        /* JADX INFO: renamed from: a */
        public C0441m m2940a() {
            return new C0441m(this.f2222b, this.f2221a);
        }

        /* JADX INFO: renamed from: b */
        public int m2941b() {
            return this.f2222b - this.f2221a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0441m.class != obj.getClass()) {
                return false;
            }
            C0441m c0441m = (C0441m) obj;
            return this.f2222b == c0441m.f2222b && this.f2221a == c0441m.f2221a;
        }

        public int hashCode() {
            return (this.f2221a * 31) + this.f2222b;
        }

        public String toString() {
            return "[" + this.f2221a + ", " + this.f2222b + Constants.AES_SUFFIX;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$p */
    public static final class C0444p<K, V> {

        /* JADX INFO: renamed from: a */
        public final int[] f2240a;

        /* JADX INFO: renamed from: b */
        public final K[] f2241b;

        /* JADX INFO: renamed from: c */
        public final V[] f2242c;

        public C0444p(K[] kArr, V[] vArr) {
            int[] iArrM2948b = m2948b(kArr);
            this.f2240a = iArrM2948b;
            this.f2241b = (K[]) m2947a(kArr, iArrM2948b);
            this.f2242c = (V[]) m2947a(vArr, iArrM2948b);
        }

        /* JADX INFO: renamed from: a */
        public static <K> K[] m2947a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.m2845A(iArr, -1) + 1));
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }

        /* JADX INFO: renamed from: b */
        public static <K> int[] m2948b(K[] kArr) {
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
        public V m2949c(int i) {
            return this.f2242c[this.f2240a[i]];
        }
    }

    static {
        C0431c c0431c = new C0431c();
        f2165s = c0431c;
        C0432d c0432d = new C0432d();
        f2166t = c0432d;
        f2167u = c0431c;
        f2168v = c0432d;
        f2169w = c0431c;
        f2170x = c0432d;
        f2171y = m2856h(c0431c, c0432d);
        f2172z = m2856h(c0432d, c0431c);
        f2152A = new C0434f();
        f2153B = new C0435g();
        f2154C = new C0436h();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2173a = new C0439k(true);
        this.f2174b = new C0439k(false);
        this.f2175c = 0;
        this.f2176d = false;
        this.f2177e = 1;
        this.f2179g = 0;
        this.f2180h = f2155i;
        this.f2178f = context.getResources().getDimensionPixelOffset(i2c0.f110547a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x9c0.f191589a);
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
    public static int m2845A(int[] iArr, int i) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX INFO: renamed from: D */
    public static void m2846D(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    /* JADX INFO: renamed from: E */
    public static void m2847E(C0442n c0442n, int i, int i2, int i3, int i4) {
        c0442n.m2945d(new C0441m(i, i2 + i));
        c0442n.m2944c(new C0441m(i3, i4 + i3));
    }

    /* JADX INFO: renamed from: F */
    public static C0445q m2848F(int i) {
        return m2849G(i, 1);
    }

    /* JADX INFO: renamed from: G */
    public static C0445q m2849G(int i, int i2) {
        return m2850H(i, i2, f2164r);
    }

    /* JADX INFO: renamed from: H */
    public static C0445q m2850H(int i, int i2, AbstractC0437i abstractC0437i) {
        return m2851I(i, i2, abstractC0437i, 0.0f);
    }

    /* JADX INFO: renamed from: I */
    public static C0445q m2851I(int i, int i2, AbstractC0437i abstractC0437i, float f) {
        return new C0445q(i != Integer.MIN_VALUE, i, i2, abstractC0437i, f);
    }

    /* JADX INFO: renamed from: a */
    public static int m2852a(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 + i), View.MeasureSpec.getMode(i));
    }

    /* JADX INFO: renamed from: b */
    public static <T> T[] m2853b(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2854c(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m2855e(C0441m c0441m, boolean z, int i) {
        int iM2941b = c0441m.m2941b();
        if (i == 0) {
            return iM2941b;
        }
        return Math.min(iM2941b, i - (z ? Math.min(c0441m.f2221a, i) : 0));
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC0437i m2856h(AbstractC0437i abstractC0437i, AbstractC0437i abstractC0437i2) {
        return new C0433e(abstractC0437i, abstractC0437i2);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2857i(int[] iArr, int i, int i2, int i3) {
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
    public static AbstractC0437i m2858m(int i, boolean z) {
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
    public static void m2859w(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    /* JADX INFO: renamed from: B */
    public final void m2860B(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, m2877v(view, true), i3), ViewGroup.getChildMeasureSpec(i2, m2877v(view, false), i4));
    }

    /* JADX INFO: renamed from: C */
    public final void m2861C(int i, int i2, boolean z) {
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
                C0442n c0442nM2872q = this.m2872q(childAt);
                if (z) {
                    int i6 = ((ViewGroup.MarginLayoutParams) c0442nM2872q).width;
                    int i7 = ((ViewGroup.MarginLayoutParams) c0442nM2872q).height;
                    gridLayout = this;
                    i3 = i;
                    i4 = i2;
                    gridLayout.m2860B(childAt, i3, i4, i6, i7);
                } else {
                    i3 = i;
                    i4 = i2;
                    boolean z2 = this.f2175c == 0;
                    C0445q c0445q = z2 ? c0442nM2872q.f2238b : c0442nM2872q.f2237a;
                    if (c0445q.m2951b(z2) == f2154C) {
                        C0441m c0441m = c0445q.f2245b;
                        int[] iArrM2931u = (z2 ? this.f2173a : this.f2174b).m2931u();
                        int iM2877v = (iArrM2931u[c0441m.f2222b] - iArrM2931u[c0441m.f2221a]) - this.m2877v(childAt, z2);
                        if (z2) {
                            int i8 = ((ViewGroup.MarginLayoutParams) c0442nM2872q).height;
                            gridLayout = this;
                            gridLayout.m2860B(childAt, i3, i4, iM2877v, i8);
                        } else {
                            int i9 = ((ViewGroup.MarginLayoutParams) c0442nM2872q).width;
                            gridLayout = this;
                            gridLayout.m2860B(childAt, i3, i4, i9, iM2877v);
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
    public final void m2862J() {
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
            C0442n c0442n = (C0442n) getChildAt(i4).getLayoutParams();
            C0445q c0445q = z ? c0442n.f2237a : c0442n.f2238b;
            C0441m c0441m = c0445q.f2245b;
            boolean z2 = c0445q.f2244a;
            int iM2941b = c0441m.m2941b();
            if (z2) {
                i2 = c0441m.f2221a;
            }
            C0445q c0445q2 = z ? c0442n.f2238b : c0442n.f2237a;
            C0441m c0441m2 = c0445q2.f2245b;
            boolean z3 = c0445q2.f2244a;
            int iM2855e = m2855e(c0441m2, z3, i);
            if (z3) {
                i3 = c0441m2.f2221a;
            }
            if (i != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i5 = i3 + iM2855e;
                        if (m2857i(iArr, i2, i3, i5)) {
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
                m2846D(iArr, i3, i3 + iM2855e, i2 + iM2941b);
            }
            if (z) {
                m2847E(c0442n, i2, iM2941b, i3, iM2855e);
            } else {
                m2847E(c0442n, i3, iM2855e, i2, iM2941b);
            }
            i3 += iM2855e;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0442n)) {
            return false;
        }
        C0442n c0442n = (C0442n) layoutParams;
        m2863d(c0442n, true);
        m2863d(c0442n, false);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m2863d(C0442n c0442n, boolean z) {
        String str = z ? "column" : "row";
        C0441m c0441m = (z ? c0442n.f2238b : c0442n.f2237a).f2245b;
        int i = c0441m.f2221a;
        if (i != Integer.MIN_VALUE && i < 0) {
            m2859w(str.concat(" indices must be positive"));
        }
        int i2 = (z ? this.f2173a : this.f2174b).f2189b;
        if (i2 != Integer.MIN_VALUE) {
            if (c0441m.f2222b > i2) {
                m2859w(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (c0441m.m2941b() > i2) {
                m2859w(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m2864f() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                iHashCode = (iHashCode * 31) + ((C0442n) childAt.getLayoutParams()).hashCode();
            }
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: g */
    public final void m2865g() {
        int i = this.f2179g;
        if (i == 0) {
            m2862J();
            this.f2179g = m2864f();
        } else if (i != m2864f()) {
            this.f2180h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            m2878x();
            m2865g();
        }
    }

    public int getAlignmentMode() {
        return this.f2177e;
    }

    public int getColumnCount() {
        return this.f2173a.m2926p();
    }

    public int getOrientation() {
        return this.f2175c;
    }

    public Printer getPrinter() {
        return this.f2180h;
    }

    public int getRowCount() {
        return this.f2174b.m2926p();
    }

    public boolean getUseDefaultMargins() {
        return this.f2176d;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0442n generateDefaultLayoutParams() {
        return new C0442n();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0442n generateLayoutParams(AttributeSet attributeSet) {
        return new C0442n(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0442n generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0442n) {
            return new C0442n((C0442n) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0442n((ViewGroup.MarginLayoutParams) layoutParams) : new C0442n(layoutParams);
    }

    /* JADX INFO: renamed from: n */
    public final int m2869n(View view, C0442n c0442n, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (!this.f2176d) {
            return 0;
        }
        C0445q c0445q = z ? c0442n.f2238b : c0442n.f2237a;
        C0439k c0439k = z ? this.f2173a : this.f2174b;
        C0441m c0441m = c0445q.f2245b;
        if (z && m2880z()) {
            z3 = !z2;
        } else {
            z3 = z2;
        }
        if (!z3 ? c0441m.f2222b == c0439k.m2926p() : c0441m.f2221a == 0) {
            z4 = true;
        }
        return m2871p(view, z4, z, z2);
    }

    /* JADX INFO: renamed from: o */
    public final int m2870o(View view, boolean z, boolean z2) {
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
        gridLayout.m2865g();
        int i8 = i3 - i;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        gridLayout.f2173a.m2897G((i8 - paddingLeft) - paddingRight);
        gridLayout.f2174b.m2897G(((i4 - i2) - paddingTop) - paddingBottom);
        int[] iArrM2931u = gridLayout.f2173a.m2931u();
        int[] iArrM2931u2 = gridLayout.f2174b.m2931u();
        int childCount = gridLayout.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = gridLayout.getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                i5 = i8;
                i6 = paddingLeft;
                i7 = paddingTop;
            } else {
                C0442n c0442nM2872q = gridLayout.m2872q(childAt);
                C0445q c0445q = c0442nM2872q.f2238b;
                C0445q c0445q2 = c0442nM2872q.f2237a;
                C0441m c0441m = c0445q.f2245b;
                C0441m c0441m2 = c0445q2.f2245b;
                int i10 = iArrM2931u[c0441m.f2221a];
                int i11 = iArrM2931u2[c0441m2.f2221a];
                int i12 = iArrM2931u[c0441m.f2222b] - i10;
                int i13 = iArrM2931u2[c0441m2.f2222b] - i11;
                int iM2875t = gridLayout.m2875t(childAt, true);
                i5 = i8;
                int iM2875t2 = gridLayout.m2875t(childAt, false);
                AbstractC0437i abstractC0437iM2951b = c0445q.m2951b(true);
                AbstractC0437i abstractC0437iM2951b2 = c0445q2.m2951b(false);
                C0440l c0440lM2949c = gridLayout.f2173a.m2929s().m2949c(i9);
                C0440l c0440lM2949c2 = gridLayout.f2174b.m2929s().m2949c(i9);
                i6 = paddingLeft;
                int iMo2884d = abstractC0437iM2951b.mo2884d(childAt, i12 - c0440lM2949c.mo2889e(true));
                int iMo2884d2 = abstractC0437iM2951b2.mo2884d(childAt, i13 - c0440lM2949c2.mo2889e(true));
                int iM2873r = gridLayout.m2873r(childAt, true, true);
                int iM2873r2 = gridLayout.m2873r(childAt, false, true);
                int iM2873r3 = gridLayout.m2873r(childAt, true, false);
                int i14 = iM2873r + iM2873r3;
                int iM2873r4 = iM2873r2 + gridLayout.m2873r(childAt, false, false);
                int iMo2886a = c0440lM2949c.mo2886a(gridLayout, childAt, abstractC0437iM2951b, iM2875t + i14, true);
                i7 = paddingTop;
                int iMo2886a2 = c0440lM2949c2.mo2886a(this, childAt, abstractC0437iM2951b2, iM2875t2 + iM2873r4, false);
                int iMo2890e = abstractC0437iM2951b.mo2890e(childAt, iM2875t, i12 - i14);
                int iMo2890e2 = abstractC0437iM2951b2.mo2890e(childAt, iM2875t2, i13 - iM2873r4);
                int i15 = i10 + iMo2884d + iMo2886a;
                int i16 = !m2880z() ? i6 + iM2873r + i15 : (((i5 - iMo2890e) - paddingRight) - iM2873r3) - i15;
                int i17 = i7 + i11 + iMo2884d2 + iMo2886a2 + iM2873r2;
                if (iMo2890e != childAt.getMeasuredWidth() || iMo2890e2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iMo2890e, 1073741824), View.MeasureSpec.makeMeasureSpec(iMo2890e2, 1073741824));
                }
                childAt.layout(i16, i17, iMo2890e + i16, iMo2890e2 + i17);
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
        int iM2933w;
        int iM2933w2;
        m2865g();
        m2879y();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iM2852a = m2852a(i, -paddingLeft);
        int iM2852a2 = m2852a(i2, -paddingTop);
        m2861C(iM2852a, iM2852a2, true);
        if (this.f2175c == 0) {
            iM2933w = this.f2173a.m2933w(iM2852a);
            m2861C(iM2852a, iM2852a2, false);
            iM2933w2 = this.f2174b.m2933w(iM2852a2);
        } else {
            int iM2933w3 = this.f2174b.m2933w(iM2852a2);
            m2861C(iM2852a, iM2852a2, false);
            iM2933w = this.f2173a.m2933w(iM2852a);
            iM2933w2 = iM2933w3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iM2933w + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(iM2933w2 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    /* JADX INFO: renamed from: p */
    public final int m2871p(View view, boolean z, boolean z2, boolean z3) {
        return m2870o(view, z2, z3);
    }

    /* JADX INFO: renamed from: q */
    public final C0442n m2872q(View view) {
        return (C0442n) view.getLayoutParams();
    }

    /* JADX INFO: renamed from: r */
    public final int m2873r(View view, boolean z, boolean z2) {
        if (this.f2177e == 1) {
            return m2874s(view, z, z2);
        }
        C0439k c0439k = z ? this.f2173a : this.f2174b;
        int[] iArrM2930t = z2 ? c0439k.m2930t() : c0439k.m2935y();
        C0442n c0442nM2872q = m2872q(view);
        C0441m c0441m = (z ? c0442nM2872q.f2238b : c0442nM2872q.f2237a).f2245b;
        return iArrM2930t[z2 ? c0441m.f2221a : c0441m.f2222b];
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        m2878x();
    }

    /* JADX INFO: renamed from: s */
    public int m2874s(View view, boolean z, boolean z2) {
        int i;
        C0442n c0442nM2872q = m2872q(view);
        if (z) {
            i = z2 ? ((ViewGroup.MarginLayoutParams) c0442nM2872q).leftMargin : ((ViewGroup.MarginLayoutParams) c0442nM2872q).rightMargin;
        } else {
            i = z2 ? ((ViewGroup.MarginLayoutParams) c0442nM2872q).topMargin : ((ViewGroup.MarginLayoutParams) c0442nM2872q).bottomMargin;
        }
        return i == Integer.MIN_VALUE ? m2869n(view, c0442nM2872q, z, z2) : i;
    }

    public void setAlignmentMode(int i) {
        this.f2177e = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.f2173a.m2900J(i);
        m2878x();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.f2173a.m2901K(z);
        m2878x();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.f2175c != i) {
            this.f2175c = i;
            m2878x();
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
        this.f2174b.m2900J(i);
        m2878x();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.f2174b.m2901K(z);
        m2878x();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.f2176d = z;
        requestLayout();
    }

    /* JADX INFO: renamed from: t */
    public final int m2875t(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: u */
    public final int m2876u(View view, boolean z) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return m2875t(view, z) + m2877v(view, z);
    }

    /* JADX INFO: renamed from: v */
    public final int m2877v(View view, boolean z) {
        return m2873r(view, z, true) + m2873r(view, z, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m2878x() {
        this.f2179g = 0;
        C0439k c0439k = this.f2173a;
        if (c0439k != null) {
            c0439k.m2895E();
        }
        C0439k c0439k2 = this.f2174b;
        if (c0439k2 != null) {
            c0439k2.m2895E();
        }
        m2879y();
    }

    /* JADX INFO: renamed from: y */
    public final void m2879y() {
        C0439k c0439k = this.f2173a;
        if (c0439k == null || this.f2174b == null) {
            return;
        }
        c0439k.m2896F();
        this.f2174b.m2896F();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2880z() {
        return gbl0.m125228x(this) == 1;
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$o */
    public static final class C0443o {

        /* JADX INFO: renamed from: a */
        public int f2239a;

        public C0443o() {
            m2946a();
        }

        /* JADX INFO: renamed from: a */
        public void m2946a() {
            this.f2239a = Integer.MIN_VALUE;
        }

        public String toString() {
            return Integer.toString(this.f2239a);
        }

        public C0443o(int i) {
            this.f2239a = i;
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$q */
    public static class C0445q {

        /* JADX INFO: renamed from: e */
        public static final C0445q f2243e = GridLayout.m2848F(Integer.MIN_VALUE);

        /* JADX INFO: renamed from: a */
        public final boolean f2244a;

        /* JADX INFO: renamed from: b */
        public final C0441m f2245b;

        /* JADX INFO: renamed from: c */
        public final AbstractC0437i f2246c;

        /* JADX INFO: renamed from: d */
        public final float f2247d;

        public C0445q(boolean z, C0441m c0441m, AbstractC0437i abstractC0437i, float f) {
            this.f2244a = z;
            this.f2245b = c0441m;
            this.f2246c = abstractC0437i;
            this.f2247d = f;
        }

        /* JADX INFO: renamed from: a */
        public final C0445q m2950a(C0441m c0441m) {
            return new C0445q(this.f2244a, c0441m, this.f2246c, this.f2247d);
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0437i m2951b(boolean z) {
            AbstractC0437i abstractC0437i = this.f2246c;
            if (abstractC0437i != GridLayout.f2164r) {
                return abstractC0437i;
            }
            if (this.f2247d == 0.0f) {
                return z ? GridLayout.f2169w : GridLayout.f2153B;
            }
            return GridLayout.f2154C;
        }

        /* JADX INFO: renamed from: c */
        public final int m2952c() {
            return (this.f2246c == GridLayout.f2164r && this.f2247d == 0.0f) ? 0 : 2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0445q c0445q = (C0445q) obj;
            return this.f2246c.equals(c0445q.f2246c) && this.f2245b.equals(c0445q.f2245b);
        }

        public int hashCode() {
            return (this.f2245b.hashCode() * 31) + this.f2246c.hashCode();
        }

        public C0445q(boolean z, int i, int i2, AbstractC0437i abstractC0437i, float f) {
            this(z, new C0441m(i, i2 + i), abstractC0437i, f);
        }
    }

    /* JADX INFO: renamed from: androidx.gridlayout.widget.GridLayout$n */
    public static class C0442n extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c */
        public static final C0441m f2223c;

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
        public C0445q f2237a;

        /* JADX INFO: renamed from: b */
        public C0445q f2238b;

        static {
            C0441m c0441m = new C0441m(Integer.MIN_VALUE, -2147483647);
            f2223c = c0441m;
            f2224d = c0441m.m2941b();
            f2225e = x9c0.f191598j;
            f2226f = x9c0.f191599k;
            f2227g = x9c0.f191600l;
            f2228h = x9c0.f191601m;
            f2229i = x9c0.f191602n;
            f2230j = x9c0.f191603o;
            f2231k = x9c0.f191604p;
            f2232l = x9c0.f191605q;
            f2233m = x9c0.f191607s;
            f2234n = x9c0.f191608t;
            f2235o = x9c0.f191609u;
            f2236p = x9c0.f191606r;
        }

        public C0442n(C0442n c0442n) {
            super((ViewGroup.MarginLayoutParams) c0442n);
            C0445q c0445q = C0445q.f2243e;
            this.f2237a = c0445q;
            this.f2238b = c0445q;
            this.f2237a = c0442n.f2237a;
            this.f2238b = c0442n.f2238b;
        }

        /* JADX INFO: renamed from: a */
        public final void m2942a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x9c0.f191597i);
            try {
                int i = typedArrayObtainStyledAttributes.getInt(f2236p, 0);
                int i2 = typedArrayObtainStyledAttributes.getInt(f2230j, Integer.MIN_VALUE);
                int i3 = f2231k;
                int i4 = f2224d;
                this.f2238b = GridLayout.m2851I(i2, typedArrayObtainStyledAttributes.getInt(i3, i4), GridLayout.m2858m(i, true), typedArrayObtainStyledAttributes.getFloat(f2232l, 0.0f));
                this.f2237a = GridLayout.m2851I(typedArrayObtainStyledAttributes.getInt(f2233m, Integer.MIN_VALUE), typedArrayObtainStyledAttributes.getInt(f2234n, i4), GridLayout.m2858m(i, false), typedArrayObtainStyledAttributes.getFloat(f2235o, 0.0f));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2943b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x9c0.f191597i);
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
        public final void m2944c(C0441m c0441m) {
            this.f2238b = this.f2238b.m2950a(c0441m);
        }

        /* JADX INFO: renamed from: d */
        public final void m2945d(C0441m c0441m) {
            this.f2237a = this.f2237a.m2950a(c0441m);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0442n c0442n = (C0442n) obj;
            return this.f2238b.equals(c0442n.f2238b) && this.f2237a.equals(c0442n.f2237a);
        }

        public int hashCode() {
            return (this.f2237a.hashCode() * 31) + this.f2238b.hashCode();
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i2, -2);
        }

        public C0442n(C0445q c0445q, C0445q c0445q2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, c0445q, c0445q2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public C0442n() {
            C0445q c0445q = C0445q.f2243e;
            this(c0445q, c0445q);
        }

        public C0442n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            C0445q c0445q = C0445q.f2243e;
            this.f2237a = c0445q;
            this.f2238b = c0445q;
        }

        public C0442n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            C0445q c0445q = C0445q.f2243e;
            this.f2237a = c0445q;
            this.f2238b = c0445q;
        }

        public C0442n(int i, int i2, int i3, int i4, int i5, int i6, C0445q c0445q, C0445q c0445q2) {
            super(i, i2);
            C0445q c0445q3 = C0445q.f2243e;
            this.f2237a = c0445q3;
            this.f2238b = c0445q3;
            setMargins(i3, i4, i5, i6);
            this.f2237a = c0445q;
            this.f2238b = c0445q2;
        }

        public C0442n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0445q c0445q = C0445q.f2243e;
            this.f2237a = c0445q;
            this.f2238b = c0445q;
            m2943b(context, attributeSet);
            m2942a(context, attributeSet);
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }
}
