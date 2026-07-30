package p003l;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class i620 {

    /* JADX INFO: renamed from: a */
    public static final HashMap<Object, Throwable> f4351a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static boolean f4352b = false;

    /* JADX INFO: renamed from: c */
    public static c4g0 f4353c = null;

    /* JADX INFO: renamed from: a */
    public static void m5068a(Object obj) {
        if (f4352b) {
            Objects.toString(obj);
            f4351a.put(obj, new Throwable());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5069b(Object obj) {
        if (f4352b) {
            Objects.toString(obj);
            f4351a.remove(obj);
        }
    }
}
