package com.p000p1.mobile.putong.core.p001ui.mediapreview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import l.dbl0;
import l.ib1;
import l.rzb0;
import l.w0c0;
import p003l.hk5;
import p003l.ik5;
import p003l.vk80;
import p003l.ypd;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CommonMediaPreviewAct extends PutongMvpAct<hk5, ik5> {

    /* JADX INFO: renamed from: e */
    public vk80 f538e;

    /* JADX INFO: renamed from: f */
    public ik5 f539f;

    /* JADX INFO: renamed from: g */
    public hk5 f540g;

    /* JADX INFO: renamed from: Y1 */
    private boolean m868Y1() {
        return CoreModule.o.d().hi(((Act) this).act);
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Intent m869Z1(Context context, String str, ArrayList<String> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CommonMediaPreviewAct.class);
        intent.putExtra("current_data", str);
        intent.putStringArrayListExtra("all_data", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public hk5 m870V1() {
        hk5 hk5Var = new hk5(this);
        this.f540g = hk5Var;
        return hk5Var;
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ik5 m871X1() {
        this.f538e = new ypd(this);
        ik5 ik5Var = new ik5(this);
        this.f539f = ik5Var;
        ik5Var.m5140i(this.f538e);
        this.f539f.m5139f(this.f538e);
        return this.f539f;
    }

    /* JADX INFO: renamed from: c2 */
    public void m874c2() {
        vk80 vk80Var = this.f538e;
        if (vk80Var != null) {
            vk80Var.mo8153a(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        setResult(-1);
        super/*com.p1.mobile.android.app.Act*/.finish();
        ib1.b().a("CommonMediaPreviewAdapter");
        ib1.b().e("CommonMediaPreviewAdapter");
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.a, rzb0.b);
    }

    public void onDestroyLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onDestroyLifecycle();
        if (m868Y1()) {
            dbl0.a(((Act) this).act.getWindow().getDecorView(), true);
        }
    }

    public void onPauseLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onPauseLifecycle();
        if (m868Y1()) {
            dbl0.a(((Act) this).act.getWindow().getDecorView(), false);
        }
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        dimStatusBar(true);
        setStatusBarColor(getResources().getColor(w0c0.V1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.c, rzb0.d);
    }
}
