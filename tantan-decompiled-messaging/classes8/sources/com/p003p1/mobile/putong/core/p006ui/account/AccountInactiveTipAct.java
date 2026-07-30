package com.p003p1.mobile.putong.core.p006ui.account;

import com.p1.mobile.putong.app.PutongMvpAct;
import l.ura;
import p007l.C0799yq;
import p007l.C0809zq;
import p007l.jq2;
import p007l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AccountInactiveTipAct extends PutongMvpAct {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V1 */
    public jq2 m8453V1() {
        return new C0799yq(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X1 */
    public s7m m8454X1() {
        return new C0809zq(this);
    }

    public String pageId() {
        return ura.e().d().xi() ? "p_delete_account_success" : super/*com.p1.mobile.putong.app.PutongAct*/.pageId();
    }
}
