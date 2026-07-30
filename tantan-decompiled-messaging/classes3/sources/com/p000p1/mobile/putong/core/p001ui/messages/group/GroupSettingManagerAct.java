package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p003l.tkk;
import p003l.xkk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupSettingManagerAct extends PutongCoreMvpAct<tkk, xkk> {

    /* JADX INFO: renamed from: f */
    public static String f1693f = "ext_group_id";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m2249Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupSettingManagerAct.class);
        intent.putExtra(f1693f, str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public tkk m2250X1() {
        return new tkk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public xkk m2251Y1() {
        return new xkk(this);
    }

    public String pageId() {
        return "p_group_chat_manage";
    }
}
