package p153l;

import android.app.Application;
import com.momo.xengine.mestatistics.MEStatistics;
import com.p046mm.mediasdk.bean.RecorderInitConfig;
import com.p046mm.mediasdk.utils.NetUtil;

/* JADX INFO: loaded from: classes6.dex */
public class be00 {

    /* JADX INFO: renamed from: a */
    public static volatile RecorderInitConfig f76323a;

    /* JADX INFO: renamed from: a */
    public static l0m m103674a() {
        yqc0.m217083g(1);
        return new du10();
    }

    /* JADX INFO: renamed from: b */
    public static fam m103675b() {
        yqc0.m217083g(2);
        return new lfl0();
    }

    /* JADX INFO: renamed from: c */
    public static void m103676c(Application application, RecorderInitConfig recorderInitConfig) {
        m103677d(application, recorderInitConfig, false);
    }

    /* JADX INFO: renamed from: d */
    public static void m103677d(Application application, RecorderInitConfig recorderInitConfig, boolean z) {
        f76323a = recorderInitConfig;
        m103678e();
        u1j0.m193972d(application);
        kv0.m151650d(application);
        xsd0.m212965a(recorderInitConfig.m20607a());
        if (byx.m107100a()) {
            lrw.m155653j().m155657c();
        }
        MEStatistics mEStatistics = MEStatistics.getInstance();
        mEStatistics.setRecorderSDKVersion(n4g0.m161564a("3.0.3_030502"));
        mEStatistics.setUID(f76323a.m20608b());
        mEStatistics.init(application);
        lrw lrwVarM155653j = lrw.m155653j();
        if (lrwVarM155653j.m155655a()) {
            lrwVarM155653j.m155665m(application);
            recorderInitConfig.m20611e();
        }
        NetUtil.m20630d(application);
    }

    /* JADX INFO: renamed from: e */
    private static void m103678e() {
    }
}
