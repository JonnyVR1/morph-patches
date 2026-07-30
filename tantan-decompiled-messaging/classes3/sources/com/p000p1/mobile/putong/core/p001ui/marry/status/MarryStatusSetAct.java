package com.p000p1.mobile.putong.core.p001ui.marry.status;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import p003l.q2x;
import p003l.u2x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryStatusSetAct extends PutongCoreMvpAct<q2x, u2x> {

    /* JADX INFO: renamed from: f */
    public boolean f357f;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m604Z1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MarryStatusSetAct.class);
        intent.putExtra("from_sign_up", z);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public q2x m605X1() {
        return new q2x(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public u2x m606Y1() {
        return new u2x(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        Intent intent = getIntent();
        if (NullChecker.a(intent)) {
            this.f357f = intent.getBooleanExtra("from_sign_up", false);
        }
        super.initDataOnCreate();
        ((PutongAct) this).pageHelper.q("p_edit_dating_purpose");
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("edit_specific_profile_show_from", "register")});
    }

    public String pageId() {
        return "p_edit_dating_purpose";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setTransparentStatusBar();
        setStatusBarColor(0);
    }
}
