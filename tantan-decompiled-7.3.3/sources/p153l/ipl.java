package p153l;

import android.app.Application;
import android.content.pm.PackageManager;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public interface ipl<T extends BLiveAbsData, R extends BLiveAbsRoom> {
    /* JADX INFO: renamed from: k */
    static String m141531k() {
        Application application = zrv.f205803e;
        if (application == null) {
            return "";
        }
        try {
            return String.valueOf(application.getPackageManager().getPackageInfo(zrv.f205803e.getPackageName(), 0).lastUpdateTime);
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    void mo122885a();

    String getLiveId();

    String getRoomId();

    /* JADX INFO: renamed from: j */
    R mo122891j();

    /* JADX INFO: renamed from: l */
    T mo122892l();

    /* JADX INFO: renamed from: m */
    default boolean m141532m(C22507a c22507a) {
        return c22507a.m222761e() != null;
    }

    /* JADX INFO: renamed from: n */
    void mo122893n(BLiveAbsData bLiveAbsData);

    /* JADX INFO: renamed from: o */
    void mo122894o(BLiveAbsRoom bLiveAbsRoom);
}
