package p149l;

import android.app.Application;
import com.momo.xengine.mestatistics.MEStatistics;
import com.p041mm.mediasdk.bean.RecorderInitConfig;
import com.p041mm.mediasdk.utils.NetUtil;

/* JADX INFO: loaded from: classes7.dex */
public class n500 {

    /* JADX INFO: renamed from: a */
    public static volatile RecorderInitConfig f137181a;

    /* JADX INFO: renamed from: a */
    public static sxl m157980a() {
        ric0.m179495g(1);
        return new tl10();
    }

    /* JADX INFO: renamed from: b */
    public static p7m m157981b() {
        ric0.m179495g(2);
        return new h6l0();
    }

    /* JADX INFO: renamed from: c */
    public static void m157982c(Application application, RecorderInitConfig recorderInitConfig) {
        m157983d(application, recorderInitConfig, false);
    }

    /* JADX INFO: renamed from: d */
    public static void m157983d(Application application, RecorderInitConfig recorderInitConfig, boolean z) {
        f137181a = recorderInitConfig;
        m157984e();
        rsi0.m180673d(application);
        dv0.m113760d(application);
        ukd0.m194150a(recorderInitConfig.m19608a());
        if (epx.m117686a()) {
            mow.m155709j().m155713c();
        }
        MEStatistics mEStatistics = MEStatistics.getInstance();
        mEStatistics.setRecorderSDKVersion(ewf0.m118469a("3.0.3_030502"));
        mEStatistics.setUID(f137181a.m19609b());
        mEStatistics.init(application);
        mow mowVarM155709j = mow.m155709j();
        if (mowVarM155709j.m155711a()) {
            mowVarM155709j.m155721m(application);
            recorderInitConfig.m19612e();
        }
        NetUtil.m19631d(application);
    }

    /* JADX INFO: renamed from: e */
    private static void m157984e() {
    }
}
