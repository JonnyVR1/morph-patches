package com.p000p1.mobile.putong.core.p001ui.marry.audit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import l.j760;
import p003l.jzw;
import p003l.qzw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryInfoAuditStatusAct extends PutongCoreMvpAct<jzw, qzw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m440Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MarryInfoAuditStatusAct.class);
        intent.putExtra("page_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static void m441c2(Intent intent) {
        intent.putExtra("open_home", true);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jzw m442X1() {
        return new jzw(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public qzw m443Y1() {
        return new qzw(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("page_from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "mode_switching";
        }
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("source", stringExtra)});
    }

    public String pageId() {
        return "p_marriage_intro";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setTransparentStatusBar();
        setStatusBarColor(0);
    }
}
