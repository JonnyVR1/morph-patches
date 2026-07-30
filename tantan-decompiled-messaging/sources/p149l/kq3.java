package p149l;

import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes7.dex */
public class kq3 {
    /* JADX INFO: renamed from: a */
    private static String m146919a(double d) {
        if (String.valueOf(d).endsWith(".0")) {
            return String.valueOf((int) d);
        }
        DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(d);
    }

    /* JADX INFO: renamed from: b */
    public static String m146920b(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "0b/s";
        }
        if (d >= 1048576.0d) {
            return m146919a(d / 1048576.0d) + "M/s";
        }
        if (d >= 1024.0d) {
            return m146919a(d / 1024.0d) + "kb/s";
        }
        return m146919a(d) + "b/s";
    }
}
