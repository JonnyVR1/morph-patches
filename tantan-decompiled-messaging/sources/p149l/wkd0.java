package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class wkd0 {
    /* JADX INFO: renamed from: a */
    public static String m203656a() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            str = "unknow manufacturer";
        }
        return m203663h(str) ? m203660e(str) : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m203657b() {
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return m203663h(str) ? m203660e(str) : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m203658c(Context context) throws Throwable {
        ActivityManager.RunningAppProcessInfo next;
        FileInputStream fileInputStream;
        int i;
        int iMyPid = Process.myPid();
        if (context != null && iMyPid > 0) {
            FileInputStream fileInputStream2 = null;
            try {
                Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.pid != iMyPid);
            } catch (Exception unused) {
            }
            if (next != null) {
                return next.processName;
            }
            byte[] bArr = new byte[128];
            try {
                try {
                    fileInputStream = new FileInputStream("/proc/" + iMyPid + "/cmdline");
                    try {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 > 0) {
                            for (0; i < i2; i + 1) {
                                byte b = bArr[i];
                                i = (b <= 128 && b > 0) ? i + 1 : 0;
                                i2 = i;
                                break;
                            }
                            String str = new String(bArr, 0, i2);
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                            return str;
                        }
                    } catch (Exception unused3) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream = fileInputStream2;
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused5) {
                } catch (Throwable th2) {
                    th = th2;
                }
                fileInputStream.close();
            } catch (Exception unused6) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static String m203659d(Context context) throws Throwable {
        String strM203658c = m203658c(context);
        if (TextUtils.equals(strM203658c, context.getPackageName())) {
            return BLiveTraceServerLocation.main;
        }
        return (strM203658c == null || !strM203658c.contains(":") || strM203658c.indexOf(":") <= 0) ? "" : strM203658c.substring(strM203658c.indexOf(":") + 1);
    }

    /* JADX INFO: renamed from: e */
    private static String m203660e(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m203661f(String str, int i, String str2, int i2) {
        StringBuffer stringBuffer = new StringBuffer("CosmosVideo/");
        stringBuffer.append(str);
        stringBuffer.append("/");
        stringBuffer.append(str2);
        stringBuffer.append(" Android/");
        stringBuffer.append(i);
        stringBuffer.append("/");
        stringBuffer.append(i2);
        stringBuffer.append(" (");
        stringBuffer.append(m203657b() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Android " + Build.VERSION.RELEASE + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Gapps " + (m203662g() ? 1 : 0) + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + Constants.PACKNAME_END);
        stringBuffer.append(" 1; ");
        stringBuffer.append(m203656a());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m203662g() {
        try {
            Class.forName("com.google.android.maps.MapActivity");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m203663h(String str) {
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
