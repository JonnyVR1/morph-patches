package com.p051p1.mobile.putong.core.p058ui.verification.remind.confirm;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.ll1;
import p153l.pf60;
import p153l.rl1;

/* JADX INFO: loaded from: classes12.dex */
public class AvatarConfirmAct extends PutongCoreMvpAct<ll1, rl1> {
    /* JADX INFO: renamed from: c2 */
    public static void m57258c2(Act act, int i) {
        Intent intent = new Intent(act, (Class<?>) AvatarConfirmAct.class);
        intent.putExtra("verification_type", i);
        act.startActivity(intent);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ll1 mo30949Y1() {
        return new ll1(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public rl1 mo30950Z1() {
        return new rl1(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_photo_confirmation_verification";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
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
        this.pageHelper.m152781p(pf60.m172085a("validation_type", str));
    }
}
