package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.c1c0;
import p149l.co20;
import p149l.e30;
import p149l.mkd0;
import p149l.mo20;
import p149l.tzb0;
import p149l.vwb;
import p149l.zq20;

/* JADX INFO: loaded from: classes9.dex */
public class NewFilterAct extends PutongMvpAct<co20, mo20> {

    /* JADX INFO: renamed from: e */
    public int f36120e = 0;

    /* JADX INFO: renamed from: f */
    public String f36121f = "user_click";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m55423Z1(Act act, String str) {
        return m55424a2(act, str, 0);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m55424a2(Act act, String str, int i) {
        Intent intent = new Intent(act, (Class<?>) NewFilterAct.class);
        intent.putExtra("filterPageFrom", str);
        intent.putExtra("scrollWhenShow", i);
        return intent;
    }

    /* JADX INFO: renamed from: e2 */
    private void m55425e2() {
        ((mo20) this.f17173d).m155604J(this.f36120e);
    }

    /* JADX INFO: renamed from: h2 */
    private void m55426h2() {
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            ((mo20) this.f17173d).m155609O();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public co20 mo28672V1() {
        return new co20(this, this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public mo20 mo28673X1() {
        return new mo20(this);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m55429d2(C4319c c4319c) {
        if (c4319c == C4319c.f15545f) {
            ((co20) this.f17172c).m107923V0();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(tzb0.f172715b, tzb0.f172722i);
    }

    /* JADX INFO: renamed from: g2 */
    public void m55430g2(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36121f = str;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = ((mo20) this.f17173d).inflateView(layoutInflater, viewGroup);
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ym20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198956a.m55429d2((C4319c) obj);
            }
        }));
        return viewInflateView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        lambda$debugItems$19();
        ((co20) this.f17172c).m107925k1();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        zq20.m219836a();
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_advanced_filter_page";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(8192);
        setStatusBarColor(getResources().getColor(c1c0.f78248e));
        Intent intent = act().getIntent();
        if (intent != null) {
            m55430g2(intent.getStringExtra("filterPageFrom"));
            this.f36120e = intent.getIntExtra("scrollWhenShow", 0);
            m55425e2();
            m55426h2();
            ((co20) this.f17172c).m107927m1(zq20.m219837b());
        }
        ((co20) this.f17172c).m107928n1(this.f36121f);
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(CoreModule.f17545c.f19639e0.m169527p9().isVIP())), vwb.m200311Y("filter_page_show_from", this.f36121f), vwb.m200311Y("filter_page", "p_suggest_users_home_view"));
    }
}
