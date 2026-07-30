package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.Objects;
import p149l.all;
import p149l.gbl0;
import p149l.p5c0;
import p149l.pcl0;
import p149l.v2j;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes.dex */
public class C0424h {

    /* JADX INFO: renamed from: a */
    public final C0423g f2064a;

    /* JADX INFO: renamed from: b */
    public final C0426j f2065b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Fragment f2066c;

    /* JADX INFO: renamed from: d */
    public boolean f2067d = false;

    /* JADX INFO: renamed from: e */
    public int f2068e = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.h$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f2069a;

        public a(View view) {
            this.f2069a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2069a.removeOnAttachStateChangeListener(this);
            gbl0.m125195g0(this.f2069a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.h$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2071a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f2071a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2071a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2071a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2071a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0424h(@NonNull C0423g c0423g, @NonNull C0426j c0426j, @NonNull ClassLoader classLoader, @NonNull C0421e c0421e, @NonNull FragmentState fragmentState) {
        this.f2064a = c0423g;
        this.f2065b = c0426j;
        Fragment fragmentInstantiate = c0421e.instantiate(classLoader, fragmentState.mClassName);
        this.f2066c = fragmentInstantiate;
        Bundle bundle = fragmentState.mArguments;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(fragmentState.mArguments);
        fragmentInstantiate.mWho = fragmentState.mWho;
        fragmentInstantiate.mFromLayout = fragmentState.mFromLayout;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = fragmentState.mFragmentId;
        fragmentInstantiate.mContainerId = fragmentState.mContainerId;
        fragmentInstantiate.mTag = fragmentState.mTag;
        fragmentInstantiate.mRetainInstance = fragmentState.mRetainInstance;
        fragmentInstantiate.mRemoving = fragmentState.mRemoving;
        fragmentInstantiate.mDetached = fragmentState.mDetached;
        fragmentInstantiate.mHidden = fragmentState.mHidden;
        fragmentInstantiate.mMaxState = Lifecycle.State.values()[fragmentState.mMaxLifecycleState];
        Bundle bundle2 = fragmentState.mSavedFragmentState;
        if (bundle2 != null) {
            fragmentInstantiate.mSavedFragmentState = bundle2;
        } else {
            fragmentInstantiate.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.m2480G0(2)) {
            Objects.toString(fragmentInstantiate);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2756a() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0423g c0423g = this.f2064a;
        Fragment fragment2 = this.f2066c;
        c0423g.m2740a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: renamed from: b */
    public void m2757b() {
        int iM2788j = this.f2065b.m2788j(this.f2066c);
        Fragment fragment = this.f2066c;
        fragment.mContainer.addView(fragment.mView, iM2788j);
    }

    /* JADX INFO: renamed from: c */
    public void m2758c() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        Fragment fragment2 = fragment.mTarget;
        C0424h c0424hM2791m = null;
        if (fragment2 != null) {
            C0424h c0424hM2791m2 = this.f2065b.m2791m(fragment2.mWho);
            Fragment fragment3 = this.f2066c;
            if (c0424hM2791m2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment3);
                Fragment fragment4 = this.f2066c.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment4);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c0424hM2791m = c0424hM2791m2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c0424hM2791m = this.f2065b.m2791m(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(this.f2066c);
                String str2 = this.f2066c.mTargetWho;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (c0424hM2791m != null && (FragmentManager.f1881P || c0424hM2791m.m2766k().mState < 1)) {
            c0424hM2791m.m2768m();
        }
        Fragment fragment5 = this.f2066c;
        fragment5.mHost = fragment5.mFragmentManager.m2592u0();
        Fragment fragment6 = this.f2066c;
        fragment6.mParentFragment = fragment6.mFragmentManager.m2601x0();
        this.f2064a.m2746g(this.f2066c, false);
        this.f2066c.performAttach();
        this.f2064a.m2741b(this.f2066c, false);
    }

    /* JADX INFO: renamed from: d */
    public int m2759d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2066c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.f2068e;
        int i = b.f2071a[fragment2.mMaxState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f2066c;
        if (fragment3.mFromLayout) {
            boolean z = fragment3.mInLayout;
            int i2 = this.f2068e;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = this.f2066c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, fragment3.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f2066c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpactM2676l = (!FragmentManager.f1881P || (viewGroup = (fragment = this.f2066c).mContainer) == null) ? null : SpecialEffectsController.m2663n(viewGroup, fragment.getParentFragmentManager()).m2676l(this);
        if (lifecycleImpactM2676l == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpactM2676l == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f2066c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f2066c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m2480G0(2)) {
            Objects.toString(this.f2066c);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public void m2760e() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f2066c.mState = 1;
            return;
        }
        this.f2064a.m2747h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f2066c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C0423g c0423g = this.f2064a;
        Fragment fragment3 = this.f2066c;
        c0423g.m2742c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* JADX INFO: renamed from: f */
    public void m2761f() {
        String resourceName;
        if (this.f2066c.mFromLayout) {
            return;
        }
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f2066c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i = fragment2.mContainerId;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    all.m97315a("Cannot create fragment ", this.f2066c, " for a container view with no id");
                    return;
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.m2574o0().mo2458c(this.f2066c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2066c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f2066c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2066c.mContainerId) + " (" + resourceName + ") for fragment " + this.f2066c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f2066c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f2066c.mView;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2066c;
            fragment5.mView.setTag(p5c0.f147283a, fragment5);
            if (viewGroup != null) {
                m2757b();
            }
            Fragment fragment6 = this.f2066c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            boolean zM125170O = gbl0.m125170O(this.f2066c.mView);
            Fragment fragment7 = this.f2066c;
            if (zM125170O) {
                gbl0.m125195g0(fragment7.mView);
            } else {
                View view2 = fragment7.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2066c.performViewCreated();
            C0423g c0423g = this.f2064a;
            Fragment fragment8 = this.f2066c;
            c0423g.m2752m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
            int visibility = this.f2066c.mView.getVisibility();
            float alpha = this.f2066c.mView.getAlpha();
            boolean z2 = FragmentManager.f1881P;
            Fragment fragment9 = this.f2066c;
            if (z2) {
                fragment9.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment10 = this.f2066c;
                if (fragment10.mContainer != null && visibility == 0) {
                    View viewFindFocus = fragment10.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.f2066c.setFocusedView(viewFindFocus);
                        if (FragmentManager.m2480G0(2)) {
                            viewFindFocus.toString();
                            Objects.toString(this.f2066c);
                        }
                    }
                    this.f2066c.mView.setAlpha(0.0f);
                }
            } else {
                if (visibility == 0 && fragment9.mContainer != null) {
                    z = true;
                }
                fragment9.mIsNewlyAdded = z;
            }
        }
        this.f2066c.mState = 2;
    }

    /* JADX INFO: renamed from: g */
    public void m2762g() {
        Fragment fragmentM2784f;
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (!z && !this.f2065b.m2793o().m2651k(this.f2066c)) {
            String str = this.f2066c.mTargetWho;
            if (str != null && (fragmentM2784f = this.f2065b.m2784f(str)) != null && fragmentM2784f.mRetainInstance) {
                this.f2066c.mTarget = fragmentM2784f;
            }
            this.f2066c.mState = 0;
            return;
        }
        v2j<?> v2jVar = this.f2066c.mHost;
        if (v2jVar instanceof pcl0) {
            zIsChangingConfigurations = this.f2065b.m2793o().m2648h();
        } else if (v2jVar.m196786f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) v2jVar.m196786f()).isChangingConfigurations();
        }
        if (z || zIsChangingConfigurations) {
            this.f2065b.m2793o().m2643b(this.f2066c);
        }
        this.f2066c.performDestroy();
        this.f2064a.m2743d(this.f2066c, false);
        for (C0424h c0424h : this.f2065b.m2789k()) {
            if (c0424h != null) {
                Fragment fragmentM2766k = c0424h.m2766k();
                if (this.f2066c.mWho.equals(fragmentM2766k.mTargetWho)) {
                    fragmentM2766k.mTarget = this.f2066c;
                    fragmentM2766k.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f2066c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f2065b.m2784f(str2);
        }
        this.f2065b.m2795q(this);
    }

    /* JADX INFO: renamed from: h */
    public void m2763h() {
        View view;
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f2066c.performDestroyView();
        this.f2064a.m2753n(this.f2066c, false);
        Fragment fragment2 = this.f2066c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo2989o(null);
        this.f2066c.mInLayout = false;
    }

    /* JADX INFO: renamed from: i */
    public void m2764i() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performDetach();
        this.f2064a.m2744e(this.f2066c, false);
        Fragment fragment = this.f2066c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f2065b.m2793o().m2651k(this.f2066c)) {
            return;
        }
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.initState();
    }

    /* JADX INFO: renamed from: j */
    public void m2765j() {
        Fragment fragment = this.f2066c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m2480G0(3)) {
                Objects.toString(this.f2066c);
            }
            Fragment fragment2 = this.f2066c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f2066c.mSavedFragmentState);
            View view = this.f2066c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2066c;
                fragment3.mView.setTag(p5c0.f147283a, fragment3);
                Fragment fragment4 = this.f2066c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f2066c.performViewCreated();
                C0423g c0423g = this.f2064a;
                Fragment fragment5 = this.f2066c;
                c0423g.m2752m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f2066c.mState = 2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public Fragment m2766k() {
        return this.f2066c;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2767l(@NonNull View view) {
        if (view == this.f2066c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2066c.mView) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m2768m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2067d) {
            if (FragmentManager.m2480G0(2)) {
                Objects.toString(m2766k());
                return;
            }
            return;
        }
        try {
            this.f2067d = true;
            while (true) {
                int iM2759d = m2759d();
                Fragment fragment = this.f2066c;
                int i = fragment.mState;
                if (iM2759d == i) {
                    if (FragmentManager.f1881P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerM2663n = SpecialEffectsController.m2663n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f2066c.mHidden) {
                                specialEffectsControllerM2663n.m2667c(this);
                            } else {
                                specialEffectsControllerM2663n.m2669e(this);
                            }
                        }
                        Fragment fragment2 = this.f2066c;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m2494E0(fragment2);
                        }
                        Fragment fragment3 = this.f2066c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (iM2759d <= i) {
                    switch (i - 1) {
                        case -1:
                            m2764i();
                            break;
                        case 0:
                            m2762g();
                            break;
                        case 1:
                            m2763h();
                            this.f2066c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m2480G0(3)) {
                                Objects.toString(this.f2066c);
                            }
                            Fragment fragment4 = this.f2066c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                m2775t();
                            }
                            Fragment fragment5 = this.f2066c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                SpecialEffectsController.m2663n(viewGroup3, fragment5.getParentFragmentManager()).m2668d(this);
                            }
                            this.f2066c.mState = 3;
                            break;
                        case 4:
                            m2778w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m2769n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m2758c();
                            break;
                        case 1:
                            m2760e();
                            break;
                        case 2:
                            m2765j();
                            m2761f();
                            break;
                        case 3:
                            m2756a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                SpecialEffectsController.m2663n(viewGroup2, fragment.getParentFragmentManager()).m2666b(SpecialEffectsController.Operation.State.from(this.f2066c.mView.getVisibility()), this);
                            }
                            this.f2066c.mState = 4;
                            break;
                        case 5:
                            m2777v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m2771p();
                            break;
                    }
                }
            }
        } finally {
            this.f2067d = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2769n() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performPause();
        this.f2064a.m2745f(this.f2066c, false);
    }

    /* JADX INFO: renamed from: o */
    public void m2770o(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.f2066c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2066c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2066c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2066c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f2066c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2066c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f2066c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2066c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* JADX INFO: renamed from: p */
    public void m2771p() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        View focusedView = this.f2066c.getFocusedView();
        if (focusedView != null && m2767l(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.m2480G0(2)) {
                focusedView.toString();
                Objects.toString(this.f2066c);
                Objects.toString(this.f2066c.mView.findFocus());
            }
        }
        this.f2066c.setFocusedView(null);
        this.f2066c.performResume();
        this.f2064a.m2748i(this.f2066c, false);
        Fragment fragment = this.f2066c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: q */
    public final Bundle m2772q() {
        Bundle bundle = new Bundle();
        this.f2066c.performSaveInstanceState(bundle);
        this.f2064a.m2749j(this.f2066c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2066c.mView != null) {
            m2775t();
        }
        if (this.f2066c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2066c.mSavedViewState);
        }
        if (this.f2066c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2066c.mSavedViewRegistryState);
        }
        if (!this.f2066c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2066c.mUserVisibleHint);
        }
        return bundle;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public Fragment.SavedState m2773r() {
        Bundle bundleM2772q;
        if (this.f2066c.mState <= -1 || (bundleM2772q = m2772q()) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleM2772q);
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public FragmentState m2774s() {
        FragmentState fragmentState = new FragmentState(this.f2066c);
        Fragment fragment = this.f2066c;
        if (fragment.mState <= -1 || fragmentState.mSavedFragmentState != null) {
            fragmentState.mSavedFragmentState = fragment.mSavedFragmentState;
            return fragmentState;
        }
        Bundle bundleM2772q = m2772q();
        fragmentState.mSavedFragmentState = bundleM2772q;
        if (this.f2066c.mTargetWho != null) {
            if (bundleM2772q == null) {
                fragmentState.mSavedFragmentState = new Bundle();
            }
            fragmentState.mSavedFragmentState.putString("android:target_state", this.f2066c.mTargetWho);
            int i = this.f2066c.mTargetRequestCode;
            if (i != 0) {
                fragmentState.mSavedFragmentState.putInt("android:target_req_state", i);
            }
        }
        return fragmentState;
    }

    /* JADX INFO: renamed from: t */
    public void m2775t() {
        if (this.f2066c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2066c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2066c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2066c.mViewLifecycleOwner.m109929e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2066c.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: u */
    public void m2776u(int i) {
        this.f2068e = i;
    }

    /* JADX INFO: renamed from: v */
    public void m2777v() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performStart();
        this.f2064a.m2750k(this.f2066c, false);
    }

    /* JADX INFO: renamed from: w */
    public void m2778w() {
        if (FragmentManager.m2480G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performStop();
        this.f2064a.m2751l(this.f2066c, false);
    }

    public C0424h(@NonNull C0423g c0423g, @NonNull C0426j c0426j, @NonNull Fragment fragment) {
        this.f2064a = c0423g;
        this.f2065b = c0426j;
        this.f2066c = fragment;
    }

    public C0424h(@NonNull C0423g c0423g, @NonNull C0426j c0426j, @NonNull Fragment fragment, @NonNull FragmentState fragmentState) {
        this.f2064a = c0423g;
        this.f2065b = c0426j;
        this.f2066c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.mSavedFragmentState;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
