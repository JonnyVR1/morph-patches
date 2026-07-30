package com.p051p1.mobile.putong.core.p058ui.vip.roam;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.jyb;
import p153l.qvl0;
import p153l.yvl0;

/* JADX INFO: loaded from: classes12.dex */
public class VipRoamLocationAct extends PutongMvpAct<qvl0, yvl0> {

    /* JADX INFO: renamed from: e */
    public String f38816e = "";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m58870Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VipRoamLocationAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public qvl0 mo29671X1() {
        return new qvl0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public yvl0 mo29672Y1() {
        return new yvl0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("from");
        this.f38816e = stringExtra;
        this.pageHelper.m152781p(jyb.m147494Y("showfrom_location", stringExtra));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            ((qvl0) this.f17891c).m178350G0(intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_moment_select_location_view";
    }
}
