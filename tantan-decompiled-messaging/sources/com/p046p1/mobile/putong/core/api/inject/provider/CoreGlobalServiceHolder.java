package com.p046p1.mobile.putong.core.api.inject.provider;

import com.tantanapp.android.injecter.facade.annotation.Autowired;
import p149l.yz6;

/* JADX INFO: loaded from: classes9.dex */
public class CoreGlobalServiceHolder extends yz6<CoreProviderInterface> {

    @Autowired(name = "/core_buzz/service", required = true)
    public CoreBuzzProviderInterface coreBuzzProviderInterface;

    @Autowired(name = "/core_card/service", required = true)
    public CoreCardProviderInterface coreCardProvider;

    @Autowired(name = "/core_global/service", required = true)
    public CoreProviderInterface coreGlobalProvider;

    @Autowired(name = "/core_innovation/service", required = true)
    public CoreInnovationProviderInterface coreInnovationProvider;

    @Autowired(name = "/core_member/service", required = true)
    public CoreMemberProviderInterface coreMemberProvider;

    @Autowired(name = "/core_message/service", required = true)
    public CoreMessageProviderInterface coreMessageProvider;

    @Autowired(name = "/core_pay/service", required = true)
    public CorePayProviderInterface corePayProvider;

    @Autowired(name = "/core_profile/service", required = true)
    public CoreProfileProviderInterface coreProfileProvider;

    /* JADX INFO: renamed from: b */
    public CoreInnovationProviderInterface m33641b() {
        return this.coreInnovationProvider;
    }

    /* JADX INFO: renamed from: c */
    public CoreMemberProviderInterface m33642c() {
        return this.coreMemberProvider;
    }

    /* JADX INFO: renamed from: d */
    public CoreMessageProviderInterface m33643d() {
        return this.coreMessageProvider;
    }

    /* JADX INFO: renamed from: e */
    public CoreProviderInterface m33644e() {
        return this.coreGlobalProvider;
    }
}
