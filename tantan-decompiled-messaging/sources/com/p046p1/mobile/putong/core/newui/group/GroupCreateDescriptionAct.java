package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.p046p1.mobile.putong.data.Picture;
import p149l.hck;
import p149l.lck;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateDescriptionAct extends PutongCoreMvpAct<hck, lck> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m36542Z1(@NonNull Context context, @NonNull GroupCreate groupCreate, @NonNull Picture picture) {
        return new Intent(context, (Class<?>) GroupCreateDescriptionAct.class).putExtra("group_create", groupCreate).putExtra("picture", picture);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public hck mo29951X1() {
        return new hck(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public lck mo29952Y1() {
        return new lck(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_add_group_state";
    }
}
