package p153l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.R$string;
import com.clevertap.android.sdk.events.EventGroup;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0006*\u00020\fH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001f\u001a\u00020\u001e*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010#\u001a\u00020\u0003*\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010&\u001a\u00020\u0003*\u00020%¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010(\u001a\u00020!*\u0004\u0018\u00010!¢\u0006\u0004\b(\u0010)\u001a'\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010!0,*\u00020*2\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.\u001a+\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0/0,*\u00020*2\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b0\u0010.\u001a\u0019\u00102\u001a\u00020\u001e*\u00020*2\u0006\u00101\u001a\u00020*¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u00020**\u00020*¢\u0006\u0004\b4\u00105\u001a\u0013\u00106\u001a\u00020\u0003*\u0004\u0018\u00010*¢\u0006\u0004\b6\u00107\u001a)\u00109\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00108\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:\u001a\u0011\u0010<\u001a\u00020\u0003*\u00020;¢\u0006\u0004\b<\u0010=\u001a\u0015\u0010>\u001a\u0004\u0018\u00010**\u0004\u0018\u00010\u0006¢\u0006\u0004\b>\u0010?\u001a$\u0010@\u001a\u00020\u0003*\u0004\u0018\u00010\u0006\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b@\u0010A\u001aI\u0010K\u001a\u00020\u001e*\u00020B26\u0010J\u001a2\u0012\u0013\u0012\u00110D¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110H¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(I\u0012\u0004\u0012\u00020\u001e0C¢\u0006\u0004\bK\u0010L\"\u0015\u0010O\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, m88121d2 = {"Landroid/content/Context;", "", "apiLevel", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/content/Context;I)Z", "", "channelId", "r", "(Landroid/content/Context;Ljava/lang/String;)Z", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Z", "Landroid/app/NotificationManager;", "msgChannel", "context", "hideHeadsUp", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/app/NotificationManager;Ljava/lang/String;Landroid/content/Context;Z)Ljava/lang/String;", "channelSource", BaseSei.f14625Y, "(Landroid/app/NotificationManager;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "(Landroid/app/NotificationManager;Landroid/content/Context;Z)Ljava/lang/String;", "j", "(Landroid/app/NotificationManager;)Ljava/lang/String;", "h", "(Landroid/app/NotificationManager;Landroid/content/Context;)Ljava/lang/String;", "Lcom/clevertap/android/sdk/CleverTapAPI;", "logTag", BLiveRole.caller, "", "k", "(Lcom/clevertap/android/sdk/CleverTapAPI;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Lorg/json/JSONArray;", FirebaseAnalytics.Param.INDEX, "o", "(Lorg/json/JSONArray;I)Z", "Landroid/content/SharedPreferences;", "n", "(Landroid/content/SharedPreferences;)Z", "u", "(Lorg/json/JSONArray;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", Constants.KEY_KEY, "Lkotlin/Pair;", ResourceDirection.f39656v, "(Lorg/json/JSONObject;Ljava/lang/String;)Lkotlin/Pair;", "", "w", "other", "g", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "f", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "q", "(Lorg/json/JSONObject;)Z", "separator", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/location/Location;", Constants.KEY_T, "(Landroid/location/Location;)Z", BaseSei.f14624X, "(Ljava/lang/String;)Lorg/json/JSONObject;", "p", "(Ljava/lang/String;)Z", "Landroid/view/View;", "Lkotlin/Function2;", "Ll/svm;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "insets", "Landroid/view/ViewGroup$MarginLayoutParams;", "mlp", "marginAdjuster", "c", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;)V", "m", "(Landroid/content/Context;)I", "targetSdkVersion", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class kx3 {
    /* JADX INFO: renamed from: a */
    public static Void m151780a(CleverTapAPI cleverTapAPI, Context context, String str, String str2) {
        cleverTapAPI.getClass();
        context.getClass();
        str.getClass();
        str2.getClass();
        try {
            cleverTapAPI.m5847H().getBaseEventQueueManager().mo140245c(context, EventGroup.PUSH_NOTIFICATION_VIEWED, str);
            return null;
        } catch (Exception e) {
            Logger.m5921d(str2, "Failed to flush push impressions on CT instance = " + cleverTapAPI.m5847H().getConfig().getAccountId(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static dgq0 m151781b(Function2 function2, View view, dgq0 dgq0Var) {
        function2.getClass();
        view.getClass();
        dgq0Var.getClass();
        svm svmVarM115680f = dgq0Var.m115680f(dgq0.C16531l.m115737f() | dgq0.C16531l.m115732a());
        svmVarM115680f.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            mnd0.m159157a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        function2.invoke(svmVarM115680f, marginLayoutParams);
        view.setLayoutParams(marginLayoutParams);
        return dgq0.f88335b;
    }

    /* JADX INFO: renamed from: c */
    public static final void m151782c(@NotNull View view, @NotNull final Function2<? super svm, ? super ViewGroup.MarginLayoutParams, Unit> function2) {
        view.getClass();
        function2.getClass();
        kkl0.m150194y0(view, new il50() { // from class: l.jx3
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view2, dgq0 dgq0Var) {
                return kx3.m151781b(function2, view2, dgq0Var);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m151783d(@NotNull Context context) {
        context.getClass();
        try {
            return c050.m107319e(context).m107322a();
        } catch (Exception e) {
            Logger.m5921d(Constants.CLEVERTAP_LOG_TAG, "Unable to query notifications enabled flag, returning true!", e);
            return true;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m151784e(@Nullable String str, @Nullable String str2, @NotNull String str3) {
        str3.getClass();
        if (str == null || str2 == null) {
            return str == null ? str2 : str;
        }
        return str + str3 + str2;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final JSONObject m151785f(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        JSONObject jSONObject2 = new JSONObject();
        m151786g(jSONObject2, jSONObject);
        return jSONObject2;
    }

    /* JADX INFO: renamed from: g */
    public static final void m151786g(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        Iterator<String> itKeys = jSONObject2.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: h */
    private static final String m151787h(NotificationManager notificationManager, Context context) {
        String string;
        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
            try {
                string = context.getString(R$string.f4861b);
            } catch (Exception e) {
                Logger.m5921d(Constants.CLEVERTAP_LOG_TAG, "Failed to fetch fallback channel name from resources", e);
                string = Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME;
            }
            string.getClass();
            hx3.m137557a();
            notificationManager.createNotificationChannel(iy40.m142608a("fcm_fallback_notification_channel", string, 3));
            Logger.m5920d(Constants.CLEVERTAP_LOG_TAG, "Created default fallback channel: fcm_fallback_notification_channel");
        }
        return "fcm_fallback_notification_channel";
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: i */
    private static final String m151788i(NotificationManager notificationManager, Context context, boolean z) {
        return z ? m151789j(notificationManager) : m151787h(notificationManager, context);
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: j */
    private static final String m151789j(NotificationManager notificationManager) {
        if (notificationManager.getNotificationChannel(Constants.CT_FALLBACK_NOTIFICATION_CHANNEL_ID_LOW) != null) {
            return Constants.CT_FALLBACK_NOTIFICATION_CHANNEL_ID_LOW;
        }
        hx3.m137557a();
        notificationManager.createNotificationChannel(iy40.m142608a(Constants.CT_FALLBACK_NOTIFICATION_CHANNEL_ID_LOW, Constants.LOW_IMPORTANCE_FALLBACK_NOTIFICATION_CHANNEL_NAME, 2));
        Logger.m5920d(Constants.CLEVERTAP_LOG_TAG, "Created low importance fallback channel: ct_fallback_notification_channel_low_importance");
        return Constants.CT_FALLBACK_NOTIFICATION_CHANNEL_ID_LOW;
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public static final void m151790k(@NotNull final CleverTapAPI cleverTapAPI, @NotNull final String str, @NotNull final String str2, @NotNull final Context context) {
        cleverTapAPI.getClass();
        str.getClass();
        str2.getClass();
        context.getClass();
        try {
            ru3.m183186c(cleverTapAPI.m5847H().getConfig()).m187990d().m7005n(str, new Callable() { // from class: l.ix3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return kx3.m151780a(cleverTapAPI, context, str2, str);
                }
            }).get();
        } catch (Exception e) {
            Logger.m5921d(str, "Error getting flush result for push impressions", e);
        }
    }

    @RequiresApi(26)
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: l */
    public static final String m151791l(@NotNull NotificationManager notificationManager, @Nullable String str, @NotNull Context context, boolean z) {
        notificationManager.getClass();
        context.getClass();
        try {
            String strM151804y = m151804y(notificationManager, str, z, "Payload");
            if (strM151804y != null) {
                return strM151804y;
            }
            String strM151804y2 = m151804y(notificationManager, ManifestInfo.getInstance(context).m5937f(), z, "Manifest");
            return strM151804y2 != null ? strM151804y2 : m151788i(notificationManager, context, z);
        } catch (Exception e) {
            Logger.m5921d(Constants.CLEVERTAP_LOG_TAG, "Error getting or creating notification channel", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final int m151792m(@NotNull Context context) {
        context.getClass();
        return context.getApplicationContext().getApplicationInfo().targetSdkVersion;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m151793n(@NotNull SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        Map<String, ?> all = sharedPreferences.getAll();
        all.getClass();
        return !all.isEmpty();
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m151794o(@Nullable JSONArray jSONArray, int i) {
        return jSONArray == null || i < 0 || i >= jSONArray.length();
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m151795p(@Nullable String str) {
        return !(str == null || StringsKt.m94329e0(str));
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m151796q(@Nullable JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m151797r(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return m151783d(context);
        }
        if (!m151783d(context)) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            return ((NotificationManager) systemService).getNotificationChannel(str).getImportance() != 0;
        } catch (Exception e) {
            Logger.m5921d(Constants.CLEVERTAP_LOG_TAG, "Unable to find notification channel with id = " + str, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m151798s(@NotNull Context context, int i) {
        context.getClass();
        return Build.VERSION.SDK_INT > i && m151792m(context) > i;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m151799t(@NotNull Location location) {
        location.getClass();
        double latitude = location.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = location.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final JSONArray m151800u(@Nullable JSONArray jSONArray) {
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final Pair<Boolean, JSONArray> m151801v(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Boolean boolValueOf = Boolean.valueOf(jSONArrayOptJSONArray.length() > 0);
        if (jSONArrayOptJSONArray.length() <= 0) {
            jSONArrayOptJSONArray = null;
        }
        return new Pair<>(boolValueOf, jSONArrayOptJSONArray);
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final Pair<Boolean, List<JSONObject>> m151802w(@NotNull JSONObject jSONObject, @NotNull String str) throws JSONException {
        jSONObject.getClass();
        str.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new Pair<>(Boolean.FALSE, CollectionsKt.emptyList());
        }
        Boolean bool = Boolean.TRUE;
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayOptJSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(obj);
            }
        }
        return new Pair<>(bool, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static final JSONObject m151803x(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: y */
    private static final String m151804y(NotificationManager notificationManager, String str, boolean z, String str2) {
        if (str == null || str.length() == 0) {
            Logger.m5920d(Constants.CLEVERTAP_LOG_TAG, "channelID from " + str2 + " is null or empty");
            return null;
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null) {
            return null;
        }
        if (!z || notificationChannel.getImportance() == 2) {
            return str;
        }
        Logger.m5920d(Constants.CLEVERTAP_LOG_TAG, "Skipping channel " + str + " because heads-up should be hidden in FG but importance is " + notificationChannel.getImportance());
        return null;
    }
}
