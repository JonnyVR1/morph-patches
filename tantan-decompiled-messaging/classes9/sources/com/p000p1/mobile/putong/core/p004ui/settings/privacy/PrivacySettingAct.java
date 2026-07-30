package com.p000p1.mobile.putong.core.p004ui.settings.privacy;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import l.j760;
import l.vwb;
import p006l.sp80;
import p006l.zp80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivacySettingAct extends PutongMvpAct<sp80, zp80> {

    /* JADX INFO: renamed from: e */
    public sp80 f6117e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m9070Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PrivacySettingAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public sp80 mo571V1() {
        sp80 sp80Var = new sp80(this);
        this.f6117e = sp80Var;
        return sp80Var;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zp80 mo572X1() {
        return new zp80(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongMvpAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.p(new j760[]{vwb.Y("privacy_manage_source", getIntent().getStringExtra("from"))});
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        ((sp80) this.f1161c).m24025x0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_setting_privacy_manage";
    }
}
