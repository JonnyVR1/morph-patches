package p149l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class uoq0 {

    /* JADX INFO: renamed from: a */
    private Context f177527a;

    /* JADX INFO: renamed from: b */
    private xol f177528b;

    /* JADX INFO: renamed from: c */
    private xol f177529c;

    public uoq0(Context context, xol xolVar, uoq0 uoq0Var) {
        this.f177527a = context;
        this.f177528b = xolVar;
        this.f177529c = uoq0Var == null ? null : uoq0Var.f177528b;
    }

    /* JADX INFO: renamed from: a */
    public static String m194558a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m194559c(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m194560b() {
        Map<String, Object> mapM194561d = m194561d();
        if (m194558a(mapM194561d, "aid") == null) {
            mapM194561d.put("aid", 4444);
        }
        return mapM194561d;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, Object> m194561d() {
        Map<String, Object> map;
        Throwable th;
        Map<String, Object> map2;
        try {
            xol xolVar = this.f177529c;
            map2 = xolVar != null ? xolVar.mo147295d() : new HashMap<>();
            try {
                map2.putAll(this.f177528b.mo147295d());
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
                    map2.put("err_info", xwq0.m211359b(th));
                } catch (Throwable unused) {
                }
            }
        }
        boolean zM194559c = m194559c(map2);
        Context context = this.f177527a;
        if (zM194559c) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.f177527a.getPackageName(), 128);
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
                map2.put("version_name", giq0.m126398m(this.f177527a));
                map2.put("version_code", Integer.valueOf(giq0.m126399n(this.f177527a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                String str = context.getPackageManager().getPackageInfo(this.f177527a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f177527a.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: e */
    public xol m194562e() {
        return this.f177528b;
    }

    /* JADX INFO: renamed from: f */
    public String m194563f() {
        try {
            return this.f177528b.mo147292a();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public String m194564g() {
        try {
            return String.valueOf(this.f177528b.mo147295d().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* JADX INFO: renamed from: h */
    public long m194565h() {
        try {
            return this.f177528b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public uoq0(Context context, xol xolVar) {
        this(context, xolVar, null);
    }
}
