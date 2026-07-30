package com.p046p1.mobile.putong.feed.newui.group.allgroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import org.json.JSONObject;
import p149l.cj0;
import p149l.dj0;
import p149l.p6j0;

/* JADX INFO: loaded from: classes12.dex */
public class AllGroupAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public cj0 f39974c;

    /* JADX INFO: renamed from: d */
    public dj0 f39975d;

    /* JADX INFO: renamed from: e */
    public JSONObject f39976e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m61903V1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) AllGroupAct.class);
        intent.putExtra("has_my_group", z);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f39975d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f39975d = new dj0(this);
        cj0 cj0Var = new cj0(this);
        this.f39974c = cj0Var;
        cj0Var.mo51532C(this.f39975d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f39974c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_circle_list";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f39974c.m107104f0();
        JSONObject jSONObjectM167667a = p6j0.m167667a(p6j0.C19147a.m167678g("circle_tab", this.f39974c.f81127a ? "joined" : SuperlikeReason.popular));
        this.f39976e = jSONObjectM167667a;
        this.pageHelper.m109039o(jSONObjectM167667a);
    }
}
