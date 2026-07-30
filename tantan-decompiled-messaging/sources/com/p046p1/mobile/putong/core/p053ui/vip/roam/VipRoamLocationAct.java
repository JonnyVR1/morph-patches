package com.p046p1.mobile.putong.core.p053ui.vip.roam;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.mml0;
import p149l.uml0;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class VipRoamLocationAct extends PutongMvpAct<mml0, uml0> {

    /* JADX INFO: renamed from: e */
    public String f37968e = "";

    /* JADX INFO: renamed from: Y1 */
    public static Intent m57687Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VipRoamLocationAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public mml0 mo28672V1() {
        return new mml0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public uml0 mo28673X1() {
        return new uml0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("from");
        this.f37968e = stringExtra;
        this.pageHelper.m109040p(vwb.m200311Y("showfrom_location", stringExtra));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            ((mml0) this.f17172c).m155470G0(intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_moment_select_location_view";
    }
}
