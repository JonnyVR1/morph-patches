package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.gmb0;
import p153l.kob0;
import p153l.lw3;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapInstanceConfig implements Parcelable {
    public static final Parcelable.Creator<CleverTapInstanceConfig> CREATOR = new C1188a();
    private static final String KEY_ACCOUNT_ID = "accountId";
    private static final String KEY_ACCOUNT_REGION = "accountRegion";
    private static final String KEY_ACCOUNT_TOKEN = "accountToken";
    private static final String KEY_ANALYTICS_ONLY = "analyticsOnly";
    private static final String KEY_BACKGROUND_SYNC = "backgroundSync";
    private static final String KEY_BETA = "beta";
    private static final String KEY_CREATED_POST_APP_LAUNCH = "createdPostAppLaunch";
    private static final String KEY_CUSTOM_HANDSHAKE_DOMAIN = "customHandshakeDomain";
    private static final String KEY_DEBUG_LEVEL = "debugLevel";
    private static final String KEY_DEFAULT_INSTANCE = "isDefaultInstance";
    private static final String KEY_DISABLE_APP_LAUNCHED = "disableAppLaunchedEvent";
    private static final String KEY_ENABLE_CUSTOM_CT_ID = "getEnableCustomCleverTapId";
    private static final String KEY_ENCRYPTION_IN_TRANSIT = "encryptionInTransit";
    public static final String KEY_ENCRYPTION_LEVEL = "encryptionLevel";
    private static final String KEY_FCM_SENDER_ID = "fcmSenderId";
    private static final String KEY_IDENTITY_TYPES = "identityTypes";
    private static final String KEY_PACKAGE_NAME = "packageName";
    private static final String KEY_PERSONALIZATION = "personalization";
    private static final String KEY_PROXY_DOMAIN = "proxyDomain";
    private static final String KEY_PUSH_TYPES = "allowedPushTypes";
    private static final String KEY_SPIKY_PROXY_DOMAIN = "spikyProxyDomain";
    private static final String KEY_SSL_PINNING = "sslPinning";
    private static final String KEY_USE_GOOGLE_AD_ID = "useGoogleAdId";
    private String accountId;
    private String accountRegion;
    private String accountToken;
    private boolean analyticsOnly;
    private boolean backgroundSync;
    private boolean beta;
    private boolean createdPostAppLaunch;
    private String customHandshakeDomain;
    private int debugLevel;
    private boolean disableAppLaunchedEvent;
    private boolean enableCustomCleverTapId;
    private String encryptionInTransit;
    private int encryptionLevel;
    private String fcmSenderId;
    private String[] identityKeys;
    private boolean isDefaultInstance;
    private Logger logger;
    private String packageName;
    private boolean personalization;
    private String proxyDomain;

    @NonNull
    private final ArrayList<kob0> pushTypes;
    private String spikyProxyDomain;
    private boolean sslPinning;
    private boolean useGoogleAdId;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CleverTapInstanceConfig$a */
    public class C1188a implements Parcelable.Creator<CleverTapInstanceConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CleverTapInstanceConfig createFromParcel(Parcel parcel) {
            return new CleverTapInstanceConfig(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CleverTapInstanceConfig[] newArray(int i) {
            return new CleverTapInstanceConfig[i];
        }
    }

    private CleverTapInstanceConfig(String str) throws Throwable {
        this.pushTypes = PushNotificationUtil.m6984b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(KEY_ACCOUNT_ID)) {
                this.accountId = jSONObject.getString(KEY_ACCOUNT_ID);
            }
            if (jSONObject.has(KEY_ACCOUNT_TOKEN)) {
                this.accountToken = jSONObject.getString(KEY_ACCOUNT_TOKEN);
            }
            if (jSONObject.has(KEY_PROXY_DOMAIN)) {
                this.proxyDomain = jSONObject.getString(KEY_PROXY_DOMAIN);
            }
            if (jSONObject.has(KEY_SPIKY_PROXY_DOMAIN)) {
                this.spikyProxyDomain = jSONObject.getString(KEY_SPIKY_PROXY_DOMAIN);
            }
            if (jSONObject.has(KEY_CUSTOM_HANDSHAKE_DOMAIN)) {
                this.customHandshakeDomain = jSONObject.optString(KEY_CUSTOM_HANDSHAKE_DOMAIN, null);
            }
            if (jSONObject.has(KEY_ACCOUNT_REGION)) {
                this.accountRegion = jSONObject.getString(KEY_ACCOUNT_REGION);
            }
            if (jSONObject.has(KEY_ANALYTICS_ONLY)) {
                this.analyticsOnly = jSONObject.getBoolean(KEY_ANALYTICS_ONLY);
            }
            if (jSONObject.has(KEY_DEFAULT_INSTANCE)) {
                this.isDefaultInstance = jSONObject.getBoolean(KEY_DEFAULT_INSTANCE);
            }
            if (jSONObject.has(KEY_USE_GOOGLE_AD_ID)) {
                this.useGoogleAdId = jSONObject.getBoolean(KEY_USE_GOOGLE_AD_ID);
            }
            if (jSONObject.has(KEY_DISABLE_APP_LAUNCHED)) {
                this.disableAppLaunchedEvent = jSONObject.getBoolean(KEY_DISABLE_APP_LAUNCHED);
            }
            if (jSONObject.has(KEY_PERSONALIZATION)) {
                this.personalization = jSONObject.getBoolean(KEY_PERSONALIZATION);
            }
            if (jSONObject.has(KEY_DEBUG_LEVEL)) {
                this.debugLevel = jSONObject.getInt(KEY_DEBUG_LEVEL);
            }
            this.logger = new Logger(this.debugLevel);
            if (jSONObject.has("packageName")) {
                this.packageName = jSONObject.getString("packageName");
            }
            if (jSONObject.has(KEY_CREATED_POST_APP_LAUNCH)) {
                this.createdPostAppLaunch = jSONObject.getBoolean(KEY_CREATED_POST_APP_LAUNCH);
            }
            if (jSONObject.has(KEY_SSL_PINNING)) {
                this.sslPinning = jSONObject.getBoolean(KEY_SSL_PINNING);
            }
            if (jSONObject.has(KEY_BACKGROUND_SYNC)) {
                this.backgroundSync = jSONObject.getBoolean(KEY_BACKGROUND_SYNC);
            }
            if (jSONObject.has(KEY_ENABLE_CUSTOM_CT_ID)) {
                this.enableCustomCleverTapId = jSONObject.getBoolean(KEY_ENABLE_CUSTOM_CT_ID);
            }
            if (jSONObject.has(KEY_FCM_SENDER_ID)) {
                this.fcmSenderId = jSONObject.getString(KEY_FCM_SENDER_ID);
            }
            if (jSONObject.has(KEY_BETA)) {
                this.beta = jSONObject.getBoolean(KEY_BETA);
            }
            if (jSONObject.has(KEY_IDENTITY_TYPES)) {
                this.identityKeys = (String[]) lw3.m156026g(jSONObject.getJSONArray(KEY_IDENTITY_TYPES));
            }
            if (jSONObject.has(KEY_ENCRYPTION_LEVEL)) {
                this.encryptionLevel = jSONObject.getInt(KEY_ENCRYPTION_LEVEL);
            }
            if (jSONObject.has(KEY_PUSH_TYPES)) {
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_PUSH_TYPES);
                for (int i = 0; i < jSONArray.length(); i++) {
                    kob0 kob0VarM150589a = kob0.m150589a(jSONArray.getJSONObject(i));
                    if (kob0VarM150589a != null) {
                        addPushType(kob0VarM150589a);
                    }
                }
            }
            this.encryptionInTransit = jSONObject.optString(KEY_ENCRYPTION_IN_TRANSIT, "0");
        } catch (Throwable th) {
            Logger.m5930v("Error constructing CleverTapInstanceConfig from JSON: " + str + ": ", th.getCause());
            throw th;
        }
    }

    private void buildPushProvidersFromManifest(ManifestInfo manifestInfo) {
        String[] strArrSplit;
        String[] strArrSplit2;
        try {
            String strM5948q = manifestInfo.m5948q();
            if (strM5948q != null && (strArrSplit2 = strM5948q.split(Constants.SEPARATOR_COMMA)) != null && strArrSplit2.length == 4) {
                addPushType(new kob0(strArrSplit2[0].trim(), strArrSplit2[1].trim(), strArrSplit2[2].trim(), strArrSplit2[3].trim()));
            }
            String strM5949r = manifestInfo.m5949r();
            if (strM5949r == null || (strArrSplit = strM5949r.split(Constants.SEPARATOR_COMMA)) == null || strArrSplit.length != 4) {
                return;
            }
            addPushType(new kob0(strArrSplit[0].trim(), strArrSplit[1].trim(), strArrSplit[2].trim(), strArrSplit[3].trim()));
        } catch (Exception unused) {
            Logger.m5927v("There was some problem in loading push providers from manifest");
        }
    }

    public static CleverTapInstanceConfig createDefaultInstance(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3) {
        return createInstanceWithManifest(ManifestInfo.getInstance(context), str, str2, str3, true);
    }

    public static CleverTapInstanceConfig createInstance(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3) {
        if (str != null && str2 != null) {
            return createInstanceWithManifest(ManifestInfo.getInstance(context), str, str2, str3, false);
        }
        Logger.m5923i("CleverTap accountId and accountToken cannot be null");
        return null;
    }

    public static CleverTapInstanceConfig createInstanceWithManifest(@NonNull ManifestInfo manifestInfo, @NonNull String str, @NonNull String str2, @Nullable String str3, boolean z) {
        return new CleverTapInstanceConfig(manifestInfo, str, str2, str3, z);
    }

    public static CleverTapInstanceConfig getDefaultInstance(Context context) {
        ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
        String strM5934c = manifestInfo.m5934c();
        String strM5936e = manifestInfo.m5936e();
        if (strM5934c != null && strM5936e != null) {
            return createInstanceWithManifest(manifestInfo, strM5934c, strM5936e, manifestInfo.m5935d(), true);
        }
        Logger.m5923i("Account ID or Account token is missing from AndroidManifest.xml, unable to create default CleverTapInstanceConfig");
        return null;
    }

    private String getDefaultSuffix(@NonNull String str) {
        String str2;
        StringBuilder sb = new StringBuilder("[");
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = ":" + str;
        }
        sb.append(str2);
        sb.append(":");
        sb.append(this.accountId);
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    @NonNull
    private JSONArray getPushTypesArray() {
        JSONArray jSONArray = new JSONArray();
        for (kob0 kob0Var : getPushTypes()) {
            if (kob0Var != gmb0.f104964a) {
                jSONArray.put(kob0Var.m150594f());
            }
        }
        return jSONArray;
    }

    public void addPushType(@NonNull kob0 kob0Var) {
        if (this.pushTypes.contains(kob0Var)) {
            return;
        }
        this.pushTypes.add(kob0Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void enablePersonalization(boolean z) {
        this.personalization = z;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAccountRegion() {
        return this.accountRegion;
    }

    public String getAccountToken() {
        return this.accountToken;
    }

    public String getCustomHandshakeDomain() {
        return this.customHandshakeDomain;
    }

    public int getDebugLevel() {
        return this.debugLevel;
    }

    public boolean getEnableCustomCleverTapId() {
        return this.enableCustomCleverTapId;
    }

    public int getEncryptionLevel() {
        return this.encryptionLevel;
    }

    public String getFcmSenderId() {
        return this.fcmSenderId;
    }

    public String[] getIdentityKeys() {
        return this.identityKeys;
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = new Logger(this.debugLevel);
        }
        return this.logger;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getProxyDomain() {
        return this.proxyDomain;
    }

    @NonNull
    public ArrayList<kob0> getPushTypes() {
        return this.pushTypes;
    }

    public String getSpikyProxyDomain() {
        return this.spikyProxyDomain;
    }

    public boolean isAnalyticsOnly() {
        return this.analyticsOnly;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isBackgroundSync() {
        return this.backgroundSync;
    }

    public boolean isBeta() {
        return this.beta;
    }

    public boolean isCreatedPostAppLaunch() {
        return this.createdPostAppLaunch;
    }

    public boolean isDefaultInstance() {
        return this.isDefaultInstance;
    }

    public boolean isDisableAppLaunchedEvent() {
        return this.disableAppLaunchedEvent;
    }

    public boolean isEncryptionInTransitEnabled() {
        try {
            return Integer.parseInt(this.encryptionInTransit) > 0;
        } catch (NumberFormatException unused) {
            Logger.m5927v("Invalid value passed in manifest for encryption in transit");
            return false;
        }
    }

    public boolean isPersonalizationEnabled() {
        return this.personalization;
    }

    public boolean isSslPinningEnabled() {
        return this.sslPinning;
    }

    public boolean isUseGoogleAdId() {
        return this.useGoogleAdId;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void log(@NonNull String str, @NonNull String str2) {
        this.logger.verbose(getDefaultSuffix(str), str2);
    }

    public void setAnalyticsOnly(boolean z) {
        this.analyticsOnly = z;
    }

    public void setBackgroundSync(boolean z) {
        this.backgroundSync = z;
    }

    public void setCreatedPostAppLaunch() {
        this.createdPostAppLaunch = true;
    }

    public void setCustomHandshakeDomain(String str) {
        this.customHandshakeDomain = str;
    }

    public void setDebugLevel(int i) {
        this.debugLevel = i;
        Logger logger = this.logger;
        if (logger != null) {
            logger.setDebugLevel(i);
        }
    }

    public void setDisableAppLaunchedEvent(boolean z) {
        this.disableAppLaunchedEvent = z;
    }

    public void setEnableCustomCleverTapId(boolean z) {
        this.enableCustomCleverTapId = z;
    }

    public void setEncryptionInTransit(boolean z) {
        this.encryptionInTransit = z ? "1" : "0";
    }

    public void setEncryptionLevel(EncryptionLevel encryptionLevel) {
        this.encryptionLevel = encryptionLevel.getValue();
    }

    public void setIdentityKeys(String... strArr) {
        if (this.isDefaultInstance) {
            return;
        }
        this.identityKeys = strArr;
        log("ON_USER_LOGIN", "Setting Profile Keys via setter: " + Arrays.toString(this.identityKeys));
    }

    public void setProxyDomain(String str) {
        this.proxyDomain = str;
    }

    public void setSpikyProxyDomain(String str) {
        this.spikyProxyDomain = str;
    }

    public String toJSONString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_ACCOUNT_ID, getAccountId());
            jSONObject.put(KEY_ACCOUNT_TOKEN, getAccountToken());
            jSONObject.put(KEY_ACCOUNT_REGION, getAccountRegion());
            jSONObject.put(KEY_PROXY_DOMAIN, getProxyDomain());
            jSONObject.put(KEY_SPIKY_PROXY_DOMAIN, getSpikyProxyDomain());
            jSONObject.put(KEY_CUSTOM_HANDSHAKE_DOMAIN, getCustomHandshakeDomain());
            jSONObject.put(KEY_FCM_SENDER_ID, getFcmSenderId());
            jSONObject.put(KEY_ANALYTICS_ONLY, isAnalyticsOnly());
            jSONObject.put(KEY_DEFAULT_INSTANCE, isDefaultInstance());
            jSONObject.put(KEY_USE_GOOGLE_AD_ID, isUseGoogleAdId());
            jSONObject.put(KEY_DISABLE_APP_LAUNCHED, isDisableAppLaunchedEvent());
            jSONObject.put(KEY_PERSONALIZATION, isPersonalizationEnabled());
            jSONObject.put(KEY_DEBUG_LEVEL, getDebugLevel());
            jSONObject.put(KEY_CREATED_POST_APP_LAUNCH, isCreatedPostAppLaunch());
            jSONObject.put(KEY_SSL_PINNING, isSslPinningEnabled());
            jSONObject.put(KEY_BACKGROUND_SYNC, isBackgroundSync());
            jSONObject.put(KEY_ENABLE_CUSTOM_CT_ID, getEnableCustomCleverTapId());
            jSONObject.put("packageName", getPackageName());
            jSONObject.put(KEY_BETA, isBeta());
            jSONObject.put(KEY_ENCRYPTION_LEVEL, getEncryptionLevel());
            jSONObject.put(KEY_ENCRYPTION_IN_TRANSIT, this.encryptionInTransit);
            jSONObject.put(KEY_PUSH_TYPES, getPushTypesArray());
            return jSONObject.toString();
        } catch (Throwable th) {
            Logger.m5930v("Unable to convert config to JSON : ", th.getCause());
            return null;
        }
    }

    public void useGoogleAdId(boolean z) {
        this.useGoogleAdId = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accountId);
        parcel.writeString(this.accountToken);
        parcel.writeString(this.accountRegion);
        parcel.writeString(this.proxyDomain);
        parcel.writeString(this.spikyProxyDomain);
        parcel.writeString(this.customHandshakeDomain);
        parcel.writeByte(this.analyticsOnly ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDefaultInstance ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useGoogleAdId ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableAppLaunchedEvent ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.personalization ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.debugLevel);
        parcel.writeByte(this.createdPostAppLaunch ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.sslPinning ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.backgroundSync ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableCustomCleverTapId ? (byte) 1 : (byte) 0);
        parcel.writeString(this.fcmSenderId);
        parcel.writeString(this.packageName);
        parcel.writeByte(this.beta ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.identityKeys);
        parcel.writeInt(this.encryptionLevel);
        parcel.writeString(this.encryptionInTransit);
        parcel.writeString(getPushTypesArray().toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void log(@NonNull String str, @NonNull String str2, Throwable th) {
        this.logger.verbose(getDefaultSuffix(str), str2, th);
    }

    public void setDebugLevel(CleverTapAPI.LogLevel logLevel) {
        setDebugLevel(logLevel.intValue());
    }

    public static CleverTapInstanceConfig createInstance(Context context, @NonNull String str, @NonNull String str2) {
        return createInstance(context, str, str2, null);
    }

    @Nullable
    public static CleverTapInstanceConfig createInstance(@NonNull String str) {
        try {
            return new CleverTapInstanceConfig(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public CleverTapInstanceConfig(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.pushTypes = PushNotificationUtil.m6984b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = cleverTapInstanceConfig.accountId;
        this.accountToken = cleverTapInstanceConfig.accountToken;
        this.accountRegion = cleverTapInstanceConfig.accountRegion;
        this.proxyDomain = cleverTapInstanceConfig.proxyDomain;
        this.spikyProxyDomain = cleverTapInstanceConfig.spikyProxyDomain;
        this.customHandshakeDomain = cleverTapInstanceConfig.customHandshakeDomain;
        this.isDefaultInstance = cleverTapInstanceConfig.isDefaultInstance;
        this.analyticsOnly = cleverTapInstanceConfig.analyticsOnly;
        this.personalization = cleverTapInstanceConfig.personalization;
        this.debugLevel = cleverTapInstanceConfig.debugLevel;
        this.logger = cleverTapInstanceConfig.logger;
        this.useGoogleAdId = cleverTapInstanceConfig.useGoogleAdId;
        this.disableAppLaunchedEvent = cleverTapInstanceConfig.disableAppLaunchedEvent;
        this.createdPostAppLaunch = cleverTapInstanceConfig.createdPostAppLaunch;
        this.sslPinning = cleverTapInstanceConfig.sslPinning;
        this.backgroundSync = cleverTapInstanceConfig.backgroundSync;
        this.enableCustomCleverTapId = cleverTapInstanceConfig.enableCustomCleverTapId;
        this.fcmSenderId = cleverTapInstanceConfig.fcmSenderId;
        this.packageName = cleverTapInstanceConfig.packageName;
        this.beta = cleverTapInstanceConfig.beta;
        this.identityKeys = cleverTapInstanceConfig.identityKeys;
        this.encryptionLevel = cleverTapInstanceConfig.encryptionLevel;
        Iterator<kob0> it = cleverTapInstanceConfig.pushTypes.iterator();
        while (it.hasNext()) {
            addPushType(it.next());
        }
        this.encryptionInTransit = cleverTapInstanceConfig.encryptionInTransit;
    }

    private CleverTapInstanceConfig(ManifestInfo manifestInfo, String str, String str2, String str3, boolean z) {
        this.pushTypes = PushNotificationUtil.m6984b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = str;
        this.accountToken = str2;
        this.accountRegion = str3;
        this.isDefaultInstance = z;
        this.analyticsOnly = false;
        this.personalization = true;
        int iIntValue = CleverTapAPI.LogLevel.INFO.intValue();
        this.debugLevel = iIntValue;
        this.logger = new Logger(iIntValue);
        this.createdPostAppLaunch = false;
        this.useGoogleAdId = manifestInfo.m5954x();
        this.disableAppLaunchedEvent = manifestInfo.m5950s();
        this.sslPinning = manifestInfo.m5952u();
        this.backgroundSync = manifestInfo.m5951t();
        this.fcmSenderId = manifestInfo.m5941j();
        this.packageName = manifestInfo.m5944m();
        this.enableCustomCleverTapId = manifestInfo.m5953w();
        this.beta = manifestInfo.m5933b();
        if (this.isDefaultInstance) {
            this.encryptionLevel = manifestInfo.m5939h();
            this.identityKeys = manifestInfo.m5945n();
            log("ON_USER_LOGIN", "Setting Profile Keys from Manifest: " + Arrays.toString(this.identityKeys));
        } else {
            this.encryptionLevel = 0;
        }
        buildPushProvidersFromManifest(manifestInfo);
        String strM5938g = manifestInfo.m5938g();
        this.encryptionInTransit = strM5938g == null ? "0" : strM5938g;
    }

    public /* synthetic */ CleverTapInstanceConfig(Parcel parcel, C1188a c1188a) {
        this(parcel);
    }

    private CleverTapInstanceConfig(Parcel parcel) {
        this.pushTypes = PushNotificationUtil.m6984b();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = parcel.readString();
        this.accountToken = parcel.readString();
        this.accountRegion = parcel.readString();
        this.proxyDomain = parcel.readString();
        this.spikyProxyDomain = parcel.readString();
        this.customHandshakeDomain = parcel.readString();
        this.analyticsOnly = parcel.readByte() != 0;
        this.isDefaultInstance = parcel.readByte() != 0;
        this.useGoogleAdId = parcel.readByte() != 0;
        this.disableAppLaunchedEvent = parcel.readByte() != 0;
        this.personalization = parcel.readByte() != 0;
        this.debugLevel = parcel.readInt();
        this.createdPostAppLaunch = parcel.readByte() != 0;
        this.sslPinning = parcel.readByte() != 0;
        this.backgroundSync = parcel.readByte() != 0;
        this.enableCustomCleverTapId = parcel.readByte() != 0;
        this.fcmSenderId = parcel.readString();
        this.packageName = parcel.readString();
        this.logger = new Logger(this.debugLevel);
        this.beta = parcel.readByte() != 0;
        this.identityKeys = parcel.createStringArray();
        this.encryptionLevel = parcel.readInt();
        this.encryptionInTransit = parcel.readString();
        try {
            JSONArray jSONArray = new JSONArray(parcel.readString());
            for (int i = 0; i < jSONArray.length(); i++) {
                kob0 kob0VarM150589a = kob0.m150589a(jSONArray.getJSONObject(i));
                if (kob0VarM150589a != null) {
                    addPushType(kob0VarM150589a);
                }
            }
        } catch (JSONException unused) {
            Logger.m5927v("Error in loading push providers from parcel, using firebase");
        }
    }
}
