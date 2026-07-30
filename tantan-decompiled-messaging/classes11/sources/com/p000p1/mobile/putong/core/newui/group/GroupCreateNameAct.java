package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.GroupCreate;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.List;
import p009l.pck;
import p009l.zck;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupCreateNameAct extends PutongCoreMvpAct<pck, zck> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m478Z1(@NonNull Context context, @NonNull GroupCreate groupCreate) {
        return new Intent(context, (Class<?>) GroupCreateNameAct.class).putExtra("group_create", (Serializable) groupCreate);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public pck m479X1() {
        return new pck(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public zck m480Y1() {
        return new zck(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public void onPickImagesResult(List<Media> list) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onPickImagesResult(list);
        if (NullChecker.a(((PutongCoreMvpAct) this).d)) {
            ((pck) ((PutongCoreMvpAct) this).d).m20137o0(list);
        }
    }

    public String pageId() {
        return "p_add_group_photo_and_name";
    }
}
