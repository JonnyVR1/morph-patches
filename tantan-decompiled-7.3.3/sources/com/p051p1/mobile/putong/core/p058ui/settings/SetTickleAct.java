package com.p051p1.mobile.putong.core.p058ui.settings;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.g9c0;
import p153l.pue0;
import p153l.uue0;

/* JADX INFO: loaded from: classes12.dex */
public class SetTickleAct extends PutongCoreMvpAct<pue0, uue0> {

    /* JADX INFO: renamed from: f */
    public boolean f36701f = false;

    /* JADX INFO: renamed from: a2 */
    public static Intent m56213a2(Context context, String str) {
        return m56214b2(context, str, false);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m56214b2(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SetTickleAct.class);
        intent.putExtra("clap_user_id", str);
        intent.putExtra("white_title_bar", z);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pue0 mo30949Y1() {
        return new pue0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        if (this.f36701f) {
            toolbar().setBackgroundColor(this.act.getResources().getColor(g9c0.f102827q));
            setStatusBarColorResId(g9c0.f102827q);
        }
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public uue0 mo30950Z1() {
        return new uue0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        ((uue0) this.f18284e).m198185k();
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        boolean booleanExtra = getIntent().getBooleanExtra("white_title_bar", false);
        this.f36701f = booleanExtra;
        ((pue0) this.f18283d).m173879u0(booleanExtra);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ((uue0) this.f18284e).m198188q(menu);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_my_tickle";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (this.f36701f) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
