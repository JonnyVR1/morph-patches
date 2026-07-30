package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.utils.NullChecker;
import p153l.chk;
import p153l.jek;
import p153l.jyb;
import p153l.l4g0;
import p153l.pf60;
import p153l.zgk;

/* JADX INFO: loaded from: classes3.dex */
public class GroupMembersAct extends PutongCoreMvpAct<zgk, chk> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50281a2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) GroupMembersAct.class);
        intent.putExtra("conversation_id", str);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public zgk mo30949Y1() {
        return new zgk(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public chk mo30950Z1() {
        return new chk(this);
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
            l4g0Var.m152781p(jyb.m147494Y("groupchat_id", stringExtra), pf60.m172085a("is_anonymou_group", Integer.valueOf(jek.m144587s(chatGroupM32889h7) ? 1 : 0)));
        } else {
            l4g0Var.m152781p(jyb.m147494Y("groupchat_id", stringExtra), pf60.m172085a("is_anonymou_group", 0));
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((chk) this.f18284e).m109830j(menu);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_group_members";
    }
}
