package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import l.a1c0;
import p003l.bvy;
import p003l.cvy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageChatFireSettingAct extends PutongCoreMvpAct<bvy, cvy> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m1927Z1(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) MessageChatFireSettingAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bvy m1928X1() {
        return new bvy(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public cvy m1929Y1() {
        return new cvy(this);
    }

    public void checkGradientColors() {
        super/*com.p1.mobile.putong.app.PutongAct*/.checkGradientColors();
        toolbar().setBackgroundColor(((Act) this).act.getResources().getColor(a1c0.q));
        setStatusBarColorResId(a1c0.q);
    }

    public void initPageHelper() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
    }

    public String pageId() {
        return "p_spark_setting";
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
