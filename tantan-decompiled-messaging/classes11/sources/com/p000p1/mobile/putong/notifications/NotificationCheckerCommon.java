package com.p000p1.mobile.putong.notifications;

import android.os.Build;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import l.nr40;
import l.tpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NotificationCheckerCommon {

    /* JADX INFO: renamed from: a */
    public static final tpd0 f7825a = new tpd0("notification_switch_state", State.uninitialized.ordinal());

    public enum State {
        uninitialized,
        opened,
        closed,
        unknown
    }

    /* JADX INFO: renamed from: a */
    public static State m9539a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return PermissionHelper.m10210b("android.permission.POST_NOTIFICATIONS") ? State.opened : State.closed;
        }
        State state = State.uninitialized;
        try {
            return nr40.e(App.e).a() ? State.opened : State.closed;
        } catch (Exception e) {
            CrashHelper.c(e);
            return state;
        } catch (NoSuchMethodError e2) {
            CrashHelper.c(e2);
            return state;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9540b() {
        int iOrdinal = m9539a().ordinal();
        tpd0 tpd0Var = f7825a;
        if (((Integer) tpd0Var.get()).intValue() != iOrdinal) {
            tpd0Var.put(Integer.valueOf(iOrdinal));
        }
    }
}
