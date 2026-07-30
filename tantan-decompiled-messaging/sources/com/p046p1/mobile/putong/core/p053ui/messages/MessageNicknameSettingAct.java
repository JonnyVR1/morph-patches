package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Intent;
import android.view.Menu;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.Active;
import p149l.a1c0;
import p149l.vwb;
import p149l.xtz;
import p149l.ztz;

/* JADX INFO: loaded from: classes3.dex */
public class MessageNicknameSettingAct extends PutongCoreMvpAct<xtz, ztz> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m48902Z1(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) MessageNicknameSettingAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public xtz mo29951X1() {
        return new xtz(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ztz mo29952Y1() {
        return new ztz(this);
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
        this.pageHelper.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((ztz) this.f17565e).m220163c(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_set_nickname";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
