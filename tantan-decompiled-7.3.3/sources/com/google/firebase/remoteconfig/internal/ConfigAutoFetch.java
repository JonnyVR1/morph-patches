package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.s26;
import p153l.toi0;

/* JADX INFO: loaded from: classes7.dex */
public class ConfigAutoFetch {
    private static final int MAXIMUM_FETCH_ATTEMPTS = 3;
    private static final String REALTIME_DISABLED_KEY = "featureDisabled";
    private static final String TEMPLATE_VERSION_KEY = "latestTemplateVersionNumber";
    private final ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;

    @GuardedBy("this")
    private final Set<ConfigUpdateListener> eventListeners;
    private final HttpURLConnection httpURLConnection;
    private final Random random = new Random();
    private final ConfigUpdateListener retryCallback;
    private final ScheduledExecutorService scheduledExecutorService;

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService) {
        this.httpURLConnection = httpURLConnection;
        this.configFetchHandler = configFetchHandler;
        this.activatedCache = configCacheClient;
        this.eventListeners = set;
        this.retryCallback = configUpdateListener;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16904a(ConfigAutoFetch configAutoFetch, Task task, Task task2, long j, int i, Task task3) throws JSONException {
        configAutoFetch.getClass();
        if (!task.mo15431p()) {
            return toi0.m192067e(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.mo15426k()));
        }
        if (!task2.mo15431p()) {
            return toi0.m192067e(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.mo15426k()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.mo15427l();
        ConfigContainer configContainerBuild = (ConfigContainer) task2.mo15427l();
        if (!fetchResponseIsUpToDate(fetchResponse, j).booleanValue()) {
            configAutoFetch.autoFetch(i, j);
            return toi0.m192068f(null);
        }
        if (fetchResponse.getFetchedConfigs() == null) {
            return toi0.m192068f(null);
        }
        if (configContainerBuild == null) {
            configContainerBuild = ConfigContainer.newBuilder().build();
        }
        Set<String> changedParams = configContainerBuild.getChangedParams(fetchResponse.getFetchedConfigs());
        if (changedParams.isEmpty()) {
            return toi0.m192068f(null);
        }
        configAutoFetch.executeAllListenerCallbacks(ConfigUpdate.create(changedParams));
        return toi0.m192068f(null);
    }

    private void autoFetch(final int i, final long j) {
        if (i == 0) {
            propagateErrors(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ConfigAutoFetch.this.fetchLatestConfig(i, j);
                }
            }, this.random.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void executeAllListenerCallbacks(ConfigUpdate configUpdate) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(configUpdate);
        }
    }

    private static Boolean fetchResponseIsUpToDate(ConfigFetchHandler.FetchResponse fetchResponse, long j) {
        if (fetchResponse.getFetchedConfigs() != null) {
            return Boolean.valueOf(fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j);
        }
        return Boolean.valueOf(fetchResponse.getStatus() == 1);
    }

    private void handleNotifications(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String strConcat = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strConcat = strConcat.concat(line);
                if (line.contains("}")) {
                    strConcat = parseAndValidateConfigUpdateMessage(strConcat);
                    if (strConcat.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strConcat);
                if (jSONObject.has(REALTIME_DISABLED_KEY) && jSONObject.getBoolean(REALTIME_DISABLED_KEY)) {
                    this.retryCallback.onError(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                } else {
                    if (isEventListenersEmpty()) {
                        break;
                    }
                    if (jSONObject.has(TEMPLATE_VERSION_KEY)) {
                        long templateVersionNumber = this.configFetchHandler.getTemplateVersionNumber();
                        long j = jSONObject.getLong(TEMPLATE_VERSION_KEY);
                        if (j > templateVersionNumber) {
                            autoFetch(3, j);
                        }
                    }
                }
            } catch (JSONException e) {
                propagateErrors(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e.getCause(), FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID));
                Log.e(FirebaseRemoteConfig.TAG, "Unable to parse latest config update message.", e);
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    private synchronized boolean isEventListenersEmpty() {
        return this.eventListeners.isEmpty();
    }

    private String parseAndValidateConfigUpdateMessage(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    @VisibleForTesting
    public synchronized Task<Void> fetchLatestConfig(int i, final long j) throws Throwable {
        final int i2 = i - 1;
        try {
            try {
                final Task<ConfigFetchHandler.FetchResponse> taskFetchNowWithTypeAndAttemptNumber = this.configFetchHandler.fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler.FetchType.REALTIME, 3 - i2);
                final Task<ConfigContainer> task = this.activatedCache.get();
                return toi0.m192073k(taskFetchNowWithTypeAndAttemptNumber, task).mo15424i(this.scheduledExecutorService, new s26() { // from class: l.wv5
                    @Override // p153l.s26
                    public final Object then(Task task2) {
                        return ConfigAutoFetch.m16904a(this.f190907a, taskFetchNowWithTypeAndAttemptNumber, task, j, i2, task2);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @VisibleForTesting
    public void listenForNotifications() {
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            handleNotifications(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } finally {
            this.httpURLConnection.disconnect();
        }
    }
}
