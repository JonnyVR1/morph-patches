package com.p046p1.mobile.putong.core.member.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreMemberInnerServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreMemberBusinessService coreMemberBusinessService = (CoreMemberBusinessService) ksm.m147096d().m147098a("/member_business_service/service").navigation();
        ((CoreMemberInnerServiceHolder) obj).coreMemberInnerService = coreMemberBusinessService;
        if (coreMemberBusinessService != null) {
            return;
        }
        tqq0.m190155a("The field 'coreMemberInnerService' is null, in class '", CoreMemberInnerServiceHolder.class.getName(), "!");
    }
}
