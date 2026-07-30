package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.rnk;
import p153l.tnk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSettingMemberManagerAct extends PutongCoreMvpAct<rnk, tnk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50322a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupSettingMemberManagerAct.class);
        intent.putExtra(GroupSettingManagerAct.f32650f, str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public rnk mo30949Y1() {
        return new rnk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public tnk mo30950Z1() {
        return new tnk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_group_chat_member_manage";
    }
}
