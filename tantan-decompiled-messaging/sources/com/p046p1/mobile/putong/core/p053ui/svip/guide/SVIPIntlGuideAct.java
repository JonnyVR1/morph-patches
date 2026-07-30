package com.p046p1.mobile.putong.core.p053ui.svip.guide;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.wld0;
import p149l.zld0;

/* JADX INFO: loaded from: classes9.dex */
public class SVIPIntlGuideAct extends PutongMvpAct<wld0, zld0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m55842Y1(Context context) {
        return new Intent(context, (Class<?>) SVIPIntlGuideAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public wld0 mo28672V1() {
        return new wld0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zld0 mo28673X1() {
        return new zld0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_svip_introduction";
    }
}
