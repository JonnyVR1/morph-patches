package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.VipBaseFrag;
import com.p046p1.mobile.putong.data.Settings;
import p149l.cjl0;
import p149l.j760;
import p149l.ljl0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class VipLocationHistoryAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static final String f37062e = VipBaseFrag.f37502B;

    /* JADX INFO: renamed from: c */
    public cjl0 f37063c;

    /* JADX INFO: renamed from: d */
    public ljl0 f37064d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m56276V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VipLocationHistoryAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37064d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f37063c = new cjl0(this);
        ljl0 ljl0Var = new ljl0(this);
        this.f37064d = ljl0Var;
        this.f37063c.mo51532C(ljl0Var);
        this.f37063c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37063c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            this.f37063c.m107213F0(intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
        this.pageHelper.m109040p(j760.m140076a("is_privileged", Boolean.valueOf(!xma.m210087m4())), j760.m140076a("passport_entrance", "p_intl_tribe_view".equals(this.f37063c.m107214G0()) ? "tribe" : Settings.TYPE));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_select_location_view";
    }
}
