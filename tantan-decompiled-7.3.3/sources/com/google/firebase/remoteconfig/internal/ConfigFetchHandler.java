package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpStatus;
import p153l.s26;
import p153l.toi0;
import p153l.zdg0;

/* JADX INFO: loaded from: classes7.dex */
public class ConfigFetchHandler {

    @VisibleForTesting
    static final String FIRST_OPEN_TIME_KEY = "_fot";

    @VisibleForTesting
    static final int HTTP_TOO_MANY_REQUESTS = 429;
    private static final String X_FIREBASE_RC_FETCH_TYPE = "X-Firebase-RC-Fetch-Type";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Clock clock;
    private final Map<String, String> customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigMetadataClient frcMetadata;
    private final Random randomGenerator;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = 43200;

    @VisibleForTesting
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};

    public static class FetchResponse {
        private final Date fetchTime;
        private final ConfigContainer fetchedConfigs;

        @Nullable
        private final String lastFetchETag;
        private final int status;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(Date date, int i, ConfigContainer configContainer, @Nullable String str) {
            this.fetchTime = date;
            this.status = i;
            this.fetchedConfigs = configContainer;
            this.lastFetchETag = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        public Date getFetchTime() {
            return this.fetchTime;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.fetchedConfigs;
        }

        @Nullable
        public String getLastFetchETag() {
            return this.lastFetchETag;
        }

        public int getStatus() {
            return this.status;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = clock;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcMetadata = configMetadataClient;
        this.customHttpHeaders = map;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16907a(ConfigFetchHandler configFetchHandler, Task task, Task task2, Date date, Map map, Task task3) {
        configFetchHandler.getClass();
        if (task.mo15431p()) {
            return !task2.mo15431p() ? toi0.m192067e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.mo15426k())) : configFetchHandler.fetchFromBackendAndCacheResponse((String) task.mo15427l(), ((InstallationTokenResult) task2.mo15427l()).getToken(), date, map);
        }
        return toi0.m192067e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.mo15426k()));
    }

    private boolean areCachedFetchConfigsValid(long j, Date date) {
        Date lastSuccessfulFetchTime = this.frcMetadata.getLastSuccessfulFetchTime();
        if (lastSuccessfulFetchTime.equals(ConfigMetadataClient.LAST_FETCH_TIME_NO_FETCH_YET)) {
            return false;
        }
        return date.before(new Date(lastSuccessfulFetchTime.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Task m16909c(ConfigFetchHandler configFetchHandler, Date date, Task task) {
        configFetchHandler.updateLastFetchStatusAndTime(task, date);
        return task;
    }

    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (httpStatusCode == HTTP_TOO_MANY_REQUESTS) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (httpStatusCode != 500) {
                switch (httpStatusCode) {
                    case HttpStatus.BAD_GATEWAY_502 /* 502 */:
                    case HttpStatus.SERVICE_UNAVAILABLE_503 /* 503 */:
                    case HttpStatus.GATEWAY_TIMEOUT_504 /* 504 */:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: ".concat(str), firebaseRemoteConfigServerException);
    }

    private String createThrottledMessage(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(j / 1000));
    }

    @WorkerThread
    private FetchResponse fetchFromBackend(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        Date date2;
        try {
            date2 = date;
            try {
                FetchResponse fetchResponseFetch = this.frcBackendApiClient.fetch(this.frcBackendApiClient.createHttpURLConnection(), str, str2, getUserProperties(), this.frcMetadata.getLastFetchETag(), map, getFirstOpenTime(), date2);
                if (fetchResponseFetch.getFetchedConfigs() != null) {
                    this.frcMetadata.setLastTemplateVersion(fetchResponseFetch.getFetchedConfigs().getTemplateVersionNumber());
                }
                if (fetchResponseFetch.getLastFetchETag() != null) {
                    this.frcMetadata.setLastFetchETag(fetchResponseFetch.getLastFetchETag());
                }
                this.frcMetadata.resetBackoff();
                return fetchResponseFetch;
            } catch (FirebaseRemoteConfigServerException e) {
                e = e;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                ConfigMetadataClient.BackoffMetadata backoffMetadataUpdateAndReturnBackoffMetadata = updateAndReturnBackoffMetadata(firebaseRemoteConfigServerException.getHttpStatusCode(), date2);
                if (shouldThrottle(backoffMetadataUpdateAndReturnBackoffMetadata, firebaseRemoteConfigServerException.getHttpStatusCode())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(backoffMetadataUpdateAndReturnBackoffMetadata.getBackoffEndTime().getTime());
                }
                throw createExceptionWithGenericMessage(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e2) {
            e = e2;
            date2 = date;
        }
    }

    private Task<FetchResponse> fetchFromBackendAndCacheResponse(String str, String str2, Date date, Map<String, String> map) {
        try {
            final FetchResponse fetchResponseFetchFromBackend = fetchFromBackend(str, str2, date, map);
            return fetchResponseFetchFromBackend.getStatus() != 0 ? toi0.m192068f(fetchResponseFetchFromBackend) : this.fetchedConfigsCache.put(fetchResponseFetchFromBackend.getFetchedConfigs()).mo15432q(this.executor, new zdg0() { // from class: l.jw5
                @Override // p153l.zdg0
                public final Task then(Object obj) {
                    return toi0.m192068f(fetchResponseFetchFromBackend);
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return toi0.m192067e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<FetchResponse> fetchIfCacheExpiredAndNotThrottled(Task<ConfigContainer> task, long j, final Map<String, String> map) {
        final ConfigFetchHandler configFetchHandler;
        Task taskMo15424i;
        final Date date = new Date(this.clock.currentTimeMillis());
        if (task.mo15431p() && areCachedFetchConfigsValid(j, date)) {
            return toi0.m192068f(FetchResponse.forLocalStorageUsed(date));
        }
        Date backoffEndTimeInMillis = getBackoffEndTimeInMillis(date);
        if (backoffEndTimeInMillis != null) {
            taskMo15424i = toi0.m192067e(new FirebaseRemoteConfigFetchThrottledException(createThrottledMessage(backoffEndTimeInMillis.getTime() - date.getTime()), backoffEndTimeInMillis.getTime()));
            configFetchHandler = this;
        } else {
            final Task<String> id = this.firebaseInstallations.getId();
            final Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
            configFetchHandler = this;
            taskMo15424i = toi0.m192073k(id, token).mo15424i(this.executor, new s26() { // from class: l.gw5
                @Override // p153l.s26
                public final Object then(Task task2) {
                    return ConfigFetchHandler.m16907a(this.f106728a, id, token, date, map, task2);
                }
            });
        }
        return taskMo15424i.mo15424i(configFetchHandler.executor, new s26() { // from class: l.hw5
            @Override // p153l.s26
            public final Object then(Task task2) {
                return ConfigFetchHandler.m16909c(this.f111866a, date, task2);
            }
        });
    }

    @Nullable
    private Date getBackoffEndTimeInMillis(Date date) {
        Date backoffEndTime = this.frcMetadata.getBackoffMetadata().getBackoffEndTime();
        if (date.before(backoffEndTime)) {
            return backoffEndTime;
        }
        return null;
    }

    @WorkerThread
    private Long getFirstOpenTime() {
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.getUserProperties(true).get(FIRST_OPEN_TIME_KEY);
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        long millis = TimeUnit.MINUTES.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.randomGenerator.nextInt((int) millis));
    }

    @WorkerThread
    private Map<String, String> getUserProperties() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector != null) {
            for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean isThrottleableServerError(int i) {
        return i == HTTP_TOO_MANY_REQUESTS || i == 502 || i == 503 || i == 504;
    }

    private boolean shouldThrottle(ConfigMetadataClient.BackoffMetadata backoffMetadata, int i) {
        return backoffMetadata.getNumFailedFetches() > 1 || i == HTTP_TOO_MANY_REQUESTS;
    }

    private ConfigMetadataClient.BackoffMetadata updateAndReturnBackoffMetadata(int i, Date date) {
        if (isThrottleableServerError(i)) {
            updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcMetadata.getBackoffMetadata();
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
        int numFailedFetches = this.frcMetadata.getBackoffMetadata().getNumFailedFetches() + 1;
        this.frcMetadata.setBackoffMetadata(numFailedFetches, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedFetches)));
    }

    private void updateLastFetchStatusAndTime(Task<FetchResponse> task, Date date) {
        if (task.mo15431p()) {
            this.frcMetadata.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        Exception excMo15426k = task.mo15426k();
        if (excMo15426k == null) {
            return;
        }
        boolean z = excMo15426k instanceof FirebaseRemoteConfigFetchThrottledException;
        ConfigMetadataClient configMetadataClient = this.frcMetadata;
        if (z) {
            configMetadataClient.updateLastFetchAsThrottled();
        } else {
            configMetadataClient.updateLastFetchAsFailed();
        }
    }

    public Task<FetchResponse> fetch(final long j) {
        final HashMap map = new HashMap(this.customHttpHeaders);
        map.put(X_FIREBASE_RC_FETCH_TYPE, FetchType.BASE.getValue() + "/1");
        return this.fetchedConfigsCache.get().mo15424i(this.executor, new s26() { // from class: l.fw5
            @Override // p153l.s26
            public final Object then(Task task) {
                return this.f101123a.fetchIfCacheExpiredAndNotThrottled(task, j, map);
            }
        });
    }

    public Task<FetchResponse> fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i) {
        final HashMap map = new HashMap(this.customHttpHeaders);
        map.put(X_FIREBASE_RC_FETCH_TYPE, fetchType.getValue() + "/" + i);
        return this.fetchedConfigsCache.get().mo15424i(this.executor, new s26() { // from class: l.iw5
            @Override // p153l.s26
            public final Object then(Task task) {
                return this.f117246a.fetchIfCacheExpiredAndNotThrottled(task, 0L, map);
            }
        });
    }

    @VisibleForTesting
    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.analyticsConnector;
    }

    public long getTemplateVersionNumber() {
        return this.frcMetadata.getLastTemplateVersion();
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.frcMetadata.getMinimumFetchIntervalInSeconds());
    }
}
