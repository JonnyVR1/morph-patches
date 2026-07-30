package com.p000p1.mobile.putong.core.p004ui.verification.remind.hold;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.android.app.Act;
import l.j760;
import p006l.em1;
import p006l.wl1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AvatarForceChangeAct extends PutongCoreMvpAct<wl1, em1> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m9503Z1(Act act, int i, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) AvatarForceChangeAct.class);
        intent.putExtra("type", i);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wl1 mo1879X1() {
        return new wl1(this);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public em1 mo1880Y1() {
        return new em1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        super.initPageHelper();
        int intExtra = getIntent().getIntExtra("type", -1);
        if (intExtra == 1) {
            str = TTCameraConfig.TYPE_ID_CARD_AVATAR;
        } else if (intExtra != 2) {
            str = intExtra != 3 ? null : "CTID";
        } else {
            str = "Identity";
        }
        this.pageHelper.p(new j760[]{j760.a("validation_type", str)});
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_change_avatar_verification";
    }
}
