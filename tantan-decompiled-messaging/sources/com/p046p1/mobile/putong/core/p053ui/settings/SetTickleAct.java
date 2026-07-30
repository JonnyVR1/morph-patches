package com.p046p1.mobile.putong.core.p053ui.settings;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.a1c0;
import p149l.kme0;
import p149l.pme0;

/* JADX INFO: loaded from: classes9.dex */
public class SetTickleAct extends PutongCoreMvpAct<kme0, pme0> {

    /* JADX INFO: renamed from: f */
    public boolean f35853f = false;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m55030Z1(Context context, String str) {
        return m55031a2(context, str, false);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m55031a2(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SetTickleAct.class);
        intent.putExtra("clap_user_id", str);
        intent.putExtra("white_title_bar", z);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public kme0 mo29951X1() {
        return new kme0(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pme0 mo29952Y1() {
        return new pme0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        if (this.f35853f) {
            toolbar().setBackgroundColor(this.act.getResources().getColor(a1c0.f67163q));
            setStatusBarColorResId(a1c0.f67163q);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        ((pme0) this.f17565e).m170312k();
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        boolean booleanExtra = getIntent().getBooleanExtra("white_title_bar", false);
        this.f35853f = booleanExtra;
        ((kme0) this.f17564d).m146528u0(booleanExtra);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((pme0) this.f17565e).m170315q(menu);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_my_tickle";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (this.f35853f) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
