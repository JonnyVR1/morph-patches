package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.lifecycle.C0482k;
import androidx.lifecycle.C0489r;
import androidx.lifecycle.C0491t;
import androidx.lifecycle.InterfaceC0476e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC0495a;
import androidx.savedstate.C0679a;
import com.p051p1.mobile.android.app.Act;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p153l.c60;
import p153l.cdj;
import p153l.d60;
import p153l.j3f0;
import p153l.jj5;
import p153l.k5j;
import p153l.ker;
import p153l.l5j;
import p153l.m5j;
import p153l.o5j;
import p153l.o9r;
import p153l.oyd0;
import p153l.pml0;
import p153l.q5j;
import p153l.qml0;
import p153l.r5j;
import p153l.rml0;
import p153l.ryd0;
import p153l.s120;
import p153l.sll0;
import p153l.tll0;
import p153l.u50;
import p153l.v1d0;
import p153l.w50;
import p153l.wmw;
import p153l.wtq0;
import p153l.x50;
import p153l.xtq0;
import p153l.y5j;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ker, tll0, InterfaceC0476e, ryd0 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C0382i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;

    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @LayoutRes
    private int mContentLayoutId;
    private C0491t.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    q5j<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0482k mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC0383j> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    oyd0 mSavedStateRegistryController;

    @Nullable
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @Nullable
    y5j mViewLifecycleOwner;
    s120<ker> mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String str, @Nullable Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$a */
    public class RunnableC0374a implements Runnable {
        public RunnableC0374a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$b */
    public class RunnableC0375b implements Runnable {
        public RunnableC0375b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$c */
    public class RunnableC0376c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SpecialEffectsController f1839a;

        public RunnableC0376c(SpecialEffectsController specialEffectsController) {
            this.f1839a = specialEffectsController;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1839a.m2672g();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$d */
    public class C0377d extends o5j {
        public C0377d() {
        }

        @Override // p153l.o5j
        @Nullable
        /* JADX INFO: renamed from: c */
        public View mo2459c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            m5j.m157106a("Fragment ", Fragment.this, " does not have a view");
            return null;
        }

        @Override // p153l.o5j
        /* JADX INFO: renamed from: d */
        public boolean mo2460d() {
            return Fragment.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$e */
    public class C0378e implements cdj<Void, ActivityResultRegistry> {
        public C0378e() {
        }

        @Override // p153l.cdj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r2) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof d60 ? ((d60) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$f */
    public class C0379f implements cdj<Void, ActivityResultRegistry> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f1843a;

        public C0379f(ActivityResultRegistry activityResultRegistry) {
            this.f1843a = activityResultRegistry;
        }

        @Override // p153l.cdj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r1) {
            return this.f1843a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$g */
    public class C0380g extends AbstractC0383j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cdj f1845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicReference f1846b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x50 f1847c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ w50 f1848d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0380g(cdj cdjVar, AtomicReference atomicReference, x50 x50Var, w50 w50Var) {
            super(null);
            this.f1845a = cdjVar;
            this.f1846b = atomicReference;
            this.f1847c = x50Var;
            this.f1848d = w50Var;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0383j
        /* JADX INFO: renamed from: a */
        public void mo2466a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f1846b.set(((ActivityResultRegistry) this.f1845a.apply(null)).m213j(strGenerateActivityResultKey, Fragment.this, this.f1847c, this.f1848d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$h */
    public class C0381h<I> extends c60<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f1850a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x50 f1851b;

        public C0381h(AtomicReference atomicReference, x50 x50Var) {
            this.f1850a = atomicReference;
            this.f1851b = x50Var;
        }

        @Override // p153l.c60
        @NonNull
        /* JADX INFO: renamed from: a */
        public x50<I, ?> mo216a() {
            return this.f1851b;
        }

        @Override // p153l.c60
        /* JADX INFO: renamed from: c */
        public void mo217c(I i, @Nullable u50 u50Var) {
            c60 c60Var = (c60) this.f1850a.get();
            if (c60Var != null) {
                c60Var.mo217c(i, u50Var);
            } else {
                wtq0.m207906a("Operation cannot be started before fragment is in created state");
            }
        }

        @Override // p153l.c60
        /* JADX INFO: renamed from: d */
        public void mo218d() {
            c60 c60Var = (c60) this.f1850a.getAndSet(null);
            if (c60Var != null) {
                c60Var.mo218d();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$i */
    public static class C0382i {

        /* JADX INFO: renamed from: a */
        public View f1853a;

        /* JADX INFO: renamed from: b */
        public Animator f1854b;

        /* JADX INFO: renamed from: c */
        public int f1855c;

        /* JADX INFO: renamed from: d */
        public int f1856d;

        /* JADX INFO: renamed from: e */
        public ArrayList<String> f1857e;

        /* JADX INFO: renamed from: f */
        public ArrayList<String> f1858f;

        /* JADX INFO: renamed from: g */
        public Object f1859g = null;

        /* JADX INFO: renamed from: h */
        public Object f1860h;

        /* JADX INFO: renamed from: i */
        public Object f1861i;

        /* JADX INFO: renamed from: j */
        public Object f1862j;

        /* JADX INFO: renamed from: k */
        public Object f1863k;

        /* JADX INFO: renamed from: l */
        public Object f1864l;

        /* JADX INFO: renamed from: m */
        public Boolean f1865m;

        /* JADX INFO: renamed from: n */
        public Boolean f1866n;

        /* JADX INFO: renamed from: o */
        public j3f0 f1867o;

        /* JADX INFO: renamed from: p */
        public j3f0 f1868p;

        /* JADX INFO: renamed from: q */
        public float f1869q;

        /* JADX INFO: renamed from: r */
        public View f1870r;

        /* JADX INFO: renamed from: s */
        public boolean f1871s;

        /* JADX INFO: renamed from: t */
        public InterfaceC0384k f1872t;

        /* JADX INFO: renamed from: u */
        public boolean f1873u;

        public C0382i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f1860h = obj;
            this.f1861i = null;
            this.f1862j = obj;
            this.f1863k = null;
            this.f1864l = obj;
            this.f1867o = null;
            this.f1868p = null;
            this.f1869q = 1.0f;
            this.f1870r = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$k */
    public interface InterfaceC0384k {
        /* JADX INFO: renamed from: a */
        void mo2467a();

        /* JADX INFO: renamed from: b */
        void mo2468b();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new r5j();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0374a();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new s120<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private C0382i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0382i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0482k(this);
        this.mSavedStateRegistryController = oyd0.m169844a(this);
        this.mDefaultFactory = null;
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragmentNewInstance = C0422e.loadFragmentClass(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragmentNewInstance;
            }
            bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
            fragmentNewInstance.setArguments(bundle);
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            k5j.m148398a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (java.lang.InstantiationException e2) {
            k5j.m148398a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            k5j.m148398a(str, ": could not find Fragment constructor", e3);
            return null;
        } catch (InvocationTargetException e4) {
            k5j.m148398a(str, ": calling Fragment constructor caused an exception", e4);
            return null;
        }
    }

    @NonNull
    private <I, O> c60<I> prepareCallInternal(@NonNull x50<I, O> x50Var, @NonNull cdj<Void, ActivityResultRegistry> cdjVar, @NonNull w50<O> w50Var) {
        if (this.mState > 1) {
            wmw.m207134a("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new C0380g(cdjVar, atomicReference, x50Var, w50Var));
        return new C0381h(atomicReference, x50Var);
    }

    private void registerOnPreAttachListener(@NonNull AbstractC0383j abstractC0383j) {
        if (this.mState >= 0) {
            abstractC0383j.mo2466a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC0383j);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0382i c0382i = this.mAnimationInfo;
        InterfaceC0384k interfaceC0384k = null;
        if (c0382i != null) {
            c0382i.f1871s = false;
            InterfaceC0384k interfaceC0384k2 = c0382i.f1872t;
            c0382i.f1872t = null;
            interfaceC0384k = interfaceC0384k2;
        }
        if (interfaceC0384k != null) {
            interfaceC0384k.mo2468b();
            return;
        }
        if (!FragmentManager.f1881P || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController specialEffectsControllerM2664n = SpecialEffectsController.m2664n(viewGroup, fragmentManager);
        specialEffectsControllerM2664n.m2679p();
        if (z) {
            this.mHost.m175363g().post(new RunnableC0376c(specialEffectsControllerM2664n));
        } else {
            specialEffectsControllerM2664n.m2672g();
        }
    }

    @NonNull
    public o5j createFragmentContainer() {
        return new C0377d();
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC0495a.m3108b(this).mo3086a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m2529W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m2561j0(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        q5j<?> q5jVar = this.mHost;
        if (q5jVar == null) {
            return null;
        }
        return (FragmentActivity) q5jVar.m175361e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null || (bool = c0382i.f1866n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null || (bool = c0382i.f1865m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1853a;
    }

    public Animator getAnimator() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1854b;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        wmw.m207134a("Fragment ", this, " has not been attached yet.");
        return null;
    }

    @Nullable
    public Context getContext() {
        q5j<?> q5jVar = this.mHost;
        if (q5jVar == null) {
            return null;
        }
        return q5jVar.m175362f();
    }

    @Override // androidx.lifecycle.InterfaceC0476e
    @NonNull
    public C0491t.c getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            wtq0.m207906a("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && FragmentManager.m2481G0(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C0489r(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @Nullable
    public Object getEnterTransition() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1859g;
    }

    public j3f0 getEnterTransitionCallback() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1867o;
    }

    @Nullable
    public Object getExitTransition() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1861i;
    }

    public j3f0 getExitTransitionCallback() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1868p;
    }

    public View getFocusedView() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1870r;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        q5j<?> q5jVar = this.mHost;
        if (q5jVar == null) {
            return null;
        }
        return q5jVar.mo2473i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        q5j<?> q5jVar = this.mHost;
        if (q5jVar == null) {
            wtq0.m207906a("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        LayoutInflater layoutInflaterMo2474j = q5jVar.mo2474j();
        o9r.m166805a(layoutInflaterMo2474j, this.mChildFragmentManager.m2596v0());
        return layoutInflaterMo2474j;
    }

    @Override // p153l.ker
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public AbstractC0495a getLoaderManager() {
        return AbstractC0495a.m3108b(this);
    }

    public int getNextAnim() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return 0;
        }
        return c0382i.f1855c;
    }

    public int getNextTransition() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return 0;
        }
        return c0382i.f1856d;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        wmw.m207134a("Fragment ", this, " not associated with a fragment manager.");
        return null;
    }

    public float getPostOnViewCreatedAlpha() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return 1.0f;
        }
        return c0382i.f1869q;
    }

    @Nullable
    public Object getReenterTransition() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        Object obj = c0382i.f1862j;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        Object obj = c0382i.f1860h;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p153l.ryd0
    @NonNull
    public final C0679a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        return c0382i.f1863k;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return null;
        }
        Object obj = c0382i.f1864l;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0382i c0382i = this.mAnimationInfo;
        return (c0382i == null || (arrayList = c0382i.f1857e) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0382i c0382i = this.mAnimationInfo;
        return (c0382i == null || (arrayList = c0382i.f1858f) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(@StringRes int i) {
        return getResources().getString(i);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m2552g0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(@StringRes int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    @MainThread
    public ker getViewLifecycleOwner() {
        y5j y5jVar = this.mViewLifecycleOwner;
        if (y5jVar != null) {
            return y5jVar;
        }
        wtq0.m207906a("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    @NonNull
    public LiveData<ker> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // p153l.tll0
    @NonNull
    public sll0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            wtq0.m207906a("Can't access ViewModels from detached fragment");
            return null;
        }
        if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m2489B0(this);
        }
        wtq0.m207906a("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        return null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new r5j();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return false;
        }
        return c0382i.f1873u;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        return fragmentManager == null || fragmentManager.m2502I0(this.mParentFragment);
    }

    public boolean isPostponed() {
        C0382i c0382i = this.mAnimationInfo;
        if (c0382i == null) {
            return false;
        }
        return c0382i.f1871s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment.isRemoving() || parentFragment.isRemovingParent();
        }
        return false;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m2508L0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m2526U0();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (FragmentManager.m2481G0(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        q5j<?> q5jVar = this.mHost;
        Activity activityM175361e = q5jVar == null ? null : q5jVar.m175361e();
        if (activityM175361e != null) {
            this.mCalled = false;
            onAttach(activityM175361e);
        }
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.m2506K0(1)) {
            return;
        }
        this.mChildFragmentManager.m2490C();
    }

    @Nullable
    @MainThread
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Nullable
    @MainThread
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @MainThread
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @Nullable
    @MainThread
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    @MainThread
    public void onDestroyOptionsMenu() {
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @MainThread
    public void onHiddenChanged(boolean z) {
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        q5j<?> q5jVar = this.mHost;
        Activity activityM175361e = q5jVar == null ? null : q5jVar.m175361e();
        if (activityM175361e != null) {
            this.mCalled = false;
            onInflate(activityM175361e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @MainThread
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @MainThread
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @MainThread
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @MainThread
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m2526U0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            C0420c.m2737a(this, " did not call through to super.onActivityCreated()");
        } else {
            restoreViewState();
            this.mChildFragmentManager.m2604y();
        }
    }

    public void performAttach() {
        Iterator<AbstractC0383j> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo2466a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m2563k(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m175362f());
        if (!this.mCalled) {
            C0420c.m2737a(this, " did not call through to super.onAttach()");
        } else {
            this.mFragmentManager.m2501I(this);
            this.mChildFragmentManager.m2607z();
        }
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m2487A(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2488B(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m2526U0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo2967a(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.m169846c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m3029i(Lifecycle.Event.ON_CREATE);
        } else {
            C0420c.m2737a(this, " did not call through to super.onCreate()");
        }
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.m2492D(menu, menuInflater) | z;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.m2526U0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new y5j();
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        y5j y5jVar = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (y5jVar.m214300c()) {
                wtq0.m207906a("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            } else {
                this.mViewLifecycleOwner = null;
                return;
            }
        }
        y5jVar.m214299b();
        pml0.m172955b(this.mView, this.mViewLifecycleOwner);
        rml0.m182084a(this.mView, this);
        qml0.m177137a(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.mo2990o(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m2494E();
        this.mLifecycleRegistry.m3029i(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        C0420c.m2737a(this, " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m2496F();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.m214298a(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            C0420c.m2737a(this, " did not call through to super.onDestroyView()");
        } else {
            AbstractC0495a.m3108b(this).mo3088d();
            this.mPerformedCreateView = false;
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            C0420c.m2737a(this, " did not call through to super.onDetach()");
        } else {
            if (this.mChildFragmentManager.m2497F0()) {
                return;
            }
            this.mChildFragmentManager.m2494E();
            this.mChildFragmentManager = new r5j();
        }
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m2498G();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.m2499H(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2503J(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m2505K(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m2509M();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m214298a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.m3029i(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        C0420c.m2737a(this, " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.m2511N(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.m2513O(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zM2504J0 = this.mFragmentManager.m2504J0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM2504J0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM2504J0);
            onPrimaryNavigationFragmentChanged(zM2504J0);
            this.mChildFragmentManager.m2515P();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m2526U0();
        this.mChildFragmentManager.m2537a0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            C0420c.m2737a(this, " did not call through to super.onResume()");
            return;
        }
        C0482k c0482k = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        c0482k.m3029i(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m214298a(event);
        }
        this.mChildFragmentManager.m2517Q();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m169847d(bundle);
        Parcelable parcelableM2570m1 = this.mChildFragmentManager.m2570m1();
        if (parcelableM2570m1 != null) {
            bundle.putParcelable(Act.SUPPORT_FRAGMENTS_TAG, parcelableM2570m1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.m2526U0();
        this.mChildFragmentManager.m2537a0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            C0420c.m2737a(this, " did not call through to super.onStart()");
            return;
        }
        C0482k c0482k = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        c0482k.m3029i(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m214298a(event);
        }
        this.mChildFragmentManager.m2519R();
    }

    public void performStop() {
        this.mChildFragmentManager.m2523T();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m214298a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.m3029i(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        C0420c.m2737a(this, " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m2525U();
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f1871s = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handlerM175363g = fragmentManager != null ? fragmentManager.m2593u0().m175363g() : new Handler(Looper.getMainLooper());
        handlerM175363g.removeCallbacks(this.mPostponedDurationRunnable);
        handlerM175363g.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    @MainThread
    public final <I, O> c60<I> registerForActivityResult(@NonNull x50<I, O> x50Var, @NonNull w50<O> w50Var) {
        return prepareCallInternal(x50Var, new C0378e(), w50Var);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().m2510M0(this, strArr, i);
        } else {
            wmw.m207134a("Fragment ", this, " not attached to Activity");
        }
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        wmw.m207134a("Fragment ", this, " not attached to an activity.");
        return null;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        wmw.m207134a("Fragment ", this, " does not have any arguments.");
        return null;
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        wmw.m207134a("Fragment ", this, " not attached to a context.");
        return null;
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        wmw.m207134a("Fragment ", this, " not attached to a host.");
        return null;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            wmw.m207134a("Fragment ", this, " is not attached to any Fragment or host");
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        l5j.m152955a(sb, " is not a child Fragment, it is directly attached to ", getContext());
        return null;
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        wmw.m207134a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView().");
        return null;
    }

    public void restoreChildFragmentState(@Nullable Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable(Act.SUPPORT_FRAGMENTS_TAG)) == null) {
            return;
        }
        this.mChildFragmentManager.m2565k1(parcelable);
        this.mChildFragmentManager.m2490C();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m214301d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            C0420c.m2737a(this, " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.m214298a(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1866n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1865m = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f1853a = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f1854b = animator;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            wtq0.m207906a("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(@Nullable j3f0 j3f0Var) {
        ensureAnimationInfo().f1867o = j3f0Var;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1859g = obj;
    }

    public void setExitSharedElementCallback(@Nullable j3f0 j3f0Var) {
        ensureAnimationInfo().f1868p = j3f0Var;
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1861i = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f1870r = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo2477p();
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f1873u = z;
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            wtq0.m207906a("Fragment already added");
            return;
        }
        if (savedState == null || (bundle = savedState.mState) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo2477p();
            }
        }
    }

    public void setNextAnim(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo().f1855c = i;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f1856d = i;
    }

    public void setOnStartEnterTransitionListener(InterfaceC0384k interfaceC0384k) {
        ensureAnimationInfo();
        C0382i c0382i = this.mAnimationInfo;
        InterfaceC0384k interfaceC0384k2 = c0382i.f1872t;
        if (interfaceC0384k == interfaceC0384k2) {
            return;
        }
        if (interfaceC0384k != null && interfaceC0384k2 != null) {
            xtq0.m213103a("Trying to set a replacement startPostponedEnterTransition on ", this);
            return;
        }
        if (c0382i.f1871s) {
            c0382i.f1872t = interfaceC0384k;
        }
        if (interfaceC0384k != null) {
            interfaceC0384k.mo2467a();
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f1869q = f;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1862j = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.m2557i(this);
        } else {
            fragmentManager.m2559i1(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1860h = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1863k = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0382i c0382i = this.mAnimationInfo;
        c0382i.f1857e = arrayList;
        c0382i.f1858f = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1864l = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            v1d0.m199002a("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment");
            return;
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m2530W0(fragmentManager.m2595v(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        q5j<?> q5jVar = this.mHost;
        if (q5jVar != null) {
            return q5jVar.mo2476m(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @Nullable Bundle bundle) {
        q5j<?> q5jVar = this.mHost;
        if (q5jVar != null) {
            q5jVar.m175365n(this, intent, -1, bundle);
        } else {
            wmw.m207134a("Fragment ", this, " not attached to Activity");
        }
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m2512N0(this, intent, i, bundle);
        } else {
            wmw.m207134a("Fragment ", this, " not attached to Activity");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            wmw.m207134a("Fragment ", this, " not attached to Activity");
            return;
        }
        if (FragmentManager.m2481G0(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        getParentFragmentManager().m2514O0(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f1871s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f1871s = false;
        } else if (Looper.myLooper() != this.mHost.m175363g().getLooper()) {
            this.mHost.m175363g().postAtFrontOfQueue(new RunnableC0375b());
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$j */
    public static abstract class AbstractC0383j {
        public AbstractC0383j() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo2466a();

        public /* synthetic */ AbstractC0383j(RunnableC0374a runnableC0374a) {
            this();
        }
    }

    @NonNull
    public final String getString(@StringRes int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @NonNull
    @MainThread
    public final <I, O> c60<I> registerForActivityResult(@NonNull x50<I, O> x50Var, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull w50<O> w50Var) {
        return prepareCallInternal(x50Var, new C0379f(activityResultRegistry), w50Var);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new C0373a();
        final Bundle mState;

        /* JADX INFO: renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C0373a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.mState = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }

        public SavedState(Bundle bundle) {
            this.mState = bundle;
        }
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f1871s = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m2481G0(3)) {
            toString();
        }
        if (this.mView != null) {
            jj5.m145019m(this, this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    @ContentView
    public Fragment(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }
}
