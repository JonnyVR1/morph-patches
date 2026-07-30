package p153l;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class qe20 {

    /* JADX INFO: renamed from: a */
    public static final HashMap<Object, Throwable> f156785a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static boolean f156786b = false;

    /* JADX INFO: renamed from: c */
    public static kcg0 f156787c = null;

    /* JADX INFO: renamed from: a */
    public static void m176220a(Object obj) {
        if (f156786b) {
            Objects.toString(obj);
            f156785a.put(obj, new Throwable());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m176221b(Object obj) {
        if (f156786b) {
            Objects.toString(obj);
            f156785a.remove(obj);
        }
    }
}
