package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p149l.chk;
import p149l.j760;
import p149l.lip0;
import p149l.sgk;
import p149l.y19;

/* JADX INFO: loaded from: classes3.dex */
public class GroupProfileAct extends PutongCoreMvpAct<sgk, chk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49107Z1(Context context, String str, ChatGroup chatGroup, boolean z) {
        String str2;
        if (y19.m212152L()) {
            String strM149930j = lip0.m149927i().m149930j(context, "Group_Detail");
            if (!TextUtils.isEmpty(strM149930j)) {
                if (z) {
                    str2 = strM149930j + "?from=deeplink&groupId=" + str + "&pageId=Group_Detail";
                } else {
                    str2 = strM149930j + "?groupId=" + str + "&pageId=Group_Detail";
                }
                Intent intentM80165a2 = WebViewAct.m80165a2(context, "", str2, true);
                intentM80165a2.putExtra("hideNavigationBar", true);
                return intentM80165a2;
            }
        }
        Intent intent = new Intent(context, (Class<?>) GroupProfileAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        intent.putExtra("chat_group", chatGroup);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public sgk mo29951X1() {
        return new sgk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public chk mo29952Y1() {
        return new chk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m109040p(j760.m140076a("groupchat_id", getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID)));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((chk) this.f17565e).m106958n0(menu);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_group_information";
    }
}
