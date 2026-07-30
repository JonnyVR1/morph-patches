package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p153l.pr2;

/* JADX INFO: loaded from: classes9.dex */
public class AccountServiceHolder extends pr2<AccountService, AccountCommonService> {

    @Autowired(name = "/account_common_service/service", required = true)
    public AccountCommonService accountCommonService;

    @Autowired(name = "/account_service/service", required = true)
    public AccountService accountService;

    @Override // p153l.pr2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AccountCommonService mo30600a() {
        return this.accountCommonService;
    }

    @Override // p153l.pr2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AccountService mo30601b() {
        return this.accountService;
    }
}
