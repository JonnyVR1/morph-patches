package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p003l.blk;
import p003l.dlk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupSettingMemberManagerAct extends PutongCoreMvpAct<blk, dlk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2254Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupSettingMemberManagerAct.class);
        intent.putExtra(GroupSettingManagerAct.f1693f, str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public blk m2255X1() {
        return new blk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dlk m2256Y1() {
        return new dlk(this);
    }

    public String pageId() {
        return "p_group_chat_member_manage";
    }
}
