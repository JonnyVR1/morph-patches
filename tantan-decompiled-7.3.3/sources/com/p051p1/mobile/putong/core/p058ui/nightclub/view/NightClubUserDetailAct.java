package com.p051p1.mobile.putong.core.p058ui.nightclub.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.fs40;
import p153l.x7c0;
import p153l.yr40;

/* JADX INFO: loaded from: classes4.dex */
public class NightClubUserDetailAct extends PutongMvpAct<yr40, fs40> {

    /* JADX INFO: renamed from: e */
    public String f33432e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m51299Z1(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, NightClubUserDetailAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public yr40 mo29671X1() {
        return new yr40(this, this.f33432e);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public fs40 mo29672Y1() {
        return new fs40(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        overridePendingTransition(x7c0.f192700o, x7c0.f192709x);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((fs40) this.f17892d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        String stringExtra = getIntent().getStringExtra("USER_ID");
        this.f33432e = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            m68056e2();
        }
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_mkt_twclub_profile";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
    }
}
