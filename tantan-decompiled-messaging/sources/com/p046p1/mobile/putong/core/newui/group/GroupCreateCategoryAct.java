package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.GroupAttribute;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.vwb;
import p149l.wbk;
import p149l.zbk;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateCategoryAct extends PutongCoreMvpAct<wbk, zbk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m36538Z1(@NonNull Context context, @NonNull List<GroupAttribute> list, @Nullable GroupCreate groupCreate) {
        Intent intentPutExtra = new Intent(context, (Class<?>) GroupCreateCategoryAct.class).putExtra("group_attributes", new ArrayList(list));
        if (NullChecker.m81303a(groupCreate)) {
            intentPutExtra.putExtra("group_create", groupCreate);
        }
        return intentPutExtra;
    }

    /* JADX INFO: renamed from: a2 */
    public static boolean m36539a2(@Nullable List<GroupAttribute> list) {
        if (vwb.m200296J(list)) {
            return false;
        }
        GroupAttribute groupAttribute = list.get(0);
        return NullChecker.m81303a(groupAttribute.creationLimit) && groupAttribute.creationLimit.groupRemaining > 0;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wbk mo29951X1() {
        return new wbk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public zbk mo29952Y1() {
        return new zbk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            setResult(-1);
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_select_group_type";
    }
}
