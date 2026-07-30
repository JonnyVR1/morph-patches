package com.p000p1.mobile.putong.core.api.inject.provider;

import com.p000p1.mobile.putong.core.biz.service.CoreMemberInnerService;
import com.p000p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p000p1.mobile.putong.core.card.service.CoreCardInnerService;
import com.p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p1.mobile.putong.core.profile.service.CoreProfileInnerService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreInnerServiceHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        CoreInnerServiceHolder coreInnerServiceHolder = (CoreInnerServiceHolder) obj;
        CoreInnovationInnerService coreInnovationInnerService = (CoreInnovationInnerService) ksm.d().a("/innovation_service/service").navigation();
        coreInnerServiceHolder.innovationInnerService = coreInnovationInnerService;
        if (coreInnovationInnerService == null) {
            tqq0.a("The field 'innovationInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreBusinessService coreBusinessService = (CoreBusinessService) ksm.d().a("/core_business/service").navigation();
        coreInnerServiceHolder.coreBusinessService = coreBusinessService;
        if (coreBusinessService == null) {
            tqq0.a("The field 'coreBusinessService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreMemberInnerService coreMemberInnerService = (CoreMemberInnerService) ksm.d().a("/member_service/service").navigation();
        coreInnerServiceHolder.coreMemberInnerService = coreMemberInnerService;
        if (coreMemberInnerService == null) {
            tqq0.a("The field 'coreMemberInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CorePayInnerService corePayInnerService = (CorePayInnerService) ksm.d().a("/pay_service/service").navigation();
        coreInnerServiceHolder.corePayInnerService = corePayInnerService;
        if (corePayInnerService == null) {
            tqq0.a("The field 'corePayInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreMessageInnerService coreMessageInnerService = (CoreMessageInnerService) ksm.d().a("/message_service/service").navigation();
        coreInnerServiceHolder.coreMessageInnerService = coreMessageInnerService;
        if (coreMessageInnerService == null) {
            tqq0.a("The field 'coreMessageInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreCardInnerService coreCardInnerService = (CoreCardInnerService) ksm.d().a("/card_service/service").navigation();
        coreInnerServiceHolder.coreCardInnerService = coreCardInnerService;
        if (coreCardInnerService == null) {
            tqq0.a("The field 'coreCardInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreProfileInnerService coreProfileInnerService = (CoreProfileInnerService) ksm.d().a("/profile_service/service").navigation();
        coreInnerServiceHolder.coreProfileInnerService = coreProfileInnerService;
        if (coreProfileInnerService == null) {
            tqq0.a("The field 'coreProfileInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
            return;
        }
        CoreBuzzInnerService coreBuzzInnerService = (CoreBuzzInnerService) ksm.d().a("/buzz_service/service").navigation();
        coreInnerServiceHolder.coreBuzzInnerService = coreBuzzInnerService;
        if (coreBuzzInnerService != null) {
            return;
        }
        tqq0.a("The field 'coreBuzzInnerService' is null, in class '", CoreInnerServiceHolder.class.getName(), "!");
    }
}
