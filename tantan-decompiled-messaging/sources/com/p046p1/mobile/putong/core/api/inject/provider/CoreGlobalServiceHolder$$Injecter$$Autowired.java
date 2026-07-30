package com.p046p1.mobile.putong.core.api.inject.provider;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreGlobalServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreGlobalServiceHolder coreGlobalServiceHolder = (CoreGlobalServiceHolder) obj;
        CoreProviderInterface coreProviderInterface = (CoreProviderInterface) ksm.m147096d().m147098a("/core_global/service").navigation();
        coreGlobalServiceHolder.coreGlobalProvider = coreProviderInterface;
        if (coreProviderInterface == null) {
            tqq0.m190155a("The field 'coreGlobalProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreInnovationProviderInterface coreInnovationProviderInterface = (CoreInnovationProviderInterface) ksm.m147096d().m147098a("/core_innovation/service").navigation();
        coreGlobalServiceHolder.coreInnovationProvider = coreInnovationProviderInterface;
        if (coreInnovationProviderInterface == null) {
            tqq0.m190155a("The field 'coreInnovationProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreMemberProviderInterface coreMemberProviderInterface = (CoreMemberProviderInterface) ksm.m147096d().m147098a("/core_member/service").navigation();
        coreGlobalServiceHolder.coreMemberProvider = coreMemberProviderInterface;
        if (coreMemberProviderInterface == null) {
            tqq0.m190155a("The field 'coreMemberProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CorePayProviderInterface corePayProviderInterface = (CorePayProviderInterface) ksm.m147096d().m147098a("/core_pay/service").navigation();
        coreGlobalServiceHolder.corePayProvider = corePayProviderInterface;
        if (corePayProviderInterface == null) {
            tqq0.m190155a("The field 'corePayProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreMessageProviderInterface coreMessageProviderInterface = (CoreMessageProviderInterface) ksm.m147096d().m147098a("/core_message/service").navigation();
        coreGlobalServiceHolder.coreMessageProvider = coreMessageProviderInterface;
        if (coreMessageProviderInterface == null) {
            tqq0.m190155a("The field 'coreMessageProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreCardProviderInterface coreCardProviderInterface = (CoreCardProviderInterface) ksm.m147096d().m147098a("/core_card/service").navigation();
        coreGlobalServiceHolder.coreCardProvider = coreCardProviderInterface;
        if (coreCardProviderInterface == null) {
            tqq0.m190155a("The field 'coreCardProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreProfileProviderInterface coreProfileProviderInterface = (CoreProfileProviderInterface) ksm.m147096d().m147098a("/core_profile/service").navigation();
        coreGlobalServiceHolder.coreProfileProvider = coreProfileProviderInterface;
        if (coreProfileProviderInterface == null) {
            tqq0.m190155a("The field 'coreProfileProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreBuzzProviderInterface coreBuzzProviderInterface = (CoreBuzzProviderInterface) ksm.m147096d().m147098a("/core_buzz/service").navigation();
        coreGlobalServiceHolder.coreBuzzProviderInterface = coreBuzzProviderInterface;
        if (coreBuzzProviderInterface != null) {
            return;
        }
        tqq0.m190155a("The field 'coreBuzzProviderInterface' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
    }
}
