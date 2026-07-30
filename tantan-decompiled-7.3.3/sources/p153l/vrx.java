package p153l;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class vrx {

    /* JADX INFO: renamed from: a */
    private static String[] f185533a = new String[0];

    /* JADX INFO: renamed from: b */
    private static String[] f185534b = new String[0];

    /* JADX INFO: renamed from: c */
    private static String[] f185535c = {"vivo Y37A"};

    /* JADX INFO: renamed from: d */
    private static String[] f185536d = new String[0];

    /* JADX INFO: renamed from: e */
    private static String[] f185537e = {"ONEPLUS A6010"};

    /* JADX INFO: renamed from: f */
    public static int f185538f = 0;

    /* JADX INFO: renamed from: g */
    public static int f185539g = 1;

    /* JADX INFO: renamed from: h */
    public static int f185540h = 2;

    /* JADX INFO: renamed from: i */
    public static int f185541i = 3;

    /* JADX INFO: renamed from: j */
    public static int f185542j = 4;

    /* JADX INFO: renamed from: a */
    public static boolean m202566a() {
        return Arrays.asList(f185537e).toString().contains(Build.MODEL);
    }
}
