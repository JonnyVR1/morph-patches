package com.p046p1.mobile.putong.core.p053ui.account;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.C19589qv;
import p149l.C20966wv;
import p149l.jq2;
import p149l.s7m;

/* JADX INFO: loaded from: classes8.dex */
public class AccountRecommendAct extends PutongMvpAct {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new C19589qv(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new C20966wv(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_delete_account_chat_block";
    }
}
