package com.facebook.appevents.cloudbridge;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import com.tencent.open.SocialConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.p118io.CloseableKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.uxv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001*B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0015\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00120\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u00020\b2\u001a\u0010\u0017\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0087\u0001\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u000f2<\u0010#\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u001fH\u0000¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000f0(j\b\u0012\u0004\u0012\u00020\u000f`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u000f0(j\b\u0012\u0004\u0012\u00020\u000f`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\"\u00105\u001a\u00020/8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0018\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R4\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0019R\"\u0010A\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests;", "", "<init>", "()V", "", "datasetID", "url", "accessKey", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/facebook/GraphRequest;)V", "", "responseCode", "", "", "processedEvents", "maxRetryCount", "g", "(Ljava/lang/Integer;Ljava/util/List;I)V", "events", "c", "(Ljava/util/List;)V", "urlStr", "requestMethod", "jsonBodyStr", "requestProperties", "timeOutInterval", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "requestResult", "requestCallback", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/functions/Function2;)V", "k", "(Lcom/facebook/GraphRequest;)Ljava/util/List;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "a", "Ljava/util/HashSet;", "ACCEPTABLE_HTTP_RESPONSE", "b", "RETRY_EVENTS_HTTP_RESPONSE", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "e", "()Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", RXScreenCaptureService.KEY_INDEX, "(Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;)V", "credentials", "", "Ljava/util/List;", "f", "()Ljava/util/List;", "j", "transformedEvents", "I", "getCurrentRetryCount$facebook_core_release", "()I", "setCurrentRetryCount$facebook_core_release", "(I)V", "currentRetryCount", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class AppEventsConversionsAPITransformerWebRequests {

    @NotNull
    public static final AppEventsConversionsAPITransformerWebRequests INSTANCE = new AppEventsConversionsAPITransformerWebRequests();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<Integer> ACCEPTABLE_HTTP_RESPONSE = SetsKt.hashSetOf(200, 202);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<Integer> RETRY_EVENTS_HTTP_RESPONSE = SetsKt.hashSetOf(Integer.valueOf(HttpStatus.SERVICE_UNAVAILABLE_503), Integer.valueOf(HttpStatus.GATEWAY_TIMEOUT_504), 429);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static C1546a credentials;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static List<Map<String, Object>> transformedEvents;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static int currentRetryCount;

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$a */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$a;", "", "", "datasetID", "cloudBridgeURL", "accessKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final /* data */ class C1546a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String datasetID;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String cloudBridgeURL;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String accessKey;

        public C1546a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.datasetID = str;
            this.cloudBridgeURL = str2;
            this.accessKey = str3;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessKey() {
            return this.accessKey;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDatasetID() {
            return this.datasetID;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1546a)) {
                return false;
            }
            C1546a c1546a = (C1546a) other;
            return Intrinsics.m87488d(this.datasetID, c1546a.datasetID) && Intrinsics.m87488d(this.cloudBridgeURL, c1546a.cloudBridgeURL) && Intrinsics.m87488d(this.accessKey, c1546a.accessKey);
        }

        public int hashCode() {
            return (((this.datasetID.hashCode() * 31) + this.cloudBridgeURL.hashCode()) * 31) + this.accessKey.hashCode();
        }

        @NotNull
        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.datasetID + ", cloudBridgeURL=" + this.cloudBridgeURL + ", accessKey=" + this.accessKey + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7686a(GraphRequest graphRequest) throws JSONException {
        graphRequest.getClass();
        String graphPath = graphRequest.getGraphPath();
        List listSplit$default = graphPath != null ? StringsKt.split$default(graphPath, new String[]{"/"}, false, 0, 6, null) : null;
        if (listSplit$default == null || listSplit$default.size() != 2) {
            uxv.INSTANCE.m196208c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", graphRequest);
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
            String str = appEventsConversionsAPITransformerWebRequests.m7691e().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.m7691e().getDatasetID() + "/events";
            List<Map<String, Object>> listM7697k = appEventsConversionsAPITransformerWebRequests.m7697k(graphRequest);
            if (listM7697k == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.m7690c(listM7697k);
            int iMin = Math.min(appEventsConversionsAPITransformerWebRequests.m7692f().size(), 10);
            List listSlice = CollectionsKt.slice((List) appEventsConversionsAPITransformerWebRequests.m7692f(), new IntRange(0, iMin - 1));
            appEventsConversionsAPITransformerWebRequests.m7692f().subList(0, iMin).clear();
            JSONArray jSONArray = new JSONArray((Collection) listSlice);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.m7691e().getAccessKey());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            uxv.Companion companion = uxv.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String string = jSONObject.toString(2);
            string.getClass();
            companion.m196208c(loggingBehavior, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, graphRequest, string);
            appEventsConversionsAPITransformerWebRequests.m7694h(str, "POST", jSONObject.toString(), MapsKt.mapOf(TuplesKt.m87240a("Content-Type", "application/json")), HuiYanResultSender.TIMEOUT_MS, new C1547xf719cce4(listSlice));
        } catch (UninitializedPropertyAccessException e) {
            uxv.INSTANCE.m196208c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m7688d(@NotNull String datasetID, @NotNull String url, @NotNull String accessKey) {
        datasetID.getClass();
        url.getClass();
        accessKey.getClass();
        uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
        appEventsConversionsAPITransformerWebRequests.m7695i(new C1546a(datasetID, url, accessKey));
        appEventsConversionsAPITransformerWebRequests.m7696j(new ArrayList());
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m7689l(@NotNull final GraphRequest request) {
        request.getClass();
        C1657e.m8806A0(new Runnable() { // from class: l.qv0
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                AppEventsConversionsAPITransformerWebRequests.m7686a(request);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m7690c(@Nullable List<? extends Map<String, ? extends Object>> events) {
        if (events != null) {
            m7692f().addAll(events);
        }
        int iMax = Math.max(0, m7692f().size() - 1000);
        if (iMax > 0) {
            List listDrop = CollectionsKt.drop(m7692f(), iMax);
            listDrop.getClass();
            m7696j(TypeIntrinsics.m87536c(listDrop));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C1546a m7691e() {
        C1546a c1546a = credentials;
        if (c1546a != null) {
            return c1546a;
        }
        Intrinsics.m87502r("credentials");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<Map<String, Object>> m7692f() {
        List<Map<String, Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        Intrinsics.m87502r("transformedEvents");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m7693g(@Nullable Integer responseCode, @NotNull List<? extends Map<String, ? extends Object>> processedEvents, int maxRetryCount) {
        processedEvents.getClass();
        if (CollectionsKt.contains(RETRY_EVENTS_HTTP_RESPONSE, responseCode)) {
            if (currentRetryCount >= maxRetryCount) {
                m7692f().clear();
                currentRetryCount = 0;
            } else {
                m7692f().addAll(0, processedEvents);
                currentRetryCount++;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7694h(@NotNull String urlStr, @NotNull String requestMethod, @Nullable String jsonBodyStr, @Nullable Map<String, String> requestProperties, int timeOutInterval, @Nullable Function2<? super String, ? super Integer, Unit> requestCallback) {
        Set<String> setKeySet;
        urlStr.getClass();
        requestMethod.getClass();
        try {
            URLConnection uRLConnectionOpenConnection = new URL(urlStr).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (requestProperties != null && (setKeySet = requestProperties.keySet()) != null) {
                for (String str : setKeySet) {
                    httpURLConnection.setRequestProperty(str, requestProperties.get(str));
                }
            }
            httpURLConnection.setDoOutput(httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals(HttpMethods.PUT));
            httpURLConnection.setConnectTimeout(timeOutInterval);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
            bufferedWriter.write(jsonBodyStr);
            bufferedWriter.flush();
            bufferedWriter.close();
            bufferedOutputStream.close();
            StringBuilder sb = new StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.m87404a(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(bufferedReader, null);
            }
            String string = sb.toString();
            uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nResponse Received: \n%s\n%s", string, Integer.valueOf(httpURLConnection.getResponseCode()));
            if (requestCallback != null) {
                requestCallback.invoke(string, Integer.valueOf(httpURLConnection.getResponseCode()));
            }
        } catch (UnknownHostException e) {
            uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "Connection failed, retrying: \n%s", e.toString());
            if (requestCallback != null) {
                requestCallback.invoke(null, Integer.valueOf(HttpStatus.SERVICE_UNAVAILABLE_503));
            }
        } catch (IOException e2) {
            uxv.INSTANCE.m196208c(LoggingBehavior.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "Send to server failed: \n%s", e2.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7695i(@NotNull C1546a c1546a) {
        c1546a.getClass();
        credentials = c1546a;
    }

    /* JADX INFO: renamed from: j */
    public final void m7696j(@NotNull List<Map<String, Object>> list) {
        list.getClass();
        transformedEvents = list;
    }

    /* JADX INFO: renamed from: k */
    public final List<Map<String, Object>> m7697k(GraphRequest request) {
        JSONObject graphObject = request.getGraphObject();
        if (graphObject == null) {
            return null;
        }
        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(C1657e.m8852o(graphObject));
        Object tag = request.getTag();
        tag.getClass();
        mutableMap.put("custom_events", tag);
        StringBuilder sb = new StringBuilder();
        for (String str : mutableMap.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(mutableMap.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
        return AppEventsConversionsAPITransformer.INSTANCE.m7674e(mutableMap);
    }
}
