package com.p000p1.mobile.putong.core.p004ui.settings;

import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import com.p000p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.android.app.Act;
import l.a1c0;
import p006l.kme0;
import p006l.pme0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SetTickleAct extends PutongCoreMvpAct<kme0, pme0> {

    /* JADX INFO: renamed from: f */
    public boolean f5634f = false;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m8396Z1(Context context, String str) {
        return m8397a2(context, str, false);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m8397a2(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SetTickleAct.class);
        intent.putExtra("clap_user_id", str);
        intent.putExtra("white_title_bar", z);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public kme0 mo1879X1() {
        return new kme0(this);
    }

    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public pme0 mo1880Y1() {
        return new pme0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        if (this.f5634f) {
            toolbar().setBackgroundColor(((Act) this).act.getResources().getColor(a1c0.q));
            setStatusBarColorResId(a1c0.q);
        }
    }

    public void finish() {
        ((pme0) this.f1554e).m21604k();
        super.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.PutongCoreMvpAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        boolean booleanExtra = getIntent().getBooleanExtra("white_title_bar", false);
        this.f5634f = booleanExtra;
        ((kme0) this.f1553d).m18212u0(booleanExtra);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ((pme0) this.f1554e).m21607q(menu);
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_my_tickle";
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void setTheme() {
        super.setTheme();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (this.f5634f) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
