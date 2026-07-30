package com.p051p1.mobile.putong.notifications;

import android.os.Build;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import p153l.c050;
import p153l.vxd0;

/* JADX INFO: loaded from: classes10.dex */
public class NotificationCheckerCommon {

    /* JADX INFO: renamed from: a */
    public static final vxd0 f55067a = new vxd0("notification_switch_state", State.uninitialized.ordinal());

    public enum State {
        uninitialized,
        opened,
        closed,
        unknown
    }

    /* JADX INFO: renamed from: a */
    public static State m80403a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return PermissionHelper.m81064b("android.permission.POST_NOTIFICATIONS") ? State.opened : State.closed;
        }
        State state = State.uninitialized;
        try {
            return c050.m107319e(App.f16088e).m107322a() ? State.opened : State.closed;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return state;
        } catch (NoSuchMethodError e2) {
            CrashHelper.m82479c(e2);
            return state;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m80404b() {
        int iOrdinal = m80403a().ordinal();
        vxd0 vxd0Var = f55067a;
        if (vxd0Var.get().intValue() != iOrdinal) {
            vxd0Var.put(Integer.valueOf(iOrdinal));
        }
    }
}
