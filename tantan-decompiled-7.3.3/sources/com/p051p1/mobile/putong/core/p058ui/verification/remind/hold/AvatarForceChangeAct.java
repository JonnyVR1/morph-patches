package com.p051p1.mobile.putong.core.p058ui.verification.remind.hold;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.dm1;
import p153l.lm1;
import p153l.pf60;

/* JADX INFO: loaded from: classes12.dex */
public class AvatarForceChangeAct extends PutongCoreMvpAct<dm1, lm1> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m57261a2(Act act, int i, String str) {
        Intent intent = new Intent(act, (Class<?>) AvatarForceChangeAct.class);
        intent.putExtra("type", i);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dm1 mo30949Y1() {
        return new dm1(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public lm1 mo30950Z1() {
        return new lm1(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        String str;
        super.initPageHelper();
        int intExtra = getIntent().getIntExtra("type", -1);
        if (intExtra == 1) {
            str = "avatar";
        } else if (intExtra != 2) {
            str = intExtra != 3 ? null : "CTID";
        } else {
            str = "Identity";
        }
        this.pageHelper.m152781p(pf60.m172085a("validation_type", str));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_change_avatar_verification";
    }
}
