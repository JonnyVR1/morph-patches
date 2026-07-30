package p149l;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class yix {

    /* JADX INFO: renamed from: a */
    private static String[] f198551a = new String[0];

    /* JADX INFO: renamed from: b */
    private static String[] f198552b = new String[0];

    /* JADX INFO: renamed from: c */
    private static String[] f198553c = {"vivo Y37A"};

    /* JADX INFO: renamed from: d */
    private static String[] f198554d = new String[0];

    /* JADX INFO: renamed from: e */
    private static String[] f198555e = {"ONEPLUS A6010"};

    /* JADX INFO: renamed from: f */
    public static int f198556f = 0;

    /* JADX INFO: renamed from: g */
    public static int f198557g = 1;

    /* JADX INFO: renamed from: h */
    public static int f198558h = 2;

    /* JADX INFO: renamed from: i */
    public static int f198559i = 3;

    /* JADX INFO: renamed from: j */
    public static int f198560j = 4;

    /* JADX INFO: renamed from: a */
    public static boolean m215025a() {
        return Arrays.asList(f198555e).toString().contains(Build.MODEL);
    }
}
