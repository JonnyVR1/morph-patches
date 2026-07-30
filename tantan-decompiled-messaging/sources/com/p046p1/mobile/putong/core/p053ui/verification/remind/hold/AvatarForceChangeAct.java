package com.p046p1.mobile.putong.core.p053ui.verification.remind.hold;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.em1;
import p149l.j760;
import p149l.wl1;

/* JADX INFO: loaded from: classes9.dex */
public class AvatarForceChangeAct extends PutongCoreMvpAct<wl1, em1> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m56078Z1(Act act, int i, String str) {
        Intent intent = new Intent(act, (Class<?>) AvatarForceChangeAct.class);
        intent.putExtra("type", i);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wl1 mo29951X1() {
        return new wl1(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public em1 mo29952Y1() {
        return new em1(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
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
        this.pageHelper.m109040p(j760.m140076a("validation_type", str));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_change_avatar_verification";
    }
}
