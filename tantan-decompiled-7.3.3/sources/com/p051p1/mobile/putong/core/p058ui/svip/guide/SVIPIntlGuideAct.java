package com.p051p1.mobile.putong.core.p058ui.svip.guide;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.bud0;
import p153l.ytd0;

/* JADX INFO: loaded from: classes12.dex */
public class SVIPIntlGuideAct extends PutongMvpAct<ytd0, bud0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m57025Z1(Context context) {
        return new Intent(context, (Class<?>) SVIPIntlGuideAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ytd0 mo29671X1() {
        return new ytd0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public bud0 mo29672Y1() {
        return new bud0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_svip_introduction";
    }
}
