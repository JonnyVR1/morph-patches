package p149l;

import android.app.Application;
import android.content.pm.PackageManager;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public interface xml<T extends BLiveAbsData, R extends BLiveAbsRoom> {
    /* JADX INFO: renamed from: k */
    static String m210143k() {
        Application application = ypv.f199497e;
        if (application == null) {
            return "";
        }
        try {
            return String.valueOf(application.getPackageManager().getPackageInfo(ypv.f199497e.getPackageName(), 0).lastUpdateTime);
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    void mo165464a();

    String getLiveId();

    String getRoomId();

    /* JADX INFO: renamed from: j */
    R mo165469j();

    /* JADX INFO: renamed from: l */
    T mo165470l();

    /* JADX INFO: renamed from: m */
    default boolean m210144m(C22392a c22392a) {
        return c22392a.m221515e() != null;
    }

    /* JADX INFO: renamed from: n */
    void mo165471n(BLiveAbsData bLiveAbsData);

    /* JADX INFO: renamed from: o */
    void mo165472o(BLiveAbsRoom bLiveAbsRoom);
}
