package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public class b660 {
    /* JADX INFO: renamed from: a */
    public static double m102705a(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 8.0d) * 3.0d) + 25.0d;
    }

    /* JADX INFO: renamed from: b */
    public static double m102706b(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 25.0d) / 3.0d) + 8.0d;
    }

    /* JADX INFO: renamed from: c */
    public static double m102707c(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 194.0d) / 3.62d) + 30.0d;
    }

    /* JADX INFO: renamed from: d */
    public static double m102708d(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 30.0d) * 3.62d) + 194.0d;
    }
}
