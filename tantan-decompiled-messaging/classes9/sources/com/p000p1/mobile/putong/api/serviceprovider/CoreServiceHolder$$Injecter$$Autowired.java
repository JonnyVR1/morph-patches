package com.p000p1.mobile.putong.api.serviceprovider;

import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreServiceHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        CoreServiceHolder coreServiceHolder = (CoreServiceHolder) obj;
        CoreService coreService = (CoreService) ksm.d().a("/core_service/service").navigation();
        coreServiceHolder.coreService = coreService;
        if (coreService == null) {
            tqq0.a("The field 'coreService' is null, in class '", CoreServiceHolder.class.getName(), "!");
            return;
        }
        CoreCommonService coreCommonService = (CoreCommonService) ksm.d().a("/core_common_service/service").navigation();
        coreServiceHolder.coreCommonService = coreCommonService;
        if (coreCommonService != null) {
            return;
        }
        tqq0.a("The field 'coreCommonService' is null, in class '", CoreServiceHolder.class.getName(), "!");
    }
}
