package com.p051p1.mobile.putong.live;

import android.content.Context;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p153l.C18526m2;
import p153l.hbs;
import p153l.ibs;
import p153l.nqr;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "putong-common 使用的 live 服务", path = "/live_common_service/service")
public class LiveCommonServiceImpl implements LiveCommonService {

    /* JADX INFO: renamed from: a */
    public C18526m2 f44899a = new nqr();

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.live.LiveCommonService
    /* JADX INFO: renamed from: a */
    public hbs mo68352a() {
        return ibs.m139400g();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }
}
