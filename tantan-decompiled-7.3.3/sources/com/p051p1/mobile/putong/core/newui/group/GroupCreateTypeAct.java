package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.GroupAttribute;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import java.util.ArrayList;
import java.util.List;
import p153l.h39;
import p153l.prp0;
import p153l.rfk;
import p153l.vfk;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateTypeAct extends PutongCoreMvpAct<rfk, vfk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m37551a2(@NonNull Context context, @NonNull List<GroupAttribute> list) {
        if (h39.m133423L()) {
            String str = list.get(0).creationType.selectable ? "Group_created" : "Group_groupcategory";
            String strM173531j = prp0.m173528i().m173531j(context, str);
            if (!TextUtils.isEmpty(strM173531j)) {
                return WebViewAct.m81348b2(context, "", strM173531j + "?pageId=" + str, true);
            }
        }
        return new Intent(context, (Class<?>) GroupCreateTypeAct.class).putExtra("group_attributes", new ArrayList(list));
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public rfk mo30949Y1() {
        return new rfk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public vfk mo30950Z1() {
        return new vfk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_select_group_type_step_one";
    }
}
