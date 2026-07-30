package com.facebook.appevents.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1680e;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.rzv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0015"}, m88121d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility;", "", "<init>", "()V", "Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "activityType", "Lcom/facebook/internal/AttributionIdentifiers;", "attributionIdentifiers", "", "anonymousAppDeviceGUID", "", "limitEventUsage", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "a", "(Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;", "", "Ljava/util/Map;", "API_ACTIVITY_TYPE_TO_STRING", "GraphAPIActivityType", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class AppEventsLoggerUtility {

    @NotNull
    public static final AppEventsLoggerUtility INSTANCE = new AppEventsLoggerUtility();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<GraphAPIActivityType, String> API_ACTIVITY_TYPE_TO_STRING = MapsKt.hashMapOf(TuplesKt.m88129a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), TuplesKt.m88129a(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JSONObject m7978a(@NotNull GraphAPIActivityType activityType, @Nullable AttributionIdentifiers attributionIdentifiers, @Nullable String anonymousAppDeviceGUID, boolean limitEventUsage, @NotNull Context context) throws JSONException {
        activityType.getClass();
        context.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, API_ACTIVITY_TYPE_TO_STRING.get(activityType));
        String strM7704e = AppEventsLogger.INSTANCE.m7704e();
        if (strM7704e != null) {
            jSONObject.put("app_user_id", strM7704e);
        }
        C1680e.m8862B0(jSONObject, attributionIdentifiers, anonymousAppDeviceGUID, limitEventUsage, context);
        try {
            C1680e.m8863C0(jSONObject, context);
        } catch (Exception e) {
            rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject jSONObjectM8864D = C1680e.m8864D();
        if (jSONObjectM8864D != null) {
            Iterator<String> itKeys = jSONObjectM8864D.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectM8864D.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
