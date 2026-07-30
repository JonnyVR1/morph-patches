package p153l;

import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class rrf {

    /* JADX INFO: renamed from: a */
    public Act f164570a;

    public rrf(Act act) {
        this.f164570a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m182765a() {
        if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.opened) {
            fph0.m126639J(true);
        } else {
            fph0.m126639J(false);
        }
        if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            fph0.m126637H(true);
        } else {
            fph0.m126637H(false);
        }
        if (PermissionHelper.m81064b("android.permission.READ_CONTACTS")) {
            fph0.m126656a(true);
        } else {
            fph0.m126656a(false);
        }
        if (PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE")) {
            fph0.m126658b(true);
        } else {
            fph0.m126658b(false);
        }
        fph0.m126644O();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m182768d(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            a17.m95457h().m95458i(false);
            if (Act.isFromBackground && CoreModule.m30929H().signedIn_()) {
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.qrf
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        return rrf.m182765a();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m182769e() {
        this.f164570a.creates(new y20() { // from class: l.nrf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143400a.m182770f((Bundle) obj);
            }
        });
        this.f164570a.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.orf
            @Override // p153l.y20
            public final void call(Object obj) {
                rrf.m182768d((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m182770f(Bundle bundle) {
        if (CoreModule.m30929H().signedIn_() && NullChecker.m82487b(CoreModule.f18264c)) {
            C4883c c4883c = CoreModule.f18264c;
            if (!c4883c.f20345S) {
                c4883c.f20345S = true;
                c4883c.m32473B3();
            }
        }
        LayoutInflater.Factory factory = this.f164570a;
        if (!(factory instanceof w1j0) || ((w1j0) factory).mo37586G()) {
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.prf
                @Override // java.lang.Runnable
                public final void run() {
                    uqb0.f180370E.m80052u(AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
                }
            }, 1000L);
        }
    }
}
