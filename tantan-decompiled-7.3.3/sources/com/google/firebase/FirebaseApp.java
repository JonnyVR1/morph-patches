package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import com.p051p1.mobile.putong.core.data.Options;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
import p153l.jj5;
import p153l.l01;
import p153l.m31;
import p153l.nfk0;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseApp {

    @NonNull
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final String LOG_TAG = "FirebaseApp";
    private final Context applicationContext;
    private final ComponentRuntime componentRuntime;
    private final Lazy<DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final Provider<DefaultHeartBeatController> defaultHeartBeatController;
    private final String name;
    private final FirebaseOptions options;
    private static final Object LOCK = new Object();

    @GuardedBy("LOCK")
    static final Map<String, FirebaseApp> INSTANCES = new l01();
    private final AtomicBoolean automaticResourceManagementEnabled = new AtomicBoolean(false);
    private final AtomicBoolean deleted = new AtomicBoolean();
    private final List<BackgroundStateChangeListener> backgroundStateChangeListeners = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> lifecycleListeners = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<GlobalBackgroundStateListener> INSTANCE = new AtomicReference<>();

        private GlobalBackgroundStateListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureBackgroundStateListenerRegistered(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (INSTANCE.get() == null) {
                    GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                    if (m31.m156916a(INSTANCE, null, globalBackgroundStateListener)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.LOCK) {
                try {
                    for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.INSTANCES.values())) {
                        if (firebaseApp.automaticResourceManagementEnabled.get()) {
                            firebaseApp.notifyBackgroundStateChangeListeners(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @TargetApi(24)
    public static class UserUnlockReceiver extends BroadcastReceiver {
        private static AtomicReference<UserUnlockReceiver> INSTANCE = new AtomicReference<>();
        private final Context applicationContext;

        public UserUnlockReceiver(Context context) {
            this.applicationContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureReceiverRegistered(Context context) {
            if (INSTANCE.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                if (m31.m156916a(INSTANCE, null, userUnlockReceiver)) {
                    jj5.m145018l(context, userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.LOCK) {
                try {
                    Iterator<FirebaseApp> it = FirebaseApp.INSTANCES.values().iterator();
                    while (it.hasNext()) {
                        it.next().initializeAllApis();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            unregister();
        }

        public void unregister() {
            this.applicationContext.unregisterReceiver(this);
        }
    }

    public FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.applicationContext = (Context) Preconditions.checkNotNull(context);
        this.name = Preconditions.checkNotEmpty(str);
        this.options = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> listDiscoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.m16731of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.m16731of(this, (Class<FirebaseApp>) FirebaseApp.class, (Class<? super FirebaseApp>[]) new Class[0])).addComponent(Component.m16731of(firebaseOptions, (Class<FirebaseOptions>) FirebaseOptions.class, (Class<? super FirebaseOptions>[]) new Class[0])).setProcessor(new ComponentMonitor());
        if (nfk0.m162929a(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.m16731of(startupTime, (Class<StartupTime>) StartupTime.class, (Class<? super StartupTime>[]) new Class[0]));
        }
        ComponentRuntime componentRuntimeBuild = processor.build();
        this.componentRuntime = componentRuntimeBuild;
        FirebaseTrace.popTrace();
        this.dataCollectionConfigStorage = new Lazy<>(new Provider() { // from class: l.noi
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseApp.m16718b(this.f142985a, context);
            }
        });
        this.defaultHeartBeatController = componentRuntimeBuild.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new BackgroundStateChangeListener() { // from class: l.ooi
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z) {
                FirebaseApp.m16717a(this.f148365a, z);
            }
        });
        FirebaseTrace.popTrace();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16717a(FirebaseApp firebaseApp, boolean z) {
        if (z) {
            firebaseApp.getClass();
        } else {
            firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ DataCollectionConfigStorage m16718b(FirebaseApp firebaseApp, Context context) {
        return new DataCollectionConfigStorage(context, firebaseApp.getPersistenceKey(), (Publisher) firebaseApp.componentRuntime.get(Publisher.class));
    }

    private void checkNotDeleted() {
        Preconditions.checkState(!this.deleted.get(), "FirebaseApp was deleted");
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            try {
                Iterator<FirebaseApp> it = INSTANCES.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    public static List<FirebaseApp> getApps(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    @NonNull
    public static FirebaseApp getInstance(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (LOCK) {
            try {
                firebaseApp = INSTANCES.get(normalize(str));
                if (firebaseApp == null) {
                    List<String> allAppNames = getAllAppNames();
                    if (allAppNames.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", allAppNames);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeAllApis() {
        if (!nfk0.m162929a(this.applicationContext)) {
            getName();
            UserUnlockReceiver.ensureReceiverRegistered(this.applicationContext);
        } else {
            getName();
            this.componentRuntime.initializeEagerComponents(isDefaultApp());
            this.defaultHeartBeatController.get().registerHeartBeat();
        }
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        GlobalBackgroundStateListener.ensureBackgroundStateListenerRegistered(context);
        String strNormalize = normalize(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (LOCK) {
            Map<String, FirebaseApp> map = INSTANCES;
            Preconditions.checkState(!map.containsKey(strNormalize), "FirebaseApp name " + strNormalize + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, strNormalize, firebaseOptions);
            map.put(strNormalize, firebaseApp);
        }
        firebaseApp.initializeAllApis();
        return firebaseApp;
    }

    private static String normalize(@NonNull String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBackgroundStateChangeListeners(boolean z) {
        Iterator<BackgroundStateChangeListener> it = this.backgroundStateChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z);
        }
    }

    private void notifyOnAppDeleted() {
        Iterator<FirebaseAppLifecycleListener> it = this.lifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeleted(this.name, this.options);
        }
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.backgroundStateChangeListeners.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.add(firebaseAppLifecycleListener);
    }

    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.name.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        checkNotDeleted();
        return (T) this.componentRuntime.get(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    @NonNull
    public String getName() {
        checkNotDeleted();
        return this.name;
    }

    @NonNull
    public FirebaseOptions getOptions() {
        checkNotDeleted();
        return this.options;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public void initializeAllComponents() {
        this.componentRuntime.initializeAllComponentsForTests();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.get().isEnabled();
    }

    @KeepForSdk
    @VisibleForTesting
    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!z, z)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && zIsInBackground) {
                notifyBackgroundStateChangeListeners(true);
            } else {
                if (z || !zIsInBackground) {
                    return;
                }
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.get().setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(AuthenticationTokenClaims.JSON_KEY_NAME, this.name).add(Options.TYPE, this.options).toString();
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z));
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + Marker.ANY_NON_NULL_MARKER + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context) {
        synchronized (LOCK) {
            try {
                if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                    return getInstance();
                }
                FirebaseOptions firebaseOptionsFromResource = FirebaseOptions.fromResource(context);
                if (firebaseOptionsFromResource == null) {
                    return null;
                }
                return initializeApp(context, firebaseOptionsFromResource);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            try {
                firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                firebaseApp.defaultHeartBeatController.get().registerHeartBeat();
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }
}
