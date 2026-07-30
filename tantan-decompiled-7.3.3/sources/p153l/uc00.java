package p153l;

import android.app.Application;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class uc00 {

    /* JADX INFO: renamed from: a */
    public static final String f178394a = App.f16088e.getFilesDir().getAbsolutePath() + "/mkHome/backup";

    /* JADX INFO: renamed from: b */
    public static final String f178395b = App.f16088e.getFilesDir().getAbsolutePath() + "/mkHome/offline";

    /* JADX INFO: renamed from: a */
    public static void m195349a(Application application) {
        gfi0.m130062g(application);
        m195350b();
    }

    /* JADX INFO: renamed from: b */
    public static void m195350b() {
        try {
            if (NullChecker.m82486a(uqb0.f180397c0) && uqb0.f180397c0.signedIn_()) {
                FepManager.m17582z().m17585f(FepConfigFetchType.LAUNCH);
            }
        } catch (Throwable unused) {
        }
    }
}
