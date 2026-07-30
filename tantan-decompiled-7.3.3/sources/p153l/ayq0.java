package p153l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ayq0 {

    /* JADX INFO: renamed from: a */
    private Context f74003a;

    /* JADX INFO: renamed from: b */
    private irl f74004b;

    /* JADX INFO: renamed from: c */
    private irl f74005c;

    public ayq0(Context context, irl irlVar, ayq0 ayq0Var) {
        this.f74003a = context;
        this.f74004b = irlVar;
        this.f74005c = ayq0Var == null ? null : ayq0Var.f74004b;
    }

    /* JADX INFO: renamed from: a */
    public static String m100915a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m100916c(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m100917b() {
        Map<String, Object> mapM100918d = m100918d();
        if (m100915a(mapM100918d, "aid") == null) {
            mapM100918d.put("aid", 4444);
        }
        return mapM100918d;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, Object> m100918d() {
        Map<String, Object> map;
        Throwable th;
        Map<String, Object> map2;
        try {
            irl irlVar = this.f74005c;
            map2 = irlVar != null ? irlVar.mo141838d() : new HashMap<>();
            try {
                map2.putAll(this.f74004b.mo141838d());
                th = null;
            } catch (Throwable th2) {
                map = map2;
                th = th2;
                Map<String, Object> map3 = map;
                th = th;
                map2 = map3;
            }
        } catch (Throwable th3) {
            th = th3;
            map = null;
        }
        if (map2 == null) {
            map2 = new HashMap<>(4);
            if (th != null) {
                try {
                    map2.put("err_info", d6r0.m114507b(th));
                } catch (Throwable unused) {
                }
            }
        }
        boolean zM100916c = m100916c(map2);
        Context context = this.f74003a;
        if (zM100916c) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.f74003a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    Object obj = bundle != null ? bundle.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map2.put("version_name", lrq0.m155649m(this.f74003a));
                map2.put("version_code", Integer.valueOf(lrq0.m155650n(this.f74003a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                String str = context.getPackageManager().getPackageInfo(this.f74003a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f74003a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: e */
    public irl m100919e() {
        return this.f74004b;
    }

    /* JADX INFO: renamed from: f */
    public String m100920f() {
        try {
            return this.f74004b.mo141835a();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public String m100921g() {
        try {
            return String.valueOf(this.f74004b.mo141838d().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* JADX INFO: renamed from: h */
    public long m100922h() {
        try {
            return this.f74004b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public ayq0(Context context, irl irlVar) {
        this(context, irlVar, null);
    }
}
