package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.pf60;
import p153l.qhk;
import p153l.thk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupNameEditAct extends PutongCoreMvpAct<qhk, thk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50284a2(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GroupNameEditAct.class);
        intent.putExtra("group_Id", str);
        intent.putExtra("group_name", str2);
        intent.putExtra("anonymous", z);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public qhk mo30949Y1() {
        return new qhk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public thk mo30950Z1() {
        return new thk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m152781p(pf60.m172085a("is_anonymou_group", Integer.valueOf(getIntent().getBooleanExtra("anonymous", false) ? 1 : 0)));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((thk) this.f18284e).m191256q(menu) || super.onCreateOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_alter_group_name";
    }
}
