package com.p051p1.mobile.putong.core.p058ui.settings.privacyandpremisson;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.hw80;
import p153l.ww80;

/* JADX INFO: loaded from: classes12.dex */
public class PrivacyAndPremissonAct extends PutongMvpAct<hw80, ww80> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m56859Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PrivacyAndPremissonAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public hw80 mo29671X1() {
        return new hw80(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ww80 mo29672Y1() {
        return new ww80(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_privacy_and_permission_settings_view";
    }
}
