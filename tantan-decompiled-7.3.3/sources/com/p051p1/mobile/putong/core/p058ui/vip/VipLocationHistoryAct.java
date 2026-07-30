package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.VipBaseFrag;
import com.p051p1.mobile.putong.data.Settings;
import p153l.gsl0;
import p153l.joa;
import p153l.pf60;
import p153l.psl0;

/* JADX INFO: loaded from: classes12.dex */
public class VipLocationHistoryAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static final String f37910e = VipBaseFrag.f38350B;

    /* JADX INFO: renamed from: c */
    public gsl0 f37911c;

    /* JADX INFO: renamed from: d */
    public psl0 f37912d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m57459X1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) VipLocationHistoryAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37912d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f37911c = new gsl0(this);
        psl0 psl0Var = new psl0(this);
        this.f37912d = psl0Var;
        this.f37911c.mo52715C(psl0Var);
        this.f37911c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37911c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            this.f37911c.m132104F0(intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
        this.pageHelper.m152781p(pf60.m172085a("is_privileged", Boolean.valueOf(!joa.m146401n4())), pf60.m172085a("passport_entrance", "p_intl_tribe_view".equals(this.f37911c.m132105G0()) ? "tribe" : Settings.TYPE));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_select_location_view";
    }
}
