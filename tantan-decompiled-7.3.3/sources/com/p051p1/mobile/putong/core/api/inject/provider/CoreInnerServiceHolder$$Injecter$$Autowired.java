package com.p051p1.mobile.putong.core.api.inject.provider;

import com.p051p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p051p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p051p1.mobile.putong.core.card.service.CoreCardInnerService;
import com.p051p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p051p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p051p1.mobile.putong.core.profile.service.CoreProfileInnerService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreInnerServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreInnerServiceHolder coreInnerServiceHolder = (CoreInnerServiceHolder) obj;
        CoreInnovationInnerService coreInnovationInnerService = (CoreInnovationInnerService) mum.m160228d().m160230a("/innovation_service/service").navigation();
        coreInnerServiceHolder.innovationInnerService = coreInnovationInnerService;
        if (coreInnovationInnerService == null) {
            zzq0.m222278a("The field 'innovationInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreBusinessService coreBusinessService = (CoreBusinessService) mum.m160228d().m160230a("/core_business/service").navigation();
        coreInnerServiceHolder.coreBusinessService = coreBusinessService;
        if (coreBusinessService == null) {
            zzq0.m222278a("The field 'coreBusinessService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreMemberInnerService coreMemberInnerService = (CoreMemberInnerService) mum.m160228d().m160230a("/member_service/service").navigation();
        coreInnerServiceHolder.coreMemberInnerService = coreMemberInnerService;
        if (coreMemberInnerService == null) {
            zzq0.m222278a("The field 'coreMemberInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CorePayInnerService corePayInnerService = (CorePayInnerService) mum.m160228d().m160230a("/pay_service/service").navigation();
        coreInnerServiceHolder.corePayInnerService = corePayInnerService;
        if (corePayInnerService == null) {
            zzq0.m222278a("The field 'corePayInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreMessageInnerService coreMessageInnerService = (CoreMessageInnerService) mum.m160228d().m160230a("/message_service/service").navigation();
        coreInnerServiceHolder.coreMessageInnerService = coreMessageInnerService;
        if (coreMessageInnerService == null) {
            zzq0.m222278a("The field 'coreMessageInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreCardInnerService coreCardInnerService = (CoreCardInnerService) mum.m160228d().m160230a("/card_service/service").navigation();
        coreInnerServiceHolder.coreCardInnerService = coreCardInnerService;
        if (coreCardInnerService == null) {
            zzq0.m222278a("The field 'coreCardInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreProfileInnerService coreProfileInnerService = (CoreProfileInnerService) mum.m160228d().m160230a("/profile_service/service").navigation();
        coreInnerServiceHolder.coreProfileInnerService = coreProfileInnerService;
        if (coreProfileInnerService == null) {
            zzq0.m222278a("The field 'coreProfileInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreBuzzInnerService coreBuzzInnerService = (CoreBuzzInnerService) mum.m160228d().m160230a("/buzz_service/service").navigation();
        coreInnerServiceHolder.coreBuzzInnerService = coreBuzzInnerService;
        if (coreBuzzInnerService != null) {
            return;
        }
        zzq0.m222278a("The field 'coreBuzzInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
    }
}
