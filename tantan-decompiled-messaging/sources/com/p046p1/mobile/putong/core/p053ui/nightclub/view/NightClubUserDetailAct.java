package com.p046p1.mobile.putong.core.p053ui.nightclub.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.kj40;
import p149l.rj40;
import p149l.rzb0;

/* JADX INFO: loaded from: classes4.dex */
public class NightClubUserDetailAct extends PutongMvpAct<kj40, rj40> {

    /* JADX INFO: renamed from: e */
    public String f32584e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m50116Y1(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, NightClubUserDetailAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public kj40 mo28672V1() {
        return new kj40(this, this.f32584e);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rj40 mo28673X1() {
        return new rj40(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        overridePendingTransition(rzb0.f161643o, rzb0.f161652x);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rj40) this.f17173d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        String stringExtra = getIntent().getStringExtra("USER_ID");
        this.f32584e = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            m66873d2();
        }
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_mkt_twclub_profile";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
    }
}
