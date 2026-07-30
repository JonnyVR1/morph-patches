package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.GroupAttribute;
import java.util.ArrayList;
import java.util.List;
import l.lip0;
import l.y19;
import p009l.bdk;
import p009l.fdk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupCreateTypeAct extends PutongCoreMvpAct<bdk, fdk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m483Z1(@NonNull Context context, @NonNull List<GroupAttribute> list) {
        if (y19.L()) {
            String str = list.get(0).creationType.selectable ? "Group_created" : "Group_groupcategory";
            String strJ = lip0.i().j(context, str);
            if (!TextUtils.isEmpty(strJ)) {
                return WebViewAct.m10499a2(context, "", strJ + "?pageId=" + str, true);
            }
        }
        return new Intent(context, (Class<?>) GroupCreateTypeAct.class).putExtra("group_attributes", new ArrayList(list));
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bdk m484X1() {
        return new bdk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public fdk m485Y1() {
        return new fdk(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            finish();
        }
    }

    public String pageId() {
        return "p_select_group_type_step_one";
    }
}
