package com.p046p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import com.tantanapp.putong.module.Module;
import p149l.sp2;

/* JADX INFO: loaded from: classes9.dex */
public class CoreMessageHolder extends sp2 {

    @Autowired(name = "/message_module/module", required = true)
    public Module messageModule;

    @Override // p149l.sp2
    /* JADX INFO: renamed from: g */
    public Module mo33279g() {
        return this.messageModule;
    }
}
