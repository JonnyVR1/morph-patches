package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.shk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupRemoveMemberAct extends PutongCoreMvpAct<shk, C8529b> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49110Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupRemoveMemberAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public shk mo29951X1() {
        return new shk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C8529b mo29952Y1() {
        return new C8529b(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((C8529b) this.f17565e).m49161j(menu);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_delete_group_person";
    }
}
