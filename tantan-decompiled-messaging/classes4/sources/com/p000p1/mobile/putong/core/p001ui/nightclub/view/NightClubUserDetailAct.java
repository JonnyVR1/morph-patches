package com.p000p1.mobile.putong.core.p001ui.nightclub.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.rzb0;
import p002l.kj40;
import p002l.rj40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NightClubUserDetailAct extends PutongMvpAct<kj40, rj40> {

    /* JADX INFO: renamed from: e */
    public String f406e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m545Y1(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, NightClubUserDetailAct.class);
        intent.putExtra("USER_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public kj40 m546V1() {
        return new kj40(this, this.f406e);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rj40 m547X1() {
        return new rj40(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(rzb0.o, rzb0.x);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rj40) ((PutongMvpAct) this).d).inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        String stringExtra = getIntent().getStringExtra("USER_ID");
        this.f406e = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        }
        super.initDataOnCreate();
    }

    public boolean needBindBillingService() {
        return true;
    }

    public String pageId() {
        return "p_intl_mkt_twclub_profile";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setTransparentStatusBar();
    }
}
