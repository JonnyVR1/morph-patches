package p153l;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class snw {

    /* JADX INFO: renamed from: a */
    private static String f169773a = "MMThreadFactory";

    /* JADX INFO: renamed from: a */
    public static Thread m187004a(String str, Runnable runnable) {
        MDLog.m7450i(f169773a, "MMThreadFactory -> newThread : %s", str);
        return new Thread(runnable, str);
    }
}
