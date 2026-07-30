package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p149l.ig3;
import p149l.upk0;

/* JADX INFO: loaded from: classes7.dex */
class DefaultSettingsSpiCall implements SettingsSpiCall {
    static final String ACCEPT_JSON_VALUE = "application/json";
    static final String ANDROID_CLIENT_TYPE = "android";
    static final String BUILD_VERSION_PARAM = "build_version";
    static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    static final String DISPLAY_VERSION_PARAM = "display_version";
    static final String HEADER_ACCEPT = "Accept";
    static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    static final String HEADER_DEVICE_MODEL = "X-CRASHLYTICS-DEVICE-MODEL";
    static final String HEADER_GOOGLE_APP_ID = "X-CRASHLYTICS-GOOGLE-APP-ID";
    static final String HEADER_INSTALLATION_ID = "X-CRASHLYTICS-INSTALLATION-ID";
    static final String HEADER_OS_BUILD_VERSION = "X-CRASHLYTICS-OS-BUILD-VERSION";
    static final String HEADER_OS_DISPLAY_VERSION = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    static final String HEADER_USER_AGENT = "User-Agent";
    static final String INSTANCE_PARAM = "instance";
    static final String SOURCE_PARAM = "source";
    private final Logger logger;
    private final HttpRequestFactory requestFactory;
    private final String url;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str == null) {
            ig3.m135964a("url must not be null.");
            throw null;
        }
        this.logger = logger;
        this.requestFactory = httpRequestFactory;
        this.url = str;
    }

    private HttpGetRequest applyHeadersTo(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        applyNonNullHeader(httpGetRequest, HEADER_GOOGLE_APP_ID, settingsRequest.googleAppId);
        applyNonNullHeader(httpGetRequest, HEADER_CLIENT_TYPE, "android");
        applyNonNullHeader(httpGetRequest, HEADER_CLIENT_VERSION, CrashlyticsCore.getVersion());
        applyNonNullHeader(httpGetRequest, "Accept", ACCEPT_JSON_VALUE);
        applyNonNullHeader(httpGetRequest, HEADER_DEVICE_MODEL, settingsRequest.deviceModel);
        applyNonNullHeader(httpGetRequest, HEADER_OS_BUILD_VERSION, settingsRequest.osBuildVersion);
        applyNonNullHeader(httpGetRequest, HEADER_OS_DISPLAY_VERSION, settingsRequest.osDisplayVersion);
        applyNonNullHeader(httpGetRequest, HEADER_INSTALLATION_ID, settingsRequest.installIdProvider.getInstallIds().getCrashlyticsInstallId());
        return httpGetRequest;
    }

    private void applyNonNullHeader(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }

    private JSONObject getJsonObjectFrom(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            this.logger.m16730w("Failed to parse settings JSON from " + this.url, e);
            this.logger.m16729w("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> getQueryParamsFor(SettingsRequest settingsRequest) {
        HashMap map = new HashMap();
        map.put(BUILD_VERSION_PARAM, settingsRequest.buildVersion);
        map.put(DISPLAY_VERSION_PARAM, settingsRequest.displayVersion);
        map.put("source", Integer.toString(settingsRequest.source));
        String str = settingsRequest.instanceId;
        if (!TextUtils.isEmpty(str)) {
            map.put(INSTANCE_PARAM, str);
        }
        return map;
    }

    public HttpGetRequest createHttpGetRequest(Map<String, String> map) {
        return this.requestFactory.buildHttpGetRequest(this.url, map).header("User-Agent", CRASHLYTICS_USER_AGENT + CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public JSONObject handleResponse(HttpResponse httpResponse) {
        int iCode = httpResponse.code();
        this.logger.m16727v("Settings response code was: " + iCode);
        if (requestWasSuccessful(iCode)) {
            return getJsonObjectFrom(httpResponse.body());
        }
        this.logger.m16723e("Settings request failed; (status: " + iCode + ") from " + this.url);
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsSpiCall
    public JSONObject invoke(SettingsRequest settingsRequest, boolean z) {
        CrashlyticsWorkers.checkBlockingThread();
        if (!z) {
            upk0.m194883a("An invalid data collection token was used.");
            return null;
        }
        try {
            Map<String, String> queryParamsFor = getQueryParamsFor(settingsRequest);
            HttpGetRequest httpGetRequestApplyHeadersTo = applyHeadersTo(createHttpGetRequest(queryParamsFor), settingsRequest);
            this.logger.m16721d("Requesting settings from " + this.url);
            this.logger.m16727v("Settings query params were: " + queryParamsFor);
            return handleResponse(httpGetRequestApplyHeadersTo.execute());
        } catch (IOException e) {
            this.logger.m16724e("Settings request failed.", e);
            return null;
        }
    }

    public boolean requestWasSuccessful(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.getLogger());
    }
}
