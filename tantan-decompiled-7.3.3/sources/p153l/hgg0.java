package p153l;

import android.app.Application;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public abstract class hgg0 {
    /* JADX INFO: renamed from: a */
    public static boolean m134937a(Application application) {
        return application.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }
}
