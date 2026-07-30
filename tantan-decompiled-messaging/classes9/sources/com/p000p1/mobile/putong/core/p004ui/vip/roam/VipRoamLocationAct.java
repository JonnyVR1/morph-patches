package com.p000p1.mobile.putong.core.p004ui.vip.roam;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import l.j760;
import l.vwb;
import p006l.mml0;
import p006l.uml0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipRoamLocationAct extends PutongMvpAct<mml0, uml0> {

    /* JADX INFO: renamed from: e */
    public String f7749e = "";

    /* JADX INFO: renamed from: Y1 */
    public static Intent m11180Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VipRoamLocationAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public mml0 mo571V1() {
        return new mml0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public uml0 mo572X1() {
        return new uml0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongMvpAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("from");
        this.f7749e = stringExtra;
        this.pageHelper.p(new j760[]{vwb.Y("showfrom_location", stringExtra)});
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            ((mml0) this.f1161c).m19424G0(intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_moment_select_location_view";
    }
}
