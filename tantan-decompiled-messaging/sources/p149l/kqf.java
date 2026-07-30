package p149l;

import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class kqf {

    /* JADX INFO: renamed from: a */
    public Act f124255a;

    public kqf(Act act) {
        this.f124255a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m146932a() {
        if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.opened) {
            ygh0.m214651J(true);
        } else {
            ygh0.m214651J(false);
        }
        if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            ygh0.m214649H(true);
        } else {
            ygh0.m214649H(false);
        }
        if (PermissionHelper.m79881b("android.permission.READ_CONTACTS")) {
            ygh0.m214668a(true);
        } else {
            ygh0.m214668a(false);
        }
        if (PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE")) {
            ygh0.m214670b(true);
        } else {
            ygh0.m214670b(false);
        }
        ygh0.m214656O();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m146935d(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            xz6.m211889h().m211890i(false);
            if (Act.isFromBackground && CoreModule.m29931H().signedIn_()) {
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.jqf
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        return kqf.m146932a();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m146936e() {
        this.f124255a.creates(new e30() { // from class: l.gqf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103932a.m146937f((Bundle) obj);
            }
        });
        this.f124255a.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.hqf
            @Override // p149l.e30
            public final void call(Object obj) {
                kqf.m146935d((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m146937f(Bundle bundle) {
        if (CoreModule.m29931H().signedIn_() && NullChecker.m81304b(CoreModule.f17545c)) {
            C4732c c4732c = CoreModule.f17545c;
            if (!c4732c.f19603S) {
                c4732c.f19603S = true;
                c4732c.m31470B3();
            }
        }
        LayoutInflater.Factory factory = this.f124255a;
        if (!(factory instanceof tsi0) || ((tsi0) factory).mo36583F()) {
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.iqf
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.f154687E.m78869u(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                }
            }, 1000L);
        }
    }
}
