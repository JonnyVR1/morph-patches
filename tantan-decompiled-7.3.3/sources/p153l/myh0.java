package p153l;

import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class myh0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, Typeface> f139415a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m160793a(String str, Typeface typeface) {
        f139415a.put(str, typeface);
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m160794b(String str) {
        if (f139415a.get(str) == null) {
            m160793a(str, Typeface.createFromAsset(k26.m147943a().getResources().getAssets(), str));
        }
        return f139415a.get(str);
    }
}
