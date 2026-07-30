package com.p000p1.mobile.putong.account.data;

import com.p1.mobile.account_phone.data.CaptchaAction;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailVerifyCaptchaData extends EmailRequestData {
    public CaptchaAction action;

    public void checkNull() {
        super.checkNull();
        if (this.action != null) {
            return;
        }
        ig3.a("parameter should not empty! ");
    }
}
