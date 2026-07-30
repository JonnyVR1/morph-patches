package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.j760;
import l.vwb;
import p003l.jek;
import p003l.mek;
import p003l.tbk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupMembersAct extends PutongCoreMvpAct<jek, mek> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2199Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) GroupMembersAct.class);
        intent.putExtra("conversation_id", str);
        intent.putExtra("group_id", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jek m2200X1() {
        return new jek(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public mek m2201Y1() {
        return new mek(this);
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
            cwf0Var.p(new j760[]{vwb.Y("groupchat_id", stringExtra), j760.a("is_anonymou_group", Integer.valueOf(tbk.m7725s(chatGroupH7) ? 1 : 0))});
        } else {
            cwf0Var.p(new j760[]{vwb.Y("groupchat_id", stringExtra), j760.a("is_anonymou_group", 0)});
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ((mek) ((PutongCoreMvpAct) this).e).m6371j(menu);
        return true;
    }

    public String pageId() {
        return "p_group_members";
    }
}
