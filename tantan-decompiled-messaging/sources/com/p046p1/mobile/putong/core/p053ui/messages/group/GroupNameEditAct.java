package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.afk;
import p149l.dfk;
import p149l.j760;

/* JADX INFO: loaded from: classes3.dex */
public class GroupNameEditAct extends PutongCoreMvpAct<afk, dfk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49101Z1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GroupNameEditAct.class);
        intent.putExtra("group_Id", str);
        intent.putExtra("group_name", str2);
        intent.putExtra("anonymous", z);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public afk mo29951X1() {
        return new afk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dfk mo29952Y1() {
        return new dfk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m109040p(j760.m140076a("is_anonymou_group", Integer.valueOf(getIntent().getBooleanExtra("anonymous", false) ? 1 : 0)));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((dfk) this.f17565e).m111488q(menu) || super.onCreateOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_alter_group_name";
    }
}
