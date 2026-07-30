package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class tmh0 extends ar2<anh0> {

    /* JADX INFO: renamed from: d */
    public static boolean f174930d = false;

    /* JADX INFO: renamed from: a */
    public String f174931a;

    /* JADX INFO: renamed from: b */
    public RememberUserInfo f174932b;

    /* JADX INFO: renamed from: c */
    public RememberUserInfo f174933c;

    public tmh0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m191735C0(Bundle bundle) {
        ((anh0) this.viewModel).m98975m(this.f174932b, this.f174933c);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m191736J0(boolean z) {
        f174930d = z;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ C22421c m191743k0(AuthData authData, uxj0 uxj0Var) {
        CoreModule.m30929H().setAuthData(authData);
        return uqb0.m197270f0();
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m191747z0() {
        return f174930d;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m191748A0(uxj0 uxj0Var) {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            for (Act.C4450r c4450r : it.next()) {
                if (NullChecker.m82487b(c4450r.f16062a.get()) && c4450r.f16062a.get() != ((anh0) this.viewModel).act() && (c4450r.f16062a.get() instanceof Act)) {
                    ((Act) c4450r.f16062a.get()).finishWithoutCustomAnimation();
                }
            }
        }
        ((anh0) this.viewModel).m98980v(this.f174932b, this.f174933c);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ Boolean m191749D0(uxj0 uxj0Var) {
        boolean zM82467g = ConnectivityReceiver.m82467g();
        Boolean boolValueOf = Boolean.valueOf(zM82467g);
        if (!zM82467g) {
            ((anh0) this.viewModel).m98974l(true);
            act().progressDismiss();
            o1j0.m165640n(R$string.f28564G0);
        }
        return boolValueOf;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m191750E0(uxj0 uxj0Var) {
        CoreModule.m30929H().mo29165il("user.change_account");
        i4g0.m138495D("e_signin_success", "", jyb.m147494Y("signin_type", "switch_account"));
        act().progressDismiss();
        act().startActivity(CoreModule.m30930K().newMainActClearStack(act(), false, true));
        act().lambda$debugItems$19();
        bsj0.m106261S(act());
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m191751F0(Throwable th) {
        ((anh0) this.viewModel).m98974l(true);
        act().progressDismiss();
        CoreModule.m30929H().getAuthData().m123194i();
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            o1j0.m165649w(R$string.f28642V3);
            uqb0.f180380L.f17863b.m123194i();
            uqb0.f180380L.f17864c.m123194i();
            act().startActivity(CoreModule.m30929H().mo29167kg(act(), false));
            return;
        }
        o1j0.m165649w(R$string.f28559F0);
        if ((th instanceof UnknownHostException) || (th instanceof SSLException) || (th instanceof SocketTimeoutException) || (th instanceof SocketException)) {
            return;
        }
        CrashHelper.m82479c(new Exception("switchAccount--> message:" + th.getMessage() + "--class:" + th.getClass()));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m191752G0() {
        ((anh0) this.viewModel).m98974l(true);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m191753H0(uxj0 uxj0Var) {
        act().progressDismiss();
        f174930d = true;
        act().startActivity(CoreModule.m30929H().mo29157Mn(act()));
        l51.m152887G(new Runnable() { // from class: l.qmh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158346a.m191752G0();
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m191754I0(Throwable th) {
        ((anh0) this.viewModel).m98974l(true);
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: L0 */
    public void m191755L0(final AuthData authData) {
        act().progress(R$string.f28647W3, true);
        m191760r0().filter(new qcj() { // from class: l.jmh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f121672a.m191749D0((uxj0) obj);
            }
        }).delay(RemoteConfig.m80481x().m80482A("switch_account_delay_millis"), TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).flatMap(new qcj() { // from class: l.kmh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tmh0.m191743k0(authData, (uxj0) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.lmh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132695a.m191750E0((uxj0) obj);
            }
        }, new y20() { // from class: l.mmh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137570a.m191751F0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public void m191756N0() {
        m191760r0().subscribe(psd0.m173597H(new y20() { // from class: l.nmh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142708a.m191753H0((uxj0) obj);
            }
        }, new y20() { // from class: l.omh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147944a.m191754I0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.pmh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153185a.m191735C0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m191757o0() {
        if (CoreModule.m30929H().signedIn_() && CoreModule.f18264c.f20369a0.m188270x3(this.f174932b)) {
            m191763u0();
        } else {
            m191755L0(this.f174932b.auth);
            i4g0.m138520r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m191758p0() {
        if (this.f174933c == null) {
            i4g0.m138520r("e_add_account", ((anh0) this.viewModel).act().pageId());
            act().progress(R$string.f28652X3);
            m191756N0();
        } else if (CoreModule.m30929H().signedIn_() && CoreModule.f18264c.f20369a0.m188270x3(this.f174933c)) {
            m191763u0();
        } else {
            m191755L0(this.f174933c.auth);
            i4g0.m138520r("e_switch_account_avatar", "p_switch_account_view");
        }
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m191759q0(RememberUserInfo rememberUserInfo) {
        return CoreModule.f18264c.f20369a0.m188270x3(rememberUserInfo);
    }

    /* JADX INFO: renamed from: r0 */
    public final C22421c<uxj0> m191760r0() {
        return CoreModule.m30929H().signedIn_() ? uqb0.m197257Y0(true, null, false, true, false).map(new qcj() { // from class: l.rmh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).doOnNext(new y20() { // from class: l.smh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169582a.m191748A0((uxj0) obj);
            }
        }) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: s0 */
    public RememberUserInfo m191761s0() {
        RememberUserInfo rememberUserInfoMo107143b = uqb0.f180380L.f17864c.mo107143b();
        if (NullChecker.m82486a(rememberUserInfoMo107143b)) {
            uqb0.f180380L.f17863b.m123197l(rememberUserInfoMo107143b);
            this.f174932b = rememberUserInfoMo107143b;
            this.f174933c = null;
            uqb0.f180380L.f17864c.m123194i();
        }
        return this.f174932b;
    }

    /* JADX INFO: renamed from: t0 */
    public void m191762t0() {
        this.f174933c = null;
        uqb0.f180380L.f17864c.m123194i();
    }

    /* JADX INFO: renamed from: u0 */
    public void m191763u0() {
        act().lambda$debugItems$19();
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m191764x0() {
        return uqb0.f180380L.f17864c.mo107143b() == null;
    }

    /* JADX INFO: renamed from: y0 */
    public void m191765y0(String str) {
        this.f174931a = str;
        this.f174932b = uqb0.f180380L.f17863b.mo107143b();
        this.f174933c = uqb0.f180380L.f17864c.mo107143b();
        if (CoreModule.m30929H().signedIn_()) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            RememberUserInfo rememberUserInfo = this.f174932b;
            if (rememberUserInfo == null) {
                RememberUserInfo rememberUserInfo2 = new RememberUserInfo();
                this.f174932b = rememberUserInfo2;
                rememberUserInfo2.auth = CoreModule.m30929H().getAuthData().mo107143b();
                this.f174932b.imgUrl = userM116600p9.m61308fp().url;
                RememberUserInfo rememberUserInfo3 = this.f174932b;
                rememberUserInfo3.name = userM116600p9.name;
                uqb0.f180380L.f17863b.m123197l(rememberUserInfo3);
                uqb0.f180380L.f17864c.m123194i();
                return;
            }
            if (CoreModule.f18264c.f20369a0.m188270x3(rememberUserInfo)) {
                if (!CoreModule.m30929H().accessToken().equals(this.f174932b.auth.accessToken)) {
                    this.f174932b.auth.accessToken = CoreModule.m30929H().accessToken();
                }
                if (!this.f174932b.imgUrl.equals(userM116600p9.m61308fp().url)) {
                    this.f174932b.imgUrl = userM116600p9.m61308fp().url;
                }
                if (!this.f174932b.name.equals(userM116600p9.name)) {
                    this.f174932b.name = userM116600p9.name;
                }
                uqb0.f180380L.f17863b.m123197l(this.f174932b);
                return;
            }
            if (CoreModule.f18264c.f20369a0.m188270x3(this.f174933c)) {
                if (!CoreModule.m30929H().accessToken().equals(this.f174933c.auth.accessToken)) {
                    this.f174933c.auth.accessToken = CoreModule.m30929H().accessToken();
                }
                if (!this.f174933c.imgUrl.equals(userM116600p9.m61308fp().url)) {
                    this.f174933c.imgUrl = userM116600p9.m61308fp().url;
                }
                if (!this.f174933c.name.equals(userM116600p9.name)) {
                    this.f174933c.name = userM116600p9.name;
                }
                uqb0.f180380L.f17864c.m123197l(this.f174933c);
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
