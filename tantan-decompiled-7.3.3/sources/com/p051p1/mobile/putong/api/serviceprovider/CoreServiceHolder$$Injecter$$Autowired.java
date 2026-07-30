package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreServiceHolder coreServiceHolder = (CoreServiceHolder) obj;
        CoreService coreService = (CoreService) mum.m160228d().m160230a("/core_service/service").navigation();
        coreServiceHolder.coreService = coreService;
        if (coreService == null) {
            zzq0.m222278a("The field 'coreService' is null, in class '", CoreServiceHolder.class.getName(), "!");
            return;
        }
        CoreCommonService coreCommonService = (CoreCommonService) mum.m160228d().m160230a("/core_common_service/service").navigation();
        coreServiceHolder.coreCommonService = coreCommonService;
        if (coreCommonService != null) {
            return;
        }
        zzq0.m222278a("The field 'coreCommonService' is null, in class '", CoreServiceHolder.class.getName(), "!");
    }
}
