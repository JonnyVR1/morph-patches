package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.j760;
import l.lip0;
import l.vwb;
import l.y19;
import p003l.lkk;
import p003l.rjk;
import p003l.tbk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupSetAct extends PutongCoreMvpAct<rjk, lkk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2236Z1(Context context, String str, String str2) {
        if (y19.L()) {
            String strJ = lip0.i().j(context, "Group_settings");
            if (!TextUtils.isEmpty(strJ)) {
                return WebViewAct.a2(context, "", strJ + "?groupId=" + str2 + "&pageId=Group_settings", true);
            }
        }
        Intent intent = new Intent(context, (Class<?>) GroupSetAct.class);
        intent.putExtra("conversation_id", str);
        intent.putExtra("group_id", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rjk m2237X1() {
        return new rjk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public lkk m2238Y1() {
        return new lkk(this);
    }

    public void checkGradientColors() {
        super/*com.p1.mobile.putong.app.PutongAct*/.checkGradientColors();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
        String stringExtra = getIntent().getStringExtra("group_id");
        ChatGroup chatGroupH7 = CoreModule.c.g0.h7(stringExtra);
        boolean zA = NullChecker.a(chatGroupH7);
        cwf0 cwf0Var = ((PutongAct) this).pageHelper;
        if (zA) {
            cwf0Var.p(new j760[]{j760.a("groupchat_id", stringExtra), j760.a("is_anonymou_group", Integer.valueOf(tbk.m7725s(chatGroupH7) ? 1 : 0))});
        } else {
            cwf0Var.p(new j760[]{j760.a("groupchat_id", stringExtra), j760.a("is_anonymou_group", 0)});
        }
    }

    public void onPickImagesResult(List<Media> list) {
        if (vwb.J(list)) {
            return;
        }
        ((rjk) ((PutongCoreMvpAct) this).d).m7341i1(list);
    }

    public String pageId() {
        return "p_group_chat_settings";
    }
}
