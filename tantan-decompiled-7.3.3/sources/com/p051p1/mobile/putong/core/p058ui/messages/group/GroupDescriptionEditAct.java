package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.cgk;
import p153l.egk;
import p153l.pf60;

/* JADX INFO: loaded from: classes3.dex */
public class GroupDescriptionEditAct extends PutongCoreMvpAct<cgk, egk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50278a2(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GroupDescriptionEditAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        intent.putExtra("group_description", str2);
        intent.putExtra("anonymous", z);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public cgk mo30949Y1() {
        return new cgk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public egk mo30950Z1() {
        return new egk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m152781p(pf60.m172085a("is_anonymou_group", Integer.valueOf(getIntent().getBooleanExtra("anonymous", false) ? 1 : 0)));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((egk) this.f18284e).m120783m(menu) || super.onCreateOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_alter_group_state";
    }
}
