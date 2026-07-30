package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.vwb;
import p149l.wc2;
import p149l.yc2;
import p149l.zvf0;

/* JADX INFO: loaded from: classes8.dex */
public class BanDetailAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public yc2 f28211c;

    /* JADX INFO: renamed from: d */
    public wc2 f28212d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m44111V1(Context context) {
        return new Intent(context, (Class<?>) BanDetailAct.class);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28211c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28212d = new wc2(this);
        yc2 yc2Var = new yc2(this);
        this.f28211c = yc2Var;
        this.f28212d.mo51532C(yc2Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28212d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        zvf0.m220399u("e_ban_detail", pageId(), vwb.m200311Y("ban_detail_button", "back"));
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_ban_detail";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
