package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.a1c0;
import p149l.bvy;
import p149l.cvy;

/* JADX INFO: loaded from: classes3.dex */
public class MessageChatFireSettingAct extends PutongCoreMvpAct<bvy, cvy> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m48842Z1(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) MessageChatFireSettingAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bvy mo29951X1() {
        return new bvy(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public cvy mo29952Y1() {
        return new cvy(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        toolbar().setBackgroundColor(this.act.getResources().getColor(a1c0.f67163q));
        setStatusBarColorResId(a1c0.f67163q);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_spark_setting";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
