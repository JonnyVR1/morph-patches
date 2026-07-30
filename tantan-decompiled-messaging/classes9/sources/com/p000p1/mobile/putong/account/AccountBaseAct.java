package com.p000p1.mobile.putong.account;

import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaPickerAct;
import com.p000p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountBaseAct extends PutongAct {
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mediaPickerHandler = new AccountMediaPickerAct.C0098a().mo1097a(this);
    }
}
