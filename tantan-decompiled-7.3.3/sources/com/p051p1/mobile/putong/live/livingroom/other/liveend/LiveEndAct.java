package com.p051p1.mobile.putong.live.livingroom.other.liveend;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import p153l.aas;
import p153l.das;
import p153l.fgt;

/* JADX INFO: loaded from: classes5.dex */
public class LiveEndAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public aas f52054c;

    /* JADX INFO: renamed from: d */
    public das f52055d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m76661X1(Context context, BLive bLive, User user, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) LiveEndAct.class);
        intent.putExtra("live_extra", bLive);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", user);
        intent.putExtra("live_anchor_source", str2);
        intent.putExtra("live_trace_id", str3);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    private void m76662Y1(BLive bLive, String str, String str2) {
        fgt.m125529a("anchor_live_summary", true, str2, str, bLive, null);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f52055d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f52054c = new aas(this);
        das dasVar = new das();
        this.f52055d = dasVar;
        this.f52054c.mo52715C(dasVar);
        this.f52054c.m96664n0((User) getIntent().getSerializableExtra("live_anchor"), (BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
        m76662Y1((BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_anchor_source"), getIntent().getStringExtra("live_trace_id"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = this.f52054c.m96663j0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f52054c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
