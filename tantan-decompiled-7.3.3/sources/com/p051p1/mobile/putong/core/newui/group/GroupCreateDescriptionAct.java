package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.p051p1.mobile.putong.data.Picture;
import p153l.bfk;
import p153l.xek;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateDescriptionAct extends PutongCoreMvpAct<xek, bfk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m37545a2(@NonNull Context context, @NonNull GroupCreate groupCreate, @NonNull Picture picture) {
        return new Intent(context, (Class<?>) GroupCreateDescriptionAct.class).putExtra("group_create", groupCreate).putExtra("picture", picture);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public xek mo30949Y1() {
        return new xek(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public bfk mo30950Z1() {
        return new bfk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_add_group_state";
    }
}
