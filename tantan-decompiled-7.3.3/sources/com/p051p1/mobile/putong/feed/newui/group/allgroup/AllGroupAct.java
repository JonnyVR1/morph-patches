package com.p051p1.mobile.putong.feed.newui.group.allgroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import org.json.JSONObject;
import p153l.tfj0;
import p153l.yi0;
import p153l.zi0;

/* JADX INFO: loaded from: classes13.dex */
public class AllGroupAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public yi0 f40822c;

    /* JADX INFO: renamed from: d */
    public zi0 f40823d;

    /* JADX INFO: renamed from: e */
    public JSONObject f40824e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m63086X1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) AllGroupAct.class);
        intent.putExtra("has_my_group", z);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f40823d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f40823d = new zi0(this);
        yi0 yi0Var = new yi0(this);
        this.f40822c = yi0Var;
        yi0Var.mo52715C(this.f40823d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f40822c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_circle_list";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f40822c.m216000f0();
        JSONObject jSONObjectM190938a = tfj0.m190938a(tfj0.C20302a.m190949g("circle_tab", this.f40822c.f200003a ? "joined" : SuperlikeReason.popular));
        this.f40824e = jSONObjectM190938a;
        this.pageHelper.m152780o(jSONObjectM190938a);
    }
}
