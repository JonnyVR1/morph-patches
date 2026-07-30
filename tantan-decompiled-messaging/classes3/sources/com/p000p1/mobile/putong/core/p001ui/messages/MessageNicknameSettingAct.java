package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import l.a1c0;
import l.j760;
import l.vwb;
import l.xtz;
import p003l.ztz;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageNicknameSettingAct extends PutongCoreMvpAct<xtz, ztz> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m1990Z1(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) MessageNicknameSettingAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public xtz m1991X1() {
        return new xtz(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ztz m1992Y1() {
        return new ztz(this);
    }

    public void checkGradientColors() {
        super/*com.p1.mobile.putong.app.PutongAct*/.checkGradientColors();
        toolbar().setBackgroundColor(((Act) this).act.getResources().getColor(a1c0.q));
        setStatusBarColorResId(a1c0.q);
    }

    public void initPageHelper() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("tooltips_trigger_mode", "active")});
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return ((ztz) ((PutongCoreMvpAct) this).e).m9476c(menu);
    }

    public String pageId() {
        return "p_set_nickname";
    }

    public void setTheme() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTheme();
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
