package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.j9c0;
import p153l.jyb;
import p153l.jz20;
import p153l.mw20;
import p153l.psd0;
import p153l.ww20;
import p153l.y20;
import p153l.z7c0;

/* JADX INFO: loaded from: classes12.dex */
public class NewFilterAct extends PutongMvpAct<mw20, ww20> {

    /* JADX INFO: renamed from: e */
    public int f36968e = 0;

    /* JADX INFO: renamed from: f */
    public String f36969f = "user_click";

    /* JADX INFO: renamed from: a2 */
    public static Intent m56606a2(Act act, String str) {
        return m56607b2(act, str, 0);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m56607b2(Act act, String str, int i) {
        Intent intent = new Intent(act, (Class<?>) NewFilterAct.class);
        intent.putExtra("filterPageFrom", str);
        intent.putExtra("scrollWhenShow", i);
        return intent;
    }

    /* JADX INFO: renamed from: g2 */
    private void m56608g2() {
        ((ww20) this.f17892d).m208134J(this.f36968e);
    }

    /* JADX INFO: renamed from: i2 */
    private void m56609i2() {
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            ((ww20) this.f17892d).m208139O();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public mw20 mo29671X1() {
        return new mw20(this, this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public ww20 mo29672Y1() {
        return new ww20(this);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m56612e2(C4470c c4470c) {
        if (c4470c == C4470c.f16264f) {
            ((mw20) this.f17891c).m160410V0();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(z7c0.f203233b, z7c0.f203240i);
    }

    /* JADX INFO: renamed from: h2 */
    public void m56613h2(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36969f = str;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = ((ww20) this.f17892d).inflateView(layoutInflater, viewGroup);
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.iv20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117012a.m56612e2((C4470c) obj);
            }
        }));
        return viewInflateView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        lambda$debugItems$19();
        ((mw20) this.f17891c).m160412k1();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        jz20.m147633a();
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_advanced_filter_page";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(8192);
        setStatusBarColor(getResources().getColor(j9c0.f118868e));
        Intent intent = act().getIntent();
        if (intent != null) {
            m56613h2(intent.getStringExtra("filterPageFrom"));
            this.f36968e = intent.getIntExtra("scrollWhenShow", 0);
            m56608g2();
            m56609i2();
            ((mw20) this.f17891c).m160414m1(jz20.m147634b());
        }
        ((mw20) this.f17891c).m160415n1(this.f36969f);
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(CoreModule.f18264c.f20381e0.m116600p9().isVIP())), jyb.m147494Y("filter_page_show_from", this.f36969f), jyb.m147494Y("filter_page", "p_suggest_users_home_view"));
    }
}
