package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p149l.a3j;
import p149l.b3j;
import p149l.cve0;
import p149l.e01;
import p149l.gbl0;
import p149l.gf4;
import p149l.ig3;
import p149l.t2j;
import p149l.yh50;
import p149l.z2j;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public class C0428l {

    /* JADX INFO: renamed from: a */
    public static final int[] f2109a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b */
    public static final a3j f2110b = new z2j();

    /* JADX INFO: renamed from: c */
    public static final a3j f2111c = m2842x();

    /* JADX INFO: renamed from: androidx.fragment.app.l$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g f2112a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Fragment f2113b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gf4 f2114c;

        public a(g gVar, Fragment fragment, gf4 gf4Var) {
            this.f2112a = gVar;
            this.f2113b = fragment;
            this.f2114c = gf4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2112a.mo2613a(this.f2113b, this.f2114c);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2115a;

        public b(ArrayList arrayList) {
            this.f2115a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0428l.m2817B(this.f2115a, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g f2116a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Fragment f2117b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gf4 f2118c;

        public c(g gVar, Fragment fragment, gf4 gf4Var) {
            this.f2116a = gVar;
            this.f2117b = fragment;
            this.f2118c = gf4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2116a.mo2613a(this.f2117b, this.f2118c);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f2119a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ a3j f2120b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f2121c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Fragment f2122d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ArrayList f2123e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f2124f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ArrayList f2125g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f2126h;

        public d(Object obj, a3j a3jVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2119a = obj;
            this.f2120b = a3jVar;
            this.f2121c = view;
            this.f2122d = fragment;
            this.f2123e = arrayList;
            this.f2124f = arrayList2;
            this.f2125g = arrayList3;
            this.f2126h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2119a;
            if (obj != null) {
                this.f2120b.mo94709p(obj, this.f2121c);
                this.f2124f.addAll(C0428l.m2829k(this.f2120b, this.f2119a, this.f2122d, this.f2123e, this.f2121c));
            }
            if (this.f2125g != null) {
                if (this.f2126h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2121c);
                    this.f2120b.mo94710q(this.f2126h, this.f2125g, arrayList);
                }
                this.f2125g.clear();
                this.f2125g.add(this.f2121c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f2127a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Fragment f2128b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f2129c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ e01 f2130d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f2131e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ a3j f2132f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Rect f2133g;

        public e(Fragment fragment, Fragment fragment2, boolean z, e01 e01Var, View view, a3j a3jVar, Rect rect) {
            this.f2127a = fragment;
            this.f2128b = fragment2;
            this.f2129c = z;
            this.f2130d = e01Var;
            this.f2131e = view;
            this.f2132f = a3jVar;
            this.f2133g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0428l.m2824f(this.f2127a, this.f2128b, this.f2129c, this.f2130d, false);
            View view = this.f2131e;
            if (view != null) {
                this.f2132f.m94705k(view, this.f2133g);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ a3j f2134a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e01 f2135b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f2136c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ h f2137d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ArrayList f2138e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f2139f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Fragment f2140g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Fragment f2141h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ boolean f2142i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ArrayList f2143j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Object f2144k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ Rect f2145l;

        public f(a3j a3jVar, e01 e01Var, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2134a = a3jVar;
            this.f2135b = e01Var;
            this.f2136c = obj;
            this.f2137d = hVar;
            this.f2138e = arrayList;
            this.f2139f = view;
            this.f2140g = fragment;
            this.f2141h = fragment2;
            this.f2142i = z;
            this.f2143j = arrayList2;
            this.f2144k = obj2;
            this.f2145l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            e01<String, View> e01VarM2826h = C0428l.m2826h(this.f2134a, this.f2135b, this.f2136c, this.f2137d);
            if (e01VarM2826h != null) {
                this.f2138e.addAll(e01VarM2826h.values());
                this.f2138e.add(this.f2139f);
            }
            C0428l.m2824f(this.f2140g, this.f2141h, this.f2142i, e01VarM2826h, false);
            Object obj = this.f2136c;
            if (obj != null) {
                this.f2134a.mo94696A(obj, this.f2143j, this.f2138e);
                View viewM2838t = C0428l.m2838t(e01VarM2826h, this.f2137d, this.f2144k, this.f2142i);
                if (viewM2838t != null) {
                    this.f2134a.m94705k(viewM2838t, this.f2145l);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo2613a(@NonNull Fragment fragment, @NonNull gf4 gf4Var);

        /* JADX INFO: renamed from: b */
        void mo2614b(@NonNull Fragment fragment, @NonNull gf4 gf4Var);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        public Fragment f2146a;

        /* JADX INFO: renamed from: b */
        public boolean f2147b;

        /* JADX INFO: renamed from: c */
        public C0417a f2148c;

        /* JADX INFO: renamed from: d */
        public Fragment f2149d;

        /* JADX INFO: renamed from: e */
        public boolean f2150e;

        /* JADX INFO: renamed from: f */
        public C0417a f2151f;
    }

    /* JADX INFO: renamed from: A */
    public static void m2816A(a3j a3jVar, Object obj, Object obj2, e01<String, View> e01Var, boolean z, C0417a c0417a) {
        ArrayList<String> arrayList = c0417a.f2097p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = e01Var.get(z ? c0417a.f2098q.get(0) : c0417a.f2097p.get(0));
        a3jVar.mo94715v(obj, view);
        if (obj2 != null) {
            a3jVar.mo94715v(obj2, view);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m2817B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m2818C(@NonNull Context context, @NonNull t2j t2jVar, ArrayList<C0417a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0417a c0417a = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m2823e(c0417a, sparseArray, z);
            } else {
                m2821c(c0417a, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                e01<String, String> e01VarM2822d = m2822d(iKeyAt, arrayList, arrayList2, i, i2);
                h hVar = (h) sparseArray.valueAt(i4);
                if (t2jVar.mo2459d() && (viewGroup = (ViewGroup) t2jVar.mo2458c(iKeyAt)) != null) {
                    if (z) {
                        m2833o(viewGroup, hVar, view, e01VarM2822d, gVar);
                    } else {
                        m2832n(viewGroup, hVar, view, e01VarM2822d, gVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2819a(ArrayList<View> arrayList, e01<String, View> e01Var, Collection<String> collection) {
        for (int size = e01Var.size() - 1; size >= 0; size--) {
            View viewM130827m = e01Var.m130827m(size);
            if (collection.contains(gbl0.m125157F(viewM130827m))) {
                arrayList.add(viewM130827m);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003a  */
    /* JADX WARN: Code duplicated, block: B:32:0x003c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0052  */
    /* JADX WARN: Code duplicated, block: B:43:0x0054  */
    /* JADX WARN: Code duplicated, block: B:50:0x0063  */
    /* JADX WARN: Code duplicated, block: B:64:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0084  */
    /* JADX WARN: Code duplicated, block: B:66:0x0087  */
    /* JADX INFO: renamed from: b */
    public static void m2820b(C0417a c0417a, AbstractC0427k.a aVar, SparseArray<h> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        View view;
        boolean z6;
        Fragment fragment = aVar.f2102b;
        if (fragment == null || (i = fragment.mContainerId) == 0) {
            return;
        }
        int i2 = aVar.f2101a;
        if (z) {
            i2 = f2109a[i2];
        }
        boolean z7 = false;
        boolean z8 = true;
        if (i2 == 1) {
            if (z2) {
                z3 = fragment.mIsNewlyAdded;
            } else if (!fragment.mAdded || fragment.mHidden) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        } else if (i2 == 3) {
            boolean z9 = fragment.mAdded;
            if (z2 ? !z9 || fragment.mHidden : z9 || (view = fragment.mView) == null || view.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) {
                z6 = false;
            } else {
                z6 = true;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 == 4) {
            if (!z2 ? !(!fragment.mAdded || fragment.mHidden) : fragment.mHiddenChanged && fragment.mAdded && fragment.mHidden) {
                z6 = false;
            } else {
                z6 = true;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 == 5) {
            if (!z2) {
                z3 = fragment.mHidden;
            } else if (fragment.mHiddenChanged && !fragment.mHidden && fragment.mAdded) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        } else if (i2 == 6) {
            boolean z10 = fragment.mAdded;
            if (z2) {
                z6 = false;
            } else {
                z6 = false;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 != 7) {
            z5 = false;
            z8 = false;
            z4 = false;
        } else {
            if (z2) {
                z3 = fragment.mIsNewlyAdded;
            } else {
                if (fragment.mAdded) {
                }
                z3 = false;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        }
        h hVarM2834p = sparseArray.get(i);
        if (z7) {
            hVarM2834p = m2834p(hVarM2834p, sparseArray, i);
            hVarM2834p.f2146a = fragment;
            hVarM2834p.f2147b = z;
            hVarM2834p.f2148c = c0417a;
        }
        if (!z2 && z8) {
            if (hVarM2834p != null && hVarM2834p.f2149d == fragment) {
                hVarM2834p.f2149d = null;
            }
            if (!c0417a.f2099r) {
                FragmentManager fragmentManager = c0417a.f1995t;
                fragmentManager.m2586s0().m2794p(fragmentManager.m2594v(fragment));
                fragmentManager.m2521S0(fragment);
            }
        }
        if (z4 && (hVarM2834p == null || hVarM2834p.f2149d == null)) {
            hVarM2834p = m2834p(hVarM2834p, sparseArray, i);
            hVarM2834p.f2149d = fragment;
            hVarM2834p.f2150e = z;
            hVarM2834p.f2151f = c0417a;
        }
        if (z2 || !z5 || hVarM2834p == null || hVarM2834p.f2146a != fragment) {
            return;
        }
        hVarM2834p.f2146a = null;
    }

    /* JADX INFO: renamed from: c */
    public static void m2821c(C0417a c0417a, SparseArray<h> sparseArray, boolean z) {
        int size = c0417a.f2084c.size();
        for (int i = 0; i < size; i++) {
            m2820b(c0417a, c0417a.f2084c.get(i), sparseArray, false, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static e01<String, String> m2822d(int i, ArrayList<C0417a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        e01<String, String> e01Var = new e01<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0417a c0417a = arrayList.get(i4);
            if (c0417a.m2701H(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList4 = c0417a.f2097p;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    ArrayList<String> arrayList5 = c0417a.f2097p;
                    if (zBooleanValue) {
                        arrayList3 = c0417a.f2098q;
                    } else {
                        arrayList5 = c0417a.f2098q;
                        arrayList3 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList3.get(i5);
                        String str2 = arrayList5.get(i5);
                        String strRemove = e01Var.remove(str2);
                        if (strRemove != null) {
                            e01Var.put(str, strRemove);
                        } else {
                            e01Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return e01Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m2823e(C0417a c0417a, SparseArray<h> sparseArray, boolean z) {
        if (c0417a.f1995t.m2574o0().mo2459d()) {
            for (int size = c0417a.f2084c.size() - 1; size >= 0; size--) {
                m2820b(c0417a, c0417a.f2084c.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2824f(Fragment fragment, Fragment fragment2, boolean z, e01<String, View> e01Var, boolean z2) {
        cve0 enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = e01Var == null ? 0 : e01Var.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(e01Var.m130823i(i));
                arrayList.add(e01Var.m130827m(i));
            }
            if (z2) {
                enterTransitionCallback.m108859g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m108858f(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2825g(a3j a3jVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a3jVar.mo94701e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static e01<String, View> m2826h(a3j a3jVar, e01<String, String> e01Var, Object obj, h hVar) {
        cve0 enterTransitionCallback;
        ArrayList<String> arrayList;
        String strM2835q;
        Fragment fragment = hVar.f2146a;
        View view = fragment.getView();
        if (e01Var.isEmpty() || obj == null || view == null) {
            e01Var.clear();
            return null;
        }
        e01<String, View> e01Var2 = new e01<>();
        a3jVar.m94704j(e01Var2, view);
        C0417a c0417a = hVar.f2148c;
        if (hVar.f2147b) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0417a.f2097p;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0417a.f2098q;
        }
        if (arrayList != null) {
            e01Var2.m114143o(arrayList);
            e01Var2.m114143o(e01Var.values());
        }
        if (enterTransitionCallback == null) {
            m2843y(e01Var, e01Var2);
            return e01Var2;
        }
        enterTransitionCallback.m108856d(arrayList, e01Var2);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            String str = arrayList.get(size);
            View view2 = e01Var2.get(str);
            if (view2 == null) {
                String strM2835q2 = m2835q(e01Var, str);
                if (strM2835q2 != null) {
                    e01Var.remove(strM2835q2);
                }
            } else if (!str.equals(gbl0.m125157F(view2)) && (strM2835q = m2835q(e01Var, str)) != null) {
                e01Var.put(strM2835q, gbl0.m125157F(view2));
            }
        }
        return e01Var2;
    }

    /* JADX INFO: renamed from: i */
    public static e01<String, View> m2827i(a3j a3jVar, e01<String, String> e01Var, Object obj, h hVar) {
        cve0 exitTransitionCallback;
        ArrayList<String> arrayList;
        if (e01Var.isEmpty() || obj == null) {
            e01Var.clear();
            return null;
        }
        Fragment fragment = hVar.f2149d;
        e01<String, View> e01Var2 = new e01<>();
        a3jVar.m94704j(e01Var2, fragment.requireView());
        C0417a c0417a = hVar.f2151f;
        if (hVar.f2150e) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0417a.f2098q;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0417a.f2097p;
        }
        if (arrayList != null) {
            e01Var2.m114143o(arrayList);
        }
        if (exitTransitionCallback == null) {
            e01Var.m114143o(e01Var2.keySet());
            return e01Var2;
        }
        exitTransitionCallback.m108856d(arrayList, e01Var2);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            String str = arrayList.get(size);
            View view = e01Var2.get(str);
            if (view == null) {
                e01Var.remove(str);
            } else if (!str.equals(gbl0.m125157F(view))) {
                e01Var.put(gbl0.m125157F(view), e01Var.remove(str));
            }
        }
        return e01Var2;
    }

    /* JADX INFO: renamed from: j */
    public static a3j m2828j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        a3j a3jVar = f2110b;
        if (a3jVar != null && m2825g(a3jVar, arrayList)) {
            return a3jVar;
        }
        a3j a3jVar2 = f2111c;
        if (a3jVar2 != null && m2825g(a3jVar2, arrayList)) {
            return a3jVar2;
        }
        if (a3jVar == null && a3jVar2 == null) {
            return null;
        }
        ig3.m135964a("Invalid Transition types");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList<View> m2829k(a3j a3jVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            a3jVar.m94702f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(view);
            a3jVar.mo94699b(obj, arrayList2);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public static Object m2830l(a3j a3jVar, ViewGroup viewGroup, View view, e01<String, String> e01Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        View view2;
        Object obj3;
        Fragment fragment = hVar.f2146a;
        Fragment fragment2 = hVar.f2149d;
        Rect rect = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f2147b;
        Object objM2839u = e01Var.isEmpty() ? null : m2839u(a3jVar, fragment, fragment2, z);
        e01<String, View> e01VarM2827i = m2827i(a3jVar, e01Var, objM2839u, hVar);
        if (e01Var.isEmpty()) {
            objM2839u = null;
        } else {
            arrayList.addAll(e01VarM2827i.values());
        }
        if (obj == null && obj2 == null && objM2839u == null) {
            return null;
        }
        m2824f(fragment, fragment2, z, e01VarM2827i, true);
        if (objM2839u != null) {
            Rect rect2 = new Rect();
            view2 = view;
            a3jVar.mo94719z(objM2839u, view2, arrayList);
            Object obj4 = objM2839u;
            m2816A(a3jVar, obj4, obj2, e01VarM2827i, hVar.f2150e, hVar.f2151f);
            obj3 = obj4;
            if (obj != null) {
                a3jVar.mo94714u(obj, rect2);
            }
            rect = rect2;
        } else {
            view2 = view;
            obj3 = objM2839u;
        }
        yh50.m214787a(viewGroup, new f(a3jVar, e01Var, obj3, hVar, arrayList2, view2, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* JADX INFO: renamed from: m */
    public static Object m2831m(a3j a3jVar, ViewGroup viewGroup, View view, e01<String, String> e01Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Rect rect;
        Fragment fragment = hVar.f2146a;
        Fragment fragment2 = hVar.f2149d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        View view2 = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f2147b;
        Object objM2839u = e01Var.isEmpty() ? null : m2839u(a3jVar, fragment, fragment2, z);
        e01<String, View> e01VarM2827i = m2827i(a3jVar, e01Var, objM2839u, hVar);
        e01<String, View> e01VarM2826h = m2826h(a3jVar, e01Var, objM2839u, hVar);
        if (e01Var.isEmpty()) {
            if (e01VarM2827i != null) {
                e01VarM2827i.clear();
            }
            if (e01VarM2826h != null) {
                e01VarM2826h.clear();
            }
            objM2839u = null;
        } else {
            m2819a(arrayList, e01VarM2827i, e01Var.keySet());
            m2819a(arrayList2, e01VarM2826h, e01Var.values());
        }
        if (obj == null && obj2 == null && objM2839u == null) {
            return null;
        }
        m2824f(fragment, fragment2, z, e01VarM2827i, true);
        if (objM2839u != null) {
            arrayList2.add(view);
            a3jVar.mo94719z(objM2839u, view, arrayList);
            m2816A(a3jVar, objM2839u, obj2, e01VarM2827i, hVar.f2150e, hVar.f2151f);
            Rect rect2 = new Rect();
            View viewM2838t = m2838t(e01VarM2826h, hVar, obj, z);
            if (viewM2838t != null) {
                a3jVar.mo94714u(obj, rect2);
            }
            rect = rect2;
            view2 = viewM2838t;
        } else {
            rect = null;
        }
        yh50.m214787a(viewGroup, new e(fragment, fragment2, z, e01VarM2826h, view2, a3jVar, rect));
        return objM2839u;
    }

    /* JADX INFO: renamed from: n */
    public static void m2832n(@NonNull ViewGroup viewGroup, h hVar, View view, e01<String, String> e01Var, g gVar) {
        Fragment fragment = hVar.f2146a;
        Fragment fragment2 = hVar.f2149d;
        a3j a3jVarM2828j = m2828j(fragment2, fragment);
        if (a3jVarM2828j == null) {
            return;
        }
        boolean z = hVar.f2147b;
        boolean z2 = hVar.f2150e;
        Object objM2836r = m2836r(a3jVarM2828j, fragment, z);
        Object objM2837s = m2837s(a3jVarM2828j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM2830l = m2830l(a3jVarM2828j, viewGroup, view, e01Var, hVar, arrayList, arrayList2, objM2836r, objM2837s);
        if (objM2836r == null && objM2830l == null && objM2837s == null) {
            return;
        }
        ArrayList<View> arrayListM2829k = m2829k(a3jVarM2828j, objM2837s, fragment2, arrayList, view);
        if (arrayListM2829k == null || arrayListM2829k.isEmpty()) {
            objM2837s = null;
        }
        Object obj = objM2837s;
        a3jVarM2828j.mo94698a(objM2836r, view);
        Object objM2840v = m2840v(a3jVarM2828j, objM2836r, obj, objM2830l, fragment, hVar.f2147b);
        if (fragment2 != null && arrayListM2829k != null && (arrayListM2829k.size() > 0 || arrayList.size() > 0)) {
            gf4 gf4Var = new gf4();
            gVar.mo2614b(fragment2, gf4Var);
            a3jVarM2828j.mo94716w(fragment2, objM2840v, gf4Var, new c(gVar, fragment2, gf4Var));
        }
        if (objM2840v != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            a3jVarM2828j.mo94713t(objM2840v, objM2836r, arrayList3, obj, arrayListM2829k, objM2830l, arrayList2);
            m2844z(a3jVarM2828j, viewGroup, fragment, view, arrayList2, objM2836r, arrayList3, obj, arrayListM2829k);
            a3jVarM2828j.m94717x(viewGroup, arrayList2, e01Var);
            a3jVarM2828j.mo94700c(viewGroup, objM2840v);
            a3jVarM2828j.m94712s(viewGroup, arrayList2, e01Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2833o(@NonNull ViewGroup viewGroup, h hVar, View view, e01<String, String> e01Var, g gVar) {
        Fragment fragment = hVar.f2146a;
        Fragment fragment2 = hVar.f2149d;
        a3j a3jVarM2828j = m2828j(fragment2, fragment);
        if (a3jVarM2828j == null) {
            return;
        }
        boolean z = hVar.f2147b;
        boolean z2 = hVar.f2150e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM2836r = m2836r(a3jVarM2828j, fragment, z);
        Object objM2837s = m2837s(a3jVarM2828j, fragment2, z2);
        Object objM2831m = m2831m(a3jVarM2828j, viewGroup, view, e01Var, hVar, arrayList2, arrayList, objM2836r, objM2837s);
        if (objM2836r == null && objM2831m == null && objM2837s == null) {
            return;
        }
        ArrayList<View> arrayListM2829k = m2829k(a3jVarM2828j, objM2837s, fragment2, arrayList2, view);
        ArrayList<View> arrayListM2829k2 = m2829k(a3jVarM2828j, objM2836r, fragment, arrayList, view);
        m2817B(arrayListM2829k2, 4);
        Object objM2840v = m2840v(a3jVarM2828j, objM2836r, objM2837s, objM2831m, fragment, z);
        if (fragment2 != null && arrayListM2829k != null && (arrayListM2829k.size() > 0 || arrayList2.size() > 0)) {
            gf4 gf4Var = new gf4();
            gVar.mo2614b(fragment2, gf4Var);
            a3jVarM2828j.mo94716w(fragment2, objM2840v, gf4Var, new a(gVar, fragment2, gf4Var));
        }
        if (objM2840v != null) {
            m2841w(a3jVarM2828j, objM2837s, fragment2, arrayListM2829k);
            ArrayList<String> arrayListM94708o = a3jVarM2828j.m94708o(arrayList);
            a3jVarM2828j.mo94713t(objM2840v, objM2836r, arrayListM2829k2, objM2837s, arrayListM2829k, objM2831m, arrayList);
            a3jVarM2828j.mo94700c(viewGroup, objM2840v);
            a3jVarM2828j.m94718y(viewGroup, arrayList2, arrayList, arrayListM94708o, e01Var);
            m2817B(arrayListM2829k2, 0);
            a3jVarM2828j.mo94696A(objM2831m, arrayList2, arrayList);
        }
    }

    /* JADX INFO: renamed from: p */
    public static h m2834p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* JADX INFO: renamed from: q */
    public static String m2835q(e01<String, String> e01Var, String str) {
        int size = e01Var.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(e01Var.m130827m(i))) {
                return e01Var.m130823i(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static Object m2836r(a3j a3jVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return a3jVar.mo94703g(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    /* JADX INFO: renamed from: s */
    public static Object m2837s(a3j a3jVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return a3jVar.mo94703g(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* JADX INFO: renamed from: t */
    public static View m2838t(e01<String, View> e01Var, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0417a c0417a = hVar.f2148c;
        if (obj == null || e01Var == null || (arrayList = c0417a.f2097p) == null || arrayList.isEmpty()) {
            return null;
        }
        return e01Var.get(z ? c0417a.f2097p.get(0) : c0417a.f2098q.get(0));
    }

    /* JADX INFO: renamed from: u */
    public static Object m2839u(a3j a3jVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return a3jVar.mo94697B(a3jVar.mo94703g(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    /* JADX INFO: renamed from: v */
    public static Object m2840v(a3j a3jVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean allowReturnTransitionOverlap;
        if (obj == null || obj2 == null || fragment == null) {
            allowReturnTransitionOverlap = true;
        } else {
            allowReturnTransitionOverlap = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        return allowReturnTransitionOverlap ? a3jVar.mo94707n(obj2, obj, obj3) : a3jVar.mo94706m(obj2, obj, obj3);
    }

    /* JADX INFO: renamed from: w */
    public static void m2841w(a3j a3jVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            a3jVar.mo94711r(obj, fragment.getView(), arrayList);
            yh50.m214787a(fragment.mContainer, new b(arrayList));
        }
    }

    /* JADX INFO: renamed from: x */
    public static a3j m2842x() {
        try {
            return (a3j) b3j.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m2843y(@NonNull e01<String, String> e01Var, @NonNull e01<String, View> e01Var2) {
        for (int size = e01Var.size() - 1; size >= 0; size--) {
            if (!e01Var2.containsKey(e01Var.m130827m(size))) {
                e01Var.mo130825k(size);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m2844z(a3j a3jVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        yh50.m214787a(viewGroup, new d(obj, a3jVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
