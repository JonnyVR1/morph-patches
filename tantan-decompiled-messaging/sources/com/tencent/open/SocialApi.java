package com.tencent.open;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.connect.C13802a;
import com.tencent.connect.auth.QQToken;
import com.tencent.tauth.IUiListener;

/* JADX INFO: loaded from: classes2.dex */
public class SocialApi {

    /* JADX INFO: renamed from: a */
    private SocialApiIml f60128a;

    public SocialApi(QQToken qQToken) {
        this.f60128a = new SocialApiIml(qQToken);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13802a.m81984a("SocialApi", iUiListener)) {
            return;
        }
        this.f60128a.ask(activity, bundle, iUiListener);
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13802a.m81984a("SocialApi", iUiListener)) {
            return;
        }
        this.f60128a.gift(activity, bundle, iUiListener);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13802a.m81984a("SocialApi", iUiListener)) {
            return;
        }
        this.f60128a.invite(activity, bundle, iUiListener);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13802a.m81984a("SocialApi", iUiListener)) {
            return;
        }
        this.f60128a.story(activity, bundle, iUiListener);
    }
}
