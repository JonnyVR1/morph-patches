package p009l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kih0 {

    /* JADX INFO: renamed from: c */
    private static boolean f15709c;

    /* JADX INFO: renamed from: b */
    private static List<String> f15708b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private static String f15707a = (String) ujh0.m23064b("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"});

    static {
        Collections.addAll(f15708b, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17504a() {
        return !TextUtils.isEmpty(f15707a);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17505b() {
        if (!f15709c) {
            f15709c = Collections.unmodifiableList(f15708b).indexOf(f15707a) < 0;
        }
        return f15709c;
    }
}
