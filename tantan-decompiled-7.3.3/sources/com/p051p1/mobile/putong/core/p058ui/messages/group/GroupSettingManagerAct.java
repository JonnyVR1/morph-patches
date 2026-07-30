package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.jnk;
import p153l.nnk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSettingManagerAct extends PutongCoreMvpAct<jnk, nnk> {

    /* JADX INFO: renamed from: f */
    public static String f32650f = "ext_group_id";

    /* JADX INFO: renamed from: a2 */
    public static Intent m50319a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) GroupSettingManagerAct.class);
        intent.putExtra(f32650f, str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public jnk mo30949Y1() {
        return new jnk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public nnk mo30950Z1() {
        return new nnk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_group_chat_manage";
    }
}
