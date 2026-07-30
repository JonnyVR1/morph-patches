package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.anh0;
import p153l.tmh0;

/* JADX INFO: loaded from: classes9.dex */
public class SwitchAccountAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f29105e = "switch_account";

    /* JADX INFO: renamed from: c */
    public anh0 f29106c;

    /* JADX INFO: renamed from: d */
    public tmh0 f29107d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m45379X1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SwitchAccountAct.class);
        intent.putExtra(f29105e, str);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29106c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29107d = new tmh0(this);
        anh0 anh0Var = new anh0(this);
        this.f29106c = anh0Var;
        this.f29107d.mo52715C(anh0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29107d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (CoreModule.m30929H().signedIn_()) {
            super.onBackPressed();
        } else {
            moveTaskToBack(true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_switch_account_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f29107d.m191765y0(getIntent().getStringExtra(f29105e));
    }
}
