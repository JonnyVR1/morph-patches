package p153l;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class pqg0 {

    /* JADX INFO: renamed from: a */
    public static volatile String f153673a;

    /* JADX INFO: renamed from: a */
    public static String m173348a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("_");
        String str = Build.MODEL;
        sb.append(str != null ? str.trim().replaceAll("\\s*", "") : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m173349b(String str, String str2) {
        String str3;
        if (str2.equals("")) {
            str3 = str + UUID.randomUUID().toString().replace("-", "");
        } else {
            str3 = str + UUID.nameUUIDFromBytes(str2.getBytes()).toString().replace("-", "");
        }
        f153673a = str3;
        kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_device_id", f153673a, false);
        return f153673a;
    }

    /* JADX INFO: renamed from: c */
    public static String m173350c() {
        String strM173349b;
        if (f153673a == null) {
            synchronized (pqg0.class) {
                if (f153673a == null) {
                    String string = kjg0.m150043a("TechSudMGPGlobal.sp").f127100a.getString("key_device_id", null);
                    if (string != null) {
                        f153673a = string;
                        return f153673a;
                    }
                    try {
                        if (TextUtils.isEmpty(null)) {
                            strM173349b = m173349b(Constants.VIA_SHARE_TYPE_MINI_PROGRAM, "");
                        } else {
                            String string2 = kjg0.m150043a("TechSudMGPGlobal.sp").f127100a.getString("key_device_id", null);
                            if (string2 == null) {
                                m173349b("2", null);
                                throw null;
                            }
                            f153673a = string2;
                            strM173349b = f153673a;
                        }
                    } catch (Exception unused) {
                    }
                    return strM173349b;
                }
            }
        }
        return f153673a;
    }

    /* JADX INFO: renamed from: d */
    public static String m173351d() {
        return Build.VERSION.SDK_INT + "";
    }
}
