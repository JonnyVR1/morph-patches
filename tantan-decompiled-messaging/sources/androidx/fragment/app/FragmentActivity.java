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
import androidx.lifecycle.C0481k;
import androidx.lifecycle.Lifecycle;
import androidx.loader.app.AbstractC0494a;
import androidx.savedstate.C0677a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p149l.b50;
import p149l.cve0;
import p149l.d3j;
import p149l.dd50;
import p149l.h60;
import p149l.md50;
import p149l.ocl0;
import p149l.pcl0;
import p149l.u2j;
import p149l.v2j;
import p149l.x2j;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements b50.InterfaceC15807e {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final C0481k mFragmentLifecycleRegistry;
    final u2j mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C0384a implements C0677a.b {
        public C0384a() {
        }

        @Override // androidx.savedstate.C0677a.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public Bundle mo2468a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.markFragmentsCreated();
            FragmentActivity.this.mFragmentLifecycleRegistry.m3028i(Lifecycle.Event.ON_STOP);
            Parcelable parcelableM191523x = FragmentActivity.this.mFragments.m191523x();
            if (parcelableM191523x != null) {
                bundle.putParcelable("android:support:fragments", parcelableM191523x);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$b */
    public class C0385b implements md50 {
        public C0385b() {
        }

        @Override // p149l.md50
        /* JADX INFO: renamed from: a */
        public void mo2469a(@NonNull Context context) {
            FragmentActivity.this.mFragments.m191501a(null);
            Bundle bundleM4021a = FragmentActivity.this.getSavedStateRegistry().m4021a("android:support:fragments");
            if (bundleM4021a != null) {
                FragmentActivity.this.mFragments.m191522w(bundleM4021a.getParcelable("android:support:fragments"));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentActivity$c */
    public class C0386c extends v2j<FragmentActivity> implements pcl0, dd50, h60, x2j {
        public C0386c() {
            super(FragmentActivity.this);
        }

        @Override // p149l.x2j
        /* JADX INFO: renamed from: a */
        public void mo2470a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // p149l.v2j, p149l.t2j
        @Nullable
        /* JADX INFO: renamed from: c */
        public View mo2458c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // p149l.v2j, p149l.t2j
        /* JADX INFO: renamed from: d */
        public boolean mo2459d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p149l.h60
        @NonNull
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // p149l.jcr
        @NonNull
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // p149l.dd50
        @NonNull
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // p149l.pcl0
        @NonNull
        public ocl0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // p149l.v2j
        /* JADX INFO: renamed from: h */
        public void mo2471h(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // p149l.v2j
        @NonNull
        /* JADX INFO: renamed from: j */
        public LayoutInflater mo2473j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // p149l.v2j
        /* JADX INFO: renamed from: l */
        public boolean mo2474l(@NonNull Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // p149l.v2j
        /* JADX INFO: renamed from: m */
        public boolean mo2475m(@NonNull String str) {
            return b50.m100290x(FragmentActivity.this, str);
        }

        @Override // p149l.v2j
        /* JADX INFO: renamed from: p */
        public void mo2476p() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // p149l.v2j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public FragmentActivity mo2472i() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        this.mFragments = u2j.m191500b(new C0386c());
        this.mFragmentLifecycleRegistry = new C0481k(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m4023c("android:support:fragments", new C0384a());
        addOnContextAvailableListener(new C0385b());
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.m2589t0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                d3j d3jVar = fragment.mViewLifecycleOwner;
                if (d3jVar != null && d3jVar.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.m109930f(state);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.m3033n(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.m191521v(view, str, context, attributeSet);
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
            AbstractC0494a.m3107b(this).mo3085a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m191519t().m2528W(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m191519t();
    }

    @NonNull
    @Deprecated
    public AbstractC0494a getSupportLoaderManager() {
        return AbstractC0494a.m3107b(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.m191520u();
        super.onActivityResult(i, i2, intent);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.m191520u();
        this.mFragments.m191503d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m3028i(Lifecycle.Event.ON_CREATE);
        this.mFragments.m191505f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return this.mFragments.m191506g(menu, getMenuInflater()) | super.onCreatePanelMenu(i, menu);
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
        this.mFragments.m191507h();
        this.mFragmentLifecycleRegistry.m3028i(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m191508i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.m191510k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.m191504e(menuItem);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.m191509j(z);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.m191520u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        if (i == 0) {
            this.mFragments.m191511l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m191512m();
        this.mFragmentLifecycleRegistry.m3028i(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.m191513n(z);
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
        return this.mFragments.m191514o(menu) | onPrepareOptionsPanel(view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m191520u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.m191520u();
        this.mFragments.m191518s();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m3028i(Lifecycle.Event.ON_RESUME);
        this.mFragments.m191515p();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m191502c();
        }
        this.mFragments.m191520u();
        this.mFragments.m191518s();
        this.mFragmentLifecycleRegistry.m3028i(Lifecycle.Event.ON_START);
        this.mFragments.m191516q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m191520u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m191517r();
        this.mFragmentLifecycleRegistry.m3028i(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable cve0 cve0Var) {
        b50.m100288v(this, cve0Var);
    }

    public void setExitSharedElementCallback(@Nullable cve0 cve0Var) {
        b50.m100289w(this, cve0Var);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            b50.m100291y(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            b50.m100292z(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        b50.m100284r(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        b50.m100285s(this);
    }

    public void supportStartPostponedEnterTransition() {
        b50.m100281A(this);
    }

    @Override // p149l.b50.InterfaceC15807e
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
        this.mFragments = u2j.m191500b(new C0386c());
        this.mFragmentLifecycleRegistry = new C0481k(this);
        this.mStopped = true;
        init();
    }
}
