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
import p153l.kkl0;
import p153l.pnl;
import p153l.q5j;
import p153l.tll0;
import p153l.udc0;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes.dex */
public class C0425h {

    /* JADX INFO: renamed from: a */
    public final C0424g f2064a;

    /* JADX INFO: renamed from: b */
    public final C0427j f2065b;

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
            kkl0.m150158g0(this.f2069a);
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

    public C0425h(@NonNull C0424g c0424g, @NonNull C0427j c0427j, @NonNull ClassLoader classLoader, @NonNull C0422e c0422e, @NonNull FragmentState fragmentState) {
        this.f2064a = c0424g;
        this.f2065b = c0427j;
        Fragment fragmentInstantiate = c0422e.instantiate(classLoader, fragmentState.mClassName);
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
        if (FragmentManager.m2481G0(2)) {
            Objects.toString(fragmentInstantiate);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2757a() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C0424g c0424g = this.f2064a;
        Fragment fragment2 = this.f2066c;
        c0424g.m2741a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: renamed from: b */
    public void m2758b() {
        int iM2789j = this.f2065b.m2789j(this.f2066c);
        Fragment fragment = this.f2066c;
        fragment.mContainer.addView(fragment.mView, iM2789j);
    }

    /* JADX INFO: renamed from: c */
    public void m2759c() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        Fragment fragment2 = fragment.mTarget;
        C0425h c0425hM2792m = null;
        if (fragment2 != null) {
            C0425h c0425hM2792m2 = this.f2065b.m2792m(fragment2.mWho);
            Fragment fragment3 = this.f2066c;
            if (c0425hM2792m2 == null) {
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
            c0425hM2792m = c0425hM2792m2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c0425hM2792m = this.f2065b.m2792m(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(this.f2066c);
                String str2 = this.f2066c.mTargetWho;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (c0425hM2792m != null && (FragmentManager.f1881P || c0425hM2792m.m2767k().mState < 1)) {
            c0425hM2792m.m2769m();
        }
        Fragment fragment5 = this.f2066c;
        fragment5.mHost = fragment5.mFragmentManager.m2593u0();
        Fragment fragment6 = this.f2066c;
        fragment6.mParentFragment = fragment6.mFragmentManager.m2602x0();
        this.f2064a.m2747g(this.f2066c, false);
        this.f2066c.performAttach();
        this.f2064a.m2742b(this.f2066c, false);
    }

    /* JADX INFO: renamed from: d */
    public int m2760d() {
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
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpactM2677l = (!FragmentManager.f1881P || (viewGroup = (fragment = this.f2066c).mContainer) == null) ? null : SpecialEffectsController.m2664n(viewGroup, fragment.getParentFragmentManager()).m2677l(this);
        if (lifecycleImpactM2677l == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpactM2677l == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
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
        if (FragmentManager.m2481G0(2)) {
            Objects.toString(this.f2066c);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public void m2761e() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f2066c.mState = 1;
            return;
        }
        this.f2064a.m2748h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f2066c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        C0424g c0424g = this.f2064a;
        Fragment fragment3 = this.f2066c;
        c0424g.m2743c(fragment3, fragment3.mSavedFragmentState, false);
    }

    /* JADX INFO: renamed from: f */
    public void m2762f() {
        String resourceName;
        if (this.f2066c.mFromLayout) {
            return;
        }
        if (FragmentManager.m2481G0(3)) {
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
                    pnl.m173070a("Cannot create fragment ", this.f2066c, " for a container view with no id");
                    return;
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.m2575o0().mo2459c(this.f2066c.mContainerId);
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
            fragment5.mView.setTag(udc0.f178516a, fragment5);
            if (viewGroup != null) {
                m2758b();
            }
            Fragment fragment6 = this.f2066c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            boolean zM150133O = kkl0.m150133O(this.f2066c.mView);
            Fragment fragment7 = this.f2066c;
            if (zM150133O) {
                kkl0.m150158g0(fragment7.mView);
            } else {
                View view2 = fragment7.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2066c.performViewCreated();
            C0424g c0424g = this.f2064a;
            Fragment fragment8 = this.f2066c;
            c0424g.m2753m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
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
                        if (FragmentManager.m2481G0(2)) {
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
    public void m2763g() {
        Fragment fragmentM2785f;
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (!z && !this.f2065b.m2794o().m2652k(this.f2066c)) {
            String str = this.f2066c.mTargetWho;
            if (str != null && (fragmentM2785f = this.f2065b.m2785f(str)) != null && fragmentM2785f.mRetainInstance) {
                this.f2066c.mTarget = fragmentM2785f;
            }
            this.f2066c.mState = 0;
            return;
        }
        q5j<?> q5jVar = this.f2066c.mHost;
        if (q5jVar instanceof tll0) {
            zIsChangingConfigurations = this.f2065b.m2794o().m2649h();
        } else if (q5jVar.m175362f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) q5jVar.m175362f()).isChangingConfigurations();
        }
        if (z || zIsChangingConfigurations) {
            this.f2065b.m2794o().m2644b(this.f2066c);
        }
        this.f2066c.performDestroy();
        this.f2064a.m2744d(this.f2066c, false);
        for (C0425h c0425h : this.f2065b.m2790k()) {
            if (c0425h != null) {
                Fragment fragmentM2767k = c0425h.m2767k();
                if (this.f2066c.mWho.equals(fragmentM2767k.mTargetWho)) {
                    fragmentM2767k.mTarget = this.f2066c;
                    fragmentM2767k.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f2066c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f2065b.m2785f(str2);
        }
        this.f2065b.m2796q(this);
    }

    /* JADX INFO: renamed from: h */
    public void m2764h() {
        View view;
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        Fragment fragment = this.f2066c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f2066c.performDestroyView();
        this.f2064a.m2754n(this.f2066c, false);
        Fragment fragment2 = this.f2066c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo2990o(null);
        this.f2066c.mInLayout = false;
    }

    /* JADX INFO: renamed from: i */
    public void m2765i() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performDetach();
        this.f2064a.m2745e(this.f2066c, false);
        Fragment fragment = this.f2066c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f2065b.m2794o().m2652k(this.f2066c)) {
            return;
        }
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.initState();
    }

    /* JADX INFO: renamed from: j */
    public void m2766j() {
        Fragment fragment = this.f2066c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m2481G0(3)) {
                Objects.toString(this.f2066c);
            }
            Fragment fragment2 = this.f2066c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f2066c.mSavedFragmentState);
            View view = this.f2066c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2066c;
                fragment3.mView.setTag(udc0.f178516a, fragment3);
                Fragment fragment4 = this.f2066c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f2066c.performViewCreated();
                C0424g c0424g = this.f2064a;
                Fragment fragment5 = this.f2066c;
                c0424g.m2753m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f2066c.mState = 2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public Fragment m2767k() {
        return this.f2066c;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2768l(@NonNull View view) {
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
    public void m2769m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2067d) {
            if (FragmentManager.m2481G0(2)) {
                Objects.toString(m2767k());
                return;
            }
            return;
        }
        try {
            this.f2067d = true;
            while (true) {
                int iM2760d = m2760d();
                Fragment fragment = this.f2066c;
                int i = fragment.mState;
                if (iM2760d == i) {
                    if (FragmentManager.f1881P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerM2664n = SpecialEffectsController.m2664n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f2066c.mHidden) {
                                specialEffectsControllerM2664n.m2668c(this);
                            } else {
                                specialEffectsControllerM2664n.m2670e(this);
                            }
                        }
                        Fragment fragment2 = this.f2066c;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m2495E0(fragment2);
                        }
                        Fragment fragment3 = this.f2066c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (iM2760d <= i) {
                    switch (i - 1) {
                        case -1:
                            m2765i();
                            break;
                        case 0:
                            m2763g();
                            break;
                        case 1:
                            m2764h();
                            this.f2066c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m2481G0(3)) {
                                Objects.toString(this.f2066c);
                            }
                            Fragment fragment4 = this.f2066c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                m2776t();
                            }
                            Fragment fragment5 = this.f2066c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                SpecialEffectsController.m2664n(viewGroup3, fragment5.getParentFragmentManager()).m2669d(this);
                            }
                            this.f2066c.mState = 3;
                            break;
                        case 4:
                            m2779w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m2770n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m2759c();
                            break;
                        case 1:
                            m2761e();
                            break;
                        case 2:
                            m2766j();
                            m2762f();
                            break;
                        case 3:
                            m2757a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                SpecialEffectsController.m2664n(viewGroup2, fragment.getParentFragmentManager()).m2667b(SpecialEffectsController.Operation.State.from(this.f2066c.mView.getVisibility()), this);
                            }
                            this.f2066c.mState = 4;
                            break;
                        case 5:
                            m2778v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m2772p();
                            break;
                    }
                }
            }
        } finally {
            this.f2067d = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2770n() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performPause();
        this.f2064a.m2746f(this.f2066c, false);
    }

    /* JADX INFO: renamed from: o */
    public void m2771o(@NonNull ClassLoader classLoader) {
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
    public void m2772p() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        View focusedView = this.f2066c.getFocusedView();
        if (focusedView != null && m2768l(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.m2481G0(2)) {
                focusedView.toString();
                Objects.toString(this.f2066c);
                Objects.toString(this.f2066c.mView.findFocus());
            }
        }
        this.f2066c.setFocusedView(null);
        this.f2066c.performResume();
        this.f2064a.m2749i(this.f2066c, false);
        Fragment fragment = this.f2066c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: q */
    public final Bundle m2773q() {
        Bundle bundle = new Bundle();
        this.f2066c.performSaveInstanceState(bundle);
        this.f2064a.m2750j(this.f2066c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2066c.mView != null) {
            m2776t();
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
    public Fragment.SavedState m2774r() {
        Bundle bundleM2773q;
        if (this.f2066c.mState <= -1 || (bundleM2773q = m2773q()) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleM2773q);
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public FragmentState m2775s() {
        FragmentState fragmentState = new FragmentState(this.f2066c);
        Fragment fragment = this.f2066c;
        if (fragment.mState <= -1 || fragmentState.mSavedFragmentState != null) {
            fragmentState.mSavedFragmentState = fragment.mSavedFragmentState;
            return fragmentState;
        }
        Bundle bundleM2773q = m2773q();
        fragmentState.mSavedFragmentState = bundleM2773q;
        if (this.f2066c.mTargetWho != null) {
            if (bundleM2773q == null) {
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
    public void m2776t() {
        if (this.f2066c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2066c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2066c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2066c.mViewLifecycleOwner.m214302e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2066c.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: u */
    public void m2777u(int i) {
        this.f2068e = i;
    }

    /* JADX INFO: renamed from: v */
    public void m2778v() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performStart();
        this.f2064a.m2751k(this.f2066c, false);
    }

    /* JADX INFO: renamed from: w */
    public void m2779w() {
        if (FragmentManager.m2481G0(3)) {
            Objects.toString(this.f2066c);
        }
        this.f2066c.performStop();
        this.f2064a.m2752l(this.f2066c, false);
    }

    public C0425h(@NonNull C0424g c0424g, @NonNull C0427j c0427j, @NonNull Fragment fragment) {
        this.f2064a = c0424g;
        this.f2065b = c0427j;
        this.f2066c = fragment;
    }

    public C0425h(@NonNull C0424g c0424g, @NonNull C0427j c0427j, @NonNull Fragment fragment, @NonNull FragmentState fragmentState) {
        this.f2064a = c0424g;
        this.f2065b = c0427j;
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
