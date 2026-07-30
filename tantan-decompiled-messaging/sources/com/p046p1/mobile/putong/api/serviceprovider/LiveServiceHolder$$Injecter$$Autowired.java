package com.p046p1.mobile.putong.api.serviceprovider;

import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        LiveServiceHolder liveServiceHolder = (LiveServiceHolder) obj;
        LiveService liveService = (LiveService) ksm.m147096d().m147098a("/live_service/service").navigation();
        liveServiceHolder.liveService = liveService;
        if (liveService == null) {
            tqq0.m190155a("The field 'liveService' is null, in class '", LiveServiceHolder.class.getName(), "!");
            return;
        }
        LiveCommonService liveCommonService = (LiveCommonService) ksm.m147096d().m147098a("/live_common_service/service").navigation();
        liveServiceHolder.liveCommonService = liveCommonService;
        if (liveCommonService != null) {
            return;
        }
        tqq0.m190155a("The field 'liveCommonService' is null, in class '", LiveServiceHolder.class.getName(), "!");
    }
}
