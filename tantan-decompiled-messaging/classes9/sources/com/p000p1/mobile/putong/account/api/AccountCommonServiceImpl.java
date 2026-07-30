package com.p000p1.mobile.putong.account.api;

import android.app.Activity;
import android.content.Context;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.p002ui.welcome.SplashAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.android.injecter.facade.annotation.Route;
import l.tpx;
import l.vrx;
import p006l.C0848io;
import p006l.C1000m2;
import p006l.C1373vc;
import p006l.InterfaceC0810ho;
import p006l.eje;
import p006l.nnc0;
import p006l.onc0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "putong-common 使用的 account 服务", path = "/account_common_service/service")
public class AccountCommonServiceImpl implements AccountCommonService {

    /* JADX INFO: renamed from: a */
    public C1000m2 f306a = new C1373vc();

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: D5 */
    public boolean mo36D5() {
        return eje.m14574h().m14581i();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: G2 */
    public tpx mo37G2() {
        return new nnc0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: G9 */
    public boolean mo38G9() {
        return TEnum.equals(AccountModule.f26c.m220c1().gender, "male");
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: Vs */
    public Class mo39Vs() {
        return SplashAct.class;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: a */
    public InterfaceC0810ho mo40a() {
        return C0848io.m16749d();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public c<AuthData> accessOutterToken() {
        return AccountModule.f26c.m174F0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void clientNeedsForceUpdate() {
        AccountModule.f26c.m186J0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public Class<? extends Activity> getSignOutJumpAct() {
        return WelcomeAct.class;
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public SignUpData getSignUpData() {
        return AccountModule.f26c.m220c1();
    }

    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void sendThirdPartLoginResult(int i, String str) {
        AccountModule.f28e.m78k(i, str);
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void signOut() {
        AccountModule.f26c.m246p2();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: t2 */
    public vrx mo41t2() {
        return new onc0();
    }

    @Override // com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: x9 */
    public boolean mo42x9() {
        return false;
    }
}
