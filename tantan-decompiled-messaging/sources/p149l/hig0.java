package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class hig0 {

    /* JADX INFO: renamed from: a */
    public static volatile String f107928a;

    /* JADX INFO: renamed from: a */
    public static String m131254a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("_");
        String str = Build.MODEL;
        sb.append(str != null ? str.trim().replaceAll("\\s*", "") : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m131255b(String str, String str2) {
        String str3;
        if (str2.equals("")) {
            str3 = str + UUID.randomUUID().toString().replace("-", "");
        } else {
            str3 = str + UUID.nameUUIDFromBytes(str2.getBytes()).toString().replace("-", "");
        }
        f107928a = str3;
        cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_device_id", f107928a, false);
        return f107928a;
    }

    /* JADX INFO: renamed from: c */
    public static String m131256c() {
        String strM131255b;
        if (f107928a == null) {
            synchronized (hig0.class) {
                if (f107928a == null) {
                    String string = cbg0.m105995a("TechSudMGPGlobal.sp").f80140a.getString("key_device_id", null);
                    if (string != null) {
                        f107928a = string;
                        return f107928a;
                    }
                    try {
                        if (TextUtils.isEmpty(null)) {
                            strM131255b = m131255b(Constants.VIA_SHARE_TYPE_MINI_PROGRAM, "");
                        } else {
                            String string2 = cbg0.m105995a("TechSudMGPGlobal.sp").f80140a.getString("key_device_id", null);
                            if (string2 == null) {
                                m131255b("2", null);
                                throw null;
                            }
                            f107928a = string2;
                            strM131255b = f107928a;
                        }
                    } catch (Exception unused) {
                    }
                    return strM131255b;
                }
            }
        }
        return f107928a;
    }

    /* JADX INFO: renamed from: d */
    public static String m131257d() {
        return Build.VERSION.SDK_INT + "";
    }
}
