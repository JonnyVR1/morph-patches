package com.p046p1.mobile.putong.core.p053ui.settings.privacy;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.sp80;
import p149l.vwb;
import p149l.zp80;

/* JADX INFO: loaded from: classes9.dex */
public class PrivacySettingAct extends PutongMvpAct<sp80, zp80> {

    /* JADX INFO: renamed from: e */
    public sp80 f36336e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m55673Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PrivacySettingAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public sp80 mo28672V1() {
        sp80 sp80Var = new sp80(this);
        this.f36336e = sp80Var;
        return sp80Var;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zp80 mo28673X1() {
        return new zp80(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m109040p(vwb.m200311Y("privacy_manage_source", getIntent().getStringExtra("from")));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ((sp80) this.f17172c).m185348x0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_setting_privacy_manage";
    }
}
