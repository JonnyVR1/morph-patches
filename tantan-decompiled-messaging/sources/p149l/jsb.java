package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.beatles.monitor.CrashInfo;
import com.tantanapp.beatles.monitor.StackInfo;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class jsb {
    /* JADX INFO: renamed from: a */
    public static CrashInfo m143008a(String str, boolean z, boolean z2) {
        StackTraceElement[] stackTraceElementArr;
        CrashInfo crashInfo = new CrashInfo();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Set<Thread> setKeySet = allStackTraces.keySet();
        ArrayList arrayList = new ArrayList();
        crashInfo.setStackInfos(arrayList);
        for (Thread thread : setKeySet) {
            if ((z && thread.getName().equals(BLiveTraceServerLocation.main)) || (!z && thread.getName().contains(str))) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : allStackTraces.get(thread)) {
                    sb.append("    at ");
                    sb.append(stackTraceElement.toString());
                    sb.append(SignParameters.NEW_LINE);
                }
                crashInfo.setCrashThread(thread);
                crashInfo.setCrashStackTrace(sb.toString());
                StackInfo stackInfo = new StackInfo();
                stackInfo.setThreadId(thread.getId());
                stackInfo.setThreadName(thread.getName());
                stackInfo.setStackTrace(sb.toString());
                arrayList.add(0, stackInfo);
            } else if (z2 && (stackTraceElementArr = allStackTraces.get(thread)) != null && stackTraceElementArr.length > 0) {
                StackInfo stackInfo2 = new StackInfo();
                stackInfo2.setThreadId(thread.getId());
                stackInfo2.setThreadName(thread.getName());
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement2 : stackTraceElementArr) {
                    sb2.append(" at ");
                    sb2.append(stackTraceElement2.toString());
                    sb2.append(SignParameters.NEW_LINE);
                }
                stackInfo2.setStackTrace(sb2.toString());
                arrayList.add(stackInfo2);
            }
        }
        return crashInfo;
    }

    /* JADX INFO: renamed from: b */
    public static String m143009b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
