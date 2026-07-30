package com.p046p1.mobile.putong.core.p053ui.marry.status;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.j760;
import p149l.q2x;
import p149l.u2x;

/* JADX INFO: loaded from: classes3.dex */
public class MarryStatusSetAct extends PutongCoreMvpAct<q2x, u2x> {

    /* JADX INFO: renamed from: f */
    public boolean f30466f;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m47552Z1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MarryStatusSetAct.class);
        intent.putExtra("from_sign_up", z);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public q2x mo29951X1() {
        return new q2x(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public u2x mo29952Y1() {
        return new u2x(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        Intent intent = getIntent();
        if (NullChecker.m81303a(intent)) {
            this.f30466f = intent.getBooleanExtra("from_sign_up", false);
        }
        super.initDataOnCreate();
        this.pageHelper.m109041q("p_edit_dating_purpose");
        this.pageHelper.m109040p(j760.m140076a("edit_specific_profile_show_from", "register"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_dating_purpose";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setStatusBarColor(0);
    }
}
