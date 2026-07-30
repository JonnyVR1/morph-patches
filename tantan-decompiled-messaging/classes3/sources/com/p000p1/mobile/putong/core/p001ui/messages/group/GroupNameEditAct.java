package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import l.j760;
import p003l.afk;
import p003l.dfk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupNameEditAct extends PutongCoreMvpAct<afk, dfk> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2204Z1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GroupNameEditAct.class);
        intent.putExtra("group_Id", str);
        intent.putExtra("group_name", str2);
        intent.putExtra("anonymous", z);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public afk m2205X1() {
        return new afk(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dfk m2206Y1() {
        return new dfk(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("is_anonymou_group", Integer.valueOf(getIntent().getBooleanExtra("anonymous", false) ? 1 : 0))});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((dfk) ((PutongCoreMvpAct) this).e).m3549q(menu) || super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    public String pageId() {
        return "p_alter_group_name";
    }
}
