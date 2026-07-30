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
import p153l.a60;
import p153l.c60;
import p153l.d60;
import p153l.fg4;
import p153l.jl50;
import p153l.ker;
import p153l.kl50;
import p153l.mzv;
import p153l.o5j;
import p153l.ovf0;
import p153l.p01;
import p153l.q5j;
import p153l.s5j;
import p153l.sll0;
import p153l.t5j;
import p153l.tll0;
import p153l.udc0;
import p153l.w50;
import p153l.wtq0;
import p153l.wwq0;
import p153l.x50;
import p153l.y50;
import p153l.za50;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {

    /* JADX INFO: renamed from: O */
    public static boolean f1880O = false;

    /* JADX INFO: renamed from: P */
    public static boolean f1881P = true;

    /* JADX INFO: renamed from: A */
    public c60<IntentSenderRequest> f1882A;

    /* JADX INFO: renamed from: B */
    public c60<String[]> f1883B;

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
    public ArrayList<C0418a> f1890I;

    /* JADX INFO: renamed from: J */
    public ArrayList<Boolean> f1891J;

    /* JADX INFO: renamed from: K */
    public ArrayList<Fragment> f1892K;

    /* JADX INFO: renamed from: L */
    public ArrayList<C0405p> f1893L;

    /* JADX INFO: renamed from: M */
    public FragmentManagerViewModel f1894M;

    /* JADX INFO: renamed from: b */
    public boolean f1897b;

    /* JADX INFO: renamed from: d */
    public ArrayList<C0418a> f1899d;

    /* JADX INFO: renamed from: e */
    public ArrayList<Fragment> f1900e;

    /* JADX INFO: renamed from: g */
    public OnBackPressedDispatcher f1902g;

    /* JADX INFO: renamed from: l */
    public ArrayList<InterfaceC0402m> f1907l;

    /* JADX INFO: renamed from: r */
    public q5j<?> f1913r;

    /* JADX INFO: renamed from: s */
    public o5j f1914s;

    /* JADX INFO: renamed from: t */
    public Fragment f1915t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public Fragment f1916u;

    /* JADX INFO: renamed from: z */
    public c60<Intent> f1921z;

    /* JADX INFO: renamed from: a */
    public final ArrayList<InterfaceC0403n> f1896a = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C0427j f1898c = new C0427j();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C0423f f1901f = new LayoutInflaterFactory2C0423f(this);

    /* JADX INFO: renamed from: h */
    public final jl50 f1903h = new C0392c(false);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f1904i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map<String, Bundle> f1905j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map<String, Object> f1906k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public Map<Fragment, HashSet<fg4>> f1908m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    public final C0429l.g f1909n = new C0393d();

    /* JADX INFO: renamed from: o */
    public final C0424g f1910o = new C0424g(this);

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList<s5j> f1911p = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: q */
    public int f1912q = -1;

    /* JADX INFO: renamed from: v */
    public C0422e f1917v = null;

    /* JADX INFO: renamed from: w */
    public C0422e f1918w = new C0394e();

    /* JADX INFO: renamed from: x */
    public ovf0 f1919x = null;

    /* JADX INFO: renamed from: y */
    public ovf0 f1920y = new C0395f();

    /* JADX INFO: renamed from: C */
    public ArrayDeque<LaunchedFragmentInfo> f1884C = new ArrayDeque<>();

    /* JADX INFO: renamed from: N */
    public Runnable f1895N = new RunnableC0396g();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6 */
    class C03886 implements LifecycleEventObserver {
        final /* synthetic */ Lifecycle val$lifecycle;
        final /* synthetic */ t5j val$listener;
        final /* synthetic */ String val$requestKey;

        public C03886(String str, t5j t5jVar, Lifecycle lifecycle) {
            this.val$requestKey = str;
            this.val$lifecycle = lifecycle;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START && ((Bundle) FragmentManager.this.f1905j.get(this.val$requestKey)) != null) {
                throw null;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.val$lifecycle.mo2970d(this);
                FragmentManager.this.f1906k.remove(this.val$requestKey);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$a */
    public class C0390a implements w50<ActivityResult> {
        public C0390a() {
        }

        @Override // p153l.w50
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2611a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f1884C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.mWho;
            int i = launchedFragmentInfoPollFirst.mRequestCode;
            Fragment fragmentM2788i = FragmentManager.this.f1898c.m2788i(str);
            if (fragmentM2788i == null) {
                return;
            }
            fragmentM2788i.onActivityResult(i, activityResult.m202b(), activityResult.m201a());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$b */
    public class C0391b implements w50<Map<String, Boolean>> {
        public C0391b() {
        }

        @Override // p153l.w50
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2611a(Map<String, Boolean> map) {
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
            Fragment fragmentM2788i = FragmentManager.this.f1898c.m2788i(str);
            if (fragmentM2788i == null) {
                return;
            }
            fragmentM2788i.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$c */
    public class C0392c extends jl50 {
        public C0392c(boolean z) {
            super(z);
        }

        @Override // p153l.jl50
        public void handleOnBackPressed() {
            FragmentManager.this.m2491C0();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$d */
    public class C0393d implements C0429l.g {
        public C0393d() {
        }

        @Override // androidx.fragment.app.C0429l.g
        /* JADX INFO: renamed from: a */
        public void mo2614a(@NonNull Fragment fragment, @NonNull fg4 fg4Var) {
            if (fg4Var.m125477c()) {
                return;
            }
            FragmentManager.this.m2550f1(fragment, fg4Var);
        }

        @Override // androidx.fragment.app.C0429l.g
        /* JADX INFO: renamed from: b */
        public void mo2615b(@NonNull Fragment fragment, @NonNull fg4 fg4Var) {
            FragmentManager.this.m2548f(fragment, fg4Var);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$e */
    public class C0394e extends C0422e {
        public C0394e() {
        }

        @Override // androidx.fragment.app.C0422e
        @NonNull
        public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
            return FragmentManager.this.m2593u0().m166152b(FragmentManager.this.m2593u0().m175362f(), str, null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$f */
    public class C0395f implements ovf0 {
        public C0395f() {
        }

        @Override // p153l.ovf0
        @NonNull
        /* JADX INFO: renamed from: a */
        public SpecialEffectsController mo2616a(@NonNull ViewGroup viewGroup) {
            return new C0419b(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$g */
    public class RunnableC0396g implements Runnable {
        public RunnableC0396g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.m2537a0(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$h */
    public class C0397h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f1929a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f1930b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Fragment f1931c;

        public C0397h(ViewGroup viewGroup, View view, Fragment fragment) {
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
    public class C0398i implements s5j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f1933a;

        public C0398i(Fragment fragment) {
            this.f1933a = fragment;
        }

        @Override // p153l.s5j
        /* JADX INFO: renamed from: a */
        public void mo2471a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            this.f1933a.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$j */
    public class C0399j implements w50<ActivityResult> {
        public C0399j() {
        }

        @Override // p153l.w50
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2611a(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f1884C.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                toString();
                return;
            }
            String str = launchedFragmentInfoPollFirst.mWho;
            int i = launchedFragmentInfoPollFirst.mRequestCode;
            Fragment fragmentM2788i = FragmentManager.this.f1898c.m2788i(str);
            if (fragmentM2788i == null) {
                return;
            }
            fragmentM2788i.onActivityResult(i, activityResult.m202b(), activityResult.m201a());
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$k */
    public static class C0400k extends x50<IntentSenderRequest, ActivityResult> {
        @Override // p153l.x50
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo2618a(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentM221a = intentSenderRequest.m221a();
            if (intentM221a != null && (bundleExtra = intentM221a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentM221a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentM221a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.C0055b(intentSenderRequest.m224d()).m228b(null).m229c(intentSenderRequest.m223c(), intentSenderRequest.m222b()).m227a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.m2481G0(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // p153l.x50
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult mo2619c(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$l */
    public static abstract class AbstractC0401l {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public void m2622a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: b */
        public void m2623b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        /* JADX INFO: renamed from: c */
        public void m2624c(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: d */
        public void m2625d(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: e */
        public void m2626e(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: f */
        public void m2627f(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: g */
        public void m2628g(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        /* JADX INFO: renamed from: h */
        public void m2629h(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: i */
        public void m2630i(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: j */
        public void m2631j(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        /* JADX INFO: renamed from: k */
        public void m2632k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: l */
        public void m2633l(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        /* JADX INFO: renamed from: m */
        public void mo2634m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }

        /* JADX INFO: renamed from: n */
        public void m2635n(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$m */
    public interface InterfaceC0402m {
        @MainThread
        void onBackStackChanged();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$n */
    public interface InterfaceC0403n {
        /* JADX INFO: renamed from: a */
        boolean mo2636a(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$o */
    public class C0404o implements InterfaceC0403n {

        /* JADX INFO: renamed from: a */
        public final String f1936a;

        /* JADX INFO: renamed from: b */
        public final int f1937b;

        /* JADX INFO: renamed from: c */
        public final int f1938c;

        public C0404o(String str, int i, int i2) {
            this.f1936a = str;
            this.f1937b = i;
            this.f1938c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0403n
        /* JADX INFO: renamed from: a */
        public boolean mo2636a(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f1916u;
            if (fragment == null || this.f1937b >= 0 || this.f1936a != null || !fragment.getChildFragmentManager().m2536Z0()) {
                return FragmentManager.this.m2540b1(arrayList, arrayList2, this.f1936a, this.f1937b, this.f1938c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$p */
    public static class C0405p implements Fragment.InterfaceC0384k {

        /* JADX INFO: renamed from: a */
        public final boolean f1940a;

        /* JADX INFO: renamed from: b */
        public final C0418a f1941b;

        /* JADX INFO: renamed from: c */
        public int f1942c;

        public C0405p(@NonNull C0418a c0418a, boolean z) {
            this.f1940a = z;
            this.f1941b = c0418a;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0384k
        /* JADX INFO: renamed from: a */
        public void mo2467a() {
            this.f1942c++;
        }

        @Override // androidx.fragment.app.Fragment.InterfaceC0384k
        /* JADX INFO: renamed from: b */
        public void mo2468b() {
            int i = this.f1942c - 1;
            this.f1942c = i;
            if (i != 0) {
                return;
            }
            this.f1941b.f1995t.m2576o1();
        }

        /* JADX INFO: renamed from: c */
        public void m2637c() {
            C0418a c0418a = this.f1941b;
            c0418a.f1995t.m2589t(c0418a, this.f1940a, false, false);
        }

        /* JADX INFO: renamed from: d */
        public void m2638d() {
            boolean z = this.f1942c > 0;
            for (Fragment fragment : this.f1941b.f1995t.m2590t0()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0418a c0418a = this.f1941b;
            c0418a.f1995t.m2589t(c0418a, this.f1940a, !z, true);
        }

        /* JADX INFO: renamed from: e */
        public boolean m2639e() {
            return this.f1942c == 0;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: A0 */
    public static Fragment m2480A0(@NonNull View view) {
        Object tag = view.getTag(udc0.f178516a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m2481G0(int i) {
        return f1880O || Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m2485c0(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0418a c0418a = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                c0418a.m2719z(-1);
                c0418a.m2699E(i == i2 + (-1));
            } else {
                c0418a.m2719z(1);
                c0418a.m2698D();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static int m2486l1(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: renamed from: A */
    public void m2487A(@NonNull Configuration configuration) {
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m2488B(@NonNull MenuItem menuItem) {
        if (this.f1912q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: B0 */
    public sll0 m2489B0(@NonNull Fragment fragment) {
        return this.f1894M.m2648g(fragment);
    }

    /* JADX INFO: renamed from: C */
    public void m2490C() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2651j(false);
        m2521S(1);
    }

    /* JADX INFO: renamed from: C0 */
    public void m2491C0() {
        m2537a0(true);
        if (this.f1903h.isEnabled()) {
            m2536Z0();
        } else {
            this.f1902g.m199d();
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m2492D(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f1912q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null && m2502I0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
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
    public void m2493D0(@NonNull Fragment fragment) {
        if (m2481G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        m2591t1(fragment);
    }

    /* JADX INFO: renamed from: E */
    public void m2494E() {
        this.f1888G = true;
        m2537a0(true);
        m2531X();
        m2521S(-1);
        this.f1913r = null;
        this.f1914s = null;
        this.f1915t = null;
        if (this.f1902g != null) {
            this.f1903h.remove();
            this.f1902g = null;
        }
        c60<Intent> c60Var = this.f1921z;
        if (c60Var != null) {
            c60Var.mo218d();
            this.f1882A.mo218d();
            this.f1883B.mo218d();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m2495E0(@NonNull Fragment fragment) {
        if (fragment.mAdded && m2500H0(fragment)) {
            this.f1885D = true;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m2496F() {
        m2521S(1);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m2497F0() {
        return this.f1888G;
    }

    /* JADX INFO: renamed from: G */
    public void m2498G() {
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m2499H(boolean z) {
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m2500H0(@NonNull Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m2574o();
    }

    /* JADX INFO: renamed from: I */
    public void m2501I(@NonNull Fragment fragment) {
        Iterator<s5j> it = this.f1911p.iterator();
        while (it.hasNext()) {
            it.next().mo2471a(this, fragment);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m2502I0(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: renamed from: J */
    public boolean m2503J(@NonNull MenuItem menuItem) {
        if (this.f1912q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m2504J0(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.m2605y0()) && m2504J0(fragmentManager.f1915t);
    }

    /* JADX INFO: renamed from: K */
    public void m2505K(@NonNull Menu menu) {
        if (this.f1912q < 1) {
            return;
        }
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m2506K0(int i) {
        return this.f1912q >= i;
    }

    /* JADX INFO: renamed from: L */
    public final void m2507L(@Nullable Fragment fragment) {
        if (fragment == null || !fragment.equals(m2552g0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m2508L0() {
        return this.f1886E || this.f1887F;
    }

    /* JADX INFO: renamed from: M */
    public void m2509M() {
        m2521S(5);
    }

    /* JADX INFO: renamed from: M0 */
    public void m2510M0(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
        if (this.f1883B == null) {
            this.f1913r.m175364k(fragment, strArr, i);
            return;
        }
        this.f1884C.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        this.f1883B.m108087b(strArr);
    }

    /* JADX INFO: renamed from: N */
    public void m2511N(boolean z) {
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m2512N0(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (this.f1921z == null) {
            this.f1913r.m175365n(fragment, intent, i, bundle);
            return;
        }
        this.f1884C.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f1921z.m108087b(intent);
    }

    /* JADX INFO: renamed from: O */
    public boolean m2513O(@NonNull Menu menu) {
        boolean z = false;
        if (this.f1912q < 1) {
            return false;
        }
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null && m2502I0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: O0 */
    public void m2514O0(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f1882A == null) {
            this.f1913r.m175366o(fragment, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (m2481G0(2)) {
                bundle.toString();
                intent.toString();
                Objects.toString(fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestM227a = new IntentSenderRequest.C0055b(intentSender).m228b(intent).m229c(i3, i2).m227a();
        this.f1884C.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
        if (m2481G0(2)) {
            fragment.toString();
        }
        this.f1882A.m108087b(intentSenderRequestM227a);
    }

    /* JADX INFO: renamed from: P */
    public void m2515P() {
        m2606y1();
        m2507L(this.f1916u);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2516P0(@NonNull p01<Fragment> p01Var) {
        int size = p01Var.size();
        for (int i = 0; i < size; i++) {
            Fragment fragmentM170019l = p01Var.m170019l(i);
            if (!fragmentM170019l.mAdded) {
                View viewRequireView = fragmentM170019l.requireView();
                fragmentM170019l.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m2517Q() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2651j(false);
        m2521S(7);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m2518Q0(@NonNull Fragment fragment) {
        if (!this.f1898c.m2782c(fragment.mWho)) {
            if (m2481G0(3)) {
                fragment.toString();
                toString();
                return;
            }
            return;
        }
        m2522S0(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f = fragment.mPostponedAlpha;
            if (f > 0.0f) {
                view.setAlpha(f);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            C0421d.d dVarM2739b = C0421d.m2739b(this.f1913r.m175362f(), fragment, true);
            if (dVarM2739b != null) {
                Animation animation = dVarM2739b.f2050a;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    dVarM2739b.f2051b.setTarget(fragment.mView);
                    dVarM2739b.f2051b.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m2592u(fragment);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m2519R() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2651j(false);
        m2521S(5);
    }

    /* JADX INFO: renamed from: R0 */
    public void m2520R0(int i, boolean z) {
        q5j<?> q5jVar;
        if (this.f1913r == null && i != -1) {
            wtq0.m207906a("No activity");
            return;
        }
        if (z || i != this.f1912q) {
            this.f1912q = i;
            boolean z2 = f1881P;
            C0427j c0427j = this.f1898c;
            if (z2) {
                c0427j.m2797r();
            } else {
                Iterator<Fragment> it = c0427j.m2793n().iterator();
                while (it.hasNext()) {
                    m2518Q0(it.next());
                }
                for (C0425h c0425h : this.f1898c.m2790k()) {
                    Fragment fragmentM2767k = c0425h.m2767k();
                    if (!fragmentM2767k.mIsNewlyAdded) {
                        m2518Q0(fragmentM2767k);
                    }
                    if (fragmentM2767k.mRemoving && !fragmentM2767k.isInBackStack()) {
                        this.f1898c.m2796q(c0425h);
                    }
                }
            }
            m2597v1();
            if (this.f1885D && (q5jVar = this.f1913r) != null && this.f1912q == 7) {
                q5jVar.mo2477p();
                this.f1885D = false;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2521S(int i) {
        try {
            this.f1897b = true;
            this.f1898c.m2783d(i);
            m2520R0(i, false);
            if (f1881P) {
                Iterator<SpecialEffectsController> it = m2583r().iterator();
                while (it.hasNext()) {
                    it.next().m2675j();
                }
            }
            this.f1897b = false;
            m2537a0(true);
        } catch (Throwable th) {
            this.f1897b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m2522S0(@NonNull Fragment fragment) {
        m2524T0(fragment, this.f1912q);
    }

    /* JADX INFO: renamed from: T */
    public void m2523T() {
        this.f1887F = true;
        this.f1894M.m2651j(true);
        m2521S(4);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /* JADX INFO: renamed from: T0 */
    public void m2524T0(@NonNull Fragment fragment, int i) {
        ViewGroup viewGroup;
        C0425h c0425hM2792m = this.f1898c.m2792m(fragment.mWho);
        int i2 = 1;
        if (c0425hM2792m == null) {
            c0425hM2792m = new C0425h(this.f1910o, this.f1898c, fragment);
            c0425hM2792m.m2777u(1);
        }
        if (fragment.mFromLayout && fragment.mInLayout && fragment.mState == 2) {
            i = Math.max(i, 2);
        }
        int iMin = Math.min(i, c0425hM2792m.m2760d());
        int i3 = fragment.mState;
        if (i3 <= iMin) {
            if (i3 < iMin && !this.f1908m.isEmpty()) {
                m2571n(fragment);
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
                                c0425hM2792m.m2772p();
                            }
                        }
                        if (iMin > 4) {
                            c0425hM2792m.m2778v();
                        }
                        if (iMin > 5) {
                            c0425hM2792m.m2772p();
                        }
                    }
                    if (iMin > 2) {
                        c0425hM2792m.m2757a();
                    }
                    if (iMin > 4) {
                        c0425hM2792m.m2778v();
                    }
                    if (iMin > 5) {
                        c0425hM2792m.m2772p();
                    }
                }
                if (iMin > -1) {
                    c0425hM2792m.m2766j();
                }
                if (iMin > 1) {
                    c0425hM2792m.m2762f();
                }
                if (iMin > 2) {
                    c0425hM2792m.m2757a();
                }
                if (iMin > 4) {
                    c0425hM2792m.m2778v();
                }
                if (iMin > 5) {
                    c0425hM2792m.m2772p();
                }
            } else if (iMin > -1) {
                c0425hM2792m.m2759c();
            }
            if (iMin > 0) {
                c0425hM2792m.m2761e();
            }
            if (iMin > -1) {
                c0425hM2792m.m2766j();
            }
            if (iMin > 1) {
                c0425hM2792m.m2762f();
            }
            if (iMin > 2) {
                c0425hM2792m.m2757a();
            }
            if (iMin > 4) {
                c0425hM2792m.m2778v();
            }
            if (iMin > 5) {
                c0425hM2792m.m2772p();
            }
        } else if (i3 > iMin) {
            if (i3 == 0) {
                i2 = iMin;
                if (i2 < 0) {
                    c0425hM2792m.m2765i();
                }
                iMin = i2;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    if (iMin < 7) {
                                        c0425hM2792m.m2770n();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                c0425hM2792m.m2779w();
                            }
                        }
                        if (iMin < 4) {
                            if (m2481G0(3)) {
                                fragment.toString();
                            }
                            if (fragment.mView != null && this.f1913r.mo2475l(fragment) && fragment.mSavedViewState == null) {
                                c0425hM2792m.m2776t();
                            }
                        }
                    }
                    if (iMin < 2) {
                        View view = fragment.mView;
                        if (view != null && (viewGroup = fragment.mContainer) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.mView.clearAnimation();
                            if (!fragment.isRemovingParent()) {
                                C0421d.d dVarM2739b = (this.f1912q <= -1 || this.f1888G || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) ? null : C0421d.m2739b(this.f1913r.m175362f(), fragment, false);
                                fragment.mPostponedAlpha = 0.0f;
                                ViewGroup viewGroup2 = fragment.mContainer;
                                View view2 = fragment.mView;
                                if (dVarM2739b != null) {
                                    C0421d.m2738a(fragment, dVarM2739b, this.f1909n);
                                }
                                viewGroup2.removeView(view2);
                                if (m2481G0(2)) {
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
                            c0425hM2792m.m2764h();
                        }
                    }
                }
                if (iMin >= 1) {
                    i2 = iMin;
                } else if (this.f1908m.get(fragment) == null) {
                    c0425hM2792m.m2763g();
                    i2 = iMin;
                }
                if (i2 < 0) {
                    c0425hM2792m.m2765i();
                }
                iMin = i2;
            }
        }
        if (fragment.mState != iMin) {
            if (m2481G0(3)) {
                fragment.toString();
            }
            fragment.mState = iMin;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m2525U() {
        m2521S(2);
    }

    /* JADX INFO: renamed from: U0 */
    public void m2526U0() {
        if (this.f1913r == null) {
            return;
        }
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2651j(false);
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m2527V() {
        if (this.f1889H) {
            this.f1889H = false;
            m2597v1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m2528V0(@NonNull FragmentContainerView fragmentContainerView) {
        View view;
        for (C0425h c0425h : this.f1898c.m2790k()) {
            Fragment fragmentM2767k = c0425h.m2767k();
            if (fragmentM2767k.mContainerId == fragmentContainerView.getId() && (view = fragmentM2767k.mView) != null && view.getParent() == null) {
                fragmentM2767k.mContainer = fragmentContainerView;
                c0425h.m2758b();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public void m2529W(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1898c.m2784e(str, fileDescriptor, printWriter, strArr);
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
        ArrayList<C0418a> arrayList2 = this.f1899d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                C0418a c0418a = this.f1899d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(c0418a.toString());
                c0418a.m2696B(str2, printWriter);
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
                        InterfaceC0403n interfaceC0403n = this.f1896a.get(i3);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i3);
                        printWriter.print(": ");
                        printWriter.println(interfaceC0403n);
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
    public void m2530W0(@NonNull C0425h c0425h) {
        Fragment fragmentM2767k = c0425h.m2767k();
        if (fragmentM2767k.mDeferStart) {
            if (this.f1897b) {
                this.f1889H = true;
                return;
            }
            fragmentM2767k.mDeferStart = false;
            if (f1881P) {
                c0425h.m2769m();
            } else {
                m2522S0(fragmentM2767k);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m2531X() {
        if (f1881P) {
            Iterator<SpecialEffectsController> it = m2583r().iterator();
            while (it.hasNext()) {
                it.next().m2675j();
            }
        } else {
            if (this.f1908m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f1908m.keySet()) {
                m2571n(fragment);
                m2522S0(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m2532X0() {
        m2533Y(new C0404o(null, -1, 0), false);
    }

    /* JADX INFO: renamed from: Y */
    public void m2533Y(@NonNull InterfaceC0403n interfaceC0403n, boolean z) {
        if (!z) {
            if (this.f1913r == null) {
                if (this.f1888G) {
                    wtq0.m207906a("FragmentManager has been destroyed");
                    return;
                } else {
                    wtq0.m207906a("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            m2577p();
        }
        synchronized (this.f1896a) {
            try {
                if (this.f1913r == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1896a.add(interfaceC0403n);
                    m2576o1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m2534Y0(int i, int i2) {
        if (i >= 0) {
            m2533Y(new C0404o(null, i, i2), false);
        } else {
            za50.m219101a("Bad id: ", i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m2535Z(boolean z) {
        if (this.f1897b) {
            wtq0.m207906a("FragmentManager is already executing transactions");
            return;
        }
        if (this.f1913r == null) {
            if (this.f1888G) {
                wtq0.m207906a("FragmentManager has been destroyed");
                return;
            } else {
                wtq0.m207906a("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f1913r.m175363g().getLooper()) {
            wtq0.m207906a("Must be called from main thread of fragment host");
            return;
        }
        if (!z) {
            m2577p();
        }
        if (this.f1890I == null) {
            this.f1890I = new ArrayList<>();
            this.f1891J = new ArrayList<>();
        }
        this.f1897b = true;
        try {
            m2549f0(null, null);
        } finally {
            this.f1897b = false;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m2536Z0() {
        return m2538a1(null, -1, 0);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m2537a0(boolean z) {
        m2535Z(z);
        boolean z2 = false;
        while (m2567l0(this.f1890I, this.f1891J)) {
            z2 = true;
            this.f1897b = true;
            try {
                m2556h1(this.f1890I, this.f1891J);
                m2580q();
            } catch (Throwable th) {
                m2580q();
                throw th;
            }
        }
        m2606y1();
        m2527V();
        this.f1898c.m2781b();
        return z2;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m2538a1(@Nullable String str, int i, int i2) {
        m2537a0(false);
        m2535Z(true);
        Fragment fragment = this.f1916u;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().m2536Z0()) {
            return true;
        }
        boolean zM2540b1 = m2540b1(this.f1890I, this.f1891J, str, i, i2);
        if (zM2540b1) {
            this.f1897b = true;
            try {
                m2556h1(this.f1890I, this.f1891J);
                m2580q();
            } catch (Throwable th) {
                m2580q();
                throw th;
            }
        }
        m2606y1();
        m2527V();
        this.f1898c.m2781b();
        return zM2540b1;
    }

    /* JADX INFO: renamed from: b0 */
    public void m2539b0(@NonNull InterfaceC0403n interfaceC0403n, boolean z) {
        if (z && (this.f1913r == null || this.f1888G)) {
            return;
        }
        m2535Z(z);
        if (interfaceC0403n.mo2636a(this.f1890I, this.f1891J)) {
            this.f1897b = true;
            try {
                m2556h1(this.f1890I, this.f1891J);
                m2580q();
            } catch (Throwable th) {
                m2580q();
                throw th;
            }
        }
        m2606y1();
        m2527V();
        this.f1898c.m2781b();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m2540b1(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i, int i2) {
        int i3;
        ArrayList<C0418a> arrayList3 = this.f1899d;
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
                    C0418a c0418a = this.f1899d.get(size2);
                    if ((str != null && str.equals(c0418a.m2701G())) || (i >= 0 && i == c0418a.f1997v)) {
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
                        C0418a c0418a2 = this.f1899d.get(size2);
                        if (str == null || !str.equals(c0418a2.m2701G())) {
                            if (i < 0 || i != c0418a2.f1997v) {
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
    public final int m2541c1(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2, @NonNull p01<Fragment> p01Var) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0418a c0418a = arrayList.get(i4);
            boolean zBooleanValue = arrayList2.get(i4).booleanValue();
            if (c0418a.m2704K() && !c0418a.m2703I(arrayList, i4 + 1, i2)) {
                if (this.f1893L == null) {
                    this.f1893L = new ArrayList<>();
                }
                C0405p c0405p = new C0405p(c0418a, zBooleanValue);
                this.f1893L.add(c0405p);
                c0418a.m2706M(c0405p);
                if (zBooleanValue) {
                    c0418a.m2698D();
                } else {
                    c0418a.m2699E(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c0418a);
                }
                m2542d(p01Var);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public final void m2542d(@NonNull p01<Fragment> p01Var) {
        int i = this.f1912q;
        if (i < 1) {
            return;
        }
        int iMin = Math.min(i, 5);
        for (Fragment fragment : this.f1898c.m2793n()) {
            if (fragment.mState < iMin) {
                m2524T0(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    p01Var.add(fragment);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2543d0(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2) {
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
        this.f1892K.addAll(this.f1898c.m2793n());
        Fragment fragmentM2605y0 = m2605y0();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0418a c0418a = arrayList.get(i6);
            boolean zBooleanValue = arrayList2.get(i6).booleanValue();
            ArrayList<Fragment> arrayList4 = this.f1892K;
            fragmentM2605y0 = !zBooleanValue ? c0418a.m2700F(arrayList4, fragmentM2605y0) : c0418a.m2707N(arrayList4, fragmentM2605y0);
            z2 = z2 || c0418a.f2090i;
        }
        this.f1892K.clear();
        if (!z && this.f1912q >= 1) {
            if (f1881P) {
                for (int i7 = i4; i7 < i5; i7++) {
                    Iterator<AbstractC0428k.a> it = arrayList.get(i7).f2084c.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = it.next().f2102b;
                        if (fragment != null && fragment.mFragmentManager != null) {
                            this.f1898c.m2795p(m2595v(fragment));
                        }
                    }
                }
            } else {
                C0429l.m2819C(this.f1913r.m175362f(), this.f1914s, arrayList, arrayList2, i4, i5, false, this.f1909n);
            }
        }
        m2485c0(arrayList, arrayList2, i, i2);
        if (f1881P) {
            boolean zBooleanValue2 = arrayList2.get(i5 - 1).booleanValue();
            for (int i8 = i4; i8 < i5; i8++) {
                C0418a c0418a2 = arrayList.get(i8);
                if (zBooleanValue2) {
                    for (int size = c0418a2.f2084c.size() - 1; size >= 0; size--) {
                        Fragment fragment2 = c0418a2.f2084c.get(size).f2102b;
                        if (fragment2 != null) {
                            m2595v(fragment2).m2769m();
                        }
                    }
                } else {
                    Iterator<AbstractC0428k.a> it2 = c0418a2.f2084c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f2102b;
                        if (fragment3 != null) {
                            m2595v(fragment3).m2769m();
                        }
                    }
                }
            }
            m2520R0(this.f1912q, true);
            for (SpecialEffectsController specialEffectsController : m2586s(arrayList, i, i5)) {
                specialEffectsController.m2681r(zBooleanValue2);
                specialEffectsController.m2679p();
                specialEffectsController.m2672g();
            }
            i3 = i5;
        } else {
            if (z) {
                p01<Fragment> p01Var = new p01<>();
                m2542d(p01Var);
                int iM2541c1 = m2541c1(arrayList, arrayList2, i4, i2, p01Var);
                i3 = i2;
                m2516P0(p01Var);
                i5 = iM2541c1;
            } else {
                i3 = i5;
            }
            if (i5 != i4 && z) {
                if (this.f1912q >= 1) {
                    C0429l.m2819C(this.f1913r.m175362f(), this.f1914s, arrayList, arrayList2, i4, i5, true, this.f1909n);
                }
                m2520R0(this.f1912q, true);
            }
        }
        i4 = i4;
        for (int i9 = i; i9 < i3; i9++) {
            C0418a c0418a3 = arrayList.get(i9);
            if (arrayList2.get(i9).booleanValue() && c0418a3.f1997v >= 0) {
                c0418a3.f1997v = -1;
            }
            c0418a3.m2705L();
        }
        if (z2) {
            m2562j1();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m2544d1(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m2600w1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* JADX INFO: renamed from: e */
    public void m2545e(C0418a c0418a) {
        if (this.f1899d == null) {
            this.f1899d = new ArrayList<>();
        }
        this.f1899d.add(c0418a);
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m2546e0() {
        boolean zM2537a0 = m2537a0(true);
        m2564k0();
        return zM2537a0;
    }

    /* JADX INFO: renamed from: e1 */
    public void m2547e1(@NonNull AbstractC0401l abstractC0401l, boolean z) {
        this.f1910o.m2755o(abstractC0401l, z);
    }

    /* JADX INFO: renamed from: f */
    public void m2548f(@NonNull Fragment fragment, @NonNull fg4 fg4Var) {
        if (this.f1908m.get(fragment) == null) {
            this.f1908m.put(fragment, new HashSet<>());
        }
        this.f1908m.get(fragment).add(fg4Var);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m2549f0(@Nullable ArrayList<C0418a> arrayList, @Nullable ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C0405p> arrayList3 = this.f1893L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0405p c0405p = this.f1893L.get(i);
            if (arrayList != null && !c0405p.f1940a && (iIndexOf2 = arrayList.indexOf(c0405p.f1941b)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.f1893L.remove(i);
                i--;
                size--;
                c0405p.m2637c();
            } else if (c0405p.m2639e() || (arrayList != null && c0405p.f1941b.m2703I(arrayList, 0, arrayList.size()))) {
                this.f1893L.remove(i);
                i--;
                size--;
                if (arrayList == null || c0405p.f1940a || (iIndexOf = arrayList.indexOf(c0405p.f1941b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    c0405p.m2638d();
                } else {
                    c0405p.m2637c();
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m2550f1(@NonNull Fragment fragment, @NonNull fg4 fg4Var) {
        HashSet<fg4> hashSet = this.f1908m.get(fragment);
        if (hashSet != null && hashSet.remove(fg4Var) && hashSet.isEmpty()) {
            this.f1908m.remove(fragment);
            if (fragment.mState < 5) {
                m2598w(fragment);
                m2522S0(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public C0425h m2551g(@NonNull Fragment fragment) {
        if (m2481G0(2)) {
            Objects.toString(fragment);
        }
        C0425h c0425hM2595v = m2595v(fragment);
        fragment.mFragmentManager = this;
        this.f1898c.m2795p(c0425hM2595v);
        if (!fragment.mDetached) {
            this.f1898c.m2780a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m2500H0(fragment)) {
                this.f1885D = true;
            }
        }
        return c0425hM2595v;
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public Fragment m2552g0(@NonNull String str) {
        return this.f1898c.m2785f(str);
    }

    /* JADX INFO: renamed from: g1 */
    public void m2553g1(@NonNull Fragment fragment) {
        if (m2481G0(2)) {
            Objects.toString(fragment);
            int i = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.f1898c.m2798s(fragment);
        if (m2500H0(fragment)) {
            this.f1885D = true;
        }
        fragment.mRemoving = true;
        m2591t1(fragment);
    }

    /* JADX INFO: renamed from: h */
    public void m2554h(@NonNull s5j s5jVar) {
        this.f1911p.add(s5jVar);
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public Fragment m2555h0(@IdRes int i) {
        return this.f1898c.m2786g(i);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m2556h1(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            wtq0.m207906a("Internal error with the back stack records");
            return;
        }
        m2549f0(arrayList, arrayList2);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).f2099r) {
                if (i2 != i) {
                    m2543d0(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f2099r) {
                        i2++;
                    }
                }
                m2543d0(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m2543d0(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2557i(@NonNull Fragment fragment) {
        this.f1894M.m2643a(fragment);
    }

    @Nullable
    /* JADX INFO: renamed from: i0 */
    public Fragment m2558i0(@Nullable String str) {
        return this.f1898c.m2787h(str);
    }

    /* JADX INFO: renamed from: i1 */
    public void m2559i1(@NonNull Fragment fragment) {
        this.f1894M.m2650i(fragment);
    }

    /* JADX INFO: renamed from: j */
    public int m2560j() {
        return this.f1904i.getAndIncrement();
    }

    /* JADX INFO: renamed from: j0 */
    public Fragment m2561j0(@NonNull String str) {
        return this.f1898c.m2788i(str);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m2562j1() {
        if (this.f1907l != null) {
            for (int i = 0; i < this.f1907l.size(); i++) {
                this.f1907l.get(i).onBackStackChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: k */
    public void m2563k(@NonNull q5j<?> q5jVar, @NonNull o5j o5jVar, @Nullable Fragment fragment) {
        String str;
        ker kerVar;
        if (this.f1913r != null) {
            wtq0.m207906a("Already attached");
            return;
        }
        this.f1913r = q5jVar;
        this.f1914s = o5jVar;
        this.f1915t = fragment;
        if (fragment != null) {
            m2554h(new C0398i(fragment));
        } else if (q5jVar instanceof s5j) {
            m2554h((s5j) q5jVar);
        }
        if (this.f1915t != null) {
            m2606y1();
        }
        if (q5jVar instanceof kl50) {
            kl50 kl50Var = (kl50) q5jVar;
            OnBackPressedDispatcher onBackPressedDispatcher = kl50Var.getOnBackPressedDispatcher();
            this.f1902g = onBackPressedDispatcher;
            if (fragment != null) {
                kerVar = kl50Var;
                kerVar = fragment;
            }
            kerVar = kl50Var;
            onBackPressedDispatcher.m196a(kerVar, this.f1903h);
        }
        if (fragment != null) {
            this.f1894M = fragment.mFragmentManager.m2572n0(fragment);
        } else if (q5jVar instanceof tll0) {
            this.f1894M = FragmentManagerViewModel.m2642e(((tll0) q5jVar).getViewModelStore());
        } else {
            this.f1894M = new FragmentManagerViewModel(false);
        }
        this.f1894M.m2651j(m2508L0());
        this.f1898c.m2803x(this.f1894M);
        Object obj = this.f1913r;
        if (obj instanceof d60) {
            ActivityResultRegistry activityResultRegistry = ((d60) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String strConcat = "FragmentManager:".concat(str);
            this.f1921z = activityResultRegistry.m212i(strConcat.concat("StartActivityForResult"), new a60(), new C0399j());
            this.f1882A = activityResultRegistry.m212i(strConcat.concat("StartIntentSenderForResult"), new C0400k(), new C0390a());
            this.f1883B = activityResultRegistry.m212i(strConcat.concat("RequestPermissions"), new y50(), new C0391b());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m2564k0() {
        if (f1881P) {
            Iterator<SpecialEffectsController> it = m2583r().iterator();
            while (it.hasNext()) {
                it.next().m2676k();
            }
        } else if (this.f1893L != null) {
            while (!this.f1893L.isEmpty()) {
                this.f1893L.remove(0).m2638d();
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m2565k1(@Nullable Parcelable parcelable) {
        C0425h c0425h;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.mActive == null) {
            return;
        }
        this.f1898c.m2799t();
        for (FragmentState fragmentState : fragmentManagerState.mActive) {
            if (fragmentState != null) {
                Fragment fragmentM2645c = this.f1894M.m2645c(fragmentState.mWho);
                if (fragmentM2645c != null) {
                    if (m2481G0(2)) {
                        fragmentM2645c.toString();
                    }
                    c0425h = new C0425h(this.f1910o, this.f1898c, fragmentM2645c, fragmentState);
                } else {
                    c0425h = new C0425h(this.f1910o, this.f1898c, this.f1913r.m175362f().getClassLoader(), m2584r0(), fragmentState);
                }
                Fragment fragmentM2767k = c0425h.m2767k();
                fragmentM2767k.mFragmentManager = this;
                if (m2481G0(2)) {
                    fragmentM2767k.toString();
                }
                c0425h.m2771o(this.f1913r.m175362f().getClassLoader());
                this.f1898c.m2795p(c0425h);
                c0425h.m2777u(this.f1912q);
            }
        }
        for (Fragment fragment : this.f1894M.m2647f()) {
            if (!this.f1898c.m2782c(fragment.mWho)) {
                if (m2481G0(2)) {
                    fragment.toString();
                    Objects.toString(fragmentManagerState.mActive);
                }
                this.f1894M.m2650i(fragment);
                fragment.mFragmentManager = this;
                C0425h c0425h2 = new C0425h(this.f1910o, this.f1898c, fragment);
                c0425h2.m2777u(1);
                c0425h2.m2769m();
                fragment.mRemoving = true;
                c0425h2.m2769m();
            }
        }
        this.f1898c.m2800u(fragmentManagerState.mAdded);
        if (fragmentManagerState.mBackStack != null) {
            this.f1899d = new ArrayList<>(fragmentManagerState.mBackStack.length);
            int i = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.mBackStack;
                if (i >= backStackStateArr.length) {
                    break;
                }
                C0418a c0418aM2455a = backStackStateArr[i].m2455a(this);
                if (m2481G0(2)) {
                    int i2 = c0418aM2455a.f1997v;
                    c0418aM2455a.toString();
                    PrintWriter printWriter = new PrintWriter(new mzv("FragmentManager"));
                    c0418aM2455a.m2697C("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1899d.add(c0418aM2455a);
                i++;
            }
        } else {
            this.f1899d = null;
        }
        this.f1904i.set(fragmentManagerState.mBackStackIndex);
        String str = fragmentManagerState.mPrimaryNavActiveWho;
        if (str != null) {
            Fragment fragmentM2552g0 = m2552g0(str);
            this.f1916u = fragmentM2552g0;
            m2507L(fragmentM2552g0);
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
    public void m2566l(@NonNull Fragment fragment) {
        if (m2481G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f1898c.m2780a(fragment);
            if (m2481G0(2)) {
                fragment.toString();
            }
            if (m2500H0(fragment)) {
                this.f1885D = true;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m2567l0(@NonNull ArrayList<C0418a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.f1896a) {
            try {
                int i = 0;
                if (this.f1896a.isEmpty()) {
                    return false;
                }
                int size = this.f1896a.size();
                boolean zMo2636a = false;
                while (true) {
                    ArrayList<InterfaceC0403n> arrayList3 = this.f1896a;
                    if (i >= size) {
                        arrayList3.clear();
                        this.f1913r.m175363g().removeCallbacks(this.f1895N);
                        return zMo2636a;
                    }
                    zMo2636a |= arrayList3.get(i).mo2636a(arrayList, arrayList2);
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public AbstractC0428k m2568m() {
        return new C0418a(this);
    }

    /* JADX INFO: renamed from: m0 */
    public int m2569m0() {
        ArrayList<C0418a> arrayList = this.f1899d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public Parcelable m2570m1() {
        int size;
        m2564k0();
        m2531X();
        m2537a0(true);
        this.f1886E = true;
        this.f1894M.m2651j(true);
        ArrayList<FragmentState> arrayListM2801v = this.f1898c.m2801v();
        BackStackState[] backStackStateArr = null;
        if (arrayListM2801v.isEmpty()) {
            m2481G0(2);
            return null;
        }
        ArrayList<String> arrayListM2802w = this.f1898c.m2802w();
        ArrayList<C0418a> arrayList = this.f1899d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.f1899d.get(i));
                if (m2481G0(2)) {
                    Objects.toString(this.f1899d.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.mActive = arrayListM2801v;
        fragmentManagerState.mAdded = arrayListM2802w;
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
    public final void m2571n(@NonNull Fragment fragment) {
        HashSet<fg4> hashSet = this.f1908m.get(fragment);
        if (hashSet != null) {
            Iterator<fg4> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m125475a();
            }
            hashSet.clear();
            m2598w(fragment);
            this.f1908m.remove(fragment);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: n0 */
    public final FragmentManagerViewModel m2572n0(@NonNull Fragment fragment) {
        return this.f1894M.m2646d(fragment);
    }

    @Nullable
    /* JADX INFO: renamed from: n1 */
    public Fragment.SavedState m2573n1(@NonNull Fragment fragment) {
        C0425h c0425hM2792m = this.f1898c.m2792m(fragment.mWho);
        if (c0425hM2792m == null || !c0425hM2792m.m2767k().equals(fragment)) {
            m2600w1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return c0425hM2792m.m2774r();
    }

    /* JADX INFO: renamed from: o */
    public boolean m2574o() {
        boolean zM2500H0 = false;
        for (Fragment fragment : this.f1898c.m2791l()) {
            if (fragment != null) {
                zM2500H0 = m2500H0(fragment);
            }
            if (zM2500H0) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: o0 */
    public o5j m2575o0() {
        return this.f1914s;
    }

    /* JADX INFO: renamed from: o1 */
    public void m2576o1() {
        synchronized (this.f1896a) {
            try {
                ArrayList<C0405p> arrayList = this.f1893L;
                boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
                boolean z2 = this.f1896a.size() == 1;
                if (z || z2) {
                    this.f1913r.m175363g().removeCallbacks(this.f1895N);
                    this.f1913r.m175363g().post(this.f1895N);
                    m2606y1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2577p() {
        if (m2508L0()) {
            wtq0.m207906a("Can not perform this action after onSaveInstanceState");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p0 */
    public Fragment m2578p0(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentM2552g0 = m2552g0(string);
        if (fragmentM2552g0 == null) {
            m2600w1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentM2552g0;
    }

    /* JADX INFO: renamed from: p1 */
    public void m2579p1(@NonNull Fragment fragment, boolean z) {
        ViewGroup viewGroupM2581q0 = m2581q0(fragment);
        if (viewGroupM2581q0 == null || !(viewGroupM2581q0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM2581q0).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: q */
    public final void m2580q() {
        this.f1897b = false;
        this.f1891J.clear();
        this.f1890I.clear();
    }

    /* JADX INFO: renamed from: q0 */
    public final ViewGroup m2581q0(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f1914s.mo2460d()) {
            View viewMo2459c = this.f1914s.mo2459c(fragment.mContainerId);
            if (viewMo2459c instanceof ViewGroup) {
                return (ViewGroup) viewMo2459c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q1 */
    public void m2582q1(@NonNull C0422e c0422e) {
        this.f1917v = c0422e;
    }

    /* JADX INFO: renamed from: r */
    public final Set<SpecialEffectsController> m2583r() {
        HashSet hashSet = new HashSet();
        Iterator<C0425h> it = this.f1898c.m2790k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m2767k().mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.m2665o(viewGroup, m2608z0()));
            }
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: r0 */
    public C0422e m2584r0() {
        C0422e c0422e = this.f1917v;
        if (c0422e != null) {
            return c0422e;
        }
        Fragment fragment = this.f1915t;
        return fragment != null ? fragment.mFragmentManager.m2584r0() : this.f1918w;
    }

    /* JADX INFO: renamed from: r1 */
    public void m2585r1(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(m2552g0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
        } else {
            wwq0.m208289a("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: s */
    public final Set<SpecialEffectsController> m2586s(@NonNull ArrayList<C0418a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<AbstractC0428k.a> it = arrayList.get(i).f2084c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2102b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.m2664n(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    @NonNull
    /* JADX INFO: renamed from: s0 */
    public C0427j m2587s0() {
        return this.f1898c;
    }

    /* JADX INFO: renamed from: s1 */
    public void m2588s1(@Nullable Fragment fragment) {
        if (fragment != null && (!fragment.equals(m2552g0(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            wwq0.m208289a("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
            return;
        }
        Fragment fragment2 = this.f1916u;
        this.f1916u = fragment;
        m2507L(fragment2);
        m2507L(this.f1916u);
    }

    /* JADX INFO: renamed from: t */
    public void m2589t(@NonNull C0418a c0418a, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0418a.m2699E(z3);
        } else {
            c0418a.m2698D();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0418a);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.f1912q >= 1) {
            C0429l.m2819C(this.f1913r.m175362f(), this.f1914s, arrayList, arrayList2, 0, 1, true, this.f1909n);
        }
        if (z3) {
            m2520R0(this.f1912q, true);
        }
        for (Fragment fragment : this.f1898c.m2791l()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c0418a.m2702H(fragment.mContainerId)) {
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
    public List<Fragment> m2590t0() {
        return this.f1898c.m2793n();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m2591t1(@NonNull Fragment fragment) {
        ViewGroup viewGroupM2581q0 = m2581q0(fragment);
        if (viewGroupM2581q0 == null || fragment.getNextAnim() <= 0) {
            return;
        }
        if (viewGroupM2581q0.getTag(udc0.f178518c) == null) {
            viewGroupM2581q0.setTag(udc0.f178518c, fragment);
        }
        ((Fragment) viewGroupM2581q0.getTag(udc0.f178518c)).setNextAnim(fragment.getNextAnim());
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
            q5j<?> q5jVar = this.f1913r;
            if (q5jVar != null) {
                sb.append(q5jVar.getClass().getSimpleName());
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
    public final void m2592u(@NonNull Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0421d.d dVarM2739b = C0421d.m2739b(this.f1913r.m175362f(), fragment, !fragment.mHidden);
            if (dVarM2739b == null || (animator = dVarM2739b.f2051b) == null) {
                if (dVarM2739b != null) {
                    fragment.mView.startAnimation(dVarM2739b.f2050a);
                    dVarM2739b.f2050a.start();
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
                    dVarM2739b.f2051b.addListener(new C0397h(viewGroup, view, fragment));
                }
                dVarM2739b.f2051b.start();
            }
        }
        m2495E0(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    @NonNull
    /* JADX INFO: renamed from: u0 */
    public q5j<?> m2593u0() {
        return this.f1913r;
    }

    /* JADX INFO: renamed from: u1 */
    public void m2594u1(@NonNull Fragment fragment) {
        if (m2481G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public C0425h m2595v(@NonNull Fragment fragment) {
        C0425h c0425hM2792m = this.f1898c.m2792m(fragment.mWho);
        if (c0425hM2792m != null) {
            return c0425hM2792m;
        }
        C0425h c0425h = new C0425h(this.f1910o, this.f1898c, fragment);
        c0425h.m2771o(this.f1913r.m175362f().getClassLoader());
        c0425h.m2777u(this.f1912q);
        return c0425h;
    }

    @NonNull
    /* JADX INFO: renamed from: v0 */
    public LayoutInflater.Factory2 m2596v0() {
        return this.f1901f;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m2597v1() {
        Iterator<C0425h> it = this.f1898c.m2790k().iterator();
        while (it.hasNext()) {
            m2530W0(it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2598w(@NonNull Fragment fragment) {
        fragment.performDestroyView();
        this.f1910o.m2754n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo2990o(null);
        fragment.mInLayout = false;
    }

    @NonNull
    /* JADX INFO: renamed from: w0 */
    public C0424g m2599w0() {
        return this.f1910o;
    }

    /* JADX INFO: renamed from: w1 */
    public final void m2600w1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new mzv("FragmentManager"));
        q5j<?> q5jVar = this.f1913r;
        if (q5jVar != null) {
            try {
                q5jVar.mo2472h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            m2529W("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2601x(@NonNull Fragment fragment) {
        if (m2481G0(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m2481G0(2)) {
                fragment.toString();
            }
            this.f1898c.m2798s(fragment);
            if (m2500H0(fragment)) {
                this.f1885D = true;
            }
            m2591t1(fragment);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x0 */
    public Fragment m2602x0() {
        return this.f1915t;
    }

    /* JADX INFO: renamed from: x1 */
    public void m2603x1(@NonNull AbstractC0401l abstractC0401l) {
        this.f1910o.m2756p(abstractC0401l);
    }

    /* JADX INFO: renamed from: y */
    public void m2604y() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2651j(false);
        m2521S(4);
    }

    @Nullable
    /* JADX INFO: renamed from: y0 */
    public Fragment m2605y0() {
        return this.f1916u;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m2606y1() {
        synchronized (this.f1896a) {
            try {
                if (this.f1896a.isEmpty()) {
                    this.f1903h.setEnabled(m2569m0() > 0 && m2504J0(this.f1915t));
                } else {
                    this.f1903h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m2607z() {
        this.f1886E = false;
        this.f1887F = false;
        this.f1894M.m2651j(false);
        m2521S(0);
    }

    @NonNull
    /* JADX INFO: renamed from: z0 */
    public ovf0 m2608z0() {
        ovf0 ovf0Var = this.f1919x;
        if (ovf0Var != null) {
            return ovf0Var;
        }
        Fragment fragment = this.f1915t;
        return fragment != null ? fragment.mFragmentManager.m2608z0() : this.f1920y;
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C0389a();
        int mRequestCode;
        String mWho;

        /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C0389a implements Parcelable.Creator<LaunchedFragmentInfo> {
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
