package com.p046p1.mobile.putong.live;

import android.content.Context;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p149l.C18367m2;
import p149l.g9s;
import p149l.h9s;
import p149l.mor;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "putong-common 使用的 live 服务", path = "/live_common_service/service")
public class LiveCommonServiceImpl implements LiveCommonService {

    /* JADX INFO: renamed from: a */
    public C18367m2 f44051a = new mor();

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService
    /* JADX INFO: renamed from: a */
    public g9s mo67169a() {
        return h9s.m130033g();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }
}
