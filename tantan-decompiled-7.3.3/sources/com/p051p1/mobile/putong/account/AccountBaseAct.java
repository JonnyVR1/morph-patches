package com.p051p1.mobile.putong.account;

import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaPickerAct;
import com.p051p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBaseAct extends PutongAct {
    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mediaPickerHandler = new AccountMediaPickerAct.C4823a().mo30189a(this);
    }
}
