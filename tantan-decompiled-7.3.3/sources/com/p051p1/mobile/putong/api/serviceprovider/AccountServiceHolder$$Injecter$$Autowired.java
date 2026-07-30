package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p051p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        AccountServiceHolder accountServiceHolder = (AccountServiceHolder) obj;
        AccountService accountService = (AccountService) mum.m160228d().m160230a("/account_service/service").navigation();
        accountServiceHolder.accountService = accountService;
        if (accountService == null) {
            zzq0.m222278a("The field 'accountService' is null, in class '", AccountServiceHolder.class.getName(), "!");
            return;
        }
        AccountCommonService accountCommonService = (AccountCommonService) mum.m160228d().m160230a("/account_common_service/service").navigation();
        accountServiceHolder.accountCommonService = accountCommonService;
        if (accountCommonService != null) {
            return;
        }
        zzq0.m222278a("The field 'accountCommonService' is null, in class '", AccountServiceHolder.class.getName(), "!");
    }
}
