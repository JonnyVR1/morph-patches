package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
public class CrashlyticsCore {
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 3;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_STACK_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private static final String ON_DEMAND_DROPPED_KEY = "com.crashlytics.on-demand.dropped-exceptions";
    private static final String ON_DEMAND_RECORDED_KEY = "com.crashlytics.on-demand.recorded-exceptions";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;

    @VisibleForTesting
    public final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final FileStore fileStore;
    private final IdManager idManager;
    private CrashlyticsFileMarker initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final RemoteConfigDeferredProxy remoteConfigDeferredProxy;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final long startTime = System.currentTimeMillis();
    private final OnDemandCounter onDemandCounter = new OnDemandCounter();

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.fileStore = fileStore;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.remoteConfigDeferredProxy = remoteConfigDeferredProxy;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16738c(CrashlyticsCore crashlyticsCore, Throwable th) {
        crashlyticsCore.controller.setInternalKey(ON_DEMAND_RECORDED_KEY, Integer.toString(crashlyticsCore.onDemandCounter.getRecordedOnDemandExceptions()));
        crashlyticsCore.controller.setInternalKey(ON_DEMAND_DROPPED_KEY, Integer.toString(crashlyticsCore.onDemandCounter.getDroppedOnDemandExceptions()));
        crashlyticsCore.controller.logFatalException(Thread.currentThread(), th);
    }

