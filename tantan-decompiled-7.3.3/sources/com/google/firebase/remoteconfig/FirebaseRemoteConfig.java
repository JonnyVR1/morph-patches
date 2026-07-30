package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.XmlRes;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigMetadataClient;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.s26;
import p153l.toi0;
import p153l.zdg0;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final ConfigCacheClient activatedConfigsCache;
    private final ConfigRealtimeHandler configRealtimeHandler;
    private final Context context;
    private final ConfigCacheClient defaultConfigsCache;
    private final Executor executor;
    private final ConfigFetchHandler fetchHandler;
    private final ConfigCacheClient fetchedConfigsCache;

    @Nullable
    private final FirebaseABTesting firebaseAbt;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigMetadataClient frcMetadata;
    private final ConfigGetParameterHandler getHandler;
    private final RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler;

    public FirebaseRemoteConfig(Context context, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigMetadataClient configMetadataClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcMetadata = configMetadataClient;
        this.configRealtimeHandler = configRealtimeHandler;
        this.rolloutsStateSubscriptionsHandler = rolloutsStateSubscriptionsHandler;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m16892a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        firebaseRemoteConfig.frcMetadata.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ FirebaseRemoteConfigInfo m16895d(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.mo15427l();
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Task m16899h(final FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2, Task task3) {
        firebaseRemoteConfig.getClass();
        if (!task.mo15431p() || task.mo15427l() == null) {
            return toi0.m192068f(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.mo15427l();
        return (!task2.mo15431p() || isFetchedFresh(configContainer, (ConfigContainer) task2.mo15427l())) ? firebaseRemoteConfig.activatedConfigsCache.put(configContainer).mo15422g(firebaseRemoteConfig.executor, new s26() { // from class: l.qpi
            @Override // p153l.s26
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f158873a.processActivatePutTask(task4));
            }
        }) : toi0.m192068f(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Void m16900i(FirebaseRemoteConfig firebaseRemoteConfig) {
        firebaseRemoteConfig.activatedConfigsCache.clear();
        firebaseRemoteConfig.fetchedConfigsCache.clear();
        firebaseRemoteConfig.defaultConfigsCache.clear();
        firebaseRemoteConfig.frcMetadata.clear();
        return null;
    }

    private static boolean isFetchedFresh(ConfigContainer configContainer, @Nullable ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean processActivatePutTask(Task<ConfigContainer> task) {
        if (!task.mo15431p()) {
            return false;
        }
        this.fetchedConfigsCache.clear();
        ConfigContainer configContainerMo15427l = task.mo15427l();
        if (configContainerMo15427l == null) {
            Log.e(TAG, "Activated configs written to disk are null.");
            return true;
        }
        updateAbtWithActivatedExperiments(configContainerMo15427l.getAbtExperiments());
        this.rolloutsStateSubscriptionsHandler.publishActiveRolloutsState(configContainerMo15427l);
        return true;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).mo15432q(FirebaseExecutors.directExecutor(), new zdg0() { // from class: l.ppi
                @Override // p153l.zdg0
                public final Task then(Object obj) {
                    return toi0.m192068f(null);
                }
            });
        } catch (JSONException e) {
            Log.e(TAG, "The provided defaults map could not be processed.", e);
            return toi0.m192068f(null);
        }
    }

    @VisibleForTesting
    public static List<Map<String, String>> toExperimentInfoMaps(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    @NonNull
    public Task<Boolean> activate() {
        final Task<ConfigContainer> task = this.fetchedConfigsCache.get();
        final Task<ConfigContainer> task2 = this.activatedConfigsCache.get();
        return toi0.m192073k(task, task2).mo15424i(this.executor, new s26() { // from class: l.opi
            @Override // p153l.s26
            public final Object then(Task task3) {
                return FirebaseRemoteConfig.m16899h(this.f148458a, task, task2, task3);
            }
        });
    }

    @NonNull
    public ConfigUpdateListenerRegistration addOnConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        return this.configRealtimeHandler.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    @NonNull
    public Task<FirebaseRemoteConfigInfo> ensureInitialized() {
        Task<ConfigContainer> task = this.activatedConfigsCache.get();
        Task<ConfigContainer> task2 = this.defaultConfigsCache.get();
        Task<ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final Task taskM192065c = toi0.m192065c(this.executor, new Callable() { // from class: l.upi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f180273a.getInfo();
            }
        });
        return toi0.m192073k(task, task2, task3, taskM192065c, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)).mo15422g(this.executor, new s26() { // from class: l.vpi
            @Override // p153l.s26
            public final Object then(Task task4) {
                return FirebaseRemoteConfig.m16895d(taskM192065c, task4);
            }
        });
    }

    @NonNull
    public Task<Void> fetch() {
        return this.fetchHandler.fetch().mo15432q(FirebaseExecutors.directExecutor(), new zdg0() { // from class: l.xpi
            @Override // p153l.zdg0
            public final Task then(Object obj) {
                return toi0.m192068f(null);
            }
        });
    }

    @NonNull
    public Task<Boolean> fetchAndActivate() {
        return fetch().mo15432q(this.executor, new zdg0() { // from class: l.wpi
            @Override // p153l.zdg0
            public final Task then(Object obj) {
                return this.f190304a.activate();
            }
        });
    }

    @NonNull
    public Map<String, FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(@NonNull String str) {
        return this.getHandler.getDouble(str);
    }

    @NonNull
    public FirebaseRemoteConfigInfo getInfo() {
        return this.frcMetadata.getInfo();
    }

    @NonNull
    public Set<String> getKeysByPrefix(@NonNull String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public long getLong(@NonNull String str) {
        return this.getHandler.getLong(str);
    }

    public RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler() {
        return this.rolloutsStateSubscriptionsHandler;
    }

    @NonNull
    public String getString(@NonNull String str) {
        return this.getHandler.getString(str);
    }

    @NonNull
    public FirebaseRemoteConfigValue getValue(@NonNull String str) {
        return this.getHandler.getValue(str);
    }

    @NonNull
    public Task<Void> reset() {
        return toi0.m192065c(this.executor, new Callable() { // from class: l.spi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m16900i(this.f170053a);
            }
        });
    }

    public void schedule(Runnable runnable) {
        this.executor.execute(runnable);
    }

    @NonNull
    public Task<Void> setConfigSettingsAsync(@NonNull final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return toi0.m192065c(this.executor, new Callable() { // from class: l.tpi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m16892a(this.f175604a, firebaseRemoteConfigSettings);
            }
        });
    }

    public void setConfigUpdateBackgroundState(boolean z) {
        this.configRealtimeHandler.setBackgroundState(z);
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@NonNull Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(map2);
    }

    public void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    @VisibleForTesting
    public void updateAbtWithActivatedExperiments(@NonNull JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (AbtException unused) {
        } catch (JSONException e) {
            Log.e(TAG, "Could not parse ABT experiments from the JSON response.", e);
        }
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    public Task<Void> fetch(long j) {
        return this.fetchHandler.fetch(j).mo15432q(FirebaseExecutors.directExecutor(), new zdg0() { // from class: l.rpi
            @Override // p153l.zdg0
            public final Task then(Object obj) {
                return toi0.m192068f(null);
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@XmlRes int i) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
    }
}
