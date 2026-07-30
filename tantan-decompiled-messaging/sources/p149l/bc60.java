package p149l;

import android.os.Build;
import com.alibaba.android.patronus.Patrons;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class bc60 {
    /* JADX INFO: renamed from: a */
    public static void m101046a() {
        int iInit;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 31 || dt3.m113531a(App.f15369e) || !RemoteConfig.m79298x().m79330s("patrons_control")) {
            return;
        }
        try {
            Patrons.PatronsConfig patronsConfig = new Patrons.PatronsConfig();
            patronsConfig.lowerLimit = 612;
            iInit = Patrons.init(App.f15369e, patronsConfig);
        } catch (Throwable th) {
            CrashHelper.m81297d(th, 10);
            iInit = -1;
        }
        du2.m113670a("[Patrons]", "code:" + iInit);
    }
}
