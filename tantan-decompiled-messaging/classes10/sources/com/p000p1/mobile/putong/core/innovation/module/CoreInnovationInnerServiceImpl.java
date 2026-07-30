package com.p000p1.mobile.putong.core.innovation.module;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.core.innovation.service.CoreInnovationInnerService;
import com.p1.mobile.putong.core.newui.TestActivity;
import com.tantanapp.android.injecter.facade.annotation.Route;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreInnovationInnerService", path = "/innovation_service/service")
public class CoreInnovationInnerServiceImpl implements CoreInnovationInnerService {
    @Override // com.p000p1.mobile.putong.core.innovation.service.CoreInnovationInnerService
    /* JADX INFO: renamed from: Wo */
    public Intent mo713Wo(Context context) {
        return new Intent(context, (Class<?>) TestActivity.class);
    }

    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.core.innovation.service.CoreInnovationInnerService
    /* JADX INFO: renamed from: q4 */
    public void mo714q4() {
    }
}
