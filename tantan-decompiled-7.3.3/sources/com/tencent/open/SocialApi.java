package com.tencent.open;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.connect.C13965a;
import com.tencent.connect.auth.QQToken;
import com.tencent.tauth.IUiListener;

/* JADX INFO: loaded from: classes2.dex */
public class SocialApi {

    /* JADX INFO: renamed from: a */
    private SocialApiIml f60976a;

    public SocialApi(QQToken qQToken) {
        this.f60976a = new SocialApiIml(qQToken);
    }

    public void ask(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13965a.m83167a("SocialApi", iUiListener)) {
            return;
        }
        this.f60976a.ask(activity, bundle, iUiListener);
    }

    public void gift(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13965a.m83167a("SocialApi", iUiListener)) {
            return;
        }
        this.f60976a.gift(activity, bundle, iUiListener);
    }

    public void invite(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13965a.m83167a("SocialApi", iUiListener)) {
            return;
        }
        this.f60976a.invite(activity, bundle, iUiListener);
    }

    public void story(Activity activity, Bundle bundle, IUiListener iUiListener) {
        if (C13965a.m83167a("SocialApi", iUiListener)) {
            return;
        }
        this.f60976a.story(activity, bundle, iUiListener);
    }
}
