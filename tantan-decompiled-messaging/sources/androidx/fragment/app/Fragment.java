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
import androidx.lifecycle.C0481k;
import androidx.lifecycle.C0488r;
import androidx.lifecycle.C0490t;
import androidx.lifecycle.InterfaceC0475e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LiveData;
import androidx.loader.app.AbstractC0494a;
import androidx.savedstate.C0677a;
import com.p046p1.mobile.android.app.Act;
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
import p149l.a60;
import p149l.b60;
import p149l.cve0;
import p149l.d3j;
import p149l.g60;
import p149l.h60;
import p149l.iaj;
import p149l.ii5;
import p149l.jcr;
import p149l.kt10;
import p149l.ldl0;
import p149l.mdl0;
import p149l.mqd0;
import p149l.n7r;
import p149l.ndl0;
import p149l.ocl0;
import p149l.p2j;
import p149l.pcl0;
import p149l.pqd0;
import p149l.q2j;
import p149l.qkq0;
import p149l.qtc0;
import p149l.r2j;
import p149l.rkq0;
import p149l.t2j;
import p149l.v2j;
import p149l.w2j;
import p149l.xjw;
import p149l.y50;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, jcr, pcl0, InterfaceC0475e, pqd0 {
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
    C0381i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;

    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @LayoutRes
    private int mContentLayoutId;
    private C0490t.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    v2j<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C0481k mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC0382j> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    mqd0 mSavedStateRegistryController;

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
    d3j mViewLifecycleOwner;
    kt10<jcr> mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String str, @Nullable Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$a */
    public class RunnableC0373a implements Runnable {
        public RunnableC0373a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$b */
    public class RunnableC0374b implements Runnable {
        public RunnableC0374b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$c */
    public class RunnableC0375c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SpecialEffectsController f1839a;

        public RunnableC0375c(SpecialEffectsController specialEffectsController) {
            this.f1839a = specialEffectsController;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1839a.m2671g();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$d */
    public class C0376d extends t2j {
        public C0376d() {
        }

        @Override // p149l.t2j
        @Nullable
        /* JADX INFO: renamed from: c */
        public View mo2458c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            r2j.m177608a("Fragment ", Fragment.this, " does not have a view");
            return null;
        }

        @Override // p149l.t2j
        /* JADX INFO: renamed from: d */
        public boolean mo2459d() {
            return Fragment.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$e */
    public class C0377e implements iaj<Void, ActivityResultRegistry> {
        public C0377e() {
        }

        @Override // p149l.iaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r2) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof h60 ? ((h60) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$f */
    public class C0378f implements iaj<Void, ActivityResultRegistry> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f1843a;

        public C0378f(ActivityResultRegistry activityResultRegistry) {
            this.f1843a = activityResultRegistry;
        }

        @Override // p149l.iaj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r1) {
            return this.f1843a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$g */
    public class C0379g extends AbstractC0382j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ iaj f1845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicReference f1846b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b60 f1847c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ a60 f1848d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0379g(iaj iajVar, AtomicReference atomicReference, b60 b60Var, a60 a60Var) {
            super(null);
            this.f1845a = iajVar;
            this.f1846b = atomicReference;
            this.f1847c = b60Var;
            this.f1848d = a60Var;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0382j
        /* JADX INFO: renamed from: a */
        public void mo2465a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f1846b.set(((ActivityResultRegistry) this.f1845a.apply(null)).m212j(strGenerateActivityResultKey, Fragment.this, this.f1847c, this.f1848d));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$h */
    public class C0380h<I> extends g60<I> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicReference f1850a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b60 f1851b;

        public C0380h(AtomicReference atomicReference, b60 b60Var) {
            this.f1850a = atomicReference;
            this.f1851b = b60Var;
        }

        @Override // p149l.g60
        @NonNull
        /* JADX INFO: renamed from: a */
        public b60<I, ?> mo215a() {
            return this.f1851b;
        }

        @Override // p149l.g60
        /* JADX INFO: renamed from: c */
        public void mo216c(I i, @Nullable y50 y50Var) {
            g60 g60Var = (g60) this.f1850a.get();
            if (g60Var != null) {
                g60Var.mo216c(i, y50Var);
            } else {
                qkq0.m175383a("Operation cannot be started before fragment is in created state");
            }
        }

        @Override // p149l.g60
        /* JADX INFO: renamed from: d */
        public void mo217d() {
            g60 g60Var = (g60) this.f1850a.getAndSet(null);
            if (g60Var != null) {
                g60Var.mo217d();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$i */
    public static class C0381i {

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
        public cve0 f1867o;

        /* JADX INFO: renamed from: p */
        public cve0 f1868p;

        /* JADX INFO: renamed from: q */
        public float f1869q;

        /* JADX INFO: renamed from: r */
        public View f1870r;

        /* JADX INFO: renamed from: s */
        public boolean f1871s;

        /* JADX INFO: renamed from: t */
        public InterfaceC0383k f1872t;

        /* JADX INFO: renamed from: u */
        public boolean f1873u;

        public C0381i() {
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
    public interface InterfaceC0383k {
        /* JADX INFO: renamed from: a */
        void mo2466a();

        /* JADX INFO: renamed from: b */
        void mo2467b();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new w2j();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0373a();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new kt10<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private C0381i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0381i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C0481k(this);
        this.mSavedStateRegistryController = mqd0.m155882a(this);
        this.mDefaultFactory = null;
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragmentNewInstance = C0421e.loadFragmentClass(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragmentNewInstance;
            }
            bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
            fragmentNewInstance.setArguments(bundle);
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            p2j.m167181a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (java.lang.InstantiationException e2) {
            p2j.m167181a(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            p2j.m167181a(str, ": could not find Fragment constructor", e3);
            return null;
        } catch (InvocationTargetException e4) {
            p2j.m167181a(str, ": calling Fragment constructor caused an exception", e4);
            return null;
        }
    }

    @NonNull
    private <I, O> g60<I> prepareCallInternal(@NonNull b60<I, O> b60Var, @NonNull iaj<Void, ActivityResultRegistry> iajVar, @NonNull a60<O> a60Var) {
        if (this.mState > 1) {
            xjw.m209754a("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new C0379g(iajVar, atomicReference, b60Var, a60Var));
        return new C0380h(atomicReference, b60Var);
    }

    private void registerOnPreAttachListener(@NonNull AbstractC0382j abstractC0382j) {
        if (this.mState >= 0) {
            abstractC0382j.mo2465a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC0382j);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0381i c0381i = this.mAnimationInfo;
        InterfaceC0383k interfaceC0383k = null;
        if (c0381i != null) {
            c0381i.f1871s = false;
            InterfaceC0383k interfaceC0383k2 = c0381i.f1872t;
            c0381i.f1872t = null;
            interfaceC0383k = interfaceC0383k2;
        }
        if (interfaceC0383k != null) {
            interfaceC0383k.mo2467b();
            return;
        }
        if (!FragmentManager.f1881P || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController specialEffectsControllerM2663n = SpecialEffectsController.m2663n(viewGroup, fragmentManager);
        specialEffectsControllerM2663n.m2678p();
        if (z) {
            this.mHost.m196787g().post(new RunnableC0375c(specialEffectsControllerM2663n));
        } else {
            specialEffectsControllerM2663n.m2671g();
        }
    }

    @NonNull
    public t2j createFragmentContainer() {
        return new C0376d();
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
            AbstractC0494a.m3107b(this).mo3085a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m2528W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m2560j0(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        v2j<?> v2jVar = this.mHost;
        if (v2jVar == null) {
            return null;
        }
        return (FragmentActivity) v2jVar.m196785e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null || (bool = c0381i.f1866n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null || (bool = c0381i.f1865m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1853a;
    }

    public Animator getAnimator() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1854b;
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
        xjw.m209754a("Fragment ", this, " has not been attached yet.");
        return null;
    }

    @Nullable
    public Context getContext() {
        v2j<?> v2jVar = this.mHost;
        if (v2jVar == null) {
            return null;
        }
        return v2jVar.m196786f();
    }

    @Override // androidx.lifecycle.InterfaceC0475e
    @NonNull
    public C0490t.c getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            qkq0.m175383a("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && FragmentManager.m2480G0(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C0488r(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @Nullable
    public Object getEnterTransition() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1859g;
    }

    public cve0 getEnterTransitionCallback() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1867o;
    }

    @Nullable
    public Object getExitTransition() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1861i;
    }

    public cve0 getExitTransitionCallback() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1868p;
    }

    public View getFocusedView() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1870r;
    }

    @Nullable
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        v2j<?> v2jVar = this.mHost;
        if (v2jVar == null) {
            return null;
        }
        return v2jVar.mo2472i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        v2j<?> v2jVar = this.mHost;
        if (v2jVar == null) {
            qkq0.m175383a("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        LayoutInflater layoutInflaterMo2473j = v2jVar.mo2473j();
        n7r.m158156a(layoutInflaterMo2473j, this.mChildFragmentManager.m2595v0());
        return layoutInflaterMo2473j;
    }

    @Override // p149l.jcr
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public AbstractC0494a getLoaderManager() {
        return AbstractC0494a.m3107b(this);
    }

    public int getNextAnim() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return 0;
        }
        return c0381i.f1855c;
    }

    public int getNextTransition() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return 0;
        }
        return c0381i.f1856d;
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
        xjw.m209754a("Fragment ", this, " not associated with a fragment manager.");
        return null;
    }

    public float getPostOnViewCreatedAlpha() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return 1.0f;
        }
        return c0381i.f1869q;
    }

    @Nullable
    public Object getReenterTransition() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        Object obj = c0381i.f1862j;
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
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        Object obj = c0381i.f1860h;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p149l.pqd0
    @NonNull
    public final C0677a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        return c0381i.f1863k;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return null;
        }
        Object obj = c0381i.f1864l;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0381i c0381i = this.mAnimationInfo;
        return (c0381i == null || (arrayList = c0381i.f1857e) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0381i c0381i = this.mAnimationInfo;
        return (c0381i == null || (arrayList = c0381i.f1858f) == null) ? new ArrayList<>() : arrayList;
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
        return fragmentManager.m2551g0(str);
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
    public jcr getViewLifecycleOwner() {
        d3j d3jVar = this.mViewLifecycleOwner;
        if (d3jVar != null) {
            return d3jVar;
        }
        qkq0.m175383a("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    @NonNull
    public LiveData<jcr> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // p149l.pcl0
    @NonNull
    public ocl0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            qkq0.m175383a("Can't access ViewModels from detached fragment");
            return null;
        }
        if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m2488B0(this);
        }
        qkq0.m175383a("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
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
        this.mChildFragmentManager = new w2j();
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
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return false;
        }
        return c0381i.f1873u;
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
        return fragmentManager == null || fragmentManager.m2501I0(this.mParentFragment);
    }

    public boolean isPostponed() {
        C0381i c0381i = this.mAnimationInfo;
        if (c0381i == null) {
            return false;
        }
        return c0381i.f1871s;
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
        return fragmentManager.m2507L0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m2525U0();
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (FragmentManager.m2480G0(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        v2j<?> v2jVar = this.mHost;
        Activity activityM196785e = v2jVar == null ? null : v2jVar.m196785e();
        if (activityM196785e != null) {
            this.mCalled = false;
            onAttach(activityM196785e);
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
        if (this.mChildFragmentManager.m2505K0(1)) {
            return;
        }
        this.mChildFragmentManager.m2489C();
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
        v2j<?> v2jVar = this.mHost;
        Activity activityM196785e = v2jVar == null ? null : v2jVar.m196785e();
        if (activityM196785e != null) {
            this.mCalled = false;
            onInflate(activityM196785e, attributeSet, bundle);
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
        this.mChildFragmentManager.m2525U0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            C0419c.m2736a(this, " did not call through to super.onActivityCreated()");
        } else {
            restoreViewState();
            this.mChildFragmentManager.m2603y();
        }
    }

    public void performAttach() {
        Iterator<AbstractC0382j> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo2465a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m2562k(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m196786f());
        if (!this.mCalled) {
            C0419c.m2736a(this, " did not call through to super.onAttach()");
        } else {
            this.mFragmentManager.m2500I(this);
            this.mChildFragmentManager.m2606z();
        }
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m2486A(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2487B(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m2525U0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo2966a(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.m155884c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m3028i(Lifecycle.Event.ON_CREATE);
        } else {
            C0419c.m2736a(this, " did not call through to super.onCreate()");
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
        return this.mChildFragmentManager.m2491D(menu, menuInflater) | z;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.m2525U0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new d3j();
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        d3j d3jVar = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (d3jVar.m109927c()) {
                qkq0.m175383a("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            } else {
                this.mViewLifecycleOwner = null;
                return;
            }
        }
        d3jVar.m109926b();
        ldl0.m149447b(this.mView, this.mViewLifecycleOwner);
        ndl0.m158994a(this.mView, this);
        mdl0.m154103a(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.mo2989o(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m2493E();
        this.mLifecycleRegistry.m3028i(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        C0419c.m2736a(this, " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m2495F();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.m109925a(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            C0419c.m2736a(this, " did not call through to super.onDestroyView()");
        } else {
            AbstractC0494a.m3107b(this).mo3087d();
            this.mPerformedCreateView = false;
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            C0419c.m2736a(this, " did not call through to super.onDetach()");
        } else {
            if (this.mChildFragmentManager.m2496F0()) {
                return;
            }
            this.mChildFragmentManager.m2493E();
            this.mChildFragmentManager = new w2j();
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
        this.mChildFragmentManager.m2497G();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.m2498H(z);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m2502J(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m2504K(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m2508M();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m109925a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.m3028i(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        C0419c.m2736a(this, " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.m2510N(z);
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
        return this.mChildFragmentManager.m2512O(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zM2503J0 = this.mFragmentManager.m2503J0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM2503J0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM2503J0);
            onPrimaryNavigationFragmentChanged(zM2503J0);
            this.mChildFragmentManager.m2514P();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m2525U0();
        this.mChildFragmentManager.m2536a0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            C0419c.m2736a(this, " did not call through to super.onResume()");
            return;
        }
        C0481k c0481k = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        c0481k.m3028i(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m109925a(event);
        }
        this.mChildFragmentManager.m2516Q();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m155885d(bundle);
        Parcelable parcelableM2569m1 = this.mChildFragmentManager.m2569m1();
        if (parcelableM2569m1 != null) {
            bundle.putParcelable(Act.SUPPORT_FRAGMENTS_TAG, parcelableM2569m1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.m2525U0();
        this.mChildFragmentManager.m2536a0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            C0419c.m2736a(this, " did not call through to super.onStart()");
            return;
        }
        C0481k c0481k = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        c0481k.m3028i(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m109925a(event);
        }
        this.mChildFragmentManager.m2518R();
    }

    public void performStop() {
        this.mChildFragmentManager.m2522T();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m109925a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.m3028i(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        C0419c.m2736a(this, " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m2524U();
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        ensureAnimationInfo().f1871s = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handlerM196787g = fragmentManager != null ? fragmentManager.m2592u0().m196787g() : new Handler(Looper.getMainLooper());
        handlerM196787g.removeCallbacks(this.mPostponedDurationRunnable);
        handlerM196787g.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    @MainThread
    public final <I, O> g60<I> registerForActivityResult(@NonNull b60<I, O> b60Var, @NonNull a60<O> a60Var) {
        return prepareCallInternal(b60Var, new C0377e(), a60Var);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().m2509M0(this, strArr, i);
        } else {
            xjw.m209754a("Fragment ", this, " not attached to Activity");
        }
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        xjw.m209754a("Fragment ", this, " not attached to an activity.");
        return null;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        xjw.m209754a("Fragment ", this, " does not have any arguments.");
        return null;
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        xjw.m209754a("Fragment ", this, " not attached to a context.");
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
        xjw.m209754a("Fragment ", this, " not attached to a host.");
        return null;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            xjw.m209754a("Fragment ", this, " is not attached to any Fragment or host");
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        q2j.m172469a(sb, " is not a child Fragment, it is directly attached to ", getContext());
        return null;
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        xjw.m209754a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView().");
        return null;
    }

    public void restoreChildFragmentState(@Nullable Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable(Act.SUPPORT_FRAGMENTS_TAG)) == null) {
            return;
        }
        this.mChildFragmentManager.m2564k1(parcelable);
        this.mChildFragmentManager.m2489C();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m109928d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            C0419c.m2736a(this, " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.m109925a(Lifecycle.Event.ON_CREATE);
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
            qkq0.m175383a("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(@Nullable cve0 cve0Var) {
        ensureAnimationInfo().f1867o = cve0Var;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1859g = obj;
    }

    public void setExitSharedElementCallback(@Nullable cve0 cve0Var) {
        ensureAnimationInfo().f1868p = cve0Var;
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
            this.mHost.mo2476p();
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f1873u = z;
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            qkq0.m175383a("Fragment already added");
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
                this.mHost.mo2476p();
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

    public void setOnStartEnterTransitionListener(InterfaceC0383k interfaceC0383k) {
        ensureAnimationInfo();
        C0381i c0381i = this.mAnimationInfo;
        InterfaceC0383k interfaceC0383k2 = c0381i.f1872t;
        if (interfaceC0383k == interfaceC0383k2) {
            return;
        }
        if (interfaceC0383k != null && interfaceC0383k2 != null) {
            rkq0.m179764a("Trying to set a replacement startPostponedEnterTransition on ", this);
            return;
        }
        if (c0381i.f1871s) {
            c0381i.f1872t = interfaceC0383k;
        }
        if (interfaceC0383k != null) {
            interfaceC0383k.mo2466a();
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
            fragmentManager.m2556i(this);
        } else {
            fragmentManager.m2558i1(this);
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
        C0381i c0381i = this.mAnimationInfo;
        c0381i.f1857e = arrayList;
        c0381i.f1858f = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().f1864l = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            qtc0.m176411a("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment");
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
            fragmentManager.m2529W0(fragmentManager.m2594v(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        v2j<?> v2jVar = this.mHost;
        if (v2jVar != null) {
            return v2jVar.mo2475m(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @Nullable Bundle bundle) {
        v2j<?> v2jVar = this.mHost;
        if (v2jVar != null) {
            v2jVar.m196789n(this, intent, -1, bundle);
        } else {
            xjw.m209754a("Fragment ", this, " not attached to Activity");
        }
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m2511N0(this, intent, i, bundle);
        } else {
            xjw.m209754a("Fragment ", this, " not attached to Activity");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            xjw.m209754a("Fragment ", this, " not attached to Activity");
            return;
        }
        if (FragmentManager.m2480G0(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        getParentFragmentManager().m2513O0(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f1871s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f1871s = false;
        } else if (Looper.myLooper() != this.mHost.m196787g().getLooper()) {
            this.mHost.m196787g().postAtFrontOfQueue(new RunnableC0374b());
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
    public static abstract class AbstractC0382j {
        public AbstractC0382j() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo2465a();

        public /* synthetic */ AbstractC0382j(RunnableC0373a runnableC0373a) {
            this();
        }
    }

    @NonNull
    public final String getString(@StringRes int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @NonNull
    @MainThread
    public final <I, O> g60<I> registerForActivityResult(@NonNull b60<I, O> b60Var, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull a60<O> a60Var) {
        return prepareCallInternal(b60Var, new C0378f(activityResultRegistry), a60Var);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new C0372a();
        final Bundle mState;

        /* JADX INFO: renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C0372a implements Parcelable.ClassLoaderCreator<SavedState> {
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
        if (FragmentManager.m2480G0(3)) {
            toString();
        }
        if (this.mView != null) {
            ii5.m136343m(this, this.mSavedFragmentState);
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
