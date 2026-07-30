package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FeatureManager;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0011\u0010+\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b#\u0010*R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0,8F¢\u0006\u0006\u001a\u0004\b&\u0010-¨\u00060"}, m87232d2 = {"Ll/nke0;", "", "Lcom/facebook/internal/AttributionIdentifiers;", "attributionIdentifiers", "", "anonymousAppDeviceGUID", "<init>", "(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "", "a", "(Lcom/facebook/appevents/AppEvent;)V", "", "moveToAccumulated", "b", "(Z)V", "Lcom/facebook/GraphRequest;", SocialConstants.TYPE_REQUEST, "Landroid/content/Context;", "applicationContext", "includeImplicitEvents", "limitEventUsage", "", "e", "(Lcom/facebook/GraphRequest;Landroid/content/Context;ZZ)I", "numSkipped", "Lorg/json/JSONArray;", "events", "operationalParameters", "f", "(Lcom/facebook/GraphRequest;Landroid/content/Context;ILorg/json/JSONArray;Lorg/json/JSONArray;Z)V", "Lcom/facebook/internal/AttributionIdentifiers;", "Ljava/lang/String;", "", "c", "Ljava/util/List;", "accumulatedEvents", Constants.INAPP_DATA_TAG, "inFlightEvents", "I", "numSkippedEventsDueToFullBuffer", "()I", "accumulatedEventCount", "", "()Ljava/util/List;", "eventsToPersist", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class nke0 {

    /* JADX INFO: renamed from: f */
    public static final String f139394f = nke0.class.getSimpleName();

    /* JADX INFO: renamed from: g */
    public static final int f139395g = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AttributionIdentifiers attributionIdentifiers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String anonymousAppDeviceGUID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public List<AppEvent> accumulatedEvents;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<AppEvent> inFlightEvents;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int numSkippedEventsDueToFullBuffer;

    public nke0(@NotNull AttributionIdentifiers attributionIdentifiers, @NotNull String str) {
        attributionIdentifiers.getClass();
        str.getClass();
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = str;
        this.accumulatedEvents = new ArrayList();
        this.inFlightEvents = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m159826a(@NotNull AppEvent event) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            event.getClass();
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= f139395g) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(event);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m159827b(boolean moveToAccumulated) {
        if (lsb.m151554d(this)) {
            return;
        }
        if (moveToAccumulated) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized int m159828c() {
        if (lsb.m151554d(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return 0;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final synchronized List<AppEvent> m159829d() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m159830e(@NotNull GraphRequest request, @NotNull Context applicationContext, boolean includeImplicitEvents, boolean limitEventUsage) {
        Throwable th;
        Throwable th2;
        if (lsb.m151554d(this)) {
            return 0;
        }
        try {
            request.getClass();
            applicationContext.getClass();
            try {
                synchronized (this) {
                    try {
                        int i = this.numSkippedEventsDueToFullBuffer;
                        c3f.m105010d(this.accumulatedEvents);
                        this.inFlightEvents.addAll(this.accumulatedEvents);
                        this.accumulatedEvents.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (AppEvent appEvent : this.inFlightEvents) {
                            try {
                                if (includeImplicitEvents || !appEvent.isImplicit()) {
                                    jSONArray.put(appEvent.getJsonObject());
                                    jSONArray2.put(appEvent.getOperationalJsonObject());
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            Unit unit = Unit.INSTANCE;
                            m159831f(request, applicationContext, i, jSONArray, jSONArray2, limitEventUsage);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                            lsb.m151552b(th, this);
                            return 0;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                lsb.m151552b(th, this);
                return 0;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m159831f(GraphRequest request, Context applicationContext, int numSkipped, JSONArray events, JSONArray operationalParameters, boolean limitEventUsage) {
        JSONObject jSONObject;
        try {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                jSONObject = AppEventsLoggerUtility.m7924a(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, limitEventUsage, applicationContext);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", numSkipped);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            request.m7518E(jSONObject);
            Bundle parameters = request.getParameters();
            String string = events.toString();
            string.getClass();
            parameters.putString("custom_events", string);
            if (FeatureManager.m8679g(FeatureManager.Feature.IapLoggingLib5To7)) {
                parameters.putString("operational_parameters", operationalParameters.toString());
            }
            request.m7521H(string);
            request.m7520G(parameters);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
