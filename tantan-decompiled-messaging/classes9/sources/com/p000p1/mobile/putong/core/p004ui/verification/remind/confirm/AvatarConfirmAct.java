package com.p000p1.mobile.putong.core.p004ui.verification.remind.confirm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.android.app.Act;
import l.j760;
import p006l.el1;
import p006l.kl1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AvatarConfirmAct extends PutongCoreMvpAct<el1, kl1> {
    /* JADX INFO: renamed from: b2 */
    public static void m9500b2(Act act, int i) {
        Intent intent = new Intent((Context) act, (Class<?>) AvatarConfirmAct.class);
        intent.putExtra("verification_type", i);
        act.startActivity(intent);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public el1 mo1879X1() {
        return new el1(this);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public kl1 mo1880Y1() {
        return new kl1(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_photo_confirmation_verification";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int intExtra = getIntent().getIntExtra("verification_type", 0);
        String str = "" + intExtra;
        if (intExtra == 1) {
            str = TTCameraConfig.TYPE_ID_CARD_AVATAR;
        } else if (intExtra == 2) {
            str = "Identity";
        } else if (intExtra == 3) {
            str = "CTID";
        }
        this.pageHelper.p(new j760[]{j760.a("validation_type", str)});
    }
}
