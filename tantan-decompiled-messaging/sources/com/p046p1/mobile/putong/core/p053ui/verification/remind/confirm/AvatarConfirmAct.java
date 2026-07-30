package com.p046p1.mobile.putong.core.p053ui.verification.remind.confirm;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.el1;
import p149l.j760;
import p149l.kl1;

/* JADX INFO: loaded from: classes9.dex */
public class AvatarConfirmAct extends PutongCoreMvpAct<el1, kl1> {
    /* JADX INFO: renamed from: b2 */
    public static void m56075b2(Act act, int i) {
        Intent intent = new Intent(act, (Class<?>) AvatarConfirmAct.class);
        intent.putExtra("verification_type", i);
        act.startActivity(intent);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public el1 mo29951X1() {
        return new el1(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public kl1 mo29952Y1() {
        return new kl1(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_photo_confirmation_verification";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        int intExtra = getIntent().getIntExtra("verification_type", 0);
        String str = "" + intExtra;
        if (intExtra == 1) {
            str = "avatar";
        } else if (intExtra == 2) {
            str = "Identity";
        } else if (intExtra == 3) {
            str = "CTID";
        }
        this.pageHelper.m109040p(j760.m140076a("validation_type", str));
    }
}
