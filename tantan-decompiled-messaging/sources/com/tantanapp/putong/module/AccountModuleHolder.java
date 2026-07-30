package com.tantanapp.putong.module;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p149l.sp2;

/* JADX INFO: loaded from: classes13.dex */
public class AccountModuleHolder extends sp2 {

    @Autowired(name = "/account_module/module", required = true)
    public Module module;

    @Override // p149l.sp2
    /* JADX INFO: renamed from: g */
    public Module mo33279g() {
        return this.module;
    }
}
