package com.p046p1.mobile.putong.core.p053ui.account;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.jq2;
import p149l.na60;
import p149l.qa60;
import p149l.s7m;

/* JADX INFO: loaded from: classes8.dex */
public class PasswordVerificationAct extends PutongMvpAct {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new na60(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new qa60(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_modify_phone_number_password_verification_view";
    }
}
