package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.bnk;
import p153l.h39;
import p153l.hmk;
import p153l.jek;
import p153l.jyb;
import p153l.l4g0;
import p153l.pf60;
import p153l.prp0;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSetAct extends PutongCoreMvpAct<hmk, bnk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50308a2(Context context, String str, String str2) {
        if (h39.m133423L()) {
            String strM173531j = prp0.m173528i().m173531j(context, "Group_settings");
            if (!TextUtils.isEmpty(strM173531j)) {
                return WebViewAct.m81348b2(context, "", strM173531j + "?groupId=" + str2 + "&pageId=Group_settings", true);
            }
        }
        Intent intent = new Intent(context, (Class<?>) GroupSetAct.class);
        intent.putExtra("conversation_id", str);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public hmk mo30949Y1() {
        return new hmk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public bnk mo30950Z1() {
        return new bnk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String stringExtra = getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        ChatGroup chatGroupM32889h7 = CoreModule.f18264c.f20387g0.m32889h7(stringExtra);
        boolean zM82486a = NullChecker.m82486a(chatGroupM32889h7);
        l4g0 l4g0Var = this.pageHelper;
        if (zM82486a) {
            l4g0Var.m152781p(pf60.m172085a("groupchat_id", stringExtra), pf60.m172085a("is_anonymou_group", Integer.valueOf(jek.m144587s(chatGroupM32889h7) ? 1 : 0)));
        } else {
            l4g0Var.m152781p(pf60.m172085a("groupchat_id", stringExtra), pf60.m172085a("is_anonymou_group", 0));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        ((hmk) this.f18283d).m135920i1(list);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_group_chat_settings";
    }
}
