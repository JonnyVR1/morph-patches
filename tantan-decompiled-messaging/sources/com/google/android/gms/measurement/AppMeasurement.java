package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Active;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e0y0;
import p149l.pqx0;
import p149l.ujx0;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    public static volatile AppMeasurement f10438b;

    /* JADX INFO: renamed from: a */
    public final AbstractC2447a f10439a;

    public AppMeasurement(ujx0 ujx0Var) {
        this.f10439a = new C2449b(ujx0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static AppMeasurement m15060a(Context context, String str, String str2) {
        if (f10438b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f10438b == null) {
                        e0y0 e0y0VarM15061b = m15061b(context, null);
                        if (e0y0VarM15061b != null) {
                            f10438b = new AppMeasurement(e0y0VarM15061b);
                        } else {
                            f10438b = new AppMeasurement(ujx0.m194095a(context, new zzdw(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10438b;
    }

    /* JADX INFO: renamed from: b */
    public static e0y0 m15061b(Context context, Bundle bundle) {
        return (e0y0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurement getInstance(@NonNull Context context) {
        return m15060a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f10439a.zzb(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f10439a.zza(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f10439a.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.f10439a.zzf();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f10439a.zzg();
    }

    @NonNull
    @Keep
    @ShowFirstParty
    @KeepForSdk
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        List<Bundle> listZza = this.f10439a.zza(str, str2);
        ArrayList arrayList = new ArrayList(listZza == null ? 0 : listZza.size());
        Iterator<Bundle> it = listZza.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f10439a.zzh();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f10439a.zzi();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f10439a.zzj();
    }

    @Keep
    @ShowFirstParty
    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f10439a.zza(str);
    }

    @NonNull
    @Keep
    @VisibleForTesting
    @WorkerThread
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull @Size(max = 24, min = 1) String str2, boolean z) {
        return this.f10439a.zza(str, str2, z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f10439a.zzb(str, str2, bundle);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        AbstractC2447a abstractC2447a = this.f10439a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(Constants.JumpUrlConstants.URL_KEY_APPID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            pqx0.m170939b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(Active.TYPE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC2447a.zza(bundle);
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static abstract class AbstractC2447a implements e0y0 {
        public AbstractC2447a() {
        }
    }

    public AppMeasurement(e0y0 e0y0Var) {
        this.f10439a = new C2448a(e0y0Var);
    }

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mAppId;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mName;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mOrigin;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public String mTriggerEventName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        @ShowFirstParty
        @KeepForSdk
        public Object mValue;

        @VisibleForTesting
        public ConditionalUserProperty(@NonNull Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) pqx0.m170938a(bundle, Constants.JumpUrlConstants.URL_KEY_APPID, String.class, null);
            this.mOrigin = (String) pqx0.m170938a(bundle, "origin", String.class, null);
            this.mName = (String) pqx0.m170938a(bundle, AuthenticationTokenClaims.JSON_KEY_NAME, String.class, null);
            this.mValue = pqx0.m170938a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) pqx0.m170938a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) pqx0.m170938a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) pqx0.m170938a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) pqx0.m170938a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) pqx0.m170938a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) pqx0.m170938a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) pqx0.m170938a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) pqx0.m170938a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) pqx0.m170938a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) pqx0.m170938a(bundle, Active.TYPE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) pqx0.m170938a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) pqx0.m170938a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty() {
        }
    }
}
