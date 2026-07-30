package com.p046p1.mobile.putong.core.message.module;

import android.content.Context;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreMessageProviderInterface;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p149l.y19;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMessageProviderModule", path = "/core_message/service")
public class CoreMessageProviderImpl implements CoreMessageProviderInterface {
    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreMessageProviderInterface
    /* JADX INFO: renamed from: Ig */
    public boolean mo33650Ig() {
        return y19.m212155O();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }
}
