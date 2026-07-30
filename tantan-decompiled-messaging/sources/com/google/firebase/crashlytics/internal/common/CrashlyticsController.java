package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.p046p1.mobile.putong.data.Device;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.r5g0;
import p149l.sei0;
import p149l.tfi0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public class CrashlyticsController {
    static final FilenameFilter APP_EXCEPTION_MARKER_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(CrashlyticsController.APP_EXCEPTION_MARKER_PREFIX);
        }
    };
    static final String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    private static final String META_INF_FOLDER = "META-INF/";
    private static final String VERSION_CONTROL_INFO_FILE = "version-control-info.textproto";
    private static final String VERSION_CONTROL_INFO_KEY = "com.crashlytics.version-control-info";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final AppData appData;
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsFileMarker crashMarker;
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FileStore fileStore;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    private final SessionReportingCoordinator reportingCoordinator;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final UserMetadata userMetadata;
    private SettingsProvider settingsProvider = null;
    final sei0<Boolean> unsentReportsAvailable = new sei0<>();
    final sei0<Boolean> reportActionProvided = new sei0<>();
    final sei0<Void> unsentReportsHandled = new sei0<>();
    final AtomicBoolean checkForUnsentReportsCalled = new AtomicBoolean(false);

    public CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        this.context = context;
        this.idManager = idManager;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.fileStore = fileStore;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData;
        this.userMetadata = userMetadata;
        this.logFileManager = logFileManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.analyticsEventLogger = analyticsEventLogger;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
        this.reportingCoordinator = sessionReportingCoordinator;
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    private static StaticSessionData.AppData createAppData(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    private static StaticSessionData.DeviceData createDeviceData(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.calculateTotalRamInBytes(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static StaticSessionData.OsData createOsData() {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doCloseSessions(boolean z, SettingsProvider settingsProvider, boolean z2) {
        String str;
        CrashlyticsWorkers.checkBackgroundThread();
        ArrayList arrayList = new ArrayList(this.reportingCoordinator.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            Logger.getLogger().m16727v("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z ? 1 : 0);
        if (z2 && settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            writeApplicationExitInfoEventIfRelevant(str2);
        } else {
            Logger.getLogger().m16727v("ANR feature disabled.");
        }
        if (z2 && this.nativeComponent.hasCrashDataForSession(str2)) {
            finalizePreviousNativeSession(str2);
        }
        if (z != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.sessionsSubscriber.setSessionId(null);
            str = null;
        }
        this.reportingCoordinator.finalizeSessions(getCurrentTimestampSeconds(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession(String str, Boolean bool) {
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        Logger.getLogger().m16721d("Opening a new session with ID " + str);
        this.nativeComponent.prepareNativeSession(str, String.format(Locale.US, GENERATOR_FORMAT, CrashlyticsCore.getVersion()), currentTimestampSeconds, StaticSessionData.create(createAppData(this.idManager, this.appData), createOsData(), createDeviceData(this.context)));
        if (bool.booleanValue() && str != null) {
            this.userMetadata.setNewSession(str);
        }
        this.logFileManager.setCurrentSession(str);
        this.sessionsSubscriber.setSessionId(str);
        this.reportingCoordinator.onBeginSession(str, currentTimestampSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWriteAppExceptionMarker(long j) {
        try {
            if (this.fileStore.getCommonFile(APP_EXCEPTION_MARKER_PREFIX + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Logger.getLogger().m16730w("Could not create app exception marker file.", e);
        }
    }

    private void finalizePreviousNativeSession(String str) {
        Logger.getLogger().m16727v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.nativeComponent.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
        if (nativeCoreAbsent(str, minidumpFile, applicationExitInto)) {
            Logger.getLogger().m16729w("No native core present");
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.fileStore, str);
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().m16729w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        doWriteAppExceptionMarker(jLastModified);
        List<NativeSessionFile> nativeSessionFiles = getNativeSessionFiles(sessionFileProvider, str, this.fileStore, logFileManager.getBytesForLog());
        NativeSessionFileGzipper.processNativeSessions(nativeSessionDir, nativeSessionFiles);
        Logger.getLogger().m16721d("CrashlyticsController#finalizePreviousNativeSession");
        this.reportingCoordinator.finalizeSessionWithNativeEvent(str, nativeSessionFiles, applicationExitInto);
        logFileManager.clearLog();
    }

    private static boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String getCurrentSessionId() {
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.reportingCoordinator.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    private static long getCurrentTimestampSeconds() {
        return getTimestampSeconds(System.currentTimeMillis());
    }

    @NonNull
    public static List<NativeSessionFile> getNativeSessionFiles(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File sessionFile = fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        File sessionFile2 = fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        File sessionFile3 = fileStore.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", LogUtil.DIR_TAIL, bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", Device.TYPE, nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(nativeCoreFile(nativeSessionFileProvider));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", sessionFile));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", UserMetadata.KEYDATA_FILENAME, sessionFile2));
        arrayList.add(new FileBackedNativeSessionFile("rollouts_file", "rollouts", sessionFile3));
        return arrayList;
    }

    private InputStream getResourceAsStream(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Logger.getLogger().m16729w("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        Logger.getLogger().m16725i("No version control information found");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTimestampSeconds(long j) {
        return j / 1000;
    }

    private Task<Void> logAnalyticsAppExceptionEvent(final long j) {
        if (firebaseCrashExists()) {
            Logger.getLogger().m16729w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return tfi0.m188734f(null);
        }
        Logger.getLogger().m16721d("Logging app exception event to Firebase Analytics");
        return tfi0.m188731c(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt(CrashlyticsController.FIREBASE_CRASH_TYPE, 1);
                bundle.putLong(CrashlyticsController.FIREBASE_TIMESTAMP, j);
                CrashlyticsController.this.analyticsEventLogger.logEvent(CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION, bundle);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> logAnalyticsAppExceptionEvents() {
        ArrayList arrayList = new ArrayList();
        for (File file : listAppExceptionMarkerFiles()) {
            try {
                arrayList.add(logAnalyticsAppExceptionEvent(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger.getLogger().m16729w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return tfi0.m188735g(arrayList);
    }

    private static boolean nativeCoreAbsent(String str, File file, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        if (file == null || !file.exists()) {
            Logger.getLogger().m16729w("No minidump data found for session " + str);
        }
        if (applicationExitInfo == null) {
            Logger.getLogger().m16725i("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && applicationExitInfo == null;
    }

    private static NativeSessionFile nativeCoreFile(NativeSessionFileProvider nativeSessionFileProvider) {
        File minidumpFile = nativeSessionFileProvider.getMinidumpFile();
        return (minidumpFile == null || !minidumpFile.exists()) ? new BytesBackedNativeSessionFile("minidump_file", "minidump", new byte[]{0}) : new FileBackedNativeSessionFile("minidump_file", "minidump", minidumpFile);
    }

    private static byte[] readResource(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    private Task<Boolean> waitForReportAction() {
        if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().m16721d("Automatic data collection is enabled. Allowing upload.");
            this.unsentReportsAvailable.m183661e(Boolean.FALSE);
            return tfi0.m188734f(Boolean.TRUE);
        }
        Logger.getLogger().m16721d("Automatic data collection is disabled.");
        Logger.getLogger().m16727v("Notifying that unsent reports are available.");
        this.unsentReportsAvailable.m183661e(Boolean.TRUE);
        Task<TContinuationResult> taskMo15379r = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().mo15379r(new r5g0<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            @Override // p149l.r5g0
            @NonNull
            public Task<Boolean> then(@Nullable Void r1) throws Exception {
                return tfi0.m188734f(Boolean.TRUE);
            }
        });
        Logger.getLogger().m16721d("Waiting for send/deleteUnsentReports to be called.");
        return CrashlyticsTasks.race(taskMo15379r, this.reportActionProvided.m183657a());
    }

    private void writeApplicationExitInfoEventIfRelevant(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            Logger.getLogger().m16727v("ANR feature enabled, but device is API " + i);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.reportingCoordinator.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, new LogFileManager(this.fileStore, str), UserMetadata.loadFromExistingSession(str, this.fileStore, this.crashlyticsWorkers));
        } else {
            Logger.getLogger().m16727v("No ApplicationExitInfo available. Session: " + str);
        }
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        if (this.checkForUnsentReportsCalled.compareAndSet(false, true)) {
            return this.unsentReportsAvailable.m183657a();
        }
        Logger.getLogger().m16729w("checkForUnsentReports should only be called once per execution.");
        return tfi0.m188734f(Boolean.FALSE);
    }

    public Task<Void> deleteUnsentReports() {
        this.reportActionProvided.m183661e(Boolean.FALSE);
        return this.unsentReportsHandled.m183657a();
    }

    public boolean didCrashOnPreviousExecution() {
        CrashlyticsWorkers.checkBackgroundThread();
        if (!this.crashMarker.isPresent()) {
            String currentSessionId = getCurrentSessionId();
            return currentSessionId != null && this.nativeComponent.hasCrashDataForSession(currentSessionId);
        }
        Logger.getLogger().m16727v("Found previous crash marker.");
        this.crashMarker.remove();
        return true;
    }

    public void enableExceptionHandling(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.settingsProvider = settingsProvider;
        openSession(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(@NonNull SettingsProvider settingsProvider2, @NonNull Thread thread, @NonNull Throwable th) throws Throwable {
                CrashlyticsController.this.handleUncaughtException(settingsProvider2, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.nativeComponent);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    public boolean finalizeSessions(SettingsProvider settingsProvider) {
        CrashlyticsWorkers.checkBackgroundThread();
        if (isHandlingException()) {
            Logger.getLogger().m16729w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().m16727v("Finalizing previously open sessions.");
        try {
            doCloseSessions(true, settingsProvider, true);
            Logger.getLogger().m16727v("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.getLogger().m16724e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public UserMetadata getUserMetadata() {
        return this.userMetadata;
    }

    public String getVersionControlInfo() throws IOException {
        InputStream resourceAsStream = getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            return null;
        }
        Logger.getLogger().m16721d("Read version control info");
        return Base64.encodeToString(readResource(resourceAsStream), 0);
    }

    public synchronized void handleUncaughtException(@NonNull final SettingsProvider settingsProvider, @NonNull final Thread thread, @NonNull final Throwable th, final boolean z) throws Throwable {
        CrashlyticsController crashlyticsController;
        try {
            try {
                Logger.getLogger().m16721d("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
                final long jCurrentTimeMillis = System.currentTimeMillis();
                crashlyticsController = this;
                Task taskSubmitTask = this.crashlyticsWorkers.common.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public Task<Void> call() throws Exception {
                        long timestampSeconds = CrashlyticsController.getTimestampSeconds(jCurrentTimeMillis);
                        final String currentSessionId = CrashlyticsController.this.getCurrentSessionId();
                        if (currentSessionId == null) {
                            Logger.getLogger().m16723e("Tried to write a fatal exception while no session was open.");
                            return tfi0.m188734f(null);
                        }
                        CrashlyticsController.this.crashMarker.create();
                        CrashlyticsController.this.reportingCoordinator.persistFatalEvent(th, thread, currentSessionId, timestampSeconds);
                        CrashlyticsController.this.doWriteAppExceptionMarker(jCurrentTimeMillis);
                        CrashlyticsController.this.doCloseSessions(settingsProvider);
                        CrashlyticsController.this.doOpenSession(new CLSUUID().getSessionId(), Boolean.valueOf(z));
                        return !CrashlyticsController.this.dataCollectionArbiter.isAutomaticDataCollectionEnabled() ? tfi0.m188734f(null) : settingsProvider.getSettingsAsync().mo15378q(CrashlyticsController.this.crashlyticsWorkers.common, new r5g0<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                            @Override // p149l.r5g0
                            @NonNull
                            public Task<Void> then(@Nullable Settings settings) throws Exception {
                                if (settings != null) {
                                    return tfi0.m188736h(CrashlyticsController.this.logAnalyticsAppExceptionEvents(), CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common, z ? currentSessionId : null));
                                }
                                Logger.getLogger().m16729w("Received null app settings, cannot send reports at crash time.");
                                return tfi0.m188734f(null);
                            }
                        });
                    }
                });
                if (!z) {
                    try {
                        Utils.awaitEvenIfOnMainThread(taskSubmitTask);
                    } catch (TimeoutException unused) {
                        Logger.getLogger().m16723e("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e) {
                        Logger.getLogger().m16724e("Error handling uncaught exception", e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                crashlyticsController = this;
                Throwable th3 = th;
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    public List<File> listAppExceptionMarkerFiles() {
        return this.fileStore.getCommonFiles(APP_EXCEPTION_MARKER_FILTER);
    }

    public void logFatalException(Thread thread, Throwable th) {
        SettingsProvider settingsProvider = this.settingsProvider;
        if (settingsProvider == null) {
            Logger.getLogger().m16729w("settingsProvider not set");
        } else {
            handleUncaughtException(settingsProvider, thread, th, true);
        }
    }

    public void openSession(final String str) {
        this.crashlyticsWorkers.common.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f11444a.doOpenSession(str, Boolean.FALSE);
            }
        });
    }

    public void saveVersionControlInfo() {
        try {
            String versionControlInfo = getVersionControlInfo();
            if (versionControlInfo != null) {
                setInternalKey(VERSION_CONTROL_INFO_KEY, versionControlInfo);
                Logger.getLogger().m16725i("Saved version control info");
            }
        } catch (IOException e) {
            Logger.getLogger().m16730w("Unable to save version control info", e);
        }
    }

    public Task<Void> sendUnsentReports() {
        this.reportActionProvided.m183661e(Boolean.TRUE);
        return this.unsentReportsHandled.m183657a();
    }

    public void setCustomKey(String str, String str2) {
        try {
            this.userMetadata.setCustomKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m16723e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setCustomKeys(Map<String, String> map) {
        this.userMetadata.setCustomKeys(map);
    }

    public void setInternalKey(String str, String str2) {
        try {
            this.userMetadata.setInternalKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m16723e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setUserId(String str) {
        this.userMetadata.setUserId(str);
    }

    public void submitAllReports(final Task<Settings> task) {
        if (this.reportingCoordinator.hasReportsToSend()) {
            Logger.getLogger().m16727v("Crash reports are available to be sent.");
            waitForReportAction().mo15378q(this.crashlyticsWorkers.common, new r5g0<Boolean, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
                @Override // p149l.r5g0
                @NonNull
                public Task<Void> then(@Nullable Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        Logger.getLogger().m16721d("Sending cached crash reports...");
                        CrashlyticsController.this.dataCollectionArbiter.grantDataCollectionPermission(bool.booleanValue());
                        return task.mo15378q(CrashlyticsController.this.crashlyticsWorkers.common, new r5g0<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                            @Override // p149l.r5g0
                            @NonNull
                            public Task<Void> then(@Nullable Settings settings) throws Exception {
                                if (settings == null) {
                                    Logger.getLogger().m16729w("Received null app settings at app startup. Cannot send cached reports");
                                    return tfi0.m188734f(null);
                                }
                                CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                                CrashlyticsController.this.reportingCoordinator.sendReports(CrashlyticsController.this.crashlyticsWorkers.common);
                                CrashlyticsController.this.unsentReportsHandled.m183661e(null);
                                return tfi0.m188734f(null);
                            }
                        });
                    }
                    Logger.getLogger().m16727v("Deleting cached crash reports...");
                    CrashlyticsController.deleteFiles(CrashlyticsController.this.listAppExceptionMarkerFiles());
                    CrashlyticsController.this.reportingCoordinator.removeAllReports();
                    CrashlyticsController.this.unsentReportsHandled.m183661e(null);
                    return tfi0.m188734f(null);
                }
            });
        } else {
            Logger.getLogger().m16727v("No crash reports are available to be sent.");
            this.unsentReportsAvailable.m183661e(Boolean.FALSE);
        }
    }

    public void writeNonFatalException(@NonNull Thread thread, @NonNull Throwable th, @NonNull Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (isHandlingException()) {
            return;
        }
        long timestampSeconds = getTimestampSeconds(jCurrentTimeMillis);
        String currentSessionId = getCurrentSessionId();
        if (currentSessionId == null) {
            Logger.getLogger().m16729w("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.reportingCoordinator.persistNonFatalEvent(th, thread, new EventMetadata(currentSessionId, timestampSeconds, map));
        }
    }

    public void writeToLog(long j, String str) {
        if (isHandlingException()) {
            return;
        }
        this.logFileManager.writeToLog(j, str);
    }

    public void handleUncaughtException(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th) throws Throwable {
        handleUncaughtException(settingsProvider, thread, th, false);
    }

    public void doCloseSessions(SettingsProvider settingsProvider) {
        doCloseSessions(false, settingsProvider, false);
    }
}
