package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.utils.NullChecker;
import p149l.cwf0;
import p149l.j760;
import p149l.jek;
import p149l.mek;
import p149l.tbk;
import p149l.vwb;

/* JADX INFO: loaded from: classes3.dex */
public class GroupMembersAct extends PutongCoreMvpAct<jek, mek> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49098Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) GroupMembersAct.class);
        intent.putExtra("conversation_id", str);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jek mo29951X1() {
        return new jek(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public mek mo29952Y1() {
        return new mek(this);
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
            cwf0Var.m109040p(vwb.m200311Y("groupchat_id", stringExtra), j760.m140076a("is_anonymou_group", Integer.valueOf(tbk.m187872s(chatGroupM31886h7) ? 1 : 0)));
        } else {
            cwf0Var.m109040p(vwb.m200311Y("groupchat_id", stringExtra), j760.m140076a("is_anonymou_group", 0));
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((mek) this.f17565e).m154232j(menu);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_group_members";
    }
}
