package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p149l.n16;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
public class ConfigRealtimeHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";

    @VisibleForTesting
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String X_ACCEPT_RESPONSE_STREAMING = "X-Accept-Response-Streaming";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;

    @GuardedBy("this")
    private int httpRetriesRemaining;

    @GuardedBy("this")
    private final Set<ConfigUpdateListener> listeners;
    private final ConfigMetadataClient metadataClient;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;
    private final int ORIGINAL_RETRIES = 8;

    @GuardedBy("this")
    private boolean isHttpConnectionRunning = false;
    private final Random random = new Random();
    private final Clock clock = DefaultClock.getInstance();

    @GuardedBy("this")
    private boolean isRealtimeDisabled = false;
    private boolean isInBackground = false;

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService) {
        this.listeners = set;
        this.scheduledExecutorService = scheduledExecutorService;
        this.httpRetriesRemaining = Math.max(8 - configMetadataClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.metadataClient = configMetadataClient;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16858a(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2) throws Throwable {
        Integer numValueOf;
        Throwable th;
        HttpURLConnection httpURLConnection;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        configRealtimeHttpClient.getClass();
        boolean z = true;
        try {
            if (!task.mo15377p()) {
                throw new IOException(task.mo15372k());
            }
            configRealtimeHttpClient.setIsHttpConnectionRunning(true);
            httpURLConnection = (HttpURLConnection) task.mo15373l();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        configRealtimeHttpClient.resetRetryCount();
                        configRealtimeHttpClient.metadataClient.resetRealtimeBackoff();
                        configRealtimeHttpClient.startAutoFetch(httpURLConnection).listenForNotifications();
                    } catch (IOException unused) {
                        configRealtimeHttpClient.closeRealtimeHttpStream(httpURLConnection);
                        configRealtimeHttpClient.setIsHttpConnectionRunning(false);
                        if (numValueOf != null && !configRealtimeHttpClient.isStatusCodeRetryable(numValueOf.intValue())) {
                            z = false;
                        }
                        if (z) {
                            configRealtimeHttpClient.updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(configRealtimeHttpClient.clock.currentTimeMillis()));
                        }
                        if (z || numValueOf.intValue() == 200) {
                            configRealtimeHttpClient.retryHttpConnectionWhenBackoffEnds();
                        } else {
                            String forbiddenErrorResponseMessage = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                forbiddenErrorResponseMessage = configRealtimeHttpClient.parseForbiddenErrorResponseMessage(httpURLConnection.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                        }
                        return tfi0.m188734f(null);
                    } catch (Throwable th2) {
                        th = th2;
                        configRealtimeHttpClient.closeRealtimeHttpStream(httpURLConnection);
                        configRealtimeHttpClient.setIsHttpConnectionRunning(false);
                        if (numValueOf != null && !configRealtimeHttpClient.isStatusCodeRetryable(numValueOf.intValue())) {
                            z = false;
                        }
                        if (z) {
                            configRealtimeHttpClient.updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(configRealtimeHttpClient.clock.currentTimeMillis()));
                        }
                        if (z || numValueOf.intValue() == 200) {
                            configRealtimeHttpClient.retryHttpConnectionWhenBackoffEnds();
                        } else {
                            String forbiddenErrorResponseMessage2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                forbiddenErrorResponseMessage2 = configRealtimeHttpClient.parseForbiddenErrorResponseMessage(httpURLConnection.getErrorStream());
                            }
                            configRealtimeHttpClient.propagateErrors(new FirebaseRemoteConfigServerException(numValueOf.intValue(), forbiddenErrorResponseMessage2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                        }
                        throw th;
                    }
                }
                configRealtimeHttpClient.closeRealtimeHttpStream(httpURLConnection);
                configRealtimeHttpClient.setIsHttpConnectionRunning(false);
                boolean zIsStatusCodeRetryable = configRealtimeHttpClient.isStatusCodeRetryable(responseCode);
                if (zIsStatusCodeRetryable) {
                    configRealtimeHttpClient.updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(configRealtimeHttpClient.clock.currentTimeMillis()));
                }
                if (zIsStatusCodeRetryable || responseCode == 200) {
                    configRealtimeHttpClient.retryHttpConnectionWhenBackoffEnds();
                } else {
                    String forbiddenErrorResponseMessage3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                    if (responseCode == 403) {
                        forbiddenErrorResponseMessage3 = configRealtimeHttpClient.parseForbiddenErrorResponseMessage(httpURLConnection.getErrorStream());
                    }
                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, forbiddenErrorResponseMessage3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                    configRealtimeHttpClient.propagateErrors(firebaseRemoteConfigServerException);
                }
            } catch (IOException unused2) {
                numValueOf = null;
            } catch (Throwable th3) {
                numValueOf = null;
                th = th3;
            }
            return tfi0.m188734f(null);
        } catch (IOException unused3) {
            httpURLConnection = null;
            numValueOf = null;
        } catch (Throwable th4) {
            numValueOf = null;
            th = th4;
            httpURLConnection = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m16859b(ConfigRealtimeHttpClient configRealtimeHttpClient, Task task, Task task2, Task task3) {
        configRealtimeHttpClient.getClass();
        if (!task.mo15377p()) {
            return tfi0.m188733e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.mo15372k()));
        }
        if (!task2.mo15377p()) {
            return tfi0.m188733e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.mo15372k()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) configRealtimeHttpClient.getUrl().openConnection();
            configRealtimeHttpClient.setRequestParams(httpURLConnection, (String) task2.mo15373l(), ((InstallationTokenResult) task.mo15373l()).getToken());
            return tfi0.m188734f(httpURLConnection);
        } catch (IOException e) {
            return tfi0.m188733e(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
        }
    }

    private synchronized boolean canMakeHttpStreamConnection() {
        return (this.listeners.isEmpty() || this.isHttpConnectionRunning || this.isRealtimeDisabled || this.isInBackground) ? false : true;
    }

    private JSONObject createRequestBody(String str) {
        HashMap map = new HashMap();
        map.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        map.put("namespace", this.namespace);
        map.put("lastKnownVersionNumber", Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.firebaseApp.getOptions().getApplicationId());
        map.put("sdkVersion", BuildConfig.VERSION_NAME);
        map.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void enableBackoff() {
        this.isRealtimeDisabled = true;
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e(FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.context.getPackageName();
            return null;
        }
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i - 1]);
        return (millis / 2) + ((long) this.random.nextInt((int) millis));
    }

    private String getRealtimeURL(String str) {
        return String.format(RemoteConfigConstants.REALTIME_REGEX_URL, extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), str);
    }

    private URL getUrl() {
        try {
            return new URL(getRealtimeURL(this.namespace));
        } catch (MalformedURLException unused) {
            Log.e(FirebaseRemoteConfig.TAG, "URL is malformed");
            return null;
        }
    }

    private boolean isStatusCodeRetryable(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    private synchronized void makeRealtimeHttpConnection(long j) {
        try {
            if (canMakeHttpStreamConnection()) {
                int i = this.httpRetriesRemaining;
                if (i > 0) {
                    this.httpRetriesRemaining = i - 1;
                    this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else if (!this.isInBackground) {
                    propagateErrors(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String parseForbiddenErrorResponseMessage(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void resetRetryCount() {
        this.httpRetriesRemaining = 8;
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(X_ACCEPT_RESPONSE_STREAMING, "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void setIsHttpConnectionRunning(boolean z) {
        this.isHttpConnectionRunning = z;
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int numFailedStreams = this.metadataClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.metadataClient.setRealtimeBackoffMetadata(numFailedStreams, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void beginRealtimeHttpStream() {
        if (canMakeHttpStreamConnection()) {
            if (new Date(this.clock.currentTimeMillis()).before(this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime())) {
                retryHttpConnectionWhenBackoffEnds();
            } else {
                final Task<HttpURLConnection> taskCreateRealtimeConnection = createRealtimeConnection();
                tfi0.m188739k(taskCreateRealtimeConnection).mo15368g(this.scheduledExecutorService, new n16() { // from class: l.lv5
                    @Override // p149l.n16
                    public final Object then(Task task) {
                        return ConfigRealtimeHttpClient.m16858a(this.f130124a, taskCreateRealtimeConnection, task);
                    }
                });
            }
        }
    }

    public void closeRealtimeHttpStream(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> createRealtimeConnection() {
        final Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
        final Task<String> id = this.firebaseInstallations.getId();
        return tfi0.m188739k(token, id).mo15370i(this.scheduledExecutorService, new n16() { // from class: l.kv5
            @Override // p149l.n16
            public final Object then(Task task) {
                return ConfigRealtimeHttpClient.m16859b(this.f124749a, token, id, task);
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public Date getBackoffEndTime() {
        return this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime();
    }

    @SuppressLint({"VisibleForTests"})
    public int getNumberOfFailedStreams() {
        return this.metadataClient.getRealtimeBackoffMetadata().getNumFailedStreams();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        makeRealtimeHttpConnection(Math.max(0L, this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new Date(this.clock.currentTimeMillis()).getTime()));
    }

    public void setRealtimeBackgroundState(boolean z) {
        this.isInBackground = z;
    }

    @SuppressLint({"VisibleForTests"})
    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.configFetchHandler, this.activatedCache, this.listeners, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onError(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.enableBackoff();
                ConfigRealtimeHttpClient.this.propagateErrors(firebaseRemoteConfigException);
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onUpdate(@NonNull ConfigUpdate configUpdate) {
            }
        }, this.scheduledExecutorService);
    }

    public void startHttpConnection() {
        makeRealtimeHttpConnection(0L);
    }
}
