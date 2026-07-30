package p006l;

import android.os.SystemClock;
import com.tantanapp.common.network.NetworkTrackInfo;
import l.stc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xc20 {
    /* JADX INFO: renamed from: a */
    public static void m27193a(stc0 stc0Var, Throwable th) {
        NetworkTrackInfo networkTrackInfo;
        if (stc0Var == null || (networkTrackInfo = (NetworkTrackInfo) stc0Var.j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setThrowable(th);
    }

    /* JADX INFO: renamed from: b */
    public static stc0 m27194b(stc0 stc0Var, NetworkTrackInfo.ReportType reportType) {
        NetworkTrackInfo networkTrackInfo = new NetworkTrackInfo();
        networkTrackInfo.setCreateTime(SystemClock.elapsedRealtime());
        networkTrackInfo.setRequestTimestamp(System.currentTimeMillis());
        networkTrackInfo.setReportType(reportType);
        networkTrackInfo.setRequest(stc0Var);
        return stc0Var.h().o(NetworkTrackInfo.class, networkTrackInfo).b();
    }

    /* JADX INFO: renamed from: c */
    public static void m27195c(stc0 stc0Var, c2m<NetworkTrackInfo> c2mVar) {
        NetworkTrackInfo networkTrackInfo;
        if (stc0Var == null || (networkTrackInfo = (NetworkTrackInfo) stc0Var.j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setFinishTime(SystemClock.elapsedRealtime());
        c2mVar.mo11810a(networkTrackInfo);
    }

    /* JADX INFO: renamed from: d */
    public static void m27196d(stc0 stc0Var) {
        NetworkTrackInfo networkTrackInfo;
        if (stc0Var == null || (networkTrackInfo = (NetworkTrackInfo) stc0Var.j(NetworkTrackInfo.class)) == null) {
            return;
        }
        networkTrackInfo.setCancel(true);
    }
}
