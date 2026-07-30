package com.p046p1.mobile.putong.account.api;

import android.app.Activity;
import android.content.Context;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.p050ui.welcome.SplashAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p133rx.C22306c;
import p149l.C17581io;
import p149l.C18367m2;
import p149l.C20611vc;
import p149l.InterfaceC17361ho;
import p149l.eje;
import p149l.nnc0;
import p149l.onc0;
import p149l.tpx;
import p149l.vrx;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "putong-common 使用的 account 服务", path = "/account_common_service/service")
public class AccountCommonServiceImpl implements AccountCommonService {

    /* JADX INFO: renamed from: a */
    public C18367m2 f16317a = new C20611vc();

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: D5 */
    public boolean mo28141D5() {
        return eje.m116824h().m116831i();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: G2 */
    public tpx mo28142G2() {
        return new nnc0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: G9 */
    public boolean mo28143G9() {
        return TEnum.equals(AccountModule.f16037c.m28325c1().gender, "male");
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: Vs */
    public Class mo28144Vs() {
        return SplashAct.class;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: a */
    public InterfaceC17361ho mo28145a() {
        return C17581io.m137253d();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public C22306c<AuthData> accessOutterToken() {
        return AccountModule.f16037c.m28279F0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void clientNeedsForceUpdate() {
        AccountModule.f16037c.m28291J0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public Class<? extends Activity> getSignOutJumpAct() {
        return WelcomeAct.class;
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public SignUpData getSignUpData() {
        return AccountModule.f16037c.m28325c1();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void sendThirdPartLoginResult(int i, String str) {
        AccountModule.f16039e.m28183k(i, str);
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    public void signOut() {
        AccountModule.f16037c.m28351p2();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: t2 */
    public vrx mo28146t2() {
        return new onc0();
    }

    @Override // com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService
    /* JADX INFO: renamed from: x9 */
    public boolean mo28147x9() {
        return false;
    }
}
