package p149l;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class i620 {

    /* JADX INFO: renamed from: a */
    public static final HashMap<Object, Throwable> f111670a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static boolean f111671b = false;

    /* JADX INFO: renamed from: c */
    public static c4g0 f111672c = null;

    /* JADX INFO: renamed from: a */
    public static void m134564a(Object obj) {
        if (f111671b) {
            Objects.toString(obj);
            f111670a.put(obj, new Throwable());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m134565b(Object obj) {
        if (f111671b) {
            Objects.toString(obj);
            f111670a.remove(obj);
        }
    }
}
