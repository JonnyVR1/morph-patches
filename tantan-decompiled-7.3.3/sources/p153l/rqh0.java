package p153l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rqh0 {

    /* JADX INFO: renamed from: c */
    private static boolean f164488c;

    /* JADX INFO: renamed from: b */
    private static List<String> f164487b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private static String f164486a = (String) bsh0.m106238b("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"});

    static {
        Collections.addAll(f164487b, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m182622a() {
        return !TextUtils.isEmpty(f164486a);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m182623b() {
        if (!f164488c) {
            f164488c = Collections.unmodifiableList(f164487b).indexOf(f164486a) < 0;
        }
        return f164488c;
    }
}
