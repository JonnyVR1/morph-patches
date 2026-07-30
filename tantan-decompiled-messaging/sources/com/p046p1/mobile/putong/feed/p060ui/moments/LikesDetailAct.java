package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import java.util.List;
import p149l.wlr;
import p149l.xlr;

/* JADX INFO: loaded from: classes12.dex */
public class LikesDetailAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f43657e = "momentId";

    /* JADX INFO: renamed from: f */
    public static String f43658f = "momentOwner";

    /* JADX INFO: renamed from: c */
    public wlr f43659c;

    /* JADX INFO: renamed from: d */
    public xlr f43660d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m66640V1(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) LikesDetailAct.class);
        intent.putExtra(f43657e, str);
        intent.putExtra(f43658f, str2);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43660d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f43659c = new wlr(this);
        xlr xlrVar = new xlr(this);
        this.f43660d = xlrVar;
        this.f43659c.mo51532C(xlrVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43659c.m203883h0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f43659c.m203886l0(getIntent().getStringExtra(f43657e), getIntent().getStringExtra(f43658f));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f43659c.m203887m0();
    }
}
