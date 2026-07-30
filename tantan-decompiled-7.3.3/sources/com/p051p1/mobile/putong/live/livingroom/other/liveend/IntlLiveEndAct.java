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
import p153l.fgt;
import p153l.kwn;
import p153l.mwn;

/* JADX INFO: loaded from: classes5.dex */
public class IntlLiveEndAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public kwn f52052c;

    /* JADX INFO: renamed from: d */
    public mwn f52053d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m76659X1(Context context, BLive bLive, User user, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) IntlLiveEndAct.class);
        intent.putExtra("live_extra", bLive);
        intent.putExtra("live_force_stop_content", str);
        intent.putExtra("live_anchor", user);
        intent.putExtra("live_anchor_source", str2);
        intent.putExtra("live_trace_id", str3);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m76660Y1(BLive bLive, String str, String str2) {
        fgt.m125529a("anchor_live_summary", true, str2, str, bLive, null);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f52053d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f52052c = new kwn(this);
        mwn mwnVar = new mwn();
        this.f52053d = mwnVar;
        this.f52052c.mo52715C(mwnVar);
        this.f52052c.m151734s0((User) getIntent().getSerializableExtra("live_anchor"), (BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_force_stop_content"));
        super.initDataOnCreate();
        m76660Y1((BLive) getIntent().getSerializableExtra("live_extra"), getIntent().getStringExtra("live_anchor_source"), getIntent().getStringExtra("live_trace_id"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = this.f52052c.m151727l0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f52052c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }
}
