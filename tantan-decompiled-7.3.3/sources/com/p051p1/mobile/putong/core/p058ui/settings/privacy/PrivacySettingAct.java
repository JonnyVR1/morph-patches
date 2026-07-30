package com.p051p1.mobile.putong.core.p058ui.settings.privacy;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.dy80;
import p153l.jyb;
import p153l.wx80;

/* JADX INFO: loaded from: classes12.dex */
public class PrivacySettingAct extends PutongMvpAct<wx80, dy80> {

    /* JADX INFO: renamed from: e */
    public wx80 f37184e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m56856Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PrivacySettingAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wx80 mo29671X1() {
        wx80 wx80Var = new wx80(this);
        this.f37184e = wx80Var;
        return wx80Var;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dy80 mo29672Y1() {
        return new dy80(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m152781p(jyb.m147494Y("privacy_manage_source", getIntent().getStringExtra("from")));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ((wx80) this.f17891c).m208393x0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_setting_privacy_manage";
    }
}
