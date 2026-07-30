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
import p153l.eq50;
import p153l.fg4;
import p153l.j3f0;
import p153l.kkl0;
import p153l.l01;
import p153l.o5j;
import p153l.u5j;
import p153l.v5j;
import p153l.w5j;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public class C0429l {

    /* JADX INFO: renamed from: a */
    public static final int[] f2109a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b */
    public static final v5j f2110b = new u5j();

    /* JADX INFO: renamed from: c */
    public static final v5j f2111c = m2843x();

    /* JADX INFO: renamed from: androidx.fragment.app.l$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g f2112a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Fragment f2113b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fg4 f2114c;

        public a(g gVar, Fragment fragment, fg4 fg4Var) {
            this.f2112a = gVar;
            this.f2113b = fragment;
            this.f2114c = fg4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2112a.mo2614a(this.f2113b, this.f2114c);
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
            C0429l.m2818B(this.f2115a, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g f2116a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Fragment f2117b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ fg4 f2118c;

        public c(g gVar, Fragment fragment, fg4 fg4Var) {
            this.f2116a = gVar;
            this.f2117b = fragment;
            this.f2118c = fg4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2116a.mo2614a(this.f2117b, this.f2118c);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f2119a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ v5j f2120b;

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

        public d(Object obj, v5j v5jVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2119a = obj;
            this.f2120b = v5jVar;
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
                this.f2120b.mo194598p(obj, this.f2121c);
                this.f2124f.addAll(C0429l.m2830k(this.f2120b, this.f2119a, this.f2122d, this.f2123e, this.f2121c));
            }
            if (this.f2125g != null) {
                if (this.f2126h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2121c);
                    this.f2120b.mo194599q(this.f2126h, this.f2125g, arrayList);
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
        public final /* synthetic */ l01 f2130d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ View f2131e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ v5j f2132f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Rect f2133g;

        public e(Fragment fragment, Fragment fragment2, boolean z, l01 l01Var, View view, v5j v5jVar, Rect rect) {
            this.f2127a = fragment;
            this.f2128b = fragment2;
            this.f2129c = z;
            this.f2130d = l01Var;
            this.f2131e = view;
            this.f2132f = v5jVar;
            this.f2133g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0429l.m2825f(this.f2127a, this.f2128b, this.f2129c, this.f2130d, false);
            View view = this.f2131e;
            if (view != null) {
                this.f2132f.m199883k(view, this.f2133g);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v5j f2134a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l01 f2135b;

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

        public f(v5j v5jVar, l01 l01Var, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2134a = v5jVar;
            this.f2135b = l01Var;
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
            l01<String, View> l01VarM2827h = C0429l.m2827h(this.f2134a, this.f2135b, this.f2136c, this.f2137d);
            if (l01VarM2827h != null) {
                this.f2138e.addAll(l01VarM2827h.values());
                this.f2138e.add(this.f2139f);
            }
            C0429l.m2825f(this.f2140g, this.f2141h, this.f2142i, l01VarM2827h, false);
            Object obj = this.f2136c;
            if (obj != null) {
                this.f2134a.mo194589A(obj, this.f2143j, this.f2138e);
                View viewM2839t = C0429l.m2839t(l01VarM2827h, this.f2137d, this.f2144k, this.f2142i);
                if (viewM2839t != null) {
                    this.f2134a.m199883k(viewM2839t, this.f2145l);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        void mo2614a(@NonNull Fragment fragment, @NonNull fg4 fg4Var);

        /* JADX INFO: renamed from: b */
        void mo2615b(@NonNull Fragment fragment, @NonNull fg4 fg4Var);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.l$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        public Fragment f2146a;

        /* JADX INFO: renamed from: b */
        public boolean f2147b;

        /* JADX INFO: renamed from: c */
        public C0418a f2148c;

        /* JADX INFO: renamed from: d */
        public Fragment f2149d;

        /* JADX INFO: renamed from: e */
        public boolean f2150e;

        /* JADX INFO: renamed from: f */
        public C0418a f2151f;
    }

    /* JADX INFO: renamed from: A */
    public static void m2817A(v5j v5jVar, Object obj, Object obj2, l01<String, View> l01Var, boolean z, C0418a c0418a) {
        ArrayList<String> arrayList = c0418a.f2097p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = l01Var.get(z ? c0418a.f2098q.get(0) : c0418a.f2097p.get(0));
        v5jVar.mo194603v(obj, view);
        if (obj2 != null) {
            v5jVar.mo194603v(obj2, view);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m2818B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m2819C(@NonNull Context context, @NonNull o5j o5jVar, ArrayList<C0418a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C0418a c0418a = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m2824e(c0418a, sparseArray, z);
            } else {
                m2822c(c0418a, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                l01<String, String> l01VarM2823d = m2823d(iKeyAt, arrayList, arrayList2, i, i2);
                h hVar = (h) sparseArray.valueAt(i4);
                if (o5jVar.mo2460d() && (viewGroup = (ViewGroup) o5jVar.mo2459c(iKeyAt)) != null) {
                    if (z) {
                        m2834o(viewGroup, hVar, view, l01VarM2823d, gVar);
                    } else {
                        m2833n(viewGroup, hVar, view, l01VarM2823d, gVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2820a(ArrayList<View> arrayList, l01<String, View> l01Var, Collection<String> collection) {
        for (int size = l01Var.size() - 1; size >= 0; size--) {
            View viewM168583m = l01Var.m168583m(size);
            if (collection.contains(kkl0.m150120F(viewM168583m))) {
                arrayList.add(viewM168583m);
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
    public static void m2821b(C0418a c0418a, AbstractC0428k.a aVar, SparseArray<h> sparseArray, boolean z, boolean z2) {
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
        h hVarM2835p = sparseArray.get(i);
        if (z7) {
            hVarM2835p = m2835p(hVarM2835p, sparseArray, i);
            hVarM2835p.f2146a = fragment;
            hVarM2835p.f2147b = z;
            hVarM2835p.f2148c = c0418a;
        }
        if (!z2 && z8) {
            if (hVarM2835p != null && hVarM2835p.f2149d == fragment) {
                hVarM2835p.f2149d = null;
            }
            if (!c0418a.f2099r) {
                FragmentManager fragmentManager = c0418a.f1995t;
                fragmentManager.m2587s0().m2795p(fragmentManager.m2595v(fragment));
                fragmentManager.m2522S0(fragment);
            }
        }
        if (z4 && (hVarM2835p == null || hVarM2835p.f2149d == null)) {
            hVarM2835p = m2835p(hVarM2835p, sparseArray, i);
            hVarM2835p.f2149d = fragment;
            hVarM2835p.f2150e = z;
            hVarM2835p.f2151f = c0418a;
        }
        if (z2 || !z5 || hVarM2835p == null || hVarM2835p.f2146a != fragment) {
            return;
        }
        hVarM2835p.f2146a = null;
    }

    /* JADX INFO: renamed from: c */
    public static void m2822c(C0418a c0418a, SparseArray<h> sparseArray, boolean z) {
        int size = c0418a.f2084c.size();
        for (int i = 0; i < size; i++) {
            m2821b(c0418a, c0418a.f2084c.get(i), sparseArray, false, z);
        }
    }

    /* JADX INFO: renamed from: d */
    public static l01<String, String> m2823d(int i, ArrayList<C0418a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        l01<String, String> l01Var = new l01<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0418a c0418a = arrayList.get(i4);
            if (c0418a.m2702H(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList4 = c0418a.f2097p;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    ArrayList<String> arrayList5 = c0418a.f2097p;
                    if (zBooleanValue) {
                        arrayList3 = c0418a.f2098q;
                    } else {
                        arrayList5 = c0418a.f2098q;
                        arrayList3 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList3.get(i5);
                        String str2 = arrayList5.get(i5);
                        String strRemove = l01Var.remove(str2);
                        if (strRemove != null) {
                            l01Var.put(str, strRemove);
                        } else {
                            l01Var.put(str, str2);
                        }
                    }
                }
            }
        }
        return l01Var;
    }

    /* JADX INFO: renamed from: e */
    public static void m2824e(C0418a c0418a, SparseArray<h> sparseArray, boolean z) {
        if (c0418a.f1995t.m2575o0().mo2460d()) {
            for (int size = c0418a.f2084c.size() - 1; size >= 0; size--) {
                m2821b(c0418a, c0418a.f2084c.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2825f(Fragment fragment, Fragment fragment2, boolean z, l01<String, View> l01Var, boolean z2) {
        j3f0 enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = l01Var == null ? 0 : l01Var.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(l01Var.m168582i(i));
                arrayList.add(l01Var.m168583m(i));
            }
            if (z2) {
                enterTransitionCallback.m143347g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m143346f(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2826g(v5j v5jVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!v5jVar.mo194594e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static l01<String, View> m2827h(v5j v5jVar, l01<String, String> l01Var, Object obj, h hVar) {
        j3f0 enterTransitionCallback;
        ArrayList<String> arrayList;
        String strM2836q;
        Fragment fragment = hVar.f2146a;
        View view = fragment.getView();
        if (l01Var.isEmpty() || obj == null || view == null) {
            l01Var.clear();
            return null;
        }
        l01<String, View> l01Var2 = new l01<>();
        v5jVar.m199882j(l01Var2, view);
        C0418a c0418a = hVar.f2148c;
        if (hVar.f2147b) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0418a.f2097p;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0418a.f2098q;
        }
        if (arrayList != null) {
            l01Var2.m152243o(arrayList);
            l01Var2.m152243o(l01Var.values());
        }
        if (enterTransitionCallback == null) {
            m2844y(l01Var, l01Var2);
            return l01Var2;
        }
        enterTransitionCallback.m143344d(arrayList, l01Var2);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            String str = arrayList.get(size);
            View view2 = l01Var2.get(str);
            if (view2 == null) {
                String strM2836q2 = m2836q(l01Var, str);
                if (strM2836q2 != null) {
                    l01Var.remove(strM2836q2);
                }
            } else if (!str.equals(kkl0.m150120F(view2)) && (strM2836q = m2836q(l01Var, str)) != null) {
                l01Var.put(strM2836q, kkl0.m150120F(view2));
            }
        }
        return l01Var2;
    }

    /* JADX INFO: renamed from: i */
    public static l01<String, View> m2828i(v5j v5jVar, l01<String, String> l01Var, Object obj, h hVar) {
        j3f0 exitTransitionCallback;
        ArrayList<String> arrayList;
        if (l01Var.isEmpty() || obj == null) {
            l01Var.clear();
            return null;
        }
        Fragment fragment = hVar.f2149d;
        l01<String, View> l01Var2 = new l01<>();
        v5jVar.m199882j(l01Var2, fragment.requireView());
        C0418a c0418a = hVar.f2151f;
        if (hVar.f2150e) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0418a.f2098q;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0418a.f2097p;
        }
        if (arrayList != null) {
            l01Var2.m152243o(arrayList);
        }
        if (exitTransitionCallback == null) {
            l01Var.m152243o(l01Var2.keySet());
            return l01Var2;
        }
        exitTransitionCallback.m143344d(arrayList, l01Var2);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            String str = arrayList.get(size);
            View view = l01Var2.get(str);
            if (view == null) {
                l01Var.remove(str);
            } else if (!str.equals(kkl0.m150120F(view))) {
                l01Var.put(kkl0.m150120F(view), l01Var.remove(str));
            }
        }
        return l01Var2;
    }

    /* JADX INFO: renamed from: j */
    public static v5j m2829j(Fragment fragment, Fragment fragment2) {
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
        v5j v5jVar = f2110b;
        if (v5jVar != null && m2826g(v5jVar, arrayList)) {
            return v5jVar;
        }
        v5j v5jVar2 = f2111c;
        if (v5jVar2 != null && m2826g(v5jVar2, arrayList)) {
            return v5jVar2;
        }
        if (v5jVar == null && v5jVar2 == null) {
            return null;
        }
        wg3.m206174a("Invalid Transition types");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList<View> m2830k(v5j v5jVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            v5jVar.m199881f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(view);
            v5jVar.mo194592b(obj, arrayList2);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public static Object m2831l(v5j v5jVar, ViewGroup viewGroup, View view, l01<String, String> l01Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        View view2;
        Object obj3;
        Fragment fragment = hVar.f2146a;
        Fragment fragment2 = hVar.f2149d;
        Rect rect = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f2147b;
        Object objM2840u = l01Var.isEmpty() ? null : m2840u(v5jVar, fragment, fragment2, z);
        l01<String, View> l01VarM2828i = m2828i(v5jVar, l01Var, objM2840u, hVar);
        if (l01Var.isEmpty()) {
            objM2840u = null;
        } else {
            arrayList.addAll(l01VarM2828i.values());
        }
        if (obj == null && obj2 == null && objM2840u == null) {
            return null;
        }
        m2825f(fragment, fragment2, z, l01VarM2828i, true);
        if (objM2840u != null) {
            Rect rect2 = new Rect();
            view2 = view;
            v5jVar.mo194605z(objM2840u, view2, arrayList);
            Object obj4 = objM2840u;
            m2817A(v5jVar, obj4, obj2, l01VarM2828i, hVar.f2150e, hVar.f2151f);
            obj3 = obj4;
            if (obj != null) {
                v5jVar.mo194602u(obj, rect2);
            }
            rect = rect2;
        } else {
            view2 = view;
            obj3 = objM2840u;
        }
        eq50.m121892a(viewGroup, new f(v5jVar, l01Var, obj3, hVar, arrayList2, view2, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* JADX INFO: renamed from: m */
    public static Object m2832m(v5j v5jVar, ViewGroup viewGroup, View view, l01<String, String> l01Var, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
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
        Object objM2840u = l01Var.isEmpty() ? null : m2840u(v5jVar, fragment, fragment2, z);
        l01<String, View> l01VarM2828i = m2828i(v5jVar, l01Var, objM2840u, hVar);
        l01<String, View> l01VarM2827h = m2827h(v5jVar, l01Var, objM2840u, hVar);
        if (l01Var.isEmpty()) {
            if (l01VarM2828i != null) {
                l01VarM2828i.clear();
            }
            if (l01VarM2827h != null) {
                l01VarM2827h.clear();
            }
            objM2840u = null;
        } else {
            m2820a(arrayList, l01VarM2828i, l01Var.keySet());
            m2820a(arrayList2, l01VarM2827h, l01Var.values());
        }
        if (obj == null && obj2 == null && objM2840u == null) {
            return null;
        }
        m2825f(fragment, fragment2, z, l01VarM2828i, true);
        if (objM2840u != null) {
            arrayList2.add(view);
            v5jVar.mo194605z(objM2840u, view, arrayList);
            m2817A(v5jVar, objM2840u, obj2, l01VarM2828i, hVar.f2150e, hVar.f2151f);
            Rect rect2 = new Rect();
            View viewM2839t = m2839t(l01VarM2827h, hVar, obj, z);
            if (viewM2839t != null) {
                v5jVar.mo194602u(obj, rect2);
            }
            rect = rect2;
            view2 = viewM2839t;
        } else {
            rect = null;
        }
        eq50.m121892a(viewGroup, new e(fragment, fragment2, z, l01VarM2827h, view2, v5jVar, rect));
        return objM2840u;
    }

    /* JADX INFO: renamed from: n */
    public static void m2833n(@NonNull ViewGroup viewGroup, h hVar, View view, l01<String, String> l01Var, g gVar) {
        Fragment fragment = hVar.f2146a;
        Fragment fragment2 = hVar.f2149d;
        v5j v5jVarM2829j = m2829j(fragment2, fragment);
        if (v5jVarM2829j == null) {
            return;
        }
        boolean z = hVar.f2147b;
        boolean z2 = hVar.f2150e;
        Object objM2837r = m2837r(v5jVarM2829j, fragment, z);
        Object objM2838s = m2838s(v5jVarM2829j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM2831l = m2831l(v5jVarM2829j, viewGroup, view, l01Var, hVar, arrayList, arrayList2, objM2837r, objM2838s);
        if (objM2837r == null && objM2831l == null && objM2838s == null) {
            return;
        }
        ArrayList<View> arrayListM2830k = m2830k(v5jVarM2829j, objM2838s, fragment2, arrayList, view);
        if (arrayListM2830k == null || arrayListM2830k.isEmpty()) {
            objM2838s = null;
        }
        Object obj = objM2838s;
        v5jVarM2829j.mo194591a(objM2837r, view);
        Object objM2841v = m2841v(v5jVarM2829j, objM2837r, obj, objM2831l, fragment, hVar.f2147b);
        if (fragment2 != null && arrayListM2830k != null && (arrayListM2830k.size() > 0 || arrayList.size() > 0)) {
            fg4 fg4Var = new fg4();
            gVar.mo2615b(fragment2, fg4Var);
            v5jVarM2829j.mo194604w(fragment2, objM2841v, fg4Var, new c(gVar, fragment2, fg4Var));
        }
        if (objM2841v != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            v5jVarM2829j.mo194601t(objM2841v, objM2837r, arrayList3, obj, arrayListM2830k, objM2831l, arrayList2);
            m2845z(v5jVarM2829j, viewGroup, fragment, view, arrayList2, objM2837r, arrayList3, obj, arrayListM2830k);
            v5jVarM2829j.m199886x(viewGroup, arrayList2, l01Var);
            v5jVarM2829j.mo194593c(viewGroup, objM2841v);
            v5jVarM2829j.m199885s(viewGroup, arrayList2, l01Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2834o(@NonNull ViewGroup viewGroup, h hVar, View view, l01<String, String> l01Var, g gVar) {
        Fragment fragment = hVar.f2146a;
        Fragment fragment2 = hVar.f2149d;
        v5j v5jVarM2829j = m2829j(fragment2, fragment);
        if (v5jVarM2829j == null) {
            return;
        }
        boolean z = hVar.f2147b;
        boolean z2 = hVar.f2150e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objM2837r = m2837r(v5jVarM2829j, fragment, z);
        Object objM2838s = m2838s(v5jVarM2829j, fragment2, z2);
        Object objM2832m = m2832m(v5jVarM2829j, viewGroup, view, l01Var, hVar, arrayList2, arrayList, objM2837r, objM2838s);
        if (objM2837r == null && objM2832m == null && objM2838s == null) {
            return;
        }
        ArrayList<View> arrayListM2830k = m2830k(v5jVarM2829j, objM2838s, fragment2, arrayList2, view);
        ArrayList<View> arrayListM2830k2 = m2830k(v5jVarM2829j, objM2837r, fragment, arrayList, view);
        m2818B(arrayListM2830k2, 4);
        Object objM2841v = m2841v(v5jVarM2829j, objM2837r, objM2838s, objM2832m, fragment, z);
        if (fragment2 != null && arrayListM2830k != null && (arrayListM2830k.size() > 0 || arrayList2.size() > 0)) {
            fg4 fg4Var = new fg4();
            gVar.mo2615b(fragment2, fg4Var);
            v5jVarM2829j.mo194604w(fragment2, objM2841v, fg4Var, new a(gVar, fragment2, fg4Var));
        }
        if (objM2841v != null) {
            m2842w(v5jVarM2829j, objM2838s, fragment2, arrayListM2830k);
            ArrayList<String> arrayListM199884o = v5jVarM2829j.m199884o(arrayList);
            v5jVarM2829j.mo194601t(objM2841v, objM2837r, arrayListM2830k2, objM2838s, arrayListM2830k, objM2832m, arrayList);
            v5jVarM2829j.mo194593c(viewGroup, objM2841v);
            v5jVarM2829j.m199887y(viewGroup, arrayList2, arrayList, arrayListM199884o, l01Var);
            m2818B(arrayListM2830k2, 0);
            v5jVarM2829j.mo194589A(objM2832m, arrayList2, arrayList);
        }
    }

    /* JADX INFO: renamed from: p */
    public static h m2835p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* JADX INFO: renamed from: q */
    public static String m2836q(l01<String, String> l01Var, String str) {
        int size = l01Var.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(l01Var.m168583m(i))) {
                return l01Var.m168582i(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static Object m2837r(v5j v5jVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return v5jVar.mo194595g(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    /* JADX INFO: renamed from: s */
    public static Object m2838s(v5j v5jVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return v5jVar.mo194595g(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* JADX INFO: renamed from: t */
    public static View m2839t(l01<String, View> l01Var, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0418a c0418a = hVar.f2148c;
        if (obj == null || l01Var == null || (arrayList = c0418a.f2097p) == null || arrayList.isEmpty()) {
            return null;
        }
        return l01Var.get(z ? c0418a.f2097p.get(0) : c0418a.f2098q.get(0));
    }

    /* JADX INFO: renamed from: u */
    public static Object m2840u(v5j v5jVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return v5jVar.mo194590B(v5jVar.mo194595g(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    /* JADX INFO: renamed from: v */
    public static Object m2841v(v5j v5jVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean allowReturnTransitionOverlap;
        if (obj == null || obj2 == null || fragment == null) {
            allowReturnTransitionOverlap = true;
        } else {
            allowReturnTransitionOverlap = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        return allowReturnTransitionOverlap ? v5jVar.mo194597n(obj2, obj, obj3) : v5jVar.mo194596m(obj2, obj, obj3);
    }

    /* JADX INFO: renamed from: w */
    public static void m2842w(v5j v5jVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            v5jVar.mo194600r(obj, fragment.getView(), arrayList);
            eq50.m121892a(fragment.mContainer, new b(arrayList));
        }
    }

    /* JADX INFO: renamed from: x */
    public static v5j m2843x() {
        try {
            return (v5j) w5j.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m2844y(@NonNull l01<String, String> l01Var, @NonNull l01<String, View> l01Var2) {
        for (int size = l01Var.size() - 1; size >= 0; size--) {
            if (!l01Var2.containsKey(l01Var.m168583m(size))) {
                l01Var.mo147463k(size);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m2845z(v5j v5jVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        eq50.m121892a(viewGroup, new d(obj, v5jVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
