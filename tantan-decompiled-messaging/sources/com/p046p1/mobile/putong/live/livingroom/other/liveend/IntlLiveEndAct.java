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
import p149l.eet;
import p149l.kun;
import p149l.mun;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveEndAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public kun f51204c;

    /* JADX INFO: renamed from: d */
    public mun f51205d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m75476V1(Context context, BLive bLive, User user, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) IntlLiveEndAct.class);
        intent.putExtra("live_extra", bLive);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", user);
        intent.putExtra("live_anchor_source", str2);
        intent.putExtra("live_trace_id", str3);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m75477X1(BLive bLive, String str, String str2) {
        eet.m116002a("anchor_live_summary", true, str2, str, bLive, null);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f51205d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f51204c = new kun(this);
        mun munVar = new mun();
        this.f51205d = munVar;
        this.f51204c.mo51532C(munVar);
        this.f51204c.m147287s0((User) getIntent().getSerializableExtra("live_anchor"), (BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
        m75477X1((BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_anchor_source"), getIntent().getStringExtra("live_trace_id"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = this.f51204c.m147280l0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f51204c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
