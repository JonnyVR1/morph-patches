package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class wih0 extends vih0 {

    /* JADX INFO: renamed from: e */
    private static List<String> f186544e = new ArrayList();

    /* JADX INFO: renamed from: d */
    private static String f186543d = (String) ujh0.m194012b("android.os.SystemProperties", "get", new String[]{"ro.mediatek.platform"});

    static {
        Collections.addAll(f186544e, "MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761");
    }

    public wih0(Context context) {
        super(context);
    }
}
