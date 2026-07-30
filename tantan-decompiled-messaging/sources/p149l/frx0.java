package p149l;

import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class frx0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f99017a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* JADX INFO: renamed from: b */
    public static final String[] f99018b = {Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* JADX INFO: renamed from: a */
    public static String m122906a(String str) {
        return d1y0.m109701b(str, f99017a, f99018b);
    }
}
