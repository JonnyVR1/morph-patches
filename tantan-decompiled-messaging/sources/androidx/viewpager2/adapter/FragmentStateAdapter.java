package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.c3j;
import p149l.gbl0;
import p149l.i01;
import p149l.jcr;
import p149l.l2w;
import p149l.pvf0;
import p149l.qhg0;
import p149l.qkq0;
import p149l.rkq0;
import p149l.tf80;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<c3j> implements pvf0 {

    /* JADX INFO: renamed from: a */
    public final Lifecycle f3305a;

    /* JADX INFO: renamed from: b */
    public final FragmentManager f3306b;

    /* JADX INFO: renamed from: c */
    public final l2w<Fragment> f3307c;

    /* JADX INFO: renamed from: d */
    public final l2w<Fragment.SavedState> f3308d;

    /* JADX INFO: renamed from: e */
    public final l2w<Integer> f3309e;

    /* JADX INFO: renamed from: f */
    public FragmentMaxLifecycleEnforcer f3310f;

    /* JADX INFO: renamed from: g */
    public C0729d f3311g;

    /* JADX INFO: renamed from: h */
    public boolean f3312h;

    /* JADX INFO: renamed from: i */
    public boolean f3313i;

    public class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: a */
        public ViewPager2.AbstractC0740i f3314a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0571i f3315b;

        /* JADX INFO: renamed from: c */
        public LifecycleEventObserver f3316c;

        /* JADX INFO: renamed from: d */
        public ViewPager2 f3317d;

        /* JADX INFO: renamed from: e */
        public long f3318e = -1;

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        public class C0724a extends ViewPager2.AbstractC0740i {
            public C0724a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
            public void onPageScrollStateChanged(int i) {
                FragmentMaxLifecycleEnforcer.this.m4230d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
            public void onPageSelected(int i) {
                FragmentMaxLifecycleEnforcer.this.m4230d(false);
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        public class C0725b extends AbstractC0728c {
            public C0725b() {
                super();
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC0728c, androidx.recyclerview.widget.RecyclerView.AbstractC0571i
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.m4230d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final ViewPager2 m4227a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            rkq0.m179764a("Expected ViewPager2 instance. Got: ", parent);
            return null;
        }

        /* JADX INFO: renamed from: b */
        public void m4228b(@NonNull RecyclerView recyclerView) {
            this.f3317d = m4227a(recyclerView);
            C0724a c0724a = new C0724a();
            this.f3314a = c0724a;
            this.f3317d.m4247g(c0724a);
            C0725b c0725b = new C0725b();
            this.f3315b = c0725b;
            FragmentStateAdapter.this.registerAdapterDataObserver(c0725b);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.m4230d(false);
                }
            };
            this.f3316c = lifecycleEventObserver;
            FragmentStateAdapter.this.f3305a.mo2966a(lifecycleEventObserver);
        }

        /* JADX INFO: renamed from: c */
        public void m4229c(@NonNull RecyclerView recyclerView) {
            m4227a(recyclerView).m4254n(this.f3314a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f3315b);
            FragmentStateAdapter.this.f3305a.mo2969d(this.f3316c);
            this.f3317d = null;
        }

        /* JADX INFO: renamed from: d */
        public void m4230d(boolean z) {
            int currentItem;
            Fragment fragmentM148311e;
            if (FragmentStateAdapter.this.m4222S() || this.f3317d.getScrollState() != 0 || FragmentStateAdapter.this.f3307c.m148314k() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f3317d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f3318e || z) && (fragmentM148311e = FragmentStateAdapter.this.f3307c.m148311e(itemId)) != null && fragmentM148311e.isAdded()) {
                this.f3318e = itemId;
                AbstractC0427k abstractC0427kM2567m = FragmentStateAdapter.this.f3306b.m2567m();
                ArrayList arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.f3307c.m148319p(); i++) {
                    long jM148315l = FragmentStateAdapter.this.f3307c.m148315l(i);
                    Fragment fragmentM148320q = FragmentStateAdapter.this.f3307c.m148320q(i);
                    if (fragmentM148320q.isAdded()) {
                        if (jM148315l != this.f3318e) {
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            abstractC0427kM2567m.mo2716w(fragmentM148320q, state);
                            arrayList.add(FragmentStateAdapter.this.f3311g.m4231a(fragmentM148320q, state));
                        } else {
                            fragment = fragmentM148320q;
                        }
                        fragmentM148320q.setMenuVisibility(jM148315l == this.f3318e);
                    }
                }
                if (fragment != null) {
                    Lifecycle.State state2 = Lifecycle.State.RESUMED;
                    abstractC0427kM2567m.mo2716w(fragment, state2);
                    arrayList.add(FragmentStateAdapter.this.f3311g.m4231a(fragment, state2));
                }
                if (abstractC0427kM2567m.mo2714q()) {
                    return;
                }
                abstractC0427kM2567m.mo2709k();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FragmentStateAdapter.this.f3311g.m4232b((List) it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public class C0726a extends FragmentManager.AbstractC0400l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f3322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FrameLayout f3323b;

        public C0726a(Fragment fragment, FrameLayout frameLayout) {
            this.f3322a = fragment;
            this.f3323b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC0400l
        /* JADX INFO: renamed from: m */
        public void mo2633m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
            if (fragment == this.f3322a) {
                fragmentManager.m2602x1(this);
                FragmentStateAdapter.this.m4225y(view, this.f3323b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public class RunnableC0727b implements Runnable {
        public RunnableC0727b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f3312h = false;
            fragmentStateAdapter.m4210E();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    public static class C0729d {

        /* JADX INFO: renamed from: a */
        public List<AbstractC0730e> f3326a = new CopyOnWriteArrayList();

        /* JADX INFO: renamed from: a */
        public List<AbstractC0730e.b> m4231a(Fragment fragment, Lifecycle.State state) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0730e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4236a(fragment, state));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public void m4232b(List<AbstractC0730e.b> list) {
            Iterator<AbstractC0730e.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo4240a();
            }
        }

        /* JADX INFO: renamed from: c */
        public List<AbstractC0730e.b> m4233c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0730e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4237b(fragment));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public List<AbstractC0730e.b> m4234d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0730e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4238c(fragment));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        public List<AbstractC0730e.b> m4235e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0730e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4239d(fragment));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e */
    public static abstract class AbstractC0730e {

        /* JADX INFO: renamed from: a */
        @NonNull
        public static final b f3327a = new a();

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e$a */
        public class a implements b {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC0730e.b
            /* JADX INFO: renamed from: a */
            public void mo4240a() {
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            void mo4240a();
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public b m4236a(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
            return f3327a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public b m4237b(@NonNull Fragment fragment) {
            return f3327a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public b m4238c(@NonNull Fragment fragment) {
            return f3327a;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m4239d(@NonNull Fragment fragment) {
            return f3327a;
        }
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.f3307c = new l2w<>();
        this.f3308d = new l2w<>();
        this.f3309e = new l2w<>();
        this.f3311g = new C0729d();
        this.f3312h = false;
        this.f3313i = false;
        this.f3306b = fragmentManager;
        this.f3305a = lifecycle;
        super.setHasStableIds(true);
    }

    @NonNull
    /* JADX INFO: renamed from: C */
    public static String m4205C(@NonNull String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m4206G(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* JADX INFO: renamed from: N */
    public static long m4207N(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public abstract Fragment mo4208A(int i);

    /* JADX INFO: renamed from: D */
    public final void m4209D(int i) {
        long itemId = getItemId(i);
        if (this.f3307c.m148308b(itemId)) {
            return;
        }
        Fragment fragmentMo4208A = mo4208A(i);
        fragmentMo4208A.setInitialSavedState(this.f3308d.m148311e(itemId));
        this.f3307c.m148316m(itemId, fragmentMo4208A);
    }

    /* JADX INFO: renamed from: E */
    public void m4210E() {
        if (!this.f3313i || m4222S()) {
            return;
        }
        i01 i01Var = new i01();
        for (int i = 0; i < this.f3307c.m148319p(); i++) {
            long jM148315l = this.f3307c.m148315l(i);
            if (!mo4226z(jM148315l)) {
                i01Var.add(Long.valueOf(jM148315l));
                this.f3309e.m148317n(jM148315l);
            }
        }
        if (!this.f3312h) {
            this.f3313i = false;
            for (int i2 = 0; i2 < this.f3307c.m148319p(); i2++) {
                long jM148315l2 = this.f3307c.m148315l(i2);
                if (!m4211F(jM148315l2)) {
                    i01Var.add(Long.valueOf(jM148315l2));
                }
            }
        }
        Iterator<E> it = i01Var.iterator();
        while (it.hasNext()) {
            m4219P(((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4211F(long j) {
        View view;
        if (this.f3309e.m148308b(j)) {
            return true;
        }
        Fragment fragmentM148311e = this.f3307c.m148311e(j);
        return (fragmentM148311e == null || (view = fragmentM148311e.getView()) == null || view.getParent() == null) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public final Long m4212H(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.f3309e.m148319p(); i2++) {
            if (this.f3309e.m148320q(i2).intValue() == i) {
                if (lValueOf != null) {
                    qkq0.m175383a("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(this.f3309e.m148315l(i2));
            }
        }
        return lValueOf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@NonNull c3j c3jVar, int i) {
        long itemId = c3jVar.getItemId();
        int id = c3jVar.m105030b().getId();
        Long lM4212H = m4212H(id);
        if (lM4212H != null && lM4212H.longValue() != itemId) {
            m4219P(lM4212H.longValue());
            this.f3309e.m148317n(lM4212H.longValue());
        }
        this.f3309e.m148316m(itemId, Integer.valueOf(id));
        m4209D(i);
        if (gbl0.m125170O(c3jVar.m105030b())) {
            m4218O(c3jVar);
        }
        m4210E();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final c3j onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return c3j.m105029a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(@NonNull c3j c3jVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@NonNull c3j c3jVar) {
        m4218O(c3jVar);
        m4210E();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@NonNull c3j c3jVar) {
        Long lM4212H = m4212H(c3jVar.m105030b().getId());
        if (lM4212H != null) {
            m4219P(lM4212H.longValue());
            this.f3309e.m148317n(lM4212H.longValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public void m4218O(@NonNull final c3j c3jVar) {
        Fragment fragmentM148311e = this.f3307c.m148311e(c3jVar.getItemId());
        if (fragmentM148311e == null) {
            qkq0.m175383a("Design assumption violated.");
            return;
        }
        FrameLayout frameLayoutM105030b = c3jVar.m105030b();
        View view = fragmentM148311e.getView();
        if (!fragmentM148311e.isAdded() && view != null) {
            qkq0.m175383a("Design assumption violated.");
            return;
        }
        if (fragmentM148311e.isAdded() && view == null) {
            m4221R(fragmentM148311e, frameLayoutM105030b);
            return;
        }
        if (fragmentM148311e.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutM105030b) {
                m4225y(view, frameLayoutM105030b);
                return;
            }
            return;
        }
        if (fragmentM148311e.isAdded()) {
            m4225y(view, frameLayoutM105030b);
            return;
        }
        if (m4222S()) {
            if (this.f3306b.m2496F0()) {
                return;
            }
            this.f3305a.mo2966a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.m4222S()) {
                        return;
                    }
                    jcrVar.getLifecycle().mo2969d(this);
                    if (gbl0.m125170O(c3jVar.m105030b())) {
                        FragmentStateAdapter.this.m4218O(c3jVar);
                    }
                }
            });
            return;
        }
        m4221R(fragmentM148311e, frameLayoutM105030b);
        List<AbstractC0730e.b> listM4233c = this.f3311g.m4233c(fragmentM148311e);
        try {
            fragmentM148311e.setMenuVisibility(false);
            this.f3306b.m2567m().m2806e(fragmentM148311e, "f" + c3jVar.getItemId()).mo2716w(fragmentM148311e, Lifecycle.State.STARTED).mo2709k();
            this.f3310f.m4230d(false);
        } finally {
            this.f3311g.m4232b(listM4233c);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m4219P(long j) {
        ViewParent parent;
        Fragment fragmentM148311e = this.f3307c.m148311e(j);
        if (fragmentM148311e == null) {
            return;
        }
        if (fragmentM148311e.getView() != null && (parent = fragmentM148311e.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!mo4226z(j)) {
            this.f3308d.m148317n(j);
        }
        if (!fragmentM148311e.isAdded()) {
            this.f3307c.m148317n(j);
            return;
        }
        if (m4222S()) {
            this.f3313i = true;
            return;
        }
        if (fragmentM148311e.isAdded() && mo4226z(j)) {
            List<AbstractC0730e.b> listM4235e = this.f3311g.m4235e(fragmentM148311e);
            Fragment.SavedState savedStateM2572n1 = this.f3306b.m2572n1(fragmentM148311e);
            this.f3311g.m4232b(listM4235e);
            this.f3308d.m148316m(j, savedStateM2572n1);
        }
        List<AbstractC0730e.b> listM4234d = this.f3311g.m4234d(fragmentM148311e);
        try {
            this.f3306b.m2567m().mo2715r(fragmentM148311e).mo2709k();
            this.f3307c.m148317n(j);
        } finally {
            this.f3311g.m4232b(listM4234d);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m4220Q() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final RunnableC0727b runnableC0727b = new RunnableC0727b();
        this.f3305a.mo2966a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnableC0727b);
                    jcrVar.getLifecycle().mo2969d(this);
                }
            }
        });
        handler.postDelayed(runnableC0727b, 10000L);
    }

    /* JADX INFO: renamed from: R */
    public final void m4221R(Fragment fragment, @NonNull FrameLayout frameLayout) {
        this.f3306b.m2546e1(new C0726a(fragment, frameLayout), false);
    }

    /* JADX INFO: renamed from: S */
    public boolean m4222S() {
        return this.f3306b.m2507L0();
    }

    @Override // p149l.pvf0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final Parcelable mo4223a() {
        Bundle bundle = new Bundle(this.f3307c.m148319p() + this.f3308d.m148319p());
        for (int i = 0; i < this.f3307c.m148319p(); i++) {
            long jM148315l = this.f3307c.m148315l(i);
            Fragment fragmentM148311e = this.f3307c.m148311e(jM148315l);
            if (fragmentM148311e != null && fragmentM148311e.isAdded()) {
                this.f3306b.m2543d1(bundle, m4205C("f#", jM148315l), fragmentM148311e);
            }
        }
        for (int i2 = 0; i2 < this.f3308d.m148319p(); i2++) {
            long jM148315l2 = this.f3308d.m148315l(i2);
            if (mo4226z(jM148315l2)) {
                bundle.putParcelable(m4205C("s#", jM148315l2), this.f3308d.m148311e(jM148315l2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        tf80.m188654a(this.f3310f == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f3310f = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.m4228b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f3310f.m4229c(recyclerView);
        this.f3310f = null;
    }

    @Override // p149l.pvf0
    /* JADX INFO: renamed from: p */
    public final void mo4224p(@NonNull Parcelable parcelable) {
        if (!this.f3308d.m148314k() || !this.f3307c.m148314k()) {
            qkq0.m175383a("Expected the adapter to be 'fresh' while restoring state.");
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m4206G(str, "f#")) {
                this.f3307c.m148316m(m4207N(str, "f#"), this.f3306b.m2577p0(bundle, str));
            } else {
                if (!m4206G(str, "s#")) {
                    qhg0.m174539a("Unexpected key in savedState: ", str);
                    return;
                }
                long jM4207N = m4207N(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (mo4226z(jM4207N)) {
                    this.f3308d.m148316m(jM4207N, savedState);
                }
            }
        }
        if (this.f3307c.m148314k()) {
            return;
        }
        this.f3313i = true;
        this.f3312h = true;
        m4210E();
        m4220Q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* JADX INFO: renamed from: y */
    public void m4225y(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            qkq0.m175383a("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: renamed from: z */
    public boolean mo4226z(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    public static abstract class AbstractC0728c extends RecyclerView.AbstractC0571i {
        public AbstractC0728c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0571i
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            onChanged();
        }
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }
}
