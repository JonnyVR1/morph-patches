package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.dd2;
import p153l.fd2;
import p153l.i4g0;
import p153l.jyb;

/* JADX INFO: loaded from: classes9.dex */
public class BanDetailAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public fd2 f29059c;

    /* JADX INFO: renamed from: d */
    public dd2 f29060d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m45294X1(Context context) {
        return new Intent(context, (Class<?>) BanDetailAct.class);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29059c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29060d = new dd2(this);
        fd2 fd2Var = new fd2(this);
        this.f29059c = fd2Var;
        this.f29060d.mo52715C(fd2Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29060d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        i4g0.m138523u("e_ban_detail", pageId(), jyb.m147494Y("ban_detail_button", "back"));
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_ban_detail";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
