package com.p046p1.mobile.putong.core.member.module;

import android.content.Context;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p149l.gr9;
import p149l.q8p;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberProviderModule", path = "/core_member/service")
public class CoreMemberProviderImpl implements CoreMemberProviderInterface {
    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface
    /* JADX INFO: renamed from: Eh */
    public boolean mo33647Eh() {
        return gr9.m127678c();
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface
    /* JADX INFO: renamed from: h9 */
    public boolean mo33648h9(CoreSuggested.UserInfo userInfo, User user) {
        return q8p.INSTANCE.m173439n(userInfo, user);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface
    /* JADX INFO: renamed from: wf */
    public boolean mo33649wf() {
        return q8p.m173425i();
    }
}
