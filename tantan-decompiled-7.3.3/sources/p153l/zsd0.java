package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class zsd0 {
    /* JADX INFO: renamed from: a */
    public static String m221334a() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            str = "unknow manufacturer";
        }
        return m221341h(str) ? m221338e(str) : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m221335b() {
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return m221341h(str) ? m221338e(str) : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m221336c(Context context) throws Throwable {
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
    public static String m221337d(Context context) throws Throwable {
        String strM221336c = m221336c(context);
        if (TextUtils.equals(strM221336c, context.getPackageName())) {
            return BLiveTraceServerLocation.main;
        }
        return (strM221336c == null || !strM221336c.contains(":") || strM221336c.indexOf(":") <= 0) ? "" : strM221336c.substring(strM221336c.indexOf(":") + 1);
    }

    /* JADX INFO: renamed from: e */
    private static String m221338e(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m221339f(String str, int i, String str2, int i2) {
        StringBuffer stringBuffer = new StringBuffer("CosmosVideo/");
        stringBuffer.append(str);
        stringBuffer.append("/");
        stringBuffer.append(str2);
        stringBuffer.append(" Android/");
        stringBuffer.append(i);
        stringBuffer.append("/");
        stringBuffer.append(i2);
        stringBuffer.append(" (");
        stringBuffer.append(m221335b() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Android " + Build.VERSION.RELEASE + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Gapps " + (m221340g() ? 1 : 0) + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + Constants.PACKNAME_END);
        stringBuffer.append(" 1; ");
        stringBuffer.append(m221334a());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m221340g() {
        try {
            Class.forName("com.google.android.maps.MapActivity");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m221341h(String str) {
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
