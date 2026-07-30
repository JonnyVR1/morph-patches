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
import androidx.lifecycle.C0482k;
import androidx.lifecycle.C0489r;
import androidx.lifecycle.C0491t;
import androidx.lifecycle.InterfaceC0476e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ReportFragment;
import androidx.savedstate.C0679a;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.c60;
import p153l.d60;
import p153l.i26;
import p153l.ker;
import p153l.kl50;
import p153l.oyd0;
import p153l.pml0;
import p153l.qml0;
import p153l.rml0;
import p153l.ryd0;
import p153l.sll0;
import p153l.tl50;
import p153l.tll0;
import p153l.u50;
import p153l.v40;
import p153l.w50;
import p153l.wtq0;
import p153l.x50;
import p153l.xdj0;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ker, tll0, InterfaceC0476e, ryd0, kl50, d60 {
    private final ActivityResultRegistry mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    final i26 mContextAwareHelper;
    private C0491t.c mDefaultFactory;
    private final C0482k mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final oyd0 mSavedStateRegistryController;
    private sll0 mViewModelStore;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a */
    public class RunnableC0044a implements Runnable {
        public RunnableC0044a() {
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
    public class C0045b extends ActivityResultRegistry {

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f65a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x50.C21254a f66b;

            public a(int i, x50.C21254a c21254a) {
                this.f65a = i;
                this.f66b = c21254a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0045b.this.m207c(this.f65a, this.f66b.m209355a());
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
                C0045b.this.m206b(this.f68a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f69b));
            }
        }

        public C0045b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* JADX INFO: renamed from: f */
        public <I, O> void mo195f(int i, @NonNull x50<I, O> x50Var, I i2, @Nullable u50 u50Var) {
            Bundle bundleExtra;
            int i3;
            ComponentActivity componentActivity = ComponentActivity.this;
            x50.C21254a<O> c21254aMo209354b = x50Var.mo209354b(componentActivity, i2);
            if (c21254aMo209354b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, c21254aMo209354b));
                return;
            }
            Intent intentMo2618a = x50Var.mo2618a(componentActivity, i2);
            if (intentMo2618a.getExtras() != null && intentMo2618a.getExtras().getClassLoader() == null) {
                intentMo2618a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo2618a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentMo2618a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo2618a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo2618a.getAction())) {
                String[] stringArrayExtra = intentMo2618a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                v40.m199644u(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo2618a.getAction())) {
                v40.m199648y(componentActivity, intentMo2618a, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo2618a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i3 = i;
                try {
                    v40.m199649z(componentActivity, intentSenderRequest.m224d(), i3, intentSenderRequest.m221a(), intentSenderRequest.m222b(), intentSenderRequest.m223c(), 0, bundle);
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
    public static final class C0046c {

        /* JADX INFO: renamed from: a */
        public Object f71a;

        /* JADX INFO: renamed from: b */
        public sll0 f72b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new i26();
        this.mLifecycleRegistry = new C0482k(this);
        this.mSavedStateRegistryController = oyd0.m169844a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0044a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0045b();
        if (getLifecycle() == null) {
            wtq0.m207906a("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        getLifecycle().mo2967a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().mo2967a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.m138170b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().m186596a();
                }
            }
        });
        getLifecycle().mo2967a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull ker kerVar, @NonNull Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().mo2970d(this);
            }
        });
    }

    private void initViewTreeOwners() {
        pml0.m172955b(getWindow().getDecorView(), this);
        rml0.m182084a(getWindow().getDecorView(), this);
        qml0.m177137a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(@NonNull tl50 tl50Var) {
        this.mContextAwareHelper.m138169a(tl50Var);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0046c c0046c = (C0046c) getLastNonConfigurationInstance();
            if (c0046c != null) {
                this.mViewModelStore = c0046c.f72b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new sll0();
            }
        }
    }

    @Override // p153l.d60
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0476e
    @NonNull
    public C0491t.c getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            wtq0.m207906a("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C0489r(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0046c c0046c = (C0046c) getLastNonConfigurationInstance();
        if (c0046c != null) {
            return c0046c.f71a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, p153l.ker
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // p153l.kl50
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // p153l.ryd0
    @NonNull
    public final C0679a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // p153l.tll0
    @NonNull
    public sll0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        wtq0.m207906a("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.m206b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @MainThread
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m199d();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.m169846c(bundle);
        this.mContextAwareHelper.m138171c(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.m210g(bundle);
        ReportFragment.m3000e(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.m206b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
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
        C0046c c0046c;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        sll0 sll0Var = this.mViewModelStore;
        if (sll0Var == null && (c0046c = (C0046c) getLastNonConfigurationInstance()) != null) {
            sll0Var = c0046c.f72b;
        }
        if (sll0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0046c c0046c2 = new C0046c();
        c0046c2.f71a = objOnRetainCustomNonConfigurationInstance;
        c0046c2.f72b = sll0Var;
        return c0046c2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C0482k) {
            ((C0482k) lifecycle).m3034n(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m169847d(bundle);
        this.mActivityResultRegistry.m211h(bundle);
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m138172d();
    }

    @NonNull
    public final <I, O> c60<I> registerForActivityResult(@NonNull x50<I, O> x50Var, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull w50<O> w50Var) {
        return activityResultRegistry.m213j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, x50Var, w50Var);
    }

    public final void removeOnContextAvailableListener(@NonNull tl50 tl50Var) {
        this.mContextAwareHelper.m138173e(tl50Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (xdj0.m210469h()) {
                xdj0.m210464c("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            xdj0.m210467f();
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
    public final <I, O> c60<I> registerForActivityResult(@NonNull x50<I, O> x50Var, @NonNull w50<O> w50Var) {
        return registerForActivityResult(x50Var, this.mActivityResultRegistry, w50Var);
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }
}
