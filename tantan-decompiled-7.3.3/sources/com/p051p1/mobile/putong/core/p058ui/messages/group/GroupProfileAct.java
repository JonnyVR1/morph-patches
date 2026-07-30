package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p153l.h39;
import p153l.ijk;
import p153l.pf60;
import p153l.prp0;
import p153l.sjk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupProfileAct extends PutongCoreMvpAct<ijk, sjk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50290a2(Context context, String str, ChatGroup chatGroup, boolean z) {
        String str2;
        if (h39.m133423L()) {
            String strM173531j = prp0.m173528i().m173531j(context, "Group_Detail");
            if (!TextUtils.isEmpty(strM173531j)) {
                if (z) {
                    str2 = strM173531j + "?from=deeplink&groupId=" + str + "&pageId=Group_Detail";
                } else {
                    str2 = strM173531j + "?groupId=" + str + "&pageId=Group_Detail";
                }
                Intent intentM81348b2 = WebViewAct.m81348b2(context, "", str2, true);
                intentM81348b2.putExtra("hideNavigationBar", true);
                return intentM81348b2;
            }
        }
        Intent intent = new Intent(context, (Class<?>) GroupProfileAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        intent.putExtra("chat_group", chatGroup);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ijk mo30949Y1() {
        return new ijk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public sjk mo30950Z1() {
        return new sjk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m152781p(pf60.m172085a("groupchat_id", getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID)));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((sjk) this.f18284e).m186158n0(menu);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_group_information";
    }
}
