package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Device;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class etq0 implements zsq0 {

    /* JADX INFO: renamed from: f */
    private static volatile etq0 f95797f;

    /* JADX INFO: renamed from: a */
    private zsq0 f95798a;

    /* JADX INFO: renamed from: b */
    private int f95799b = dtq0.f90623a;

    /* JADX INFO: renamed from: c */
    private Context f95800c;

    /* JADX INFO: renamed from: d */
    private String f95801d;

    /* JADX INFO: renamed from: e */
    private long f95802e;

    private etq0(Context context) {
        this.f95800c = context.getApplicationContext();
        this.f95798a = dtq0.m117898a(context);
        ouq0.m169393m("create id manager is: " + this.f95799b);
    }

    /* JADX INFO: renamed from: b */
    private String m122489b(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: c */
    public static etq0 m122490c(Context context) {
        if (f95797f == null) {
            synchronized (etq0.class) {
                try {
                    if (f95797f == null) {
                        f95797f = new etq0(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f95797f;
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public String mo100236a() {
        if (l4r0.m152825j(this.f95800c)) {
            return m122489b(this.f95798a.mo100236a());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.f95802e) <= 86400000) {
            return m122489b(this.f95801d);
        }
        this.f95802e = jCurrentTimeMillis;
        String strM122489b = m122489b(this.f95798a.mo100236a());
        this.f95801d = strM122489b;
        return strM122489b;
    }

    /* JADX INFO: renamed from: e */
    public void m122492e(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strM122493f = m122493f();
        if (!TextUtils.isEmpty(strM122493f)) {
            map.put("udid", strM122493f);
        }
        String strMo100236a = mo100236a();
        if (!TextUtils.isEmpty(strMo100236a)) {
            map.put(Device.OAID, strMo100236a);
        }
        String strM122494g = m122494g();
        if (!TextUtils.isEmpty(strM122494g)) {
            map.put("vaid", strM122494g);
        }
        String strM122495h = m122495h();
        if (!TextUtils.isEmpty(strM122495h)) {
            map.put("aaid", strM122495h);
        }
        map.put("oaid_type", String.valueOf(this.f95799b));
    }

    /* JADX INFO: renamed from: f */
    public String m122493f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public String m122494g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m122495h() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m122491d() {
    }

    @Override // p153l.zsq0
    /* JADX INFO: renamed from: a */
    public boolean mo100237a() {
        return this.f95798a.mo100237a();
    }
}
