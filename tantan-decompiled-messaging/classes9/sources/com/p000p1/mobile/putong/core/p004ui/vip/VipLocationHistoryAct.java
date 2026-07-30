package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.VipBaseFrag;
import l.j760;
import p006l.cjl0;
import p006l.ljl0;
import p006l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipLocationHistoryAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static final String f6843e = VipBaseFrag.f7283B;

    /* JADX INFO: renamed from: c */
    public cjl0 f6844c;

    /* JADX INFO: renamed from: d */
    public ljl0 f6845d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m9710V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VipLocationHistoryAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6845d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f6844c = new cjl0(this);
        ljl0 ljl0Var = new ljl0(this);
        this.f6845d = ljl0Var;
        this.f6844c.C(ljl0Var);
        this.f6844c.m13514Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f6844c.m13515a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            this.f6844c.m13508F0(intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onStartLifecycle() {
        super.onStartLifecycle();
        this.pageHelper.p(new j760[]{j760.a("is_privileged", Boolean.valueOf(!xma.m27395m4())), j760.a("passport_entrance", "p_intl_tribe_view".equals(this.f6844c.m13509G0()) ? "tribe" : "settings")});
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_select_location_view";
    }
}
