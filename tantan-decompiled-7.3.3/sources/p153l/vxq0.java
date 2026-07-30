package p153l;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class vxq0 {

    /* JADX INFO: renamed from: b */
    private static volatile vxq0 f186291b;

    /* JADX INFO: renamed from: a */
    private final grq0 f186292a;

    private vxq0(Context context) {
        this.f186292a = new grq0(context);
    }

    /* JADX INFO: renamed from: a */
    public static vxq0 m203869a(Context context) {
        if (f186291b == null) {
            synchronized (vxq0.class) {
                try {
                    if (f186291b == null) {
                        f186291b = new vxq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f186291b;
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m203870b() {
        return new JSONArray();
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m203871c(long j) {
        return new JSONObject();
    }

    /* JADX INFO: renamed from: e */
    public static void m203872e() {
        if (f186291b == null || f186291b.f186292a == null) {
            return;
        }
        f186291b.f186292a.m131854m();
    }

    /* JADX INFO: renamed from: f */
    public static void m203873f() {
        if (f186291b == null || f186291b.f186292a == null) {
            return;
        }
        f186291b.f186292a.m131856t();
    }

    /* JADX INFO: renamed from: d */
    public void m203874d() {
        this.f186292a.m131852d();
    }
}
