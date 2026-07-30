package com.p000p1.mobile.putong.core.member.module;

import android.content.Context;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import l.gr9;
import l.q8p;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreMemberProviderModule", path = "/core_member/service")
public class CoreMemberProviderImpl implements CoreMemberProviderInterface {
    /* JADX INFO: renamed from: Eh */
    public boolean m831Eh() {
        return gr9.c();
    }

    /* JADX INFO: renamed from: h9 */
    public boolean m832h9(CoreSuggested.UserInfo userInfo, User user) {
        return q8p.Companion.n(userInfo, user);
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: wf */
    public boolean m833wf() {
        return q8p.i();
    }
}
