package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.oj0;
import p149l.pj0;
import p149l.upa;

/* JADX INFO: loaded from: classes11.dex */
public class AllPairsAct extends PutongCoreMvpAct<oj0, pj0> {

    /* JADX INFO: renamed from: f */
    public static String f24582f = "ext_from";

    /* JADX INFO: renamed from: g */
    public static String f24583g = "from_new_message_tab";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m40532Z1(Context context) {
        return m40533a2(context, "");
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m40533a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AllPairsAct.class);
        intent.putExtra(f24582f, str);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static void m40534d2(Context context) {
        context.startActivity(m40532Z1(context));
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public oj0 mo29951X1() {
        return new oj0(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pj0 mo29952Y1() {
        return new pj0(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (upa.m194625D3() || upa.m194630E3()) {
            CoreModule.f17545c.f19642f0.m33077pe();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return TextUtils.equals(act().getIntent().getStringExtra(f24582f), f24583g) ? "p_nochat_match" : "p_all_matches";
    }
}
