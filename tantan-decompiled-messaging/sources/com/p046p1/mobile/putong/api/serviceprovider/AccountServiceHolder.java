package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p149l.zq2;

/* JADX INFO: loaded from: classes9.dex */
public class AccountServiceHolder extends zq2<AccountService, AccountCommonService> {

    @Autowired(name = "/account_common_service/service", required = true)
    public AccountCommonService accountCommonService;

    @Autowired(name = "/account_service/service", required = true)
    public AccountService accountService;

    @Override // p149l.zq2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AccountCommonService mo29602a() {
        return this.accountCommonService;
    }

    @Override // p149l.zq2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AccountService mo29603b() {
        return this.accountService;
    }
}
