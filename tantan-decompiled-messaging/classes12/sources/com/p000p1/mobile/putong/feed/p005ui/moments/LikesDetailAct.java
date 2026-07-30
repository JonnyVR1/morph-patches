package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import java.util.List;
import p007l.wlr;
import p007l.xlr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikesDetailAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f5118e = "momentId";

    /* JADX INFO: renamed from: f */
    public static String f5119f = "momentOwner";

    /* JADX INFO: renamed from: c */
    public wlr f5120c;

    /* JADX INFO: renamed from: d */
    public xlr f5121d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m7831V1(Act act, String str, String str2) {
        Intent intent = new Intent((Context) act, (Class<?>) LikesDetailAct.class);
        intent.putExtra(f5118e, str);
        intent.putExtra(f5119f, str2);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5121d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5120c = new wlr(this);
        xlr xlrVar = new xlr(this);
        this.f5121d = xlrVar;
        this.f5120c.C(xlrVar);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f5120c.m15838h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f5120c.m15841l0(getIntent().getStringExtra(f5118e), getIntent().getStringExtra(f5119f));
    }

    public List<Object> trackedArgs() {
        return this.f5120c.m15842m0();
    }
}
