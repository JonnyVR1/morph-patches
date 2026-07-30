package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.GroupAttribute;
import com.p1.mobile.putong.core.data.GroupCreate;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.vwb;
import p009l.wbk;
import p009l.zbk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupCreateCategoryAct extends PutongCoreMvpAct<wbk, zbk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m467Z1(@NonNull Context context, @NonNull List<GroupAttribute> list, @Nullable GroupCreate groupCreate) {
        Intent intentPutExtra = new Intent(context, (Class<?>) GroupCreateCategoryAct.class).putExtra("group_attributes", new ArrayList(list));
        if (NullChecker.a(groupCreate)) {
            intentPutExtra.putExtra("group_create", (Serializable) groupCreate);
        }
        return intentPutExtra;
    }

    /* JADX INFO: renamed from: a2 */
    public static boolean m468a2(@Nullable List<GroupAttribute> list) {
        if (vwb.J(list)) {
            return false;
        }
        GroupAttribute groupAttribute = list.get(0);
        return NullChecker.a(groupAttribute.creationLimit) && groupAttribute.creationLimit.groupRemaining > 0;
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wbk m469X1() {
        return new wbk(this);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public zbk m470Y1() {
        return new zbk(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public String pageId() {
        return "p_select_group_type";
    }
}
