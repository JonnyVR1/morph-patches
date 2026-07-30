package com.p051p1.mobile.putong.core.p058ui.mediapreview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import p153l.c9c0;
import p153l.hkl0;
import p153l.il5;
import p153l.jl5;
import p153l.pb1;
import p153l.prd;
import p153l.x7c0;
import p153l.zs80;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class CommonMediaPreviewAct extends PutongMvpAct<il5, jl5> {

    /* JADX INFO: renamed from: e */
    public zs80 f31495e;

    /* JADX INFO: renamed from: f */
    public jl5 f31496f;

    /* JADX INFO: renamed from: g */
    public il5 f31497g;

    /* JADX INFO: renamed from: Z1 */
    private boolean m48987Z1() {
        return CoreModule.f18276o.m132214d().mo34848hi(this.act);
    }

    /* JADX INFO: renamed from: a2 */
    public static final Intent m48988a2(Context context, String str, ArrayList<String> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CommonMediaPreviewAct.class);
        intent.putExtra("current_data", str);
        intent.putStringArrayListExtra("all_data", arrayList);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public il5 mo29671X1() {
        il5 il5Var = new il5(this);
        this.f31497g = il5Var;
        return il5Var;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public jl5 mo29672Y1() {
        this.f31495e = new prd(this);
        jl5 jl5Var = new jl5(this);
        this.f31496f = jl5Var;
        jl5Var.m145946i(this.f31495e);
        this.f31496f.m145945f(this.f31495e);
        return this.f31496f;
    }

    /* JADX INFO: renamed from: d2 */
    public void m48991d2() {
        zs80 zs80Var = this.f31495e;
        if (zs80Var != null) {
            zs80Var.mo173441a(false);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        setResult(-1);
        super.lambda$debugItems$19();
        pb1.m171472b().mo171473a("CommonMediaPreviewAdapter");
        pb1.m171472b().mo171476e("CommonMediaPreviewAdapter");
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(x7c0.f192686a, x7c0.f192687b);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        if (m48987Z1()) {
            hkl0.m135638a(this.act.getWindow().getDecorView(), true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        if (m48987Z1()) {
            hkl0.m135638a(this.act.getWindow().getDecorView(), false);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        dimStatusBar(true);
        setStatusBarColor(getResources().getColor(c9c0.f80386W1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(x7c0.f192688c, x7c0.f192689d);
    }
}
