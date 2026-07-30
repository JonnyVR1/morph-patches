package com.google.firebase.iid;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.Constants;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p149l.n16;
import p149l.ng50;
import p149l.phg0;
import p149l.qkq0;
import p149l.r5g0;
import p149l.rhg0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class FirebaseInstanceId {
    private static Store store;

    @VisibleForTesting
    static ScheduledExecutorService syncExecutor;
    private final FirebaseApp app;

    @VisibleForTesting
    final Executor fileIoExecutor;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Metadata metadata;
    private final List<FirebaseInstanceIdInternal.NewTokenListener> newTokenListeners;
    private final RequestDeduplicator requestDeduplicator;
    private final GmsRpc rpc;
    private boolean syncScheduledOrRunning;
    private static final long MAX_DELAY_SEC = 28800;
    private static final Pattern API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(FirebaseApp firebaseApp, Metadata metadata, Executor executor, Executor executor2, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.syncScheduledOrRunning = false;
        this.newTokenListeners = new ArrayList();
        if (Metadata.getDefaultSenderId(firebaseApp) == null) {
            qkq0.m175383a("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
            throw null;
        }
        synchronized (FirebaseInstanceId.class) {
            try {
                if (store == null) {
                    store = new Store(firebaseApp.getApplicationContext());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        this.fileIoExecutor = executor2;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.firebaseInstallations = firebaseInstallationsApi;
    }

    private <T> T awaitTask(Task<T> task) throws IOException {
        try {
            return (T) tfi0.m188730b(task, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            rhg0.m179353a(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
            return null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    resetStorage();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    private static <T> T awaitTaskAllowOnMainThread(@NonNull Task<T> task) throws InterruptedException {
        Preconditions.checkNotNull(task, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.mo15363b(FirebaseInstanceId$$Lambda$1.$instance, new OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$2
            private final CountDownLatch arg$1;

            {
                this.arg$1 = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task2) {
                this.arg$1.countDown();
            }
        });
        countDownLatch.await(HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT, TimeUnit.MILLISECONDS);
        return (T) getResultOrThrowException(task);
    }

    private static void checkRequiredFirebaseOptions(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(isValidAppIdFormat(firebaseApp.getOptions().getApplicationId()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(isValidApiKeyFormat(firebaseApp.getOptions().getApiKey()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @VisibleForTesting
    @KeepForSdk
    public static synchronized void clearInstancesForTest() {
        try {
            ScheduledExecutorService scheduledExecutorService = syncExecutor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            syncExecutor = null;
            store = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NonNull
    @Keep
    public static FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        checkRequiredFirebaseOptions(firebaseApp);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
        Preconditions.checkNotNull(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    private Task<InstanceIdResult> getInstanceId(final String str, String str2) {
        final String strRationaliseScope = rationaliseScope(str2);
        return tfi0.m188734f(null).mo15370i(this.fileIoExecutor, new n16(this, str, strRationaliseScope) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$0
            private final FirebaseInstanceId arg$1;
            private final String arg$2;
            private final String arg$3;

            {
                this.arg$1 = this;
                this.arg$2 = str;
                this.arg$3 = strRationaliseScope;
            }

            @Override // p149l.n16
            public Object then(Task task) {
                return this.arg$1.lambda$getInstanceId$3$FirebaseInstanceId(this.arg$2, this.arg$3, task);
            }
        });
    }

    private static <T> T getResultOrThrowException(@NonNull Task<T> task) {
        if (task.mo15377p()) {
            return task.mo15373l();
        }
        if (task.mo15375n()) {
            throw new CancellationException("Task is already canceled");
        }
        if (!task.mo15376o()) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        phg0.m168968a(task.mo15372k());
        return null;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.app.getName()) ? "" : this.app.getPersistenceKey();
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    public static boolean isValidApiKeyFormat(String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }

    public static boolean isValidAppIdFormat(String str) {
        return str.contains(":");
    }

    private static String rationaliseScope(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase(Constants.ScionAnalytics.ORIGIN_FCM) || str.equalsIgnoreCase(Constants.MessageTypes.MESSAGE)) ? "*" : str;
    }

    private void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public void addNewTokenListener(FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
        this.newTokenListeners.add(newTokenListener);
    }

    public String blockingGetMasterToken() throws IOException {
        return getToken(Metadata.getDefaultSenderId(this.app), "*");
    }

    @WorkerThread
    @Deprecated
    public void deleteInstanceId() throws IOException {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            rhg0.m179353a("MAIN_THREAD");
        } else {
            awaitTask(this.firebaseInstallations.delete());
            resetStorage();
        }
    }

    @WorkerThread
    @Deprecated
    public void deleteToken(@NonNull String str, @NonNull String str2) throws IOException {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            rhg0.m179353a("MAIN_THREAD");
            return;
        }
        String strRationaliseScope = rationaliseScope(str2);
        awaitTask(this.rpc.deleteToken(getIdWithoutTriggeringSync(), str, strRationaliseScope));
        store.deleteToken(getSubtype(), str, strRationaliseScope);
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
                }
                syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseApp getApp() {
        return this.app;
    }

    public long getCreationTime() {
        return store.getCreationTime(this.app.getPersistenceKey());
    }

    @NonNull
    @WorkerThread
    @Deprecated
    public String getId() {
        checkRequiredFirebaseOptions(this.app);
        startSyncIfNecessary();
        return getIdWithoutTriggeringSync();
    }

    public String getIdWithoutTriggeringSync() {
        try {
            store.setCreationTime(this.app.getPersistenceKey());
            return (String) awaitTaskAllowOnMainThread(this.firebaseInstallations.getId());
        } catch (InterruptedException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    @Nullable
    @WorkerThread
    @Deprecated
    public String getToken(@NonNull String str, @NonNull String str2) throws IOException {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) awaitTask(getInstanceId(str, str2))).getToken();
        }
        rhg0.m179353a("MAIN_THREAD");
        return null;
    }

    @Nullable
    public Store.Token getTokenWithoutTriggeringSync() {
        return getTokenWithoutTriggeringSync(Metadata.getDefaultSenderId(this.app), "*");
    }

    @VisibleForTesting
    @KeepForSdk
    public boolean isFcmAutoInitEnabled() {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    @VisibleForTesting
    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    public final /* synthetic */ Task lambda$getInstanceId$0$FirebaseInstanceId(String str, String str2, String str3, String str4) throws Exception {
        store.saveToken(getSubtype(), str, str2, str4, this.metadata.getAppVersionCode());
        return tfi0.m188734f(new InstanceIdResultImpl(str3, str4));
    }

    public final /* synthetic */ void lambda$getInstanceId$1$FirebaseInstanceId(Store.Token token, InstanceIdResult instanceIdResult) {
        String token2 = instanceIdResult.getToken();
        if (token == null || !token2.equals(token.token)) {
            Iterator<FirebaseInstanceIdInternal.NewTokenListener> it = this.newTokenListeners.iterator();
            while (it.hasNext()) {
                it.next().onNewToken(token2);
            }
        }
    }

    public final /* synthetic */ Task lambda$getInstanceId$2$FirebaseInstanceId(final String str, final String str2, final String str3, final Store.Token token) {
        return this.rpc.getToken(str, str2, str3).mo15378q(this.fileIoExecutor, new r5g0(this, str2, str3, str) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$4
            private final FirebaseInstanceId arg$1;
            private final String arg$2;
            private final String arg$3;
            private final String arg$4;

            {
                this.arg$1 = this;
                this.arg$2 = str2;
                this.arg$3 = str3;
                this.arg$4 = str;
            }

            @Override // p149l.r5g0
            public Task then(Object obj) {
                return this.arg$1.lambda$getInstanceId$0$FirebaseInstanceId(this.arg$2, this.arg$3, this.arg$4, (String) obj);
            }
        }).mo15366e(FirebaseInstanceId$$Lambda$5.$instance, new ng50(this, token) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$6
            private final FirebaseInstanceId arg$1;
            private final Store.Token arg$2;

            {
                this.arg$1 = this;
                this.arg$2 = token;
            }

            @Override // p149l.ng50
            public void onSuccess(Object obj) {
                this.arg$1.lambda$getInstanceId$1$FirebaseInstanceId(this.arg$2, (InstanceIdResult) obj);
            }
        });
    }

    public final /* synthetic */ Task lambda$getInstanceId$3$FirebaseInstanceId(final String str, final String str2, Task task) throws Exception {
        final String idWithoutTriggeringSync = getIdWithoutTriggeringSync();
        final Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync(str, str2);
        return !tokenNeedsRefresh(tokenWithoutTriggeringSync) ? tfi0.m188734f(new InstanceIdResultImpl(idWithoutTriggeringSync, tokenWithoutTriggeringSync.token)) : this.requestDeduplicator.getOrStartGetTokenRequest(str, str2, new RequestDeduplicator.GetTokenRequest(this, idWithoutTriggeringSync, str, str2, tokenWithoutTriggeringSync) { // from class: com.google.firebase.iid.FirebaseInstanceId$$Lambda$3
            private final FirebaseInstanceId arg$1;
            private final String arg$2;
            private final String arg$3;
            private final String arg$4;
            private final Store.Token arg$5;

            {
                this.arg$1 = this;
                this.arg$2 = idWithoutTriggeringSync;
                this.arg$3 = str;
                this.arg$4 = str2;
                this.arg$5 = tokenWithoutTriggeringSync;
            }

            @Override // com.google.firebase.iid.RequestDeduplicator.GetTokenRequest
            public Task start() {
                return this.arg$1.lambda$getInstanceId$2$FirebaseInstanceId(this.arg$2, this.arg$3, this.arg$4, this.arg$5);
            }
        });
    }

    public synchronized void resetStorage() {
        store.deleteAll();
    }

    @VisibleForTesting
    @KeepForSdk
    public void setFcmAutoInitEnabled(boolean z) {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    public synchronized void startSync() {
        if (this.syncScheduledOrRunning) {
            return;
        }
        syncWithDelaySecondsInternal(0L);
    }

    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(30L, j + j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(@Nullable Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    @Nullable
    @VisibleForTesting
    public Store.Token getTokenWithoutTriggeringSync(String str, String str2) {
        return store.getToken(getSubtype(), str, str2);
    }

    @NonNull
    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    @Deprecated
    public Task<InstanceIdResult> getInstanceId() {
        checkRequiredFirebaseOptions(this.app);
        return getInstanceId(Metadata.getDefaultSenderId(this.app), "*");
    }

    @Nullable
    @Deprecated
    public String getToken() {
        checkRequiredFirebaseOptions(this.app);
        Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            startSync();
        }
        return Store.Token.getTokenOrNull(tokenWithoutTriggeringSync);
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, new Metadata(firebaseApp.getApplicationContext()), FirebaseIidExecutors.newCachedSingleThreadExecutor(), FirebaseIidExecutors.newCachedSingleThreadExecutor(), provider, provider2, firebaseInstallationsApi);
    }
}
