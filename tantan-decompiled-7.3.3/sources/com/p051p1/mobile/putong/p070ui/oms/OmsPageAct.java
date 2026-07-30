package com.p051p1.mobile.putong.p070ui.oms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.OmsMerCuryData;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p153l.dsi0;
import p153l.pf60;
import p153l.tk50;
import p153l.uk50;
import p153l.w7c0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class OmsPageAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FrameLayout f55460c;

    /* JADX INFO: renamed from: d */
    public String f55461d;

    /* JADX INFO: renamed from: e */
    public OmsMerCuryData f55462e;

    /* JADX INFO: renamed from: f */
    public boolean f55463f;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m81057Z1(Context context, String str, OmsMerCuryData omsMerCuryData, boolean z) {
        Intent intent = new Intent(context, (Class<?>) OmsPageAct.class);
        intent.putExtra("oms_identifier", str);
        intent.putExtra("oms_mercury", omsMerCuryData);
        intent.putExtra("oms_cancel_able", z);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    private void m81058b2() {
        this.f55461d = getIntent().getStringExtra("oms_identifier");
        this.f55462e = (OmsMerCuryData) getIntent().getSerializableExtra("oms_mercury");
        this.f55463f = getIntent().getBooleanExtra("oms_cancel_able", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m81059r();
    }

    /* JADX INFO: renamed from: r */
    private void m81059r() {
        if (!uk50.m196472f().m196476d(this.f55461d) || uk50.m196472f().m196477e(this.f55461d) == null) {
            lambda$debugItems$19();
            return;
        }
        m81061a2();
        uk50.m196472f().m196484m(this.f55461d, this);
        this.f55460c.removeAllViews();
        this.f55460c.addView(uk50.m196472f().m196477e(this.f55461d));
    }

    /* JADX INFO: renamed from: Y1 */
    public View m81060Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tk50.m191531b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a2 */
    public final void m81061a2() {
        View viewM196477e = uk50.m196472f().m196477e(this.f55461d);
        if (NullChecker.m82486a(viewM196477e) && NullChecker.m82486a(viewM196477e.getParent())) {
            ((ViewGroup) viewM196477e.getParent()).removeView(viewM196477e);
        }
        PutongAct putongActM196473a = uk50.m196472f().m196473a(this.f55461d);
        if (NullChecker.m82486a(putongActM196473a)) {
            putongActM196473a.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final void m81062c2() {
        this.pageHelper.m152782q(this.f55462e.f39648id);
        if (NullChecker.m82486a(this.f55462e) && NullChecker.m82486a(this.f55462e.server) && this.f55462e.server.size() > 0) {
            pf60[] pf60VarArr = new pf60[this.f55462e.server.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : this.f55462e.server.entrySet()) {
                pf60VarArr[i] = new pf60(entry.getKey(), dsi0.m117767g(entry.getValue()));
                i++;
            }
            this.pageHelper.m152781p(pf60VarArr);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        uk50.m196472f().m196483l(this.f55461d);
        overridePendingTransition(0, w7c0.f187733c);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m81060Y1(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m81058b2();
        m81062c2();
        creates(new y20() { // from class: l.sk50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169231a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f55463f) {
            super.onBackPressed();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        overridePendingTransition(w7c0.f187732b, 0);
        super.preCreateView(bundle);
    }
}
