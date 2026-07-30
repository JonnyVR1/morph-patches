package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.core.data.Active;
import p153l.g0y0;
import p153l.jay0;
import p153l.l0y0;
import p153l.vzx0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzb {
    private static final ImmutableSet<String> zza = ImmutableSet.m15828of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final ImmutableList<String> zzb = ImmutableList.m15746of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final ImmutableList<String> zzc = ImmutableList.m15742of("auto", "app", "am");
    private static final ImmutableList<String> zzd = ImmutableList.m15741of("_r", "_dbg");
    private static final ImmutableList<String> zze = new ImmutableList.C2804a().m15753j(l0y0.f129627a).m15753j(l0y0.f129628b).m15756m();
    private static final ImmutableList<String> zzf = ImmutableList.m15741of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static AnalyticsConnector.ConditionalUserProperty zza(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = (String) Preconditions.checkNotNull((String) vzx0.m204129a(bundle, "origin", String.class, null));
        conditionalUserProperty.name = (String) Preconditions.checkNotNull((String) vzx0.m204129a(bundle, AuthenticationTokenClaims.JSON_KEY_NAME, String.class, null));
        conditionalUserProperty.value = vzx0.m204129a(bundle, "value", Object.class, null);
        conditionalUserProperty.triggerEventName = (String) vzx0.m204129a(bundle, "trigger_event_name", String.class, null);
        conditionalUserProperty.triggerTimeout = ((Long) vzx0.m204129a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        conditionalUserProperty.timedOutEventName = (String) vzx0.m204129a(bundle, "timed_out_event_name", String.class, null);
        conditionalUserProperty.timedOutEventParams = (Bundle) vzx0.m204129a(bundle, "timed_out_event_params", Bundle.class, null);
        conditionalUserProperty.triggeredEventName = (String) vzx0.m204129a(bundle, "triggered_event_name", String.class, null);
        conditionalUserProperty.triggeredEventParams = (Bundle) vzx0.m204129a(bundle, "triggered_event_params", Bundle.class, null);
        conditionalUserProperty.timeToLive = ((Long) vzx0.m204129a(bundle, "time_to_live", Long.class, 0L)).longValue();
        conditionalUserProperty.expiredEventName = (String) vzx0.m204129a(bundle, "expired_event_name", String.class, null);
        conditionalUserProperty.expiredEventParams = (Bundle) vzx0.m204129a(bundle, "expired_event_params", Bundle.class, null);
        conditionalUserProperty.active = ((Boolean) vzx0.m204129a(bundle, Active.TYPE, Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.creationTimestamp = ((Long) vzx0.m204129a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        conditionalUserProperty.triggeredTimestamp = ((Long) vzx0.m204129a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return conditionalUserProperty;
    }

    public static boolean zzb(String str, String str2, Bundle bundle) {
        if (!Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            return true;
        }
        if (!zzf(str) || bundle == null) {
            return false;
        }
        ImmutableList<String> immutableList = zzd;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            String str3 = immutableList.get(i);
            i++;
            if (bundle.containsKey(str3)) {
                return false;
            }
        }
        str.getClass();
        switch (str) {
            case "fcm":
                bundle.putString("_cis", "fcm_integration");
                return true;
            case "fdl":
                bundle.putString("_cis", "fdl_integration");
                return true;
            case "fiam":
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean zzc(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int iCodePointAt = str.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            return false;
        }
        int length = str.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public static boolean zzd(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int iCodePointAt = str.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            return false;
        }
        int length = str.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public static boolean zze(String str) {
        return !zza.contains(str);
    }

    public static boolean zzf(String str) {
        return !zzc.contains(str);
    }

    public static String zzb(String str) {
        String strM128476b = g0y0.m128476b(str);
        return strM128476b != null ? strM128476b : str;
    }

    public static boolean zzb(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.value;
        if ((obj != null && jay0.m144170a(obj) == null) || !zzf(str) || !zza(str, conditionalUserProperty.name)) {
            return false;
        }
        String str2 = conditionalUserProperty.expiredEventName;
        if (str2 != null && (!zza(str2, conditionalUserProperty.expiredEventParams) || !zzb(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
            return false;
        }
        String str3 = conditionalUserProperty.triggeredEventName;
        if (str3 != null && (!zza(str3, conditionalUserProperty.triggeredEventParams) || !zzb(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
            return false;
        }
        String str4 = conditionalUserProperty.timedOutEventName;
        if (str4 != null) {
            return zza(str4, conditionalUserProperty.timedOutEventParams) && zzb(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams);
        }
        return true;
    }

    public static Bundle zza(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.origin;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = conditionalUserProperty.name;
        if (str2 != null) {
            bundle.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
        }
        Object obj = conditionalUserProperty.value;
        if (obj != null) {
            vzx0.m204130b(bundle, obj);
        }
        String str3 = conditionalUserProperty.triggerEventName;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.triggerTimeout);
        String str4 = conditionalUserProperty.timedOutEventName;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = conditionalUserProperty.timedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = conditionalUserProperty.triggeredEventName;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = conditionalUserProperty.triggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.timeToLive);
        String str6 = conditionalUserProperty.expiredEventName;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = conditionalUserProperty.expiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.creationTimestamp);
        bundle.putBoolean(Active.TYPE, conditionalUserProperty.active);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.triggeredTimestamp);
        return bundle;
    }

    public static String zza(String str) {
        String strM128475a = g0y0.m128475a(str);
        return strM128475a != null ? strM128475a : str;
    }

    public static void zza(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean zza(String str, Bundle bundle) {
        if (zzb.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList<String> immutableList = zzd;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            String str2 = immutableList.get(i);
            i++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zza(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(Constants.ScionAnalytics.ORIGIN_FCM) || str.equals(FirebaseABTesting.OriginService.REMOTE_CONFIG);
        }
        if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals(Constants.ScionAnalytics.ORIGIN_FCM) || str.equals(FirebaseABTesting.OriginService.INAPP_MESSAGING);
        }
        if (zze.contains(str2)) {
            return false;
        }
        ImmutableList<String> immutableList = zzf;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            String str3 = immutableList.get(i);
            i++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }
}
