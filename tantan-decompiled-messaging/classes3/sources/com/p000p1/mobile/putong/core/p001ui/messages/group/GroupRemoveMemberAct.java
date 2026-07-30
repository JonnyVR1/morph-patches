package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p003l.shk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupRemoveMemberAct extends PutongCoreMvpAct<shk, C0112b> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2219Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupRemoveMemberAct.class);
        intent.putExtra("group_id", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public shk m2220X1() {
        return new shk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C0112b m2221Y1() {
        return new C0112b(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ((C0112b) ((PutongCoreMvpAct) this).e).m2280j(menu);
        return true;
    }

    public String pageId() {
        return "p_delete_group_person";
    }
}
