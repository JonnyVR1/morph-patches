package com.p051p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import com.tantanapp.putong.module.Module;
import p153l.jq2;

/* JADX INFO: loaded from: classes9.dex */
public class CoreMemberHolder extends jq2 {

    @Autowired(name = "/member_module/module", required = true)
    public Module memberModule;

    @Override // p153l.jq2
    /* JADX INFO: renamed from: g */
    public Module mo34282g() {
        return this.memberModule;
    }
}
