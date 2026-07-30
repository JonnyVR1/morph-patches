package p153l;

import android.os.Build;
import com.alibaba.android.patronus.Patrons;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes10.dex */
public class gk60 {
    /* JADX INFO: renamed from: a */
    public static void m130568a() {
        int iInit;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 31 || cu3.m112649a(App.f16088e) || !RemoteConfig.m80481x().m80513s("patrons_control")) {
            return;
        }
        try {
            Patrons.PatronsConfig patronsConfig = new Patrons.PatronsConfig();
            patronsConfig.lowerLimit = 612;
            iInit = Patrons.init(App.f16088e, patronsConfig);
        } catch (Throwable th) {
            CrashHelper.m82480d(th, 10);
            iInit = -1;
        }
        tu2.m192703a("[Patrons]", "code:" + iInit);
    }
}
