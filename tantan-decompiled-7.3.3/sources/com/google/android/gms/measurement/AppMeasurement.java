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
import com.p051p1.mobile.putong.core.data.Active;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.atx0;
import p153l.k9y0;
import p153l.vzx0;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b */
    public static volatile AppMeasurement f10475b;

    /* JADX INFO: renamed from: a */
    public final AbstractC2470a f10476a;

    public AppMeasurement(atx0 atx0Var) {
        this.f10476a = new C2472b(atx0Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static AppMeasurement m15114a(Context context, String str, String str2) {
        if (f10475b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f10475b == null) {
                        k9y0 k9y0VarM15115b = m15115b(context, null);
                        if (k9y0VarM15115b != null) {
                            f10475b = new AppMeasurement(k9y0VarM15115b);
                        } else {
                            f10475b = new AppMeasurement(atx0.m100275a(context, new zzdw(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10475b;
    }

    /* JADX INFO: renamed from: b */
    public static k9y0 m15115b(Context context, Bundle bundle) {
        return (k9y0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurement getInstance(@NonNull Context context) {
        return m15114a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f10476a.zzb(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f10476a.zza(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f10476a.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.f10476a.zzf();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f10476a.zzg();
    }

    @NonNull
    @Keep
    @ShowFirstParty
    @KeepForSdk
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        List<Bundle> listZza = this.f10476a.zza(str, str2);
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
        return this.f10476a.zzh();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f10476a.zzi();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f10476a.zzj();
    }

    @Keep
    @ShowFirstParty
    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f10476a.zza(str);
    }

    @NonNull
    @Keep
    @VisibleForTesting
    @WorkerThread
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull @Size(max = 24, min = 1) String str2, boolean z) {
        return this.f10476a.zza(str, str2, z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f10476a.zzb(str, str2, bundle);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        AbstractC2470a abstractC2470a = this.f10476a;
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
            vzx0.m204130b(bundle, obj);
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
        abstractC2470a.zza(bundle);
    }

    /* JADX INFO: renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static abstract class AbstractC2470a implements k9y0 {
        public AbstractC2470a() {
        }
    }

    public AppMeasurement(k9y0 k9y0Var) {
        this.f10476a = new C2471a(k9y0Var);
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
            this.mAppId = (String) vzx0.m204129a(bundle, Constants.JumpUrlConstants.URL_KEY_APPID, String.class, null);
            this.mOrigin = (String) vzx0.m204129a(bundle, "origin", String.class, null);
            this.mName = (String) vzx0.m204129a(bundle, AuthenticationTokenClaims.JSON_KEY_NAME, String.class, null);
            this.mValue = vzx0.m204129a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) vzx0.m204129a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) vzx0.m204129a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) vzx0.m204129a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) vzx0.m204129a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) vzx0.m204129a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) vzx0.m204129a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) vzx0.m204129a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) vzx0.m204129a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) vzx0.m204129a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) vzx0.m204129a(bundle, Active.TYPE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) vzx0.m204129a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) vzx0.m204129a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }

        @KeepForSdk
        public ConditionalUserProperty() {
        }
    }
}
