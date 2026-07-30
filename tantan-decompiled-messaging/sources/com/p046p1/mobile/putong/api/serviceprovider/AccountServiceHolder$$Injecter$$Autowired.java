package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        AccountServiceHolder accountServiceHolder = (AccountServiceHolder) obj;
        AccountService accountService = (AccountService) ksm.m147096d().m147098a("/account_service/service").navigation();
        accountServiceHolder.accountService = accountService;
        if (accountService == null) {
            tqq0.m190155a("The field 'accountService' is null, in class '", AccountServiceHolder.class.getName(), "!");
            return;
        }
        AccountCommonService accountCommonService = (AccountCommonService) ksm.m147096d().m147098a("/account_common_service/service").navigation();
        accountServiceHolder.accountCommonService = accountCommonService;
        if (accountCommonService != null) {
            return;
        }
        tqq0.m190155a("The field 'accountCommonService' is null, in class '", AccountServiceHolder.class.getName(), "!");
    }
}
