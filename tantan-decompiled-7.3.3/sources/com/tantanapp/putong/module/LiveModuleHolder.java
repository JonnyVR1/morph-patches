package com.tantanapp.putong.module;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p153l.jq2;

/* JADX INFO: loaded from: classes12.dex */
public class LiveModuleHolder extends jq2 {

    @Autowired(name = "/live_module/module", required = true)
    public Module module;

    @Override // p153l.jq2
    /* JADX INFO: renamed from: g */
    public Module mo34282g() {
        return this.module;
    }
}
