package com.p051p1.mobile.putong.account_api.api.serviceprovider.api;

import android.app.Activity;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.SignUpData;
import com.tantanapp.android.injecter.facade.template.IProvider;
import p137rx.C22421c;
import p153l.InterfaceC16069bo;
import p153l.qyx;
import p153l.s0y;

/* JADX INFO: loaded from: classes9.dex */
public interface AccountCommonService extends IProvider {
    /* JADX INFO: renamed from: D5 */
    boolean mo29140D5();

    /* JADX INFO: renamed from: G2 */
    qyx mo29141G2();

    /* JADX INFO: renamed from: G9 */
    boolean mo29142G9();

    /* JADX INFO: renamed from: Vs */
    Class mo29143Vs();

    /* JADX INFO: renamed from: a */
    InterfaceC16069bo mo29144a();

    C22421c<AuthData> accessOutterToken();

    void clientNeedsForceUpdate();

    Class<? extends Activity> getSignOutJumpAct();

    SignUpData getSignUpData();

    void sendThirdPartLoginResult(int i, String str);

    void signOut();

    /* JADX INFO: renamed from: t2 */
    s0y mo29145t2();

    /* JADX INFO: renamed from: x9 */
    boolean mo29146x9();
}
