package p153l;

import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;

/* JADX INFO: loaded from: classes11.dex */
public class f610 {

    /* JADX INFO: renamed from: a */
    public static boolean f97371a;

    /* JADX INFO: renamed from: l.f610$a */
    public static class C16910a {
        /* JADX INFO: renamed from: a */
        public static void m124269a(String str, String str2) {
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
    public static void m124263a(String str, Object... objArr) {
        if (f97371a) {
            m124265c(str, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m124264b(String str, Object... objArr) {
        C16910a.m124269a("BeatlesReportInfo", m124265c(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static String m124265c(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return str == null ? "" : String.format(str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m124266d(String str, Object... objArr) {
        if (f97371a) {
            m124265c(str, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m124267e(boolean z) {
        f97371a = z;
    }

    /* JADX INFO: renamed from: f */
    public static void m124268f(String str, Object... objArr) {
        if (f97371a) {
            m124265c(str, objArr);
        }
    }
}
