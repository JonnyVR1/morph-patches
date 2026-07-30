package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import l.e30;
import l.e51;
import l.j760;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.yij0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class efh0 extends jq2<lfh0> {

    /* JADX INFO: renamed from: a */
    public String f11126a;

    /* JADX INFO: renamed from: b */
    public RememberUserInfo f11127b;

    /* JADX INFO: renamed from: c */
    public RememberUserInfo f11128c;

    public efh0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m14508A0(Bundle bundle) {
        ((lfh0) ((jq2) this).viewModel).m18770m(this.f11127b, this.f11128c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ Boolean m14509C0(roj0 roj0Var) {
        boolean zG = ConnectivityReceiver.g();
        Boolean boolValueOf = Boolean.valueOf(zG);
        if (!zG) {
            ((lfh0) ((jq2) this).viewModel).m18769l(true);
            act().progressDismiss();
            lsi0.n(R.string.G0);
        }
        return boolValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m14510D0(roj0 roj0Var) {
        CoreModule.m1850H().mo61il("user.change_account");
        zvf0.D("e_signin_success", "", new j760[]{vwb.Y("signin_type", "switch_account")});
        act().progressDismiss();
        act().startActivity(CoreModule.m1851K().newMainActClearStack(act(), false, true));
        act().finish();
        yij0.S(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m14511E0(Throwable th) {
        ((lfh0) ((jq2) this).viewModel).m18769l(true);
        act().progressDismiss();
        CoreModule.m1850H().getAuthData().i();
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            lsi0.w(R.string.V3);
            qib0.f19788L.f1133b.i();
            qib0.f19788L.f1134c.i();
            act().startActivity(CoreModule.m1850H().mo63kg(act(), false));
            return;
        }
        lsi0.w(R.string.F0);
        if ((th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException)) {
            return;
        }
        CrashHelper.c(new Exception("switchAccount--> message:" + th.getMessage() + "--class:" + th.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m14512F0() {
        ((lfh0) ((jq2) this).viewModel).m18769l(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m14513G0(roj0 roj0Var) {
        act().progressDismiss();
        leh0.f16354d = true;
        act().startActivity(CoreModule.m1850H().mo53Mn(act()));
        e51.G(new Runnable() { // from class: l.bfh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8867a.m14512F0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m14514H0(Throwable th) {
        ((lfh0) ((jq2) this).viewModel).m18769l(true);
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ c m14517g0(AuthData authData, roj0 roj0Var) {
        CoreModule.m1850H().setAuthData(authData);
        return qib0.m22160f0();
    }

    /* JADX INFO: renamed from: r0 */
    private c<roj0> m14525r0() {
        return CoreModule.m1850H().signedIn_() ? qib0.m22147Y0(true, null, false, true, false).map(new w9j() { // from class: l.cfh0
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).doOnNext(new e30() { // from class: l.dfh0
            public final void call(Object obj) {
                this.f10383a.m14526z0((roj0) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m14526z0(roj0 roj0Var) {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            for (Act.r rVar : (ArrayList) it.next()) {
                if (NullChecker.b(rVar.a.get()) && rVar.a.get() != ((lfh0) ((jq2) this).viewModel).act() && (rVar.a.get() instanceof Act)) {
                    ((Act) rVar.a.get()).finishWithoutCustomAnimation();
                }
            }
        }
        ((lfh0) ((jq2) this).viewModel).m18772v(this.f11127b, this.f11128c);
    }

    /* JADX INFO: renamed from: I0 */
    public void m14527I0(final AuthData authData) {
        act().progress(R.string.W3, true);
        m14525r0().filter(new w9j() { // from class: l.ueh0
            public final Object call(Object obj) {
                return this.f23512a.m14509C0((roj0) obj);
            }
        }).delay(RemoteConfig.x().A("switch_account_delay_millis"), TimeUnit.MILLISECONDS).observeOn(jo0.a()).flatMap(new w9j() { // from class: l.veh0
            public final Object call(Object obj) {
                return efh0.m14517g0(authData, (roj0) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.weh0
            public final void call(Object obj) {
                this.f25123a.m14510D0((roj0) obj);
            }
        }, new e30() { // from class: l.xeh0
            public final void call(Object obj) {
                this.f27486a.m14511E0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    public void m14528J0() {
        m14525r0().subscribe(mkd0.H(new e30() { // from class: l.zeh0
            public final void call(Object obj) {
                this.f28731a.m14513G0((roj0) obj);
            }
        }, new e30() { // from class: l.afh0
            public final void call(Object obj) {
                this.f8246a.m14514H0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m14529a0() {
        creates(new e30() { // from class: l.yeh0
            public final void call(Object obj) {
                this.f28182a.m14508A0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m14530o0() {
        if (CoreModule.m1850H().signedIn_() && CoreModule.f1534c.f3616a0.m21766x3(this.f11127b)) {
            m14535u0();
        } else {
            m14527I0(this.f11127b.auth);
            zvf0.r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m14531p0() {
        if (this.f11128c == null) {
            zvf0.r("e_add_account", ((lfh0) ((jq2) this).viewModel).act().pageId());
            act().progress(R.string.X3);
            m14528J0();
        } else if (CoreModule.m1850H().signedIn_() && CoreModule.f1534c.f3616a0.m21766x3(this.f11128c)) {
            m14535u0();
        } else {
            m14527I0(this.f11128c.auth);
            zvf0.r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m14532q0(RememberUserInfo rememberUserInfo) {
        return CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo);
    }

    /* JADX INFO: renamed from: s0 */
    public RememberUserInfo m14533s0() {
        RememberUserInfo rememberUserInfo = (RememberUserInfo) qib0.f19788L.f1134c.b();
        if (NullChecker.a(rememberUserInfo)) {
            qib0.f19788L.f1133b.l(rememberUserInfo);
            this.f11127b = rememberUserInfo;
            this.f11128c = null;
            qib0.f19788L.f1134c.i();
        }
        return this.f11127b;
    }

    /* JADX INFO: renamed from: t0 */
    public void m14534t0() {
        this.f11128c = null;
        qib0.f19788L.f1134c.i();
    }

    /* JADX INFO: renamed from: u0 */
    public void m14535u0() {
        act().finish();
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m14536x0() {
        return qib0.f19788L.f1134c.b() == null;
    }

    /* JADX INFO: renamed from: y0 */
    public void m14537y0(String str) {
        this.f11126a = str;
        this.f11127b = (RememberUserInfo) qib0.f19788L.f1133b.b();
        this.f11128c = (RememberUserInfo) qib0.f19788L.f1134c.b();
        if (CoreModule.m1850H().signedIn_()) {
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            RememberUserInfo rememberUserInfo = this.f11127b;
            if (rememberUserInfo == null) {
                RememberUserInfo rememberUserInfo2 = new RememberUserInfo();
                this.f11127b = rememberUserInfo2;
                rememberUserInfo2.auth = (AuthData) CoreModule.m1850H().getAuthData().b();
                this.f11127b.imgUrl = ((Media) userM21490p9.fp()).url;
                RememberUserInfo rememberUserInfo3 = this.f11127b;
                rememberUserInfo3.name = userM21490p9.name;
                qib0.f19788L.f1133b.l(rememberUserInfo3);
                qib0.f19788L.f1134c.i();
                return;
            }
            if (CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo)) {
                if (!CoreModule.m1850H().accessToken().equals(this.f11127b.auth.accessToken)) {
                    this.f11127b.auth.accessToken = CoreModule.m1850H().accessToken();
                }
                if (!this.f11127b.imgUrl.equals(((Media) userM21490p9.fp()).url)) {
                    this.f11127b.imgUrl = ((Media) userM21490p9.fp()).url;
                }
                if (!this.f11127b.name.equals(userM21490p9.name)) {
                    this.f11127b.name = userM21490p9.name;
                }
                qib0.f19788L.f1133b.l(this.f11127b);
                return;
            }
            if (CoreModule.f1534c.f3616a0.m21766x3(this.f11128c)) {
                if (!CoreModule.m1850H().accessToken().equals(this.f11128c.auth.accessToken)) {
                    this.f11128c.auth.accessToken = CoreModule.m1850H().accessToken();
                }
                if (!this.f11128c.imgUrl.equals(((Media) userM21490p9.fp()).url)) {
                    this.f11128c.imgUrl = ((Media) userM21490p9.fp()).url;
                }
                if (!this.f11128c.name.equals(userM21490p9.name)) {
                    this.f11128c.name = userM21490p9.name;
                }
                qib0.f19788L.f1134c.l(this.f11128c);
            }
        }
    }

    public void destroy() {
    }
}
