package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.GroupCreate;
import com.p1.mobile.putong.data.Picture;
import java.io.Serializable;
import p009l.hck;
import p009l.lck;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupCreateDescriptionAct extends PutongCoreMvpAct<hck, lck> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m473Z1(@NonNull Context context, @NonNull GroupCreate groupCreate, @NonNull Picture picture) {
        return new Intent(context, (Class<?>) GroupCreateDescriptionAct.class).putExtra("group_create", (Serializable) groupCreate).putExtra("picture", (Serializable) picture);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public hck m474X1() {
        return new hck(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public lck m475Y1() {
        return new lck(this);
    }

    public String pageId() {
        return "p_add_group_state";
    }
}
