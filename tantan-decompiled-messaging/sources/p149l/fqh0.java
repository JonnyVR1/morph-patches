package p149l;

import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class fqh0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, Typeface> f98807a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m122724a(String str, Typeface typeface) {
        f98807a.put(str, typeface);
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m122725b(String str) {
        if (f98807a.get(str) == null) {
            m122724a(str, Typeface.createFromAsset(f16.m119092a().getResources().getAssets(), str));
        }
        return f98807a.get(str);
    }
}
