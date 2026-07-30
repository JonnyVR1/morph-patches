package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.ikk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupRemoveMemberAct extends PutongCoreMvpAct<ikk, C8692b> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50293a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupRemoveMemberAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ikk mo30949Y1() {
        return new ikk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public C8692b mo30950Z1() {
        return new C8692b(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((C8692b) this.f18284e).m50344j(menu);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_delete_group_person";
    }
}
