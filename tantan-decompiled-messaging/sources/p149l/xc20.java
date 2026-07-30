package p149l;

import android.os.SystemClock;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class xc20 {
    /* JADX INFO: renamed from: a */
    public static void m208060a(stc0 stc0Var, Throwable th) {
        NetworkTrackInfo networkTrackInfo;
        if (stc0Var == null || (networkTrackInfo = (NetworkTrackInfo) stc0Var.m185880j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setThrowable(th);
    }

    /* JADX INFO: renamed from: b */
    public static stc0 m208061b(stc0 stc0Var, NetworkTrackInfo.ReportType reportType) {
        NetworkTrackInfo networkTrackInfo = new NetworkTrackInfo();
        networkTrackInfo.setCreateTime(SystemClock.elapsedRealtime());
        networkTrackInfo.setRequestTimestamp(System.currentTimeMillis());
        networkTrackInfo.setReportType(reportType);
        networkTrackInfo.setRequest(stc0Var);
        return stc0Var.m185878h().m185896o(NetworkTrackInfo.class, networkTrackInfo).m185883b();
    }

    /* JADX INFO: renamed from: c */
    public static void m208062c(stc0 stc0Var, c2m<NetworkTrackInfo> c2mVar) {
        NetworkTrackInfo networkTrackInfo;
        if (stc0Var == null || (networkTrackInfo = (NetworkTrackInfo) stc0Var.m185880j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setFinishTime(SystemClock.elapsedRealtime());
        c2mVar.mo95854a(networkTrackInfo);
    }

    /* JADX INFO: renamed from: d */
    public static void m208063d(stc0 stc0Var) {
        NetworkTrackInfo networkTrackInfo;
        if (stc0Var == null || (networkTrackInfo = (NetworkTrackInfo) stc0Var.m185880j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setCancel(true);
    }
}
