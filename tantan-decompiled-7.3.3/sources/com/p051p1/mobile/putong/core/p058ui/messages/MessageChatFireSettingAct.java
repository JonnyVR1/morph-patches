package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.g9c0;
import p153l.y3z;
import p153l.z3z;

/* JADX INFO: loaded from: classes3.dex */
public class MessageChatFireSettingAct extends PutongCoreMvpAct<y3z, z3z> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50025a2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) MessageChatFireSettingAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public y3z mo30949Y1() {
        return new y3z(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public z3z mo30950Z1() {
        return new z3z(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        toolbar().setBackgroundColor(this.act.getResources().getColor(g9c0.f102827q));
        setStatusBarColorResId(g9c0.f102827q);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_spark_setting";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
