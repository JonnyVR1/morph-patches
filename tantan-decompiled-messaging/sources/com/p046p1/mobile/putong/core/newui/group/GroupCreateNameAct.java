package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.pck;
import p149l.zck;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateNameAct extends PutongCoreMvpAct<pck, zck> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m36545Z1(@NonNull Context context, @NonNull GroupCreate groupCreate) {
        return new Intent(context, (Class<?>) GroupCreateNameAct.class).putExtra("group_create", groupCreate);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public pck mo29951X1() {
        return new pck(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public zck mo29952Y1() {
        return new zck(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            setResult(-1);
            m66873d2();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (NullChecker.m81303a(this.f17564d)) {
            ((pck) this.f17564d).m168352o0(list);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_add_group_photo_and_name";
    }
}
