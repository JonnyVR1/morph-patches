package com.p051p1.mobile.putong.core.member.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreMemberInnerServiceHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        CoreMemberBusinessService coreMemberBusinessService = (CoreMemberBusinessService) mum.m160228d().m160230a("/member_business_service/service").navigation();
        ((CoreMemberInnerServiceHolder) obj).coreMemberInnerService = coreMemberBusinessService;
        if (coreMemberBusinessService != null) {
            return;
        }
        zzq0.m222278a("The field 'coreMemberInnerService' is null, in class '", CoreMemberInnerServiceHolder.class.getName(), "!");
    }
}
