package com.p046p1.mobile.putong.live.livingroom.other.liveend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import p149l.c8s;
import p149l.eet;
import p149l.z7s;

/* JADX INFO: loaded from: classes4.dex */
public class LiveEndAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public z7s f51206c;

    /* JADX INFO: renamed from: d */
    public c8s f51207d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m75478V1(Context context, BLive bLive, User user, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) LiveEndAct.class);
        intent.putExtra("live_extra", bLive);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", user);
        intent.putExtra("live_anchor_source", str2);
        intent.putExtra("live_trace_id", str3);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    private void m75479X1(BLive bLive, String str, String str2) {
        eet.m116002a("anchor_live_summary", true, str2, str, bLive, null);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f51207d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f51206c = new z7s(this);
        c8s c8sVar = new c8s();
        this.f51207d = c8sVar;
        this.f51206c.mo51532C(c8sVar);
        this.f51206c.m217503n0((User) getIntent().getSerializableExtra("live_anchor"), (BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
        m75479X1((BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_anchor_source"), getIntent().getStringExtra("live_trace_id"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = this.f51206c.m217502j0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f51206c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
