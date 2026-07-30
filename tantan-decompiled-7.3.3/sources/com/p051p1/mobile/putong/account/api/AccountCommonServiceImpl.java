package com.p051p1.mobile.putong.account.api;

import android.app.Activity;
import android.content.Context;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.p055ui.welcome.SplashAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p137rx.C22421c;
import p153l.C16322co;
import p153l.C18526m2;
import p153l.C19546qc;
import p153l.InterfaceC16069bo;
import p153l.ike;
import p153l.qyx;
import p153l.s0y;
import p153l.svc0;
import p153l.tvc0;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "putong-common 使用的 account 服务", path = "/account_common_service/service")
public class AccountCommonServiceImpl implements AccountCommonService {

    /* JADX INFO: renamed from: a */
    public C18526m2 f17036a = new C19546qc();

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: D5 */
    public boolean mo29140D5() {
        return ike.m140276h().m140283i();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: G2 */
    public qyx mo29141G2() {
        return new svc0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: G9 */
    public boolean mo29142G9() {
        return TEnum.equals(AccountModule.f16756c.m29324c1().gender, "male");
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: Vs */
    public Class mo29143Vs() {
        return SplashAct.class;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: a */
    public InterfaceC16069bo mo29144a() {
        return C16322co.m111559d();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public C22421c<AuthData> accessOutterToken() {
        return AccountModule.f16756c.m29278F0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void clientNeedsForceUpdate() {
        AccountModule.f16756c.m29290J0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public Class<? extends Activity> getSignOutJumpAct() {
        return WelcomeAct.class;
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public SignUpData getSignUpData() {
        return AccountModule.f16756c.m29324c1();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void sendThirdPartLoginResult(int i, String str) {
        AccountModule.f16758e.m29182k(i, str);
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void signOut() {
        AccountModule.f16756c.m29350p2();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: t2 */
    public s0y mo29145t2() {
        return new tvc0();
    }

    @Override // com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: x9 */
    public boolean mo29146x9() {
        return false;
    }
}
