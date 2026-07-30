package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import java.io.Serializable;
import l.j760;
import l.lip0;
import l.y19;
import p003l.chk;
import p003l.sgk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupProfileAct extends PutongCoreMvpAct<sgk, chk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2214Z1(Context context, String str, ChatGroup chatGroup, boolean z) {
        String str2;
        if (y19.L()) {
            String strJ = lip0.i().j(context, "Group_Detail");
            if (!TextUtils.isEmpty(strJ)) {
                if (z) {
                    str2 = strJ + "?from=deeplink&groupId=" + str + "&pageId=Group_Detail";
                } else {
                    str2 = strJ + "?groupId=" + str + "&pageId=Group_Detail";
                }
                Intent intentA2 = WebViewAct.a2(context, "", str2, true);
                intentA2.putExtra("hideNavigationBar", true);
                return intentA2;
            }
        }
        Intent intent = new Intent(context, (Class<?>) GroupProfileAct.class);
        intent.putExtra("group_id", str);
        intent.putExtra("chat_group", (Serializable) chatGroup);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public sgk m2215X1() {
        return new sgk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public chk m2216Y1() {
        return new chk(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("groupchat_id", getIntent().getStringExtra("group_id"))});
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ((chk) ((PutongCoreMvpAct) this).e).m3324n0(menu);
        return true;
    }

    public String pageId() {
        return "p_group_information";
    }
}
