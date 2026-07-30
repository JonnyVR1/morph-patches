package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import l.upa;
import p009l.oj0;
import p009l.pj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AllPairsAct extends PutongCoreMvpAct<oj0, pj0> {

    /* JADX INFO: renamed from: f */
    public static String f3360f = "ext_from";

    /* JADX INFO: renamed from: g */
    public static String f3361g = "from_new_message_tab";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m4623Z1(Context context) {
        return m4624a2(context, "");
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m4624a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AllPairsAct.class);
        intent.putExtra(f3360f, str);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static void m4625d2(Context context) {
        context.startActivity(m4623Z1(context));
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public oj0 m4626X1() {
        return new oj0(this);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pj0 m4627Y1() {
        return new pj0(this);
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        if (upa.D3() || upa.E3()) {
            CoreModule.c.f0.pe();
        }
    }

    public String pageId() {
        return TextUtils.equals(act().getIntent().getStringExtra(f3360f), f3361g) ? "p_nochat_match" : "p_all_matches";
    }
}
