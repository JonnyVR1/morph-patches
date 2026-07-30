package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p003l.lfk;
import p003l.ofk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupNicknameSetAct extends PutongCoreMvpAct<lfk, ofk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2209Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) GroupNicknameSetAct.class);
        intent.putExtra("group_id", str);
        intent.putExtra("group_member_nickname", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public lfk m2210X1() {
        return new lfk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ofk m2211Y1() {
        return new ofk(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return ((ofk) ((PutongCoreMvpAct) this).e).m6640q(menu);
    }

    public String pageId() {
        return "p_edit_my_alias_in_group";
    }
}
