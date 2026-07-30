package com.p000p1.mobile.putong.feed.newui.group.allgroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.SuperlikeReason;
import com.p1.mobile.putong.app.PutongAct;
import org.json.JSONObject;
import p007l.cj0;
import p007l.dj0;
import p007l.p6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AllGroupAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public cj0 f1435c;

    /* JADX INFO: renamed from: d */
    public dj0 f1436d;

    /* JADX INFO: renamed from: e */
    public JSONObject f1437e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m2873V1(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) AllGroupAct.class);
        intent.putExtra("has_my_group", z);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1436d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f1436d = new dj0(this);
        cj0 cj0Var = new cj0(this);
        this.f1435c = cj0Var;
        cj0Var.C(this.f1436d);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1435c.m9184a0();
    }

    public String pageId() {
        return "p_circle_list";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f1435c.m9185f0();
        JSONObject jSONObjectM12911a = p6j0.m12911a(p6j0.C2456a.m12922g("circle_tab", this.f1435c.f6657a ? "joined" : SuperlikeReason.popular));
        this.f1437e = jSONObjectM12911a;
        ((PutongAct) this).pageHelper.o(jSONObjectM12911a);
    }
}
