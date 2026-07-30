package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.internal.C1678c;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.jlj;
import p153l.klj;

/* JADX INFO: renamed from: com.facebook.internal.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00182\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00101¨\u00063"}, m88121d2 = {"Lcom/facebook/internal/c;", "", "<init>", "()V", "Lcom/facebook/internal/c$a;", "callback", "", "h", "(Lcom/facebook/internal/c$a;)V", "", "applicationId", "", "forceRequery", "Lorg/json/JSONObject;", "k", "(Ljava/lang/String;Z)Lorg/json/JSONObject;", AuthenticationTokenClaims.JSON_KEY_NAME, "defaultValue", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Z)Z", "gateKeepersJSON", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "g", "", "e", "(Ljava/lang/String;)Ljava/util/Map;", "j", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "timestamp", "f", "(Ljava/lang/Long;)Z", "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "callbacks", "", "Ljava/util/Map;", "fetchedAppGateKeepers", "Ljava/lang/Long;", "Ll/klj;", "Ll/klj;", "gateKeeperRuntimeCache", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class C1678c {

    @NotNull
    public static final C1678c INSTANCE = new C1678c();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static final String TAG = Reflection.m88396b(C1678c.class).mo88360s();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isLoading = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentLinkedQueue<a> callbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static Long timestamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static klj gateKeeperRuntimeCache;

    /* JADX INFO: renamed from: com.facebook.internal.c$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/facebook/internal/c$a;", "", "", "onCompleted", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface a {
        void onCompleted();
    }

    /* JADX INFO: renamed from: a */
    public static void m8818a(String str, Context context, String str2) {
        str.getClass();
        context.getClass();
        str2.getClass();
        C1678c c1678c = INSTANCE;
        JSONObject jSONObjectM8824c = c1678c.m8824c(str);
        if (jSONObjectM8824c.length() != 0) {
            m8822i(str, jSONObjectM8824c);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectM8824c.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        c1678c.m8828j();
        isLoading.set(false);
    }

    /* JADX INFO: renamed from: b */
    public static void m8819b(a aVar) {
        aVar.onCompleted();
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m8820d(@NotNull String name, @Nullable String applicationId, boolean defaultValue) {
        Boolean bool;
        name.getClass();
        Map<String, Boolean> mapM8825e = INSTANCE.m8825e(applicationId);
        return (mapM8825e.containsKey(name) && (bool = mapM8825e.get(name)) != null) ? bool.booleanValue() : defaultValue;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final synchronized void m8821h(@Nullable a callback) {
        if (callback != null) {
            try {
                callbacks.add(callback);
            } catch (Throwable th) {
                throw th;
            }
        }
        final String strM8102m = C1600c.m8102m();
        C1678c c1678c = INSTANCE;
        if (c1678c.m8826f(timestamp) && fetchedAppGateKeepers.containsKey(strM8102m)) {
            c1678c.m8828j();
            return;
        }
        final Context contextM8101l = C1600c.m8101l();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strM8102m}, 1));
        if (contextM8101l == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextM8101l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!C1680e.m8886c0(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                C1680e.m8896i0("FacebookSDK", e);
            }
            if (jSONObject != null) {
                m8822i(strM8102m, jSONObject);
            }
        }
        Executor executorM8110u = C1600c.m8110u();
        if (executorM8110u == null) {
            return;
        }
        if (isLoading.compareAndSet(false, true)) {
            executorM8110u.execute(new Runnable() { // from class: l.aii
                @Override // java.lang.Runnable
                public final void run() {
                    C1678c.m8818a(strM8102m, contextM8101l, str);
                }
            });
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final synchronized JSONObject m8822i(@NotNull String applicationId, @Nullable JSONObject gateKeepersJSON) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        try {
            applicationId.getClass();
            jSONObject = fetchedAppGateKeepers.get(applicationId);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject = (gateKeepersJSON == null || (jSONArrayOptJSONArray = gateKeepersJSON.optJSONArray("data")) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                    jSONObject.put(jSONObject2.getString(Constants.KEY_KEY), jSONObject2.getBoolean("value"));
                } catch (JSONException e) {
                    C1680e.m8896i0("FacebookSDK", e);
                }
            }
            fetchedAppGateKeepers.put(applicationId, jSONObject);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final JSONObject m8823k(@NotNull String applicationId, boolean forceRequery) {
        applicationId.getClass();
        if (!forceRequery) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectM8824c = INSTANCE.m8824c(applicationId);
        Context contextM8101l = C1600c.m8101l();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        contextM8101l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1)), jSONObjectM8824c.toString()).apply();
        return m8822i(applicationId, jSONObjectM8824c);
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m8824c(String applicationId) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, C1600c.m8078C());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.Companion companion = GraphRequest.INSTANCE;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        GraphRequest graphRequestM7639x = companion.m7639x(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        graphRequestM7639x.m7574G(bundle);
        JSONObject jsonObject = graphRequestM7639x.m7579j().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<String, Boolean> m8825e(@Nullable String applicationId) {
        m8827g();
        if (applicationId != null) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                klj kljVar = gateKeeperRuntimeCache;
                List<jlj> listM150368a = kljVar != null ? kljVar.m150368a(applicationId) : null;
                if (listM150368a != null) {
                    HashMap map2 = new HashMap();
                    for (jlj jljVar : listM150368a) {
                        map2.put(jljVar.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), Boolean.valueOf(jljVar.getValue()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(applicationId);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    map3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                klj kljVar2 = gateKeeperRuntimeCache;
                if (kljVar2 == null) {
                    kljVar2 = new klj();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new jlj((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                kljVar2.m150369b(applicationId, arrayList);
                gateKeeperRuntimeCache = kljVar2;
                return map3;
            }
        }
        return new HashMap();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8826f(Long timestamp2) {
        return timestamp2 != null && System.currentTimeMillis() - timestamp2.longValue() < 3600000;
    }

    /* JADX INFO: renamed from: g */
    public final void m8827g() {
        m8821h(null);
    }

    /* JADX INFO: renamed from: j */
    public final void m8828j() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new Runnable() { // from class: l.bii
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1678c.m8819b(aVarPoll);
                    }
                });
            }
        }
    }
}
