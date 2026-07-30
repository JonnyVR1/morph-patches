package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class xkd0 {
    /* JADX INFO: renamed from: a */
    public static String m209768a() throws Exception {
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(ivc0.f115118g.getPackageManager().getPackageInfo(ivc0.f115118g.getPackageName(), 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
            if (upperCase.length() == 1) {
                sb.append("0");
            }
            sb.append(upperCase);
            sb.append(":");
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }

    /* JADX INFO: renamed from: b */
    public static String m209769b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            str = "unknow manufacturer";
        }
        return m209774g(str) ? m209771d(str) : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m209770c() {
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return m209774g(str) ? m209771d(str) : str;
    }

    /* JADX INFO: renamed from: d */
    private static String m209771d(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m209772e() {
        StringBuffer stringBuffer = new StringBuffer("CosmosVideo/");
        stringBuffer.append(ivc0.f115116e);
        stringBuffer.append(" Android/");
        stringBuffer.append(ivc0.f115117f);
        stringBuffer.append(" (");
        stringBuffer.append(m209770c() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Android " + Build.VERSION.RELEASE + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Gapps " + (m209773f() ? 1 : 0) + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + Constants.PACKNAME_END);
        stringBuffer.append(" 1; ");
        stringBuffer.append(m209769b());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m209773f() {
        try {
            Class.forName("com.google.android.maps.MapActivity");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m209774g(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (char c : str.toCharArray()) {
                if (c <= 31 || c >= 127) {
                    return true;
                }
            }
        }
        return false;
    }
}
