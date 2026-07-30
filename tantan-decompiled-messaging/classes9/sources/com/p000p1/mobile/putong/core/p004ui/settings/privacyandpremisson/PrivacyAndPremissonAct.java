package com.p000p1.mobile.putong.core.p004ui.settings.privacyandpremisson;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import p006l.do80;
import p006l.so80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivacyAndPremissonAct extends PutongMvpAct<do80, so80> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m9073Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PrivacyAndPremissonAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public do80 mo571V1() {
        return new do80(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public so80 mo572X1() {
        return new so80(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_privacy_and_permission_settings_view";
    }
}
