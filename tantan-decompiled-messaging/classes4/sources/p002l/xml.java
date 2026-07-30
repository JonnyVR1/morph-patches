package p002l;

import android.app.Application;
import android.content.pm.PackageManager;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.tantanapp.common.utils.CrashHelper;
import l.ypv;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface xml<T extends BLiveAbsData, R extends BLiveAbsRoom> {
    /* JADX INFO: renamed from: k */
    static String m26032k() {
        Application application = ypv.e;
        if (application == null) {
            return "";
        }
        try {
            return String.valueOf(application.getPackageManager().getPackageInfo(ypv.e.getPackageName(), 0).lastUpdateTime);
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.c(e);
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    void mo19684a();

    String getLiveId();

    String getRoomId();

    /* JADX INFO: renamed from: j */
    R mo19689j();

    /* JADX INFO: renamed from: l */
    T mo19690l();

    /* JADX INFO: renamed from: m */
    default boolean m26033m(a aVar) {
        return aVar.e() != null;
    }

    /* JADX INFO: renamed from: n */
    void mo19691n(BLiveAbsData bLiveAbsData);

    /* JADX INFO: renamed from: o */
    void mo19692o(BLiveAbsRoom bLiveAbsRoom);
}
