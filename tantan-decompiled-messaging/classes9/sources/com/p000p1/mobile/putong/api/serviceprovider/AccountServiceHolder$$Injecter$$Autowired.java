package com.p000p1.mobile.putong.api.serviceprovider;

import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountCommonService;
import com.p000p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountServiceHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        AccountServiceHolder accountServiceHolder = (AccountServiceHolder) obj;
        AccountService accountService = (AccountService) ksm.d().a("/account_service/service").navigation();
        accountServiceHolder.accountService = accountService;
        if (accountService == null) {
            tqq0.a("The field 'accountService' is null, in class '", AccountServiceHolder.class.getName(), "!");
            return;
        }
        AccountCommonService accountCommonService = (AccountCommonService) ksm.d().a("/account_common_service/service").navigation();
        accountServiceHolder.accountCommonService = accountCommonService;
        if (accountCommonService != null) {
            return;
        }
        tqq0.a("The field 'accountCommonService' is null, in class '", AccountServiceHolder.class.getName(), "!");
    }
}
