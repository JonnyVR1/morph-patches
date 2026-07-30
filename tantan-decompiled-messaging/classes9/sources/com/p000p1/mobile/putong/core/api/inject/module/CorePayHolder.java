package com.p000p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import com.tantanapp.putong.module.Module;
import l.sp2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CorePayHolder extends sp2 {

    @Autowired(name = "/pay_module/module", required = true)
    public Module payModule;

    /* JADX INFO: renamed from: g */
    public Module m5215g() {
        return this.payModule;
    }
}
