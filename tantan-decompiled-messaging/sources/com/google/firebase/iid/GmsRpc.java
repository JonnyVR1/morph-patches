package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.p046p1.mobile.putong.core.data.Shows;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p149l.n16;
import p149l.rhg0;
import p149l.sfd0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class GmsRpc {

    @KeepForSdk
    public static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";

    @KeepForSdk
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Provider<HeartBeatInfo> heartbeatInfo;
    private final Metadata metadata;
    private final sfd0 rpc;
    private final Provider<UserAgentPublisher> userAgentPublisher;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, metadata, new sfd0(firebaseApp.getApplicationContext()), provider, provider2, firebaseInstallationsApi);
    }

    private static String base64UrlSafe(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> extractResponseWhenComplete(Task<Bundle> task) {
        return task.mo15368g(FirebaseIidExecutors.directExecutor(), new n16(this) { // from class: com.google.firebase.iid.GmsRpc$$Lambda$0
            private final GmsRpc arg$1;

            {
                this.arg$1 = this;
            }

            @Override // p149l.n16
            public Object then(Task task2) {
                return this.arg$1.lambda$extractResponseWhenComplete$0$GmsRpc(task2);
            }
        });
    }

    private String getHashedFirebaseAppName() {
        try {
            return base64UrlSafe(MessageDigest.getInstance("SHA-1").digest(this.app.getName().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    @AnyThread
    private String handleResponse(Bundle bundle) throws IOException {
        if (bundle == null) {
            rhg0.m179353a(ERROR_SERVICE_NOT_AVAILABLE);
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            rhg0.m179353a("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            rhg0.m179353a(string3);
            return null;
        }
        new StringBuilder(String.valueOf(bundle).length() + 21);
        new Throwable();
        rhg0.m179353a(ERROR_SERVICE_NOT_AVAILABLE);
        return null;
    }

    public static boolean isErrorMessageForRetryableError(String str) {
        return ERROR_SERVICE_NOT_AVAILABLE.equals(str) || ERROR_INTERNAL_SERVER_ERROR.equals(str) || "InternalServerError".equals(str);
    }

    private Bundle setDefaultAttributesToBundle(String str, String str2, String str3, Bundle bundle) {
        HeartBeatInfo.HeartBeat heartBeatCode;
        bundle.putString("scope", str3);
        bundle.putString(Shows.sender, str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.app.getOptions().getApplicationId());
        bundle.putString("gmsv", Integer.toString(this.metadata.getGmsVersionCode()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(Constants.PARAM_APP_VER, this.metadata.getAppVersionCode());
        bundle.putString("app_ver_name", this.metadata.getAppVersionName());
        bundle.putString("firebase-app-name-hash", getHashedFirebaseAppName());
        try {
            String token = ((InstallationTokenResult) tfi0.m188729a(this.firebaseInstallations.getToken(false))).getToken();
            if (!TextUtils.isEmpty(token)) {
                bundle.putString("Goog-Firebase-Installations-Auth", token);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        HeartBeatInfo heartBeatInfo = this.heartbeatInfo.get();
        UserAgentPublisher userAgentPublisher = this.userAgentPublisher.get();
        if (heartBeatInfo != null && userAgentPublisher != null && (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-iid")) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatCode.getCode()));
            bundle.putString("Firebase-Client", userAgentPublisher.getUserAgent());
        }
        return bundle;
    }

    private Task<Bundle> startRpc(String str, String str2, String str3, Bundle bundle) {
        setDefaultAttributesToBundle(str, str2, str3, bundle);
        return this.rpc.m183917c(bundle);
    }

    public Task<?> deleteInstanceId(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", RequestParameters.SUBRESOURCE_DELETE);
        bundle.putString(RequestParameters.SUBRESOURCE_DELETE, "1");
        return extractResponseWhenComplete(startRpc(str, "*", "*", bundle));
    }

    public Task<?> deleteToken(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(RequestParameters.SUBRESOURCE_DELETE, "1");
        return extractResponseWhenComplete(startRpc(str, str2, str3, bundle));
    }

    public Task<String> getToken(String str, String str2, String str3) {
        return extractResponseWhenComplete(startRpc(str, str2, str3, new Bundle()));
    }

    public final /* synthetic */ String lambda$extractResponseWhenComplete$0$GmsRpc(Task task) throws Exception {
        return handleResponse((Bundle) task.mo15374m(IOException.class));
    }

    @KeepForSdk
    public Task<?> subscribeToTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        String strValueOf2 = String.valueOf(str3);
        return extractResponseWhenComplete(startRpc(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }

    @KeepForSdk
    public Task<?> unsubscribeFromTopic(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String strValueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", strValueOf.length() != 0 ? "/topics/".concat(strValueOf) : new String("/topics/"));
        bundle.putString(RequestParameters.SUBRESOURCE_DELETE, "1");
        String strValueOf2 = String.valueOf(str3);
        return extractResponseWhenComplete(startRpc(str, str2, strValueOf2.length() != 0 ? "/topics/".concat(strValueOf2) : new String("/topics/"), bundle));
    }

    @VisibleForTesting
    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, sfd0 sfd0Var, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.app = firebaseApp;
        this.metadata = metadata;
        this.rpc = sfd0Var;
        this.userAgentPublisher = provider;
        this.heartbeatInfo = provider2;
        this.firebaseInstallations = firebaseInstallationsApi;
    }
}
