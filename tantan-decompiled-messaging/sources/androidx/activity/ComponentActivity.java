package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.C0481k;
import androidx.lifecycle.C0488r;
import androidx.lifecycle.C0490t;
import androidx.lifecycle.InterfaceC0475e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ReportFragment;
import androidx.savedstate.C0677a;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.a60;
import p149l.b50;
import p149l.b60;
import p149l.d16;
import p149l.dd50;
import p149l.g60;
import p149l.h60;
import p149l.jcr;
import p149l.ldl0;
import p149l.md50;
import p149l.mdl0;
import p149l.mqd0;
import p149l.ndl0;
import p149l.ocl0;
import p149l.pcl0;
import p149l.pqd0;
import p149l.qkq0;
import p149l.t4j0;
import p149l.y50;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements jcr, pcl0, InterfaceC0475e, pqd0, dd50, h60 {
    private final ActivityResultRegistry mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    final d16 mContextAwareHelper;
    private C0490t.c mDefaultFactory;
    private final C0481k mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final mqd0 mSavedStateRegistryController;
    private ocl0 mViewModelStore;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a */
    public class RunnableC0043a implements Runnable {
        public RunnableC0043a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b */
    public class C0044b extends ActivityResultRegistry {

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f65a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ b60.C15813a f66b;

            public a(int i, b60.C15813a c15813a) {
                this.f65a = i;
                this.f66b = c15813a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0044b.this.m206c(this.f65a, this.f66b.m100347a());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f68a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ IntentSender.SendIntentException f69b;

            public b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f68a = i;
                this.f69b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0044b.this.m205b(this.f68a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f69b));
            }
        }

        public C0044b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* JADX INFO: renamed from: f */
        public <I, O> void mo194f(int i, @NonNull b60<I, O> b60Var, I i2, @Nullable y50 y50Var) {
            Bundle bundleExtra;
            int i3;
            ComponentActivity componentActivity = ComponentActivity.this;
            b60.C15813a<O> c15813aMo100346b = b60Var.mo100346b(componentActivity, i2);
            if (c15813aMo100346b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, c15813aMo100346b));
                return;
            }
            Intent intentMo2617a = b60Var.mo2617a(componentActivity, i2);
            if (intentMo2617a.getExtras() != null && intentMo2617a.getExtras().getClassLoader() == null) {
                intentMo2617a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo2617a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentMo2617a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo2617a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo2617a.getAction())) {
                String[] stringArrayExtra = intentMo2617a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                b50.m100287u(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo2617a.getAction())) {
                b50.m100291y(componentActivity, intentMo2617a, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo2617a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i3 = i;
                try {
                    b50.m100292z(componentActivity, intentSenderRequest.m223d(), i3, intentSenderRequest.m220a(), intentSenderRequest.m221b(), intentSenderRequest.m222c(), 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    new Handler(Looper.getMainLooper()).post(new b(i3, e));
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i3 = i;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$c */
    public static final class C0045c {

        /* JADX INFO: renamed from: a */
        public Object f71a;

        /* JADX INFO: renamed from: b */
        public ocl0 f72b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new d16();
        this.mLifecycleRegistry = new C0481k(this);
        this.mSavedStateRegistryController = mqd0.m155882a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0043a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0044b();
        if (getLifecycle() == null) {
            qkq0.m175383a("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().mo2966a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().mo2966a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.m109597b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().m163534a();
                }
            }
        });
        getLifecycle().mo2966a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull jcr jcrVar, @NonNull Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().mo2969d(this);
            }
        });
    }

    private void initViewTreeOwners() {
        ldl0.m149447b(getWindow().getDecorView(), this);
        ndl0.m158994a(getWindow().getDecorView(), this);
        mdl0.m154103a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(@NonNull md50 md50Var) {
        this.mContextAwareHelper.m109596a(md50Var);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0045c c0045c = (C0045c) getLastNonConfigurationInstance();
            if (c0045c != null) {
                this.mViewModelStore = c0045c.f72b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ocl0();
            }
        }
    }

    @Override // p149l.h60
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0475e
    @NonNull
    public C0490t.c getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            qkq0.m175383a("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C0488r(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0045c c0045c = (C0045c) getLastNonConfigurationInstance();
        if (c0045c != null) {
            return c0045c.f71a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, p149l.jcr
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // p149l.dd50
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // p149l.pqd0
    @NonNull
    public final C0677a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // p149l.pcl0
    @NonNull
    public ocl0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        qkq0.m175383a("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.m205b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @MainThread
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m198d();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.m155884c(bundle);
        this.mContextAwareHelper.m109598c(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.m209g(bundle);
        ReportFragment.m2999e(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.m205b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        C0045c c0045c;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ocl0 ocl0Var = this.mViewModelStore;
        if (ocl0Var == null && (c0045c = (C0045c) getLastNonConfigurationInstance()) != null) {
            ocl0Var = c0045c.f72b;
        }
        if (ocl0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0045c c0045c2 = new C0045c();
        c0045c2.f71a = objOnRetainCustomNonConfigurationInstance;
        c0045c2.f72b = ocl0Var;
        return c0045c2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C0481k) {
            ((C0481k) lifecycle).m3033n(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m155885d(bundle);
        this.mActivityResultRegistry.m210h(bundle);
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m109599d();
    }

    @NonNull
    public final <I, O> g60<I> registerForActivityResult(@NonNull b60<I, O> b60Var, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull a60<O> a60Var) {
        return activityResultRegistry.m212j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, b60Var, a60Var);
    }

    public final void removeOnContextAvailableListener(@NonNull md50 md50Var) {
        this.mContextAwareHelper.m109600e(md50Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (t4j0.m187213h()) {
                t4j0.m187208c("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            t4j0.m187211f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @NonNull
    public final <I, O> g60<I> registerForActivityResult(@NonNull b60<I, O> b60Var, @NonNull a60<O> a60Var) {
        return registerForActivityResult(b60Var, this.mActivityResultRegistry, a60Var);
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }
}
