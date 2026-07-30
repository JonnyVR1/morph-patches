package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class efh0 extends jq2<lfh0> {

    /* JADX INFO: renamed from: a */
    public String f90831a;

    /* JADX INFO: renamed from: b */
    public RememberUserInfo f90832b;

    /* JADX INFO: renamed from: c */
    public RememberUserInfo f90833c;

    public efh0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m116041A0(Bundle bundle) {
        ((lfh0) this.viewModel).m149695m(this.f90832b, this.f90833c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ Boolean m116042C0(roj0 roj0Var) {
        boolean zM81284g = ConnectivityReceiver.m81284g();
        Boolean boolValueOf = Boolean.valueOf(zM81284g);
        if (!zM81284g) {
            ((lfh0) this.viewModel).m149694l(true);
            act().progressDismiss();
            lsi0.m151584n(R$string.f27716G0);
        }
        return boolValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m116043D0(roj0 roj0Var) {
        CoreModule.m29931H().mo28166il("user.change_account");
        zvf0.m220371D("e_signin_success", "", vwb.m200311Y("signin_type", "switch_account"));
        act().progressDismiss();
        act().startActivity(CoreModule.m29932K().newMainActClearStack(act(), false, true));
        act().lambda$debugItems$19();
        yij0.m214941S(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m116044E0(Throwable th) {
        ((lfh0) this.viewModel).m149694l(true);
        act().progressDismiss();
        CoreModule.m29931H().getAuthData().m108250i();
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            lsi0.m151593w(R$string.f27794V3);
            qib0.f154697L.f17144b.m108250i();
            qib0.f154697L.f17145c.m108250i();
            act().startActivity(CoreModule.m29931H().mo28168kg(act(), false));
            return;
        }
        lsi0.m151593w(R$string.f27711F0);
        if ((th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException)) {
            return;
        }
        CrashHelper.m81296c(new Exception("switchAccount--> message:" + th.getMessage() + "--class:" + th.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ void m116045F0() {
        ((lfh0) this.viewModel).m149694l(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m116046G0(roj0 roj0Var) {
        act().progressDismiss();
        leh0.f127684d = true;
        act().startActivity(CoreModule.m29931H().mo28158Mn(act()));
        e51.m114742G(new Runnable() { // from class: l.bfh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75319a.m116045F0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m116047H0(Throwable th) {
        ((lfh0) this.viewModel).m149694l(true);
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ C22306c m116050g0(AuthData authData, roj0 roj0Var) {
        CoreModule.m29931H().setAuthData(authData);
        return qib0.m174816f0();
    }

    /* JADX INFO: renamed from: r0 */
    private C22306c<roj0> m116058r0() {
        return CoreModule.m29931H().signedIn_() ? qib0.m174803Y0(true, null, false, true, false).map(new w9j() { // from class: l.cfh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).doOnNext(new e30() { // from class: l.dfh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85947a.m116059z0((roj0) obj);
            }
        }) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m116059z0(roj0 roj0Var) {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            for (Act.C4299r c4299r : it.next()) {
                if (NullChecker.m81304b(c4299r.f15343a.get()) && c4299r.f15343a.get() != ((lfh0) this.viewModel).act() && (c4299r.f15343a.get() instanceof Act)) {
                    ((Act) c4299r.f15343a.get()).finishWithoutCustomAnimation();
                }
            }
        }
        ((lfh0) this.viewModel).m149697v(this.f90832b, this.f90833c);
    }

    /* JADX INFO: renamed from: I0 */
    public void m116060I0(final AuthData authData) {
        act().progress(R$string.f27799W3, true);
        m116058r0().filter(new w9j() { // from class: l.ueh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176043a.m116042C0((roj0) obj);
            }
        }).delay(RemoteConfig.m79298x().m79299A("switch_account_delay_millis"), TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).flatMap(new w9j() { // from class: l.veh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return efh0.m116050g0(authData, (roj0) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.weh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185941a.m116043D0((roj0) obj);
            }
        }, new e30() { // from class: l.xeh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192599a.m116044E0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    public void m116061J0() {
        m116058r0().subscribe(mkd0.m154956H(new e30() { // from class: l.zeh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202828a.m116046G0((roj0) obj);
            }
        }, new e30() { // from class: l.afh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69173a.m116047H0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.yeh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197690a.m116041A0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m116062o0() {
        if (CoreModule.m29931H().signedIn_() && CoreModule.f17545c.f19627a0.m171574x3(this.f90832b)) {
            m116067u0();
        } else {
            m116060I0(this.f90832b.auth);
            zvf0.m220396r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m116063p0() {
        if (this.f90833c == null) {
            zvf0.m220396r("e_add_account", ((lfh0) this.viewModel).act().pageId());
            act().progress(R$string.f27804X3);
            m116061J0();
        } else if (CoreModule.m29931H().signedIn_() && CoreModule.f17545c.f19627a0.m171574x3(this.f90833c)) {
            m116067u0();
        } else {
            m116060I0(this.f90833c.auth);
            zvf0.m220396r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m116064q0(RememberUserInfo rememberUserInfo) {
        return CoreModule.f17545c.f19627a0.m171574x3(rememberUserInfo);
    }

    /* JADX INFO: renamed from: s0 */
    public RememberUserInfo m116065s0() {
        RememberUserInfo rememberUserInfoMo108248b = qib0.f154697L.f17145c.mo108248b();
        if (NullChecker.m81303a(rememberUserInfoMo108248b)) {
            qib0.f154697L.f17144b.m108253l(rememberUserInfoMo108248b);
            this.f90832b = rememberUserInfoMo108248b;
            this.f90833c = null;
            qib0.f154697L.f17145c.m108250i();
        }
        return this.f90832b;
    }

    /* JADX INFO: renamed from: t0 */
    public void m116066t0() {
        this.f90833c = null;
        qib0.f154697L.f17145c.m108250i();
    }

    /* JADX INFO: renamed from: u0 */
    public void m116067u0() {
        act().lambda$debugItems$19();
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m116068x0() {
        return qib0.f154697L.f17145c.mo108248b() == null;
    }

    /* JADX INFO: renamed from: y0 */
    public void m116069y0(String str) {
        this.f90831a = str;
        this.f90832b = qib0.f154697L.f17144b.mo108248b();
        this.f90833c = qib0.f154697L.f17145c.mo108248b();
        if (CoreModule.m29931H().signedIn_()) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            RememberUserInfo rememberUserInfo = this.f90832b;
            if (rememberUserInfo == null) {
                RememberUserInfo rememberUserInfo2 = new RememberUserInfo();
                this.f90832b = rememberUserInfo2;
                rememberUserInfo2.auth = CoreModule.m29931H().getAuthData().mo108248b();
                this.f90832b.imgUrl = userM169527p9.m60124fp().url;
                RememberUserInfo rememberUserInfo3 = this.f90832b;
                rememberUserInfo3.name = userM169527p9.name;
                qib0.f154697L.f17144b.m108253l(rememberUserInfo3);
                qib0.f154697L.f17145c.m108250i();
                return;
            }
            if (CoreModule.f17545c.f19627a0.m171574x3(rememberUserInfo)) {
                if (!CoreModule.m29931H().accessToken().equals(this.f90832b.auth.accessToken)) {
                    this.f90832b.auth.accessToken = CoreModule.m29931H().accessToken();
                }
                if (!this.f90832b.imgUrl.equals(userM169527p9.m60124fp().url)) {
                    this.f90832b.imgUrl = userM169527p9.m60124fp().url;
                }
                if (!this.f90832b.name.equals(userM169527p9.name)) {
                    this.f90832b.name = userM169527p9.name;
                }
                qib0.f154697L.f17144b.m108253l(this.f90832b);
                return;
            }
            if (CoreModule.f17545c.f19627a0.m171574x3(this.f90833c)) {
                if (!CoreModule.m29931H().accessToken().equals(this.f90833c.auth.accessToken)) {
                    this.f90833c.auth.accessToken = CoreModule.m29931H().accessToken();
                }
                if (!this.f90833c.imgUrl.equals(userM169527p9.m60124fp().url)) {
                    this.f90833c.imgUrl = userM169527p9.m60124fp().url;
                }
                if (!this.f90833c.name.equals(userM169527p9.name)) {
                    this.f90833c.name = userM169527p9.name;
                }
                qib0.f154697L.f17145c.m108253l(this.f90833c);
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
