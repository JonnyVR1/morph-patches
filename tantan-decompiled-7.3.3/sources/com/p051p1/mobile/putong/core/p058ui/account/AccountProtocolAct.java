package com.p051p1.mobile.putong.core.p058ui.account;

import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.C19214ou;
import p153l.C20674uu;
import p153l.ar2;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public class AccountProtocolAct extends PutongMvpAct {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public ar2 mo29671X1() {
        return new C19214ou(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1 */
    public iam mo29672Y1() {
        return new C20674uu(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_delete_account_interact_block";
    }
}
