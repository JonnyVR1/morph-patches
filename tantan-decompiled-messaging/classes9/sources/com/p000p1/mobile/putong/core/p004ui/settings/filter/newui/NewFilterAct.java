package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import l.c1c0;
import l.e30;
import l.j760;
import l.mkd0;
import l.tzb0;
import l.vwb;
import p006l.co20;
import p006l.mo20;
import p006l.zq20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewFilterAct extends PutongMvpAct<co20, mo20> {

    /* JADX INFO: renamed from: e */
    public int f5901e = 0;

    /* JADX INFO: renamed from: f */
    public String f5902f = "user_click";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m8798Z1(Act act, String str) {
        return m8799a2(act, str, 0);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m8799a2(Act act, String str, int i) {
        Intent intent = new Intent((Context) act, (Class<?>) NewFilterAct.class);
        intent.putExtra("filterPageFrom", str);
        intent.putExtra("scrollWhenShow", i);
        return intent;
    }

    /* JADX INFO: renamed from: e2 */
    private void m8800e2() {
        ((mo20) this.f1162d).m19458J(this.f5901e);
    }

    /* JADX INFO: renamed from: h2 */
    private void m8801h2() {
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            ((mo20) this.f1162d).m19463O();
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public co20 mo571V1() {
        return new co20(this, this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public mo20 mo572X1() {
        return new mo20(this);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m8804d2(c cVar) {
        if (cVar == c.f) {
            ((co20) this.f1161c).m13602V0();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(tzb0.b, tzb0.i);
    }

    /* JADX INFO: renamed from: g2 */
    public void m8805g2(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f5902f = str;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = ((mo20) this.f1162d).inflateView(layoutInflater, viewGroup);
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ym20
            public final void call(Object obj) {
                this.f28296a.m8804d2((c) obj);
            }
        }));
        return viewInflateView;
    }

    public void onBackPressed() {
        finish();
        ((co20) this.f1161c).m13604k1();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onDestroyLifecycle() {
        zq20.m28787a();
        super.onDestroyLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_advanced_filter_page";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        getWindow().getDecorView().setSystemUiVisibility(8192);
        setStatusBarColor(getResources().getColor(c1c0.e));
        Intent intent = act().getIntent();
        if (intent != null) {
            m8805g2(intent.getStringExtra("filterPageFrom"));
            this.f5901e = intent.getIntExtra("scrollWhenShow", 0);
            m8800e2();
            m8801h2();
            ((co20) this.f1161c).m13606m1(zq20.m28788b());
        }
        ((co20) this.f1161c).m13607n1(this.f5902f);
        this.pageHelper.q(pageId());
        this.pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(CoreModule.f1534c.f3628e0.m21490p9().isVIP())), vwb.Y("filter_page_show_from", this.f5902f), vwb.Y("filter_page", "p_suggest_users_home_view")});
    }
}
