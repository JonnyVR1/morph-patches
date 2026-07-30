package com.p000p1.mobile.putong.api.serviceprovider;

import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p006l.zq2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountServiceHolder extends zq2<AccountService, AccountCommonService> {

    @Autowired(name = "/account_common_service/service", required = true)
    public AccountCommonService accountCommonService;

    @Autowired(name = "/account_service/service", required = true)
    public AccountService accountService;

    @Override // p006l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AccountCommonService mo1508a() {
        return this.accountCommonService;
    }

    @Override // p006l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AccountService mo1509b() {
        return this.accountService;
    }
}
