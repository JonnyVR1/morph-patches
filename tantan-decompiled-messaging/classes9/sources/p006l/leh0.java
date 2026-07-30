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
public class leh0 extends jq2<seh0> {

    /* JADX INFO: renamed from: d */
    public static boolean f16354d = false;

    /* JADX INFO: renamed from: a */
    public String f16355a;

    /* JADX INFO: renamed from: b */
    public RememberUserInfo f16356b;

    /* JADX INFO: renamed from: c */
    public RememberUserInfo f16357c;

    public leh0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m18698C0(Bundle bundle) {
        ((seh0) ((jq2) this).viewModel).m23735m(this.f16356b, this.f16357c);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m18699J0(boolean z) {
        f16354d = z;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ c m18706k0(AuthData authData, roj0 roj0Var) {
        CoreModule.m1850H().setAuthData(authData);
        return qib0.m22160f0();
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m18710z0() {
        return f16354d;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m18711A0(roj0 roj0Var) {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            for (Act.r rVar : (ArrayList) it.next()) {
                if (NullChecker.b(rVar.a.get()) && rVar.a.get() != ((seh0) ((jq2) this).viewModel).act() && (rVar.a.get() instanceof Act)) {
                    ((Act) rVar.a.get()).finishWithoutCustomAnimation();
                }
            }
        }
        ((seh0) ((jq2) this).viewModel).m23740v(this.f16356b, this.f16357c);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ Boolean m18712D0(roj0 roj0Var) {
        boolean zG = ConnectivityReceiver.g();
        Boolean boolValueOf = Boolean.valueOf(zG);
        if (!zG) {
            ((seh0) ((jq2) this).viewModel).m23734l(true);
            act().progressDismiss();
            lsi0.n(R.string.G0);
        }
        return boolValueOf;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m18713E0(roj0 roj0Var) {
        CoreModule.m1850H().mo61il("user.change_account");
        zvf0.D("e_signin_success", "", new j760[]{vwb.Y("signin_type", "switch_account")});
        act().progressDismiss();
        act().startActivity(CoreModule.m1851K().newMainActClearStack(act(), false, true));
        act().finish();
        yij0.S(act());
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m18714F0(Throwable th) {
        ((seh0) ((jq2) this).viewModel).m23734l(true);
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

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m18715G0() {
        ((seh0) ((jq2) this).viewModel).m23734l(true);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m18716H0(roj0 roj0Var) {
        act().progressDismiss();
        f16354d = true;
        act().startActivity(CoreModule.m1850H().mo53Mn(act()));
        e51.G(new Runnable() { // from class: l.ieh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14412a.m18715G0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m18717I0(Throwable th) {
        ((seh0) ((jq2) this).viewModel).m23734l(true);
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: L0 */
    public void m18718L0(final AuthData authData) {
        act().progress(R.string.W3, true);
        m18724r0().filter(new w9j() { // from class: l.beh0
            public final Object call(Object obj) {
                return this.f8849a.m18712D0((roj0) obj);
            }
        }).delay(RemoteConfig.x().A("switch_account_delay_millis"), TimeUnit.MILLISECONDS).observeOn(jo0.a()).flatMap(new w9j() { // from class: l.ceh0
            public final Object call(Object obj) {
                return leh0.m18706k0(authData, (roj0) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.deh0
            public final void call(Object obj) {
                this.f10360a.m18713E0((roj0) obj);
            }
        }, new e30() { // from class: l.eeh0
            public final void call(Object obj) {
                this.f11106a.m18714F0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public void m18719N0() {
        m18724r0().subscribe(mkd0.H(new e30() { // from class: l.feh0
            public final void call(Object obj) {
                this.f12678a.m18716H0((roj0) obj);
            }
        }, new e30() { // from class: l.geh0
            public final void call(Object obj) {
                this.f13284a.m18717I0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m18720a0() {
        creates(new e30() { // from class: l.heh0
            public final void call(Object obj) {
                this.f13853a.m18698C0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m18721o0() {
        if (CoreModule.m1850H().signedIn_() && CoreModule.f1534c.f3616a0.m21766x3(this.f16356b)) {
            m18727u0();
        } else {
            m18718L0(this.f16356b.auth);
            zvf0.r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m18722p0() {
        if (this.f16357c == null) {
            zvf0.r("e_add_account", ((seh0) ((jq2) this).viewModel).act().pageId());
            act().progress(R.string.X3);
            m18719N0();
        } else if (CoreModule.m1850H().signedIn_() && CoreModule.f1534c.f3616a0.m21766x3(this.f16357c)) {
            m18727u0();
        } else {
            m18718L0(this.f16357c.auth);
            zvf0.r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m18723q0(RememberUserInfo rememberUserInfo) {
        return CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo);
    }

    /* JADX INFO: renamed from: r0 */
    public final c<roj0> m18724r0() {
        return CoreModule.m1850H().signedIn_() ? qib0.m22147Y0(true, null, false, true, false).map(new w9j() { // from class: l.jeh0
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).doOnNext(new e30() { // from class: l.keh0
            public final void call(Object obj) {
                this.f15790a.m18711A0((roj0) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: s0 */
    public RememberUserInfo m18725s0() {
        RememberUserInfo rememberUserInfo = (RememberUserInfo) qib0.f19788L.f1134c.b();
        if (NullChecker.a(rememberUserInfo)) {
            qib0.f19788L.f1133b.l(rememberUserInfo);
            this.f16356b = rememberUserInfo;
            this.f16357c = null;
            qib0.f19788L.f1134c.i();
        }
        return this.f16356b;
    }

    /* JADX INFO: renamed from: t0 */
    public void m18726t0() {
        this.f16357c = null;
        qib0.f19788L.f1134c.i();
    }

    /* JADX INFO: renamed from: u0 */
    public void m18727u0() {
        act().finish();
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m18728x0() {
        return qib0.f19788L.f1134c.b() == null;
    }

    /* JADX INFO: renamed from: y0 */
    public void m18729y0(String str) {
        this.f16355a = str;
        this.f16356b = (RememberUserInfo) qib0.f19788L.f1133b.b();
        this.f16357c = (RememberUserInfo) qib0.f19788L.f1134c.b();
        if (CoreModule.m1850H().signedIn_()) {
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            RememberUserInfo rememberUserInfo = this.f16356b;
            if (rememberUserInfo == null) {
                RememberUserInfo rememberUserInfo2 = new RememberUserInfo();
                this.f16356b = rememberUserInfo2;
                rememberUserInfo2.auth = (AuthData) CoreModule.m1850H().getAuthData().b();
                this.f16356b.imgUrl = ((Media) userM21490p9.fp()).url;
                RememberUserInfo rememberUserInfo3 = this.f16356b;
                rememberUserInfo3.name = userM21490p9.name;
                qib0.f19788L.f1133b.l(rememberUserInfo3);
                qib0.f19788L.f1134c.i();
                return;
            }
            if (CoreModule.f1534c.f3616a0.m21766x3(rememberUserInfo)) {
                if (!CoreModule.m1850H().accessToken().equals(this.f16356b.auth.accessToken)) {
                    this.f16356b.auth.accessToken = CoreModule.m1850H().accessToken();
                }
                if (!this.f16356b.imgUrl.equals(((Media) userM21490p9.fp()).url)) {
                    this.f16356b.imgUrl = ((Media) userM21490p9.fp()).url;
                }
                if (!this.f16356b.name.equals(userM21490p9.name)) {
                    this.f16356b.name = userM21490p9.name;
                }
                qib0.f19788L.f1133b.l(this.f16356b);
                return;
            }
            if (CoreModule.f1534c.f3616a0.m21766x3(this.f16357c)) {
                if (!CoreModule.m1850H().accessToken().equals(this.f16357c.auth.accessToken)) {
                    this.f16357c.auth.accessToken = CoreModule.m1850H().accessToken();
                }
                if (!this.f16357c.imgUrl.equals(((Media) userM21490p9.fp()).url)) {
                    this.f16357c.imgUrl = ((Media) userM21490p9.fp()).url;
                }
                if (!this.f16357c.name.equals(userM21490p9.name)) {
                    this.f16357c.name = userM21490p9.name;
                }
                qib0.f19788L.f1134c.l(this.f16357c);
            }
        }
    }

    public void destroy() {
    }
}
