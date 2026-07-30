package p153l;

import android.os.SystemClock;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class hl20 {
    /* JADX INFO: renamed from: a */
    public static void m135654a(x1d0 x1d0Var, Throwable th) {
        NetworkTrackInfo networkTrackInfo;
        if (x1d0Var == null || (networkTrackInfo = (NetworkTrackInfo) x1d0Var.m209025j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setThrowable(th);
    }

    /* JADX INFO: renamed from: b */
    public static x1d0 m135655b(x1d0 x1d0Var, NetworkTrackInfo.ReportType reportType) {
        NetworkTrackInfo networkTrackInfo = new NetworkTrackInfo();
        networkTrackInfo.setCreateTime(SystemClock.elapsedRealtime());
        networkTrackInfo.setRequestTimestamp(System.currentTimeMillis());
        networkTrackInfo.setReportType(reportType);
        networkTrackInfo.setRequest(x1d0Var);
        return x1d0Var.m209023h().m209041o(NetworkTrackInfo.class, networkTrackInfo).m209028b();
    }

    /* JADX INFO: renamed from: c */
    public static void m135656c(x1d0 x1d0Var, v4m<NetworkTrackInfo> v4mVar) {
        NetworkTrackInfo networkTrackInfo;
        if (x1d0Var == null || (networkTrackInfo = (NetworkTrackInfo) x1d0Var.m209025j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setFinishTime(SystemClock.elapsedRealtime());
        v4mVar.mo119562a(networkTrackInfo);
    }

    /* JADX INFO: renamed from: d */
    public static void m135657d(x1d0 x1d0Var) {
        NetworkTrackInfo networkTrackInfo;
        if (x1d0Var == null || (networkTrackInfo = (NetworkTrackInfo) x1d0Var.m209025j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setCancel(true);
    }
}
