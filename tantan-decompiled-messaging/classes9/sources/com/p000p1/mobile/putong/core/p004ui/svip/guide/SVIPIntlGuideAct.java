package com.p000p1.mobile.putong.core.p004ui.svip.guide;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import p006l.wld0;
import p006l.zld0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SVIPIntlGuideAct extends PutongMvpAct<wld0, zld0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m9240Y1(Context context) {
        return new Intent(context, (Class<?>) SVIPIntlGuideAct.class);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public wld0 mo571V1() {
        return new wld0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zld0 mo572X1() {
        return new zld0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_intl_svip_introduction";
    }
}
