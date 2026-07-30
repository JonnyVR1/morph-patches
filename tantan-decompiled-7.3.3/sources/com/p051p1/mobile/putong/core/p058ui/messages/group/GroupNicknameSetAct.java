package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.bik;
import p153l.eik;

/* JADX INFO: loaded from: classes3.dex */
public class GroupNicknameSetAct extends PutongCoreMvpAct<bik, eik> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50287a2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) GroupNicknameSetAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        intent.putExtra("group_member_nickname", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public bik mo30949Y1() {
        return new bik(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public eik mo30950Z1() {
        return new eik(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((eik) this.f18284e).m120931q(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_my_alias_in_group";
    }
}
