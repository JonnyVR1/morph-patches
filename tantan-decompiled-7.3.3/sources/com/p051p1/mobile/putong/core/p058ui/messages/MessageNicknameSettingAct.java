package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Intent;
import android.view.Menu;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.Active;
import p153l.g9c0;
import p153l.jyb;
import p153l.u200;
import p153l.w200;

/* JADX INFO: loaded from: classes3.dex */
public class MessageNicknameSettingAct extends PutongCoreMvpAct<u200, w200> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50085a2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) MessageNicknameSettingAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public u200 mo30949Y1() {
        return new u200(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public w200 mo30950Z1() {
        return new w200(this);
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
        this.pageHelper.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((w200) this.f18284e).m204496c(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_set_nickname";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
