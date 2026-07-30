package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.ProxyNotificationPreferences;
import com.google.firebase.platforminfo.UserAgentPublisher;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.ig3;
import p149l.ng50;
import p149l.r5g0;
import p149l.rfx;
import p149l.sei0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";

    @GuardedBy("FirebaseMessaging.class")
    private static Store store;

    @GuardedBy("FirebaseMessaging.class")
    @VisibleForTesting
    static ScheduledExecutorService syncExecutor;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;

    @Nullable
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;

    @GuardedBy("this")
    private boolean syncScheduledOrRunning;
    private final Task<TopicsSubscriber> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = 28800;

    @VisibleForTesting
    static Provider<TransportFactory> transportFactory = new Provider() { // from class: l.mmi
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return FirebaseMessaging.m16814h();
        }
    };

    public class AutoInit {
        private static final String AUTO_INIT_PREF = "auto_init";
        private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
        private static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";

        @Nullable
        @GuardedBy("this")
        private Boolean autoInitEnabled;

        @Nullable
        @GuardedBy("this")
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;

        @GuardedBy("this")
        private boolean initialized;
        private final Subscriber subscriber;

        public AutoInit(Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m16822a(AutoInit autoInit, Event event) {
            if (autoInit.isEnabled()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        @Nullable
        private Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(AUTO_INIT_PREF)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(AUTO_INIT_PREF, false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(MANIFEST_METADATA_AUTO_INIT_ENABLED)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(MANIFEST_METADATA_AUTO_INIT_ENABLED));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void initialize() {
            try {
                if (this.initialized) {
                    return;
                }
                Boolean enabled = readEnabled();
                this.autoInitEnabled = enabled;
                if (enabled == null) {
                    EventHandler<DataCollectionDefaultChange> eventHandler = new EventHandler() { // from class: com.google.firebase.messaging.g
                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(Event event) {
                            FirebaseMessaging.AutoInit.m16822a(this.f11477a, event);
                        }
                    };
                    this.dataCollectionDefaultChangeEventHandler = eventHandler;
                    this.subscriber.subscribe(DataCollectionDefaultChange.class, eventHandler);
                }
                this.initialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean isEnabled() {
            Boolean bool;
            try {
                initialize();
                bool = this.autoInitEnabled;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
        }

        public synchronized void setEnabled(boolean z) {
            try {
                initialize();
                EventHandler<DataCollectionDefaultChange> eventHandler = this.dataCollectionDefaultChangeEventHandler;
                if (eventHandler != null) {
                    this.subscriber.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                    this.dataCollectionDefaultChangeEventHandler = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean(AUTO_INIT_PREF, z);
                editorEdit.apply();
                if (z) {
                    FirebaseMessaging.this.startSyncIfNecessary();
                }
                this.autoInitEnabled = Boolean.valueOf(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<TransportFactory> provider, Subscriber subscriber, Metadata metadata, GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        } else {
            Objects.toString(applicationContext2);
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: l.imi
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void onNewToken(String str) {
                    this.f113939a.invokeOnTokenRefresh(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: l.jmi
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m16809c(this.f118687a);
            }
        });
        Task<TopicsSubscriber> taskCreateInstance = TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = taskCreateInstance;
        taskCreateInstance.mo15366e(executor2, new ng50() { // from class: com.google.firebase.messaging.c
            @Override // p149l.ng50
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m16819m(this.f11469a, (TopicsSubscriber) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: l.kmi
            @Override // java.lang.Runnable
            public final void run() {
                this.f123795a.initializeProxyNotifications();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m16808b(FirebaseMessaging firebaseMessaging, String str, Store.Token token, String str2) {
        getStore(firebaseMessaging.context).saveToken(firebaseMessaging.getSubtype(), str, str2, firebaseMessaging.metadata.getAppVersionCode());
        if (token == null || !str2.equals(token.token)) {
            firebaseMessaging.invokeOnTokenRefresh(str2);
        }
        return tfi0.m188734f(str2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16809c(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.isAutoInitEnabled()) {
            firebaseMessaging.startSyncIfNecessary();
        }
    }

    @VisibleForTesting
    public static synchronized void clearStoreForTest() {
        store = null;
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new Provider() { // from class: l.lmi
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return FirebaseMessaging.m16817k();
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m16811e(FirebaseMessaging firebaseMessaging, sei0 sei0Var) {
        firebaseMessaging.getClass();
        try {
            sei0Var.m183659c(firebaseMessaging.blockingGetToken());
        } catch (Exception e) {
            sei0Var.m183658b(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m16812f(FirebaseMessaging firebaseMessaging, sei0 sei0Var) {
        firebaseMessaging.getClass();
        try {
            firebaseMessaging.iid.deleteToken(Metadata.getDefaultSenderId(firebaseMessaging.firebaseApp), INSTANCE_ID_SCOPE);
            sei0Var.m183659c(null);
        } catch (Exception e) {
            sei0Var.m183658b(e);
        }
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    @NonNull
    private static synchronized Store getStore(Context context) {
        try {
            if (store == null) {
                store = new Store(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return store;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    @Nullable
    public static TransportFactory getTransportFactory() {
        return transportFactory.get();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ TransportFactory m16814h() {
        return null;
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.getProxyNotificationData().mo15366e(this.initExecutor, new ng50() { // from class: l.pmi
            @Override // p149l.ng50
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m16816j(this.f150228a, (CloudMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeOnTokenRefresh(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                this.firebaseApp.getName();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m16816j(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            MessagingAnalytics.logNotificationReceived(cloudMessage.m12448F());
            firebaseMessaging.handleProxiedNotificationData();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ TransportFactory m16817k() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m16819m(FirebaseMessaging firebaseMessaging, TopicsSubscriber topicsSubscriber) {
        if (firebaseMessaging.isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m16821o(FirebaseMessaging firebaseMessaging, sei0 sei0Var) {
        firebaseMessaging.getClass();
        try {
            tfi0.m188729a(firebaseMessaging.gmsRpc.deleteToken());
            getStore(firebaseMessaging.context).deleteToken(firebaseMessaging.getSubtype(), Metadata.getDefaultSenderId(firebaseMessaging.firebaseApp));
            sei0Var.m183659c(null);
        } catch (Exception e) {
            sei0Var.m183658b(e);
        }
    }

    private boolean shouldRetainProxyNotifications() {
        ProxyNotificationInitializer.initialize(this.context);
        if (!ProxyNotificationInitializer.isProxyNotificationEnabled(this.context)) {
            return false;
        }
        if (this.firebaseApp.get(AnalyticsConnector.class) != null) {
            return true;
        }
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) tfi0.m188729a(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.token;
        }
        final String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
        try {
            return (String) tfi0.m188729a(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new RequestDeduplicator.GetTokenRequest() { // from class: com.google.firebase.messaging.f
                @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f11474a;
                    return firebaseMessaging.gmsRpc.getToken().mo15378q(firebaseMessaging.fileExecutor, new r5g0() { // from class: com.google.firebase.messaging.d
                        @Override // p149l.r5g0
                        public final Task then(Object obj) {
                            return FirebaseMessaging.m16808b(this.f11470a, str, token, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    @NonNull
    public Task<Void> deleteToken() {
        if (this.iid != null) {
            final sei0 sei0Var = new sei0();
            this.initExecutor.execute(new Runnable() { // from class: l.qmi
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.m16812f(this.f155317a, sei0Var);
                }
            });
            return sei0Var.m183657a();
        }
        if (getTokenWithoutTriggeringSync() == null) {
            return tfi0.m188734f(null);
        }
        final sei0 sei0Var2 = new sei0();
        FcmExecutors.newNetworkIOExecutor().execute(new Runnable() { // from class: l.hmi
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m16821o(this.f108430a, sei0Var2);
            }
        });
        return sei0Var2.m183657a();
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    @NonNull
    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        final sei0 sei0Var = new sei0();
        this.initExecutor.execute(new Runnable() { // from class: l.omi
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m16811e(this.f144651a, sei0Var);
            }
        });
        return sei0Var.m183657a();
    }

    @Nullable
    @VisibleForTesting
    public Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
    }

    public Task<TopicsSubscriber> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    @VisibleForTesting
    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public boolean isNotificationDelegationEnabled() {
        return ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
    }

    @Deprecated
    public void send(@NonNull RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            ig3.m135964a("Missing 'to'");
            return;
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, AudioRoutingController.DEVICE_OUT_USB_HEADSET));
        intent.setPackage("com.google.android.gms");
        remoteMessage.populateSendMessageIntent(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z) {
        this.autoInit.setEnabled(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z);
        ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    @NonNull
    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        return ProxyNotificationInitializer.setEnableProxyNotification(this.initExecutor, this.context, z).mo15366e(new rfx(), new ng50() { // from class: l.nmi
            @Override // p149l.ng50
            public final void onSuccess(Object obj) {
                FirebaseMessaging firebaseMessaging = this.f139629a;
                ProxyNotificationPreferences.setProxyRetention(firebaseMessaging.context, firebaseMessaging.gmsRpc, firebaseMessaging.shouldRetainProxyNotifications());
            }
        });
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(@NonNull final String str) {
        return this.topicsSubscriberTask.mo15379r(new r5g0() { // from class: com.google.firebase.messaging.b
            @Override // p149l.r5g0
            public final Task then(Object obj) {
                return ((TopicsSubscriber) obj).subscribeToTopic(str);
            }
        });
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    @VisibleForTesting
    public boolean tokenNeedsRefresh(@Nullable Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(@NonNull final String str) {
        return this.topicsSubscriberTask.mo15379r(new r5g0() { // from class: com.google.firebase.messaging.e
            @Override // p149l.r5g0
            public final Task then(Object obj) {
                return ((TopicsSubscriber) obj).unsubscribeFromTopic(str);
            }
        });
    }

    @NonNull
    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider3, Subscriber subscriber, Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), FcmExecutors.newTaskExecutor(), FcmExecutors.newInitExecutor(), FcmExecutors.newFileIOExecutor());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider<TransportFactory> provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new Metadata(firebaseApp.getApplicationContext()));
    }
}
