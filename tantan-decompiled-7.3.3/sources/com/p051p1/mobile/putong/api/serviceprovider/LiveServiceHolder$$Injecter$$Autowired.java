package com.p051p1.mobile.putong.api.serviceprovider;

import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        LiveServiceHolder liveServiceHolder = (LiveServiceHolder) obj;
        LiveService liveService = (LiveService) mum.m160228d().m160230a("/live_service/service").navigation();
        liveServiceHolder.liveService = liveService;
        if (liveService == null) {
            zzq0.m222278a("The field 'liveService' is null, in class '", LiveServiceHolder.class.getName(), "!");
            return;
        }
        LiveCommonService liveCommonService = (LiveCommonService) mum.m160228d().m160230a("/live_common_service/service").navigation();
        liveServiceHolder.liveCommonService = liveCommonService;
        if (liveCommonService != null) {
            return;
        }
        zzq0.m222278a("The field 'liveCommonService' is null, in class '", LiveServiceHolder.class.getName(), "!");
    }
}
