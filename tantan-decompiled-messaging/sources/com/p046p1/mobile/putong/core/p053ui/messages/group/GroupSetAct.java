package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.cwf0;
import p149l.j760;
import p149l.lip0;
import p149l.lkk;
import p149l.rjk;
import p149l.tbk;
import p149l.vwb;
import p149l.y19;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSetAct extends PutongCoreMvpAct<rjk, lkk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49125Z1(Context context, String str, String str2) {
        if (y19.m212152L()) {
            String strM149930j = lip0.m149927i().m149930j(context, "Group_settings");
            if (!TextUtils.isEmpty(strM149930j)) {
                return WebViewAct.m80165a2(context, "", strM149930j + "?groupId=" + str2 + "&pageId=Group_settings", true);
            }
        }
        Intent intent = new Intent(context, (Class<?>) GroupSetAct.class);
        intent.putExtra("conversation_id", str);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rjk mo29951X1() {
        return new rjk(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public lkk mo29952Y1() {
        return new lkk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String stringExtra = getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        ChatGroup chatGroupM31886h7 = CoreModule.f17545c.f19645g0.m31886h7(stringExtra);
        boolean zM81303a = NullChecker.m81303a(chatGroupM31886h7);
        cwf0 cwf0Var = this.pageHelper;
        if (zM81303a) {
            cwf0Var.m109040p(j760.m140076a("groupchat_id", stringExtra), j760.m140076a("is_anonymou_group", Integer.valueOf(tbk.m187872s(chatGroupM31886h7) ? 1 : 0)));
        } else {
            cwf0Var.m109040p(j760.m140076a("groupchat_id", stringExtra), j760.m140076a("is_anonymou_group", 0));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        ((rjk) this.f17564d).m179655i1(list);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_group_chat_settings";
    }
}
