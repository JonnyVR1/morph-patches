package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.GroupAttribute;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.jyb;
import p153l.mek;
import p153l.pek;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateCategoryAct extends PutongCoreMvpAct<mek, pek> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m37541a2(@NonNull Context context, @NonNull List<GroupAttribute> list, @Nullable GroupCreate groupCreate) {
        Intent intentPutExtra = new Intent(context, (Class<?>) GroupCreateCategoryAct.class).putExtra("group_attributes", new ArrayList(list));
        if (NullChecker.m82486a(groupCreate)) {
            intentPutExtra.putExtra("group_create", groupCreate);
        }
        return intentPutExtra;
    }

    /* JADX INFO: renamed from: b2 */
    public static boolean m37542b2(@Nullable List<GroupAttribute> list) {
        if (jyb.m147479J(list)) {
            return false;
        }
        GroupAttribute groupAttribute = list.get(0);
        return NullChecker.m82486a(groupAttribute.creationLimit) && groupAttribute.creationLimit.groupRemaining > 0;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public mek mo30949Y1() {
        return new mek(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public pek mo30950Z1() {
        return new pek(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            setResult(-1);
            lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_select_group_type";
    }
}
