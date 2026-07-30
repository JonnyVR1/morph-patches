package p009l;

import android.os.Build;
import com.alibaba.android.patronus.Patrons;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bc60 {
    /* JADX INFO: renamed from: a */
    public static void m11932a() {
        int iInit;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 31 || dt3.m13469a(App.e) || !RemoteConfig.m9619x().m9651s("patrons_control")) {
            return;
        }
        try {
            Patrons.PatronsConfig patronsConfig = new Patrons.PatronsConfig();
            patronsConfig.lowerLimit = 612;
            iInit = Patrons.init(App.e, patronsConfig);
        } catch (Throwable th) {
            CrashHelper.d(th, 10);
            iInit = -1;
        }
        du2.a("[Patrons]", "code:" + iInit);
    }
}