    private void checkForPreviousCrash() {
        try {
            this.didCrashOnPreviousExecution = Boolean.TRUE.equals((Boolean) this.crashlyticsWorkers.common.getExecutor().submit(new Callable() { // from class: l.wsb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f187911a.controller.didCrashOnPreviousExecution());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.didCrashOnPreviousExecution = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doBackgroundInitialization(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        markInitializationStarted();
        try {
            try {
                this.breadcrumbSource.registerBreadcrumbHandler(new BreadcrumbHandler() { // from class: l.psb
                    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                    public final void handleBreadcrumb(String str) {
                        this.f150988a.log(str);
                    }
                });
                this.controller.saveVersionControlInfo();
                if (!settingsProvider.getSettingsSync().featureFlagData.collectReports) {
                    Logger.getLogger().m16721d("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.controller.finalizeSessions(settingsProvider)) {
                    Logger.getLogger().m16729w("Previous sessions could not be finalized.");
                }
                this.controller.submitAllReports(settingsProvider.getSettingsAsync());
                markInitializationComplete();
            } catch (Exception e) {
                Logger.getLogger().m16724e("Crashlytics encountered a problem during asynchronous initialization.", e);
                markInitializationComplete();
            }
        } catch (Throwable th) {
            markInitializationComplete();
            throw th;
        }
    }

    private void finishInitSynchronously(final SettingsProvider settingsProvider) {
        Future<?> futureSubmit = this.crashlyticsWorkers.common.getExecutor().submit(new Runnable() { // from class: l.osb
            @Override // java.lang.Runnable
            public final void run() {
                this.f145380a.doBackgroundInitialization(settingsProvider);
            }
        });
        Logger.getLogger().m16721d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.getLogger().m16724e("Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Logger.getLogger().m16724e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.getLogger().m16724e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            Logger.getLogger().m16727v("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".     |  | ");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".   \\ |  | /");
        Log.e(Logger.TAG, ".    \\    /");
        Log.e(Logger.TAG, ".     \\  /");
        Log.e(Logger.TAG, ".      \\/");
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, MISSING_BUILD_ID_MSG);
        Log.e(Logger.TAG, ".");
        Log.e(Logger.TAG, ".      /\\");
        Log.e(Logger.TAG, ".     /  \\");
        Log.e(Logger.TAG, ".    /    \\");
        Log.e(Logger.TAG, ".   / |  | \\");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".     |  |");
        Log.e(Logger.TAG, ".");
        return false;
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        return this.controller.checkForUnsentReports();
    }

    public Task<Void> deleteUnsentReports() {
        return this.controller.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    public Task<Void> doBackgroundInitializationAsync(final SettingsProvider settingsProvider) {
        return this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.msb
            @Override // java.lang.Runnable
            public final void run() {
                this.f135459a.doBackgroundInitialization(settingsProvider);
            }
        });
    }

    public CrashlyticsController getController() {
        return this.controller;
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    public void log(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.xsb
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore crashlyticsCore = this.f194216a;
                crashlyticsCore.crashlyticsWorkers.diskWrite.submit(new Runnable() { // from class: l.vsb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f182818a.controller.writeToLog(j, str);
                    }
                });
            }
        });
    }

    public void logException(@NonNull final Throwable th, @NonNull final Map<String, String> map) {
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.usb
            @Override // java.lang.Runnable
            public final void run() {
                this.f177952a.controller.writeNonFatalException(Thread.currentThread(), th, map);
            }
        });
    }

    public void logFatalException(final Throwable th) {
        Logger.getLogger().m16721d("Recorded on-demand fatal events: " + this.onDemandCounter.getRecordedOnDemandExceptions());
        Logger.getLogger().m16721d("Dropped on-demand fatal events: " + this.onDemandCounter.getDroppedOnDemandExceptions());
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.qsb
            @Override // java.lang.Runnable
            public final void run() {
                CrashlyticsCore.m16738c(this.f156152a, th);
            }
        });
    }

    public void markInitializationComplete() {
        CrashlyticsWorkers.checkBackgroundThread();
        try {
            if (this.initializationMarker.remove()) {
                return;
            }
            Logger.getLogger().m16729w("Initialization marker file was not properly removed.");
        } catch (Exception e) {
            Logger.getLogger().m16724e("Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public void markInitializationStarted() {
        CrashlyticsWorkers.checkBackgroundThread();
        this.initializationMarker.create();
        Logger.getLogger().m16727v("Initialization marker file was created.");
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        if (!isBuildIdValid(appData.buildId, CommonUtils.getBooleanResourceValue(this.context, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            qkq0.m175383a(MISSING_BUILD_ID_MSG);
            return false;
        }
        String sessionId = new CLSUUID().getSessionId();
        try {
            this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, this.fileStore);
            this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, this.fileStore);
            UserMetadata userMetadata = new UserMetadata(sessionId, this.fileStore, this.crashlyticsWorkers);
            LogFileManager logFileManager = new LogFileManager(this.fileStore);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
            this.remoteConfigDeferredProxy.setupListener(userMetadata);
            this.controller = new CrashlyticsController(this.context, this.idManager, this.dataCollectionArbiter, this.fileStore, this.crashMarker, appData, userMetadata, logFileManager, SessionReportingCoordinator.create(this.context, this.idManager, this.fileStore, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.onDemandCounter, this.sessionsSubscriber, this.crashlyticsWorkers), this.nativeComponent, this.analyticsEventLogger, this.sessionsSubscriber, this.crashlyticsWorkers);
            boolean zDidPreviousInitializationFail = didPreviousInitializationFail();
            checkForPreviousCrash();
            this.controller.enableExceptionHandling(sessionId, Thread.getDefaultUncaughtExceptionHandler(), settingsProvider);
            if (!zDidPreviousInitializationFail || !CommonUtils.canTryConnection(this.context)) {
                Logger.getLogger().m16721d("Successfully configured exception handler.");
                return true;
            }
            Logger.getLogger().m16721d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            finishInitSynchronously(settingsProvider);
            return false;
        } catch (Exception e) {
            Logger.getLogger().m16724e("Crashlytics was not started due to an exception during initialization", e);
            this.controller = null;
            return false;
        }
    }

    public Task<Void> sendUnsentReports() {
        return this.controller.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(final String str, final String str2) {
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.ssb
            @Override // java.lang.Runnable
            public final void run() {
                this.f166172a.controller.setCustomKey(str, str2);
            }
        });
    }

    public void setCustomKeys(final Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.nsb
            @Override // java.lang.Runnable
            public final void run() {
                this.f140255a.controller.setCustomKeys(map);
            }
        });
    }

    public void setInternalKey(final String str, final String str2) {
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.tsb
            @Override // java.lang.Runnable
            public final void run() {
                this.f171921a.controller.setInternalKey(str, str2);
            }
        });
    }

    public void setUserId(final String str) {
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: l.rsb
            @Override // java.lang.Runnable
            public final void run() {
                this.f160827a.controller.setUserId(str);
            }
        });
    }
}
