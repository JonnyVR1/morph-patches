package com.p046p1.mobile.putong.core.p053ui.account;

import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.C21473yq;
import p149l.C21755zq;
import p149l.jq2;
import p149l.s7m;
import p149l.ura;

/* JADX INFO: loaded from: classes8.dex */
public class AccountInactiveTipAct extends PutongMvpAct {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new C21473yq(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new C21755zq(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return ura.m195053e().m195057d().mo33948xi() ? "p_delete_account_success" : super.pageId();
    }
}
