package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public class ConfigRealtimeHandler {
    private final ConfigCacheClient activatedCacheClient;
    private final ConfigFetchHandler configFetchHandler;

    @GuardedBy("this")
    private final ConfigRealtimeHttpClient configRealtimeHttpClient;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;

    @GuardedBy("this")
    private final Set<ConfigUpdateListener> listeners;
    private final ConfigMetadataClient metadataClient;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;

    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {
        private final ConfigUpdateListener listener;

        public ConfigUpdateListenerRegistrationInternal(ConfigUpdateListener configUpdateListener) {
            this.listener = configUpdateListener;
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration
        public void remove() {
            ConfigRealtimeHandler.this.removeRealtimeConfigUpdateListener(this.listener);
        }
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.listeners = linkedHashSet;
        this.configRealtimeHttpClient = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, linkedHashSet, configMetadataClient, scheduledExecutorService);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCacheClient = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.metadataClient = configMetadataClient;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private synchronized void beginRealtime() {
        if (!this.listeners.isEmpty()) {
            this.configRealtimeHttpClient.startHttpConnection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRealtimeConfigUpdateListener(ConfigUpdateListener configUpdateListener) {
        this.listeners.remove(configUpdateListener);
    }

    @NonNull
    public synchronized ConfigUpdateListenerRegistration addRealtimeConfigUpdateListener(@NonNull ConfigUpdateListener configUpdateListener) {
        this.listeners.add(configUpdateListener);
        beginRealtime();
        return new ConfigUpdateListenerRegistrationInternal(configUpdateListener);
    }

    public synchronized void setBackgroundState(boolean z) {
        this.configRealtimeHttpClient.setRealtimeBackgroundState(z);
        if (!z) {
            beginRealtime();
        }
    }
}
