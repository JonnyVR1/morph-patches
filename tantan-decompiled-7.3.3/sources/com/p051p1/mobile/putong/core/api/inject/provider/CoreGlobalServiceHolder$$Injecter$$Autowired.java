package com.p051p1.mobile.putong.core.api.inject.provider;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreGlobalServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreGlobalServiceHolder coreGlobalServiceHolder = (CoreGlobalServiceHolder) obj;
        CoreProviderInterface coreProviderInterface = (CoreProviderInterface) mum.m160228d().m160230a("/core_global/service").navigation();
        coreGlobalServiceHolder.coreGlobalProvider = coreProviderInterface;
        if (coreProviderInterface == null) {
            zzq0.m222278a("The field 'coreGlobalProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreInnovationProviderInterface coreInnovationProviderInterface = (CoreInnovationProviderInterface) mum.m160228d().m160230a("/core_innovation/service").navigation();
        coreGlobalServiceHolder.coreInnovationProvider = coreInnovationProviderInterface;
        if (coreInnovationProviderInterface == null) {
            zzq0.m222278a("The field 'coreInnovationProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreMemberProviderInterface coreMemberProviderInterface = (CoreMemberProviderInterface) mum.m160228d().m160230a("/core_member/service").navigation();
        coreGlobalServiceHolder.coreMemberProvider = coreMemberProviderInterface;
        if (coreMemberProviderInterface == null) {
            zzq0.m222278a("The field 'coreMemberProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CorePayProviderInterface corePayProviderInterface = (CorePayProviderInterface) mum.m160228d().m160230a("/core_pay/service").navigation();
        coreGlobalServiceHolder.corePayProvider = corePayProviderInterface;
        if (corePayProviderInterface == null) {
            zzq0.m222278a("The field 'corePayProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreMessageProviderInterface coreMessageProviderInterface = (CoreMessageProviderInterface) mum.m160228d().m160230a("/core_message/service").navigation();
        coreGlobalServiceHolder.coreMessageProvider = coreMessageProviderInterface;
        if (coreMessageProviderInterface == null) {
            zzq0.m222278a("The field 'coreMessageProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreCardProviderInterface coreCardProviderInterface = (CoreCardProviderInterface) mum.m160228d().m160230a("/core_card/service").navigation();
        coreGlobalServiceHolder.coreCardProvider = coreCardProviderInterface;
        if (coreCardProviderInterface == null) {
            zzq0.m222278a("The field 'coreCardProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreProfileProviderInterface coreProfileProviderInterface = (CoreProfileProviderInterface) mum.m160228d().m160230a("/core_profile/service").navigation();
        coreGlobalServiceHolder.coreProfileProvider = coreProfileProviderInterface;
        if (coreProfileProviderInterface == null) {
            zzq0.m222278a("The field 'coreProfileProvider' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
            return;
        }
        CoreBuzzProviderInterface coreBuzzProviderInterface = (CoreBuzzProviderInterface) mum.m160228d().m160230a("/core_buzz/service").navigation();
        coreGlobalServiceHolder.coreBuzzProviderInterface = coreBuzzProviderInterface;
        if (coreBuzzProviderInterface != null) {
            return;
        }
        zzq0.m222278a("The field 'coreBuzzProviderInterface' is null, in class '", CoreGlobalServiceHolder.class.getName(), "!");
    }
}
