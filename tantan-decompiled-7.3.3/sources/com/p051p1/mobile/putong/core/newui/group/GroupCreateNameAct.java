package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.ffk;
import p153l.pfk;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateNameAct extends PutongCoreMvpAct<ffk, pfk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m37548a2(@NonNull Context context, @NonNull GroupCreate groupCreate) {
        return new Intent(context, (Class<?>) GroupCreateNameAct.class).putExtra("group_create", groupCreate);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ffk mo30949Y1() {
        return new ffk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pfk mo30950Z1() {
        return new pfk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            setResult(-1);
            m68056e2();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        super.onPickImagesResult(list);
        if (NullChecker.m82486a(this.f18283d)) {
            ((ffk) this.f18283d).m125399o0(list);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_add_group_photo_and_name";
    }
}
