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
import p149l.n16;
import p149l.r5g0;
import p149l.tfi0;

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
    public static /* synthetic */ Void m16837a(FirebaseRemoteConfig firebaseRemoteConfig, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        firebaseRemoteConfig.frcMetadata.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ FirebaseRemoteConfigInfo m16840d(Task task, Task task2) {
        return (FirebaseRemoteConfigInfo) task.mo15373l();
    }

    @NonNull
    public static FirebaseRemoteConfig getInstance(@NonNull FirebaseApp firebaseApp) {
        return ((RemoteConfigComponent) firebaseApp.get(RemoteConfigComponent.class)).getDefault();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Task m16844h(final FirebaseRemoteConfig firebaseRemoteConfig, Task task, Task task2, Task task3) {
        firebaseRemoteConfig.getClass();
        if (!task.mo15377p() || task.mo15373l() == null) {
            return tfi0.m188734f(Boolean.FALSE);
        }
        ConfigContainer configContainer = (ConfigContainer) task.mo15373l();
        return (!task2.mo15377p() || isFetchedFresh(configContainer, (ConfigContainer) task2.mo15373l())) ? firebaseRemoteConfig.activatedConfigsCache.put(configContainer).mo15368g(firebaseRemoteConfig.executor, new n16() { // from class: l.umi
            @Override // p149l.n16
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f177252a.processActivatePutTask(task4));
            }
        }) : tfi0.m188734f(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Void m16845i(FirebaseRemoteConfig firebaseRemoteConfig) {
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
        if (!task.mo15377p()) {
            return false;
        }
        this.fetchedConfigsCache.clear();
        ConfigContainer configContainerMo15373l = task.mo15373l();
        if (configContainerMo15373l == null) {
            Log.e(TAG, "Activated configs written to disk are null.");
            return true;
        }
        updateAbtWithActivatedExperiments(configContainerMo15373l.getAbtExperiments());
        this.rolloutsStateSubscriptionsHandler.publishActiveRolloutsState(configContainerMo15373l);
        return true;
    }

    private Task<Void> setDefaultsWithStringsMapAsync(Map<String, String> map) {
        try {
            return this.defaultConfigsCache.put(ConfigContainer.newBuilder().replaceConfigsWith(map).build()).mo15378q(FirebaseExecutors.directExecutor(), new r5g0() { // from class: l.tmi
                @Override // p149l.r5g0
                public final Task then(Object obj) {
                    return tfi0.m188734f(null);
                }
            });
        } catch (JSONException e) {
            Log.e(TAG, "The provided defaults map could not be processed.", e);
            return tfi0.m188734f(null);
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
        return tfi0.m188739k(task, task2).mo15370i(this.executor, new n16() { // from class: l.smi
            @Override // p149l.n16
            public final Object then(Task task3) {
                return FirebaseRemoteConfig.m16844h(this.f165346a, task, task2, task3);
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
        final Task taskM188731c = tfi0.m188731c(this.executor, new Callable() { // from class: l.ymi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f199017a.getInfo();
            }
        });
        return tfi0.m188739k(task, task2, task3, taskM188731c, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)).mo15368g(this.executor, new n16() { // from class: l.zmi
            @Override // p149l.n16
            public final Object then(Task task4) {
                return FirebaseRemoteConfig.m16840d(taskM188731c, task4);
            }
        });
    }

    @NonNull
    public Task<Void> fetch() {
        return this.fetchHandler.fetch().mo15378q(FirebaseExecutors.directExecutor(), new r5g0() { // from class: l.bni
            @Override // p149l.r5g0
            public final Task then(Object obj) {
                return tfi0.m188734f(null);
            }
        });
    }

    @NonNull
    public Task<Boolean> fetchAndActivate() {
        return fetch().mo15378q(this.executor, new r5g0() { // from class: l.ani
            @Override // p149l.r5g0
            public final Task then(Object obj) {
                return this.f70739a.activate();
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
        return tfi0.m188731c(this.executor, new Callable() { // from class: l.wmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m16845i(this.f187076a);
            }
        });
    }

    public void schedule(Runnable runnable) {
        this.executor.execute(runnable);
    }

    @NonNull
    public Task<Void> setConfigSettingsAsync(@NonNull final FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return tfi0.m188731c(this.executor, new Callable() { // from class: l.xmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FirebaseRemoteConfig.m16837a(this.f193559a, firebaseRemoteConfigSettings);
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
        return this.fetchHandler.fetch(j).mo15378q(FirebaseExecutors.directExecutor(), new r5g0() { // from class: l.vmi
            @Override // p149l.r5g0
            public final Task then(Object obj) {
                return tfi0.m188734f(null);
            }
        });
    }

    @NonNull
    public Task<Void> setDefaultsAsync(@XmlRes int i) {
        return setDefaultsWithStringsMapAsync(DefaultsXmlParser.getDefaultsFromXml(this.context, i));
    }
}
