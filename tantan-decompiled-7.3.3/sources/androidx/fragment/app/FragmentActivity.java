package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C0482k;
import androidx.lifecycle.Lifecycle;
import androidx.loader.app.AbstractC0495a;
import androidx.savedstate.C0679a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p153l.d60;
import p153l.j3f0;
import p153l.kl50;
import p153l.p5j;
import p153l.q5j;
import p153l.s5j;
import p153l.sll0;
import p153l.tl50;
import p153l.tll0;
import p153l.v40;
import p153l.y5j;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements v40.InterfaceC20750e {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final C0482k mFragmentLifecycleRegistry;
    final p5j mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C0385a implements C0679a.b {
        public C0385a() {
        }

        @Override // androidx.savedstate.C0679a.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public Bundle mo2469a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.markFragmentsCreated();
            FragmentActivity.this.mFragmentLifecycleRegistry.m3029i(Lifecycle.Event.ON_STOP);
            Parcelable parcelableM170675x = FragmentActivity.this.mFragments.m170675x();
            if (parcelableM170675x != null) {
                bundle.putParcelable("android:support:fragments", parcelableM170675x);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$b */
    public class C0386b implements tl50 {
        public C0386b() {
        }

        @Override // p153l.tl50
        /* JADX INFO: renamed from: a */
        public void mo2470a(@NonNull Context context) {
            FragmentActivity.this.mFragments.m170653a(null);
            Bundle bundleM4023a = FragmentActivity.this.getSavedStateRegistry().m4023a("android:support:fragments");
            if (bundleM4023a != null) {
                FragmentActivity.this.mFragments.m170674w(bundleM4023a.getParcelable("android:support:fragments"));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$c */
    public class C0387c extends q5j<FragmentActivity> implements tll0, kl50, d60, s5j {
        public C0387c() {
            super(FragmentActivity.this);
        }

        @Override // p153l.s5j
        /* JADX INFO: renamed from: a */
        public void mo2471a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // p153l.q5j, p153l.o5j
        @Nullable
        /* JADX INFO: renamed from: c */
        public View mo2459c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // p153l.q5j, p153l.o5j
        /* JADX INFO: renamed from: d */
        public boolean mo2460d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p153l.d60
        @NonNull
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // p153l.ker
        @NonNull
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // p153l.kl50
        @NonNull
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // p153l.tll0
        @NonNull
        public sll0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // p153l.q5j
        /* JADX INFO: renamed from: h */
        public void mo2472h(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // p153l.q5j
        @NonNull
        /* JADX INFO: renamed from: j */
        public LayoutInflater mo2474j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // p153l.q5j
        /* JADX INFO: renamed from: l */
        public boolean mo2475l(@NonNull Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // p153l.q5j
        /* JADX INFO: renamed from: m */
        public boolean mo2476m(@NonNull String str) {
            return v40.m199647x(FragmentActivity.this, str);
        }

        @Override // p153l.q5j
        /* JADX INFO: renamed from: p */
        public void mo2477p() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // p153l.q5j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public FragmentActivity mo2473i() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        this.mFragments = p5j.m170652b(new C0387c());
        this.mFragmentLifecycleRegistry = new C0482k(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m4025c("android:support:fragments", new C0385a());
        addOnContextAvailableListener(new C0386b());
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.m2590t0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                y5j y5jVar = fragment.mViewLifecycleOwner;
                if (y5jVar != null && y5jVar.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.m214303f(state);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.m3034n(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.m170673v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC0495a.m3108b(this).mo3086a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m170671t().m2529W(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m170671t();
    }

    @NonNull
    @Deprecated
    public AbstractC0495a getSupportLoaderManager() {
        return AbstractC0495a.m3108b(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.m170672u();
        super.onActivityResult(i, i2, intent);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.m170672u();
        this.mFragments.m170655d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m3029i(Lifecycle.Event.ON_CREATE);
        this.mFragments.m170657f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return this.mFragments.m170658g(menu, getMenuInflater()) | super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m170659h();
        this.mFragmentLifecycleRegistry.m3029i(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m170660i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.m170662k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.m170656e(menuItem);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.m170661j(z);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.m170672u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        if (i == 0) {
            this.mFragments.m170663l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m170664m();
        this.mFragmentLifecycleRegistry.m3029i(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.m170665n(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public boolean onPrepareOptionsPanel(@Nullable View view, @NonNull Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        if (i != 0) {
            return super.onPreparePanel(i, view, menu);
        }
        return this.mFragments.m170666o(menu) | onPrepareOptionsPanel(view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m170672u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.m170672u();
        this.mFragments.m170670s();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m3029i(Lifecycle.Event.ON_RESUME);
        this.mFragments.m170667p();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m170654c();
        }
        this.mFragments.m170672u();
        this.mFragments.m170670s();
        this.mFragmentLifecycleRegistry.m3029i(Lifecycle.Event.ON_START);
        this.mFragments.m170668q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m170672u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m170669r();
        this.mFragmentLifecycleRegistry.m3029i(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable j3f0 j3f0Var) {
        v40.m199645v(this, j3f0Var);
    }

    public void setExitSharedElementCallback(@Nullable j3f0 j3f0Var) {
        v40.m199646w(this, j3f0Var);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            v40.m199648y(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            v40.m199649z(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        v40.m199641r(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        v40.m199642s(this);
    }

    public void supportStartPostponedEnterTransition() {
        v40.m199638A(this);
    }

    @Override // p153l.v40.InterfaceC20750e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @ContentView
    public FragmentActivity(@LayoutRes int i) {
        super(i);
        this.mFragments = p5j.m170652b(new C0387c());
        this.mFragmentLifecycleRegistry = new C0482k(this);
        this.mStopped = true;
        init();
    }
}
