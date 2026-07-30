package com.p046p1.mobile.putong.core.api.inject.provider;

import com.p046p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p046p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p046p1.mobile.putong.core.card.service.CoreCardInnerService;
import com.p046p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p046p1.mobile.putong.core.profile.service.CoreProfileInnerService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreInnerServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreInnerServiceHolder coreInnerServiceHolder = (CoreInnerServiceHolder) obj;
        CoreInnovationInnerService coreInnovationInnerService = (CoreInnovationInnerService) ksm.m147096d().m147098a("/innovation_service/service").navigation();
        coreInnerServiceHolder.innovationInnerService = coreInnovationInnerService;
        if (coreInnovationInnerService == null) {
            tqq0.m190155a("The field 'innovationInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreBusinessService coreBusinessService = (CoreBusinessService) ksm.m147096d().m147098a("/core_business/service").navigation();
        coreInnerServiceHolder.coreBusinessService = coreBusinessService;
        if (coreBusinessService == null) {
            tqq0.m190155a("The field 'coreBusinessService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreMemberInnerService coreMemberInnerService = (CoreMemberInnerService) ksm.m147096d().m147098a("/member_service/service").navigation();
        coreInnerServiceHolder.coreMemberInnerService = coreMemberInnerService;
        if (coreMemberInnerService == null) {
            tqq0.m190155a("The field 'coreMemberInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CorePayInnerService corePayInnerService = (CorePayInnerService) ksm.m147096d().m147098a("/pay_service/service").navigation();
        coreInnerServiceHolder.corePayInnerService = corePayInnerService;
        if (corePayInnerService == null) {
            tqq0.m190155a("The field 'corePayInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreMessageInnerService coreMessageInnerService = (CoreMessageInnerService) ksm.m147096d().m147098a("/message_service/service").navigation();
        coreInnerServiceHolder.coreMessageInnerService = coreMessageInnerService;
        if (coreMessageInnerService == null) {
            tqq0.m190155a("The field 'coreMessageInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreCardInnerService coreCardInnerService = (CoreCardInnerService) ksm.m147096d().m147098a("/card_service/service").navigation();
        coreInnerServiceHolder.coreCardInnerService = coreCardInnerService;
        if (coreCardInnerService == null) {
            tqq0.m190155a("The field 'coreCardInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreProfileInnerService coreProfileInnerService = (CoreProfileInnerService) ksm.m147096d().m147098a("/profile_service/service").navigation();
        coreInnerServiceHolder.coreProfileInnerService = coreProfileInnerService;
        if (coreProfileInnerService == null) {
            tqq0.m190155a("The field 'coreProfileInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreBuzzInnerService coreBuzzInnerService = (CoreBuzzInnerService) ksm.m147096d().m147098a("/buzz_service/service").navigation();
        coreInnerServiceHolder.coreBuzzInnerService = coreBuzzInnerService;
        if (coreBuzzInnerService != null) {
            return;
        }
        tqq0.m190155a("The field 'coreBuzzInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
    }
}
