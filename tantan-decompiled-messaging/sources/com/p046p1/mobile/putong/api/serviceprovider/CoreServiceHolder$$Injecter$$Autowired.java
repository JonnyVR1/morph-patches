package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreServiceHolder coreServiceHolder = (CoreServiceHolder) obj;
        CoreService coreService = (CoreService) ksm.m147096d().m147098a("/core_service/service").navigation();
        coreServiceHolder.coreService = coreService;
        if (coreService == null) {
            tqq0.m190155a("The field 'coreService' is null, in class '", CoreServiceHolder.class.getName(), "!");
            return;
        }
        CoreCommonService coreCommonService = (CoreCommonService) ksm.m147096d().m147098a("/core_common_service/service").navigation();
        coreServiceHolder.coreCommonService = coreCommonService;
        if (coreCommonService != null) {
            return;
        }
        tqq0.m190155a("The field 'coreCommonService' is null, in class '", CoreServiceHolder.class.getName(), "!");
    }
}
