package com.p046p1.mobile.putong.account;

import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaPickerAct;
import com.p046p1.mobile.putong.app.PutongAct;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBaseAct extends PutongAct {
    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mediaPickerHandler = new AccountMediaPickerAct.C4672a().mo29191a(this);
    }
}
