package com.p046p1.mobile.putong.notifications;

import android.os.Build;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import p149l.nr40;
import p149l.tpd0;

/* JADX INFO: loaded from: classes11.dex */
public class NotificationCheckerCommon {

    /* JADX INFO: renamed from: a */
    public static final tpd0 f54219a = new tpd0("notification_switch_state", State.uninitialized.ordinal());

    public enum State {
        uninitialized,
        opened,
        closed,
        unknown
    }

    /* JADX INFO: renamed from: a */
    public static State m79220a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return PermissionHelper.m79881b("android.permission.POST_NOTIFICATIONS") ? State.opened : State.closed;
        }
        State state = State.uninitialized;
        try {
            return nr40.m160709e(App.f15369e).m160712a() ? State.opened : State.closed;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return state;
        } catch (NoSuchMethodError e2) {
            CrashHelper.m81296c(e2);
            return state;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m79221b() {
        int iOrdinal = m79220a().ordinal();
        tpd0 tpd0Var = f54219a;
        if (tpd0Var.get().intValue() != iOrdinal) {
            tpd0Var.put(Integer.valueOf(iOrdinal));
        }
    }
}
