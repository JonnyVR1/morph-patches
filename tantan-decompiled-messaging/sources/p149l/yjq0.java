package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Device;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class yjq0 implements tjq0 {

    /* JADX INFO: renamed from: f */
    private static volatile yjq0 f198670f;

    /* JADX INFO: renamed from: a */
    private tjq0 f198671a;

    /* JADX INFO: renamed from: b */
    private int f198672b = xjq0.f193241a;

    /* JADX INFO: renamed from: c */
    private Context f198673c;

    /* JADX INFO: renamed from: d */
    private String f198674d;

    /* JADX INFO: renamed from: e */
    private long f198675e;

    private yjq0(Context context) {
        this.f198673c = context.getApplicationContext();
        this.f198671a = xjq0.m209738a(context);
        ilq0.m137040m("create id manager is: " + this.f198672b);
    }

    /* JADX INFO: renamed from: b */
    private String m215083b(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: c */
    public static yjq0 m215084c(Context context) {
        if (f198670f == null) {
            synchronized (yjq0.class) {
                try {
                    if (f198670f == null) {
                        f198670f = new yjq0(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198670f;
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public String mo97174a() {
        if (fvq0.m123356j(this.f198673c)) {
            return m215083b(this.f198671a.mo97174a());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.f198675e) <= 86400000) {
            return m215083b(this.f198674d);
        }
        this.f198675e = jCurrentTimeMillis;
        String strM215083b = m215083b(this.f198671a.mo97174a());
        this.f198674d = strM215083b;
        return strM215083b;
    }

    /* JADX INFO: renamed from: e */
    public void m215086e(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strM215087f = m215087f();
        if (!TextUtils.isEmpty(strM215087f)) {
            map.put("udid", strM215087f);
        }
        String strMo97174a = mo97174a();
        if (!TextUtils.isEmpty(strMo97174a)) {
            map.put(Device.OAID, strMo97174a);
        }
        String strM215088g = m215088g();
        if (!TextUtils.isEmpty(strM215088g)) {
            map.put("vaid", strM215088g);
        }
        String strM215089h = m215089h();
        if (!TextUtils.isEmpty(strM215089h)) {
            map.put("aaid", strM215089h);
        }
        map.put("oaid_type", String.valueOf(this.f198672b));
    }

    /* JADX INFO: renamed from: f */
    public String m215087f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public String m215088g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m215089h() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m215085d() {
    }

    @Override // p149l.tjq0
    /* JADX INFO: renamed from: a */
    public boolean mo97175a() {
        return this.f198671a.mo97175a();
    }
}
