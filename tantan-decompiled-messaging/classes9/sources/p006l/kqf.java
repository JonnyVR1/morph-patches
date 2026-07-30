package p006l;

import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.mkd0;
import l.tsi0;
import l.ygh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kqf {

    /* JADX INFO: renamed from: a */
    public Act f15964a;

    public kqf(Act act) {
        this.f15964a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m18252a() {
        if (NotificationCheckerCommon.a() == NotificationCheckerCommon.State.opened) {
            ygh0.J(true);
        } else {
            ygh0.J(false);
        }
        if (PermissionHelper.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
            ygh0.H(true);
        } else {
            ygh0.H(false);
        }
        if (PermissionHelper.b(new String[]{"android.permission.READ_CONTACTS"})) {
            ygh0.a(true);
        } else {
            ygh0.a(false);
        }
        if (PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE"})) {
            ygh0.b(true);
        } else {
            ygh0.b(false);
        }
        ygh0.O();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m18255d(c cVar) {
        if (cVar == c.i) {
            xz6.m27689h().m27690i(false);
            if (Act.isFromBackground && CoreModule.m1850H().signedIn_()) {
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.jqf
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        return kqf.m18252a();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18256e() {
        this.f15964a.creates(new e30() { // from class: l.gqf
            public final void call(Object obj) {
                this.f13442a.m18257f((Bundle) obj);
            }
        });
        this.f15964a.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.hqf
            public final void call(Object obj) {
                kqf.m18255d((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m18257f(Bundle bundle) {
        if (CoreModule.m1850H().signedIn_() && NullChecker.b(CoreModule.f1534c)) {
            C0158c c0158c = CoreModule.f1534c;
            if (!c0158c.f3592S) {
                c0158c.f3592S = true;
                c0158c.m3400B3();
            }
        }
        tsi0 tsi0Var = this.f15964a;
        if (!(tsi0Var instanceof tsi0) || tsi0Var.F()) {
            e51.H(CoreModule.f1533b, new Runnable() { // from class: l.iqf
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.f19778E.u(600000L);
                }
            }, 1000L);
        }
    }
}
