package p149l;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes13.dex */
public class vx00 {

    /* JADX INFO: renamed from: a */
    public static boolean f183411a;

    /* JADX INFO: renamed from: l.vx00$a */
    public static class C20755a {
        /* JADX INFO: renamed from: a */
        public static void m200477a(String str, String str2) {
            if (str2 == null || str2.length() == 0) {
                return;
            }
            if (str2.length() <= 3072) {
                Log.e(str, str2);
                return;
            }
            while (str2.length() > 3072) {
                String strSubstring = str2.substring(0, 3072);
                int iLastIndexOf = strSubstring.lastIndexOf(SignParameters.NEW_LINE);
                if (iLastIndexOf != -1) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf);
                }
                if (iLastIndexOf == 0) {
                    Log.e(str, str2);
                    break;
                } else {
                    str2 = str2.replace(strSubstring, "");
                    Log.e(str, "接上一段Log：".concat(strSubstring));
                }
            }
            Log.e(str, "接上一段Log：".concat(str2));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m200471a(String str, Object... objArr) {
        if (f183411a) {
            m200473c(str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m200472b(String str, Object... objArr) {
        C20755a.m200477a("BeatlesReportInfo", m200473c(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static String m200473c(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return str == null ? "" : String.format(str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m200474d(String str, Object... objArr) {
        if (f183411a) {
            m200473c(str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m200475e(boolean z) {
        f183411a = z;
    }

    /* JADX INFO: renamed from: f */
    public static void m200476f(String str, Object... objArr) {
        if (f183411a) {
            m200473c(str, objArr);
        }
    }
}
