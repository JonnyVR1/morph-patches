package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.j760;
import p149l.mdk;
import p149l.odk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupDescriptionEditAct extends PutongCoreMvpAct<mdk, odk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49095Z1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GroupDescriptionEditAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        intent.putExtra("group_description", str2);
        intent.putExtra("anonymous", z);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public mdk mo29951X1() {
        return new mdk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public odk mo29952Y1() {
        return new odk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m109040p(j760.m140076a("is_anonymou_group", Integer.valueOf(getIntent().getBooleanExtra("anonymous", false) ? 1 : 0)));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((odk) this.f17565e).m163680m(menu) || super.onCreateOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_alter_group_state";
    }
}
