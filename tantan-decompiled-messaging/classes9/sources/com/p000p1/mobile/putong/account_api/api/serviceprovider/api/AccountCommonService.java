package com.p000p1.mobile.putong.account_api.api.serviceprovider.api;

import android.app.Activity;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.SignUpData;
import com.tantanapp.android.injecter.facade.template.IProvider;
import l.tpx;
import l.vrx;
import p006l.InterfaceC0810ho;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface AccountCommonService extends IProvider {
    /* JADX INFO: renamed from: D5 */
    boolean mo36D5();

    /* JADX INFO: renamed from: G2 */
    tpx mo37G2();

    /* JADX INFO: renamed from: G9 */
    boolean mo38G9();

    /* JADX INFO: renamed from: Vs */
    Class mo39Vs();

    /* JADX INFO: renamed from: a */
    InterfaceC0810ho mo40a();

    c<AuthData> accessOutterToken();

    void clientNeedsForceUpdate();

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    void sendThirdPartLoginResult(int i, String str);

    void signOut();

    /* JADX INFO: renamed from: t2 */
    vrx mo41t2();

    /* JADX INFO: renamed from: x9 */
    boolean mo42x9();
}
