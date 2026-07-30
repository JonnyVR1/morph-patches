package com.p000p1.mobile.putong.core.member.module;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import l.ksm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreMemberInnerServiceHolder {

    @Autowired(name = "/member_business_service/service", required = true)
    public CoreMemberBusinessService coreMemberInnerService;

    /* JADX INFO: renamed from: a */
    public void m823a() {
        ksm.d().g(this);
    }
}
