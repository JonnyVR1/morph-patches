package com.p051p1.mobile.putong.core.p058ui.marry.status;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.p5x;
import p153l.pf60;
import p153l.t5x;

/* JADX INFO: loaded from: classes3.dex */
public class MarryStatusSetAct extends PutongCoreMvpAct<p5x, t5x> {

    /* JADX INFO: renamed from: f */
    public boolean f31314f;

    /* JADX INFO: renamed from: a2 */
    public static Intent m48735a2(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MarryStatusSetAct.class);
        intent.putExtra("from_sign_up", z);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public p5x mo30949Y1() {
        return new p5x(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public t5x mo30950Z1() {
        return new t5x(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        Intent intent = getIntent();
        if (NullChecker.m82486a(intent)) {
            this.f31314f = intent.getBooleanExtra("from_sign_up", false);
        }
        super.initDataOnCreate();
        this.pageHelper.m152782q("p_edit_dating_purpose");
        this.pageHelper.m152781p(pf60.m172085a("edit_specific_profile_show_from", "register"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_dating_purpose";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setStatusBarColor(0);
    }
}
