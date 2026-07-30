package com.p046p1.mobile.putong.account_api.api.serviceprovider.api;

import android.app.Activity;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.SignUpData;
import com.tantanapp.android.injecter.facade.template.IProvider;
import p133rx.C22306c;
import p149l.InterfaceC17361ho;
import p149l.tpx;
import p149l.vrx;

/* JADX INFO: loaded from: classes9.dex */
public interface AccountCommonService extends IProvider {
    /* JADX INFO: renamed from: D5 */
    boolean mo28141D5();

    /* JADX INFO: renamed from: G2 */
    tpx mo28142G2();

    /* JADX INFO: renamed from: G9 */
    boolean mo28143G9();

    /* JADX INFO: renamed from: Vs */
    Class mo28144Vs();

    /* JADX INFO: renamed from: a */
    InterfaceC17361ho mo28145a();

    C22306c<AuthData> accessOutterToken();

    void clientNeedsForceUpdate();

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    void sendThirdPartLoginResult(int i, String str);

    void signOut();

    /* JADX INFO: renamed from: t2 */
    vrx mo28146t2();

    /* JADX INFO: renamed from: x9 */
    boolean mo28147x9();
}
