package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.eclipse.jetty.http.HttpMethods;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.phg0;
import p149l.rhg0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseInstallationServiceClient {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String API_KEY_HEADER = "x-goog-api-key";
    private static final String CACHE_CONTROL_DIRECTIVE = "no-cache";
    private static final String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final String FIS_TAG = "Firebase-Installations";
    private static final String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final String HEART_BEAT_HEADER = "x-firebase-client";
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;

    @VisibleForTesting
    static final String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final String SDK_VERSION_PREFIX = "a:";
    private static final int TRAFFIC_STATS_CREATE_INSTALLATION_TAG = 32769;
    private static final int TRAFFIC_STATS_DELETE_INSTALLATION_TAG = 32770;
    private static final int TRAFFIC_STATS_FIREBASE_INSTALLATIONS_TAG = 32768;
    private static final int TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG = 32771;
    private static final String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private final Context context;
    private final Provider<HeartBeatController> heartBeatProvider;
    private final RequestLimiter requestLimiter = new RequestLimiter();
    private boolean shouldServerErrorRetry;
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public FirebaseInstallationServiceClient(@NonNull Context context, @NonNull Provider<HeartBeatController> provider) {
        this.context = context;
        this.heartBeatProvider = provider;
    }

    private static String availableFirebaseOptions(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(@Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
            jSONObject.put("authVersion", FIREBASE_INSTALLATION_AUTH_VERSION);
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.context.getPackageName(), e);
            return null;
        }
    }

    private URL getFullyQualifiedRequestUri(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", FIREBASE_INSTALLATIONS_API_DOMAIN, FIREBASE_INSTALLATIONS_API_VERSION, str));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean isSuccessfulResponseCode(int i) {
        return i >= 200 && i < 300;
    }

    private static void logBadConfigError() {
        Log.e(FIS_TAG, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        if (TextUtils.isEmpty(readErrorResponse(httpURLConnection))) {
            return;
        }
        availableFirebaseOptions(str, str2, str3);
    }

    private HttpURLConnection openHttpURLConnection(URL url, String str) throws FirebaseInstallationsException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", JSON_CONTENT_TYPE);
            httpURLConnection.addRequestProperty("Accept", JSON_CONTENT_TYPE);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty(X_ANDROID_PACKAGE_HEADER_KEY, this.context.getPackageName());
            HeartBeatController heartBeatController = this.heartBeatProvider.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty(HEART_BEAT_HEADER, (String) tfi0.m188729a(heartBeatController.getHeartBeatsHeader()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty(X_ANDROID_CERT_HEADER_KEY, getFingerprintHashForPackage());
            httpURLConnection.addRequestProperty(API_KEY_HEADER, str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    public static long parseTokenExpirationTimestamp(String str) {
        Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), PARSING_EXPIRATION_TIME_ERROR_MESSAGE);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                builder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    @Nullable
    private static String readErrorResponse(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, UTF_8));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static void writeRequestBodyToOutputStream(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            rhg0.m179353a("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    public InstallationResponse createFirebaseInstallation(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) throws FirebaseInstallationsException {
        InstallationResponse createResponse;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(CREATE_REQUEST_RESOURCE_NAME_FORMAT, str3));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(TRAFFIC_STATS_CREATE_INSTALLATION_TAG);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod("POST");
                    httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionOpenHttpURLConnection.addRequestProperty(X_ANDROID_IID_MIGRATION_KEY, str5);
                    }
                    writeFIDCreateRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection, str2, str4);
                    int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                    this.requestLimiter.setNextRequestTime(responseCode);
                    if (isSuccessfulResponseCode(responseCode)) {
                        createResponse = readCreateResponse(httpURLConnectionOpenHttpURLConnection);
                    } else {
                        logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            logBadConfigError();
                            createResponse = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                        }
                        httpURLConnectionOpenHttpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return createResponse;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public void deleteFirebaseInstallation(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(DELETE_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        int i = 0;
        while (i <= 1) {
            TrafficStats.setThreadStatsTag(TRAFFIC_STATS_DELETE_INSTALLATION_TAG);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                httpURLConnectionOpenHttpURLConnection.setRequestMethod(HttpMethods.DELETE);
                httpURLConnectionOpenHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                    logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        logBadConfigError();
                        throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                    }
                    i++;
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public TokenResult generateAuthToken(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        TokenResult generateAuthTokenResponse;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod("POST");
                    httpURLConnectionOpenHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                    writeGenerateAuthTokenRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection);
                    int responseCode = httpURLConnectionOpenHttpURLConnection.getResponseCode();
                    this.requestLimiter.setNextRequestTime(responseCode);
                    if (isSuccessfulResponseCode(responseCode)) {
                        generateAuthTokenResponse = readGenerateAuthTokenResponse(httpURLConnectionOpenHttpURLConnection);
                    } else {
                        logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                logBadConfigError();
                                generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                            }
                            httpURLConnectionOpenHttpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return generateAuthTokenResponse;
                } catch (Throwable th) {
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
