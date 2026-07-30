package com.facebook;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1680e;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p153l.rzv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\u0018\u0000 .2\u00020\u0001:\u0002\u0018/BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'R\u0019\u0010)\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\"\u0010\u0015R\u0019\u0010-\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010,¨\u00060"}, m88121d2 = {"Lcom/facebook/GraphResponse;", "", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "Ljava/net/HttpURLConnection;", "connection", "", "rawResponse", "Lorg/json/JSONObject;", "graphObject", "Lorg/json/JSONArray;", "graphObjectArray", "Lcom/facebook/FacebookRequestError;", "error", "<init>", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lcom/facebook/FacebookRequestError;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V", "graphObjects", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V", "c", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "a", "Lcom/facebook/GraphRequest;", "getRequest", "()Lcom/facebook/GraphRequest;", "b", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "Ljava/lang/String;", "e", Constants.INAPP_DATA_TAG, "Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "f", "Lcom/facebook/FacebookRequestError;", "()Lcom/facebook/FacebookRequestError;", "g", "jsonObject", "h", "getJsonArray", "()Lorg/json/JSONArray;", "jsonArray", "Companion", "PagingDirection", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class GraphResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    @Nullable
    public static final String f5962i = GraphResponse.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final GraphRequest request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String rawResponse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final JSONObject graphObject;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final JSONArray graphObjectArray;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final FacebookRequestError error;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final JSONObject jsonObject;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final JSONArray jsonArray;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/facebook/GraphResponse$PagingDirection;", "", "(Ljava/lang/String;I)V", "NEXT", "PREVIOUS", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum PagingDirection {
        NEXT,
        PREVIOUS
    }

    /* JADX INFO: renamed from: com.facebook.GraphResponse$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!R\u0014\u0010%\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!¨\u0006'"}, m88121d2 = {"Lcom/facebook/GraphResponse$a;", "", "<init>", "()V", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/e;", "requests", "", "Lcom/facebook/GraphResponse;", "f", "(Ljava/net/HttpURLConnection;Lcom/facebook/e;)Ljava/util/List;", "Ljava/io/InputStream;", "stream", Constants.INAPP_DATA_TAG, "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/e;)Ljava/util/List;", "", "responseString", "e", "(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/facebook/e;)Ljava/util/List;", "Lcom/facebook/GraphRequest;", "Lcom/facebook/FacebookException;", "error", "a", "(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;", "sourceObject", "c", "(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", SocialConstants.TYPE_REQUEST, "originalResult", "b", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/Object;Ljava/lang/Object;)Lcom/facebook/GraphResponse;", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "NON_JSON_RESPONSE_PROPERTY", "RESPONSE_LOG_TAG", "SUCCESS_KEY", "TAG", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<GraphResponse> m7661a(@NotNull List<GraphRequest> requests, @Nullable HttpURLConnection connection, @Nullable FacebookException error) {
            requests.getClass();
            List<GraphRequest> list = requests;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it.next(), connection, new FacebookRequestError(connection, error)));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public final GraphResponse m7662b(GraphRequest request, HttpURLConnection connection, Object sourceObject, Object originalResult) throws JSONException {
            if (sourceObject instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) sourceObject;
                FacebookRequestError facebookRequestErrorM7557a = FacebookRequestError.INSTANCE.m7557a(jSONObject, originalResult, connection);
                if (facebookRequestErrorM7557a != null) {
                    Log.e(GraphResponse.f5962i, facebookRequestErrorM7557a.toString());
                    if (facebookRequestErrorM7557a.getErrorCode() == 190 && C1680e.m8881Y(request.getAccessToken())) {
                        if (facebookRequestErrorM7557a.getSubErrorCode() != 493) {
                            AccessToken.INSTANCE.m7494i(null);
                        } else {
                            AccessToken.Companion companion = AccessToken.INSTANCE;
                            AccessToken accessTokenM7490e = companion.m7490e();
                            if (accessTokenM7490e != null && !accessTokenM7490e.m7478q()) {
                                companion.m7489d();
                            }
                        }
                    }
                    return new GraphResponse(request, connection, facebookRequestErrorM7557a);
                }
                Object objM8875O = C1680e.m8875O(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (objM8875O instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objM8875O;
                    return new GraphResponse(request, connection, jSONObject2.toString(), jSONObject2);
                }
                if (objM8875O instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objM8875O;
                    return new GraphResponse(request, connection, jSONArray.toString(), jSONArray);
                }
                sourceObject = JSONObject.NULL;
                sourceObject.getClass();
            }
            if (sourceObject == JSONObject.NULL) {
                return new GraphResponse(request, connection, sourceObject.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: ".concat(sourceObject.getClass().getSimpleName()));
        }

        /* JADX INFO: renamed from: c */
        public final List<GraphResponse> m7663c(HttpURLConnection connection, List<GraphRequest> requests, Object sourceObject) throws JSONException, FacebookException {
            Object obj;
            int size = requests.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", sourceObject);
                    jSONObject.put("code", connection != null ? connection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e) {
                    arrayList.add(new GraphResponse(graphRequest, connection, new FacebookRequestError(connection, e)));
                    obj = sourceObject;
                } catch (JSONException e2) {
                    arrayList.add(new GraphResponse(graphRequest, connection, new FacebookRequestError(connection, e2)));
                    obj = sourceObject;
                }
            } else {
                obj = sourceObject;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        GraphRequest graphRequest2 = requests.get(i);
                        try {
                            Object obj2 = ((JSONArray) obj).get(i);
                            obj2.getClass();
                            arrayList.add(m7662b(graphRequest2, connection, obj2, sourceObject));
                        } catch (FacebookException e3) {
                            arrayList.add(new GraphResponse(graphRequest2, connection, new FacebookRequestError(connection, e3)));
                        } catch (JSONException e4) {
                            arrayList.add(new GraphResponse(graphRequest2, connection, new FacebookRequestError(connection, e4)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final List<GraphResponse> m7664d(@Nullable InputStream stream, @Nullable HttpURLConnection connection, @NotNull C1622e requests) throws Throwable {
            requests.getClass();
            String strM8914s0 = C1680e.m8914s0(stream);
            rzv.INSTANCE.m183849c(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strM8914s0.length()), strM8914s0);
            return m7665e(strM8914s0, connection, requests);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<GraphResponse> m7665e(@NotNull String responseString, @Nullable HttpURLConnection connection, @NotNull C1622e requests) throws JSONException, FacebookException, IOException {
            responseString.getClass();
            requests.getClass();
            Object objNextValue = new JSONTokener(responseString).nextValue();
            objNextValue.getClass();
            List<GraphResponse> listM7663c = m7663c(connection, requests, objNextValue);
            rzv.INSTANCE.m183849c(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.getId(), Integer.valueOf(responseString.length()), listM7663c);
            return listM7663c;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: f */
        public final List<GraphResponse> m7666f(@NotNull HttpURLConnection connection, @NotNull C1622e requests) {
            List<GraphResponse> listM7661a;
            connection.getClass();
            requests.getClass();
            try {
                try {
                    if (!C1600c.m8080E()) {
                        Log.e(GraphResponse.f5962i, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    InputStream errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    List<GraphResponse> listM7664d = m7664d(errorStream, connection, requests);
                    C1680e.m8897j(errorStream);
                    return listM7664d;
                } catch (FacebookException e) {
                    rzv.INSTANCE.m183849c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e);
                    listM7661a = m7661a(requests, connection, e);
                    C1680e.m8897j(null);
                    return listM7661a;
                } catch (Exception e2) {
                    rzv.INSTANCE.m183849c(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e2);
                    listM7661a = m7661a(requests, connection, new FacebookException(e2));
                    C1680e.m8897j(null);
                    return listM7661a;
                }
            } catch (Throwable th) {
                C1680e.m8897j(null);
                throw th;
            }
        }

        public Companion() {
        }
    }

    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable JSONArray jSONArray, @Nullable FacebookRequestError facebookRequestError) {
        graphRequest.getClass();
        this.request = graphRequest;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FacebookRequestError getError() {
        return this.error;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRawResponse() {
        return this.rawResponse;
    }

    @NotNull
    public String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.connection;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + "}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @NotNull String str, @Nullable JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        graphRequest.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @NotNull String str, @NotNull JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        graphRequest.getClass();
        str.getClass();
        jSONArray.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @NotNull FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        graphRequest.getClass();
        facebookRequestError.getClass();
    }
}
