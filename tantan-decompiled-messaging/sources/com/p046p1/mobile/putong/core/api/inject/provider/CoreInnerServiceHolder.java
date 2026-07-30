package com.p046p1.mobile.putong.core.api.inject.provider;

import com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p046p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p046p1.mobile.putong.core.card.service.CoreCardInnerService;
import com.p046p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService;
import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p149l.ksm;

/* JADX INFO: loaded from: classes9.dex */
public class CoreInnerServiceHolder {

    @Autowired(name = "/core_business/service", required = true)
    public CoreBusinessService coreBusinessService;

    @Autowired(name = "/buzz_service/service", required = true)
    public CoreBuzzInnerService coreBuzzInnerService;

    @Autowired(name = "/card_service/service", required = true)
    public CoreCardInnerService coreCardInnerService;

    @Autowired(name = "/member_service/service", required = true)
    public CoreMemberInnerService coreMemberInnerService;

    @Autowired(name = "/message_service/service", required = true)
    public CoreMessageInnerService coreMessageInnerService;

    @Autowired(name = "/pay_service/service", required = true)
    public CorePayInnerService corePayInnerService;

    @Autowired(name = "/profile_service/service", required = true)
    public CoreProfileInnerService coreProfileInnerService;

    @Autowired(name = "/innovation_service/service", required = true)
    public CoreInnovationInnerService innovationInnerService;

    /* JADX INFO: renamed from: a */
    public void m33645a() {
        ksm.m147096d().m147101g(this);
    }
}
