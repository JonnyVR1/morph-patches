package p149l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class kih0 {

    /* JADX INFO: renamed from: c */
    private static boolean f123340c;

    /* JADX INFO: renamed from: b */
    private static List<String> f123339b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private static String f123338a = (String) ujh0.m194012b("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"});

    static {
        Collections.addAll(f123339b, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m146089a() {
        return !TextUtils.isEmpty(f123338a);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m146090b() {
        if (!f123340c) {
            f123340c = Collections.unmodifiableList(f123339b).indexOf(f123338a) < 0;
        }
        return f123340c;
    }
}
