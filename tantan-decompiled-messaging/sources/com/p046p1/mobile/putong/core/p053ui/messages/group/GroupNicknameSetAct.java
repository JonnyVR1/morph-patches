package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.lfk;
import p149l.ofk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupNicknameSetAct extends PutongCoreMvpAct<lfk, ofk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49104Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) GroupNicknameSetAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        intent.putExtra("group_member_nickname", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public lfk mo29951X1() {
        return new lfk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ofk mo29952Y1() {
        return new ofk(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((ofk) this.f17565e).m164090q(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_my_alias_in_group";
    }
}
