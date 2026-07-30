package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.a60;
import p149l.b60;
import p149l.c60;
import p149l.cd50;
import p149l.dd50;
import p149l.e60;
import p149l.fnf0;
import p149l.g60;
import p149l.gf4;
import p149l.h60;
import p149l.i01;
import p149l.jcr;
import p149l.k250;
import p149l.ocl0;
import p149l.p5c0;
import p149l.pcl0;
import p149l.pxv;
import p149l.qkq0;
import p149l.qnq0;
import p149l.t2j;
import p149l.v2j;
import p149l.x2j;
import p149l.y2j;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: O */
    public static boolean f1880O = false;

    /* JADX INFO: renamed from: P */
    public static boolean f1881P = true;

    /* JADX INFO: renamed from: A */
    public g60<IntentSenderRequest> f1882A;

    /* JADX INFO: renamed from: B */
    public g60<String[]> f1883B;

    /* JADX INFO: renamed from: D */
    public boolean f1885D;

    /* JADX INFO: renamed from: E */
    public boolean f1886E;

    /* JADX INFO: renamed from: F */
    public boolean f1887F;

    /* JADX INFO: renamed from: G */
    public boolean f1888G;

    /* JADX INFO: renamed from: H */
    public boolean f1889H;

    /* JADX INFO: renamed from: I */
    public ArrayList<C0417a> f1890I;

    /* JADX INFO: renamed from: J */
    public ArrayList<Boolean> f1891J;

    /* JADX INFO: renamed from: K */
    public ArrayList<Fragment> f1892K;

    /* JADX INFO: renamed from: L */
    public ArrayList<C0404p> f1893L;

    /* JADX INFO: renamed from: M */
    public FragmentManagerViewModel f1894M;

    /* JADX INFO: renamed from: b */
    public boolean f1897b;

    /* JADX INFO: renamed from: d */
    public ArrayList<C0417a> f1899d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Fragment> f1900e;

    /* JADX INFO: renamed from: g */
    public OnBackPressedDispatcher f1902g;

    /* JADX INFO: renamed from: l */
    public ArrayList<InterfaceC0401m> f1907l;

    /* JADX INFO: renamed from: r */
    public v2j<?> f1913r;

    /* JADX INFO: renamed from: s */
    public t2j f1914s;

    /* JADX INFO: renamed from: t */
    public Fragment f1915t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public Fragment f1916u;

    /* JADX INFO: renamed from: z */
    public g60<Intent> f1921z;

    /* JADX INFO: renamed from: a */
    public final ArrayList<InterfaceC0402n> f1896a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C0426j f1898c = new C0426j();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0422f f1901f = new LayoutInflaterFactory2C0422f(this);

    /* JADX INFO: renamed from: h */
    public final cd50 f1903h = new C0391c(false);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f1904i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map<String, Bundle> f1905j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map<String, Object> f1906k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public Map<Fragment, HashSet<gf4>> f1908m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    public final C0428l.g f1909n = new C0392d();

    /* JADX INFO: renamed from: o */
    public final C0423g f1910o = new C0423g(this);

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList<x2j> f1911p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q */
    public int f1912q = -1;

    /* JADX INFO: renamed from: v */
    public C0421e f1917v = null;

    /* JADX INFO: renamed from: w */
    public C0421e f1918w = new C0393e();

    /* JADX INFO: renamed from: x */
    public fnf0 f1919x = null;

    /* JADX INFO: renamed from: y */
    public fnf0 f1920y = new C0394f();

    /* JADX INFO: renamed from: C */
    public ArrayDeque<LaunchedFragmentInfo> f1884C = new ArrayDeque<>();

    /* JADX INFO: renamed from: N */
    public Runnable f1895N = new RunnableC0395g();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6 */
    class C03876 implements LifecycleEventObserver {
        final /* synthetic */ Lifecycle val$lifecycle;
        final /* synthetic */ y2j val$listener;
        final /* synthetic */ String val$requestKey;

        public C03876(String str, y2j y2jVar, Lifecycle lifecycle) {
            this.val$requestKey = str;
            this.val$lifecycle = lifecycle;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START && ((Bundle) FragmentManager.this.f1905j.get(this.val$requestKey)) != null) {
                throw null;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.val$lifecycle.mo2969d(this);
                FragmentManager.this.f1906k.remove(this.val$requestKey);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$a */
    public class C0389a implements a60<ActivityResult> {
        public C0389a() {
        }

        @Override // p149l.a60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2610a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f1884C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.mWho;
            int i = launchedFragmentInfoPollFirst.mRequestCode;
            Fragment fragmentM2787i = FragmentManager.this.f1898c.m2787i(str);
            if (fragmentM2787i == null) {
                return;
            }
            fragmentM2787i.onActivityResult(i, activityResult.m201b(), activityResult.m200a());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$b */
    public class C0390b implements a60<Map<String, Boolean>> {
        public C0390b() {
        }

        @Override // p149l.a60
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2610a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f1884C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.mWho;
            int i2 = launchedFragmentInfoPollFirst.mRequestCode;
            Fragment fragmentM2787i = FragmentManager.this.f1898c.m2787i(str);
            if (fragmentM2787i == null) {
                return;
            }
            fragmentM2787i.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$c */
    public class C0391c extends cd50 {
        public C0391c(boolean z) {
            super(z);
        }

        @Override // p149l.cd50
        public void handleOnBackPressed() {
            FragmentManager.this.m2490C0();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$d */
    public class C0392d implements C0428l.g {
        public C0392d() {
        }

        @Override // androidx.fragment.app.C0428l.g
        /* JADX INFO: renamed from: a */
        public void mo2613a(@NonNull Fragment fragment, @NonNull gf4 gf4Var) {
            if (gf4Var.m125875c()) {
                return;
            }
            FragmentManager.this.m2549f1(fragment, gf4Var);
        }

        @Override // androidx.fragment.app.C0428l.g
        /* JADX INFO: renamed from: b */
        public void mo2614b(@NonNull Fragment fragment, @NonNull gf4 gf4Var) {
            FragmentManager.this.m2547f(fragment, gf4Var);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$e */
    public class C0393e extends C0421e {
        public C0393e() {
        }

        @Override // androidx.fragment.app.C0421e
        @NonNull
        public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.m2592u0().m186994b(FragmentManager.this.m2592u0().m196786f(), str, null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$f */
    public class C0394f implements fnf0 {
        public C0394f() {
        }

        @Override // p149l.fnf0
        @NonNull
        /* JADX INFO: renamed from: a */
        public SpecialEffectsController mo2615a(@NonNull ViewGroup viewGroup) {
            return new C0418b(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$g */
    public class RunnableC0395g implements Runnable {
        public RunnableC0395g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m2536a0(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$h */
    public class C0396h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f1929a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f1930b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Fragment f1931c;

        public C0396h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1929a = viewGroup;
            this.f1930b = view;
            this.f1931c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1929a.endViewTransition(this.f1930b);
            animator.removeListener(this);
            Fragment fragment = this.f1931c;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$i */
    public class C0397i implements x2j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f1933a;

        public C0397i(Fragment fragment) {
            this.f1933a = fragment;
        }

        @Override // p149l.x2j
        /* JADX INFO: renamed from: a */
        public void mo2470a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            this.f1933a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$j */
    public class C0398j implements a60<ActivityResult> {
        public C0398j() {
        }

        @Override // p149l.a60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2610a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f1884C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.mWho;
            int i = launchedFragmentInfoPollFirst.mRequestCode;
            Fragment fragmentM2787i = FragmentManager.this.f1898c.m2787i(str);
            if (fragmentM2787i == null) {
                return;
            }
            fragmentM2787i.onActivityResult(i, activityResult.m201b(), activityResult.m200a());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$k */
    public static class C0399k extends b60<IntentSenderRequest, ActivityResult> {
        @Override // p149l.b60
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo2617a(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentM220a = intentSenderRequest.m220a();
            if (intentM220a != null && (bundleExtra = intentM220a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentM220a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentM220a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0054b(intentSenderRequest.m223d()).m227b(null).m228c(intentSenderRequest.m222c(), intentSenderRequest.m221b()).m226a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m2480G0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // p149l.b60
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult mo2618c(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$l */
    public static abstract class AbstractC0400l {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public void m2621a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: b */
        public void m2622b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        /* JADX INFO: renamed from: c */
        public void m2623c(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: d */
        public void m2624d(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: e */
        public void m2625e(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: f */
        public void m2626f(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: g */
        public void m2627g(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        /* JADX INFO: renamed from: h */
        public void m2628h(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: i */
        public void m2629i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: j */
        public void m2630j(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        /* JADX INFO: renamed from: k */
        public void m2631k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: l */
        public void m2632l(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: m */
        public void mo2633m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: n */
        public void m2634n(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$m */
    public interface InterfaceC0401m {
        @MainThread
        void onBackStackChanged();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$n */
    public interface InterfaceC0402n {
        /* JADX INFO: renamed from: a */
        boolean mo2635a(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$o */
    public class C0403o implements InterfaceC0402n {

        /* JADX INFO: renamed from: a */
        public final String f1936a;

        /* JADX INFO: renamed from: b */
        public final int f1937b;

        /* JADX INFO: renamed from: c */
        public final int f1938c;

        public C0403o(String str, int i, int i2) {
            this.f1936a = str;
            this.f1937b = i;
            this.f1938c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0402n
        /* JADX INFO: renamed from: a */
        public boolean mo2635a(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f1916u;
            if (fragment == null || this.f1937b >= 0 || this.f1936a != null || !fragment.getChildFragmentManager().m2535Z0()) {
                return FragmentManager.this.m2539b1(arrayList, arrayList2, this.f1936a, this.f1937b, this.f1938c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$p */
    public static class C0404p implements Fragment.InterfaceC0383k {

        /* JADX INFO: renamed from: a */
        public final boolean f1940a;

        /* JADX INFO: renamed from: b */
        public final C0417a f1941b;

        /* JADX INFO: renamed from: c */
        public int f1942c;

        public C0404p(@NonNull C0417a c0417a, boolean z) {
            this.f1940a = z;
            this.f1941b = c0417a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0383k
        /* JADX INFO: renamed from: a */
        public void mo2466a() {
            this.f1942c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0383k
        /* JADX INFO: renamed from: b */
        public void mo2467b() {
            int i = this.f1942c - 1;
            this.f1942c = i;
            if (i != 0) {
                return;
            }
            this.f1941b.f1995t.m2575o1();
        }

        /* JADX INFO: renamed from: c */
        public void m2636c() {
            C0417a c0417a = this.f1941b;
            c0417a.f1995t.m2588t(c0417a, this.f1940a, false, false);
        }

        /* JADX INFO: renamed from: d */
        public void m2637d() {
            boolean z = this.f1942c > 0;
            for (Fragment fragment : this.f1941b.f1995t.m2589t0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0417a c0417a = this.f1941b;
            c0417a.f1995t.m2588t(c0417a, this.f1940a, !z, true);
        }

        /* JADX INFO: renamed from: e */
        public boolean m2638e() {
            return this.f1942c == 0;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A0 */
    public static Fragment m2479A0(@NonNull View view) {
        Object tag = view.getTag(p5c0.f147283a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m2480G0(int i) {
        return f1880O || Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m2484c0(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0417a c0417a = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c0417a.m2718z(-1);
                c0417a.m2698E(i == i2 + (-1));
            } else {
                c0417a.m2718z(1);
                c0417a.m2697D();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static int m2485l1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: renamed from: A */
    public void m2486A(@NonNull Configuration configuration) {
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m2487B(@NonNull MenuItem menuItem) {
        if (this.f1912q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: B0 */
    public ocl0 m2488B0(@NonNull Fragment fragment) {
        return this.f1894M.m2647g(fragment);
    }

    /* JADX INFO: renamed from: C */
    public void m2489C() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2650j(false);
        m2520S(1);
    }

    /* JADX INFO: renamed from: C0 */
    public void m2490C0() {
        m2536a0(true);
        if (this.f1903h.isEnabled()) {
            m2535Z0();
        } else {
            this.f1902g.m198d();
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m2491D(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f1912q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null && m2501I0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1900e != null) {
            for (int i = 0; i < this.f1900e.size(); i++) {
                Fragment fragment2 = this.f1900e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1900e = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: D0 */
    public void m2492D0(@NonNull Fragment fragment) {
        if (m2480G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m2590t1(fragment);
    }

    /* JADX INFO: renamed from: E */
    public void m2493E() {
        this.f1888G = true;
        m2536a0(true);
        m2530X();
        m2520S(-1);
        this.f1913r = null;
        this.f1914s = null;
        this.f1915t = null;
        if (this.f1902g != null) {
            this.f1903h.remove();
            this.f1902g = null;
        }
        g60<Intent> g60Var = this.f1921z;
        if (g60Var != null) {
            g60Var.mo217d();
            this.f1882A.mo217d();
            this.f1883B.mo217d();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m2494E0(@NonNull Fragment fragment) {
        if (fragment.mAdded && m2499H0(fragment)) {
            this.f1885D = true;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m2495F() {
        m2520S(1);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m2496F0() {
        return this.f1888G;
    }

    /* JADX INFO: renamed from: G */
    public void m2497G() {
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m2498H(boolean z) {
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m2499H0(@NonNull Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m2573o();
    }

    /* JADX INFO: renamed from: I */
    public void m2500I(@NonNull Fragment fragment) {
        Iterator<x2j> it = this.f1911p.iterator();
        while (it.hasNext()) {
            it.next().mo2470a(this, fragment);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m2501I0(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: renamed from: J */
    public boolean m2502J(@NonNull MenuItem menuItem) {
        if (this.f1912q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m2503J0(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.m2604y0()) && m2503J0(fragmentManager.f1915t);
    }

    /* JADX INFO: renamed from: K */
    public void m2504K(@NonNull Menu menu) {
        if (this.f1912q < 1) {
            return;
        }
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m2505K0(int i) {
        return this.f1912q >= i;
    }

    /* JADX INFO: renamed from: L */
    public final void m2506L(@Nullable Fragment fragment) {
        if (fragment == null || !fragment.equals(m2551g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m2507L0() {
        return this.f1886E || this.f1887F;
    }

    /* JADX INFO: renamed from: M */
    public void m2508M() {
        m2520S(5);
    }

    /* JADX INFO: renamed from: M0 */
    public void m2509M0(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
        if (this.f1883B == null) {
            this.f1913r.m196788k(fragment, strArr, i);
            return;
        }
        this.f1884C.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        this.f1883B.m124547b(strArr);
    }

    /* JADX INFO: renamed from: N */
    public void m2510N(boolean z) {
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m2511N0(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (this.f1921z == null) {
            this.f1913r.m196789n(fragment, intent, i, bundle);
            return;
        }
        this.f1884C.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f1921z.m124547b(intent);
    }

    /* JADX INFO: renamed from: O */
    public boolean m2512O(@NonNull Menu menu) {
        boolean z = false;
        if (this.f1912q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null && m2501I0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: O0 */
    public void m2513O0(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f1882A == null) {
            this.f1913r.m196790o(fragment, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (m2480G0(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestM226a = new IntentSenderRequest.C0054b(intentSender).m227b(intent).m228c(i3, i2).m226a();
        this.f1884C.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (m2480G0(2)) {
            fragment.toString();
        }
        this.f1882A.m124547b(intentSenderRequestM226a);
    }

    /* JADX INFO: renamed from: P */
    public void m2514P() {
        m2605y1();
        m2506L(this.f1916u);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2515P0(@NonNull i01<Fragment> i01Var) {
        int size = i01Var.size();
        for (int i = 0; i < size; i++) {
            Fragment fragmentM133741l = i01Var.m133741l(i);
            if (!fragmentM133741l.mAdded) {
                View viewRequireView = fragmentM133741l.requireView();
                fragmentM133741l.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m2516Q() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2650j(false);
        m2520S(7);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m2517Q0(@NonNull Fragment fragment) {
        if (!this.f1898c.m2781c(fragment.mWho)) {
            if (m2480G0(3)) {
                fragment.toString();
                toString();
                return;
            }
            return;
        }
        m2521S0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f = fragment.mPostponedAlpha;
            if (f > 0.0f) {
                view.setAlpha(f);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            C0420d.d dVarM2738b = C0420d.m2738b(this.f1913r.m196786f(), fragment, true);
            if (dVarM2738b != null) {
                Animation animation = dVarM2738b.f2050a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    dVarM2738b.f2051b.setTarget(fragment.mView);
                    dVarM2738b.f2051b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m2591u(fragment);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m2518R() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2650j(false);
        m2520S(5);
    }

    /* JADX INFO: renamed from: R0 */
    public void m2519R0(int i, boolean z) {
        v2j<?> v2jVar;
        if (this.f1913r == null && i != -1) {
            qkq0.m175383a("No activity");
            return;
        }
        if (z || i != this.f1912q) {
            this.f1912q = i;
            boolean z2 = f1881P;
            C0426j c0426j = this.f1898c;
            if (z2) {
                c0426j.m2796r();
            } else {
                Iterator<Fragment> it = c0426j.m2792n().iterator();
                while (it.hasNext()) {
                    m2517Q0(it.next());
                }
                for (C0424h c0424h : this.f1898c.m2789k()) {
                    Fragment fragmentM2766k = c0424h.m2766k();
                    if (!fragmentM2766k.mIsNewlyAdded) {
                        m2517Q0(fragmentM2766k);
                    }
                    if (fragmentM2766k.mRemoving && !fragmentM2766k.isInBackStack()) {
                        this.f1898c.m2795q(c0424h);
                    }
                }
            }
            m2596v1();
            if (this.f1885D && (v2jVar = this.f1913r) != null && this.f1912q == 7) {
                v2jVar.mo2476p();
                this.f1885D = false;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2520S(int i) {
        try {
            this.f1897b = true;
            this.f1898c.m2782d(i);
            m2519R0(i, false);
            if (f1881P) {
                Iterator<SpecialEffectsController> it = m2582r().iterator();
                while (it.hasNext()) {
                    it.next().m2674j();
                }
            }
            this.f1897b = false;
            m2536a0(true);
        } catch (Throwable th) {
            this.f1897b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m2521S0(@NonNull Fragment fragment) {
        m2523T0(fragment, this.f1912q);
    }

    /* JADX INFO: renamed from: T */
    public void m2522T() {
        this.f1887F = true;
        this.f1894M.m2650j(true);
        m2520S(4);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /* JADX INFO: renamed from: T0 */
    public void m2523T0(@NonNull Fragment fragment, int i) {
        ViewGroup viewGroup;
        C0424h c0424hM2791m = this.f1898c.m2791m(fragment.mWho);
        int i2 = 1;
        if (c0424hM2791m == null) {
            c0424hM2791m = new C0424h(this.f1910o, this.f1898c, fragment);
            c0424hM2791m.m2776u(1);
        }
        if (fragment.mFromLayout && fragment.mInLayout && fragment.mState == 2) {
            i = Math.max(i, 2);
        }
        int iMin = Math.min(i, c0424hM2791m.m2759d());
        int i3 = fragment.mState;
        if (i3 <= iMin) {
            if (i3 < iMin && !this.f1908m.isEmpty()) {
                m2570n(fragment);
            }
            int i4 = fragment.mState;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                c0424hM2791m.m2771p();
                            }
                        }
                        if (iMin > 4) {
                            c0424hM2791m.m2777v();
                        }
                        if (iMin > 5) {
                            c0424hM2791m.m2771p();
                        }
                    }
                    if (iMin > 2) {
                        c0424hM2791m.m2756a();
                    }
                    if (iMin > 4) {
                        c0424hM2791m.m2777v();
                    }
                    if (iMin > 5) {
                        c0424hM2791m.m2771p();
                    }
                }
                if (iMin > -1) {
                    c0424hM2791m.m2765j();
                }
                if (iMin > 1) {
                    c0424hM2791m.m2761f();
                }
                if (iMin > 2) {
                    c0424hM2791m.m2756a();
                }
                if (iMin > 4) {
                    c0424hM2791m.m2777v();
                }
                if (iMin > 5) {
                    c0424hM2791m.m2771p();
                }
            } else if (iMin > -1) {
                c0424hM2791m.m2758c();
            }
            if (iMin > 0) {
                c0424hM2791m.m2760e();
            }
            if (iMin > -1) {
                c0424hM2791m.m2765j();
            }
            if (iMin > 1) {
                c0424hM2791m.m2761f();
            }
            if (iMin > 2) {
                c0424hM2791m.m2756a();
            }
            if (iMin > 4) {
                c0424hM2791m.m2777v();
            }
            if (iMin > 5) {
                c0424hM2791m.m2771p();
            }
        } else if (i3 > iMin) {
            if (i3 == 0) {
                i2 = iMin;
                if (i2 < 0) {
                    c0424hM2791m.m2764i();
                }
                iMin = i2;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    if (iMin < 7) {
                                        c0424hM2791m.m2769n();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                c0424hM2791m.m2778w();
                            }
                        }
                        if (iMin < 4) {
                            if (m2480G0(3)) {
                                fragment.toString();
                            }
                            if (fragment.mView != null && this.f1913r.mo2474l(fragment) && fragment.mSavedViewState == null) {
                                c0424hM2791m.m2775t();
                            }
                        }
                    }
                    if (iMin < 2) {
                        View view = fragment.mView;
                        if (view != null && (viewGroup = fragment.mContainer) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.mView.clearAnimation();
                            if (!fragment.isRemovingParent()) {
                                C0420d.d dVarM2738b = (this.f1912q <= -1 || this.f1888G || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) ? null : C0420d.m2738b(this.f1913r.m196786f(), fragment, false);
                                fragment.mPostponedAlpha = 0.0f;
                                ViewGroup viewGroup2 = fragment.mContainer;
                                View view2 = fragment.mView;
                                if (dVarM2738b != null) {
                                    C0420d.m2737a(fragment, dVarM2738b, this.f1909n);
                                }
                                viewGroup2.removeView(view2);
                                if (m2480G0(2)) {
                                    Objects.toString(view2);
                                    fragment.toString();
                                    viewGroup2.toString();
                                }
                                if (viewGroup2 != fragment.mContainer) {
                                    return;
                                }
                            }
                        }
                        if (this.f1908m.get(fragment) == null) {
                            c0424hM2791m.m2763h();
                        }
                    }
                }
                if (iMin >= 1) {
                    i2 = iMin;
                } else if (this.f1908m.get(fragment) == null) {
                    c0424hM2791m.m2762g();
                    i2 = iMin;
                }
                if (i2 < 0) {
                    c0424hM2791m.m2764i();
                }
                iMin = i2;
            }
        }
        if (fragment.mState != iMin) {
            if (m2480G0(3)) {
                fragment.toString();
            }
            fragment.mState = iMin;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m2524U() {
        m2520S(2);
    }

    /* JADX INFO: renamed from: U0 */
    public void m2525U0() {
        if (this.f1913r == null) {
            return;
        }
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2650j(false);
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m2526V() {
        if (this.f1889H) {
            this.f1889H = false;
            m2596v1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m2527V0(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (C0424h c0424h : this.f1898c.m2789k()) {
            Fragment fragmentM2766k = c0424h.m2766k();
            if (fragmentM2766k.mContainerId == fragmentContainerView.getId() && (view = fragmentM2766k.mView) != null && view.getParent() == null) {
                fragmentM2766k.mContainer = fragmentContainerView;
                c0424h.m2757b();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m2528W(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1898c.m2783e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f1900e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment = this.f1900e.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0417a> arrayList2 = this.f1899d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0417a c0417a = this.f1899d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c0417a.toString());
                c0417a.m2695B(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1904i.get());
        synchronized (this.f1896a) {
            try {
                int size3 = this.f1896a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i3 = 0; i3 < size3; i3++) {
                        InterfaceC0402n interfaceC0402n = this.f1896a.get(i3);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i3);
                        printWriter.print(": ");
                        printWriter.println(interfaceC0402n);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1913r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1914s);
        if (this.f1915t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1915t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1912q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1886E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1887F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1888G);
        if (this.f1885D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1885D);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m2529W0(@NonNull C0424h c0424h) {
        Fragment fragmentM2766k = c0424h.m2766k();
        if (fragmentM2766k.mDeferStart) {
            if (this.f1897b) {
                this.f1889H = true;
                return;
            }
            fragmentM2766k.mDeferStart = false;
            if (f1881P) {
                c0424h.m2768m();
            } else {
                m2521S0(fragmentM2766k);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m2530X() {
        if (f1881P) {
            Iterator<SpecialEffectsController> it = m2582r().iterator();
            while (it.hasNext()) {
                it.next().m2674j();
            }
        } else {
            if (this.f1908m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f1908m.keySet()) {
                m2570n(fragment);
                m2521S0(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m2531X0() {
        m2532Y(new C0403o(null, -1, 0), false);
    }

    /* JADX INFO: renamed from: Y */
    public void m2532Y(@NonNull InterfaceC0402n interfaceC0402n, boolean z) {
        if (!z) {
            if (this.f1913r == null) {
                if (this.f1888G) {
                    qkq0.m175383a("FragmentManager has been destroyed");
                    return;
                } else {
                    qkq0.m175383a("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            m2576p();
        }
        synchronized (this.f1896a) {
            try {
                if (this.f1913r == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1896a.add(interfaceC0402n);
                    m2575o1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m2533Y0(int i, int i2) {
        if (i >= 0) {
            m2532Y(new C0403o(null, i, i2), false);
        } else {
            k250.m144273a("Bad id: ", i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m2534Z(boolean z) {
        if (this.f1897b) {
            qkq0.m175383a("FragmentManager is already executing transactions");
            return;
        }
        if (this.f1913r == null) {
            if (this.f1888G) {
                qkq0.m175383a("FragmentManager has been destroyed");
                return;
            } else {
                qkq0.m175383a("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f1913r.m196787g().getLooper()) {
            qkq0.m175383a("Must be called from main thread of fragment host");
            return;
        }
        if (!z) {
            m2576p();
        }
        if (this.f1890I == null) {
            this.f1890I = new ArrayList<>();
            this.f1891J = new ArrayList<>();
        }
        this.f1897b = true;
        try {
            m2548f0(null, null);
        } finally {
            this.f1897b = false;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m2535Z0() {
        return m2537a1(null, -1, 0);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m2536a0(boolean z) {
        m2534Z(z);
        boolean z2 = false;
        while (m2566l0(this.f1890I, this.f1891J)) {
            z2 = true;
            this.f1897b = true;
            try {
                m2555h1(this.f1890I, this.f1891J);
                m2579q();
            } catch (Throwable th) {
                m2579q();
                throw th;
            }
        }
        m2605y1();
        m2526V();
        this.f1898c.m2780b();
        return z2;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m2537a1(@Nullable String str, int i, int i2) {
        m2536a0(false);
        m2534Z(true);
        Fragment fragment = this.f1916u;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().m2535Z0()) {
            return true;
        }
        boolean zM2539b1 = m2539b1(this.f1890I, this.f1891J, str, i, i2);
        if (zM2539b1) {
            this.f1897b = true;
            try {
                m2555h1(this.f1890I, this.f1891J);
                m2579q();
            } catch (Throwable th) {
                m2579q();
                throw th;
            }
        }
        m2605y1();
        m2526V();
        this.f1898c.m2780b();
        return zM2539b1;
    }

    /* JADX INFO: renamed from: b0 */
    public void m2538b0(@NonNull InterfaceC0402n interfaceC0402n, boolean z) {
        if (z && (this.f1913r == null || this.f1888G)) {
            return;
        }
        m2534Z(z);
        if (interfaceC0402n.mo2635a(this.f1890I, this.f1891J)) {
            this.f1897b = true;
            try {
                m2555h1(this.f1890I, this.f1891J);
                m2579q();
            } catch (Throwable th) {
                m2579q();
                throw th;
            }
        }
        m2605y1();
        m2526V();
        this.f1898c.m2780b();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m2539b1(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i, int i2) {
        int i3;
        ArrayList<C0417a> arrayList3 = this.f1899d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1899d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0417a c0417a = this.f1899d.get(size2);
                    if ((str != null && str.equals(c0417a.m2700G())) || (i >= 0 && i == c0417a.f1997v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0417a c0417a2 = this.f1899d.get(size2);
                        if (str == null || !str.equals(c0417a2.m2700G())) {
                            if (i < 0 || i != c0417a2.f1997v) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f1899d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1899d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f1899d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c1 */
    public final int m2540c1(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2, @NonNull i01<Fragment> i01Var) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0417a c0417a = arrayList.get(i4);
            boolean zBooleanValue = arrayList2.get(i4).booleanValue();
            if (c0417a.m2703K() && !c0417a.m2702I(arrayList, i4 + 1, i2)) {
                if (this.f1893L == null) {
                    this.f1893L = new ArrayList<>();
                }
                C0404p c0404p = new C0404p(c0417a, zBooleanValue);
                this.f1893L.add(c0404p);
                c0417a.m2705M(c0404p);
                if (zBooleanValue) {
                    c0417a.m2697D();
                } else {
                    c0417a.m2698E(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c0417a);
                }
                m2541d(i01Var);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public final void m2541d(@NonNull i01<Fragment> i01Var) {
        int i = this.f1912q;
        if (i < 1) {
            return;
        }
        int iMin = Math.min(i, 5);
        for (Fragment fragment : this.f1898c.m2792n()) {
            if (fragment.mState < iMin) {
                m2523T0(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    i01Var.add(fragment);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2542d0(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        boolean z = arrayList.get(i).f2099r;
        ArrayList<Fragment> arrayList3 = this.f1892K;
        if (arrayList3 == null) {
            this.f1892K = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f1892K.addAll(this.f1898c.m2792n());
        Fragment fragmentM2604y0 = m2604y0();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0417a c0417a = arrayList.get(i6);
            boolean zBooleanValue = arrayList2.get(i6).booleanValue();
            ArrayList<Fragment> arrayList4 = this.f1892K;
            fragmentM2604y0 = !zBooleanValue ? c0417a.m2699F(arrayList4, fragmentM2604y0) : c0417a.m2706N(arrayList4, fragmentM2604y0);
            z2 = z2 || c0417a.f2090i;
        }
        this.f1892K.clear();
        if (!z && this.f1912q >= 1) {
            if (f1881P) {
                for (int i7 = i4; i7 < i5; i7++) {
                    Iterator<AbstractC0427k.a> it = arrayList.get(i7).f2084c.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = it.next().f2102b;
                        if (fragment != null && fragment.mFragmentManager != null) {
                            this.f1898c.m2794p(m2594v(fragment));
                        }
                    }
                }
            } else {
                C0428l.m2818C(this.f1913r.m196786f(), this.f1914s, arrayList, arrayList2, i4, i5, false, this.f1909n);
            }
        }
        m2484c0(arrayList, arrayList2, i, i2);
        if (f1881P) {
            boolean zBooleanValue2 = arrayList2.get(i5 - 1).booleanValue();
            for (int i8 = i4; i8 < i5; i8++) {
                C0417a c0417a2 = arrayList.get(i8);
                if (zBooleanValue2) {
                    for (int size = c0417a2.f2084c.size() - 1; size >= 0; size--) {
                        Fragment fragment2 = c0417a2.f2084c.get(size).f2102b;
                        if (fragment2 != null) {
                            m2594v(fragment2).m2768m();
                        }
                    }
                } else {
                    Iterator<AbstractC0427k.a> it2 = c0417a2.f2084c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f2102b;
                        if (fragment3 != null) {
                            m2594v(fragment3).m2768m();
                        }
                    }
                }
            }
            m2519R0(this.f1912q, true);
            for (SpecialEffectsController specialEffectsController : m2585s(arrayList, i, i5)) {
                specialEffectsController.m2680r(zBooleanValue2);
                specialEffectsController.m2678p();
                specialEffectsController.m2671g();
            }
            i3 = i5;
        } else {
            if (z) {
                i01<Fragment> i01Var = new i01<>();
                m2541d(i01Var);
                int iM2540c1 = m2540c1(arrayList, arrayList2, i4, i2, i01Var);
                i3 = i2;
                m2515P0(i01Var);
                i5 = iM2540c1;
            } else {
                i3 = i5;
            }
            if (i5 != i4 && z) {
                if (this.f1912q >= 1) {
                    C0428l.m2818C(this.f1913r.m196786f(), this.f1914s, arrayList, arrayList2, i4, i5, true, this.f1909n);
                }
                m2519R0(this.f1912q, true);
            }
        }
        i4 = i4;
        for (int i9 = i; i9 < i3; i9++) {
            C0417a c0417a3 = arrayList.get(i9);
            if (arrayList2.get(i9).booleanValue() && c0417a3.f1997v >= 0) {
                c0417a3.f1997v = -1;
            }
            c0417a3.m2704L();
        }
        if (z2) {
            m2561j1();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m2543d1(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m2599w1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* JADX INFO: renamed from: e */
    public void m2544e(C0417a c0417a) {
        if (this.f1899d == null) {
            this.f1899d = new ArrayList<>();
        }
        this.f1899d.add(c0417a);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m2545e0() {
        boolean zM2536a0 = m2536a0(true);
        m2563k0();
        return zM2536a0;
    }

    /* JADX INFO: renamed from: e1 */
    public void m2546e1(@NonNull AbstractC0400l abstractC0400l, boolean z) {
        this.f1910o.m2754o(abstractC0400l, z);
    }

    /* JADX INFO: renamed from: f */
    public void m2547f(@NonNull Fragment fragment, @NonNull gf4 gf4Var) {
        if (this.f1908m.get(fragment) == null) {
            this.f1908m.put(fragment, new HashSet<>());
        }
        this.f1908m.get(fragment).add(gf4Var);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m2548f0(@Nullable ArrayList<C0417a> arrayList, @Nullable ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C0404p> arrayList3 = this.f1893L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0404p c0404p = this.f1893L.get(i);
            if (arrayList != null && !c0404p.f1940a && (iIndexOf2 = arrayList.indexOf(c0404p.f1941b)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.f1893L.remove(i);
                i--;
                size--;
                c0404p.m2636c();
            } else if (c0404p.m2638e() || (arrayList != null && c0404p.f1941b.m2702I(arrayList, 0, arrayList.size()))) {
                this.f1893L.remove(i);
                i--;
                size--;
                if (arrayList == null || c0404p.f1940a || (iIndexOf = arrayList.indexOf(c0404p.f1941b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    c0404p.m2637d();
                } else {
                    c0404p.m2636c();
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m2549f1(@NonNull Fragment fragment, @NonNull gf4 gf4Var) {
        HashSet<gf4> hashSet = this.f1908m.get(fragment);
        if (hashSet != null && hashSet.remove(gf4Var) && hashSet.isEmpty()) {
            this.f1908m.remove(fragment);
            if (fragment.mState < 5) {
                m2597w(fragment);
                m2521S0(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public C0424h m2550g(@NonNull Fragment fragment) {
        if (m2480G0(2)) {
            Objects.toString(fragment);
        }
        C0424h c0424hM2594v = m2594v(fragment);
        fragment.mFragmentManager = this;
        this.f1898c.m2794p(c0424hM2594v);
        if (!fragment.mDetached) {
            this.f1898c.m2779a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m2499H0(fragment)) {
                this.f1885D = true;
            }
        }
        return c0424hM2594v;
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public Fragment m2551g0(@NonNull String str) {
        return this.f1898c.m2784f(str);
    }

    /* JADX INFO: renamed from: g1 */
    public void m2552g1(@NonNull Fragment fragment) {
        if (m2480G0(2)) {
            Objects.toString(fragment);
            int i = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f1898c.m2797s(fragment);
        if (m2499H0(fragment)) {
            this.f1885D = true;
        }
        fragment.mRemoving = true;
        m2590t1(fragment);
    }

    /* JADX INFO: renamed from: h */
    public void m2553h(@NonNull x2j x2jVar) {
        this.f1911p.add(x2jVar);
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public Fragment m2554h0(@IdRes int i) {
        return this.f1898c.m2785g(i);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m2555h1(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            qkq0.m175383a("Internal error with the back stack records");
            return;
        }
        m2548f0(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f2099r) {
                if (i2 != i) {
                    m2542d0(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2099r) {
                        i2++;
                    }
                }
                m2542d0(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m2542d0(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2556i(@NonNull Fragment fragment) {
        this.f1894M.m2642a(fragment);
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public Fragment m2557i0(@Nullable String str) {
        return this.f1898c.m2786h(str);
    }

    /* JADX INFO: renamed from: i1 */
    public void m2558i1(@NonNull Fragment fragment) {
        this.f1894M.m2649i(fragment);
    }

    /* JADX INFO: renamed from: j */
    public int m2559j() {
        return this.f1904i.getAndIncrement();
    }

    /* JADX INFO: renamed from: j0 */
    public Fragment m2560j0(@NonNull String str) {
        return this.f1898c.m2787i(str);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m2561j1() {
        if (this.f1907l != null) {
            for (int i = 0; i < this.f1907l.size(); i++) {
                this.f1907l.get(i).onBackStackChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: k */
    public void m2562k(@NonNull v2j<?> v2jVar, @NonNull t2j t2jVar, @Nullable Fragment fragment) {
        String str;
        jcr jcrVar;
        if (this.f1913r != null) {
            qkq0.m175383a("Already attached");
            return;
        }
        this.f1913r = v2jVar;
        this.f1914s = t2jVar;
        this.f1915t = fragment;
        if (fragment != null) {
            m2553h(new C0397i(fragment));
        } else if (v2jVar instanceof x2j) {
            m2553h((x2j) v2jVar);
        }
        if (this.f1915t != null) {
            m2605y1();
        }
        if (v2jVar instanceof dd50) {
            dd50 dd50Var = (dd50) v2jVar;
            OnBackPressedDispatcher onBackPressedDispatcher = dd50Var.getOnBackPressedDispatcher();
            this.f1902g = onBackPressedDispatcher;
            if (fragment != null) {
                jcrVar = dd50Var;
                jcrVar = fragment;
            }
            jcrVar = dd50Var;
            onBackPressedDispatcher.m195a(jcrVar, this.f1903h);
        }
        if (fragment != null) {
            this.f1894M = fragment.mFragmentManager.m2571n0(fragment);
        } else if (v2jVar instanceof pcl0) {
            this.f1894M = FragmentManagerViewModel.m2641e(((pcl0) v2jVar).getViewModelStore());
        } else {
            this.f1894M = new FragmentManagerViewModel(false);
        }
        this.f1894M.m2650j(m2507L0());
        this.f1898c.m2802x(this.f1894M);
        Object obj = this.f1913r;
        if (obj instanceof h60) {
            ActivityResultRegistry activityResultRegistry = ((h60) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String strConcat = "FragmentManager:".concat(str);
            this.f1921z = activityResultRegistry.m211i(strConcat.concat("StartActivityForResult"), new e60(), new C0398j());
            this.f1882A = activityResultRegistry.m211i(strConcat.concat("StartIntentSenderForResult"), new C0399k(), new C0389a());
            this.f1883B = activityResultRegistry.m211i(strConcat.concat("RequestPermissions"), new c60(), new C0390b());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m2563k0() {
        if (f1881P) {
            Iterator<SpecialEffectsController> it = m2582r().iterator();
            while (it.hasNext()) {
                it.next().m2675k();
            }
        } else if (this.f1893L != null) {
            while (!this.f1893L.isEmpty()) {
                this.f1893L.remove(0).m2637d();
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m2564k1(@Nullable Parcelable parcelable) {
        C0424h c0424h;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.mActive == null) {
            return;
        }
        this.f1898c.m2798t();
        for (FragmentState fragmentState : fragmentManagerState.mActive) {
            if (fragmentState != null) {
                Fragment fragmentM2644c = this.f1894M.m2644c(fragmentState.mWho);
                if (fragmentM2644c != null) {
                    if (m2480G0(2)) {
                        fragmentM2644c.toString();
                    }
                    c0424h = new C0424h(this.f1910o, this.f1898c, fragmentM2644c, fragmentState);
                } else {
                    c0424h = new C0424h(this.f1910o, this.f1898c, this.f1913r.m196786f().getClassLoader(), m2583r0(), fragmentState);
                }
                Fragment fragmentM2766k = c0424h.m2766k();
                fragmentM2766k.mFragmentManager = this;
                if (m2480G0(2)) {
                    fragmentM2766k.toString();
                }
                c0424h.m2770o(this.f1913r.m196786f().getClassLoader());
                this.f1898c.m2794p(c0424h);
                c0424h.m2776u(this.f1912q);
            }
        }
        for (Fragment fragment : this.f1894M.m2646f()) {
            if (!this.f1898c.m2781c(fragment.mWho)) {
                if (m2480G0(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.mActive);
                }
                this.f1894M.m2649i(fragment);
                fragment.mFragmentManager = this;
                C0424h c0424h2 = new C0424h(this.f1910o, this.f1898c, fragment);
                c0424h2.m2776u(1);
                c0424h2.m2768m();
                fragment.mRemoving = true;
                c0424h2.m2768m();
            }
        }
        this.f1898c.m2799u(fragmentManagerState.mAdded);
        if (fragmentManagerState.mBackStack != null) {
            this.f1899d = new ArrayList<>(fragmentManagerState.mBackStack.length);
            int i = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.mBackStack;
                if (i >= backStackStateArr.length) {
                    break;
                }
                C0417a c0417aM2454a = backStackStateArr[i].m2454a(this);
                if (m2480G0(2)) {
                    int i2 = c0417aM2454a.f1997v;
                    c0417aM2454a.toString();
                    PrintWriter printWriter = new PrintWriter(new pxv("FragmentManager"));
                    c0417aM2454a.m2696C("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1899d.add(c0417aM2454a);
                i++;
            }
        } else {
            this.f1899d = null;
        }
        this.f1904i.set(fragmentManagerState.mBackStackIndex);
        String str = fragmentManagerState.mPrimaryNavActiveWho;
        if (str != null) {
            Fragment fragmentM2551g0 = m2551g0(str);
            this.f1916u = fragmentM2551g0;
            m2506L(fragmentM2551g0);
        }
        ArrayList<String> arrayList = fragmentManagerState.mResultKeys;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.f1905j.put(arrayList.get(i3), fragmentManagerState.mResults.get(i3));
            }
        }
        this.f1884C = new ArrayDeque<>(fragmentManagerState.mLaunchedFragments);
    }

    /* JADX INFO: renamed from: l */
    public void m2565l(@NonNull Fragment fragment) {
        if (m2480G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f1898c.m2779a(fragment);
            if (m2480G0(2)) {
                fragment.toString();
            }
            if (m2499H0(fragment)) {
                this.f1885D = true;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m2566l0(@NonNull ArrayList<C0417a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f1896a) {
            try {
                int i = 0;
                if (this.f1896a.isEmpty()) {
                    return false;
                }
                int size = this.f1896a.size();
                boolean zMo2635a = false;
                while (true) {
                    ArrayList<InterfaceC0402n> arrayList3 = this.f1896a;
                    if (i >= size) {
                        arrayList3.clear();
                        this.f1913r.m196787g().removeCallbacks(this.f1895N);
                        return zMo2635a;
                    }
                    zMo2635a |= arrayList3.get(i).mo2635a(arrayList, arrayList2);
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public AbstractC0427k m2567m() {
        return new C0417a(this);
    }

    /* JADX INFO: renamed from: m0 */
    public int m2568m0() {
        ArrayList<C0417a> arrayList = this.f1899d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public Parcelable m2569m1() {
        int size;
        m2563k0();
        m2530X();
        m2536a0(true);
        this.f1886E = true;
        this.f1894M.m2650j(true);
        ArrayList<FragmentState> arrayListM2800v = this.f1898c.m2800v();
        BackStackState[] backStackStateArr = null;
        if (arrayListM2800v.isEmpty()) {
            m2480G0(2);
            return null;
        }
        ArrayList<String> arrayListM2801w = this.f1898c.m2801w();
        ArrayList<C0417a> arrayList = this.f1899d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.f1899d.get(i));
                if (m2480G0(2)) {
                    Objects.toString(this.f1899d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.mActive = arrayListM2800v;
        fragmentManagerState.mAdded = arrayListM2801w;
        fragmentManagerState.mBackStack = backStackStateArr;
        fragmentManagerState.mBackStackIndex = this.f1904i.get();
        Fragment fragment = this.f1916u;
        if (fragment != null) {
            fragmentManagerState.mPrimaryNavActiveWho = fragment.mWho;
        }
        fragmentManagerState.mResultKeys.addAll(this.f1905j.keySet());
        fragmentManagerState.mResults.addAll(this.f1905j.values());
        fragmentManagerState.mLaunchedFragments = new ArrayList<>(this.f1884C);
        return fragmentManagerState;
    }

    /* JADX INFO: renamed from: n */
    public final void m2570n(@NonNull Fragment fragment) {
        HashSet<gf4> hashSet = this.f1908m.get(fragment);
        if (hashSet != null) {
            Iterator<gf4> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m125873a();
            }
            hashSet.clear();
            m2597w(fragment);
            this.f1908m.remove(fragment);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: n0 */
    public final FragmentManagerViewModel m2571n0(@NonNull Fragment fragment) {
        return this.f1894M.m2645d(fragment);
    }

    @Nullable
    /* JADX INFO: renamed from: n1 */
    public Fragment.SavedState m2572n1(@NonNull Fragment fragment) {
        C0424h c0424hM2791m = this.f1898c.m2791m(fragment.mWho);
        if (c0424hM2791m == null || !c0424hM2791m.m2766k().equals(fragment)) {
            m2599w1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return c0424hM2791m.m2773r();
    }

    /* JADX INFO: renamed from: o */
    public boolean m2573o() {
        boolean zM2499H0 = false;
        for (Fragment fragment : this.f1898c.m2790l()) {
            if (fragment != null) {
                zM2499H0 = m2499H0(fragment);
            }
            if (zM2499H0) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: o0 */
    public t2j m2574o0() {
        return this.f1914s;
    }

    /* JADX INFO: renamed from: o1 */
    public void m2575o1() {
        synchronized (this.f1896a) {
            try {
                ArrayList<C0404p> arrayList = this.f1893L;
                boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
                boolean z2 = this.f1896a.size() == 1;
                if (z || z2) {
                    this.f1913r.m196787g().removeCallbacks(this.f1895N);
                    this.f1913r.m196787g().post(this.f1895N);
                    m2605y1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2576p() {
        if (m2507L0()) {
            qkq0.m175383a("Can not perform this action after onSaveInstanceState");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p0 */
    public Fragment m2577p0(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM2551g0 = m2551g0(string);
        if (fragmentM2551g0 == null) {
            m2599w1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentM2551g0;
    }

    /* JADX INFO: renamed from: p1 */
    public void m2578p1(@NonNull Fragment fragment, boolean z) {
        ViewGroup viewGroupM2580q0 = m2580q0(fragment);
        if (viewGroupM2580q0 == null || !(viewGroupM2580q0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM2580q0).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: q */
    public final void m2579q() {
        this.f1897b = false;
        this.f1891J.clear();
        this.f1890I.clear();
    }

    /* JADX INFO: renamed from: q0 */
    public final ViewGroup m2580q0(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f1914s.mo2459d()) {
            View viewMo2458c = this.f1914s.mo2458c(fragment.mContainerId);
            if (viewMo2458c instanceof ViewGroup) {
                return (ViewGroup) viewMo2458c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q1 */
    public void m2581q1(@NonNull C0421e c0421e) {
        this.f1917v = c0421e;
    }

    /* JADX INFO: renamed from: r */
    public final Set<SpecialEffectsController> m2582r() {
        HashSet hashSet = new HashSet();
        Iterator<C0424h> it = this.f1898c.m2789k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m2766k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m2664o(viewGroup, m2607z0()));
            }
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: r0 */
    public C0421e m2583r0() {
        C0421e c0421e = this.f1917v;
        if (c0421e != null) {
            return c0421e;
        }
        Fragment fragment = this.f1915t;
        return fragment != null ? fragment.mFragmentManager.m2583r0() : this.f1918w;
    }

    /* JADX INFO: renamed from: r1 */
    public void m2584r1(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(m2551g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
        } else {
            qnq0.m175688a("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: s */
    public final Set<SpecialEffectsController> m2585s(@NonNull ArrayList<C0417a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC0427k.a> it = arrayList.get(i).f2084c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2102b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.m2663n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: s0 */
    public C0426j m2586s0() {
        return this.f1898c;
    }

    /* JADX INFO: renamed from: s1 */
    public void m2587s1(@Nullable Fragment fragment) {
        if (fragment != null && (!fragment.equals(m2551g0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            qnq0.m175688a("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
            return;
        }
        Fragment fragment2 = this.f1916u;
        this.f1916u = fragment;
        m2506L(fragment2);
        m2506L(this.f1916u);
    }

    /* JADX INFO: renamed from: t */
    public void m2588t(@NonNull C0417a c0417a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0417a.m2698E(z3);
        } else {
            c0417a.m2697D();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0417a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f1912q >= 1) {
            C0428l.m2818C(this.f1913r.m196786f(), this.f1914s, arrayList, arrayList2, 0, 1, true, this.f1909n);
        }
        if (z3) {
            m2519R0(this.f1912q, true);
        }
        for (Fragment fragment : this.f1898c.m2790l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c0417a.m2701H(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t0 */
    public List<Fragment> m2589t0() {
        return this.f1898c.m2792n();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m2590t1(@NonNull Fragment fragment) {
        ViewGroup viewGroupM2580q0 = m2580q0(fragment);
        if (viewGroupM2580q0 == null || fragment.getNextAnim() <= 0) {
            return;
        }
        if (viewGroupM2580q0.getTag(p5c0.f147285c) == null) {
            viewGroupM2580q0.setTag(p5c0.f147285c, fragment);
        }
        ((Fragment) viewGroupM2580q0.getTag(p5c0.f147285c)).setNextAnim(fragment.getNextAnim());
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f1915t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1915t)));
            sb.append("}");
        } else {
            v2j<?> v2jVar = this.f1913r;
            if (v2jVar != null) {
                sb.append(v2jVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1913r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m2591u(@NonNull Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0420d.d dVarM2738b = C0420d.m2738b(this.f1913r.m196786f(), fragment, !fragment.mHidden);
            if (dVarM2738b == null || (animator = dVarM2738b.f2051b) == null) {
                if (dVarM2738b != null) {
                    fragment.mView.startAnimation(dVarM2738b.f2050a);
                    dVarM2738b.f2050a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    dVarM2738b.f2051b.addListener(new C0396h(viewGroup, view, fragment));
                }
                dVarM2738b.f2051b.start();
            }
        }
        m2494E0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    @NonNull
    /* JADX INFO: renamed from: u0 */
    public v2j<?> m2592u0() {
        return this.f1913r;
    }

    /* JADX INFO: renamed from: u1 */
    public void m2593u1(@NonNull Fragment fragment) {
        if (m2480G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public C0424h m2594v(@NonNull Fragment fragment) {
        C0424h c0424hM2791m = this.f1898c.m2791m(fragment.mWho);
        if (c0424hM2791m != null) {
            return c0424hM2791m;
        }
        C0424h c0424h = new C0424h(this.f1910o, this.f1898c, fragment);
        c0424h.m2770o(this.f1913r.m196786f().getClassLoader());
        c0424h.m2776u(this.f1912q);
        return c0424h;
    }

    @NonNull
    /* JADX INFO: renamed from: v0 */
    public LayoutInflater.Factory2 m2595v0() {
        return this.f1901f;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m2596v1() {
        Iterator<C0424h> it = this.f1898c.m2789k().iterator();
        while (it.hasNext()) {
            m2529W0(it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2597w(@NonNull Fragment fragment) {
        fragment.performDestroyView();
        this.f1910o.m2753n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo2989o(null);
        fragment.mInLayout = false;
    }

    @NonNull
    /* JADX INFO: renamed from: w0 */
    public C0423g m2598w0() {
        return this.f1910o;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m2599w1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new pxv("FragmentManager"));
        v2j<?> v2jVar = this.f1913r;
        if (v2jVar != null) {
            try {
                v2jVar.mo2471h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            m2528W("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2600x(@NonNull Fragment fragment) {
        if (m2480G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m2480G0(2)) {
                fragment.toString();
            }
            this.f1898c.m2797s(fragment);
            if (m2499H0(fragment)) {
                this.f1885D = true;
            }
            m2590t1(fragment);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public Fragment m2601x0() {
        return this.f1915t;
    }

    /* JADX INFO: renamed from: x1 */
    public void m2602x1(@NonNull AbstractC0400l abstractC0400l) {
        this.f1910o.m2755p(abstractC0400l);
    }

    /* JADX INFO: renamed from: y */
    public void m2603y() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2650j(false);
        m2520S(4);
    }

    @Nullable
    /* JADX INFO: renamed from: y0 */
    public Fragment m2604y0() {
        return this.f1916u;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m2605y1() {
        synchronized (this.f1896a) {
            try {
                if (this.f1896a.isEmpty()) {
                    this.f1903h.setEnabled(m2568m0() > 0 && m2503J0(this.f1915t));
                } else {
                    this.f1903h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m2606z() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2650j(false);
        m2520S(0);
    }

    @NonNull
    /* JADX INFO: renamed from: z0 */
    public fnf0 m2607z0() {
        fnf0 fnf0Var = this.f1919x;
        if (fnf0Var != null) {
            return fnf0Var;
        }
        Fragment fragment = this.f1915t;
        return fragment != null ? fragment.mFragmentManager.m2607z0() : this.f1920y;
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0388a();
        int mRequestCode;
        String mWho;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C0388a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.mWho = parcel.readString();
            this.mRequestCode = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mWho);
            parcel.writeInt(this.mRequestCode);
        }

        public LaunchedFragmentInfo(@NonNull String str, int i) {
            this.mWho = str;
            this.mRequestCode = i;
        }
    }
}
