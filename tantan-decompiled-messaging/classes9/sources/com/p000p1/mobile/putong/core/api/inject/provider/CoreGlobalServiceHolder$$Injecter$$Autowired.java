package com.p000p1.mobile.putong.core.api.inject.provider;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreGlobalServiceHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        CoreGlobalServiceHolder coreGlobalServiceHolder = (CoreGlobalServiceHolder) obj;
        CoreProviderInterface coreProviderInterface = (CoreProviderInterface) ksm.d().a("/core_global/service").navigation();
        coreGlobalServiceHolder.coreGlobalProvider = coreProviderInterface;
        if (coreProviderInterface == null) {
            tqq0.a("The field 'coreGlobalProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreInnovationProviderInterface coreInnovationProviderInterface = (CoreInnovationProviderInterface) ksm.d().a("/core_innovation/service").navigation();
        coreGlobalServiceHolder.coreInnovationProvider = coreInnovationProviderInterface;
        if (coreInnovationProviderInterface == null) {
            tqq0.a("The field 'coreInnovationProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreMemberProviderInterface coreMemberProviderInterface = (CoreMemberProviderInterface) ksm.d().a("/core_member/service").navigation();
        coreGlobalServiceHolder.coreMemberProvider = coreMemberProviderInterface;
        if (coreMemberProviderInterface == null) {
            tqq0.a("The field 'coreMemberProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CorePayProviderInterface corePayProviderInterface = (CorePayProviderInterface) ksm.d().a("/core_pay/service").navigation();
        coreGlobalServiceHolder.corePayProvider = corePayProviderInterface;
        if (corePayProviderInterface == null) {
            tqq0.a("The field 'corePayProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreMessageProviderInterface coreMessageProviderInterface = (CoreMessageProviderInterface) ksm.d().a("/core_message/service").navigation();
        coreGlobalServiceHolder.coreMessageProvider = coreMessageProviderInterface;
        if (coreMessageProviderInterface == null) {
            tqq0.a("The field 'coreMessageProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreCardProviderInterface coreCardProviderInterface = (CoreCardProviderInterface) ksm.d().a("/core_card/service").navigation();
        coreGlobalServiceHolder.coreCardProvider = coreCardProviderInterface;
        if (coreCardProviderInterface == null) {
            tqq0.a("The field 'coreCardProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreProfileProviderInterface coreProfileProviderInterface = (CoreProfileProviderInterface) ksm.d().a("/core_profile/service").navigation();
        coreGlobalServiceHolder.coreProfileProvider = coreProfileProviderInterface;
        if (coreProfileProviderInterface == null) {
            tqq0.a("The field 'coreProfileProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreBuzzProviderInterface coreBuzzProviderInterface = (CoreBuzzProviderInterface) ksm.d().a("/core_buzz/service").navigation();
        coreGlobalServiceHolder.coreBuzzProviderInterface = coreBuzzProviderInterface;
        if (coreBuzzProviderInterface != null) {
            return;
        }
        tqq0.a("The field 'coreBuzzProviderInterface' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
    }
}
