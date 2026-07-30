package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public class wx50 {
    /* JADX INFO: renamed from: a */
    public static double m205897a(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 8.0d) * 3.0d) + 25.0d;
    }

    /* JADX INFO: renamed from: b */
    public static double m205898b(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 25.0d) / 3.0d) + 8.0d;
    }

    /* JADX INFO: renamed from: c */
    public static double m205899c(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 194.0d) / 3.62d) + 30.0d;
    }

    /* JADX INFO: renamed from: d */
    public static double m205900d(double d) {
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((d - 30.0d) * 3.62d) + 194.0d;
    }
}
