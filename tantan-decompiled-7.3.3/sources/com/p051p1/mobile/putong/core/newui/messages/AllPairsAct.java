package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.gra;
import p153l.kj0;
import p153l.lj0;

/* JADX INFO: loaded from: classes11.dex */
public class AllPairsAct extends PutongCoreMvpAct<kj0, lj0> {

    /* JADX INFO: renamed from: f */
    public static String f25324f = "ext_from";

    /* JADX INFO: renamed from: g */
    public static String f25325g = "from_new_message_tab";

    /* JADX INFO: renamed from: a2 */
    public static Intent m41543a2(Context context) {
        return m41544b2(context, "");
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m41544b2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AllPairsAct.class);
        intent.putExtra(f25324f, str);
        return intent;
    }

    /* JADX INFO: renamed from: e2 */
    public static void m41545e2(Context context) {
        context.startActivity(m41543a2(context));
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public kj0 mo30949Y1() {
        return new kj0(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public lj0 mo30950Z1() {
        return new lj0(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (gra.m131556D3() || gra.m131561E3()) {
            CoreModule.f18264c.f20384f0.m34080pe();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return TextUtils.equals(act().getIntent().getStringExtra(f25324f), f25325g) ? "p_nochat_match" : "p_all_matches";
    }
}
