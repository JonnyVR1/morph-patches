package com.p000p1.mobile.putong.core.member.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreMemberInnerServiceHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        CoreMemberBusinessService coreMemberBusinessService = (CoreMemberBusinessService) ksm.d().a("/member_business_service/service").navigation();
        ((CoreMemberInnerServiceHolder) obj).coreMemberInnerService = coreMemberBusinessService;
        if (coreMemberBusinessService != null) {
            return;
        }
        tqq0.a("The field 'coreMemberInnerService' is null, in class '", CoreMemberInnerServiceHolder.class.getName(), "!");
    }
}
