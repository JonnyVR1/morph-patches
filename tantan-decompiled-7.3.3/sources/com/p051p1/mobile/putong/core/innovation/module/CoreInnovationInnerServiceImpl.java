package com.p051p1.mobile.putong.core.innovation.module;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p051p1.mobile.putong.core.newui.TestActivity;
import com.tantanapp.android.injecter.facade.annotation.Route;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreInnovationInnerService", path = "/innovation_service/service")
public class CoreInnovationInnerServiceImpl implements CoreInnovationInnerService {
    @Override // com.p051p1.mobile.putong.core.innovation.service.CoreInnovationInnerService
    /* JADX INFO: renamed from: Wo */
    public Intent mo36914Wo(Context context) {
        return new Intent(context, (Class<?>) TestActivity.class);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.innovation.service.CoreInnovationInnerService
    /* JADX INFO: renamed from: q4 */
    public void mo36915q4() {
    }
}
