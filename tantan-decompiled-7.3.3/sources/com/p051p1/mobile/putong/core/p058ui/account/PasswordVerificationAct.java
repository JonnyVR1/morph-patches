package com.p051p1.mobile.putong.core.p058ui.account;

import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.ar2;
import p153l.iam;
import p153l.si60;
import p153l.vi60;

/* JADX INFO: loaded from: classes9.dex */
public class PasswordVerificationAct extends PutongMvpAct {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public ar2 mo29671X1() {
        return new si60(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1 */
    public iam mo29672Y1() {
        return new vi60(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_modify_phone_number_password_verification_view";
    }
}
