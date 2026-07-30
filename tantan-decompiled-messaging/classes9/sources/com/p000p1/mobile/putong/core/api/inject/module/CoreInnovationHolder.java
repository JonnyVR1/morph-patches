package com.p000p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import com.tantanapp.putong.module.Module;
import l.sp2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreInnovationHolder extends sp2 {

    @Autowired(name = "/innovation_module/module", required = true)
    public Module innovationModule;

    /* JADX INFO: renamed from: g */
    public Module m5212g() {
        return this.innovationModule;
    }
}
