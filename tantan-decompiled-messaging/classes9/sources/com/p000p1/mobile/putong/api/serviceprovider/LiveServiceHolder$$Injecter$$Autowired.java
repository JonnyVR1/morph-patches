package com.p000p1.mobile.putong.api.serviceprovider;

import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LiveServiceHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        LiveServiceHolder liveServiceHolder = (LiveServiceHolder) obj;
        LiveService liveService = (LiveService) ksm.d().a("/live_service/service").navigation();
        liveServiceHolder.liveService = liveService;
        if (liveService == null) {
            tqq0.a("The field 'liveService' is null, in class '", LiveServiceHolder.class.getName(), "!");
            return;
        }
        LiveCommonService liveCommonService = (LiveCommonService) ksm.d().a("/live_common_service/service").navigation();
        liveServiceHolder.liveCommonService = liveCommonService;
        if (liveCommonService != null) {
            return;
        }
        tqq0.a("The field 'liveCommonService' is null, in class '", LiveServiceHolder.class.getName(), "!");
    }
}
