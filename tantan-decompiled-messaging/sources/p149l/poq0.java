package p149l;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class poq0 {

    /* JADX INFO: renamed from: b */
    private static volatile poq0 f150554b;

    /* JADX INFO: renamed from: a */
    private final biq0 f150555a;

    private poq0(Context context) {
        this.f150555a = new biq0(context);
    }

    /* JADX INFO: renamed from: a */
    public static poq0 m170634a(Context context) {
        if (f150554b == null) {
            synchronized (poq0.class) {
                try {
                    if (f150554b == null) {
                        f150554b = new poq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f150554b;
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m170635b() {
        return new JSONArray();
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m170636c(long j) {
        return new JSONObject();
    }

    /* JADX INFO: renamed from: e */
    public static void m170637e() {
        if (f150554b == null || f150554b.f150555a == null) {
            return;
        }
        f150554b.f150555a.m102109m();
    }

    /* JADX INFO: renamed from: f */
    public static void m170638f() {
        if (f150554b == null || f150554b.f150555a == null) {
            return;
        }
        f150554b.f150555a.m102111t();
    }

    /* JADX INFO: renamed from: d */
    public void m170639d() {
        this.f150555a.m102107d();
    }
}
