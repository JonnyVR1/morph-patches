package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p153l.m31;
import p153l.toi0;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class RemoteConfigComponent implements FirebaseRemoteConfigInterop {
    public static final String ACTIVATE_FILE_NAME = "activate";
    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 60;
    public static final String DEFAULTS_FILE_NAME = "defaults";

    @VisibleForTesting
    public static final String DEFAULT_NAMESPACE = "firebase";
    public static final String FETCH_FILE_NAME = "fetch";
    private static final String FIREBASE_REMOTE_CONFIG_FILE_NAME_PREFIX = "frc";
    private static final String PREFERENCES_FILE_NAME = "settings";

    @Nullable
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final String appId;
    private final Context context;

    @GuardedBy("this")
    private Map<String, String> customHeaders;
    private final ScheduledExecutorService executor;
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;

    @GuardedBy("this")
    private final Map<String, FirebaseRemoteConfig> frcNamespaceInstances;
    private static final Clock DEFAULT_CLOCK = DefaultClock.getInstance();
    private static final Random DEFAULT_RANDOM = new Random();
    private static final Map<String, FirebaseRemoteConfig> frcNamespaceInstancesStatic = new HashMap();

    public static class GlobalBackgroundListener implements BackgroundDetector.BackgroundStateChangeListener {
        private static final AtomicReference<GlobalBackgroundListener> INSTANCE = new AtomicReference<>();

        private GlobalBackgroundListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureBackgroundListenerIsRegistered(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<GlobalBackgroundListener> atomicReference = INSTANCE;
            if (atomicReference.get() == null) {
                GlobalBackgroundListener globalBackgroundListener = new GlobalBackgroundListener();
                if (m31.m156916a(atomicReference, null, globalBackgroundListener)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(globalBackgroundListener);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            RemoteConfigComponent.notifyRCInstances(z);
        }
    }

    @VisibleForTesting
    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider, boolean z) {
        this.frcNamespaceInstances = new HashMap();
        this.customHeaders = new HashMap();
        this.context = context;
        this.executor = scheduledExecutorService;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.analyticsConnector = provider;
        this.appId = firebaseApp.getOptions().getApplicationId();
        GlobalBackgroundListener.ensureBackgroundListenerIsRegistered(context);
        if (z) {
            toi0.m192065c(scheduledExecutorService, new Callable() { // from class: l.ayc0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f73962a.getDefault();
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AnalyticsConnector m16901a() {
        return null;
    }

    private ConfigCacheClient getCacheClient(String str, String str2) {
        return ConfigCacheClient.getInstance(this.executor, ConfigStorageClient.getInstance(this.context, String.format("%s_%s_%s_%s.json", "frc", this.appId, str, str2)));
    }

    private ConfigGetParameterHandler getGetHandler(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new ConfigGetParameterHandler(this.executor, configCacheClient, configCacheClient2);
    }

    @VisibleForTesting
    public static ConfigMetadataClient getMetadataClient(Context context, String str, String str2) {
        return new ConfigMetadataClient(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    @Nullable
    private static Personalization getPersonalization(FirebaseApp firebaseApp, String str, Provider<AnalyticsConnector> provider) {
        if (isPrimaryApp(firebaseApp) && str.equals(DEFAULT_NAMESPACE)) {
            return new Personalization(provider);
        }
        return null;
    }

    private RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        return new RolloutsStateSubscriptionsHandler(configCacheClient, RolloutsStateFactory.create(configCacheClient, configCacheClient2), this.executor);
    }

    private static boolean isAbtSupported(FirebaseApp firebaseApp, String str) {
        return str.equals(DEFAULT_NAMESPACE) && isPrimaryApp(firebaseApp);
    }

    private static boolean isPrimaryApp(FirebaseApp firebaseApp) {
        return firebaseApp.getName().equals(FirebaseApp.DEFAULT_APP_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void notifyRCInstances(boolean z) {
        Iterator<FirebaseRemoteConfig> it = frcNamespaceInstancesStatic.values().iterator();
        while (it.hasNext()) {
            it.next().setConfigUpdateBackgroundState(z);
        }
    }

    @VisibleForTesting
    public synchronized FirebaseRemoteConfig get(FirebaseApp firebaseApp, String str, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) throws Throwable {
        RemoteConfigComponent remoteConfigComponent;
        String str2;
        try {
            try {
                if (this.frcNamespaceInstances.containsKey(str)) {
                    remoteConfigComponent = this;
                    str2 = str;
                } else {
                    remoteConfigComponent = this;
                    str2 = str;
                    FirebaseRemoteConfig firebaseRemoteConfig = new FirebaseRemoteConfig(this.context, firebaseApp, firebaseInstallationsApi, isAbtSupported(firebaseApp, str) ? firebaseABTesting : null, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configMetadataClient, getRealtime(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, this.context, str, configMetadataClient), rolloutsStateSubscriptionsHandler);
                    firebaseRemoteConfig.startLoadingConfigsFromDisk();
                    remoteConfigComponent.frcNamespaceInstances.put(str2, firebaseRemoteConfig);
                    frcNamespaceInstancesStatic.put(str2, firebaseRemoteConfig);
                }
                return remoteConfigComponent.frcNamespaceInstances.get(str2);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public FirebaseRemoteConfig getDefault() {
        return get(DEFAULT_NAMESPACE);
    }

    @VisibleForTesting
    public synchronized ConfigFetchHandler getFetchHandler(String str, ConfigCacheClient configCacheClient, ConfigMetadataClient configMetadataClient) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new ConfigFetchHandler(this.firebaseInstallations, isPrimaryApp(this.firebaseApp) ? this.analyticsConnector : new Provider() { // from class: l.byc0
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return RemoteConfigComponent.m16901a();
            }
        }, this.executor, DEFAULT_CLOCK, DEFAULT_RANDOM, configCacheClient, getFrcBackendApiClient(this.firebaseApp.getOptions().getApiKey(), str, configMetadataClient), configMetadataClient, this.customHeaders);
    }

    @VisibleForTesting
    public ConfigFetchHttpClient getFrcBackendApiClient(String str, String str2, ConfigMetadataClient configMetadataClient) {
        return new ConfigFetchHttpClient(this.context, this.firebaseApp.getOptions().getApplicationId(), str, str2, configMetadataClient.getFetchTimeoutInSeconds(), configMetadataClient.getFetchTimeoutInSeconds());
    }

    public synchronized ConfigRealtimeHandler getRealtime(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient) {
        return new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, configMetadataClient, this.executor);
    }

    @Override // com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop
    public void registerRolloutsStateSubscriber(@NonNull String str, @NonNull RolloutsStateSubscriber rolloutsStateSubscriber) {
        get(str).getRolloutsStateSubscriptionsHandler().registerRolloutsStateSubscriber(rolloutsStateSubscriber);
    }

    @VisibleForTesting
    public synchronized void setCustomHeaders(Map<String, String> map) {
        this.customHeaders = map;
    }

    public RemoteConfigComponent(Context context, @Blocking ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider<AnalyticsConnector> provider) {
        this(context, scheduledExecutorService, firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    @KeepForSdk
    @VisibleForTesting
    public synchronized FirebaseRemoteConfig get(String str) throws Throwable {
        Throwable th;
        try {
            try {
                ConfigCacheClient cacheClient = getCacheClient(str, FETCH_FILE_NAME);
                ConfigCacheClient cacheClient2 = getCacheClient(str, "activate");
                ConfigCacheClient cacheClient3 = getCacheClient(str, DEFAULTS_FILE_NAME);
                ConfigMetadataClient metadataClient = getMetadataClient(this.context, this.appId, str);
                ConfigGetParameterHandler getHandler = getGetHandler(cacheClient2, cacheClient3);
                final Personalization personalization = getPersonalization(this.firebaseApp, str, this.analyticsConnector);
                if (personalization != null) {
                    try {
                        getHandler.addListener(new BiConsumer() { // from class: l.zxc0
                            @Override // com.google.android.gms.common.util.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                personalization.logArmActive((String) obj, (ConfigContainer) obj2);
                            }
                        });
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return get(this.firebaseApp, str, this.firebaseInstallations, this.firebaseAbt, this.executor, cacheClient, cacheClient2, cacheClient3, getFetchHandler(str, cacheClient, metadataClient), getHandler, metadataClient, getRolloutsStateSubscriptionsHandler(cacheClient2, cacheClient3));
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
