package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.GroupAttribute;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import java.util.ArrayList;
import java.util.List;
import p149l.bdk;
import p149l.fdk;
import p149l.lip0;
import p149l.y19;

/* JADX INFO: loaded from: classes11.dex */
public class GroupCreateTypeAct extends PutongCoreMvpAct<bdk, fdk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m36548Z1(@NonNull Context context, @NonNull List<GroupAttribute> list) {
        if (y19.m212152L()) {
            String str = list.get(0).creationType.selectable ? "Group_created" : "Group_groupcategory";
            String strM149930j = lip0.m149927i().m149930j(context, str);
            if (!TextUtils.isEmpty(strM149930j)) {
                return WebViewAct.m80165a2(context, "", strM149930j + "?pageId=" + str, true);
            }
        }
        return new Intent(context, (Class<?>) GroupCreateTypeAct.class).putExtra("group_attributes", new ArrayList(list));
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bdk mo29951X1() {
        return new bdk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public fdk mo29952Y1() {
        return new fdk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 257 && i2 == -1) {
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_select_group_type_step_one";
    }
}
