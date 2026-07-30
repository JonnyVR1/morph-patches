package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.blk;
import p149l.dlk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSettingMemberManagerAct extends PutongCoreMvpAct<blk, dlk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49139Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupSettingMemberManagerAct.class);
        intent.putExtra(GroupSettingManagerAct.f31802f, str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public blk mo29951X1() {
        return new blk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dlk mo29952Y1() {
        return new dlk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_group_chat_member_manage";
    }
}
