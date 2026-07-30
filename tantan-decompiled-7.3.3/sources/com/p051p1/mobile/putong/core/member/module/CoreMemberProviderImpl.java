package com.p051p1.mobile.putong.core.member.module;

import android.content.Context;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p153l.qap;
import p153l.rs9;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberProviderModule", path = "/core_member/service")
public class CoreMemberProviderImpl implements CoreMemberProviderInterface {
    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface
    /* JADX INFO: renamed from: Eh */
    public boolean mo34650Eh() {
        return rs9.m182934c();
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface
    /* JADX INFO: renamed from: h9 */
    public boolean mo34651h9(CoreSuggested.UserInfo userInfo, User user) {
        return qap.INSTANCE.m175976n(userInfo, user);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface
    /* JADX INFO: renamed from: wf */
    public boolean mo34652wf() {
        return qap.m175962i();
    }
}
