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
import androidx.fragment.app.AbstractC0428k;
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
import p153l.j4w;
import p153l.ker;
import p153l.kkl0;
import p153l.p01;
import p153l.wtq0;
import p153l.x5j;
import p153l.xtq0;
import p153l.y3g0;
import p153l.yn80;
import p153l.ypg0;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<x5j> implements y3g0 {

    /* JADX INFO: renamed from: a */
    public final Lifecycle f3305a;

    /* JADX INFO: renamed from: b */
    public final FragmentManager f3306b;

    /* JADX INFO: renamed from: c */
    public final j4w<Fragment> f3307c;

    /* JADX INFO: renamed from: d */
    public final j4w<Fragment.SavedState> f3308d;

    /* JADX INFO: renamed from: e */
    public final j4w<Integer> f3309e;

    /* JADX INFO: renamed from: f */
    public FragmentMaxLifecycleEnforcer f3310f;

    /* JADX INFO: renamed from: g */
    public C0731d f3311g;

    /* JADX INFO: renamed from: h */
    public boolean f3312h;

    /* JADX INFO: renamed from: i */
    public boolean f3313i;

    public class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: a */
        public ViewPager2.AbstractC0742i f3314a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0573i f3315b;

        /* JADX INFO: renamed from: c */
        public LifecycleEventObserver f3316c;

        /* JADX INFO: renamed from: d */
        public ViewPager2 f3317d;

        /* JADX INFO: renamed from: e */
        public long f3318e = -1;

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        public class C0726a extends ViewPager2.AbstractC0742i {
            public C0726a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
            public void onPageScrollStateChanged(int i) {
                FragmentMaxLifecycleEnforcer.this.m4232d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
            public void onPageSelected(int i) {
                FragmentMaxLifecycleEnforcer.this.m4232d(false);
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        public class C0727b extends AbstractC0730c {
            public C0727b() {
                super();
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC0730c, androidx.recyclerview.widget.RecyclerView.AbstractC0573i
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.m4232d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final ViewPager2 m4229a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            xtq0.m213103a("Expected ViewPager2 instance. Got: ", parent);
            return null;
        }

        /* JADX INFO: renamed from: b */
        public void m4230b(@NonNull RecyclerView recyclerView) {
            this.f3317d = m4229a(recyclerView);
            C0726a c0726a = new C0726a();
            this.f3314a = c0726a;
            this.f3317d.m4249g(c0726a);
            C0727b c0727b = new C0727b();
            this.f3315b = c0727b;
            FragmentStateAdapter.this.registerAdapterDataObserver(c0727b);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.m4232d(false);
                }
            };
            this.f3316c = lifecycleEventObserver;
            FragmentStateAdapter.this.f3305a.mo2967a(lifecycleEventObserver);
        }

        /* JADX INFO: renamed from: c */
        public void m4231c(@NonNull RecyclerView recyclerView) {
            m4229a(recyclerView).m4256n(this.f3314a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f3315b);
            FragmentStateAdapter.this.f3305a.mo2970d(this.f3316c);
            this.f3317d = null;
        }

        /* JADX INFO: renamed from: d */
        public void m4232d(boolean z) {
            int currentItem;
            Fragment fragmentM143459e;
            if (FragmentStateAdapter.this.m4224S() || this.f3317d.getScrollState() != 0 || FragmentStateAdapter.this.f3307c.m143462k() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f3317d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f3318e || z) && (fragmentM143459e = FragmentStateAdapter.this.f3307c.m143459e(itemId)) != null && fragmentM143459e.isAdded()) {
                this.f3318e = itemId;
                AbstractC0428k abstractC0428kM2568m = FragmentStateAdapter.this.f3306b.m2568m();
                ArrayList arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.f3307c.m143467p(); i++) {
                    long jM143463l = FragmentStateAdapter.this.f3307c.m143463l(i);
                    Fragment fragmentM143468q = FragmentStateAdapter.this.f3307c.m143468q(i);
                    if (fragmentM143468q.isAdded()) {
                        if (jM143463l != this.f3318e) {
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            abstractC0428kM2568m.mo2717w(fragmentM143468q, state);
                            arrayList.add(FragmentStateAdapter.this.f3311g.m4233a(fragmentM143468q, state));
                        } else {
                            fragment = fragmentM143468q;
                        }
                        fragmentM143468q.setMenuVisibility(jM143463l == this.f3318e);
                    }
                }
                if (fragment != null) {
                    Lifecycle.State state2 = Lifecycle.State.RESUMED;
                    abstractC0428kM2568m.mo2717w(fragment, state2);
                    arrayList.add(FragmentStateAdapter.this.f3311g.m4233a(fragment, state2));
                }
                if (abstractC0428kM2568m.mo2715q()) {
                    return;
                }
                abstractC0428kM2568m.mo2710k();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FragmentStateAdapter.this.f3311g.m4234b((List) it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public class C0728a extends FragmentManager.AbstractC0401l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f3322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FrameLayout f3323b;

        public C0728a(Fragment fragment, FrameLayout frameLayout) {
            this.f3322a = fragment;
            this.f3323b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC0401l
        /* JADX INFO: renamed from: m */
        public void mo2634m(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
            if (fragment == this.f3322a) {
                fragmentManager.m2603x1(this);
                FragmentStateAdapter.this.m4227y(view, this.f3323b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public class RunnableC0729b implements Runnable {
        public RunnableC0729b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f3312h = false;
            fragmentStateAdapter.m4212E();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    public static class C0731d {

        /* JADX INFO: renamed from: a */
        public List<AbstractC0732e> f3326a = new CopyOnWriteArrayList();

        /* JADX INFO: renamed from: a */
        public List<AbstractC0732e.b> m4233a(Fragment fragment, Lifecycle.State state) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0732e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4238a(fragment, state));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public void m4234b(List<AbstractC0732e.b> list) {
            Iterator<AbstractC0732e.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo4242a();
            }
        }

        /* JADX INFO: renamed from: c */
        public List<AbstractC0732e.b> m4235c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0732e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4239b(fragment));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public List<AbstractC0732e.b> m4236d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0732e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4240c(fragment));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: e */
        public List<AbstractC0732e.b> m4237e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<AbstractC0732e> it = this.f3326a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m4241d(fragment));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e */
    public static abstract class AbstractC0732e {

        /* JADX INFO: renamed from: a */
        @NonNull
        public static final b f3327a = new a();

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e$a */
        public class a implements b {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC0732e.b
            /* JADX INFO: renamed from: a */
            public void mo4242a() {
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e$b */
        public interface b {
            /* JADX INFO: renamed from: a */
            void mo4242a();
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public b m4238a(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
            return f3327a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public b m4239b(@NonNull Fragment fragment) {
            return f3327a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public b m4240c(@NonNull Fragment fragment) {
            return f3327a;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m4241d(@NonNull Fragment fragment) {
            return f3327a;
        }
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.f3307c = new j4w<>();
        this.f3308d = new j4w<>();
        this.f3309e = new j4w<>();
        this.f3311g = new C0731d();
        this.f3312h = false;
        this.f3313i = false;
        this.f3306b = fragmentManager;
        this.f3305a = lifecycle;
        super.setHasStableIds(true);
    }

    @NonNull
    /* JADX INFO: renamed from: C */
    public static String m4207C(@NonNull String str, long j) {
        return str + j;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m4208G(@NonNull String str, @NonNull String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* JADX INFO: renamed from: N */
    public static long m4209N(@NonNull String str, @NonNull String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    @NonNull
    /* JADX INFO: renamed from: A */
    public abstract Fragment mo4210A(int i);

    /* JADX INFO: renamed from: D */
    public final void m4211D(int i) {
        long itemId = getItemId(i);
        if (this.f3307c.m143456b(itemId)) {
            return;
        }
        Fragment fragmentMo4210A = mo4210A(i);
        fragmentMo4210A.setInitialSavedState(this.f3308d.m143459e(itemId));
        this.f3307c.m143464m(itemId, fragmentMo4210A);
    }

    /* JADX INFO: renamed from: E */
    public void m4212E() {
        if (!this.f3313i || m4224S()) {
            return;
        }
        p01 p01Var = new p01();
        for (int i = 0; i < this.f3307c.m143467p(); i++) {
            long jM143463l = this.f3307c.m143463l(i);
            if (!mo4228z(jM143463l)) {
                p01Var.add(Long.valueOf(jM143463l));
                this.f3309e.m143465n(jM143463l);
            }
        }
        if (!this.f3312h) {
            this.f3313i = false;
            for (int i2 = 0; i2 < this.f3307c.m143467p(); i2++) {
                long jM143463l2 = this.f3307c.m143463l(i2);
                if (!m4213F(jM143463l2)) {
                    p01Var.add(Long.valueOf(jM143463l2));
                }
            }
        }
        Iterator<E> it = p01Var.iterator();
        while (it.hasNext()) {
            m4221P(((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4213F(long j) {
        View view;
        if (this.f3309e.m143456b(j)) {
            return true;
        }
        Fragment fragmentM143459e = this.f3307c.m143459e(j);
        return (fragmentM143459e == null || (view = fragmentM143459e.getView()) == null || view.getParent() == null) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public final Long m4214H(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.f3309e.m143467p(); i2++) {
            if (this.f3309e.m143468q(i2).intValue() == i) {
                if (lValueOf != null) {
                    wtq0.m207906a("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(this.f3309e.m143463l(i2));
            }
        }
        return lValueOf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(@NonNull x5j x5jVar, int i) {
        long itemId = x5jVar.getItemId();
        int id = x5jVar.m209387b().getId();
        Long lM4214H = m4214H(id);
        if (lM4214H != null && lM4214H.longValue() != itemId) {
            m4221P(lM4214H.longValue());
            this.f3309e.m143465n(lM4214H.longValue());
        }
        this.f3309e.m143464m(itemId, Integer.valueOf(id));
        m4211D(i);
        if (kkl0.m150133O(x5jVar.m209387b())) {
            m4220O(x5jVar);
        }
        m4212E();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final x5j onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return x5j.m209386a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final boolean onFailedToRecycleView(@NonNull x5j x5jVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void onViewAttachedToWindow(@NonNull x5j x5jVar) {
        m4220O(x5jVar);
        m4212E();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@NonNull x5j x5jVar) {
        Long lM4214H = m4214H(x5jVar.m209387b().getId());
        if (lM4214H != null) {
            m4221P(lM4214H.longValue());
            this.f3309e.m143465n(lM4214H.longValue());
        }
    }

    /* JADX INFO: renamed from: O */
    public void m4220O(@NonNull final x5j x5jVar) {
        Fragment fragmentM143459e = this.f3307c.m143459e(x5jVar.getItemId());
        if (fragmentM143459e == null) {
            wtq0.m207906a("Design assumption violated.");
            return;
        }
        FrameLayout frameLayoutM209387b = x5jVar.m209387b();
        View view = fragmentM143459e.getView();
        if (!fragmentM143459e.isAdded() && view != null) {
            wtq0.m207906a("Design assumption violated.");
            return;
        }
        if (fragmentM143459e.isAdded() && view == null) {
            m4223R(fragmentM143459e, frameLayoutM209387b);
            return;
        }
        if (fragmentM143459e.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutM209387b) {
                m4227y(view, frameLayoutM209387b);
                return;
            }
            return;
        }
        if (fragmentM143459e.isAdded()) {
            m4227y(view, frameLayoutM209387b);
            return;
        }
        if (m4224S()) {
            if (this.f3306b.m2497F0()) {
                return;
            }
            this.f3305a.mo2967a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.m4224S()) {
                        return;
                    }
                    kerVar.getLifecycle().mo2970d(this);
                    if (kkl0.m150133O(x5jVar.m209387b())) {
                        FragmentStateAdapter.this.m4220O(x5jVar);
                    }
                }
            });
            return;
        }
        m4223R(fragmentM143459e, frameLayoutM209387b);
        List<AbstractC0732e.b> listM4235c = this.f3311g.m4235c(fragmentM143459e);
        try {
            fragmentM143459e.setMenuVisibility(false);
            this.f3306b.m2568m().m2807e(fragmentM143459e, "f" + x5jVar.getItemId()).mo2717w(fragmentM143459e, Lifecycle.State.STARTED).mo2710k();
            this.f3310f.m4232d(false);
        } finally {
            this.f3311g.m4234b(listM4235c);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m4221P(long j) {
        ViewParent parent;
        Fragment fragmentM143459e = this.f3307c.m143459e(j);
        if (fragmentM143459e == null) {
            return;
        }
        if (fragmentM143459e.getView() != null && (parent = fragmentM143459e.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!mo4228z(j)) {
            this.f3308d.m143465n(j);
        }
        if (!fragmentM143459e.isAdded()) {
            this.f3307c.m143465n(j);
            return;
        }
        if (m4224S()) {
            this.f3313i = true;
            return;
        }
        if (fragmentM143459e.isAdded() && mo4228z(j)) {
            List<AbstractC0732e.b> listM4237e = this.f3311g.m4237e(fragmentM143459e);
            Fragment.SavedState savedStateM2573n1 = this.f3306b.m2573n1(fragmentM143459e);
            this.f3311g.m4234b(listM4237e);
            this.f3308d.m143464m(j, savedStateM2573n1);
        }
        List<AbstractC0732e.b> listM4236d = this.f3311g.m4236d(fragmentM143459e);
        try {
            this.f3306b.m2568m().mo2716r(fragmentM143459e).mo2710k();
            this.f3307c.m143465n(j);
        } finally {
            this.f3311g.m4234b(listM4236d);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m4222Q() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final RunnableC0729b runnableC0729b = new RunnableC0729b();
        this.f3305a.mo2967a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnableC0729b);
                    kerVar.getLifecycle().mo2970d(this);
                }
            }
        });
        handler.postDelayed(runnableC0729b, 10000L);
    }

    /* JADX INFO: renamed from: R */
    public final void m4223R(Fragment fragment, @NonNull FrameLayout frameLayout) {
        this.f3306b.m2547e1(new C0728a(fragment, frameLayout), false);
    }

    /* JADX INFO: renamed from: S */
    public boolean m4224S() {
        return this.f3306b.m2508L0();
    }

    @Override // p153l.y3g0
    @NonNull
    /* JADX INFO: renamed from: a */
    public final Parcelable mo4225a() {
        Bundle bundle = new Bundle(this.f3307c.m143467p() + this.f3308d.m143467p());
        for (int i = 0; i < this.f3307c.m143467p(); i++) {
            long jM143463l = this.f3307c.m143463l(i);
            Fragment fragmentM143459e = this.f3307c.m143459e(jM143463l);
            if (fragmentM143459e != null && fragmentM143459e.isAdded()) {
                this.f3306b.m2544d1(bundle, m4207C("f#", jM143463l), fragmentM143459e);
            }
        }
        for (int i2 = 0; i2 < this.f3308d.m143467p(); i2++) {
            long jM143463l2 = this.f3308d.m143463l(i2);
            if (mo4228z(jM143463l2)) {
                bundle.putParcelable(m4207C("s#", jM143463l2), this.f3308d.m143459e(jM143463l2));
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
        yn80.m216771a(this.f3310f == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f3310f = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.m4230b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f3310f.m4231c(recyclerView);
        this.f3310f = null;
    }

    @Override // p153l.y3g0
    /* JADX INFO: renamed from: p */
    public final void mo4226p(@NonNull Parcelable parcelable) {
        if (!this.f3308d.m143462k() || !this.f3307c.m143462k()) {
            wtq0.m207906a("Expected the adapter to be 'fresh' while restoring state.");
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m4208G(str, "f#")) {
                this.f3307c.m143464m(m4209N(str, "f#"), this.f3306b.m2578p0(bundle, str));
            } else {
                if (!m4208G(str, "s#")) {
                    ypg0.m217021a("Unexpected key in savedState: ", str);
                    return;
                }
                long jM4209N = m4209N(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (mo4228z(jM4209N)) {
                    this.f3308d.m143464m(jM4209N, savedState);
                }
            }
        }
        if (this.f3307c.m143462k()) {
            return;
        }
        this.f3313i = true;
        this.f3312h = true;
        m4212E();
        m4222Q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* JADX INFO: renamed from: y */
    public void m4227y(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            wtq0.m207906a("Design assumption violated.");
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
    public boolean mo4228z(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* JADX INFO: renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    public static abstract class AbstractC0730c extends RecyclerView.AbstractC0573i {
        public AbstractC0730c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0573i
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
