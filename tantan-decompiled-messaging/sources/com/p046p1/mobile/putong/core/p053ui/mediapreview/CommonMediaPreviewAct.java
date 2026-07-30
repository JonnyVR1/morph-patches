package com.p046p1.mobile.putong.core.p053ui.mediapreview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.ArrayList;
import p149l.dbl0;
import p149l.hk5;
import p149l.ib1;
import p149l.ik5;
import p149l.rzb0;
import p149l.vk80;
import p149l.w0c0;
import p149l.ypd;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class CommonMediaPreviewAct extends PutongMvpAct<hk5, ik5> {

    /* JADX INFO: renamed from: e */
    public vk80 f30647e;

    /* JADX INFO: renamed from: f */
    public ik5 f30648f;

    /* JADX INFO: renamed from: g */
    public hk5 f30649g;

    /* JADX INFO: renamed from: Y1 */
    private boolean m47804Y1() {
        return CoreModule.f17557o.m195057d().mo33845hi(this.act);
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Intent m47805Z1(Context context, String str, ArrayList<String> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CommonMediaPreviewAct.class);
        intent.putExtra("current_data", str);
        intent.putStringArrayListExtra("all_data", arrayList);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public hk5 mo28672V1() {
        hk5 hk5Var = new hk5(this);
        this.f30649g = hk5Var;
        return hk5Var;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ik5 mo28673X1() {
        this.f30647e = new ypd(this);
        ik5 ik5Var = new ik5(this);
        this.f30648f = ik5Var;
        ik5Var.m136771i(this.f30647e);
        this.f30648f.m136770f(this.f30647e);
        return this.f30648f;
    }

    /* JADX INFO: renamed from: c2 */
    public void m47808c2() {
        vk80 vk80Var = this.f30647e;
        if (vk80Var != null) {
            vk80Var.mo194147a(false);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        setResult(-1);
        super.lambda$debugItems$19();
        ib1.m135233b().mo135234a("CommonMediaPreviewAdapter");
        ib1.m135233b().mo135237e("CommonMediaPreviewAdapter");
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.f161629a, rzb0.f161630b);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        if (m47804Y1()) {
            dbl0.m110646a(this.act.getWindow().getDecorView(), true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        if (m47804Y1()) {
            dbl0.m110646a(this.act.getWindow().getDecorView(), false);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        dimStatusBar(true);
        setStatusBarColor(getResources().getColor(w0c0.f183814V1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.f161631c, rzb0.f161632d);
    }
}
