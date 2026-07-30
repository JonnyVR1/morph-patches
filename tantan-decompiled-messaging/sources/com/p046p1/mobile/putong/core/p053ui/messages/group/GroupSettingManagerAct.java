package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.tkk;
import p149l.xkk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSettingManagerAct extends PutongCoreMvpAct<tkk, xkk> {

    /* JADX INFO: renamed from: f */
    public static String f31802f = "ext_group_id";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m49136Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupSettingManagerAct.class);
        intent.putExtra(f31802f, str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public tkk mo29951X1() {
        return new tkk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public xkk mo29952Y1() {
        return new xkk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_group_chat_manage";
    }
}
