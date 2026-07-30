package p153l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class gwq0 {

    /* JADX INFO: renamed from: a */
    private static String f106860a = null;

    /* JADX INFO: renamed from: b */
    private static long f106861b = -1;

    /* JADX INFO: renamed from: c */
    private static boolean f106862c = false;

    /* JADX INFO: renamed from: d */
    private static ActivityManager.ProcessErrorStateInfo f106863d;

    /* JADX INFO: renamed from: a */
    public static String m132688a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        if (!n0r0.m161035v()) {
            return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
        }
        StringBuilder sb = new StringBuilder("|------------- processErrorStateInfo--------------|\n");
        sb.append("condition: " + processErrorStateInfo.condition + SignParameters.NEW_LINE);
        sb.append("processName: " + processErrorStateInfo.processName + SignParameters.NEW_LINE);
        sb.append("pid: " + processErrorStateInfo.pid + SignParameters.NEW_LINE);
        sb.append("uid: " + processErrorStateInfo.uid + SignParameters.NEW_LINE);
        sb.append("tag: " + processErrorStateInfo.tag + SignParameters.NEW_LINE);
        sb.append("shortMsg : " + processErrorStateInfo.shortMsg + SignParameters.NEW_LINE);
        sb.append("longMsg : " + processErrorStateInfo.longMsg + SignParameters.NEW_LINE);
        sb.append("-----------------------end----------------------------");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m132689b(Context context, int i) {
        if (u5r0.m194619c(256)) {
            f106862c = false;
            return "TEST_ANR_INFO";
        }
        if (SystemClock.uptimeMillis() - f106861b < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM155638b = lrq0.m155638b(context, i);
            if (processErrorStateInfoM155638b != null && Process.myPid() == processErrorStateInfoM155638b.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f106863d;
                if (processErrorStateInfo != null && m132692e(processErrorStateInfo, processErrorStateInfoM155638b)) {
                    return null;
                }
                f106863d = processErrorStateInfoM155638b;
                f106860a = null;
                f106861b = SystemClock.uptimeMillis();
                f106862c = false;
                return m132688a(processErrorStateInfoM155638b);
            }
        } catch (Throwable unused) {
        }
        String str = f106860a;
        if (str == null) {
            return null;
        }
        f106862c = true;
        f106860a = null;
        f106861b = SystemClock.uptimeMillis();
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m132690c(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", d6r0.m114510e(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m132691d() {
        return f106862c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m132692e(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        return String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg));
    }
}
