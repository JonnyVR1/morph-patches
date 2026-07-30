package p149l;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class tkw {

    /* JADX INFO: renamed from: a */
    private static String f170923a = "MMThreadFactory";

    /* JADX INFO: renamed from: a */
    public static Thread m189539a(String str, Runnable runnable) {
        MDLog.m7396i(f170923a, "MMThreadFactory -> newThread : %s", str);
        return new Thread(runnable, str);
    }
}
