package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class anq0 {

    /* JADX INFO: renamed from: a */
    private static String f70758a = null;

    /* JADX INFO: renamed from: b */
    private static long f70759b = -1;

    /* JADX INFO: renamed from: c */
    private static boolean f70760c = false;

    /* JADX INFO: renamed from: d */
    private static ActivityManager.ProcessErrorStateInfo f70761d;

    /* JADX INFO: renamed from: a */
    public static String m97803a(ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        if (!hrq0.m132713v()) {
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
    public static String m97804b(Context context, int i) {
        if (owq0.m166427c(256)) {
            f70760c = false;
            return "TEST_ANR_INFO";
        }
        if (SystemClock.uptimeMillis() - f70759b < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM126387b = giq0.m126387b(context, i);
            if (processErrorStateInfoM126387b != null && Process.myPid() == processErrorStateInfoM126387b.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f70761d;
                if (processErrorStateInfo != null && m97807e(processErrorStateInfo, processErrorStateInfoM126387b)) {
                    return null;
                }
                f70761d = processErrorStateInfoM126387b;
                f70758a = null;
                f70759b = SystemClock.uptimeMillis();
                f70760c = false;
                return m97803a(processErrorStateInfoM126387b);
            }
        } catch (Throwable unused) {
        }
        String str = f70758a;
        if (str == null) {
            return null;
        }
        f70760c = true;
        f70758a = null;
        f70759b = SystemClock.uptimeMillis();
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m97805c(boolean z) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", xwq0.m211362e(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m97806d() {
        return f70760c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m97807e(ActivityManager.ProcessErrorStateInfo processErrorStateInfo, ActivityManager.ProcessErrorStateInfo processErrorStateInfo2) {
        return String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfo2.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfo2.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfo2.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfo2.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfo2.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfo2.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfo2.longMsg));
    }
}
